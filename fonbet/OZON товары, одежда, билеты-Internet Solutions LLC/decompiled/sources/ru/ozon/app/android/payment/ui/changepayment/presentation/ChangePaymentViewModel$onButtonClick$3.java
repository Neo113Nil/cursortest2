package ru.ozon.app.android.payment.ui.changepayment.presentation;

import W10.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.payment.ui.changepayment.data.ChangePaymentResponse;
import ru.ozon.app.android.payment.ui.changepayment.presentation.ChangePaymentMethodAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/payment/ui/changepayment/data/ChangePaymentResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/payment/ui/changepayment/data/ChangePaymentResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ChangePaymentViewModel$onButtonClick$3 extends AbstractC7737t implements Function1<ChangePaymentResponse, Unit> {
    final /* synthetic */ c $trackingData;
    final /* synthetic */ ChangePaymentViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePaymentViewModel$onButtonClick$3(ChangePaymentViewModel changePaymentViewModel, c cVar) {
        super(1);
        this.this$0 = changePaymentViewModel;
        this.$trackingData = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ChangePaymentResponse changePaymentResponse) {
        invoke2(changePaymentResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ChangePaymentResponse changePaymentResponse) {
        OrderChangePreferences orderChangePreferences;
        if (changePaymentResponse.getOrderNumber() == null || changePaymentResponse.getLink() == null) {
            this.this$0.getSingleAction().postValue(new ChangePaymentMethodAction.Success(changePaymentResponse.getMessage(), changePaymentResponse.getDeeplink()));
        } else {
            this.this$0.getSingleAction().postValue(new ChangePaymentMethodAction.SuccessAndRecalculate(changePaymentResponse.getLink(), changePaymentResponse.getOrderNumber(), this.$trackingData));
        }
        orderChangePreferences = this.this$0.orderChangePreferences;
        orderChangePreferences.markAsUpdated();
    }
}
