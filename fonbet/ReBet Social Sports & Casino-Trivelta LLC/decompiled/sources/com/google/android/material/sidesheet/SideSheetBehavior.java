package com.google.android.material.sidesheet;

import Fa.d;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.C2035b;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import com.google.android.material.shape.i;
import com.google.android.material.shape.n;
import com.google.android.material.sidesheet.SideSheetBehavior;
import ia.k;
import ia.l;
import ia.m;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import ja.AbstractC5104a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s0.AbstractC6307a;
import y0.InterfaceC6837C;
import y0.z;
import za.InterfaceC6951b;
import za.g;

/* loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c implements InterfaceC6951b {

    /* renamed from: a, reason: collision with root package name */
    public Fa.c f35907a;

    /* renamed from: b, reason: collision with root package name */
    public float f35908b;

    /* renamed from: c, reason: collision with root package name */
    public i f35909c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f35910d;

    /* renamed from: e, reason: collision with root package name */
    public n f35911e;

    /* renamed from: f, reason: collision with root package name */
    public final c f35912f;

    /* renamed from: g, reason: collision with root package name */
    public float f35913g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f35914h;

    /* renamed from: i, reason: collision with root package name */
    public int f35915i;

    /* renamed from: j, reason: collision with root package name */
    public int f35916j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.customview.widget.c f35917k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35918l;

    /* renamed from: m, reason: collision with root package name */
    public float f35919m;

    /* renamed from: n, reason: collision with root package name */
    public int f35920n;

    /* renamed from: o, reason: collision with root package name */
    public int f35921o;

    /* renamed from: p, reason: collision with root package name */
    public int f35922p;

    /* renamed from: q, reason: collision with root package name */
    public int f35923q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f35924r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f35925s;

    /* renamed from: t, reason: collision with root package name */
    public int f35926t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f35927u;

    /* renamed from: v, reason: collision with root package name */
    public g f35928v;

    /* renamed from: w, reason: collision with root package name */
    public int f35929w;

    /* renamed from: x, reason: collision with root package name */
    public final Set f35930x;

    /* renamed from: y, reason: collision with root package name */
    public final c.AbstractC0369c f35931y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f35906z = k.f48524b0;

    /* renamed from: A, reason: collision with root package name */
    public static final int f35905A = l.f48582u;

    public class a extends c.AbstractC0369c {
        public a() {
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int a(View view, int i10, int i11) {
            return AbstractC6307a.b(i10, SideSheetBehavior.this.f35907a.g(), SideSheetBehavior.this.f35907a.f());
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int d(View view) {
            return SideSheetBehavior.this.f35920n + SideSheetBehavior.this.k0();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f35914h) {
                SideSheetBehavior.this.G0(1);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View f02 = SideSheetBehavior.this.f0();
            if (f02 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) != null) {
                SideSheetBehavior.this.f35907a.p(marginLayoutParams, view.getLeft(), view.getRight());
                f02.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.a0(view, i10);
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void l(View view, float f10, float f11) {
            int W10 = SideSheetBehavior.this.W(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.L0(view, W10, sideSheetBehavior.K0());
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f35915i == 1 || SideSheetBehavior.this.f35924r == null || SideSheetBehavior.this.f35924r.get() != view) ? false : true;
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.G0(5);
            if (SideSheetBehavior.this.f35924r == null || SideSheetBehavior.this.f35924r.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f35924r.get()).requestLayout();
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f35935a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f35936b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f35937c = new Runnable() { // from class: Fa.h
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(SideSheetBehavior.c.this);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f35936b = false;
            if (SideSheetBehavior.this.f35917k != null && SideSheetBehavior.this.f35917k.m(true)) {
                cVar.b(cVar.f35935a);
            } else if (SideSheetBehavior.this.f35915i == 2) {
                SideSheetBehavior.this.G0(cVar.f35935a);
            }
        }

        public void b(int i10) {
            if (SideSheetBehavior.this.f35924r == null || SideSheetBehavior.this.f35924r.get() == null) {
                return;
            }
            this.f35935a = i10;
            if (this.f35936b) {
                return;
            }
            ((View) SideSheetBehavior.this.f35924r.get()).postOnAnimation(this.f35937c);
            this.f35936b = true;
        }
    }

    public SideSheetBehavior() {
        this.f35912f = new c();
        this.f35914h = true;
        this.f35915i = 5;
        this.f35916j = 5;
        this.f35919m = 0.1f;
        this.f35926t = -1;
        this.f35930x = new LinkedHashSet();
        this.f35931y = new a();
    }

    private void A0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean H0() {
        if (this.f35917k != null) {
            return this.f35914h || this.f35915i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean I(SideSheetBehavior sideSheetBehavior, int i10, View view, InterfaceC6837C.a aVar) {
        sideSheetBehavior.F0(i10);
        return true;
    }

    public static /* synthetic */ void J(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f35924r.get();
        if (view != null) {
            sideSheetBehavior.L0(view, i10, false);
        }
    }

    public static /* synthetic */ void K(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f35907a.o(marginLayoutParams, AbstractC5104a.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(View view, int i10, boolean z10) {
        if (!w0(view, i10, z10)) {
            G0(i10);
        } else {
            G0(2);
            this.f35912f.b(i10);
        }
    }

    private void M0() {
        View view;
        WeakReference weakReference = this.f35924r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC2082d0.f0(view, PKIFailureInfo.transactionIdInUse);
        AbstractC2082d0.f0(view, PKIFailureInfo.badCertTemplate);
        if (this.f35915i != 5) {
            y0(view, z.a.f68239y, 5);
        }
        if (this.f35915i != 3) {
            y0(view, z.a.f68237w, 3);
        }
    }

    private InterfaceC6837C Y(final int i10) {
        return new InterfaceC6837C() { // from class: Fa.e
            @Override // y0.InterfaceC6837C
            public final boolean a(View view, InterfaceC6837C.a aVar) {
                return SideSheetBehavior.I(SideSheetBehavior.this, i10, view, aVar);
            }
        };
    }

    private void Z(Context context) {
        if (this.f35911e == null) {
            return;
        }
        i iVar = new i(this.f35911e);
        this.f35909c = iVar;
        iVar.T(context);
        ColorStateList colorStateList = this.f35910d;
        if (colorStateList != null) {
            this.f35909c.f0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f35909c.setTint(typedValue.data);
    }

    private int c0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    private void y0(View view, z.a aVar, int i10) {
        AbstractC2082d0.h0(view, aVar, null, Y(i10));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.B(coordinatorLayout, view, savedState.a());
        }
        int i10 = savedState.f35932c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f35915i = i10;
        this.f35916j = i10;
    }

    public void B0(int i10) {
        this.f35926t = i10;
        X();
        WeakReference weakReference = this.f35924r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.C(coordinatorLayout, view), this);
    }

    public void C0(boolean z10) {
        this.f35914h = z10;
    }

    public final void D0(int i10) {
        Fa.c cVar = this.f35907a;
        if (cVar == null || cVar.j() != i10) {
            if (i10 == 0) {
                this.f35907a = new Fa.b(this);
                if (this.f35911e == null || s0()) {
                    return;
                }
                n.b w10 = this.f35911e.w();
                w10.J(0.0f).z(0.0f);
                O0(w10.m());
                return;
            }
            if (i10 == 1) {
                this.f35907a = new Fa.a(this);
                if (this.f35911e == null || r0()) {
                    return;
                }
                n.b w11 = this.f35911e.w();
                w11.E(0.0f).v(0.0f);
                O0(w11.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    public final void E0(View view, int i10) {
        D0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) view.getLayoutParams()).f18782c, i10) == 3 ? 1 : 0);
    }

    public void F0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f35924r;
        if (weakReference == null || weakReference.get() == null) {
            G0(i10);
        } else {
            A0((View) this.f35924r.get(), new Runnable() { // from class: Fa.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.J(SideSheetBehavior.this, i10);
                }
            });
        }
    }

    public void G0(int i10) {
        View view;
        if (this.f35915i == i10) {
            return;
        }
        this.f35915i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f35916j = i10;
        }
        WeakReference weakReference = this.f35924r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        P0(view);
        Iterator it = this.f35930x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f35915i == 1 && actionMasked == 0) {
            return true;
        }
        if (H0()) {
            this.f35917k.F(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f35927u == null) {
            this.f35927u = VelocityTracker.obtain();
        }
        this.f35927u.addMovement(motionEvent);
        if (H0() && actionMasked == 2 && !this.f35918l && t0(motionEvent)) {
            this.f35917k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f35918l;
    }

    public boolean I0(View view, float f10) {
        return this.f35907a.n(view, f10);
    }

    public final boolean J0(View view) {
        return (view.isShown() || AbstractC2082d0.o(view) != null) && this.f35914h;
    }

    public boolean K0() {
        return true;
    }

    public final void N0() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f35924r;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f35924r.get();
        View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return;
        }
        this.f35907a.o(marginLayoutParams, (int) ((this.f35920n * view.getScaleX()) + this.f35923q));
        f02.requestLayout();
    }

    public final void O0(n nVar) {
        i iVar = this.f35909c;
        if (iVar != null) {
            iVar.setShapeAppearanceModel(nVar);
        }
    }

    public final void P0(View view) {
        int i10 = this.f35915i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    public final int U(int i10, View view) {
        int i11 = this.f35915i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f35907a.h(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f35907a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f35915i);
    }

    public final float V(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    public final int W(View view, float f10, float f11) {
        if (u0(f10)) {
            return 3;
        }
        if (I0(view, f10)) {
            return (this.f35907a.m(f10, f11) || this.f35907a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - g0()) < Math.abs(left - this.f35907a.e()) ? 3 : 5;
    }

    public final void X() {
        WeakReference weakReference = this.f35925s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f35925s = null;
    }

    @Override // za.InterfaceC6951b
    public void a() {
        g gVar = this.f35928v;
        if (gVar == null) {
            return;
        }
        gVar.f();
    }

    public final void a0(View view, int i10) {
        if (this.f35930x.isEmpty()) {
            return;
        }
        this.f35907a.b(i10);
        Iterator it = this.f35930x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // za.InterfaceC6951b
    public void b(C2035b c2035b) {
        g gVar = this.f35928v;
        if (gVar == null) {
            return;
        }
        gVar.j(c2035b);
    }

    public final void b0(View view) {
        if (AbstractC2082d0.o(view) == null) {
            AbstractC2082d0.o0(view, view.getResources().getString(f35906z));
        }
    }

    @Override // za.InterfaceC6951b
    public void c(C2035b c2035b) {
        g gVar = this.f35928v;
        if (gVar == null) {
            return;
        }
        gVar.l(c2035b, h0());
        N0();
    }

    @Override // za.InterfaceC6951b
    public void d() {
        g gVar = this.f35928v;
        if (gVar == null) {
            return;
        }
        C2035b c10 = gVar.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            F0(5);
        } else {
            this.f35928v.h(c10, h0(), new b(), e0());
        }
    }

    public int d0() {
        return this.f35920n;
    }

    public final ValueAnimator.AnimatorUpdateListener e0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View f02 = f0();
        if (f02 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) f02.getLayoutParams()) == null) {
            return null;
        }
        final int c10 = this.f35907a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: Fa.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.K(SideSheetBehavior.this, marginLayoutParams, c10, f02, valueAnimator);
            }
        };
    }

    public View f0() {
        WeakReference weakReference = this.f35925s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int g0() {
        return this.f35907a.d();
    }

    public final int h0() {
        Fa.c cVar = this.f35907a;
        return (cVar == null || cVar.j() == 0) ? 5 : 3;
    }

    public float i0() {
        return this.f35919m;
    }

    public float j0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f35924r = null;
        this.f35917k = null;
        this.f35928v = null;
    }

    public int k0() {
        return this.f35923q;
    }

    public int l0(int i10) {
        if (i10 == 3) {
            return g0();
        }
        if (i10 == 5) {
            return this.f35907a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    public int m0() {
        return this.f35922p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f35924r = null;
        this.f35917k = null;
        this.f35928v = null;
    }

    public int n0() {
        return this.f35921o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        androidx.customview.widget.c cVar;
        if (!J0(view)) {
            this.f35918l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f35927u == null) {
            this.f35927u = VelocityTracker.obtain();
        }
        this.f35927u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f35929w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f35918l) {
            this.f35918l = false;
            return false;
        }
        return (this.f35918l || (cVar = this.f35917k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    public int o0() {
        return FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f35924r == null) {
            this.f35924r = new WeakReference(view);
            this.f35928v = new g(view);
            i iVar = this.f35909c;
            if (iVar != null) {
                view.setBackground(iVar);
                i iVar2 = this.f35909c;
                float f10 = this.f35913g;
                if (f10 == -1.0f) {
                    f10 = view.getElevation();
                }
                iVar2.e0(f10);
            } else {
                ColorStateList colorStateList = this.f35910d;
                if (colorStateList != null) {
                    AbstractC2082d0.q0(view, colorStateList);
                }
            }
            P0(view);
            M0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            b0(view);
        }
        E0(view, i10);
        if (this.f35917k == null) {
            this.f35917k = androidx.customview.widget.c.o(coordinatorLayout, this.f35931y);
        }
        int h10 = this.f35907a.h(view);
        coordinatorLayout.E(view, i10);
        this.f35921o = coordinatorLayout.getWidth();
        this.f35922p = this.f35907a.i(coordinatorLayout);
        this.f35920n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f35923q = marginLayoutParams != null ? this.f35907a.a(marginLayoutParams) : 0;
        AbstractC2082d0.V(view, U(h10, view));
        x0(coordinatorLayout);
        Iterator it = this.f35930x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    public androidx.customview.widget.c p0() {
        return this.f35917k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(c0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), c0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public final CoordinatorLayout.f q0() {
        View view;
        WeakReference weakReference = this.f35924r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    public final boolean r0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && ((ViewGroup.MarginLayoutParams) q02).leftMargin > 0;
    }

    public final boolean s0() {
        CoordinatorLayout.f q02 = q0();
        return q02 != null && ((ViewGroup.MarginLayoutParams) q02).rightMargin > 0;
    }

    public final boolean t0(MotionEvent motionEvent) {
        return H0() && V((float) this.f35929w, motionEvent.getX()) > ((float) this.f35917k.z());
    }

    public final boolean u0(float f10) {
        return this.f35907a.k(f10);
    }

    public final boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    public final boolean w0(View view, int i10, boolean z10) {
        int l02 = l0(i10);
        androidx.customview.widget.c p02 = p0();
        if (p02 != null) {
            return z10 ? p02.O(l02, view.getTop()) : p02.Q(view, l02, view.getTop());
        }
        return false;
    }

    public final void x0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View findViewById;
        if (this.f35925s != null || (i10 = this.f35926t) == -1 || (findViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f35925s = new WeakReference(findViewById);
    }

    public final void z0() {
        VelocityTracker velocityTracker = this.f35927u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f35927u = null;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f35932c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35932c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f35932c);
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f35932c = sideSheetBehavior.f35915i;
        }
    }

    public SideSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35912f = new c();
        this.f35914h = true;
        this.f35915i = 5;
        this.f35916j = 5;
        this.f35919m = 0.1f;
        this.f35926t = -1;
        this.f35930x = new LinkedHashSet();
        this.f35931y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.SideSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(m.f48654G5)) {
            this.f35910d = Ca.c.a(context, obtainStyledAttributes, m.f48654G5);
        }
        if (obtainStyledAttributes.hasValue(m.f48684J5)) {
            this.f35911e = n.e(context, attributeSet, 0, f35905A).m();
        }
        if (obtainStyledAttributes.hasValue(m.f48674I5)) {
            B0(obtainStyledAttributes.getResourceId(m.f48674I5, -1));
        }
        Z(context);
        this.f35913g = obtainStyledAttributes.getDimension(m.f48644F5, -1.0f);
        C0(obtainStyledAttributes.getBoolean(m.f48664H5, true));
        obtainStyledAttributes.recycle();
        this.f35908b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
