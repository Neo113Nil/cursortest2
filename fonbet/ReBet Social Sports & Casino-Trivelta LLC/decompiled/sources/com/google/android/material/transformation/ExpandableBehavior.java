package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import wa.InterfaceC6734a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public int f36498a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f36499a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36500b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC6734a f36501c;

        public a(View view, int i10, InterfaceC6734a interfaceC6734a) {
            this.f36499a = view;
            this.f36500b = i10;
            this.f36501c = interfaceC6734a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f36499a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f36498a == this.f36500b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC6734a interfaceC6734a = this.f36501c;
                expandableBehavior.L((View) interfaceC6734a, this.f36499a, interfaceC6734a.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f36498a = 0;
    }

    public final boolean J(boolean z10) {
        if (!z10) {
            return this.f36498a == 1;
        }
        int i10 = this.f36498a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC6734a K(CoordinatorLayout coordinatorLayout, View view) {
        List m10 = coordinatorLayout.m(view);
        int size = m10.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) m10.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (InterfaceC6734a) view2;
            }
        }
        return null;
    }

    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC6734a interfaceC6734a = (InterfaceC6734a) view2;
        if (!J(interfaceC6734a.a())) {
            return false;
        }
        this.f36498a = interfaceC6734a.a() ? 1 : 2;
        return L((View) interfaceC6734a, view, interfaceC6734a.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        InterfaceC6734a K10;
        if (view.isLaidOut() || (K10 = K(coordinatorLayout, view)) == null || !J(K10.a())) {
            return false;
        }
        int i11 = K10.a() ? 1 : 2;
        this.f36498a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, K10));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36498a = 0;
    }
}
