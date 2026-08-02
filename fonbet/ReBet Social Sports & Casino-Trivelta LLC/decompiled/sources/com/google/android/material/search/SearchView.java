package com.google.android.material.search;

import android.content.Context;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import za.InterfaceC6951b;

/* loaded from: classes3.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.b, InterfaceC6951b {

    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        public boolean I(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            b.a(view);
            return I(coordinatorLayout, null, view2);
        }

        public Behavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
