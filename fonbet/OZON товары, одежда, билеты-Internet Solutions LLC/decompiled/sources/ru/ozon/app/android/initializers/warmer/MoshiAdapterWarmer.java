package ru.ozon.app.android.initializers.warmer;

import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/initializers/warmer/MoshiAdapterWarmer;", "", "warmUpJsonAdapters", "", "warmupConfigurationFlags", "", "Lru/ozon/app/android/network/abtool/flag/FeatureFlag;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MoshiAdapterWarmer {
    void warmUpJsonAdapters(@NotNull Set<? extends FeatureFlag> warmupConfigurationFlags);
}
