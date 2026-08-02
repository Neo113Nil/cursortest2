package ru.ozon.app.android.fintech.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fintech/flags/FintechFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "fintech-flags_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel(FintechWebViewPauserFlag.INSTANCE, false, null, 4, null), new FeatureFlagRegistrationModel((FeatureFlag) FintechAssetLoadFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Прогрев финтех вебвьюихи", "https://jit.o3.ru/browse/ANDROID-25568", "https://jit.o3.ru/browse/MOB-3274")), new FeatureFlagRegistrationModel((FeatureFlag) FintechLibTabsPayment.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Открывать опалату в табах", "https://jit.o3.ru/browse/ANDROID-28136", "https://jit.o3.ru/browse/MOB-4684")), new FeatureFlagRegistrationModel((FeatureFlag) FintechLibPay.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Открывать чекаут", "https://jit.o3.ru/browse/IOS-32460", "https://jit.o3.ru/browse/MOB-9803")), new FeatureFlagRegistrationModel((FeatureFlag) FintechUseEsk.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Использовать ЕСК из limb", "https://jit.o3.ru/browse/ANDROID-45986", "https://jit.o3.ru/browse/MOB-14174"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
