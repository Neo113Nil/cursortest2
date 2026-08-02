package ru.ozon.app.android.travel.feature.general.common.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/flags/TravelGeneralFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel(TravelMiniAppStateRestoresFromCacheFlag.INSTANCE, "DISABLED", FeatureFlagKt.featureFlagDisplayedName("Сохранять стейт миниаппа Travel при выходе из него: \nDISABLED – сохранение стейта отключено; \nENABLED_ONLY_FOR_LINKS_WITH_QUERY – включено только для линков с query параметром restoresMiniappState=true; \nENABLED_FOR_LINKS_WITH_QUERY_AND_HOME_PAGE_URL – включено для линков с query параметром restoresMiniappState и \nлинков главной Travel (фф travel_miniapp_state_restores_from_cache_for_segments)", "https://jit.o3.ru/browse/OTMOB-2242", "https://jit.o3.ru/browse/MOB-9992")), new FeatureFlagRegistrationModel(TravelMiniAppStateRestoresFromCacheForSegmentsFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Сохранять стейт миниаппа Travel при выходе из него для сегментов главной. Пример: \"main,mainHotel\" (разделитель - \",\")", "https://jit.o3.ru/browse/OTMOB-2242", "https://jit.o3.ru/browse/MOB-9992")), new FeatureFlagRegistrationModel((FeatureFlag) IsBonusExpirationRemainderComposeEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Отображение виджета travel.bonusExpirationRemainder на Compose", "https://jit.o3.ru/browse/OTMOB-4065", "https://jit.o3.ru/browse/MOB-14208"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
