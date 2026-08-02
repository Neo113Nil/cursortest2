package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.D;

/* loaded from: classes.dex */
final class a implements D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppBarLayout f57954a;

    a(AppBarLayout appBarLayout) {
        this.f57954a = appBarLayout;
    }

    @Override // androidx.core.view.D
    public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        this.f57954a.p(c5353y0);
        return c5353y0;
    }
}
