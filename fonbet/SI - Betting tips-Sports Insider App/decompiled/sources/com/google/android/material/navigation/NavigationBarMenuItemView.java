package com.google.android.material.navigation;

import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.a0;
import androidx.appcompat.view.menu.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface NavigationBarMenuItemView extends a0 {
    @Override // androidx.appcompat.view.menu.a0
    /* synthetic */ p getItemData();

    @Override // androidx.appcompat.view.menu.a0
    /* synthetic */ void initialize(p pVar, int i5);

    boolean isExpanded();

    boolean isOnlyVisibleWhenExpanded();

    /* synthetic */ boolean prefersCondensedTitle();

    /* synthetic */ void setCheckable(boolean z5);

    /* synthetic */ void setChecked(boolean z5);

    /* synthetic */ void setEnabled(boolean z5);

    void setExpanded(boolean z5);

    /* synthetic */ void setIcon(Drawable drawable);

    void setOnlyShowWhenExpanded(boolean z5);

    /* synthetic */ void setShortcut(boolean z5, char c2);

    /* synthetic */ void setTitle(CharSequence charSequence);

    /* synthetic */ boolean showsIcon();
}
