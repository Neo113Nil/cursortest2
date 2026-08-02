package ru.ozon.app.android.warmup.flags.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.warmup.flags.HomeWarmupAdaptersConfigurationFlag;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/warmup/flags/di/WarmupFeatureFlagsModule;", "", "<init>", "()V", "provideWarmupFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "warmup_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WarmupFeatureFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideWarmupFlags() {
        return e0.h(FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel(HomeWarmupAdaptersConfigurationFlag.INSTANCE, C7714v.V(C7714v.b0("addressBookBarV2", "searchBarMobile", "bigPromoCounterNavbar", "premiumPoints", "messengerCounter", "advBanner", "navigationSliderV2", "orderTrackingV4", "advVideoBannerV2", "tileGrid2", "tileScroll"), ",", null, null, null, 62), FeatureFlagKt.featureFlagDisplayedName("Набор айди виджетов для прогрева адаптеров на главной странице", "https://jit.o3.ru/browse/ANDROID-28828", "https://jit.o3.ru/browse/MOB-5011"))));
    }
}
