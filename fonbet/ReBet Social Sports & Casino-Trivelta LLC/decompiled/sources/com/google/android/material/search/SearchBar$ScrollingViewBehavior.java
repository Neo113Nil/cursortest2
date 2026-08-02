package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes3.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: h, reason: collision with root package name */
    public boolean f35748h;

    public SearchBar$ScrollingViewBehavior() {
        this.f35748h = false;
    }

    @Override // ka.e
    public boolean T() {
        return true;
    }

    public final void Y(AppBarLayout appBarLayout) {
        appBarLayout.setBackgroundColor(0);
        appBarLayout.setTargetElevation(0.0f);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean l10 = super.l(coordinatorLayout, view, view2);
        if (!this.f35748h && (view2 instanceof AppBarLayout)) {
            this.f35748h = true;
            Y((AppBarLayout) view2);
        }
        return l10;
    }

    public SearchBar$ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35748h = false;
    }
}
