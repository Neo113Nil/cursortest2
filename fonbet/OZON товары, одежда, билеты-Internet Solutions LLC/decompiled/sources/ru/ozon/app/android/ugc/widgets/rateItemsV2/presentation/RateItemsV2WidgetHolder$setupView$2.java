package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "sku", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2WidgetHolder$setupView$2 extends AbstractC7737t implements Function2<AtomAction, String, Unit> {
    final /* synthetic */ RateItemsV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2WidgetHolder$setupView$2(RateItemsV2WidgetHolder rateItemsV2WidgetHolder) {
        super(2);
        this.this$0 = rateItemsV2WidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction, String str) {
        invoke2(atomAction, str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action, String sku) {
        Function1 actionHandler;
        RateItemsV2ViewModel rateItemsV2ViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(sku, "sku");
        actionHandler = this.this$0.getActionHandler();
        rateItemsV2ViewModel = this.this$0.viewModel;
        actionHandler.invoke(rateItemsV2ViewModel.transformActionWithReviewUuid(action, sku));
    }
}
