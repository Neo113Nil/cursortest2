package com.orkestapay.orkestapay.client;

import Ph.P;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.apirequest.PaymentMethodListener;
import com.orkestapay.orkestapay.client.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.orkestapay.orkestapay.client.OrkestapayClient$createPaymentMethod$1", f = "OrkestapayClient.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class OrkestapayClient$createPaymentMethod$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethodListener $listener;
    final /* synthetic */ PaymentMethod $paymentMethod;
    int label;
    final /* synthetic */ OrkestapayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestapayClient$createPaymentMethod$1(OrkestapayClient orkestapayClient, PaymentMethod paymentMethod, PaymentMethodListener paymentMethodListener, Continuation<? super OrkestapayClient$createPaymentMethod$1> continuation) {
        super(2, continuation);
        this.this$0 = orkestapayClient;
        this.$paymentMethod = paymentMethod;
        this.$listener = paymentMethodListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OrkestapayClient$createPaymentMethod$1(this.this$0, this.$paymentMethod, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((OrkestapayClient$createPaymentMethod$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OrkestapayAPI orkestapayAPI;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            orkestapayAPI = this.this$0.orkestapayAPI;
            PaymentMethod paymentMethod = this.$paymentMethod;
            PaymentMethodListener paymentMethodListener = this.$listener;
            this.label = 1;
            if (orkestapayAPI.createPaymentMethodCard(paymentMethod, paymentMethodListener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
