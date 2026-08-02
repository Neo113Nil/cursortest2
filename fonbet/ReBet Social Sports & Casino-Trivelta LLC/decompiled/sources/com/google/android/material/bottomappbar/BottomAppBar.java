package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ia.AbstractC4540b;
import ia.c;
import ia.l;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public abstract class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: g1, reason: collision with root package name */
    public static final int f34906g1 = l.f48584w;

    /* renamed from: p1, reason: collision with root package name */
    public static final int f34907p1 = c.f48214S;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f34908x1 = c.f48225b0;

    public static /* synthetic */ void S(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View T(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ boolean V(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ void W(BottomAppBar bottomAppBar, FloatingActionButton floatingActionButton) {
        throw null;
    }

    public static /* synthetic */ int X(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void Y(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.f) view.getLayoutParams()).f18783d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: p, reason: collision with root package name */
        public final Rect f34909p;

        /* renamed from: q, reason: collision with root package name */
        public WeakReference f34910q;

        /* renamed from: r, reason: collision with root package name */
        public int f34911r;

        /* renamed from: s, reason: collision with root package name */
        public final View.OnLayoutChangeListener f34912s;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                b.a(Behavior.this.f34910q.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f34912s = new a();
            this.f34909p = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            b.a(view);
            return Y(coordinatorLayout, null, view2, view3, i10, i11);
        }

        public boolean X(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f34910q = new WeakReference(bottomAppBar);
            View T10 = BottomAppBar.T(bottomAppBar);
            if (T10 != null && !T10.isLaidOut()) {
                BottomAppBar.Y(bottomAppBar, T10);
                this.f34911r = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) T10.getLayoutParams())).bottomMargin;
                if (T10 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) T10;
                    if (BottomAppBar.X(bottomAppBar) == 0 && BottomAppBar.V(bottomAppBar)) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(AbstractC4540b.f48193b);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(AbstractC4540b.f48192a);
                    }
                    BottomAppBar.W(bottomAppBar, floatingActionButton);
                }
                T10.addOnLayoutChangeListener(this.f34912s);
                BottomAppBar.S(bottomAppBar);
            }
            coordinatorLayout.E(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        public boolean Y(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            b.a(view);
            return X(coordinatorLayout, null, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f34912s = new a();
            this.f34909p = new Rect();
        }
    }
}
