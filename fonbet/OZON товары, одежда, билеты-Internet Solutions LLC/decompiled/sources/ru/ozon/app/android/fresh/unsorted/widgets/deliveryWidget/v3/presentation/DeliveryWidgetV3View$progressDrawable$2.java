package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation;

import B3.D;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v3.presentation.DeliveryWidgetV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/GradientDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV3View$progressDrawable$2 extends AbstractC7737t implements Function0<GradientDrawable> {
    public static final DeliveryWidgetV3View$progressDrawable$2 INSTANCE = new DeliveryWidgetV3View$progressDrawable$2();

    DeliveryWidgetV3View$progressDrawable$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GradientDrawable invoke() {
        DeliveryWidgetV3View.Companion companion;
        GradientDrawable b11 = D.b(0);
        b11.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        companion = DeliveryWidgetV3View.Companion;
        b11.setCornerRadius(companion.getProgressRadius());
        return b11;
    }
}
