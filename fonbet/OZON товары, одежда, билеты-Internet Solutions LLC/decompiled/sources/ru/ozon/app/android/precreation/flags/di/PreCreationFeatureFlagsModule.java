package ru.ozon.app.android.precreation.flags.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.precreation.flags.HomePreCreateWidgetsNewConfigurationFlag;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/precreation/flags/di/PreCreationFeatureFlagsModule;", "", "<init>", "()V", "providePreCreationFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "precreation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreCreationFeatureFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> providePreCreationFlags() {
        return e0.h(FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel(HomePreCreateWidgetsNewConfigurationFlag.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Набор айди виджетов для предсоздания на главной странице", "https://jit.o3.ru/browse/ANDROID-27841", "https://jit.o3.ru/browse/MOB-4481"))));
    }
}
