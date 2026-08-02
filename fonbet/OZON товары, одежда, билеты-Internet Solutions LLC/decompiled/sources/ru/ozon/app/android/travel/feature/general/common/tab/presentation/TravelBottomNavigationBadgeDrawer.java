package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.BaseOzonBottomTabView;
import ru.ozon.app.android.tabbar.ui.OzonBottomNavigationView;
import ru.ozon.app.android.tabbar.ui.utils.BottomNavigationBadgeExtKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelBottomNavigationBadgeDrawer;", "", "bottomNavigationView", "Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;", "navigationTabWithId", "", "<init>", "(Lru/ozon/app/android/tabbar/ui/OzonBottomNavigationView;I)V", "updateCounter", "", "count", "(I)Lkotlin/Unit;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelBottomNavigationBadgeDrawer {

    @NotNull
    private OzonBottomNavigationView bottomNavigationView;
    private final int navigationTabWithId;

    public TravelBottomNavigationBadgeDrawer(@NotNull OzonBottomNavigationView bottomNavigationView, int i11) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        this.bottomNavigationView = bottomNavigationView;
        this.navigationTabWithId = i11;
    }

    public final Unit updateCounter(int count) {
        BaseOzonBottomTabView tabView = this.bottomNavigationView.getTabView(this.navigationTabWithId);
        if (tabView == null) {
            return null;
        }
        BottomNavigationBadgeExtKt.updateBadgeCount(tabView, count);
        return Unit.f71690a;
    }
}
