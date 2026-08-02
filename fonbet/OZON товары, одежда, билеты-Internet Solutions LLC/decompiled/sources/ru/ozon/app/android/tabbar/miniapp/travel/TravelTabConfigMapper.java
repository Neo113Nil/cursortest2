package ru.ozon.app.android.tabbar.miniapp.travel;

import NZ.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigMapper;", "", "tabConfigProvider", "Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigProvider;", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/travel/TravelTabConfigProvider;)V", "map", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "tabConfig", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "mapTabItem", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "item", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelTabConfigMapper {

    @NotNull
    private final TravelTabConfigProvider tabConfigProvider;

    public TravelTabConfigMapper(@NotNull TravelTabConfigProvider tabConfigProvider) {
        Intrinsics.checkNotNullParameter(tabConfigProvider, "tabConfigProvider");
        this.tabConfigProvider = tabConfigProvider;
    }

    private final BottomNavigationItem mapTabItem(TabConfigDTO item) {
        return new BottomNavigationItem(this.tabConfigProvider.getTabId(item.getUrl()), item.getIcon(), item.getTitle(), null, item.getUrl(), null, item.getBehavior(), null, 168, null);
    }

    @NotNull
    public final RemoteTabConfig map(@NotNull TabConfigResponse tabConfig) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        List<TabConfigDTO> tabs = tabConfig.getTabs();
        ArrayList<BottomNavigationItem> arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTabItem((TabConfigDTO) it.next()));
        }
        int h11 = U.h(C7714v.z(arrayList, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (BottomNavigationItem bottomNavigationItem : arrayList) {
            Pair pair = new Pair(Integer.valueOf(bottomNavigationItem.getId()), bottomNavigationItem.getDeeplink());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new RemoteTabConfig(arrayList, MapperActiveTabConfigKt.mapActiveTabConfig$default(tabConfig.getActiveTabConfig(), null, null, 3, null), null, new h(OzonBottomNavigationTabViewExtKt.getMenuId(linkedHashMap, R$id.menu_travel), linkedHashMap), 4, null);
    }
}
