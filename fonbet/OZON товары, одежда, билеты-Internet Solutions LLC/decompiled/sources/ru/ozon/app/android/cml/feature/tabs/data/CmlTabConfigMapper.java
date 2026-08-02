package ru.ozon.app.android.cml.feature.tabs.data;

import NZ.h;
import PZ.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.feature.tabs.navigation.CmlNavigation;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper;", "", "<init>", "()V", "mapTabConfig", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "response", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "mapTab", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "tabDto", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CmlTabConfigMapper {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Map<String, Integer> deeplinkTabIdProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cml/feature/tabs/data/CmlTabConfigMapper$Companion;", "", "<init>", "()V", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        CmlNavigation cmlNavigation = CmlNavigation.INSTANCE;
        deeplinkTabIdProvider = U.j(new Pair(cmlNavigation.cmlMainTab().toString(), Integer.valueOf(R$id.menu_delivery)), new Pair(cmlNavigation.cmlDeliveryListTab().toString(), Integer.valueOf(R$id.menu_delivery_list)), new Pair(cmlNavigation.cmlMapTab().toString(), Integer.valueOf(R$id.menu_delivery_map)));
    }

    private final BottomNavigationItem mapTab(TabConfigDTO tabDto) {
        String b11 = a.b(tabDto.getUrl(), true);
        Integer num = deeplinkTabIdProvider.get(b11);
        int intValue = num != null ? num.intValue() : b11.hashCode();
        String icon = tabDto.getIcon();
        String title = tabDto.getTitle();
        String url = tabDto.getUrl();
        BottomNavigationBehavior behavior = tabDto.getBehavior();
        TabConfigAnimations animation = tabDto.getAnimation();
        return new BottomNavigationItem(intValue, icon, title, animation != null ? Integer.valueOf(animation.getResId()) : null, url, null, behavior, tabDto.getStaticIndicator(), 32, null);
    }

    @NotNull
    public final RemoteTabConfig mapTabConfig(@NotNull TabConfigResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<TabConfigDTO> tabs = response.getTabs();
        ArrayList<BottomNavigationItem> arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTab((TabConfigDTO) it.next()));
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
        return new RemoteTabConfig(arrayList, MapperActiveTabConfigKt.mapActiveTabConfig$default(response.getActiveTabConfig(), null, null, 3, null), null, new h(OzonBottomNavigationTabViewExtKt.getMenuId(linkedHashMap, R$id.menu_delivery), linkedHashMap), 4, null);
    }
}
