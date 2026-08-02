package ru.ozon.app.android.fresh.unsorted.widgets.recShelf.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class RecShelfShimmerView$border$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RecShelfShimmerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecShelfShimmerView$border$2(RecShelfShimmerView recShelfShimmerView, Context context) {
        super(0);
        this.this$0 = recShelfShimmerView;
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        int borderStrokeWidth;
        float borderRadius;
        GradientDrawable gradientDrawable = new GradientDrawable();
        RecShelfShimmerView recShelfShimmerView = this.this$0;
        Context context = this.$context;
        gradientDrawable.setShape(0);
        borderStrokeWidth = recShelfShimmerView.getBorderStrokeWidth();
        gradientDrawable.setStroke(borderStrokeWidth, context.getColor(UniColors.LAYER_SURFACE.getResId()));
        borderRadius = recShelfShimmerView.getBorderRadius();
        gradientDrawable.setCornerRadius(borderRadius);
        return gradientDrawable;
    }
}
