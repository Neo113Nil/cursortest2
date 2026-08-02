package com.swmansion.rnscreens.gamma.tabs.container;

import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public static final int a(int i10) {
        if (i10 >= 1) {
            return i10 - 1;
        }
        throw new IllegalStateException("[RNScreens] MenuItem id must not be less than 1");
    }

    public static final MenuItem b(Menu menu, int i10, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen) {
        Intrinsics.checkNotNullParameter(menu, "<this>");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        MenuItem findItem = menu.findItem(c(i10));
        if (findItem != null) {
            return findItem;
        }
        MenuItem add = menu.add(0, c(i10), 0, tabsScreen.getTabTitle());
        Intrinsics.checkNotNullExpressionValue(add, "add(...)");
        return add;
    }

    public static final int c(int i10) {
        return i10 + 1;
    }
}
