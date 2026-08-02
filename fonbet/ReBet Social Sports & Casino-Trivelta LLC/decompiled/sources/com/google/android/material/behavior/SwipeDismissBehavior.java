package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.customview.widget.c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import y0.InterfaceC6837C;
import y0.z;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.customview.widget.c f34888a;

    /* renamed from: b, reason: collision with root package name */
    public c f34889b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34890c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34891d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34893f;

    /* renamed from: e, reason: collision with root package name */
    public float f34892e = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f34894g = 2;

    /* renamed from: h, reason: collision with root package name */
    public float f34895h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public float f34896i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f34897j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    public final c.AbstractC0369c f34898k = new a();

    public class a extends c.AbstractC0369c {

        /* renamed from: a, reason: collision with root package name */
        public int f34899a;

        /* renamed from: b, reason: collision with root package name */
        public int f34900b = -1;

        public a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f34894g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f34899a - view.getWidth();
                    width2 = this.f34899a;
                } else {
                    width = this.f34899a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f34899a - view.getWidth();
                width2 = view.getWidth() + this.f34899a;
            } else if (z10) {
                width = this.f34899a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f34899a - view.getWidth();
                width2 = this.f34899a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void i(View view, int i10) {
            this.f34900b = i10;
            this.f34899a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f34891d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f34891d = false;
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f34889b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f34896i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f34897j;
            float abs = Math.abs(i10 - this.f34899a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, abs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f34900b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f34899a;
                    if (left >= i11) {
                        i10 = i11 + width;
                        z10 = true;
                    }
                }
                i10 = this.f34899a - width;
                z10 = true;
            } else {
                i10 = this.f34899a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f34888a.O(i10, view.getTop())) {
                view.postOnAnimation(new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.f34889b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public boolean m(View view, int i10) {
            int i11 = this.f34900b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }

        public final boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f34899a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f34895h);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f34894g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements InterfaceC6837C {
        public b() {
        }

        @Override // y0.InterfaceC6837C
        public boolean a(View view, InterfaceC6837C.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f34894g;
            AbstractC2082d0.V(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f34889b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final View f34903a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f34904b;

        public d(View view, boolean z10) {
            this.f34903a = view;
            this.f34904b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.c cVar2 = SwipeDismissBehavior.this.f34888a;
            if (cVar2 != null && cVar2.m(true)) {
                this.f34903a.postOnAnimation(this);
            } else {
                if (!this.f34904b || (cVar = SwipeDismissBehavior.this.f34889b) == null) {
                    return;
                }
                cVar.a(this.f34903a);
            }
        }
    }

    public static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f34888a == null) {
            return false;
        }
        if (this.f34891d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f34888a.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public final void M(ViewGroup viewGroup) {
        if (this.f34888a == null) {
            this.f34888a = this.f34893f ? androidx.customview.widget.c.n(viewGroup, this.f34892e, this.f34898k) : androidx.customview.widget.c.o(viewGroup, this.f34898k);
        }
    }

    public void O(float f10) {
        this.f34897j = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f34889b = cVar;
    }

    public void Q(float f10) {
        this.f34896i = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f34894g = i10;
    }

    public final void S(View view) {
        AbstractC2082d0.f0(view, PKIFailureInfo.badCertTemplate);
        if (J(view)) {
            AbstractC2082d0.h0(view, z.a.f68239y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f34890c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.w(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f34890c = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34890c = false;
        }
        if (z10) {
            M(coordinatorLayout);
            if (!this.f34891d && this.f34888a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean p10 = super.p(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            S(view);
        }
        return p10;
    }
}
