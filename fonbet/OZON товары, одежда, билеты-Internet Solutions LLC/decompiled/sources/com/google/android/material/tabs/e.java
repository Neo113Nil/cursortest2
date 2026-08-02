package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes9.dex */
final class e implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f58595a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TabLayout.g f58596b;

    e(TabLayout.g gVar, View view) {
        this.f58596b = gVar;
        this.f58595a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        if (this.f58595a.getVisibility() == 0) {
            this.f58596b.getClass();
        }
    }
}
