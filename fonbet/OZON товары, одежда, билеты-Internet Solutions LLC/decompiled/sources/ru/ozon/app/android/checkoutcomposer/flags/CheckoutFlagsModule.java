package ru.ozon.app.android.checkoutcomposer.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/flags/CheckoutFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) CheckoutPrefetchBigFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Префетч чекаута в big ozon", "https://jit.o3.ru/browse/ANDROID-25969", "https://jit.o3.ru/browse/MOB-3195")), new FeatureFlagRegistrationModel(CheckoutPrefetchUrlWhitelistFlag.INSTANCE, "gocheckout", FeatureFlagKt.featureFlagDisplayedName("Белый список url для предзагрузки чекаута", "https://jit.o3.ru/browse/ANDROID-25971", "https://jit.o3.ru/browse/MOB-3195")), new FeatureFlagRegistrationModel((FeatureFlag) CheckoutPrefetchFreshFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Префетч чекаута в fresh", "https://jit.o3.ru/browse/ANDROID-25969", "https://jit.o3.ru/browse/MOB-3195")), new FeatureFlagRegistrationModel((FeatureFlag) CheckoutRoundedSplitsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Скругление виджетов сплитов в чекауте", "https://jit.o3.ru/browse/ANDROID-26716", "https://jit.o3.ru/browse/MOB-3765")), new FeatureFlagRegistrationModel((FeatureFlag) RfbsSplitMultiFrameBindingEnabledFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Использовать MultiframeBinding для отрисовки виджета rfbsSplit", "https://jit.o3.ru/browse/ANDROID-28627", "https://jit.o3.ru/browse/MOB-4357")), new FeatureFlagRegistrationModel((FeatureFlag) CheckoutPrefetchWithJoinEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Склеивание запросов при префетче чекаута", "https://jit.o3.ru/browse/ANDROID-32911", "https://jit.o3.ru/browse/MOB-7480")), new FeatureFlagRegistrationModel((FeatureFlag) CheckoutSplitComposeUiEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Отображение подвижетов в спите на compose", "https://jit.o3.ru/browse/ANDROID-46201", "https://jit.o3.ru/browse/MOB-14282"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
