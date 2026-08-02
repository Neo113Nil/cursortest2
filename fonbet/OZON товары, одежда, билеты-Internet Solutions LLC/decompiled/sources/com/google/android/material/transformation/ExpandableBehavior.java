package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Y;
import java.util.List;
import r7.InterfaceC9213a;

@Deprecated
/* loaded from: classes9.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name */
    private int f58836a;

    final class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f58837a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58838b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC9213a f58839c;

        a(View view, int i11, InterfaceC9213a interfaceC9213a) {
            this.f58837a = view;
            this.f58838b = i11;
            this.f58839c = interfaceC9213a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f58837a;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f58836a == this.f58838b) {
                InterfaceC9213a interfaceC9213a = this.f58839c;
                expandableBehavior.c((View) interfaceC9213a, view, interfaceC9213a.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f58836a = 0;
    }

    protected abstract void c(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC9213a interfaceC9213a = (InterfaceC9213a) view2;
        if (interfaceC9213a.isExpanded()) {
            int i11 = this.f58836a;
            if (i11 != 0 && i11 != 2) {
                return false;
            }
        } else if (this.f58836a != 1) {
            return false;
        }
        this.f58836a = interfaceC9213a.isExpanded() ? 1 : 2;
        c((View) interfaceC9213a, view, interfaceC9213a.isExpanded(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i11) {
        InterfaceC9213a interfaceC9213a;
        int i12;
        int i13 = Y.f42258g;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    interfaceC9213a = null;
                    break;
                }
                View view2 = dependencies.get(i14);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    interfaceC9213a = (InterfaceC9213a) view2;
                    break;
                }
                i14++;
            }
            if (interfaceC9213a != null && (!interfaceC9213a.isExpanded() ? this.f58836a == 1 : !((i12 = this.f58836a) != 0 && i12 != 2))) {
                int i15 = interfaceC9213a.isExpanded() ? 1 : 2;
                this.f58836a = i15;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i15, interfaceC9213a));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f58836a = 0;
    }
}
