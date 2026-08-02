package ru.ozon.app.android.domain.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.network.flags.ApiSubdomainFlag;
import ru.ozon.app.android.storage.environment.EnvironmentService;
import ru.ozon.app.android.tabbar.flags.FreshFavInTabbarVisibleFlag;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollApparelPageListFlag;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollFreshPageListFlag;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollMainPageListFlag;
import ru.ozon.app.android.tabbar.flags.HideTabBarOnScrollTravelPageListFlag;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/domain/flags/TilesFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "environmentService", "Lru/ozon/app/android/storage/environment/EnvironmentService;", "flags_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TilesFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags(@NotNull EnvironmentService environmentService) {
        Intrinsics.checkNotNullParameter(environmentService, "environmentService");
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel(HideTabBarOnScrollMainPageListFlag.INSTANCE, "category,search,cart,review,social,selections,dialog_search", FeatureFlagKt.featureFlagDisplayedName("Скрытие таббара при скролле в БО", "https://jit.o3.ru/browse/ANDROID-26884", "https://jit.o3.ru/browse/MOB-3758")), new FeatureFlagRegistrationModel(HideTabBarOnScrollApparelPageListFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Скрытие таббара при скролле в миниаппе Аппарели (Фейшен)", "https://jit.o3.ru/browse/ANDROID-34341", "https://jit.o3.ru/browse/MOB-7703")), new FeatureFlagRegistrationModel(HideTabBarOnScrollTravelPageListFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Скрытие таббара при скролле в миниаппе Тревела", "https://jit.o3.ru/browse/ANDROID-34341", "https://jit.o3.ru/browse/MOB-7703")), new FeatureFlagRegistrationModel(HideTabBarOnScrollFreshPageListFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Скрытие таббара при скролле в миниаппе Фреша", "https://jit.o3.ru/browse/ANDROID-34341", "https://jit.o3.ru/browse/MOB-7703")), new FeatureFlagRegistrationModel((FeatureFlag) FreshFavInTabbarVisibleFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Фреш без таба Избранное", "https://jit.o3.ru/browse/ANDROID-31449", "https://jit.o3.ru/browse/MOB-6576")), new FeatureFlagRegistrationModel(AccountTabIndicatorStringFlag.INSTANCE, "DISABLED", FeatureFlagKt.featureFlagDisplayedName("Включает красный индикатор на ЛК, штору \"ozon://login при клике на ЛК\"", "https://jit.o3.ru/browse/ANDROID-36795", "https://jit.o3.ru/browse/MOB-8253")), FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) InAppPushSdkEnabledFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Включение InAppPush sdk", "https://jit.o3.ru/browse/ANDROID-37889", "https://jit.o3.ru/browse/MOB-9115"))), new FeatureFlagRegistrationModel((FeatureFlag) DoubleHomeInstanceLoggingEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Логирует событие, когда одновременно открыты два экрана Home", "https://jit.o3.ru/browse/ANDROID-43672", null, 4, null)), new FeatureFlagRegistrationModel(ApiSubdomainFlag.INSTANCE, environmentService.isProd() ? "api" : "api-stg", FeatureFlagKt.featureFlagDisplayedName("Возможность изменения апи сервера с бека", "https://jit.ozon.ru/browse/ANDROID-17416", "https://jit.ozon.ru/browse/BX-8837"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
