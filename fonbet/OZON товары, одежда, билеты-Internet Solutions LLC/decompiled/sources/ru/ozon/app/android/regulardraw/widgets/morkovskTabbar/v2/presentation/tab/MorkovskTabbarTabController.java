package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.tab;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation.MorkovskTabbarVI;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/tab/MorkovskTabbarTabController;", "", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;", "tabState", "", "onTabShown", "(Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;)V", "onIndicatorAppearanceAnimated", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "lastIndicator", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "LAe/x0;", "", "_animateIndicatorAppearance", "LAe/x0;", "LAe/M0;", "animateIndicatorAppearance", "LAe/M0;", "getAnimateIndicatorAppearance", "()LAe/M0;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarTabController {

    @NotNull
    private final x0<Boolean> _animateIndicatorAppearance;

    @NotNull
    private final M0<Boolean> animateIndicatorAppearance;
    private MorkovskTabbarVI.Tab.Indicator lastIndicator;

    public MorkovskTabbarTabController() {
        x0<Boolean> a11 = O0.a(Boolean.TRUE);
        this._animateIndicatorAppearance = a11;
        this.animateIndicatorAppearance = a11;
    }

    @NotNull
    public final M0<Boolean> getAnimateIndicatorAppearance() {
        return this.animateIndicatorAppearance;
    }

    public final void onIndicatorAppearanceAnimated() {
        this._animateIndicatorAppearance.setValue(Boolean.FALSE);
    }

    public final void onTabShown(@NotNull MorkovskTabbarVI.Tab tabState) {
        Intrinsics.checkNotNullParameter(tabState, "tabState");
        if (Intrinsics.d(this.lastIndicator, tabState.getIndicator())) {
            return;
        }
        this.lastIndicator = tabState.getIndicator();
        this._animateIndicatorAppearance.setValue(Boolean.TRUE);
    }
}
