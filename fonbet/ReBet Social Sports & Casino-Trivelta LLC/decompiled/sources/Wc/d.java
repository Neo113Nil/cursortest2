package Wc;

import android.content.Context;
import android.view.MenuItem;
import com.swmansion.rnscreens.gamma.tabs.container.i;
import com.swmansion.rnscreens.gamma.tabs.screen.e;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ma.c f13227a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13228b;

    /* renamed from: c, reason: collision with root package name */
    public final c f13229c;

    public d(ma.c bottomNavigationView, List tabsScreenFragments) {
        Intrinsics.checkNotNullParameter(bottomNavigationView, "bottomNavigationView");
        Intrinsics.checkNotNullParameter(tabsScreenFragments, "tabsScreenFragments");
        this.f13227a = bottomNavigationView;
        this.f13228b = tabsScreenFragments;
        this.f13229c = new c(bottomNavigationView);
    }

    public final void a(Context context, MenuItem menuItem, com.swmansion.rnscreens.gamma.tabs.screen.a tabsScreen, b bVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        Intrinsics.checkNotNullParameter(tabsScreen, "tabsScreen");
        this.f13229c.c(menuItem, tabsScreen);
        this.f13229c.a(context, menuItem, tabsScreen, bVar);
    }

    public final void b(Context context, b bVar) {
        int i10 = 0;
        for (Object obj : this.f13228b) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            e eVar = (e) obj;
            int c10 = com.swmansion.rnscreens.gamma.tabs.container.a.c(i10);
            MenuItem findItem = this.f13227a.getMenu().findItem(c10);
            if (findItem == null) {
                throw new IllegalStateException(("[RNScreens] Missing MenuItem for id: " + c10).toString());
            }
            if (findItem.getItemId() != c10) {
                throw new IllegalStateException("[RNScreens] Illegal state: menu items are shuffled");
            }
            a(context, findItem, eVar.e0(), bVar);
            i10 = i11;
        }
    }

    public final void c(Context context, i tabsContainer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tabsContainer, "tabsContainer");
        b appearance$react_native_screens_release = tabsContainer.getSelectedTab$react_native_screens_release().e0().getAppearance$react_native_screens_release();
        this.f13229c.d(context, appearance$react_native_screens_release, tabsContainer.getTabBarHidden$react_native_screens_release());
        b(context, appearance$react_native_screens_release);
        this.f13229c.b(context, appearance$react_native_screens_release);
    }
}
