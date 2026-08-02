package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.marketing.databinding.WidgetWannaDiscountV2Binding;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.model.WannaDiscountV2Action;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WannaDiscountV2ViewHolder$sendActionHandler$1 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ WannaDiscountV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewHolder$sendActionHandler$1(WannaDiscountV2ViewHolder wannaDiscountV2ViewHolder) {
        super(1);
        this.this$0 = wannaDiscountV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction it) {
        WidgetWannaDiscountV2Binding widgetWannaDiscountV2Binding;
        WannaDiscountV2ViewModel wannaDiscountV2ViewModel;
        String str;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, String> params = it.getParams();
        Long y02 = (params == null || (str = params.get("sku")) == null) ? null : h.y0(str);
        String actionName = it.getActionName();
        widgetWannaDiscountV2Binding = this.this$0.binding;
        wannaDiscountV2ViewModel = this.this$0.viewModel;
        wannaDiscountV2ViewModel.sendUserAction(new WannaDiscountV2Action.SendDiscount(actionName, y02, h.u0(String.valueOf(widgetWannaDiscountV2Binding.wannaDiscountUserPriceInput.getInputText())), h.y0(String.valueOf(widgetWannaDiscountV2Binding.wannaDiscountUserQuantityInput.getInputText()))));
    }
}
