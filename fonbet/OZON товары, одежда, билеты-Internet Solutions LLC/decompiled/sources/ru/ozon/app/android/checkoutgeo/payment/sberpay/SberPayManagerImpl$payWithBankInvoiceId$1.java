package ru.ozon.app.android.checkoutgeo.payment.sberpay;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.api.PaymentResult;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "paymentResult", "Lspay/sdk/api/PaymentResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SberPayManagerImpl$payWithBankInvoiceId$1 extends AbstractC7737t implements Function1<PaymentResult, Unit> {
    final /* synthetic */ Function0<Unit> $onFailure;
    final /* synthetic */ Function0<Unit> $onSuccess;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SberPayManagerImpl$payWithBankInvoiceId$1(Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$onSuccess = function0;
        this.$onFailure = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PaymentResult paymentResult) {
        invoke2(paymentResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PaymentResult paymentResult) {
        Intrinsics.checkNotNullParameter(paymentResult, "paymentResult");
        if (paymentResult instanceof PaymentResult.Success) {
            this.$onSuccess.invoke();
        } else {
            this.$onFailure.invoke();
        }
    }
}
