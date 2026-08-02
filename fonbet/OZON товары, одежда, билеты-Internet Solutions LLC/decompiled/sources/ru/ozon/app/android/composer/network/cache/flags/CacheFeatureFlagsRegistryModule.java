package ru.ozon.app.android.composer.network.cache.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/composer/network/cache/flags/CacheFeatureFlagsRegistryModule;", "", "<init>", "()V", "provideRegistrationModels", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheFeatureFlagsRegistryModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> provideRegistrationModels() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel((FeatureFlag) LogCanceledRequestFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Логирует ошибки записи в кэш из-за отмены запроса", "https://jit.o3.ru/browse/ANDROID-31233", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) LogManualRemoveFromCacheFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Логирует запросы, чьи кэши которые были удалены вручную", "https://jit.o3.ru/browse/ANDROID-31233", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) CheckCacheDelayMillisFlag.INSTANCE, -1, FeatureFlagKt.featureFlagDisplayedName$default("Задержка перед проверкой записи запроса в кэш", "https://jit.o3.ru/browse/ANDROID-30902", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) CatchRequestErrorsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName$default("Отлавливает ошибки сетевых запросов", "https://jit.o3.ru/browse/ANDROID-30902", null, 4, null)), new FeatureFlagRegistrationModel((FeatureFlag) AdaptUrlInterceptorsBeforeCacheFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Изменен порядок интерсепторов: интерсепторы адаптации урла вызываются раньше интерсепторов попадания в кэш", "https://jit.o3.ru/browse/ANDROID-45273", "https://jit.o3.ru/browse/MOB-13802"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
