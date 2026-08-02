package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout.java */
/* loaded from: classes13.dex */
public final class b implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ TabLayout.i c;

    public b(TabLayout.i iVar, View view) {
        this.c = iVar;
        this.b = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.b;
        if (view2.getVisibility() == 0) {
            this.c.f(view2);
        }
    }
}
