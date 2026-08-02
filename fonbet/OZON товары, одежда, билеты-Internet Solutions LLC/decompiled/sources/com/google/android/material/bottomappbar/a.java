package com.google.android.material.bottomappbar;

import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import s7.C9621p;

/* loaded from: classes9.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionMenuView f58016a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f58017b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f58018c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ BottomAppBar f58019d;

    a(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i11, boolean z11) {
        this.f58019d = bottomAppBar;
        this.f58016a = actionMenuView;
        this.f58017b = i11;
        this.f58018c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BottomAppBar bottomAppBar = this.f58019d;
        bottomAppBar.getClass();
        ActionMenuView actionMenuView = this.f58016a;
        int i11 = 0;
        if (this.f58017b == 1 && this.f58018c) {
            boolean d11 = C9621p.d(bottomAppBar);
            int measuredWidth = d11 ? bottomAppBar.getMeasuredWidth() : 0;
            while (i11 < bottomAppBar.getChildCount()) {
                View childAt = bottomAppBar.getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f37109a & 8388615) == 8388611) {
                    measuredWidth = d11 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
                i11++;
            }
            i11 = measuredWidth - (d11 ? actionMenuView.getRight() : actionMenuView.getLeft());
        }
        actionMenuView.setTranslationX(i11);
    }
}
