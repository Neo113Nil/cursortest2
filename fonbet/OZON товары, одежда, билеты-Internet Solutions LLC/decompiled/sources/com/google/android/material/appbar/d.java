package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import y2.s;

/* loaded from: classes9.dex */
final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CoordinatorLayout f57960a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppBarLayout f57961b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f57962c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f57963d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AppBarLayout.BaseBehavior f57964e;

    d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
        this.f57964e = baseBehavior;
        this.f57960a = coordinatorLayout;
        this.f57961b = appBarLayout;
        this.f57962c = view;
        this.f57963d = i11;
    }

    @Override // y2.s
    public final boolean a(@NonNull View view) {
        View view2 = this.f57962c;
        int i11 = this.f57963d;
        this.f57964e.p(this.f57960a, this.f57961b, view2, i11, new int[]{0, 0});
        return true;
    }
}
