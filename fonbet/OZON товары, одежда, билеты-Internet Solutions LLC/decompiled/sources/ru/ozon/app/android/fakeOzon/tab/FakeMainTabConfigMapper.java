package ru.ozon.app.android.fakeOzon.tab;

import NZ.h;
import android.net.Uri;
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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fakeOzon/tab/FakeMainTabConfigMapper;", "", "tabConfigProvider", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "<init>", "(Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;)V", "mapTabConfig", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "response", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "isFirstRemoteLoading", "", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;Ljava/lang/Boolean;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "mapTabs", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", DynamicElementDTO.TABS, "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "mapTab", "tabDto", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeMainTabConfigMapper {

    @NotNull
    private final TabConfigProvider tabConfigProvider;

    public FakeMainTabConfigMapper(@NotNull TabConfigProvider tabConfigProvider) {
        Intrinsics.checkNotNullParameter(tabConfigProvider, "tabConfigProvider");
        this.tabConfigProvider = tabConfigProvider;
    }

    private final BottomNavigationItem mapTab(TabConfigDTO tabDto) {
        String uri = Uri.parse(tabDto.getUrl()).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Integer num = this.tabConfigProvider.getTabDeeplinks().get(uri);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        String icon = tabDto.getIcon();
        String title = tabDto.getTitle();
        String url = tabDto.getUrl();
        BottomNavigationBehavior behavior = tabDto.getBehavior();
        TabConfigAnimations animation = tabDto.getAnimation();
        return new BottomNavigationItem(intValue, icon, title, animation != null ? Integer.valueOf(animation.getResId()) : null, url, null, behavior, tabDto.getStaticIndicator(), 32, null);
    }

    private final List<BottomNavigationItem> mapTabs(List<TabConfigDTO> tabs) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            BottomNavigationItem mapTab = mapTab((TabConfigDTO) it.next());
            if (mapTab != null) {
                arrayList.add(mapTab);
            }
        }
        return arrayList;
    }

    @NotNull
    public final RemoteTabConfig mapTabConfig(@NotNull TabConfigResponse response, Boolean isFirstRemoteLoading) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<BottomNavigationItem> mapTabs = mapTabs(response.getTabs());
        int h11 = U.h(C7714v.z(mapTabs, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (BottomNavigationItem bottomNavigationItem : mapTabs) {
            Pair pair = new Pair(Integer.valueOf(bottomNavigationItem.getId()), bottomNavigationItem.getDeeplink());
            linkedHashMap.put(pair.e(), pair.f());
        }
        ArrayList arrayList = new ArrayList(C7714v.z(mapTabs, 10));
        for (BottomNavigationItem bottomNavigationItem2 : mapTabs) {
            if (Intrinsics.d(isFirstRemoteLoading, Boolean.FALSE)) {
                bottomNavigationItem2 = BottomNavigationItem.copy$default(bottomNavigationItem2, 0, null, null, null, null, null, null, null, 247, null);
            }
            arrayList.add(bottomNavigationItem2);
        }
        return new RemoteTabConfig(arrayList, MapperActiveTabConfigKt.mapActiveTabConfig$default(response.getActiveTabConfig(), null, null, 3, null), null, new h(OzonBottomNavigationTabViewExtKt.getMenuId(linkedHashMap, R$id.menu_main), linkedHashMap), 4, null);
    }
}
