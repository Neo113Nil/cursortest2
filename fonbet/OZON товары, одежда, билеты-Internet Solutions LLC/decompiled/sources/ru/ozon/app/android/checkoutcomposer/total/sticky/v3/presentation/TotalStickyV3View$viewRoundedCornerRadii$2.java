package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation.TotalStickyV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0014\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV3View$viewRoundedCornerRadii$2 extends AbstractC7737t implements Function0<float[]> {
    public static final TotalStickyV3View$viewRoundedCornerRadii$2 INSTANCE = new TotalStickyV3View$viewRoundedCornerRadii$2();

    TotalStickyV3View$viewRoundedCornerRadii$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final float[] invoke() {
        TotalStickyV3View.Companion companion;
        TotalStickyV3View.Companion companion2;
        TotalStickyV3View.Companion companion3;
        TotalStickyV3View.Companion companion4;
        companion = TotalStickyV3View.Companion;
        float corner_radius = companion.getCORNER_RADIUS();
        companion2 = TotalStickyV3View.Companion;
        float corner_radius2 = companion2.getCORNER_RADIUS();
        companion3 = TotalStickyV3View.Companion;
        float corner_radius3 = companion3.getCORNER_RADIUS();
        companion4 = TotalStickyV3View.Companion;
        return new float[]{corner_radius, corner_radius2, corner_radius3, companion4.getCORNER_RADIUS(), 0.0f, 0.0f, 0.0f, 0.0f};
    }
}
