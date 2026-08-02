package ru.ozon.app.android.platform.di.module;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/platform/di/module/AndroidPlatformFlagsModule;", "", "<init>", "()V", "provideFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidPlatformFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideFlags() {
        FeatureFlagRegistrationModel[] elements = {FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) CustomBundleSaveEnabled.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Кастомное сохранение бандла в активити", "https://jit.o3.ru/browse/ANDROID-35555", "https://jit.o3.ru/browse/MOB-8807"))), FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) AsyncCustomBundleStateEnabled.INSTANCE, true, FeatureFlagKt.featureFlagDisplayedName("Асинхронное кастомное сохранение бандла в активити", "https://jit.o3.ru/browse/ANDROID-35555", "https://jit.o3.ru/browse/MOB-8807"))), FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) CustomBundleSaveLoggingEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Логгирование ошибок кастомного сохранения бандла", "https://jit.o3.ru/browse/ANDROID-29243", null, 4, null))), new FeatureFlagRegistrationModel((FeatureFlag) CommonReloadPageActionFix.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Фикс экшена reaload page", "https://jit.o3.ru/browse/ANDROID-36874", "https://jit.o3.ru/browse/ANDROID-36874")), new FeatureFlagRegistrationModel((FeatureFlag) ComposerActionWithActionErrorsNewAnchorEnabled.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Новый якорь для отображения ошибок composerActionWithAction", "https://jit.o3.ru/browse/ANDROID-43268", "https://jit.o3.ru/browse/MOB-12214"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
