package ru.ozon.app.android.separator.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;
import ru.ozon.app.android.separator.core.SeparatorHeightIsOptionalFlag;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/separator/di/SeparatorFlagsModule;", "", "<init>", "()V", "provideFlags", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "separator_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeparatorFlagsModule {
    @NotNull
    public final FeatureFlagRegistrationModel provideFlags() {
        return new FeatureFlagRegistrationModel((FeatureFlag) SeparatorHeightIsOptionalFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Опциональность поля params.height для виджета cms.separator", "https://jit.o3.ru/browse/ANDROID-24119", "https://jit.o3.ru/browse/MOB-2611"));
    }
}
