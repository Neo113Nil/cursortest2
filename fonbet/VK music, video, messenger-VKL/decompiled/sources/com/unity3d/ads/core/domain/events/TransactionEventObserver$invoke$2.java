package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.Pair;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.jvo0;
import xsna.k830;
import xsna.pn00;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: TransactionEventObserver.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {46, 47, 55}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class TransactionEventObserver$invoke$2 extends SuspendLambda implements wzs<TransactionEventRequestOuterClass.TransactionEventRequest, spj<? super s3q0>, Object> {
    long J$0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, spj<? super TransactionEventObserver$invoke$2> spjVar) {
        super(2, spjVar);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, spjVar);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // xsna.wzs
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, spj<? super s3q0> spjVar) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:2)|(1:(1:(1:(5:7|8|9|10|11)(2:14|15))(9:16|17|18|19|(1:21)|31|9|10|11))(4:32|33|34|35))(5:43|44|45|(1:47)|23)|36|37|(2:39|23)|19|(0)|31|9|10|11|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r0.set(r1, r16) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[Catch: UnityAdsNetworkException -> 0x00bf, TRY_LEAVE, TryCatch #1 {UnityAdsNetworkException -> 0x00bf, blocks: (B:19:0x0093, B:21:0x009b, B:37:0x006e), top: B:36:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17, types: [long] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SendDiagnosticEvent sendDiagnosticEvent;
        String message;
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        Object invoke;
        long j;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        Object request$default;
        ByteStringDataSource byteStringDataSource;
        SendDiagnosticEvent sendDiagnosticEvent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r1 = 2;
        try {
        } catch (UnityAdsNetworkException e) {
            e = e;
        }
        if (i == 0) {
            a.a(obj);
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
            long b = k830.b();
            try {
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl _create = UniversalRequestKt.PayloadKt.Dsl.Companion._create(UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder());
                _create.setTransactionEventRequest(transactionEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.J$0 = b;
                this.label = 1;
                invoke = getUniversalRequestForPayLoad.invoke(_build, this);
                if (invoke != coroutineSingletons) {
                    j = b;
                }
                return coroutineSingletons;
            } catch (UnityAdsNetworkException e2) {
                e = e2;
                r1 = b;
                sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
                Double d = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(r1)));
                Pair pair = new Pair("reason", e.getClass().getSimpleName());
                message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getSimpleName();
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType, d, pn00.k(pair, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
                return s3q0.a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = this.J$0;
                a.a(obj);
                r1 = j2;
                sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(r1))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
                return s3q0.a;
            }
            long j3 = this.J$0;
            UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
            a.a(obj);
            j = j3;
            universalRequest = universalRequest2;
            request$default = obj;
            if (((UniversalResponseOuterClass.UniversalResponse) request$default).getError() != null) {
                byteStringDataSource = this.this$0.iapTransactionStore;
                ByteString byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                this.L$0 = null;
                this.J$0 = j;
                this.label = 3;
            }
            r1 = j;
            sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(r1))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
            return s3q0.a;
        }
        long j4 = this.J$0;
        try {
            a.a(obj);
            invoke = obj;
            j = j4;
        } catch (UnityAdsNetworkException e3) {
            e = e3;
            r1 = j4;
            sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
            DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType2 = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME;
            Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(r1)));
            Pair pair2 = new Pair("reason", e.getClass().getSimpleName());
            message = e.getMessage();
            if (message == null) {
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, diagnosticEventType2, d2, pn00.k(pair2, new Pair("reason_debug", message)), (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 120, (Object) null);
            return s3q0.a;
        }
        universalRequest = (UniversalRequestOuterClass.UniversalRequest) invoke;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        RequestPolicy invoke2 = getRequestPolicy.invoke();
        OperationType operationType = OperationType.TRANSACTION_EVENT;
        this.L$0 = universalRequest;
        this.J$0 = j;
        this.label = 2;
        request$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke2, operationType, this, 1, null);
        if (request$default == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((UniversalResponseOuterClass.UniversalResponse) request$default).getError() != null) {
        }
        r1 = j;
        sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME, new Double(TimeExtensionsKt.elapsedMillis(new jvo0.a(r1))), (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, (Object) null);
        return s3q0.a;
    }
}
