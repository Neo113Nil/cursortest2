package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class NavigationBarMenu extends n {
    public static final int NO_MAX_ITEM_LIMIT = Integer.MAX_VALUE;
    private final int maxItemCount;
    private final boolean subMenuSupported;

    @NonNull
    private final Class<?> viewClass;

    public NavigationBarMenu(@NonNull Context context, @NonNull Class<?> cls, int i5, boolean z5) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i5;
        this.subMenuSupported = z5;
    }

    @Override // androidx.appcompat.view.menu.n
    @NonNull
    public MenuItem addInternal(int i5, int i10, int i11, @NonNull CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i5, i10, i11, charSequence);
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder p10 = e.p("Maximum number of items supported by ", simpleName, " is ");
        p10.append(this.maxItemCount);
        p10.append(". Limit can be checked with ");
        p10.append(simpleName);
        p10.append("#getMaxItemCount()");
        throw new IllegalArgumentException(p10.toString());
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i5, int i10, int i11, @NonNull CharSequence charSequence) {
        if (!this.subMenuSupported) {
            throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
        }
        p pVar = (p) addInternal(i5, i10, i11, charSequence);
        NavigationBarSubMenu navigationBarSubMenu = new NavigationBarSubMenu(getContext(), this, pVar);
        pVar.f530o = navigationBarSubMenu;
        navigationBarSubMenu.setHeaderTitle(pVar.f521e);
        return navigationBarSubMenu;
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
