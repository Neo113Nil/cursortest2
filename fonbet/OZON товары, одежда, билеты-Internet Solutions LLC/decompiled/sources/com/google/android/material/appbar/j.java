package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    private k f57983a;

    /* renamed from: b, reason: collision with root package name */
    private int f57984b;

    public j() {
        this.f57984b = 0;
    }

    public int b() {
        k kVar = this.f57983a;
        if (kVar != null) {
            return kVar.c();
        }
        return 0;
    }

    int c() {
        return b();
    }

    protected void d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        coordinatorLayout.onLayoutChild(v11, i11);
    }

    public boolean e(int i11) {
        k kVar = this.f57983a;
        if (kVar != null) {
            return kVar.e(i11);
        }
        this.f57984b = i11;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        d(coordinatorLayout, v11, i11);
        if (this.f57983a == null) {
            this.f57983a = new k(v11);
        }
        this.f57983a.d();
        this.f57983a.a();
        int i12 = this.f57984b;
        if (i12 == 0) {
            return true;
        }
        this.f57983a.e(i12);
        this.f57984b = 0;
        return true;
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57984b = 0;
    }
}
