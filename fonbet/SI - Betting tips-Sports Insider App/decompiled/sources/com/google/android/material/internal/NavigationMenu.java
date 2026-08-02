package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationMenu extends n {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.n, android.view.Menu
    @NonNull
    public SubMenu addSubMenu(int i5, int i10, int i11, CharSequence charSequence) {
        p pVar = (p) addInternal(i5, i10, i11, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, pVar);
        pVar.f530o = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(pVar.f521e);
        return navigationSubMenu;
    }
}
