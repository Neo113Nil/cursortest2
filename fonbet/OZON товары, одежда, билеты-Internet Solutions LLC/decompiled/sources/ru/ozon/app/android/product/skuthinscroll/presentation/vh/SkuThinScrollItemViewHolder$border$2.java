package ru.ozon.app.android.product.skuthinscroll.presentation.vh;

import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SkuThinScrollItemViewHolder$border$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ SkuThinScrollItemViewHolder<VB> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuThinScrollItemViewHolder$border$2(SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder) {
        super(0);
        this.this$0 = skuThinScrollItemViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        int borderStrokeWidth;
        float borderRadius;
        GradientDrawable gradientDrawable = new GradientDrawable();
        SkuThinScrollItemViewHolder<VB> skuThinScrollItemViewHolder = this.this$0;
        gradientDrawable.setShape(0);
        borderStrokeWidth = skuThinScrollItemViewHolder.getBorderStrokeWidth();
        gradientDrawable.setStroke(borderStrokeWidth, skuThinScrollItemViewHolder.itemView.getContext().getColor(R$color.graphic_neutral));
        borderRadius = skuThinScrollItemViewHolder.getBorderRadius();
        gradientDrawable.setCornerRadius(borderRadius);
        return gradientDrawable;
    }
}
