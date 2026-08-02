package com.swmansion.rnscreens.gamma.tabs.host;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ma.c f41934a;

    /* renamed from: b, reason: collision with root package name */
    public final List f41935b;

    public f(ma.c bottomNavigationView, List tabsScreenFragments) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabsScreenFragments, "tabsScreenFragments");
        this.f41934a = bottomNavigationView;
        this.f41935b = tabsScreenFragments;
    }

    public final void a() {
        int i10 = 0;
        for (Object obj : this.f41935b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Menu menu = this.f41934a.getMenu();
            Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
            b(menu.getItem(i10), ((com.swmansion.rnscreens.gamma.tabs.screen.e) obj).e0());
            i10 = i11;
        }
    }

    public final void b(MenuItem menuItem, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        Aa.e eVar = (Aa.e) this.f41934a.findViewById(menuItem.getItemId());
        if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(tabsScreen.getTabBarItemAccessibilityLabel());
        }
        eVar.setTag(tabsScreen.getTabBarItemTestID());
    }
}
