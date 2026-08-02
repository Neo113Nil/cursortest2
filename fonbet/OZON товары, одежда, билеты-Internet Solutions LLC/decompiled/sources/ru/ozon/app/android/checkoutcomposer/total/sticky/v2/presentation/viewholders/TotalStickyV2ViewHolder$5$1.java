package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkout.databinding.WidgetTotalStickyV2Binding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isCropped", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV2ViewHolder$5$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ WidgetTotalStickyV2Binding $this_with;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV2ViewHolder$5$1(WidgetTotalStickyV2Binding widgetTotalStickyV2Binding) {
        super(1);
        this.$this_with = widgetTotalStickyV2Binding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        View fadeEndOfPartnerBanksView = this.$this_with.fadeEndOfPartnerBanksView;
        Intrinsics.checkNotNullExpressionValue(fadeEndOfPartnerBanksView, "fadeEndOfPartnerBanksView");
        fadeEndOfPartnerBanksView.setVisibility(z11 ? 0 : 8);
    }
}
