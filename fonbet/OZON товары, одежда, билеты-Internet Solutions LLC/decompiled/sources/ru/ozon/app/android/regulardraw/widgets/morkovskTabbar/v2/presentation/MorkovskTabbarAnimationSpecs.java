package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import kotlin.Metadata;
import m0.C8004n;
import m0.C8025y;
import m0.F;
import m0.T0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarAnimationSpecs;", "", "<init>", "()V", "Lm0/T0;", "", "indicatorAppearance", "Lm0/T0;", "getIndicatorAppearance", "()Lm0/T0;", "pinTrigger", "getPinTrigger", "stickyCollapse", "getStickyCollapse", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarAnimationSpecs {

    @NotNull
    public static final MorkovskTabbarAnimationSpecs INSTANCE = new MorkovskTabbarAnimationSpecs();

    @NotNull
    private static final T0<Float> indicatorAppearance = C8004n.d(400, 0, new C8025y(0.72f, 2.11f, 0.53f, 0.58f), 2);

    @NotNull
    private static final T0<Float> pinTrigger = C8004n.d(150, 0, F.c(), 2);

    @NotNull
    private static final T0<Float> stickyCollapse = C8004n.d(300, 0, new C8025y(0.42f, 0.0f, 0.58f, 1.0f), 2);

    private MorkovskTabbarAnimationSpecs() {
    }

    @NotNull
    public final T0<Float> getIndicatorAppearance() {
        return indicatorAppearance;
    }

    @NotNull
    public final T0<Float> getPinTrigger() {
        return pinTrigger;
    }

    @NotNull
    public final T0<Float> getStickyCollapse() {
        return stickyCollapse;
    }
}
