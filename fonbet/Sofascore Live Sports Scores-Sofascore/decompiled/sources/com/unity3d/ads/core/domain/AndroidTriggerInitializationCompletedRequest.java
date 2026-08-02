package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.tub;
import defpackage.whj;
import defpackage.xhj;
import defpackage.xuc;
import defpackage.y6a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "getRequestPolicy", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "gatewayClient", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "<init>", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "", "invoke", "(Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {

    @NotNull
    private final GatewayClient gatewayClient;

    @NotNull
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;

    @NotNull
    private final GetRequestPolicy getRequestPolicy;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(@NotNull GetInitializationCompletedRequest getInitializationCompletedRequest, @NotNull GetRequestPolicy getRequestPolicy, @NotNull GatewayClient gatewayClient, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        getInitializationCompletedRequest.getClass();
        getRequestPolicy.getClass();
        gatewayClient.getClass();
        sendDiagnosticEvent.getClass();
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:50)(1:5)|6|7|(1:8)|(5:(1:(1:(6:12|13|14|15|16|(2:18|19)(2:22|23))(2:27|28))(2:29|30))(2:45|46)|34|35|(4:38|15|16|(0)(0))|37)|31|32|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0129, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        r16 = r5 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0081, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[Catch: Exception -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:14:0x0035, B:15:0x00a6, B:18:0x00b0), top: B:13:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(@NotNull rq3<? super Unit> rq3Var) {
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$1;
        ?? r5;
        long j;
        long j2;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        RequestPolicy invoke;
        GatewayClient gatewayClient;
        OperationType operationType;
        boolean hasError;
        int i;
        if (!(rq3Var instanceof AndroidTriggerInitializationCompletedRequest$invoke$1) || (r5 = (i = (androidTriggerInitializationCompletedRequest$invoke$1 = (AndroidTriggerInitializationCompletedRequest$invoke$1) rq3Var).label) & Integer.MIN_VALUE) == 0) {
            androidTriggerInitializationCompletedRequest$invoke$1 = new AndroidTriggerInitializationCompletedRequest$invoke$1(this, rq3Var);
        } else {
            androidTriggerInitializationCompletedRequest$invoke$1.label = i - Integer.MIN_VALUE;
        }
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$12 = androidTriggerInitializationCompletedRequest$invoke$1;
        Object obj = androidTriggerInitializationCompletedRequest$invoke$12.result;
        lu3 lu3Var = lu3.a;
        int i2 = androidTriggerInitializationCompletedRequest$invoke$12.label;
        try {
        } catch (Exception e) {
            e = e;
            j = r5;
        }
        try {
            if (i2 == 0) {
                y6a.M(obj);
                xhj.a.getClass();
                xuc.a.getClass();
                long b = xuc.b();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                androidTriggerInitializationCompletedRequest$invoke$12.J$0 = b;
                androidTriggerInitializationCompletedRequest$invoke$12.label = 1;
                obj = getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$12);
                r5 = b;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                    try {
                        y6a.M(obj);
                        UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                        hasError = universalResponse.hasError();
                        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                        if (hasError) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                            return Unit.a;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), tub.h(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "gateway"), new Pair("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return Unit.a;
                    } catch (Exception e2) {
                        e = e2;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), tub.h(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "uncaught_exception"), new Pair("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return Unit.a;
                    }
                }
                long j3 = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                y6a.M(obj);
                r5 = j3;
            }
            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, androidTriggerInitializationCompletedRequest$invoke$12, 1, null);
            if (obj != lu3Var) {
                j = j2;
                UniversalResponseOuterClass.UniversalResponse universalResponse2 = (UniversalResponseOuterClass.UniversalResponse) obj;
                hasError = universalResponse2.hasError();
                SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
                if (hasError) {
                }
            }
            return lu3Var;
        } catch (Exception e3) {
            e = e3;
            j = j2;
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new whj(j))), tub.h(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "uncaught_exception"), new Pair("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
            return Unit.a;
        }
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
        invoke = this.getRequestPolicy.invoke();
        gatewayClient = this.gatewayClient;
        operationType = OperationType.INITIALIZATION_COMPLETED;
        androidTriggerInitializationCompletedRequest$invoke$12.J$0 = r5 == true ? 1L : 0L;
        androidTriggerInitializationCompletedRequest$invoke$12.label = 2;
        j2 = r5 == true ? 1 : 0;
    }
}
