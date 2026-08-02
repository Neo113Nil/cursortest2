package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.g9q;
import xsna.iut0;

@Deprecated
/* loaded from: classes13.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int b;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;
        public final /* synthetic */ g9q d;

        public a(View view, int i, g9q g9qVar) {
            this.b = view;
            this.c = i;
            this.d = g9qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.b;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.b == this.c) {
                g9q g9qVar = this.d;
                expandableBehavior.D((View) g9qVar, view, g9qVar.M(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.b = 0;
    }

    public abstract void D(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean g(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
        g9q g9qVar = (g9q) view2;
        if (g9qVar.M()) {
            int i = this.b;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.b != 1) {
            return false;
        }
        this.b = g9qVar.M() ? 1 : 2;
        D((View) g9qVar, view, g9qVar.M(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        g9q g9qVar;
        int i2;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!view.isLaidOut()) {
            ArrayList E = coordinatorLayout.E(view);
            int size = E.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    g9qVar = null;
                    break;
                }
                View view2 = (View) E.get(i3);
                if (g(view, view2)) {
                    g9qVar = (g9q) view2;
                    break;
                }
                i3++;
            }
            if (g9qVar != null) {
                if (!g9qVar.M() ? this.b == 1 : !((i2 = this.b) != 0 && i2 != 2)) {
                    int i4 = g9qVar.M() ? 1 : 2;
                    this.b = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, g9qVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
