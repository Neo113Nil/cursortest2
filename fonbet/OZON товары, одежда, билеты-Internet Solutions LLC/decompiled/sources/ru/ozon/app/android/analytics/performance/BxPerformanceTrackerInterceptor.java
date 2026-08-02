package ru.ozon.app.android.analytics.performance;

import Qj0.I;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.flags.BxPerformanceTrackingEnabledFlag;
import ru.ozon.app.android.analytics.flags.FpsHitchFlag;
import ru.ozon.app.android.analytics.flags.ImagePlaceholderTrackingEnabledFlag;
import ru.ozon.app.android.analytics.flags.PerfPagePartTrackingEnabledFlag;
import ru.ozon.app.android.analytics.flags.RumImagesFlag;
import ru.ozon.app.android.composer.flags.RumWidgetsFlag;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.tracker.performance.ObjectTypes;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/analytics/performance/BxPerformanceTrackerInterceptor;", "LQj0/I;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "LQj0/I$a;", "chain", "", "interceptImage", "(LQj0/I$a;)Z", "LQj0/I$b;", "pages", "()LQj0/I$b;", "intercept", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BxPerformanceTrackerInterceptor extends I {

    @NotNull
    private final FeatureChecker featureChecker;
    public static final int $stable = 8;

    public BxPerformanceTrackerInterceptor(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
    }

    private final boolean interceptImage(I.a chain) {
        if (!this.featureChecker.isEnabled(RumImagesFlag.INSTANCE)) {
            return false;
        }
        Object obj = ((HashMap) chain.b()).get("placeholderRate");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null ? bool.booleanValue() : false) {
            return this.featureChecker.isEnabled(ImagePlaceholderTrackingEnabledFlag.INSTANCE);
        }
        return true;
    }

    @Override // Qj0.I
    public boolean intercept(@NotNull I.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        ObjectTypes a11 = chain.a();
        if (!this.featureChecker.isEnabled(BxPerformanceTrackingEnabledFlag.INSTANCE)) {
            return false;
        }
        if (a11 == ObjectTypes.IMAGE) {
            return interceptImage(chain);
        }
        if (a11 == ObjectTypes.PAGE_PART) {
            return this.featureChecker.isEnabled(PerfPagePartTrackingEnabledFlag.INSTANCE);
        }
        if (a11 == ObjectTypes.WIDGET) {
            return this.featureChecker.isEnabled(((HashMap) chain.b()).containsKey("WIDGET_HITCH") ? FpsHitchFlag.INSTANCE : RumWidgetsFlag.INSTANCE);
        }
        if (a11 == ObjectTypes.PAGE_SCROLL) {
            return this.featureChecker.isEnabled(FpsHitchFlag.INSTANCE);
        }
        return true;
    }

    @Override // Qj0.I
    @NotNull
    public I.b pages() {
        I.b bVar;
        bVar = I.b.f23521b;
        return bVar;
    }
}
