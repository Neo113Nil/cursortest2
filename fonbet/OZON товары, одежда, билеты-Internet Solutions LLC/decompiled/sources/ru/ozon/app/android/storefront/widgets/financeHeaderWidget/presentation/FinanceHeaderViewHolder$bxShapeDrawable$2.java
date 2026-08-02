package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.presentation;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FinanceHeaderViewHolder$bxShapeDrawable$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    public static final FinanceHeaderViewHolder$bxShapeDrawable$2 INSTANCE = new FinanceHeaderViewHolder$bxShapeDrawable$2();

    FinanceHeaderViewHolder$bxShapeDrawable$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = FinanceHeaderViewHolder.INSTANCE.getBxBadgeRadius();
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        return shapeDrawable;
    }
}
