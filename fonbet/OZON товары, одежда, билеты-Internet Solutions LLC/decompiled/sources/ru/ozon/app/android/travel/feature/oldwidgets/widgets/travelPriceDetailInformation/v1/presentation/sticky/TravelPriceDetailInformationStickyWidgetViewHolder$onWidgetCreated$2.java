package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.utils.animator.StickyAnimator;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isNonStickyWidgetVisible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPriceDetailInformationStickyWidgetViewHolder$onWidgetCreated$2 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ TravelPriceDetailInformationStickyWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPriceDetailInformationStickyWidgetViewHolder$onWidgetCreated$2(TravelPriceDetailInformationStickyWidgetViewHolder travelPriceDetailInformationStickyWidgetViewHolder) {
        super(1);
        this.this$0 = travelPriceDetailInformationStickyWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        this.this$0.isHiddenBeforeLayout = z11;
        StickyAnimator stickyAnimator = this.this$0.animator;
        if (stickyAnimator != null) {
            stickyAnimator.setForceHide(z11);
        }
    }
}
