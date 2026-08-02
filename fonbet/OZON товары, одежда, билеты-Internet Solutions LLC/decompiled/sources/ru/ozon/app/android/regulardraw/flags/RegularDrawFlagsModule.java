package ru.ozon.app.android.regulardraw.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/regulardraw/flags/RegularDrawFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegularDrawFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) ModalMenuComposeFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("compose regulardraw.modalMenu.v1", "https://jit.o3.ru/browse/ANDROID-41171", "https://jit.o3.ru/browse/MOB-11648")), new FeatureFlagRegistrationModel((FeatureFlag) DailyRewardsComposeFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("compose regulardraw.dailyRewards.v1", "https://jit.o3.ru/browse/ANDROID-43501", "https://jit.o3.ru/browse/MOB-11371")), new FeatureFlagRegistrationModel((FeatureFlag) MegaSkipFirstOnboardingEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Скрывает первый онбординг нового пользователя при входе в Морковск (для QA)", "https://jit.o3.ru/browse/ANDROID-40531", "https://jit.o3.ru/browse/MOB-10731"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
