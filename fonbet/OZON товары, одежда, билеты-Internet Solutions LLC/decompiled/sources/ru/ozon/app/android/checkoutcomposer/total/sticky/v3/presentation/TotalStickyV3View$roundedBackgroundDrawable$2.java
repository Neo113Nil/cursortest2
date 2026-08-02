package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3View;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/LayerDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV3View$roundedBackgroundDrawable$2 extends AbstractC7737t implements Function0<LayerDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TotalStickyV3View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV3View$roundedBackgroundDrawable$2(TotalStickyV3View totalStickyV3View, Context context) {
        super(0);
        this.this$0 = totalStickyV3View;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LayerDrawable invoke() {
        float[] viewRoundedCornerRadii;
        TotalStickyV3View.Companion companion;
        TotalStickyV3View.Companion companion2;
        TotalStickyV3View.Companion companion3;
        TotalStickyV3View.Companion companion4;
        GradientDrawable gradientDrawable = new GradientDrawable();
        TotalStickyV3View totalStickyV3View = this.this$0;
        Context context = this.$context;
        viewRoundedCornerRadii = totalStickyV3View.getViewRoundedCornerRadii();
        gradientDrawable.setCornerRadii(viewRoundedCornerRadii);
        gradientDrawable.setColor(context.getColor(R$color.layer_floor_1));
        companion = TotalStickyV3View.Companion;
        gradientDrawable.setStroke(companion.getDP_1(), context.getColor(R$color.graphic_stroke_sticky));
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable});
        companion2 = TotalStickyV3View.Companion;
        int layer_inset = companion2.getLAYER_INSET();
        companion3 = TotalStickyV3View.Companion;
        int layer_inset2 = companion3.getLAYER_INSET();
        companion4 = TotalStickyV3View.Companion;
        layerDrawable.setLayerInset(0, layer_inset, 0, layer_inset2, companion4.getLAYER_INSET());
        return layerDrawable;
    }
}
