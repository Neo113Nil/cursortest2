package ru.ozon.app.android.common.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/flags/PrefetchFlagsModule;", "", "<init>", "()V", "providePrefetchFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrefetchFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> providePrefetchFlags() {
        FeatureFlagRegistrationModel[] elements = {FeatureFlagKt.asPerProcess(new FeatureFlagRegistrationModel((FeatureFlag) CancelPrefetchedSearchCallsFlag.INSTANCE, false, FeatureFlagKt.featureFlagDisplayedName("Отмена префетч запросов серча", "https://jit.o3.ru/browse/ANDROID-30080", "https://jit.o3.ru/browse/MOB-5097"))), new FeatureFlagRegistrationModel(SearchIgnoredQueryParams.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список квери параметров для игнорирования в dialogSearch", "https://jit.o3.ru/browse/ANDROID-43935", "https://jit.o3.ru/browse/MOB-12806"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
