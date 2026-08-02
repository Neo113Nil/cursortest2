package ru.ozon.app.android.ugc.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/flags/UgcFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "provideFlags$ugc_prodGoogleAllVendorsRelease", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags$ugc_prodGoogleAllVendorsRelease() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) TitleSubtitleV2ComposeWidgetEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Compose виджет rpProduct.titleSubtitle.v2", "https://jit.o3.ru/browse/ANDROID-43079", "https://jit.o3.ru/browse/MOB-12174")), new FeatureFlagRegistrationModel((FeatureFlag) ReviewFormTransitionFixEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Бесшовный переход между страницами создания/редактирования отзыва и чейнами", "https://jit.o3.ru/browse/ANDROID-45090", "https://jit.o3.ru/browse/MOB-13465")), new FeatureFlagRegistrationModel((FeatureFlag) RateItemsRefreshDisabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Возможность включения или отключения рефреша в шторе rateItemsV2", "https://jit.o3.ru/browse/ANDROID-45689", "https://jit.o3.ru/browse/MOB-13945")), new FeatureFlagRegistrationModel((FeatureFlag) RateItemsClearStateOnAppRestartEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Очистка dismiss состояния в шторе rateItemsV2 при перезапуске приложения", "https://jit.o3.ru/browse/ANDROID-46128", "https://jit.o3.ru/browse/MOB-14204")), new FeatureFlagRegistrationModel((FeatureFlag) RateItemsClearDismissTimeoutHours.INSTANCE, 0, FeatureFlagKt.featureFlagDisplayedName("Очистка dismiss состояния в шторе rateItemsV2 по таймауту", "https://jit.o3.ru/browse/ANDROID-46128", "https://jit.o3.ru/browse/MOB-14204"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
