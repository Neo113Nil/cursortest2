package ru.ozon.app.android.ads.flags;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/flags/AdvBannerV4LoadOptimizationFlag;", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "<init>", "()V", "serviceName", "", "getServiceName", "()Ljava/lang/String;", "featureName", "getFeatureName", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4LoadOptimizationFlag implements FeatureFlag {

    @NotNull
    public static final AdvBannerV4LoadOptimizationFlag INSTANCE = new AdvBannerV4LoadOptimizationFlag();

    @NotNull
    private static final String serviceName = "mobile_catalog";

    @NotNull
    private static final String featureName = "adv_banner_v4_load_optimization_android";

    private AdvBannerV4LoadOptimizationFlag() {
    }

    @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
    @NotNull
    public String getFeatureName() {
        return featureName;
    }

    @Override // ru.ozon.app.android.network.abtool.flag.FeatureFlag
    @NotNull
    public String getServiceName() {
        return serviceName;
    }
}
