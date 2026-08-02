package com.orkestapay.orkestapay.client;

import Ph.P;
import android.content.Context;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.apirequest.PaymentMethodDataListener;
import com.orkestapay.orkestapay.client.enums.PaymentMethodType;
import com.orkestapay.orkestapay.client.model.PaymentMethodData;
import com.orkestapay.orkestapay.core.googlepay.GooglePayCallback;
import com.orkestapay.orkestapay.core.googlepay.GooglePayClient;
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
@DebugMetadata(c = "com.orkestapay.orkestapay.client.OrkestapayClient$googlePaySetup$1", f = "OrkestapayClient.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class OrkestapayClient$googlePaySetup$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ GooglePayCallback $callback;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ OrkestapayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestapayClient$googlePaySetup$1(OrkestapayClient orkestapayClient, Context context, GooglePayCallback googlePayCallback, Continuation<? super OrkestapayClient$googlePaySetup$1> continuation) {
        super(2, continuation);
        this.this$0 = orkestapayClient;
        this.$context = context;
        this.$callback = googlePayCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OrkestapayClient$googlePaySetup$1(this.this$0, this.$context, this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((OrkestapayClient$googlePaySetup$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
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
            PaymentMethodType paymentMethodType = PaymentMethodType.GOOGLE_PAY;
            final OrkestapayClient orkestapayClient = this.this$0;
            final Context context = this.$context;
            final GooglePayCallback googlePayCallback = this.$callback;
            PaymentMethodDataListener paymentMethodDataListener = new PaymentMethodDataListener() { // from class: com.orkestapay.orkestapay.client.OrkestapayClient$googlePaySetup$1.1
                @Override // com.orkestapay.orkestapay.client.apirequest.PaymentMethodDataListener
                public void onError(@NotNull OrkestapayError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    googlePayCallback.onError(error.toString());
                }

                @Override // com.orkestapay.orkestapay.client.apirequest.PaymentMethodDataListener
                public void onSuccess(@NotNull PaymentMethodData data) {
                    GooglePayClient googlePayClient;
                    Intrinsics.checkNotNullParameter(data, "data");
                    OrkestapayClient.this.setGooglePaymentMethodData(data);
                    googlePayClient = OrkestapayClient.this.googlePayClient;
                    googlePayClient.googlePaySetup(context, googlePayCallback);
                }
            };
            this.label = 1;
            if (orkestapayAPI.getPaymentMethodInfo(paymentMethodType, paymentMethodDataListener, this) == coroutine_suspended) {
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
