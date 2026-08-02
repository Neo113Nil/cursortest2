package com.unity3d.ads.gatewayclient;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.random.Random;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.arm0;
import xsna.emb;
import xsna.eoo;
import xsna.epx;
import xsna.j5g;
import xsna.jr;
import xsna.jvo0;
import xsna.k830;
import xsna.oxo0;
import xsna.pn00;
import xsna.qsl;
import xsna.spj;
import xsna.uto0;
import xsna.zcl;
import xsna.zno;

/* compiled from: CommonGatewayClient.kt */
/* loaded from: classes14.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClientProvider httpClientProvider;
    private final Logger logger;
    private final RequestUrlFactory requestUrlFactory;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGatewayClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: CommonGatewayClient.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OperationType.values().length];
            try {
                iArr[OperationType.INITIALIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OperationType.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OperationType.LOAD_HEADER_BIDDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonGatewayClient(HttpClientProvider httpClientProvider, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, RequestUrlFactory requestUrlFactory, Logger logger) {
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
        this.logger = logger;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j, RequestPolicy requestPolicy, int i) {
        return Math.min(calculateExponentialBackoff(j, requestPolicy, i) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j, RequestPolicy requestPolicy, int i) {
        if (i == 0) {
            return j;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * j);
    }

    private final long calculateJitter(int i, float f) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        long j = (long) (i * f);
        Random.b.getClass();
        return Random.c.o(-j, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.unity3d.ads.gatewayclient.CommonGatewayClient] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.unity3d.services.core.network.model.HttpRequest, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [long] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.unity3d.ads.core.data.model.OperationType, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.unity3d.ads.core.data.model.OperationType] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, spj<? super HttpResponse> spjVar) {
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$1;
        CoroutineSingletons coroutineSingletons;
        ?? r1;
        int i2;
        OperationType operationType2;
        long j;
        int i3;
        long j2;
        OperationType operationType3;
        OperationType operationType4;
        long j3;
        int i4;
        long j4;
        OperationType operationType5;
        OperationType operationType6;
        Object obj;
        long j5;
        HttpRequest httpRequest2;
        Object execute$default;
        try {
            try {
                if (spjVar instanceof CommonGatewayClient$executeRequest$1) {
                    commonGatewayClient$executeRequest$1 = (CommonGatewayClient$executeRequest$1) spjVar;
                    int i5 = commonGatewayClient$executeRequest$1.label;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        commonGatewayClient$executeRequest$1.label = i5 - Integer.MIN_VALUE;
                        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$12 = commonGatewayClient$executeRequest$1;
                        Object obj2 = commonGatewayClient$executeRequest$12.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        r1 = commonGatewayClient$executeRequest$12.label;
                        if (r1 != 0) {
                            a.a(obj2);
                            long b = k830.b();
                            try {
                                HttpClientProvider httpClientProvider = this.httpClientProvider;
                                commonGatewayClient$executeRequest$12.L$0 = httpRequest;
                                commonGatewayClient$executeRequest$12.L$1 = operationType;
                                commonGatewayClient$executeRequest$12.I$0 = i;
                                commonGatewayClient$executeRequest$12.J$0 = b;
                                commonGatewayClient$executeRequest$12.label = 1;
                                Object invoke = httpClientProvider.invoke(commonGatewayClient$executeRequest$12);
                                if (invoke != coroutineSingletons) {
                                    operationType6 = operationType;
                                    obj = invoke;
                                    i2 = i;
                                    j5 = b;
                                    httpRequest2 = httpRequest;
                                }
                                return coroutineSingletons;
                            } catch (UnityAdsNetworkException e) {
                                e = e;
                                i2 = i;
                                j3 = b;
                                operationType4 = operationType;
                                sendNetworkErrorDiagnosticEvent(e, i2, operationType4, new jvo0.a(j3));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (TimeoutCancellationException e2) {
                                e = e2;
                                i2 = i;
                                j = b;
                                operationType2 = operationType;
                                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i2, operationType2, new jvo0.a(j));
                                throw e;
                            }
                        }
                        if (r1 != 1) {
                            if (r1 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            long j6 = commonGatewayClient$executeRequest$12.J$0;
                            int i6 = commonGatewayClient$executeRequest$12.I$0;
                            OperationType operationType7 = (OperationType) commonGatewayClient$executeRequest$12.L$0;
                            a.a(obj2);
                            r1 = operationType7;
                            httpRequest = j6;
                            operationType = i6;
                            HttpResponse httpResponse = (HttpResponse) obj2;
                            try {
                                sendNetworkSuccessDiagnosticEvent(httpResponse, operationType, r1, new jvo0.a(httpRequest));
                                return httpResponse;
                            } catch (UnityAdsNetworkException e3) {
                                e = e3;
                                operationType5 = r1;
                                j4 = httpRequest;
                                i4 = operationType;
                                i2 = i4;
                                operationType4 = operationType5;
                                j3 = j4;
                                sendNetworkErrorDiagnosticEvent(e, i2, operationType4, new jvo0.a(j3));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (TimeoutCancellationException e4) {
                                e = e4;
                                operationType3 = r1;
                                j2 = httpRequest;
                                i3 = operationType;
                                i2 = i3;
                                operationType2 = operationType3;
                                j = j2;
                                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i2, operationType2, new jvo0.a(j));
                                throw e;
                            }
                        }
                        long j7 = commonGatewayClient$executeRequest$12.J$0;
                        int i7 = commonGatewayClient$executeRequest$12.I$0;
                        OperationType operationType8 = (OperationType) commonGatewayClient$executeRequest$12.L$1;
                        HttpRequest httpRequest3 = (HttpRequest) commonGatewayClient$executeRequest$12.L$0;
                        a.a(obj2);
                        operationType6 = operationType8;
                        obj = obj2;
                        i2 = i7;
                        j5 = j7;
                        httpRequest2 = httpRequest3;
                        commonGatewayClient$executeRequest$12.L$0 = operationType6;
                        commonGatewayClient$executeRequest$12.L$1 = null;
                        commonGatewayClient$executeRequest$12.I$0 = i2;
                        commonGatewayClient$executeRequest$12.J$0 = j5;
                        commonGatewayClient$executeRequest$12.label = 2;
                        execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                        if (execute$default != coroutineSingletons) {
                            int i8 = i2;
                            obj2 = execute$default;
                            httpRequest = j5;
                            operationType = i8;
                            r1 = operationType6;
                            HttpResponse httpResponse2 = (HttpResponse) obj2;
                            sendNetworkSuccessDiagnosticEvent(httpResponse2, operationType, r1, new jvo0.a(httpRequest));
                            return httpResponse2;
                        }
                        return coroutineSingletons;
                    }
                }
                commonGatewayClient$executeRequest$12.L$0 = operationType6;
                commonGatewayClient$executeRequest$12.L$1 = null;
                commonGatewayClient$executeRequest$12.I$0 = i2;
                commonGatewayClient$executeRequest$12.J$0 = j5;
                commonGatewayClient$executeRequest$12.label = 2;
                execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                if (execute$default != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (UnityAdsNetworkException e5) {
                e = e5;
                j3 = j5;
                operationType4 = operationType6;
                sendNetworkErrorDiagnosticEvent(e, i2, operationType4, new jvo0.a(j3));
                return HttpResponseKt.toHttpResponse(e);
            } catch (TimeoutCancellationException e6) {
                e = e6;
                j = j5;
                operationType2 = operationType6;
                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i2, operationType2, new jvo0.a(j));
                throw e;
            }
            if (r1 != 0) {
            }
        } catch (UnityAdsNetworkException e7) {
            e = e7;
            operationType5 = r1;
            j4 = httpRequest;
            i4 = operationType;
        } catch (TimeoutCancellationException e8) {
            e = e8;
            operationType3 = r1;
            j2 = httpRequest;
            i3 = operationType;
        }
        commonGatewayClient$executeRequest$1 = new CommonGatewayClient$executeRequest$1(this, spjVar);
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$122 = commonGatewayClient$executeRequest$1;
        Object obj22 = commonGatewayClient$executeRequest$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        r1 = commonGatewayClient$executeRequest$122.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015e, code lost:
    
        if (xsna.qsl.b(r8, r2) == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x015e -> B:12:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeWithRetry(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, spj<? super UniversalResponseOuterClass.UniversalResponse> spjVar) {
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$1;
        int i;
        long retryWaitBase;
        int i2;
        long j;
        OperationType operationType2;
        String str2;
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$12;
        UniversalRequestOuterClass.UniversalRequest universalRequest2;
        RequestPolicy requestPolicy2;
        UniversalRequestOuterClass.UniversalRequest universalRequest3;
        RequestPolicy requestPolicy3;
        OperationType operationType3;
        String str3;
        long j2;
        long j3;
        int i3;
        HttpResponse httpResponse;
        int i4;
        List<String> list;
        String str4;
        Long n;
        Object executeRequest;
        if (spjVar instanceof CommonGatewayClient$executeWithRetry$1) {
            commonGatewayClient$executeWithRetry$1 = (CommonGatewayClient$executeWithRetry$1) spjVar;
            int i5 = commonGatewayClient$executeWithRetry$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$executeWithRetry$1.label = i5 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$executeWithRetry$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonGatewayClient$executeWithRetry$1.label;
                int i6 = 2;
                int i7 = 1;
                if (i != 0) {
                    a.a(obj);
                    String gatewayUrl = getGatewayUrl(str);
                    long b = k830.b();
                    retryWaitBase = requestPolicy.getRetryWaitBase();
                    i2 = 0;
                    j = b;
                    operationType2 = operationType;
                    str2 = gatewayUrl;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    universalRequest2 = universalRequest;
                    requestPolicy2 = requestPolicy;
                    HttpRequest buildHttpRequest = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$3 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i7;
                    executeRequest = executeRequest(buildHttpRequest, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest != obj2) {
                    }
                    return obj2;
                }
                if (i == 1) {
                    j3 = commonGatewayClient$executeWithRetry$1.J$1;
                    j2 = commonGatewayClient$executeWithRetry$1.J$0;
                    i3 = commonGatewayClient$executeWithRetry$1.I$0;
                    str3 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                    operationType3 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                    requestPolicy3 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                    universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                    a.a(obj);
                    httpResponse = (HttpResponse) obj;
                    i4 = i7;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                    }
                    return obj2;
                }
                if (i == 2) {
                    UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) commonGatewayClient$executeWithRetry$1.L$0;
                    a.a(obj);
                    return universalResponse;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long longValue = commonGatewayClient$executeWithRetry$1.J$1;
                j2 = commonGatewayClient$executeWithRetry$1.J$0;
                i3 = commonGatewayClient$executeWithRetry$1.I$0;
                str3 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                operationType3 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                requestPolicy3 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                a.a(obj);
                char c = 3;
                i4 = 1;
                long j4 = longValue;
                str2 = str3;
                commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                j = j2;
                requestPolicy2 = requestPolicy3;
                i2 = i3 + 1;
                i7 = i4;
                operationType2 = operationType3;
                retryWaitBase = j4;
                i6 = 2;
                universalRequest2 = universalRequest3;
                HttpRequest buildHttpRequest2 = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                commonGatewayClient$executeWithRetry$12.L$3 = str2;
                commonGatewayClient$executeWithRetry$12.I$0 = i2;
                commonGatewayClient$executeWithRetry$12.J$0 = j;
                commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                commonGatewayClient$executeWithRetry$12.label = i7;
                executeRequest = executeRequest(buildHttpRequest2, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                if (executeRequest != obj2) {
                    universalRequest3 = universalRequest2;
                    obj = executeRequest;
                    long j5 = retryWaitBase;
                    requestPolicy3 = requestPolicy2;
                    operationType3 = operationType2;
                    commonGatewayClient$executeWithRetry$1 = commonGatewayClient$executeWithRetry$12;
                    i3 = i2;
                    j2 = j;
                    str3 = str2;
                    j3 = j5;
                    httpResponse = (HttpResponse) obj;
                    i4 = i7;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                        UniversalResponseOuterClass.UniversalResponse universalResponse2 = getUniversalResponse(httpResponse, operationType3);
                        HandleGatewayUniversalResponse handleGatewayUniversalResponse = this.handleGatewayUniversalResponse;
                        commonGatewayClient$executeWithRetry$1.L$0 = universalResponse2;
                        commonGatewayClient$executeWithRetry$1.L$1 = null;
                        commonGatewayClient$executeWithRetry$1.L$2 = null;
                        commonGatewayClient$executeWithRetry$1.L$3 = null;
                        commonGatewayClient$executeWithRetry$1.label = i6;
                        if (handleGatewayUniversalResponse.invoke(universalResponse2, commonGatewayClient$executeWithRetry$1) != obj2) {
                            return universalResponse2;
                        }
                    } else {
                        Long l = (httpResponse.getStatusCode() != 429 || (list = httpResponse.getHeaders().get(HEADER_RETRY_AFTER)) == null || (str4 = (String) j5g.a0(list)) == null || (n = arm0.n(str4)) == null) ? null : new Long(n.longValue() * 1000);
                        longValue = l != null ? l.longValue() : calculateDelayTime(j3, requestPolicy3, i3);
                        long elapsedMillis = (long) TimeExtensionsKt.elapsedMillis(new jvo0.a(j2));
                        if (!shouldRetry(httpResponse.getStatusCode(), elapsedMillis + longValue, requestPolicy3.getMaxDuration())) {
                            StringBuilder b2 = jr.b(i3, "Gateway request failed after ", " retries  currentDuration: ", elapsedMillis);
                            b2.append("ms maxDuration: ");
                            b2.append(requestPolicy3.getMaxDuration());
                            b2.append(UcumUtils.UCUM_MILLISECODS);
                            throw new NetworkTimeoutException(b2.toString(), null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                        }
                        commonGatewayClient$executeWithRetry$1.L$0 = universalRequest3;
                        commonGatewayClient$executeWithRetry$1.L$1 = requestPolicy3;
                        commonGatewayClient$executeWithRetry$1.L$2 = operationType3;
                        commonGatewayClient$executeWithRetry$1.L$3 = str3;
                        commonGatewayClient$executeWithRetry$1.I$0 = i3;
                        commonGatewayClient$executeWithRetry$1.J$0 = j2;
                        commonGatewayClient$executeWithRetry$1.J$1 = longValue;
                        c = 3;
                        commonGatewayClient$executeWithRetry$1.label = 3;
                    }
                }
                return obj2;
            }
        }
        commonGatewayClient$executeWithRetry$1 = new CommonGatewayClient$executeWithRetry$1(this, spjVar);
        Object obj3 = commonGatewayClient$executeWithRetry$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonGatewayClient$executeWithRetry$1.label;
        int i62 = 2;
        int i72 = 1;
        if (i != 0) {
        }
    }

    private final String getGatewayUrl(String str) {
        return !epx.f(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int i) {
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("Content-Type", Collections.singletonList(HEADER_PROTOBUF));
        if (i > 0) {
            mapBuilder.put(HEADER_RETRY_ATTEMPT, Collections.singletonList(String.valueOf(i)));
        }
        return mapBuilder.h();
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                return UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
            }
            if (body instanceof String) {
                return UniversalResponseOuterClass.UniversalResponse.parseFrom(((String) body).getBytes(emb.b));
            }
            throw new InvalidProtocolBufferException("Could not parse response from gateway service");
        } catch (InvalidProtocolBufferException e) {
            this.logger.debug("Failed to parse response from gateway service with exception: " + e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", (Double) null, pn00.k(new Pair("operation", operationType.toString()), new Pair("reason", "protobuf_parsing"), new Pair("reason_debug", httpResponse.getBody().toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            UniversalResponseKt.Dsl _create = UniversalResponseKt.Dsl.Companion._create(UniversalResponseOuterClass.UniversalResponse.newBuilder());
            ErrorKt.Dsl _create2 = ErrorKt.Dsl.Companion._create(ErrorOuterClass.Error.newBuilder());
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i, OperationType operationType, uto0 uto0Var) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap m = pn00.m(new Pair("operation", operationType.toString()), new Pair("retries", String.valueOf(i)), new Pair("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), new Pair("network_client", String.valueOf(unityAdsNetworkException.getClient())), new Pair("reason_code", String.valueOf(unityAdsNetworkException.getCode())), new Pair("reason_debug", unityAdsNetworkException.getMessage()));
        int i2 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i2 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i2 == 2 || i2 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i, OperationType operationType, uto0 uto0Var) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap m = pn00.m(new Pair("operation", operationType.toString()), new Pair("retries", String.valueOf(i)), new Pair("protocol", httpResponse.getProtocol()), new Pair("network_client", httpResponse.getClient()), new Pair("reason_code", String.valueOf(httpResponse.getStatusCode())));
        int i2 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i2 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i2 == 2 || i2 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK, Double.valueOf(TimeExtensionsKt.elapsedMillis(uto0Var)), m, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final boolean shouldRetry(int i, long j, int i2) {
        return 400 <= i && i < 600 && j < ((long) i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, spj<? super UniversalResponseOuterClass.UniversalResponse> spjVar) {
        CommonGatewayClient$request$1 commonGatewayClient$request$1;
        int i;
        RequestPolicy requestPolicy2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (spjVar instanceof CommonGatewayClient$request$1) {
            commonGatewayClient$request$1 = (CommonGatewayClient$request$1) spjVar;
            int i2 = commonGatewayClient$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonGatewayClient$request$1.label;
                if (i != 0) {
                    a.a(obj);
                    zno.a aVar = zno.c;
                    long e = eoo.e(requestPolicy.getMaxDuration(), DurationUnit.MILLISECONDS);
                    CommonGatewayClient$request$2 commonGatewayClient$request$2 = new CommonGatewayClient$request$2(this, operationType, str, universalRequest, requestPolicy, null);
                    commonGatewayClient$request$1.L$0 = requestPolicy;
                    commonGatewayClient$request$1.label = 1;
                    obj = oxo0.c(qsl.e(e), commonGatewayClient$request$2, commonGatewayClient$request$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    requestPolicy2 = requestPolicy;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestPolicy2 = (RequestPolicy) commonGatewayClient$request$1.L$0;
                    a.a(obj);
                }
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse == null) {
                    return universalResponse;
                }
                throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + UcumUtils.UCUM_MILLISECODS, null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
            }
        }
        commonGatewayClient$request$1 = new CommonGatewayClient$request$1(this, spjVar);
        Object obj2 = commonGatewayClient$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonGatewayClient$request$1.label;
        if (i != 0) {
        }
        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj2;
        if (universalResponse == null) {
        }
    }
}
