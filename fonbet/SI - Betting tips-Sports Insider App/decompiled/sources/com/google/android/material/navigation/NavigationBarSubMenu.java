package com.google.android.material.navigation;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f0;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NavigationBarSubMenu extends f0 {
    public NavigationBarSubMenu(@NonNull Context context, @NonNull NavigationBarMenu navigationBarMenu, @NonNull p pVar) {
        super(context, navigationBarMenu, pVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onItemsChanged(boolean z5) {
        super.onItemsChanged(z5);
        ((n) getParentMenu()).onItemsChanged(z5);
    }
}
