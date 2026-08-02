package ru.ozon.app.android.tabbar.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.TabConfigViewModel;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.data.TabConfigRepository;
import ru.ozon.app.android.tabbar.data.local.TabConfigCache;
import ru.ozon.app.android.tabbar.domain.TabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.TravelTabConfigUpdateDelegate;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/tabbar/di/TabsComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "getTabConfigCache", "()Lru/ozon/app/android/tabbar/data/local/TabConfigCache;", "Lru/ozon/app/android/tabbar/TabConfigViewModel;", "getTabConfigViewModel", "()Lru/ozon/app/android/tabbar/TabConfigViewModel;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "getTabConfigManager", "()Lru/ozon/app/android/tabbar/data/TabConfigManager;", "Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "getTabConfigRepository", "()Lru/ozon/app/android/tabbar/data/TabConfigRepository;", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "getTabConfigProvider", "()Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "getTabConfigRequestDelegate", "()Lru/ozon/app/android/tabbar/domain/TabConfigUpdateDelegate;", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "getTabAnalytics", "()Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "getTabbarDeeplinksResolver", "()Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "getTravelTabConfigUpdateDelegate", "()Lru/ozon/app/android/tabbar/domain/TravelTabConfigUpdateDelegate;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TabsComponentApi extends InterfaceC6958a {
    @NotNull
    TabBarAnalytics getTabAnalytics();

    @NotNull
    TabConfigCache getTabConfigCache();

    @NotNull
    TabConfigManager getTabConfigManager();

    @NotNull
    TabConfigProvider getTabConfigProvider();

    @NotNull
    TabConfigRepository getTabConfigRepository();

    @NotNull
    TabConfigUpdateDelegate getTabConfigRequestDelegate();

    @NotNull
    TabConfigViewModel getTabConfigViewModel();

    @NotNull
    TabbarDeeplinksResolver getTabbarDeeplinksResolver();

    @NotNull
    TravelTabConfigUpdateDelegate getTravelTabConfigUpdateDelegate();
}
