package ru.ozon.app.android.common.actionHandlers.flags;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagKt;
import ru.ozon.app.android.network.abtool.flag.FeatureFlagRegistrationModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/common/actionHandlers/flags/CommonActionHandlersFlagsModule;", "", "<init>", "()V", "providePrefetchFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlagRegistrationModel;", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonActionHandlersFlagsModule {
    @NotNull
    public final Set<FeatureFlagRegistrationModel> providePrefetchFlags() {
        FeatureFlagRegistrationModel[] elements = {new FeatureFlagRegistrationModel(PageTypesWithSaveFiltersEnabled.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список страниц, для которых нужно сохранять зажатые фильтры", "https://jit.o3.ru/browse/ANDROID-41753", "https://jit.o3.ru/browse/MOB-11456")), new FeatureFlagRegistrationModel(SaveFiltersEnabled.INSTANCE, "", FeatureFlagKt.featureFlagDisplayedName("Список фильтров, которые нужно сохранять", "https://jit.o3.ru/browse/ANDROID-41753", "https://jit.o3.ru/browse/MOB-11456"))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
