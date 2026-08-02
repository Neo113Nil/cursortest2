package ru.ozon.app.android.mapcommon.map.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/mapcommon/map/flags/MapFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MapFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) MapShouldBeHideFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Скрытие карты для QA", "https://jit.o3.ru/browse/ANDROID-28439", "https://jit.o3.ru/browse/MOB-4828")), new FeatureFlagRegistrationModel((FeatureFlag) InexactSuggestClickFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Обновленная логика клика на саджест адреса", "https://jit.o3.ru/browse/ANDROID-22011", "https://jit.o3.ru/browse/MOB-496")), new FeatureFlagRegistrationModel((FeatureFlag) CacheGeoProviderFlag.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Кэширование гео-провайдера для карт", "https://jit.o3.ru/browse/ANDROID-27550", "https://jit.o3.ru/browse/MOB-3918")), new FeatureFlagRegistrationModel((FeatureFlag) SystemPermissionWindowTimeFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Учитывание времени системной плашки с запросом разрешения на геолокацию в тотал тайме", "https://jit.o3.ru/browse/ANDROID-37405", "https://jit.o3.ru/browse/MOB-9620")), new FeatureFlagRegistrationModel((FeatureFlag) SendMapsMetricsWithRequestIdFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Отправлять RequestID в метриках карт", "https://jit.o3.ru/browse/ANDROID-41891", "https://jit.o3.ru/browse/MOB-10850"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
