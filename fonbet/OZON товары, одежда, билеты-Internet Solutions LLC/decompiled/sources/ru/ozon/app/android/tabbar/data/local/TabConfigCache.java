package ru.ozon.app.android.tabbar.data.local;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000b0\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u000bH&¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "getConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "config", "", "saveConfig", "(Ljava/lang/String;Lru/ozon/app/android/tabbar/data/TabConfigResponse;)V", "", "retrieveInMemoryCacheTabConfigs", "()Ljava/util/Map;", "Lio/reactivex/y;", "retrieveCacheTabConfigs", "()Lio/reactivex/y;", "getCachedTabConfigs", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TabConfigCache {
    @NotNull
    Map<String, TabConfigResponse> getCachedTabConfigs();

    TabConfigResponse getConfig(@NotNull String name);

    @NotNull
    y<Map<String, TabConfigResponse>> retrieveCacheTabConfigs();

    Map<String, TabConfigResponse> retrieveInMemoryCacheTabConfigs();

    void saveConfig(@NotNull String name, @NotNull TabConfigResponse config);
}
