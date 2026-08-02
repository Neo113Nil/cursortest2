package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FinanceHeaderViewHolder$topRoundedShapeDrawable$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ FinanceHeaderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinanceHeaderViewHolder$topRoundedShapeDrawable$2(FinanceHeaderViewHolder financeHeaderViewHolder) {
        super(0);
        this.this$0 = financeHeaderViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        float f7;
        float f11;
        float f12;
        float f13;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        FinanceHeaderViewHolder financeHeaderViewHolder = this.this$0;
        f7 = FinanceHeaderViewHolder.topLeftRadius;
        f11 = FinanceHeaderViewHolder.topLeftRadius;
        f12 = FinanceHeaderViewHolder.topLeftRadius;
        f13 = FinanceHeaderViewHolder.topLeftRadius;
        shapeDrawable.setShape(new RoundRectShape(new float[]{f7, f11, f12, f13, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(financeHeaderViewHolder.getContext().getColor(UniColors.LAYER_FLOOR_1.getResId()));
        return shapeDrawable;
    }
}
