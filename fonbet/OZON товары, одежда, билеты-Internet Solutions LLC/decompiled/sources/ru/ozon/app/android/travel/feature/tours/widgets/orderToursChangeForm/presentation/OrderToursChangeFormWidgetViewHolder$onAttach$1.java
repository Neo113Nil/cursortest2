package ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.presentation.OrderToursChangeFormViewModel;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonTextInputView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/orderToursChangeForm/presentation/OrderToursChangeFormViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class OrderToursChangeFormWidgetViewHolder$onAttach$1 extends AbstractC7737t implements Function1<OrderToursChangeFormViewModel.Action, Unit> {
    final /* synthetic */ OrderToursChangeFormWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderToursChangeFormWidgetViewHolder$onAttach$1(OrderToursChangeFormWidgetViewHolder orderToursChangeFormWidgetViewHolder) {
        super(1);
        this.this$0 = orderToursChangeFormWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderToursChangeFormViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r2 = r28.this$0.input;
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke2(OrderToursChangeFormViewModel.Action action) {
        OrderToursChangeFormVO boundData;
        CommonInputVO.TextCommonInputVO input;
        CommonInputVO.TextCommonInputVO copy$default;
        CommonTextInputView commonTextInputView;
        if (!(action instanceof OrderToursChangeFormViewModel.Action.SetText) || (boundData = this.this$0.getBoundData()) == null || (input = boundData.getInput()) == null || (copy$default = CommonInputVO.TextCommonInputVO.copy$default(input, 0L, null, ((OrderToursChangeFormViewModel.Action.SetText) action).getText(), false, null, false, 0, null, false, null, null, false, 0, null, null, null, null, false, null, null, false, 2097147, null)) == null || commonTextInputView == null) {
            return;
        }
        commonTextInputView.bind(copy$default, false);
    }
}
