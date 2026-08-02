package ru.ozon.app.android.travel.feature.hotels.widgets.skiResortInfo.presentation;

import androidx.lifecycle.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.tabs.Tabs;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/skiResortInfo/presentation/SkiResortInfoViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;", "", "actionId", "updateSelectionState", "(Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;Ljava/lang/String;)Lru/ozon/uni/atoms/data/tabs/Tabs$TabsItem;", "Lru/ozon/uni/atoms/data/tabs/Tabs;", DynamicElementDTO.TABS, "Lkotlin/Function1;", "", "updateTabsCallback", "onTabChanged", "(Lru/ozon/uni/atoms/data/tabs/Tabs;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SkiResortInfoViewModel extends w0 {
    private final Tabs.TabsItem updateSelectionState(Tabs.TabsItem tabsItem, String str) {
        AtomActionDTO action = tabsItem.getAction();
        return Tabs.TabsItem.copy$default(tabsItem, null, Intrinsics.d(str, action != null ? action.getId() : null), null, null, null, null, 61, null);
    }

    public final void onTabChanged(@NotNull Tabs tabs, @NotNull String actionId, @NotNull Function1<? super Tabs, Unit> updateTabsCallback) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(updateTabsCallback, "updateTabsCallback");
        List<Tabs.TabsItem> tabItems = tabs.getTabItems();
        ArrayList arrayList = new ArrayList(C7714v.z(tabItems, 10));
        Iterator<T> it = tabItems.iterator();
        while (it.hasNext()) {
            arrayList.add(updateSelectionState((Tabs.TabsItem) it.next(), actionId));
        }
        updateTabsCallback.invoke(Tabs.copy$default(tabs, arrayList, null, null, false, null, null, null, 126, null));
    }
}
