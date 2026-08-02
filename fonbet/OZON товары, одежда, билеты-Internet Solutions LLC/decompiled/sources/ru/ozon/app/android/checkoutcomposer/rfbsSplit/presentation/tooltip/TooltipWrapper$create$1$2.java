package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.tooltip;

import WZ.t;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "(Landroid/view/View;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TooltipWrapper$create$1$2 implements View.OnClickListener {
    final /* synthetic */ DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip $tooltip;
    final /* synthetic */ TooltipWrapper this$0;

    TooltipWrapper$create$1$2(DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip, TooltipWrapper tooltipWrapper) {
        this.$tooltip = productTooltip;
        this.this$0 = tooltipWrapper;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        t tokenizedEvent$default;
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$tooltip.getTrackingInfo();
        if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, this.this$0.widgetId, null, 2, null)) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.this$0.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
        }
        this.this$0.dismiss();
    }
}
