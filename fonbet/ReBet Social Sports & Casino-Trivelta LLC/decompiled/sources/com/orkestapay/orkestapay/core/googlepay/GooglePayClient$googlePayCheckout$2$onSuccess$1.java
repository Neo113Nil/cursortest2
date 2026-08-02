package com.orkestapay.orkestapay.core.googlepay;

import Ph.P;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.apirequest.PaymentMethodListener;
import com.orkestapay.orkestapay.client.model.PaymentMethodResponse;
import com.orkestapay.orkestapay.client.model.googlepay.PaymentMethodGooglePay;
import com.orkestapay.orkestapay.core.networking.OrkestapayError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.orkestapay.orkestapay.core.googlepay.GooglePayClient$googlePayCheckout$2$onSuccess$1", f = "GooglePayClient.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class GooglePayClient$googlePayCheckout$2$onSuccess$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ GooglePayActivity $activity;
    final /* synthetic */ OrkestapayAPI $orkestapayAPI;
    final /* synthetic */ PaymentMethodGooglePay $paymentMethod;
    int label;
    final /* synthetic */ GooglePayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayClient$googlePayCheckout$2$onSuccess$1(OrkestapayAPI orkestapayAPI, PaymentMethodGooglePay paymentMethodGooglePay, GooglePayClient googlePayClient, GooglePayActivity googlePayActivity, Continuation<? super GooglePayClient$googlePayCheckout$2$onSuccess$1> continuation) {
        super(2, continuation);
        this.$orkestapayAPI = orkestapayAPI;
        this.$paymentMethod = paymentMethodGooglePay;
        this.this$0 = googlePayClient;
        this.$activity = googlePayActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GooglePayClient$googlePayCheckout$2$onSuccess$1(this.$orkestapayAPI, this.$paymentMethod, this.this$0, this.$activity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((GooglePayClient$googlePayCheckout$2$onSuccess$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            OrkestapayAPI orkestapayAPI = this.$orkestapayAPI;
            PaymentMethodGooglePay paymentMethodGooglePay = this.$paymentMethod;
            final GooglePayClient googlePayClient = this.this$0;
            final GooglePayActivity googlePayActivity = this.$activity;
            PaymentMethodListener paymentMethodListener = new PaymentMethodListener() { // from class: com.orkestapay.orkestapay.core.googlepay.GooglePayClient$googlePayCheckout$2$onSuccess$1.1
                @Override // com.orkestapay.orkestapay.client.apirequest.PaymentMethodListener
                public void onError(@NotNull OrkestapayError error) {
                    GooglePayCallback googlePayCallback;
                    Intrinsics.checkNotNullParameter(error, "error");
                    googlePayCallback = GooglePayClient.this.callback;
                    if (googlePayCallback == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callback");
                        googlePayCallback = null;
                    }
                    googlePayCallback.onError(error.toString());
                }

                @Override // com.orkestapay.orkestapay.client.apirequest.PaymentMethodListener
                public void onSuccess(@NotNull PaymentMethodResponse paymentMethod) {
                    GooglePayCallback googlePayCallback;
                    Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                    googlePayCallback = GooglePayClient.this.callback;
                    if (googlePayCallback == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callback");
                        googlePayCallback = null;
                    }
                    googlePayCallback.onSuccess(paymentMethod);
                    googlePayActivity.finish();
                }
            };
            this.label = 1;
            if (orkestapayAPI.createPaymentMethodGooglePay(paymentMethodGooglePay, paymentMethodListener, this) == coroutine_suspended) {
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
