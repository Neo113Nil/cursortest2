package ru.ozon.app.android.cart.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/flags/CartFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel(CartWarmupAdaptersConfigurationFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список id виджетов для прогрева адаптеров для страницы корзина", "https://jit.o3.ru/browse/ANDROID-33833", "https://jit.o3.ru/browse/MOB-7938")), new FeatureFlagRegistrationModel(BackToCartByRedirectRefreshDisabledQueriesList.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список Query параметров, при которых которых не нужно рефрешить корзину при редиректе на нее", "https://jit.o3.ru/browse/ANDROID-34250", "https://jit.o3.ru/browse/MOB-7995")), new FeatureFlagRegistrationModel((FeatureFlag) CartHideRecomsBoBackButtonFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Скрытие кнопки назад на странице рекомендаций между корзиной БО и чекаутом", "https://jit.o3.ru/browse/ANDROID-34184", "https://jit.o3.ru/browse/MOB-7997")), new FeatureFlagRegistrationModel((FeatureFlag) CartScreenStateNewLogic.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Новая логика для определения, открыт ли экран корзины", "https://jit.o3.ru/browse/ANDROID-36342", "https://jit.o3.ru/browse/MOB-9208")), new FeatureFlagRegistrationModel((FeatureFlag) CartBigOzonItemsAtFreshMiniapp.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Логирование товаров БО в миниаппе фреша", "https://jit.o3.ru/browse/ANDROID-38486", "https://jit.o3.ru/browse/MOB-8055")), new FeatureFlagRegistrationModel((FeatureFlag) CartSwipeOnboardingEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Показ онбординга фичи свайпа сплитов", "https://jit.o3.ru/browse/ANDROID-40677", "https://jit.o3.ru/browse/MOB-10823")), new FeatureFlagRegistrationModel((FeatureFlag) CartInstallmentComposeUiEnabler.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Compose UI для виджета cart.installment", "https://jit.o3.ru/browse/ANDROID-42606", "https://jit.o3.ru/browse/MOB-11343"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
