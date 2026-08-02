package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import WZ.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.tooltip.TooltipWrapper;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "tooltip", "Lru/ozon/app/android/checkoutcomposer/common/splitDynamicElements/data/DynamicElementDTO$ProductsBlockDTO$PromotedProduct$ProductTooltip;", "anchorX", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RealFbsSplitVH$dynamicAdapter$2 extends AbstractC7737t implements Function2<DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip, Integer, Unit> {
    final /* synthetic */ RealFbsSplitVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealFbsSplitVH$dynamicAdapter$2(RealFbsSplitVH realFbsSplitVH) {
        super(2);
        this.this$0 = realFbsSplitVH;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip, Integer num) {
        invoke(productTooltip, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(DynamicElementDTO.ProductsBlockDTO.PromotedProduct.ProductTooltip tooltip, int i11) {
        ComposerReferences composerReferences;
        RealFbsSplitVO realFbsSplitVO;
        TooltipWrapper tooltipWrapper;
        WidgetRfbsSplitView widgetRfbsSplitView;
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        RealFbsSplitVH realFbsSplitVH = this.this$0;
        Context context = this.this$0.getContext();
        RealFbsSplitVH realFbsSplitVH2 = this.this$0;
        composerReferences = realFbsSplitVH2.ref;
        l tokenizedAnalytics = composerReferences.getTokenizedAnalytics();
        realFbsSplitVO = this.this$0.item;
        realFbsSplitVH.tooltipWrapper = new TooltipWrapper(context, realFbsSplitVH2, tokenizedAnalytics, realFbsSplitVO != null ? Long.valueOf(realFbsSplitVO.getId()) : null);
        tooltipWrapper = this.this$0.tooltipWrapper;
        if (tooltipWrapper != null) {
            widgetRfbsSplitView = this.this$0.widgetRfbsSplitView;
            tooltipWrapper.create(tooltip, widgetRfbsSplitView.getDynamicElementsRV(), i11);
        }
    }
}
