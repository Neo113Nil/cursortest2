package ru.ozon.app.android.tabbar.domain.mapper;

import NZ.h;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.storefrontcommonwidgets.services.TeensModeService;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.domain.provider.TabConfigProvider;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\f\u0010\u0019\u001a\u00020\n*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/tabbar/domain/mapper/TabConfigMapper;", "", "tabConfigProvider", "Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;", "teensModeService", "Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;", "<init>", "(Lru/ozon/app/android/tabbar/domain/provider/TabConfigProvider;Lru/ozon/app/android/storefrontcommonwidgets/services/TeensModeService;)V", "customIconsMap", "", "", "mapTabConfig", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "response", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "isFirstRemoteLoading", "", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;Ljava/lang/Boolean;)Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "mapTabs", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", DynamicElementDTO.TABS, "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "mapTab", "tabDto", "mapCustomIconIfNeeded", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabConfigMapper {

    @NotNull
    private final Map<String, String> customIconsMap;

    @NotNull
    private final TabConfigProvider tabConfigProvider;

    @NotNull
    private final TeensModeService teensModeService;

    public TabConfigMapper(@NotNull TabConfigProvider tabConfigProvider, @NotNull TeensModeService teensModeService) {
        Intrinsics.checkNotNullParameter(tabConfigProvider, "tabConfigProvider");
        Intrinsics.checkNotNullParameter(teensModeService, "teensModeService");
        this.tabConfigProvider = tabConfigProvider;
        this.teensModeService = teensModeService;
        this.customIconsMap = U.j(new Pair("ic_m_teen_tabbar_home", "menu_teen_home_selector"), new Pair("ic_m_teen_tabbar_home_increased", "menu_teen_home_increased_selector"), new Pair("ic_m_teen_tabbar_similar_product_filled", "menu_teen_swipes_selector"), new Pair("ic_m_teen_tabbar_similar_product_filled_increased", "menu_teen_swipes_increased_selector"), new Pair("ic_m_teen_tabbar_favourite", "menu_teen_favs_selector"), new Pair("ic_m_teen_tabbar_favourite_increased", "menu_teen_favs_increased_selector"), new Pair("ic_m_teen_tabbar_cart", "menu_teen_cart_selector"), new Pair("ic_m_teen_tabbar_cart_increased", "menu_teen_cart_increased_selector"), new Pair("ic_m_teen_tabbar_profile", "menu_teen_profile_selector"), new Pair("ic_m_teen_tabbar_profile_increased", "menu_teen_profile_increased_selector"));
    }

    private final String mapCustomIconIfNeeded(String str) {
        String str2 = this.customIconsMap.get(str);
        return str2 == null ? str : str2;
    }

    private final BottomNavigationItem mapTab(TabConfigDTO tabDto) {
        String uri = Uri.parse(tabDto.getUrl()).buildUpon().clearQuery().build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Integer num = this.tabConfigProvider.getTabDeeplinks().get(uri);
        int intValue = num != null ? num.intValue() : uri.hashCode();
        String mapCustomIconIfNeeded = mapCustomIconIfNeeded(tabDto.getIcon());
        String title = tabDto.getTitle();
        String url = tabDto.getUrl();
        String longTapLink = tabDto.getLongTapLink();
        BottomNavigationBehavior behavior = tabDto.getBehavior();
        TabConfigAnimations animation = tabDto.getAnimation();
        return new BottomNavigationItem(intValue, mapCustomIconIfNeeded, title, animation != null ? Integer.valueOf(animation.getResId()) : null, url, longTapLink, behavior, tabDto.getStaticIndicator());
    }

    private final List<BottomNavigationItem> mapTabs(List<TabConfigDTO> tabs) {
        List<TabConfigDTO> list = tabs;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTab((TabConfigDTO) it.next()));
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
        return new RemoteTabConfig(arrayList, MapperActiveTabConfigKt.mapActiveTabConfig$default(response.getActiveTabConfig(), null, null, 3, null), this.teensModeService.isTeensModeOn() ? BottomNavigationConfig.TEENS : BottomNavigationConfig.DEFAULT, new h(OzonBottomNavigationTabViewExtKt.getMenuId(linkedHashMap, R$id.menu_main), linkedHashMap));
    }
}
