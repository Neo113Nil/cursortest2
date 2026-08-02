package ru.ozon.app.android.seller.presentation;

import GZ.j;
import GZ.k;
import HZ.a;
import NZ.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerScreenStateCorrector;", "", "LGZ/k;", "routeFactory", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(LGZ/k;LHZ/a;)V", "", "deeplink", "LIZ/a;", "getDeeplinkHandler", "(Ljava/lang/String;)LIZ/a;", "", "", "actualConfig", "()Ljava/util/Map;", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "config", "initialTabIndex", "launchDeeplink", "", "shouldCorrectState", "(Lru/ozon/app/android/tabbar/data/RemoteTabConfig;ILjava/lang/String;)Z", "correctState", "(Lru/ozon/app/android/tabbar/data/RemoteTabConfig;ILjava/lang/String;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "LGZ/k;", "LHZ/a;", "", "actualPathConfig", "Ljava/util/Map;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerScreenStateCorrector {

    @NotNull
    private final Map<String, Integer> actualPathConfig;

    @NotNull
    private final a deeplinkHandlersCache;

    @NotNull
    private final k routeFactory;

    public SellerScreenStateCorrector(@NotNull k routeFactory, @NotNull a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(routeFactory, "routeFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.routeFactory = routeFactory;
        this.deeplinkHandlersCache = deeplinkHandlersCache;
        this.actualPathConfig = new LinkedHashMap();
    }

    private final IZ.a getDeeplinkHandler(String deeplink) {
        j b11;
        if (deeplink == null || (b11 = k.b(this.routeFactory, deeplink, null, 6)) == null) {
            return null;
        }
        return this.deeplinkHandlersCache.b(b11);
    }

    public final Map<String, Integer> actualConfig() {
        Map<String, Integer> map = this.actualPathConfig;
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    @NotNull
    public final RemoteTabConfig correctState(@NotNull RemoteTabConfig config, int initialTabIndex, @NotNull String launchDeeplink) {
        Iterator it;
        ArrayList arrayList;
        int i11;
        Intrinsics.checkNotNullParameter(config, "config");
        String launchDeeplink2 = launchDeeplink;
        Intrinsics.checkNotNullParameter(launchDeeplink2, "launchDeeplink");
        for (Map.Entry<Integer, String> entry : config.getTabNavigatorConfig().b().entrySet()) {
            this.actualPathConfig.put(PZ.a.b(entry.getValue(), true), entry.getKey());
        }
        List<BottomNavigationItem> tabItems = config.getTabItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(tabItems, 10));
        Iterator it2 = tabItems.iterator();
        int i12 = 0;
        int i13 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                C7714v.O0();
                throw null;
            }
            BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) next;
            if (i13 == initialTabIndex) {
                it = it2;
                i11 = i12;
                arrayList = arrayList2;
                bottomNavigationItem = BottomNavigationItem.copy$default(bottomNavigationItem, 0, null, null, null, launchDeeplink2, null, null, null, 239, null);
            } else {
                it = it2;
                arrayList = arrayList2;
                i11 = i12;
            }
            arrayList.add(bottomNavigationItem);
            launchDeeplink2 = launchDeeplink;
            i12 = i11;
            arrayList2 = arrayList;
            i13 = i14;
            it2 = it;
        }
        ArrayList arrayList3 = arrayList2;
        int i15 = i12;
        h tabNavigatorConfig = config.getTabNavigatorConfig();
        Map<Integer, String> b11 = config.getTabNavigatorConfig().b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.h(b11.size()));
        Iterator<T> it3 = b11.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it3.next();
            linkedHashMap.put(entry2.getKey(), ((Number) entry2.getKey()).intValue() == config.getTabItems().get(initialTabIndex).getId() ? launchDeeplink : (String) entry2.getValue());
        }
        return RemoteTabConfig.copy$default(config, arrayList3, null, null, h.a(tabNavigatorConfig, i15, linkedHashMap, 1), 6, null);
    }

    public final boolean shouldCorrectState(@NotNull RemoteTabConfig config, int initialTabIndex, @NotNull String launchDeeplink) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(launchDeeplink, "launchDeeplink");
        IZ.a deeplinkHandler = getDeeplinkHandler(launchDeeplink);
        IZ.a deeplinkHandler2 = getDeeplinkHandler(config.getTabItems().get(initialTabIndex).getDeeplink());
        return Intrinsics.d(deeplinkHandler != null ? deeplinkHandler.getClass() : null, deeplinkHandler2 != null ? deeplinkHandler2.getClass() : null);
    }
}
