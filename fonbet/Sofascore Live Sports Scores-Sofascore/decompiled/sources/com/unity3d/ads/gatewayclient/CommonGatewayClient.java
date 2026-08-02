package com.unity3d.ads.gatewayclient;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
import defpackage.a70;
import defpackage.be5;
import defpackage.glf;
import defpackage.ltb;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.qij;
import defpackage.rq3;
import defpackage.tub;
import defpackage.wba;
import defpackage.wd5;
import defpackage.whj;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 O2\u00020\u0001:\u0001OB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00102\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100$0#2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100$0#2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010+J/\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J/\u00104\u001a\u0002002\u0006\u00103\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b7\u00108J'\u0010;\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010<J\u001f\u0010A\u001a\u0002092\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u001dH\u0002¢\u0006\u0004\bG\u0010HJ0\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010LR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010MR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010N¨\u0006P"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "requestUrlFactory", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;Lcom/unity3d/ads/core/log/Logger;)V", "", "url", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "request", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "requestPolicy", "Lcom/unity3d/ads/core/data/model/OperationType;", "operationType", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "executeWithRetry", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "httpRequest", "", "retryCount", "Lcom/unity3d/services/core/network/model/HttpResponse;", "executeRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lrq3;)Ljava/lang/Object;", "gatewayUrl", "", "", "headers", "buildHttpRequest", "(Ljava/lang/String;Ljava/util/Map;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;)Lcom/unity3d/services/core/network/model/HttpRequest;", "getHeaders", "(I)Ljava/util/Map;", "getGatewayUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "e", "Lkotlin/time/TimeMark;", "startTime", "", "sendNetworkErrorDiagnosticEvent", "(Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/time/TimeMark;)V", "httpResponse", "sendNetworkSuccessDiagnosticEvent", "(Lcom/unity3d/services/core/network/model/HttpResponse;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/time/TimeMark;)V", "response", "getUniversalResponse", "(Lcom/unity3d/services/core/network/model/HttpResponse;Lcom/unity3d/ads/core/data/model/OperationType;)Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "", "currentDelay", "calculateDelayTime", "(JLcom/unity3d/ads/gatewayclient/RequestPolicy;I)J", "calculateExponentialBackoff", "retryWaitBase", "", "retryJitterPct", "calculateJitter", "(IF)J", "responseCode", IronSourceConstants.EVENTS_DURATION, "maxDuration", "", "shouldRetry", "(IJI)Z", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "Lcom/unity3d/ads/core/log/Logger;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;

    @NotNull
    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    @NotNull
    public static final String HEADER_PROTOBUF = "application/x-protobuf";

    @NotNull
    public static final String HEADER_RETRY_AFTER = "Retry-After";

    @NotNull
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";

    @NotNull
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;

    @NotNull
    private final HttpClientProvider httpClientProvider;

    @NotNull
    private final Logger logger;

    @NotNull
    private final RequestUrlFactory requestUrlFactory;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
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

    public CommonGatewayClient(@NotNull HttpClientProvider httpClientProvider, @NotNull HandleGatewayUniversalResponse handleGatewayUniversalResponse, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull SessionRepository sessionRepository, @NotNull RequestUrlFactory requestUrlFactory, @NotNull Logger logger) {
        httpClientProvider.getClass();
        handleGatewayUniversalResponse.getClass();
        sendDiagnosticEvent.getClass();
        sessionRepository.getClass();
        requestUrlFactory.getClass();
        logger.getClass();
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
        this.logger = logger;
    }

    private final HttpRequest buildHttpRequest(String gatewayUrl, Map<String, ? extends List<String>> headers, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest request) {
        return new HttpRequest(gatewayUrl, null, RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        if (retryCount == 0) {
            return currentDelay;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * currentDelay);
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        long j = (long) (retryWaitBase * retryJitterPct);
        glf.a.getClass();
        return glf.b.h(-j, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, rq3<? super HttpResponse> rq3Var) {
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$1;
        Object obj;
        lu3 lu3Var;
        int i2;
        int i3;
        OperationType operationType2;
        long j;
        OperationType operationType3;
        HttpRequest httpRequest2;
        long j2;
        OperationType operationType4;
        try {
            if (rq3Var instanceof CommonGatewayClient$executeRequest$1) {
                commonGatewayClient$executeRequest$1 = (CommonGatewayClient$executeRequest$1) rq3Var;
                int i4 = commonGatewayClient$executeRequest$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    commonGatewayClient$executeRequest$1.label = i4 - Integer.MIN_VALUE;
                    CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$12 = commonGatewayClient$executeRequest$1;
                    obj = commonGatewayClient$executeRequest$12.result;
                    lu3Var = lu3.a;
                    i2 = commonGatewayClient$executeRequest$12.label;
                    if (i2 != 0) {
                        y6a.M(obj);
                        xhj.a.getClass();
                        xuc.a.getClass();
                        long b = xuc.b();
                        try {
                            HttpClientProvider httpClientProvider = this.httpClientProvider;
                            httpRequest2 = httpRequest;
                            commonGatewayClient$executeRequest$12.L$0 = httpRequest2;
                            operationType2 = operationType;
                            try {
                                commonGatewayClient$executeRequest$12.L$1 = operationType2;
                                i3 = i;
                                try {
                                    commonGatewayClient$executeRequest$12.I$0 = i3;
                                    commonGatewayClient$executeRequest$12.J$0 = b;
                                    commonGatewayClient$executeRequest$12.label = 1;
                                    obj = httpClientProvider.invoke(commonGatewayClient$executeRequest$12);
                                    if (obj != lu3Var) {
                                        j2 = b;
                                        operationType3 = operationType2;
                                    }
                                    return lu3Var;
                                } catch (UnityAdsNetworkException e) {
                                    e = e;
                                    j = b;
                                    operationType3 = operationType2;
                                    sendNetworkErrorDiagnosticEvent(e, i3, operationType3, new whj(j));
                                    return HttpResponseKt.toHttpResponse(e);
                                } catch (qij e2) {
                                    e = e2;
                                    j = b;
                                    operationType3 = operationType2;
                                    sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i3, operationType3, new whj(j));
                                    throw e;
                                }
                            } catch (UnityAdsNetworkException e3) {
                                e = e3;
                                i3 = i;
                            } catch (qij e4) {
                                e = e4;
                                i3 = i;
                            }
                        } catch (UnityAdsNetworkException e5) {
                            e = e5;
                            i3 = i;
                            operationType2 = operationType;
                        } catch (qij e6) {
                            e = e6;
                            i3 = i;
                            operationType2 = operationType;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = commonGatewayClient$executeRequest$12.J$0;
                            int i5 = commonGatewayClient$executeRequest$12.I$0;
                            operationType4 = (OperationType) commonGatewayClient$executeRequest$12.L$0;
                            try {
                                y6a.M(obj);
                                i3 = i5;
                            } catch (UnityAdsNetworkException e7) {
                                e = e7;
                                i3 = i5;
                                operationType3 = operationType4;
                                sendNetworkErrorDiagnosticEvent(e, i3, operationType3, new whj(j));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (qij e8) {
                                e = e8;
                                i3 = i5;
                                operationType3 = operationType4;
                                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i3, operationType3, new whj(j));
                                throw e;
                            }
                            try {
                                HttpResponse httpResponse = (HttpResponse) obj;
                                sendNetworkSuccessDiagnosticEvent(httpResponse, i3, operationType4, new whj(j));
                                return httpResponse;
                            } catch (UnityAdsNetworkException e9) {
                                e = e9;
                                operationType3 = operationType4;
                                sendNetworkErrorDiagnosticEvent(e, i3, operationType3, new whj(j));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (qij e10) {
                                e = e10;
                                operationType3 = operationType4;
                                sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i3, operationType3, new whj(j));
                                throw e;
                            }
                        }
                        long j3 = commonGatewayClient$executeRequest$12.J$0;
                        int i6 = commonGatewayClient$executeRequest$12.I$0;
                        operationType3 = (OperationType) commonGatewayClient$executeRequest$12.L$1;
                        HttpRequest httpRequest3 = (HttpRequest) commonGatewayClient$executeRequest$12.L$0;
                        try {
                            y6a.M(obj);
                            i3 = i6;
                            j2 = j3;
                            httpRequest2 = httpRequest3;
                        } catch (UnityAdsNetworkException e11) {
                            e = e11;
                            i3 = i6;
                            j = j3;
                            sendNetworkErrorDiagnosticEvent(e, i3, operationType3, new whj(j));
                            return HttpResponseKt.toHttpResponse(e);
                        } catch (qij e12) {
                            e = e12;
                            i3 = i6;
                            j = j3;
                            sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i3, operationType3, new whj(j));
                            throw e;
                        }
                    }
                    commonGatewayClient$executeRequest$12.L$0 = operationType3;
                    commonGatewayClient$executeRequest$12.L$1 = null;
                    commonGatewayClient$executeRequest$12.I$0 = i3;
                    commonGatewayClient$executeRequest$12.J$0 = j2;
                    commonGatewayClient$executeRequest$12.label = 2;
                    obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                    if (obj != lu3Var) {
                        operationType4 = operationType3;
                        j = j2;
                        HttpResponse httpResponse2 = (HttpResponse) obj;
                        sendNetworkSuccessDiagnosticEvent(httpResponse2, i3, operationType4, new whj(j));
                        return httpResponse2;
                    }
                    return lu3Var;
                }
            }
            commonGatewayClient$executeRequest$12.L$0 = operationType3;
            commonGatewayClient$executeRequest$12.L$1 = null;
            commonGatewayClient$executeRequest$12.I$0 = i3;
            commonGatewayClient$executeRequest$12.J$0 = j2;
            commonGatewayClient$executeRequest$12.label = 2;
            obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
            if (obj != lu3Var) {
            }
            return lu3Var;
        } catch (UnityAdsNetworkException e13) {
            e = e13;
            j = j2;
            sendNetworkErrorDiagnosticEvent(e, i3, operationType3, new whj(j));
            return HttpResponseKt.toHttpResponse(e);
        } catch (qij e14) {
            e = e14;
            j = j2;
            sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null), i3, operationType3, new whj(j));
            throw e;
        }
        commonGatewayClient$executeRequest$1 = new CommonGatewayClient$executeRequest$1(this, rq3Var);
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$122 = commonGatewayClient$executeRequest$1;
        obj = commonGatewayClient$executeRequest$122.result;
        lu3Var = lu3.a;
        i2 = commonGatewayClient$executeRequest$122.label;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x016d -> B:12:0x0173). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeWithRetry(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, rq3<? super UniversalResponseOuterClass.UniversalResponse> rq3Var) {
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$1;
        int i;
        long retryWaitBase;
        int i2;
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$12;
        long j;
        RequestPolicy requestPolicy2;
        OperationType operationType2;
        String str2;
        UniversalRequestOuterClass.UniversalRequest universalRequest2;
        UniversalRequestOuterClass.UniversalRequest universalRequest3;
        RequestPolicy requestPolicy3;
        String str3;
        OperationType operationType3;
        int i3;
        HttpResponse httpResponse;
        List<String> list;
        String str4;
        Long k0;
        Object executeRequest;
        if (rq3Var instanceof CommonGatewayClient$executeWithRetry$1) {
            commonGatewayClient$executeWithRetry$1 = (CommonGatewayClient$executeWithRetry$1) rq3Var;
            int i4 = commonGatewayClient$executeWithRetry$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$executeWithRetry$1.label = i4 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$executeWithRetry$1.result;
                Object obj2 = lu3.a;
                i = commonGatewayClient$executeWithRetry$1.label;
                int i5 = 2;
                int i6 = 1;
                Object obj3 = null;
                if (i != 0) {
                    y6a.M(obj);
                    String gatewayUrl = getGatewayUrl(str);
                    xhj.a.getClass();
                    xuc.a.getClass();
                    long b = xuc.b();
                    retryWaitBase = requestPolicy.getRetryWaitBase();
                    i2 = 0;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    j = b;
                    requestPolicy2 = requestPolicy;
                    operationType2 = operationType;
                    str2 = gatewayUrl;
                    universalRequest2 = universalRequest;
                    HttpRequest buildHttpRequest = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$3 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i6;
                    executeRequest = executeRequest(buildHttpRequest, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest != obj2) {
                    }
                    return obj2;
                }
                if (i == 1) {
                    long j2 = commonGatewayClient$executeWithRetry$1.J$1;
                    long j3 = commonGatewayClient$executeWithRetry$1.J$0;
                    int i7 = commonGatewayClient$executeWithRetry$1.I$0;
                    String str5 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                    OperationType operationType4 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                    requestPolicy3 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                    universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                    y6a.M(obj);
                    i3 = i7;
                    j = j3;
                    str3 = str5;
                    operationType3 = operationType4;
                    retryWaitBase = j2;
                    httpResponse = (HttpResponse) obj;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                    }
                    return obj2;
                }
                if (i == 2) {
                    UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) commonGatewayClient$executeWithRetry$1.L$0;
                    y6a.M(obj);
                    return universalResponse;
                }
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j4 = commonGatewayClient$executeWithRetry$1.J$1;
                long j5 = commonGatewayClient$executeWithRetry$1.J$0;
                i3 = commonGatewayClient$executeWithRetry$1.I$0;
                String str6 = (String) commonGatewayClient$executeWithRetry$1.L$3;
                OperationType operationType5 = (OperationType) commonGatewayClient$executeWithRetry$1.L$2;
                RequestPolicy requestPolicy4 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$1;
                UniversalRequestOuterClass.UniversalRequest universalRequest4 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$0;
                y6a.M(obj);
                int i8 = 1;
                commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                j = j5;
                requestPolicy2 = requestPolicy4;
                universalRequest3 = universalRequest4;
                str2 = str6;
                retryWaitBase = j4;
                OperationType operationType6 = operationType5;
                i2 = i3 + 1;
                operationType2 = operationType6;
                universalRequest2 = universalRequest3;
                i6 = i8;
                i5 = 2;
                obj3 = null;
                HttpRequest buildHttpRequest2 = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                commonGatewayClient$executeWithRetry$12.L$3 = str2;
                commonGatewayClient$executeWithRetry$12.I$0 = i2;
                commonGatewayClient$executeWithRetry$12.J$0 = j;
                commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                commonGatewayClient$executeWithRetry$12.label = i6;
                executeRequest = executeRequest(buildHttpRequest2, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                if (executeRequest != obj2) {
                    universalRequest3 = universalRequest2;
                    obj = executeRequest;
                    int i9 = i2;
                    requestPolicy3 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$1 = commonGatewayClient$executeWithRetry$12;
                    str3 = str2;
                    operationType3 = operationType2;
                    i3 = i9;
                    httpResponse = (HttpResponse) obj;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                        i8 = i6;
                        Long l = (httpResponse.getStatusCode() != 429 || (list = httpResponse.getHeaders().get(HEADER_RETRY_AFTER)) == null || (str4 = (String) CollectionsKt.firstOrNull(list)) == null || (k0 = StringsKt.k0(str4)) == null) ? null : new Long(k0.longValue() * 1000);
                        long longValue = l != null ? l.longValue() : calculateDelayTime(retryWaitBase, requestPolicy3, i3);
                        long elapsedMillis = (long) TimeExtensionsKt.elapsedMillis(new whj(j));
                        if (!shouldRetry(httpResponse.getStatusCode(), elapsedMillis + longValue, requestPolicy3.getMaxDuration())) {
                            throw new NetworkTimeoutException("Gateway request failed after " + i3 + " retries  currentDuration: " + elapsedMillis + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                        }
                        commonGatewayClient$executeWithRetry$1.L$0 = universalRequest3;
                        commonGatewayClient$executeWithRetry$1.L$1 = requestPolicy3;
                        commonGatewayClient$executeWithRetry$1.L$2 = operationType3;
                        commonGatewayClient$executeWithRetry$1.L$3 = str3;
                        commonGatewayClient$executeWithRetry$1.I$0 = i3;
                        commonGatewayClient$executeWithRetry$1.J$0 = j;
                        commonGatewayClient$executeWithRetry$1.J$1 = longValue;
                        commonGatewayClient$executeWithRetry$1.label = 3;
                        if (n4o.y(longValue, commonGatewayClient$executeWithRetry$1) != obj2) {
                            String str7 = str3;
                            commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                            requestPolicy2 = requestPolicy3;
                            operationType5 = operationType3;
                            str2 = str7;
                            retryWaitBase = longValue;
                            OperationType operationType62 = operationType5;
                            i2 = i3 + 1;
                            operationType2 = operationType62;
                            universalRequest2 = universalRequest3;
                            i6 = i8;
                            i5 = 2;
                            obj3 = null;
                            HttpRequest buildHttpRequest22 = buildHttpRequest(str2, getHeaders(i2), requestPolicy2, universalRequest2);
                            commonGatewayClient$executeWithRetry$12.L$0 = universalRequest2;
                            commonGatewayClient$executeWithRetry$12.L$1 = requestPolicy2;
                            commonGatewayClient$executeWithRetry$12.L$2 = operationType2;
                            commonGatewayClient$executeWithRetry$12.L$3 = str2;
                            commonGatewayClient$executeWithRetry$12.I$0 = i2;
                            commonGatewayClient$executeWithRetry$12.J$0 = j;
                            commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                            commonGatewayClient$executeWithRetry$12.label = i6;
                            executeRequest = executeRequest(buildHttpRequest22, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                            if (executeRequest != obj2) {
                            }
                        }
                    } else {
                        UniversalResponseOuterClass.UniversalResponse universalResponse2 = getUniversalResponse(httpResponse, operationType3);
                        HandleGatewayUniversalResponse handleGatewayUniversalResponse = this.handleGatewayUniversalResponse;
                        commonGatewayClient$executeWithRetry$1.L$0 = universalResponse2;
                        commonGatewayClient$executeWithRetry$1.L$1 = obj3;
                        commonGatewayClient$executeWithRetry$1.L$2 = obj3;
                        commonGatewayClient$executeWithRetry$1.L$3 = obj3;
                        commonGatewayClient$executeWithRetry$1.label = i5;
                        if (handleGatewayUniversalResponse.invoke(universalResponse2, commonGatewayClient$executeWithRetry$1) != obj2) {
                            return universalResponse2;
                        }
                    }
                }
                return obj2;
            }
        }
        commonGatewayClient$executeWithRetry$1 = new CommonGatewayClient$executeWithRetry$1(this, rq3Var);
        Object obj4 = commonGatewayClient$executeWithRetry$1.result;
        Object obj22 = lu3.a;
        i = commonGatewayClient$executeWithRetry$1.label;
        int i52 = 2;
        int i62 = 1;
        Object obj32 = null;
        if (i != 0) {
        }
    }

    private final String getGatewayUrl(String url) {
        return !Intrinsics.c(url, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int retryCount) {
        ltb ltbVar = new ltb();
        ltbVar.put("Content-Type", a.c(HEADER_PROTOBUF));
        if (retryCount > 0) {
            ltbVar.put(HEADER_RETRY_ATTEMPT, a.c(String.valueOf(retryCount)));
        }
        return ltbVar.d();
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse response, OperationType operationType) {
        try {
            Object body = response.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse parseFrom = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                parseFrom.getClass();
                return parseFrom;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(Charsets.UTF_8);
            bytes.getClass();
            UniversalResponseOuterClass.UniversalResponse parseFrom2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            parseFrom2.getClass();
            return parseFrom2;
        } catch (InvalidProtocolBufferException e) {
            this.logger.debug("Failed to parse response from gateway service with exception: " + e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", (Double) null, tub.h(new Pair("operation", operationType.toString()), new Pair("reason", "protobuf_parsing"), new Pair("reason_debug", response.getBody().toString())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, (Object) null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
            UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            newBuilder.getClass();
            UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.INSTANCE;
            ErrorOuterClass.Error.Builder newBuilder2 = ErrorOuterClass.Error.newBuilder();
            newBuilder2.getClass();
            ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException e, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap i = tub.i(new Pair("operation", operationType.toString()), new Pair("retries", String.valueOf(retryCount)), new Pair("protocol", String.valueOf(e.getProtocol())), new Pair("network_client", String.valueOf(e.getClient())), new Pair("reason_code", String.valueOf(e.getCode())), new Pair("reason_debug", e.getMessage()));
        int i2 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i2 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i2 == 2 || i2 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_FAILURE_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        LinkedHashMap i = tub.i(new Pair("operation", operationType.toString()), new Pair("retries", String.valueOf(retryCount)), new Pair("protocol", httpResponse.getProtocol()), new Pair("network_client", httpResponse.getClient()), new Pair("reason_code", String.valueOf(httpResponse.getStatusCode())));
        int i2 = WhenMappings.$EnumSwitchMapping$0[operationType.ordinal()];
        if (i2 == 1) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INIT_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else if (i2 == 2 || i2 == 3) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_REQUEST_SUCCESS_TIME, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK, Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), i, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
        }
    }

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(@NotNull String str, @NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy, @NotNull OperationType operationType, @NotNull rq3<? super UniversalResponseOuterClass.UniversalResponse> rq3Var) {
        CommonGatewayClient$request$1 commonGatewayClient$request$1;
        int i;
        RequestPolicy requestPolicy2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (rq3Var instanceof CommonGatewayClient$request$1) {
            commonGatewayClient$request$1 = (CommonGatewayClient$request$1) rq3Var;
            int i2 = commonGatewayClient$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonGatewayClient$request$1.result;
                lu3 lu3Var = lu3.a;
                i = commonGatewayClient$request$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    wd5 wd5Var = xd5.b;
                    long R = wkn.R(requestPolicy.getMaxDuration(), be5.MILLISECONDS);
                    CommonGatewayClient$request$2 commonGatewayClient$request$2 = new CommonGatewayClient$request$2(this, operationType, str, universalRequest, requestPolicy, null);
                    commonGatewayClient$request$1.L$0 = requestPolicy;
                    commonGatewayClient$request$1.label = 1;
                    obj = wba.W(R, commonGatewayClient$request$2, commonGatewayClient$request$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    requestPolicy2 = requestPolicy;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    requestPolicy2 = (RequestPolicy) commonGatewayClient$request$1.L$0;
                    y6a.M(obj);
                }
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse == null) {
                    return universalResponse;
                }
                throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
            }
        }
        commonGatewayClient$request$1 = new CommonGatewayClient$request$1(this, rq3Var);
        Object obj2 = commonGatewayClient$request$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonGatewayClient$request$1.label;
        if (i != 0) {
        }
        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj2;
        if (universalResponse == null) {
        }
    }
}
