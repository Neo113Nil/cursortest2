package ru.ozon.app.android.tabbar.ui.helper;

import GZ.j;
import GZ.k;
import HZ.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigManager;
import ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver;
import ru.ozon.app.android.tabbar.ui.TabsSource;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/tabbar/ui/helper/TabbarDeeplinksResolverImpl;", "Lru/ozon/app/android/tabbar/ui/TabbarDeeplinksResolver;", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "tabConfigManager", "LGZ/k;", "routeFactory", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(Lru/ozon/app/android/tabbar/data/TabConfigManager;LGZ/k;LHZ/a;)V", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "tabsItems", "", "resolveDeeplinkHandlersForTabs", "(Ljava/util/List;)V", "Lru/ozon/app/android/tabbar/ui/TabsSource;", "tabSource", "(Lru/ozon/app/android/tabbar/ui/TabsSource;)V", "Lru/ozon/app/android/tabbar/data/TabConfigManager;", "LGZ/k;", "LHZ/a;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabbarDeeplinksResolverImpl implements TabbarDeeplinksResolver {

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final k routeFactory;

    @NotNull
    private final TabConfigManager tabConfigManager;

    public TabbarDeeplinksResolverImpl(@NotNull TabConfigManager tabConfigManager, @NotNull k routeFactory, @NotNull a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(tabConfigManager, "tabConfigManager");
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.tabConfigManager = tabConfigManager;
        this.routeFactory = routeFactory;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
    }

    @Override // ru.ozon.app.android.tabbar.ui.TabbarDeeplinksResolver
    public void resolveDeeplinkHandlersForTabs(@NotNull TabsSource tabSource) {
        List<BottomNavigationItem> list;
        Intrinsics.checkNotNullParameter(tabSource, "tabSource");
        if (tabSource instanceof TabsSource.Items) {
            list = ((TabsSource.Items) tabSource).getItems();
        } else {
            List<RemoteTabConfig> cachedConfigs = this.tabConfigManager.getCachedConfigs();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = cachedConfigs.iterator();
            while (it.hasNext()) {
                C7714v.p(((RemoteTabConfig) it.next()).getTabItems(), arrayList);
            }
            list = arrayList;
        }
        resolveDeeplinkHandlersForTabs(list);
    }

    private final void resolveDeeplinkHandlersForTabs(List<BottomNavigationItem> tabsItems) {
        if (tabsItems.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BottomNavigationItem bottomNavigationItem : tabsItems) {
            TabbarDeeplinkHandler tabbarDeeplinkHandler = null;
            j b11 = k.b(this.routeFactory, bottomNavigationItem.getDeeplink(), null, 6);
            if (b11 != null && this.deeplinkHandlersCache.b(b11) == null) {
                tabbarDeeplinkHandler = new TabbarDeeplinkHandler(b11.b(), bottomNavigationItem.getId(), bottomNavigationItem.getBehavior());
            }
            if (tabbarDeeplinkHandler != null) {
                arrayList.add(tabbarDeeplinkHandler);
            }
        }
        this.deeplinkHandlersCache.a(C7714v.Y0(arrayList));
    }
}
