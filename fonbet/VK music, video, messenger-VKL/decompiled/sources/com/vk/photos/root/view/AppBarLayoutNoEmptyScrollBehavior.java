package com.vk.photos.root.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import xsna.gzs;

/* compiled from: AppBarLayoutNoEmptyScrollBehavior.kt */
/* loaded from: classes4.dex */
public final class AppBarLayoutNoEmptyScrollBehavior extends AppBarLayout.Behavior {
    public final AppBarLayout q;
    public final gzs<AppBarLayout> r;
    public final gzs<RecyclerView> s;

    /* compiled from: AppBarLayoutNoEmptyScrollBehavior.kt */
    public static final class a extends AppBarLayout.Behavior.a {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
        public final boolean a() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppBarLayoutNoEmptyScrollBehavior(AppBarLayout appBarLayout, gzs<? extends AppBarLayout> gzsVar, gzs<? extends RecyclerView> gzsVar2) {
        this.q = appBarLayout;
        this.r = gzsVar;
        this.s = gzsVar2;
        this.p = new a();
    }

    public static boolean b0(AppBarLayout appBarLayout) {
        CoordinatorLayout.c cVar;
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        return fVar != null && (cVar = fVar.a) != null && (cVar instanceof AppBarLayout.Behavior) && ((AppBarLayout.Behavior) cVar).D() == 0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: U */
    public final boolean z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        gzs<AppBarLayout> gzsVar = this.r;
        AppBarLayout invoke = gzsVar != null ? gzsVar.invoke() : null;
        RecyclerView invoke2 = this.s.invoke();
        if (invoke2 == null) {
            return false;
        }
        int height = invoke2.getHeight();
        AppBarLayout appBarLayout2 = this.q;
        return !(b0(appBarLayout2) && (invoke != null ? b0(invoke) : true) && invoke2.computeVerticalScrollRange() <= height - (invoke != null ? invoke.getHeight() : appBarLayout2.getHeight())) && super.z(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
