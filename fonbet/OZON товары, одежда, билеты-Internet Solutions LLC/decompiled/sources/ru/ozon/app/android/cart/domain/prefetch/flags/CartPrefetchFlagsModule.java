package ru.ozon.app.android.cart.domain.prefetch.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/domain/prefetch/flags/CartPrefetchFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartPrefetchFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) CartPrefetchAppStartFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Префетч на старте приложения", "https://jit.o3.ru/browse/ANDROID-25118", "https://jit.o3.ru/browse/MOB-3194")), new FeatureFlagRegistrationModel(CartPrefetchOnAddToCartForMiniAppWhiteListFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Префетч на добавление в корзину в указанных миниаппах", "https://jit.o3.ru/browse/ANDROID-32741", "https://jit.o3.ru/browse/MOB-6812")), new FeatureFlagRegistrationModel(CartPrefetchOnChangeMiniAppWhiteListFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Префетч на загрузку корзины при переходе в указанных миниаппах", "https://jit.o3.ru/browse/ANDROID-32741", "https://jit.o3.ru/browse/MOB-6812")), new FeatureFlagRegistrationModel((FeatureFlag) CartPrefetchOnOrderDoneFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Префетч на загрузку корзины после оплаты в чекауте", "https://jit.o3.ru/browse/ANDROID-25118", "https://jit.o3.ru/browse/MOB-3194")), new FeatureFlagRegistrationModel(CartCacheIgnoredQueryParamsFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список игнорируемых query параметров при кешировании запросов корзины", "https://jit.o3.ru/browse/ANDROID-32012", "https://jit.o3.ru/browse/MOB-6858")), new FeatureFlagRegistrationModel((FeatureFlag) CartPrefetchWithJoinEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Склеивание запросов при префетче корзины", "https://jit.o3.ru/browse/ANDROID-32910", "https://jit.o3.ru/browse/MOB-7478")), new FeatureFlagRegistrationModel((FeatureFlag) CartRemoveExtraCacheRemovalFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Убрать лишние операции удаления кеша корзины", "https://jit.o3.ru/browse/ANDROID-36341", "https://jit.o3.ru/browse/MOB-9208")), new FeatureFlagRegistrationModel((FeatureFlag) CartAdditionalPrefetchOnInvalidateCache.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Доп. места префетча при инвалидации кеша корзины", "https://jit.o3.ru/browse/ANDROID-36342", "https://jit.o3.ru/browse/MOB-9208")), new FeatureFlagRegistrationModel((FeatureFlag) CartPrefetchOnCartSynced.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Префетч при синхронизации корзины (summary)", "https://jit.o3.ru/browse/ANDROID-36342", "https://jit.o3.ru/browse/MOB-9208")), new FeatureFlagRegistrationModel((FeatureFlag) SendPclPagePerformanceEventEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Трек аналитики кэширования", "https://jit.o3.ru/browse/ANDROID-43512", "https://jit.o3.ru/browse/MOB-12798"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
