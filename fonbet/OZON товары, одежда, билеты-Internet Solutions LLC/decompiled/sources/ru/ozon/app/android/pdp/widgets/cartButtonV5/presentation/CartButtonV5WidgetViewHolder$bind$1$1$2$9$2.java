package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation;

import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5WidgetViewHolder$bind$1$1$2$9$2 extends AbstractC7737t implements Function1<View, Unit> {
    final /* synthetic */ CartButtonV5DTO.CartButton.AdditionalButton $additionalButton;
    final /* synthetic */ CartButtonV5VO $item;
    final /* synthetic */ CartButtonV5VO $this_with;
    final /* synthetic */ CartButtonV5WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5WidgetViewHolder$bind$1$1$2$9$2(CartButtonV5WidgetViewHolder cartButtonV5WidgetViewHolder, CartButtonV5DTO.CartButton.AdditionalButton additionalButton, CartButtonV5VO cartButtonV5VO, CartButtonV5VO cartButtonV5VO2) {
        super(1);
        this.this$0 = cartButtonV5WidgetViewHolder;
        this.$additionalButton = additionalButton;
        this.$item = cartButtonV5VO;
        this.$this_with = cartButtonV5VO2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        boolean z11;
        t b11;
        l lVar;
        Intrinsics.checkNotNullParameter(it, "it");
        z11 = this.this$0.isRefresh;
        if (z11) {
            return;
        }
        SwipeRefreshLayout composerSwipeRefresh = this.this$0.getComposerSwipeRefresh();
        if (composerSwipeRefresh == null || !composerSwipeRefresh.isRefreshing()) {
            Map<String, TokenizedTrackingInfo> trackingInfo = this.$additionalButton.getDecrementButton().getTrackingInfo();
            if (trackingInfo != null && (b11 = x.b(trackingInfo, Long.valueOf(this.$item.getId()), null)) != null) {
                lVar = this.this$0.tokenizedAnalytics;
                TokenizedAnalyticsExtKt.processClickEvents(lVar, b11);
            }
            this.this$0.cartViewModel.decrementCount(this.$this_with.getSecondCartButton());
        }
    }
}
