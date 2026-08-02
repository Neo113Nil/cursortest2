package ru.ozon.app.android.tabbar.data;

import io.reactivex.p;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.domain.event.TabUpdateCompleteEvent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/tabbar/data/TabConfigManager;", "", "Lio/reactivex/p;", "Lru/ozon/app/android/tabbar/domain/event/TabUpdateCompleteEvent;", "observeTabConfigChanged", "()Lio/reactivex/p;", "", "miniAppName", "Lru/ozon/app/android/tabbar/data/TabConfig;", "getInMemoryCachedConfig", "(Ljava/lang/String;)Lru/ozon/app/android/tabbar/data/TabConfig;", "getDefaultConfig", "()Lru/ozon/app/android/tabbar/data/TabConfig;", "", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "getCachedConfigs", "()Ljava/util/List;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TabConfigManager {
    @NotNull
    List<RemoteTabConfig> getCachedConfigs();

    @NotNull
    TabConfig getDefaultConfig();

    TabConfig getInMemoryCachedConfig(@NotNull String miniAppName);

    @NotNull
    p<TabUpdateCompleteEvent> observeTabConfigChanged();
}
