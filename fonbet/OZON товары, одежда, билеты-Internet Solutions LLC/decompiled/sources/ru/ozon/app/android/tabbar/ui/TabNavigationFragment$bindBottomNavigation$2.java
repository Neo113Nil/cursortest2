package ru.ozon.app.android.tabbar.ui;

import GZ.g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationItem;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "menuItem", "Lru/ozon/app/android/tabbar/ui/OzonMenuItem;", "badge", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "invoke", "(Lru/ozon/app/android/tabbar/ui/OzonMenuItem;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TabNavigationFragment$bindBottomNavigation$2 extends AbstractC7737t implements Function2<OzonMenuItem, IndicatorDTO, Boolean> {
    final /* synthetic */ List<BottomNavigationItem> $tabs;
    final /* synthetic */ TabNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabNavigationFragment$bindBottomNavigation$2(List<BottomNavigationItem> list, TabNavigationFragment tabNavigationFragment) {
        super(2);
        this.$tabs = list;
        this.this$0 = tabNavigationFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(OzonMenuItem menuItem, IndicatorDTO indicatorDTO) {
        Object obj;
        String longClickDeeplink;
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Iterator<T> it = this.$tabs.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BottomNavigationItem) obj).getId() == menuItem.getItemId()) {
                break;
            }
        }
        BottomNavigationItem bottomNavigationItem = (BottomNavigationItem) obj;
        if (bottomNavigationItem == null || (longClickDeeplink = bottomNavigationItem.getLongClickDeeplink()) == null) {
            return Boolean.FALSE;
        }
        this.this$0.getTabBarAnalytics().sendLongTapEvent(menuItem, this.this$0.getBottomNavigation().getMenuItemPosition(menuItem), indicatorDTO);
        return Boolean.valueOf(g.a.a(this.this$0.getRouter(), longClickDeeplink, null, null, 6));
    }
}
