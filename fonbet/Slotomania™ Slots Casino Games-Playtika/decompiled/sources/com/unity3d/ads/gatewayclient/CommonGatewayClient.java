package com.unity3d.ads.gatewayclient;

import com.google.protobuf.InvalidProtocolBufferException;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: CommonGatewayClient.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'J1\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J\"\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J1\u0010\u0016\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J(\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0002J(\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0002J \u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "requestUrlFactory", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;)V", "buildHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "gatewayUrl", "", "headers", "", "", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "request", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "calculateDelayTime", "", "currentDelay", "retryCount", "", "calculateExponentialBackoff", "calculateJitter", "retryWaitBase", "retryJitterPct", "", "executeRequest", "Lcom/unity3d/services/core/network/model/HttpResponse;", "httpRequest", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithRetry", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGatewayUrl", "getHeaders", "getUniversalResponse", "response", "sendNetworkErrorDiagnosticEvent", "", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "startTime", "Lkotlin/time/TimeMark;", "sendNetworkSuccessDiagnosticEvent", "httpResponse", "shouldRetry", "", "responseCode", "duration", "maxDuration", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClientProvider httpClientProvider;
    private final RequestUrlFactory requestUrlFactory;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    public CommonGatewayClient(HttpClientProvider httpClientProvider, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, RequestUrlFactory requestUrlFactory) {
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        Intrinsics.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(requestUrlFactory, "requestUrlFactory");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation) {
        CommonGatewayClient$request$1 commonGatewayClient$request$1;
        int i;
        RequestPolicy requestPolicy2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof CommonGatewayClient$request$1) {
            commonGatewayClient$request$1 = (CommonGatewayClient$request$1) continuation;
            if ((commonGatewayClient$request$1.label & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$request$1.label -= Integer.MIN_VALUE;
                Object obj = commonGatewayClient$request$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$request$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = DurationKt.toDuration(requestPolicy.getMaxDuration(), DurationUnit.MILLISECONDS);
                    CommonGatewayClient$request$2 commonGatewayClient$request$2 = new CommonGatewayClient$request$2(this, operationType, str, universalRequest, requestPolicy, null);
                    commonGatewayClient$request$1.L$0 = requestPolicy;
                    commonGatewayClient$request$1.label = 1;
                    obj = TimeoutKt.m12683withTimeoutOrNullKLykuaI(duration, commonGatewayClient$request$2, commonGatewayClient$request$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    requestPolicy2 = requestPolicy;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    requestPolicy2 = (RequestPolicy) commonGatewayClient$request$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse == null) {
                    return universalResponse;
                }
                throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
            }
        }
        commonGatewayClient$request$1 = new CommonGatewayClient$request$1(this, continuation);
        Object obj2 = commonGatewayClient$request$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$request$1.label;
        if (i != 0) {
        }
        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj2;
        if (universalResponse == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0185 -> B:12:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeWithRetry(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation) {
        CommonGatewayClient$executeWithRetry$1 commonGatewayClient$executeWithRetry$1;
        CommonGatewayClient commonGatewayClient;
        int i;
        CommonGatewayClient commonGatewayClient2;
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
        long j2;
        CommonGatewayClient commonGatewayClient3;
        int i3;
        HttpResponse httpResponse;
        int i4;
        HttpResponse httpResponse2;
        Long l;
        List<String> list;
        String str4;
        Long longOrNull;
        Object executeRequest;
        if (continuation instanceof CommonGatewayClient$executeWithRetry$1) {
            commonGatewayClient$executeWithRetry$1 = (CommonGatewayClient$executeWithRetry$1) continuation;
            if ((commonGatewayClient$executeWithRetry$1.label & Integer.MIN_VALUE) != 0) {
                commonGatewayClient$executeWithRetry$1.label -= Integer.MIN_VALUE;
                commonGatewayClient = this;
                Object obj = commonGatewayClient$executeWithRetry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonGatewayClient$executeWithRetry$1.label;
                int i5 = 2;
                int i6 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String gatewayUrl = getGatewayUrl(str);
                    long m12642markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
                    commonGatewayClient2 = commonGatewayClient;
                    retryWaitBase = requestPolicy.getRetryWaitBase();
                    i2 = 0;
                    commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                    j = m12642markNowz9LOYto;
                    requestPolicy2 = requestPolicy;
                    operationType2 = operationType;
                    str2 = gatewayUrl;
                    universalRequest2 = universalRequest;
                    HttpRequest buildHttpRequest = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                    commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                    commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                    commonGatewayClient$executeWithRetry$12.L$4 = str2;
                    commonGatewayClient$executeWithRetry$12.I$0 = i2;
                    commonGatewayClient$executeWithRetry$12.J$0 = j;
                    commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                    commonGatewayClient$executeWithRetry$12.label = i6;
                    executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                    if (executeRequest != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    long j3 = commonGatewayClient$executeWithRetry$1.J$1;
                    j2 = commonGatewayClient$executeWithRetry$1.J$0;
                    int i7 = commonGatewayClient$executeWithRetry$1.I$0;
                    String str5 = (String) commonGatewayClient$executeWithRetry$1.L$4;
                    OperationType operationType4 = (OperationType) commonGatewayClient$executeWithRetry$1.L$3;
                    RequestPolicy requestPolicy4 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$2;
                    UniversalRequestOuterClass.UniversalRequest universalRequest4 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$1;
                    CommonGatewayClient commonGatewayClient4 = (CommonGatewayClient) commonGatewayClient$executeWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i3 = i7;
                    operationType3 = operationType4;
                    commonGatewayClient3 = commonGatewayClient4;
                    universalRequest3 = universalRequest4;
                    requestPolicy3 = requestPolicy4;
                    str3 = str5;
                    retryWaitBase = j3;
                    httpResponse = (HttpResponse) obj;
                    i4 = i6;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                    }
                    return coroutine_suspended;
                }
                if (i == 2) {
                    UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) commonGatewayClient$executeWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    return universalResponse;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = commonGatewayClient$executeWithRetry$1.J$1;
                long j5 = commonGatewayClient$executeWithRetry$1.J$0;
                i3 = commonGatewayClient$executeWithRetry$1.I$0;
                String str6 = (String) commonGatewayClient$executeWithRetry$1.L$4;
                OperationType operationType5 = (OperationType) commonGatewayClient$executeWithRetry$1.L$3;
                RequestPolicy requestPolicy5 = (RequestPolicy) commonGatewayClient$executeWithRetry$1.L$2;
                universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) commonGatewayClient$executeWithRetry$1.L$1;
                CommonGatewayClient commonGatewayClient5 = (CommonGatewayClient) commonGatewayClient$executeWithRetry$1.L$0;
                ResultKt.throwOnFailure(obj);
                i4 = 1;
                long j6 = j5;
                operationType3 = operationType5;
                commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                requestPolicy2 = requestPolicy5;
                commonGatewayClient2 = commonGatewayClient5;
                str2 = str6;
                retryWaitBase = j4;
                i2 = i3 + 1;
                operationType2 = operationType3;
                universalRequest2 = universalRequest3;
                j = j6;
                i6 = i4;
                i5 = 2;
                HttpRequest buildHttpRequest2 = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                commonGatewayClient$executeWithRetry$12.L$4 = str2;
                commonGatewayClient$executeWithRetry$12.I$0 = i2;
                commonGatewayClient$executeWithRetry$12.J$0 = j;
                commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                commonGatewayClient$executeWithRetry$12.label = i6;
                executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest2, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                if (executeRequest != coroutine_suspended) {
                    universalRequest3 = universalRequest2;
                    obj = executeRequest;
                    CommonGatewayClient commonGatewayClient6 = commonGatewayClient2;
                    requestPolicy3 = requestPolicy2;
                    commonGatewayClient$executeWithRetry$1 = commonGatewayClient$executeWithRetry$12;
                    j2 = j;
                    operationType3 = operationType2;
                    i3 = i2;
                    str3 = str2;
                    commonGatewayClient3 = commonGatewayClient6;
                    httpResponse = (HttpResponse) obj;
                    i4 = i6;
                    if (HttpResponseKt.isSuccessful(httpResponse)) {
                        UniversalResponseOuterClass.UniversalResponse universalResponse2 = commonGatewayClient3.getUniversalResponse(httpResponse, operationType3);
                        HandleGatewayUniversalResponse handleGatewayUniversalResponse = commonGatewayClient3.handleGatewayUniversalResponse;
                        commonGatewayClient$executeWithRetry$1.L$0 = universalResponse2;
                        commonGatewayClient$executeWithRetry$1.L$1 = null;
                        commonGatewayClient$executeWithRetry$1.L$2 = null;
                        commonGatewayClient$executeWithRetry$1.L$3 = null;
                        commonGatewayClient$executeWithRetry$1.L$4 = null;
                        commonGatewayClient$executeWithRetry$1.label = i5;
                        if (handleGatewayUniversalResponse.invoke(universalResponse2, commonGatewayClient$executeWithRetry$1) != coroutine_suspended) {
                            return universalResponse2;
                        }
                    } else {
                        if (httpResponse.getStatusCode() != 429 || (list = httpResponse.getHeaders().get("Retry-After")) == null || (str4 = (String) CollectionsKt.firstOrNull((List) list)) == null || (longOrNull = StringsKt.toLongOrNull(str4)) == null) {
                            httpResponse2 = httpResponse;
                            l = null;
                        } else {
                            httpResponse2 = httpResponse;
                            l = Boxing.boxLong(1000 * longOrNull.longValue());
                        }
                        long longValue = l != null ? l.longValue() : commonGatewayClient3.calculateDelayTime(retryWaitBase, requestPolicy3, i3);
                        long elapsedMillis = (long) TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j2));
                        if (!commonGatewayClient3.shouldRetry(httpResponse2.getStatusCode(), elapsedMillis + longValue, requestPolicy3.getMaxDuration())) {
                            throw new NetworkTimeoutException("Gateway request failed after " + i3 + " retries  currentDuration: " + elapsedMillis + "ms maxDuration: " + requestPolicy3.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
                        }
                        commonGatewayClient$executeWithRetry$1.L$0 = commonGatewayClient3;
                        commonGatewayClient$executeWithRetry$1.L$1 = universalRequest3;
                        commonGatewayClient$executeWithRetry$1.L$2 = requestPolicy3;
                        commonGatewayClient$executeWithRetry$1.L$3 = operationType3;
                        commonGatewayClient$executeWithRetry$1.L$4 = str3;
                        commonGatewayClient$executeWithRetry$1.I$0 = i3;
                        commonGatewayClient$executeWithRetry$1.J$0 = j2;
                        commonGatewayClient$executeWithRetry$1.J$1 = longValue;
                        commonGatewayClient$executeWithRetry$1.label = 3;
                        if (DelayKt.delay(longValue, commonGatewayClient$executeWithRetry$1) != coroutine_suspended) {
                            retryWaitBase = longValue;
                            j6 = j2;
                            commonGatewayClient$executeWithRetry$12 = commonGatewayClient$executeWithRetry$1;
                            requestPolicy2 = requestPolicy3;
                            commonGatewayClient2 = commonGatewayClient3;
                            str2 = str3;
                            i2 = i3 + 1;
                            operationType2 = operationType3;
                            universalRequest2 = universalRequest3;
                            j = j6;
                            i6 = i4;
                            i5 = 2;
                            HttpRequest buildHttpRequest22 = commonGatewayClient2.buildHttpRequest(str2, commonGatewayClient2.getHeaders(i2), requestPolicy2, universalRequest2);
                            commonGatewayClient$executeWithRetry$12.L$0 = commonGatewayClient2;
                            commonGatewayClient$executeWithRetry$12.L$1 = universalRequest2;
                            commonGatewayClient$executeWithRetry$12.L$2 = requestPolicy2;
                            commonGatewayClient$executeWithRetry$12.L$3 = operationType2;
                            commonGatewayClient$executeWithRetry$12.L$4 = str2;
                            commonGatewayClient$executeWithRetry$12.I$0 = i2;
                            commonGatewayClient$executeWithRetry$12.J$0 = j;
                            commonGatewayClient$executeWithRetry$12.J$1 = retryWaitBase;
                            commonGatewayClient$executeWithRetry$12.label = i6;
                            executeRequest = commonGatewayClient2.executeRequest(buildHttpRequest22, i2, operationType2, commonGatewayClient$executeWithRetry$12);
                            if (executeRequest != coroutine_suspended) {
                            }
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
        commonGatewayClient = this;
        commonGatewayClient$executeWithRetry$1 = new CommonGatewayClient$executeWithRetry$1(commonGatewayClient, continuation);
        Object obj2 = commonGatewayClient$executeWithRetry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonGatewayClient$executeWithRetry$1.label;
        int i52 = 2;
        int i62 = 1;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, Continuation<? super HttpResponse> continuation) {
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$1;
        Object obj;
        Object coroutine_suspended;
        int i2;
        long m12642markNowz9LOYto;
        int i3;
        OperationType operationType2;
        CommonGatewayClient commonGatewayClient;
        HttpRequest httpRequest2;
        CommonGatewayClient commonGatewayClient2;
        long j;
        long j2;
        OperationType operationType3;
        int i4;
        try {
            if (continuation instanceof CommonGatewayClient$executeRequest$1) {
                commonGatewayClient$executeRequest$1 = (CommonGatewayClient$executeRequest$1) continuation;
                if ((commonGatewayClient$executeRequest$1.label & Integer.MIN_VALUE) != 0) {
                    commonGatewayClient$executeRequest$1.label -= Integer.MIN_VALUE;
                    CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$12 = commonGatewayClient$executeRequest$1;
                    obj = commonGatewayClient$executeRequest$12.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i2 = commonGatewayClient$executeRequest$12.label;
                    if (i2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        m12642markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m12642markNowz9LOYto();
                        try {
                            HttpClientProvider httpClientProvider = this.httpClientProvider;
                            commonGatewayClient$executeRequest$12.L$0 = this;
                            httpRequest2 = httpRequest;
                            commonGatewayClient$executeRequest$12.L$1 = httpRequest2;
                            operationType2 = operationType;
                            try {
                                commonGatewayClient$executeRequest$12.L$2 = operationType2;
                                i3 = i;
                                try {
                                    commonGatewayClient$executeRequest$12.I$0 = i3;
                                    commonGatewayClient$executeRequest$12.J$0 = m12642markNowz9LOYto;
                                    commonGatewayClient$executeRequest$12.label = 1;
                                    obj = httpClientProvider.invoke(commonGatewayClient$executeRequest$12);
                                    if (obj != coroutine_suspended) {
                                        commonGatewayClient2 = this;
                                    }
                                    return coroutine_suspended;
                                } catch (UnityAdsNetworkException e) {
                                    e = e;
                                    commonGatewayClient = this;
                                    j = m12642markNowz9LOYto;
                                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                                    return HttpResponseKt.toHttpResponse(e);
                                } catch (TimeoutCancellationException e2) {
                                    e = e2;
                                    commonGatewayClient = this;
                                    j = m12642markNowz9LOYto;
                                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                                    throw e;
                                }
                            } catch (UnityAdsNetworkException e3) {
                                e = e3;
                                i3 = i;
                            } catch (TimeoutCancellationException e4) {
                                e = e4;
                                i3 = i;
                            }
                        } catch (UnityAdsNetworkException e5) {
                            e = e5;
                            i3 = i;
                            operationType2 = operationType;
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            i3 = i;
                            operationType2 = operationType;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = commonGatewayClient$executeRequest$12.J$0;
                            i4 = commonGatewayClient$executeRequest$12.I$0;
                            operationType3 = (OperationType) commonGatewayClient$executeRequest$12.L$1;
                            commonGatewayClient = (CommonGatewayClient) commonGatewayClient$executeRequest$12.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                HttpResponse httpResponse = (HttpResponse) obj;
                                commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i4, operationType3, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                                return httpResponse;
                            } catch (UnityAdsNetworkException e7) {
                                e = e7;
                                i3 = i4;
                                operationType2 = operationType3;
                                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                                return HttpResponseKt.toHttpResponse(e);
                            } catch (TimeoutCancellationException e8) {
                                e = e8;
                                i3 = i4;
                                operationType2 = operationType3;
                                commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                                throw e;
                            }
                        }
                        m12642markNowz9LOYto = commonGatewayClient$executeRequest$12.J$0;
                        int i5 = commonGatewayClient$executeRequest$12.I$0;
                        OperationType operationType4 = (OperationType) commonGatewayClient$executeRequest$12.L$2;
                        HttpRequest httpRequest3 = (HttpRequest) commonGatewayClient$executeRequest$12.L$1;
                        CommonGatewayClient commonGatewayClient3 = (CommonGatewayClient) commonGatewayClient$executeRequest$12.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            commonGatewayClient2 = commonGatewayClient3;
                            i3 = i5;
                            httpRequest2 = httpRequest3;
                            operationType2 = operationType4;
                        } catch (UnityAdsNetworkException e9) {
                            e = e9;
                            operationType2 = operationType4;
                            commonGatewayClient = commonGatewayClient3;
                            i3 = i5;
                            j = m12642markNowz9LOYto;
                            commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                            return HttpResponseKt.toHttpResponse(e);
                        } catch (TimeoutCancellationException e10) {
                            e = e10;
                            operationType2 = operationType4;
                            commonGatewayClient = commonGatewayClient3;
                            i3 = i5;
                            j = m12642markNowz9LOYto;
                            commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                            throw e;
                        }
                    }
                    j2 = m12642markNowz9LOYto;
                    commonGatewayClient$executeRequest$12.L$0 = commonGatewayClient2;
                    commonGatewayClient$executeRequest$12.L$1 = operationType2;
                    commonGatewayClient$executeRequest$12.L$2 = null;
                    commonGatewayClient$executeRequest$12.I$0 = i3;
                    commonGatewayClient$executeRequest$12.J$0 = j2;
                    commonGatewayClient$executeRequest$12.label = 2;
                    obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
                    if (obj != coroutine_suspended) {
                        operationType3 = operationType2;
                        i4 = i3;
                        j = j2;
                        commonGatewayClient = commonGatewayClient2;
                        HttpResponse httpResponse2 = (HttpResponse) obj;
                        commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i4, operationType3, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
                        return httpResponse2;
                    }
                    return coroutine_suspended;
                }
            }
            commonGatewayClient$executeRequest$12.L$0 = commonGatewayClient2;
            commonGatewayClient$executeRequest$12.L$1 = operationType2;
            commonGatewayClient$executeRequest$12.L$2 = null;
            commonGatewayClient$executeRequest$12.I$0 = i3;
            commonGatewayClient$executeRequest$12.J$0 = j2;
            commonGatewayClient$executeRequest$12.label = 2;
            obj = HttpClient.DefaultImpls.execute$default((HttpClient) obj, httpRequest2, false, commonGatewayClient$executeRequest$12, 2, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (UnityAdsNetworkException e11) {
            e = e11;
            j = j2;
            commonGatewayClient = commonGatewayClient2;
            commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
            return HttpResponseKt.toHttpResponse(e);
        } catch (TimeoutCancellationException e12) {
            e = e12;
            j = j2;
            commonGatewayClient = commonGatewayClient2;
            commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i3, operationType2, TimeSource.Monotonic.ValueTimeMark.m12643boximpl(j));
            throw e;
        }
        commonGatewayClient$executeRequest$1 = new CommonGatewayClient$executeRequest$1(this, continuation);
        CommonGatewayClient$executeRequest$1 commonGatewayClient$executeRequest$122 = commonGatewayClient$executeRequest$1;
        obj = commonGatewayClient$executeRequest$122.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonGatewayClient$executeRequest$122.label;
        if (i2 != 0) {
        }
        j2 = m12642markNowz9LOYto;
    }

    private final HttpRequest buildHttpRequest(String gatewayUrl, Map<String, ? extends List<String>> headers, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest request) {
        return new HttpRequest(gatewayUrl, null, RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final Map<String, List<String>> getHeaders(int retryCount) {
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put("Content-Type", CollectionsKt.listOf(HEADER_PROTOBUF));
        if (retryCount > 0) {
            createMapBuilder.put(HEADER_RETRY_ATTEMPT, CollectionsKt.listOf(String.valueOf(retryCount)));
        }
        return MapsKt.build(createMapBuilder);
    }

    private final String getGatewayUrl(String url) {
        return !Intrinsics.areEqual(url, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException e, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), MapsKt.mutableMapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("retries", String.valueOf(retryCount)), TuplesKt.to("protocol", String.valueOf(e.getProtocol())), TuplesKt.to("network_client", String.valueOf(e.getClient())), TuplesKt.to("reason_code", String.valueOf(e.getCode())), TuplesKt.to("reason_debug", e.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), MapsKt.mutableMapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("retries", String.valueOf(retryCount)), TuplesKt.to("protocol", httpResponse.getProtocol()), TuplesKt.to("network_client", httpResponse.getClient()), TuplesKt.to("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse response, OperationType operationType) {
        try {
            Object body = response.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse parseFrom = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(responseBody)");
                return parseFrom;
            }
            if (body instanceof String) {
                byte[] bytes = ((String) body).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                UniversalResponseOuterClass.UniversalResponse parseFrom2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
                Intrinsics.checkNotNullExpressionValue(parseFrom2, "parseFrom(\n             ….UTF_8)\n                )");
                return parseFrom2;
            }
            throw new InvalidProtocolBufferException("Could not parse response from gateway service");
        } catch (InvalidProtocolBufferException e) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, MapsKt.mapOf(TuplesKt.to("operation", operationType.toString()), TuplesKt.to("reason", "protobuf_parsing"), TuplesKt.to("reason_debug", response.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
            UniversalResponseOuterClass.UniversalResponse.Builder newBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            UniversalResponseKt.Dsl _create = companion._create(newBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.INSTANCE;
            ErrorOuterClass.Error.Builder newBuilder2 = ErrorOuterClass.Error.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder()");
            ErrorKt.Dsl _create2 = companion2._create(newBuilder2);
            _create2.setErrorText("ERROR: Could not parse response from gateway service");
            _create.setError(_create2._build());
            return _create._build();
        }
    }

    private final long calculateDelayTime(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return retryCount == 0 ? currentDelay : (long) (currentDelay * requestPolicy.getRetryScalingFactor());
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == 0.0f) {
            return 0L;
        }
        long j = (long) (retryWaitBase * retryJitterPct);
        return Random.INSTANCE.nextLong(-j, j);
    }
}
