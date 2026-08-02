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
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.jvo0;
import xsna.k830;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;

/* compiled from: AndroidTriggerInitializationCompletedRequest.kt */
/* loaded from: classes14.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(1:49)(1:5)|6|7|8|(5:(1:(1:(5:12|13|14|15|(2:17|18)(2:21|22))(2:26|27))(2:28|29))(2:44|45)|33|34|(3:37|15|(0)(0))|36)|30|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0118, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0119, code lost:
    
        r15 = r5 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #2 {Exception -> 0x0038, blocks: (B:14:0x0034, B:15:0x0098, B:17:0x00a0), top: B:13:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(spj<? super s3q0> spjVar) {
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$1;
        ?? r5;
        long j;
        long j2;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        RequestPolicy invoke;
        GatewayClient gatewayClient;
        OperationType operationType;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        int i;
        if (!(spjVar instanceof AndroidTriggerInitializationCompletedRequest$invoke$1) || (r5 = (i = (androidTriggerInitializationCompletedRequest$invoke$1 = (AndroidTriggerInitializationCompletedRequest$invoke$1) spjVar).label) & Integer.MIN_VALUE) == 0) {
            androidTriggerInitializationCompletedRequest$invoke$1 = new AndroidTriggerInitializationCompletedRequest$invoke$1(this, spjVar);
        } else {
            androidTriggerInitializationCompletedRequest$invoke$1.label = i - Integer.MIN_VALUE;
        }
        AndroidTriggerInitializationCompletedRequest$invoke$1 androidTriggerInitializationCompletedRequest$invoke$12 = androidTriggerInitializationCompletedRequest$invoke$1;
        Object obj = androidTriggerInitializationCompletedRequest$invoke$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidTriggerInitializationCompletedRequest$invoke$12.label;
        try {
        } catch (Exception e) {
            e = e;
            j = r5;
        }
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                long b = k830.b();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_STARTED, (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (Object) null);
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                androidTriggerInitializationCompletedRequest$invoke$12.J$0 = b;
                androidTriggerInitializationCompletedRequest$invoke$12.label = 1;
                obj = getInitializationCompletedRequest.invoke(androidTriggerInitializationCompletedRequest$invoke$12);
                r5 = b;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                    try {
                        kotlin.a.a(obj);
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                        if (universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                            return s3q0.a;
                        }
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), pn00.k(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "gateway"), new Pair("reason_debug", universalResponse.getError().getErrorText())), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return s3q0.a;
                    } catch (Exception e2) {
                        e = e2;
                        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), pn00.k(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "uncaught_exception"), new Pair("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                        return s3q0.a;
                    }
                }
                long j3 = androidTriggerInitializationCompletedRequest$invoke$12.J$0;
                kotlin.a.a(obj);
                r5 = j3;
            }
            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, operationType, androidTriggerInitializationCompletedRequest$invoke$12, 1, null);
            if (obj != coroutineSingletons) {
                j = j2;
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) obj;
                if (universalResponse.hasError()) {
                }
            }
            return coroutineSingletons;
        } catch (Exception e3) {
            e = e3;
            j = j2;
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_INITIALIZATION_COMPLETED_EVENT_REQUEST_FAILURE_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(j))), pn00.k(new Pair("operation", OperationType.INITIALIZATION_COMPLETED.toString()), new Pair("reason", "uncaught_exception"), new Pair("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
            return s3q0.a;
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
