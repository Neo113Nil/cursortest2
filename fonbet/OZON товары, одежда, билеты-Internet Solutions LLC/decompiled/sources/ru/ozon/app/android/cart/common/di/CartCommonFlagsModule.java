package ru.ozon.app.android.cart.common.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.flags.CartEmptyOverlayWidgetEnabled;
import ru.ozon.app.android.cart.common.flags.CartRemoveInvalidSlashFromUrlEnabled;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cart/common/di/CartCommonFlagsModule;", "", "<init>", "()V", "provideCartCommonFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartCommonFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideCartCommonFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) CartRemoveInvalidSlashFromUrlEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Удалять некорректный слеш из URL корзины", "https://jit.o3.ru/browse/ANDROID-34250", "https://jit.o3.ru/browse/MOB-7995")), new FeatureFlagRegistrationModel((FeatureFlag) CartEmptyOverlayWidgetEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Добавлять через MasterWidget дополнительный оверлей виджет чтобы за него цеплялся стики виджет", "https://jit.o3.ru/browse/ANDROID-45150", "https://jit.o3.ru/browse/MOB-14132"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
