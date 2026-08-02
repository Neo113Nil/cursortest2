package com.google.android.material.bottomsheet;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a02;
import defpackage.a70;
import defpackage.bsk;
import defpackage.d9l;
import defpackage.e80;
import defpackage.eb;
import defpackage.fjg;
import defpackage.ivk;
import defpackage.iyb;
import defpackage.jsk;
import defpackage.k9;
import defpackage.ljg;
import defpackage.myb;
import defpackage.mz1;
import defpackage.nx0;
import defpackage.o9;
import defpackage.p9;
import defpackage.pjf;
import defpackage.qq7;
import defpackage.qzb;
import defpackage.srk;
import defpackage.tc0;
import defpackage.trk;
import defpackage.us3;
import defpackage.v4a;
import defpackage.w3a;
import defpackage.wz1;
import defpackage.x9;
import defpackage.x9l;
import defpackage.xah;
import defpackage.xs3;
import defpackage.xz1;
import defpackage.y3g;
import defpackage.yz1;
import defpackage.zz1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends us3 implements iyb {
    public boolean A;
    public final a02 B;
    public final ValueAnimator C;
    public final int D;
    public int E;
    public int F;
    public final float G;
    public int H;
    public final float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final boolean M;
    public boolean N;
    public final boolean O;
    public int P;
    public jsk Q;
    public boolean R;
    public int S;
    public boolean T;
    public final float U;
    public int V;
    public int W;
    public int X;
    public WeakReference Y;
    public final ArrayList Z;
    public final int a;
    public final ArrayList a0;
    public boolean b;
    public VelocityTracker b0;
    public final float c;
    public myb c0;
    public final int d;
    public int d0;
    public final boolean e;
    public int e0;
    public int f;
    public WeakReference f0;
    public boolean g;
    public boolean g0;
    public int h;
    public HashMap h0;
    public final int i;
    public final SparseIntArray i0;
    public final qzb j;
    public final SparseIntArray j0;
    public final ColorStateList k;
    public final SparseIntArray k0;
    public final int l;
    public final Rect l0;
    public final int m;
    public final xz1 m0;
    public int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public int w;
    public int x;
    public final boolean y;
    public final xah z;

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new a02(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new xz1(this, i2);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.e);
        if (obtainStyledAttributes.hasValue(3)) {
            this.k = w3a.x(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.z = xah.h(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        xah xahVar = this.z;
        if (xahVar != null) {
            qzb qzbVar = new qzb(xahVar);
            this.j = qzbVar;
            qzbVar.p(context);
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                this.j.t(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(y(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new wz1(this, i2));
        this.I = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.m = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i = peekValue.data) != -1) {
            L(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            L(i);
        }
        K(obtainStyledAttributes.getBoolean(10, false));
        this.o = obtainStyledAttributes.getBoolean(16, false);
        J(obtainStyledAttributes.getBoolean(8, true));
        this.K = obtainStyledAttributes.getBoolean(15, false);
        this.L = obtainStyledAttributes.getBoolean(5, true);
        this.M = obtainStyledAttributes.getBoolean(6, true);
        this.a = obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f) {
            a70.p("ratio must be a float value between 0 and 1");
            throw null;
        }
        this.G = f;
        if (this.Y != null) {
            this.F = (int) ((1.0f - f) * this.X);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                a70.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = dimensionPixelOffset;
            R(this.P, true);
        } else {
            int i3 = peekValue2.data;
            if (i3 < 0) {
                a70.p("offset must be greater than or equal to 0");
                throw null;
            }
            this.D = i3;
            R(this.P, true);
        }
        this.d = obtainStyledAttributes.getInt(14, 500);
        this.e = obtainStyledAttributes.getBoolean(11, false);
        this.O = obtainStyledAttributes.getBoolean(4, true);
        this.p = obtainStyledAttributes.getBoolean(20, false);
        this.q = obtainStyledAttributes.getBoolean(21, false);
        this.r = obtainStyledAttributes.getBoolean(22, false);
        this.s = obtainStyledAttributes.getBoolean(23, true);
        this.t = obtainStyledAttributes.getBoolean(17, false);
        this.u = obtainStyledAttributes.getBoolean(18, false);
        this.v = obtainStyledAttributes.getBoolean(19, false);
        this.y = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static View B(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View B = B(viewGroup.getChildAt(i));
            if (B != null) {
                return B;
            }
        }
        return null;
    }

    public static BottomSheetBehavior C(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof xs3)) {
            a70.p("The view is not a child of CoordinatorLayout");
            return null;
        }
        us3 us3Var = ((xs3) layoutParams).a;
        if (us3Var instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) us3Var;
        }
        a70.p("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public static int D(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final void A(int i) {
        View view = (View) this.Y.get();
        if (view != null) {
            ArrayList arrayList = this.a0;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.H;
            if (i <= i2 && i2 != E()) {
                E();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((zz1) arrayList.get(i3)).b(view);
            }
        }
    }

    public final int E() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int F(int i) {
        if (i == 3) {
            return E();
        }
        if (i == 4) {
            return this.H;
        }
        if (i == 5) {
            return this.X;
        }
        if (i == 6) {
            return this.F;
        }
        a70.p(ljg.j(i, "Invalid state to get top offset: "));
        return 0;
    }

    public final boolean G() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean H(View view) {
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    public final void I(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.Z.add(new WeakReference(view));
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                I(viewGroup.getChildAt(i));
            }
        }
    }

    public final void J(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.Y != null) {
            x();
        }
        N((this.b && this.P == 6) ? 3 : this.P);
        R(this.P, true);
        Q();
    }

    public final void K(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.P == 5) {
                M(4);
            }
            Q();
        }
    }

    public final void L(int i) {
        boolean z = this.g;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.g = true;
            }
        } else {
            if (!z && this.f == i) {
                return;
            }
            this.g = false;
            this.f = Math.max(0, i);
        }
        T();
    }

    public final void M(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(mz1.o(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (this.J || i != 5) {
            int i2 = (i == 6 && this.b && F(i) <= this.E) ? 3 : i;
            WeakReference weakReference = this.Y;
            if (weakReference == null || weakReference.get() == null) {
                N(i);
                return;
            }
            View view = (View) this.Y.get();
            tc0 tc0Var = new tc0((Object) this, (Object) view, i2, 1, false);
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(tc0Var);
            } else {
                tc0Var.run();
            }
        }
    }

    public final void N(int i) {
        View view;
        if (this.P == i) {
            return;
        }
        this.P = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.J;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            S(false);
        }
        R(i, true);
        while (true) {
            ArrayList arrayList = this.a0;
            if (i2 >= arrayList.size()) {
                Q();
                return;
            } else {
                ((zz1) arrayList.get(i2)).c(i, view);
                i2++;
            }
        }
    }

    public final boolean O(View view, float f) {
        if (this.K) {
            return true;
        }
        if (view.getTop() < this.H) {
            return false;
        }
        return Math.abs(((f * this.U) + ((float) view.getTop())) - ((float) this.H)) / ((float) z()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        N(2);
        R(r4, true);
        r2.B.b(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(View view, int i, boolean z) {
        int F = F(i);
        jsk jskVar = this.Q;
        if (jskVar != null) {
            if (!z) {
                int left = view.getLeft();
                jskVar.r = view;
                jskVar.c = -1;
                boolean h = jskVar.h(left, F, 0, 0);
                if (!h && jskVar.a == 0 && jskVar.r != null) {
                    jskVar.r = null;
                }
            }
        }
        N(i);
    }

    public final void Q() {
        View view;
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        bsk.n(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, view);
        int i = 0;
        bsk.k(0, view);
        bsk.n(524288, view);
        bsk.k(0, view);
        bsk.n(262144, view);
        bsk.k(0, view);
        SparseIntArray sparseIntArray = this.j0;
        int i2 = sparseIntArray.get(0, -1);
        if (i2 != -1) {
            bsk.n(i2, view);
            bsk.k(0, view);
            sparseIntArray.delete(0);
        }
        SparseIntArray sparseIntArray2 = this.i0;
        int i3 = sparseIntArray2.get(0, -1);
        if (i3 != -1) {
            bsk.n(i3, view);
            bsk.k(0, view);
            sparseIntArray2.delete(0);
        }
        SparseIntArray sparseIntArray3 = this.k0;
        int i4 = sparseIntArray3.get(0, -1);
        if (i4 != -1) {
            bsk.n(i4, view);
            bsk.k(0, view);
            sparseIntArray3.delete(0);
        }
        if (!this.b && this.P != 6) {
            sparseIntArray2.put(0, w(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.J) {
            int i5 = 5;
            if (this.P != 5) {
                bsk.o(view, x9.k, new yz1(this, i5, i));
            }
        }
        int i6 = this.P;
        if (i6 == 3) {
            if (this.K && this.J) {
                return;
            }
            sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            return;
        }
        if (i6 == 4) {
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i6 != 6) {
                return;
            }
            if (!this.K || !this.J) {
                sparseIntArray3.put(0, w(view, R.string.bottomsheet_action_collapse, 4));
            }
            sparseIntArray.put(0, w(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    public final void R(int i, boolean z) {
        qzb qzbVar;
        if (i == 2) {
            return;
        }
        boolean z2 = this.P == 3 && (this.y || G());
        if (this.A == z2 || (qzbVar = this.j) == null) {
            return;
        }
        this.A = z2;
        ValueAnimator valueAnimator = this.C;
        if (!z || valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            qzbVar.u(this.A ? y() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(qzbVar.b.j, z2 ? y() : 1.0f);
            valueAnimator.start();
        }
    }

    public final void S(boolean z) {
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.h0 != null) {
                    return;
                } else {
                    this.h0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.Y.get() && z) {
                    this.h0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.h0 = null;
        }
    }

    public final void T() {
        View view;
        if (this.Y != null) {
            x();
            if (this.P != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.iyb
    public final void a(nx0 nx0Var) {
        myb mybVar = this.c0;
        if (mybVar == null) {
            return;
        }
        mybVar.f = nx0Var;
    }

    @Override // defpackage.iyb
    public final void b() {
        myb mybVar = this.c0;
        if (mybVar == null) {
            return;
        }
        nx0 nx0Var = mybVar.f;
        mybVar.f = null;
        if (nx0Var == null) {
            return;
        }
        AnimatorSet a = mybVar.a();
        a.setDuration(mybVar.e);
        a.start();
    }

    @Override // defpackage.iyb
    public final void c() {
        myb mybVar = this.c0;
        if (mybVar == null) {
            return;
        }
        int i = mybVar.d;
        int i2 = mybVar.c;
        nx0 nx0Var = mybVar.f;
        mybVar.f = null;
        if (nx0Var != null) {
            float f = nx0Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.J) {
                    AnimatorSet a = mybVar.a();
                    a.setDuration(e80.c(f, i2, i));
                    a.start();
                    M(4);
                    return;
                }
                eb ebVar = new eb(this, 3);
                View view = mybVar.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new qq7(1));
                ofFloat.setDuration(e80.c(f, i2, i));
                ofFloat.addListener(new eb(mybVar, 9));
                ofFloat.addListener(ebVar);
                ofFloat.start();
                return;
            }
        }
        M(this.J ? 5 : 4);
    }

    @Override // defpackage.iyb
    public final void d(nx0 nx0Var) {
        myb mybVar = this.c0;
        if (mybVar == null) {
            return;
        }
        nx0 nx0Var2 = mybVar.f;
        mybVar.f = nx0Var;
        if (nx0Var2 == null) {
            return;
        }
        mybVar.b(nx0Var.c);
    }

    @Override // defpackage.us3
    public final void g(xs3 xs3Var) {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    @Override // defpackage.us3
    public final void j() {
        this.Y = null;
        this.Q = null;
        this.c0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        if (r1.get() != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        if (r18.n(r6, (int) r20.getX(), (int) r20.getY()) != false) goto L85;
     */
    @Override // defpackage.us3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int i;
        jsk jskVar;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.b0;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.b0 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        ArrayList arrayList = this.Z;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.e0 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    view2 = (View) ((WeakReference) it.next()).get();
                    if (view2 != null && coordinatorLayout.n(view2, x2, y)) {
                        break;
                    }
                }
            }
            view2 = null;
            WeakReference weakReference = new WeakReference(view2);
            this.f0 = weakReference;
            if (this.P != 2 && weakReference.get() != null) {
                this.d0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.g0 = true;
            }
            this.R = this.d0 == -1 && !coordinatorLayout.n(view, x, this.e0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g0 = false;
            this.f0 = null;
            this.d0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (this.R || (jskVar = this.Q) == null || !jskVar.o(motionEvent)) {
            if (actionMasked == 2) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((WeakReference) it2.next()).get() != null) {
                        if (!this.R && this.P != 1) {
                            if (this.e) {
                                WeakReference weakReference2 = this.f0;
                                if (weakReference2 != null) {
                                }
                                if (this.Q != null || (i = this.e0) == -1 || Math.abs(i - motionEvent.getY()) <= this.Q.b) {
                                    break;
                                }
                            } else {
                                View view3 = arrayList.isEmpty() ? null : (View) ((WeakReference) arrayList.get(0)).get();
                                if (view3 != null) {
                                }
                                if (this.Q != null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.us3
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.Y == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i3 = 29;
            boolean z = (Build.VERSION.SDK_INT < 29 || this.o || this.g) ? false : true;
            if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
                fjg fjgVar = new fjg(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                k9 k9Var = new k9();
                k9Var.a = paddingStart;
                k9Var.b = paddingEnd;
                k9Var.c = paddingBottom;
                y3g y3gVar = new y3g(i3, fjgVar, k9Var);
                WeakHashMap weakHashMap = bsk.a;
                srk.c(view, y3gVar);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new ivk());
                }
            }
            v4a v4aVar = new v4a(view);
            WeakHashMap weakHashMap2 = bsk.a;
            d9l.a(view, v4aVar);
            this.Y = new WeakReference(view);
            this.c0 = new myb(view);
            qzb qzbVar = this.j;
            if (qzbVar != null) {
                view.setBackground(qzbVar);
                float f = this.I;
                if (f == -1.0f) {
                    f = view.getElevation();
                }
                qzbVar.s(f);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            Q();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = new jsk(coordinatorLayout.getContext(), coordinatorLayout, this.m0);
        }
        int top = view.getTop();
        coordinatorLayout.p(i, view);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int i4 = this.X;
        int i5 = i4 - height;
        int i6 = this.x;
        if (i5 < i6) {
            boolean z2 = this.s;
            int i7 = this.m;
            if (z2) {
                height = i7 == -1 ? i4 : Math.min(i4, i7);
                this.V = height;
            } else {
                int i8 = i4 - i6;
                height = i7 == -1 ? i8 : Math.min(i8, i7);
                this.V = height;
            }
        }
        this.E = Math.max(0, this.X - height);
        this.F = (int) ((1.0f - this.G) * this.X);
        x();
        int i9 = this.P;
        if (i9 == 3) {
            int E = E();
            WeakHashMap weakHashMap3 = bsk.a;
            view.offsetTopAndBottom(E);
        } else if (i9 == 6) {
            int i10 = this.F;
            WeakHashMap weakHashMap4 = bsk.a;
            view.offsetTopAndBottom(i10);
        } else if (this.J && i9 == 5) {
            int i11 = this.X;
            WeakHashMap weakHashMap5 = bsk.a;
            view.offsetTopAndBottom(i11);
        } else if (i9 == 4) {
            int i12 = this.H;
            WeakHashMap weakHashMap6 = bsk.a;
            view.offsetTopAndBottom(i12);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = bsk.a;
            view.offsetTopAndBottom(top2);
        }
        R(this.P, false);
        ArrayList arrayList = this.Z;
        arrayList.clear();
        if (this.e) {
            I(view);
        } else {
            arrayList.add(new WeakReference(B(view)));
        }
        while (true) {
            ArrayList arrayList2 = this.a0;
            if (i2 >= arrayList2.size()) {
                return true;
            }
            ((zz1) arrayList2.get(i2)).a(view);
            i2++;
        }
    }

    @Override // defpackage.us3
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(D(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), D(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.m, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.us3
    public final boolean n(View view) {
        Iterator it = this.Z.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((WeakReference) it.next()).get() != null) {
                if (!H(view) || this.P == 3 || this.N) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.us3
    public final void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        boolean H;
        if (i3 != 1 && (H = H(view2))) {
            int top = view.getTop();
            int i4 = top - i2;
            boolean z = this.M;
            if (i2 > 0) {
                if (!this.T && !z && H && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i4 < E()) {
                    int E = top - E();
                    iArr[1] = E;
                    WeakHashMap weakHashMap = bsk.a;
                    view.offsetTopAndBottom(-E);
                    N(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = bsk.a;
                    view.offsetTopAndBottom(-i2);
                    N(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !z && H && canScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!canScrollVertically) {
                    int i5 = this.H;
                    if (i4 > i5 && !this.J) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        WeakHashMap weakHashMap3 = bsk.a;
                        view.offsetTopAndBottom(-i6);
                        N(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = bsk.a;
                        view.offsetTopAndBottom(-i2);
                        N(1);
                    }
                }
            }
            A(view.getTop());
            this.S = i2;
            this.T = true;
            this.N = false;
        }
    }

    @Override // defpackage.us3
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        if (!this.O || view.isInTouchMode()) {
            return false;
        }
        int i = this.P;
        if (i != 4 && i != 6) {
            return false;
        }
        Rect rect2 = this.l0;
        if (view.getLocalVisibleRect(rect2)) {
            WeakHashMap weakHashMap = bsk.a;
            x9l a = trk.a(view);
            if (a != null) {
                rect2.bottom -= a.a.i(519).d;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        M(3);
        return true;
    }

    @Override // defpackage.us3
    public final void r(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.J = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.K = savedState.g;
            }
        }
        int i2 = savedState.c;
        if (i2 == 1 || i2 == 2) {
            this.P = 4;
        } else {
            this.P = i2;
        }
    }

    @Override // defpackage.us3
    public final Parcelable s(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new SavedState(this);
    }

    @Override // defpackage.us3
    public final boolean t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.S = 0;
        this.T = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4.getTop() <= r2.F) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007c, code lost:
    
        if (r3 < java.lang.Math.abs(r3 - r2.H)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L48;
     */
    @Override // defpackage.us3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == E()) {
            N(3);
            return;
        }
        if (H(view2) && this.T) {
            if (this.S > 0) {
                if (!this.b) {
                }
                P(view, i2, false);
                this.T = false;
            }
            if (this.J) {
                VelocityTracker velocityTracker = this.b0;
                if (velocityTracker == null) {
                    yVelocity = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.b0.getYVelocity(this.d0);
                }
                if (O(view, yVelocity)) {
                    i2 = 5;
                    P(view, i2, false);
                    this.T = false;
                }
            }
            if (this.S == 0) {
                int top = view.getTop();
                if (!this.b) {
                    int i3 = this.F;
                    if (top < i3) {
                    }
                    i2 = 6;
                }
            } else {
                if (!this.b) {
                    int top2 = view.getTop();
                }
                i2 = 4;
            }
            P(view, i2, false);
            this.T = false;
        }
    }

    @Override // defpackage.us3
    public final boolean v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.P;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        jsk jskVar = this.Q;
        if (jskVar != null && (this.L || i == 1)) {
            jskVar.i(motionEvent);
        }
        if (actionMasked == 0) {
            this.d0 = -1;
            this.e0 = -1;
            this.f0 = null;
            VelocityTracker velocityTracker = this.b0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.b0 = null;
            }
        }
        VelocityTracker velocityTracker2 = this.b0;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.b0 = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.Q != null && ((this.L || this.P == 1) && actionMasked == 2 && !this.R)) {
            float abs = Math.abs(this.e0 - motionEvent.getY());
            jsk jskVar2 = this.Q;
            if (abs > jskVar2.b) {
                jskVar2.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.R;
    }

    public final int w(View view, int i, int i2) {
        int i3;
        String string = view.getResources().getString(i);
        yz1 yz1Var = new yz1(this, i2, 0);
        ArrayList h = bsk.h(view);
        int i4 = 0;
        while (true) {
            if (i4 >= h.size()) {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = bsk.d;
                    if (i5 >= 32 || i6 != -1) {
                        break;
                    }
                    int i7 = iArr[i5];
                    boolean z = true;
                    for (int i8 = 0; i8 < h.size(); i8++) {
                        z &= ((x9) h.get(i8)).a() != i7;
                    }
                    if (z) {
                        i6 = i7;
                    }
                    i5++;
                }
                i3 = i6;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((x9) h.get(i4)).a).getLabel())) {
                    i3 = ((x9) h.get(i4)).a();
                    break;
                }
                i4++;
            }
        }
        if (i3 != -1) {
            x9 x9Var = new x9(null, i3, string, yz1Var, null);
            View.AccessibilityDelegate f = bsk.f(view);
            p9 p9Var = f == null ? null : f instanceof o9 ? ((o9) f).a : new p9(f);
            if (p9Var == null) {
                p9Var = new p9();
            }
            bsk.q(view, p9Var);
            bsk.n(x9Var.a(), view);
            bsk.h(view).add(x9Var);
            bsk.k(0, view);
        }
        return i3;
    }

    public final void x() {
        int z = z();
        boolean z2 = this.b;
        int i = this.X;
        if (z2) {
            this.H = Math.max(i - z, this.E);
        } else {
            this.H = i - z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float y() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f;
        RoundedCorner roundedCorner;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        qzb qzbVar = this.j;
        if (qzbVar != null && (weakReference = this.Y) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.Y.get();
            if (G() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                float m = qzbVar.m();
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner2 != null) {
                    float radius = roundedCorner2.getRadius();
                    if (radius > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && m > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = radius / m;
                        float[] fArr = qzbVar.C;
                        float a = fArr == null ? fArr[0] : qzbVar.b.a.d().f.a(qzbVar.i());
                        roundedCorner = rootWindowInsets.getRoundedCorner(1);
                        if (roundedCorner != null) {
                            float radius2 = roundedCorner.getRadius();
                            if (radius2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 = radius2 / a;
                            }
                        }
                        return Math.max(f, f2);
                    }
                }
                f = 0.0f;
                float[] fArr2 = qzbVar.C;
                if (fArr2 == null) {
                }
                roundedCorner = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner != null) {
                }
                return Math.max(f, f2);
            }
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int z() {
        int i;
        int i2;
        int i3;
        if (this.g) {
            i = Math.min(Math.max(this.h, this.X - ((this.W * 9) / 16)), this.V);
            i2 = this.w;
        } else {
            if (!this.o && !this.p && (i3 = this.n) > 0) {
                return Math.max(this.f, i3 + this.i);
            }
            i = this.f;
            i2 = this.w;
        }
        return i + i2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(BottomSheetBehavior bottomSheetBehavior) {
            super(AbsSavedState.EMPTY_STATE);
            this.c = bottomSheetBehavior.P;
            this.d = bottomSheetBehavior.f;
            this.e = bottomSheetBehavior.b;
            this.f = bottomSheetBehavior.J;
            this.g = bottomSheetBehavior.K;
        }
    }

    @Override // defpackage.us3
    public final void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.l = -1;
        this.m = -1;
        this.B = new a02(this);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = true;
        this.P = 4;
        this.U = 0.1f;
        this.Z = new ArrayList();
        this.a0 = new ArrayList();
        this.e0 = -1;
        this.i0 = new SparseIntArray();
        this.j0 = new SparseIntArray();
        this.k0 = new SparseIntArray();
        this.l0 = new Rect();
        this.m0 = new xz1(this, 0);
    }
}
