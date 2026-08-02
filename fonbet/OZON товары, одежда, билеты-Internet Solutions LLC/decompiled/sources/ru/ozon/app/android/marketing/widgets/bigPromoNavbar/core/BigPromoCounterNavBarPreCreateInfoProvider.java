package ru.ozon.app.android.marketing.widgets.bigPromoNavbar.core;

import android.content.Context;
import gk0.n;
import gk0.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.precreation.PreCreateInfoProvider;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoNavbar/core/BigPromoCounterNavBarPreCreateInfoProvider;", "Lru/ozon/app/android/precreation/PreCreateInfoProvider;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Landroid/content/Context;", "context", "", "Lgk0/n;", "provide", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "widgetId", "Ljava/lang/String;", "getWidgetId", "()Ljava/lang/String;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BigPromoCounterNavBarPreCreateInfoProvider implements PreCreateInfoProvider {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final String widgetId;

    public BigPromoCounterNavBarPreCreateInfoProvider(@NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.featureChecker = featureChecker;
        this.widgetId = "bigPromoCounterNavbar";
    }

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public String getWidgetId() {
        return this.widgetId;
    }

    @Override // ru.ozon.app.android.precreation.PreCreateInfoProvider
    @NotNull
    public List<n> provide(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new p(1, new BigPromoCounterNavBarPreCreateInfoProvider$provide$1(this, context)));
    }
}
