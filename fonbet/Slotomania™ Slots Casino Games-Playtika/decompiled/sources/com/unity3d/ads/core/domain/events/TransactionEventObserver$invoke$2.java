package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransactionEventObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "currentTransactionEventRequest", "Lgatewayprotocol/v1/TransactionEventRequestOuterClass$TransactionEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", i = {1}, l = {35, 36, 44}, m = "invokeSuspend", n = {"fullRequest"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class TransactionEventObserver$invoke$2 extends SuspendLambda implements Function2<TransactionEventRequestOuterClass.TransactionEventRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransactionEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransactionEventObserver$invoke$2(TransactionEventObserver transactionEventObserver, Continuation<? super TransactionEventObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = transactionEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransactionEventObserver$invoke$2 transactionEventObserver$invoke$2 = new TransactionEventObserver$invoke$2(this.this$0, continuation);
        transactionEventObserver$invoke$2.L$0 = obj;
        return transactionEventObserver$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, Continuation<? super Unit> continuation) {
        return ((TransactionEventObserver$invoke$2) create(transactionEventRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r13.set(r1, r12) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[Catch: UnityAdsNetworkException -> 0x00b4, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00b4, blocks: (B:7:0x0011, B:14:0x0022, B:15:0x0082, B:17:0x008a, B:20:0x0026, B:21:0x005b, B:26:0x0031), top: B:2:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
        GatewayClient gatewayClient;
        GetRequestPolicy getRequestPolicy;
        UniversalRequestOuterClass.UniversalRequest universalRequest;
        ByteStringDataSource byteStringDataSource;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
            UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
            UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
            _create.setTransactionEventRequest(transactionEventRequest);
            UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
            getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
            this.label = 1;
            obj = getUniversalRequestForPayLoad.invoke(_build, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                ResultKt.throwOnFailure(obj);
                if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                    byteStringDataSource = this.this$0.iapTransactionStore;
                    ByteString byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                    Intrinsics.checkNotNullExpressionValue(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                    this.L$0 = null;
                    this.label = 3;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) obj;
        gatewayClient = this.this$0.gatewayClient;
        getRequestPolicy = this.this$0.getRequestPolicy;
        this.L$0 = universalRequest2;
        this.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest2, getRequestPolicy.invoke(), OperationType.TRANSACTION_EVENT, this, 1, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        universalRequest = universalRequest2;
        if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
        }
        return Unit.INSTANCE;
    }
}
