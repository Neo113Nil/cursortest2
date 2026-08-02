package ru.ozon.app.android.checkoutcomposer.split.presentation.elements.productBlock;

import WZ.l;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.split.data.SplitElementDTO;
import ru.ozon.app.android.checkoutcomposer.split.presentation.tooltip.TooltipWrapper;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "tooltip", "Lru/ozon/app/android/checkoutcomposer/split/data/SplitElementDTO$SplitProductsBlockDTO$PromotedProduct$ProductTooltip;", "anchorX", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProductBlockViewHolder$onShowTooltip$1 extends AbstractC7737t implements Function2<SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip, Integer, Unit> {
    final /* synthetic */ ComposerReferences $refs;
    final /* synthetic */ ProductBlockViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductBlockViewHolder$onShowTooltip$1(ProductBlockViewHolder productBlockViewHolder, ComposerReferences composerReferences) {
        super(2);
        this.this$0 = productBlockViewHolder;
        this.$refs = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip productTooltip, Integer num) {
        invoke(productTooltip, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(SplitElementDTO.SplitProductsBlockDTO.PromotedProduct.ProductTooltip tooltip, int i11) {
        ProductsBlockVO productsBlockVO;
        TooltipWrapper tooltipWrapper;
        ProductBlockView productBlockView;
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        ProductBlockViewHolder productBlockViewHolder = this.this$0;
        Context context = this.this$0.getContext();
        ProductBlockViewHolder productBlockViewHolder2 = this.this$0;
        l tokenizedAnalytics = this.$refs.getTokenizedAnalytics();
        productsBlockVO = this.this$0.currentItem;
        productBlockViewHolder.tooltipWrapper = new TooltipWrapper(context, productBlockViewHolder2, tokenizedAnalytics, productsBlockVO != null ? Long.valueOf(productsBlockVO.getId()) : null);
        tooltipWrapper = this.this$0.tooltipWrapper;
        if (tooltipWrapper != null) {
            productBlockView = this.this$0.view;
            tooltipWrapper.create(tooltip, productBlockView, i11);
        }
    }
}
