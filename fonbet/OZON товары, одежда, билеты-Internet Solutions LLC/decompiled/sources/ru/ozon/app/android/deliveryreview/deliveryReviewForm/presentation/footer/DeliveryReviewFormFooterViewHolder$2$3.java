package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.footer;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.viewmodel.DeliveryReviewFormViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/viewmodel/DeliveryReviewFormViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeliveryReviewFormFooterViewHolder$2$3 extends AbstractC7737t implements Function1<DeliveryReviewFormViewModel.Action, Unit> {
    final /* synthetic */ DeliveryReviewFormFooterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryReviewFormFooterViewHolder$2$3(DeliveryReviewFormFooterViewHolder deliveryReviewFormFooterViewHolder) {
        super(1);
        this.this$0 = deliveryReviewFormFooterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeliveryReviewFormViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DeliveryReviewFormViewModel.Action action) {
        Function1 function1;
        if (action instanceof DeliveryReviewFormViewModel.Action.Error) {
            this.this$0.showError(((DeliveryReviewFormViewModel.Action.Error) action).getMsg());
        } else {
            if (!(action instanceof DeliveryReviewFormViewModel.Action.Success)) {
                throw new o();
            }
            function1 = this.this$0.actionHandler;
            function1.invoke(((DeliveryReviewFormViewModel.Action.Success) action).getAction());
        }
    }
}
