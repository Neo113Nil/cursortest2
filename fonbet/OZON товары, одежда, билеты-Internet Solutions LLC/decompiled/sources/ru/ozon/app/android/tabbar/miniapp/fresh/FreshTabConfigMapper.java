package ru.ozon.app.android.tabbar.miniapp.fresh;

import NZ.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;
import ru.ozon.app.android.tabbar.data.TabConfigAnimations;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;
import ru.ozon.app.android.tabbar.ui.utils.OzonBottomNavigationTabViewExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabConfigMapper;", "", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabIdMapper;", "freshTabIdMapper", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabIdMapper;)V", "", "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "list", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", "mapToModels", "(Ljava/util/List;)Ljava/util/List;", "LNZ/h;", "getTabNavigatorConfig", "(Ljava/util/List;)LNZ/h;", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "response", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "mapResponseToModel", "(Lru/ozon/app/android/tabbar/data/TabConfigResponse;)Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabData;", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabIdMapper;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FreshTabConfigMapper {
    private static final int activeIconColor = UniColors.GRAPHIC_FRESH.getResId();
    private static final int activeTitleColor = UniColors.TEXT_FRESH.getResId();

    @NotNull
    private final FreshTabIdMapper freshTabIdMapper;

    public FreshTabConfigMapper(@NotNull FreshTabIdMapper freshTabIdMapper) {
        Intrinsics.checkNotNullParameter(freshTabIdMapper, "freshTabIdMapper");
        this.freshTabIdMapper = freshTabIdMapper;
    }

    @NotNull
    public final h getTabNavigatorConfig(@NotNull List<BottomNavigationItem> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BottomNavigationItem bottomNavigationItem : list) {
            Pair pair = new Pair(Integer.valueOf(bottomNavigationItem.getId()), bottomNavigationItem.getDeeplink());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new h(OzonBottomNavigationTabViewExtKt.getMenuId(linkedHashMap, R$id.menu_fresh_main), linkedHashMap);
    }

    @NotNull
    public final FreshTabData mapResponseToModel(@NotNull TabConfigResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<BottomNavigationItem> mapToModels = mapToModels(response.getTabs());
        return new FreshTabData(mapToModels, getTabNavigatorConfig(mapToModels), MapperActiveTabConfigKt.mapActiveTabConfig(response.getActiveTabConfig(), Integer.valueOf(activeIconColor), Integer.valueOf(activeTitleColor)));
    }

    @NotNull
    public final List<BottomNavigationItem> mapToModels(@NotNull List<TabConfigDTO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<TabConfigDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (TabConfigDTO tabConfigDTO : list2) {
            int id2 = this.freshTabIdMapper.getId(tabConfigDTO.getUrl());
            String icon = tabConfigDTO.getIcon();
            String title = tabConfigDTO.getTitle();
            String url = tabConfigDTO.getUrl();
            BottomNavigationBehavior behavior = tabConfigDTO.getBehavior();
            TabConfigAnimations animation = tabConfigDTO.getAnimation();
            arrayList.add(new BottomNavigationItem(id2, icon, title, animation != null ? Integer.valueOf(animation.getResId()) : null, url, null, behavior, tabConfigDTO.getStaticIndicator(), 32, null));
        }
        return arrayList;
    }
}
