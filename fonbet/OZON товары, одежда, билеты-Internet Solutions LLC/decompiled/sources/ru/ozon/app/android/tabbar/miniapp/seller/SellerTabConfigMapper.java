package ru.ozon.app.android.tabbar.miniapp.seller;

import NZ.h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.tabbar.data.RemoteTabConfig;
import ru.ozon.app.android.tabbar.data.TabConfigDTO;
import ru.ozon.app.android.tabbar.data.TabConfigResponse;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.app.android.tabbar.ui.utils.MapperActiveTabConfigKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabConfigMapper;", "", "tabIdMapper", "Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabIdMapper;", "<init>", "(Lru/ozon/app/android/tabbar/miniapp/seller/SellerTabIdMapper;)V", "mapTabConfig", "Lru/ozon/app/android/tabbar/data/RemoteTabConfig;", "response", "Lru/ozon/app/android/tabbar/data/TabConfigResponse;", "mapTabs", "", "Lru/ozon/app/android/tabbar/ui/model/BottomNavigationItem;", DynamicElementDTO.TABS, "Lru/ozon/app/android/tabbar/data/TabConfigDTO;", "mapTab", "index", "", "tabDto", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SellerTabConfigMapper {

    @NotNull
    private final SellerTabIdMapper tabIdMapper;

    public SellerTabConfigMapper(@NotNull SellerTabIdMapper tabIdMapper) {
        Intrinsics.checkNotNullParameter(tabIdMapper, "tabIdMapper");
        this.tabIdMapper = tabIdMapper;
    }

    private final BottomNavigationItem mapTab(int index, TabConfigDTO tabDto) {
        Integer id2 = this.tabIdMapper.getId(tabDto.getUrl());
        if (id2 != null) {
            index = id2.intValue();
        }
        String title = tabDto.getTitle();
        return new BottomNavigationItem(index, tabDto.getIcon(), title, null, tabDto.getUrl(), null, tabDto.getBehavior(), null, 168, null);
    }

    private final List<BottomNavigationItem> mapTabs(List<TabConfigDTO> tabs) {
        List<TabConfigDTO> list = tabs;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapTab(i11, (TabConfigDTO) obj));
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public final RemoteTabConfig mapTabConfig(@NotNull TabConfigResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        List<BottomNavigationItem> mapTabs = mapTabs(response.getTabs());
        List<BottomNavigationItem> list = mapTabs;
        int h11 = U.h(C7714v.z(list, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (BottomNavigationItem bottomNavigationItem : list) {
            Pair pair = new Pair(Integer.valueOf(bottomNavigationItem.getId()), bottomNavigationItem.getDeeplink());
            linkedHashMap.put(pair.e(), pair.f());
        }
        return new RemoteTabConfig(mapTabs, MapperActiveTabConfigKt.mapActiveTabConfig$default(response.getActiveTabConfig(), null, null, 3, null), null, new h(mapTabs.get(1).getId(), linkedHashMap), 4, null);
    }
}
