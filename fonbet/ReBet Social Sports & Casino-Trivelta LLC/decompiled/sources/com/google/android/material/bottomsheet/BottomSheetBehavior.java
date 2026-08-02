package com.google.android.material.bottomsheet;

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
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.activity.C2035b;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.c;
import com.google.android.material.shape.i;
import com.google.android.material.shape.n;
import ia.k;
import ia.l;
import ia.m;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import na.C5690c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s0.AbstractC6307a;
import xa.o;
import y0.InterfaceC6837C;
import y0.z;
import za.InterfaceC6951b;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c implements InterfaceC6951b {

    /* renamed from: T4, reason: collision with root package name */
    public static final int f34914T4 = l.f48575n;

    /* renamed from: A, reason: collision with root package name */
    public boolean f34915A;

    /* renamed from: B, reason: collision with root package name */
    public final h f34916B;

    /* renamed from: C, reason: collision with root package name */
    public ValueAnimator f34917C;

    /* renamed from: D, reason: collision with root package name */
    public int f34918D;

    /* renamed from: E, reason: collision with root package name */
    public int f34919E;

    /* renamed from: F, reason: collision with root package name */
    public int f34920F;

    /* renamed from: G, reason: collision with root package name */
    public float f34921G;

    /* renamed from: H, reason: collision with root package name */
    public int f34922H;

    /* renamed from: I, reason: collision with root package name */
    public float f34923I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f34924J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f34925K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f34926L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f34927O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f34928P;

    /* renamed from: P4, reason: collision with root package name */
    public boolean f34929P4;

    /* renamed from: Q4, reason: collision with root package name */
    public Map f34930Q4;

    /* renamed from: R, reason: collision with root package name */
    public int f34931R;

    /* renamed from: R4, reason: collision with root package name */
    public final SparseIntArray f34932R4;

    /* renamed from: S4, reason: collision with root package name */
    public final c.AbstractC0369c f34933S4;

    /* renamed from: T, reason: collision with root package name */
    public int f34934T;

    /* renamed from: T1, reason: collision with root package name */
    public WeakReference f34935T1;

    /* renamed from: V, reason: collision with root package name */
    public androidx.customview.widget.c f34936V;

    /* renamed from: V1, reason: collision with root package name */
    public WeakReference f34937V1;

    /* renamed from: W, reason: collision with root package name */
    public boolean f34938W;

    /* renamed from: X, reason: collision with root package name */
    public int f34939X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f34940Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f34941Z;

    /* renamed from: a, reason: collision with root package name */
    public int f34942a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34943b;

    /* renamed from: b1, reason: collision with root package name */
    public int f34944b1;

    /* renamed from: b2, reason: collision with root package name */
    public final ArrayList f34945b2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34946c;

    /* renamed from: d, reason: collision with root package name */
    public float f34947d;

    /* renamed from: e, reason: collision with root package name */
    public int f34948e;

    /* renamed from: f, reason: collision with root package name */
    public int f34949f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34950g;

    /* renamed from: g1, reason: collision with root package name */
    public int f34951g1;

    /* renamed from: g2, reason: collision with root package name */
    public VelocityTracker f34952g2;

    /* renamed from: h, reason: collision with root package name */
    public int f34953h;

    /* renamed from: i, reason: collision with root package name */
    public int f34954i;

    /* renamed from: j, reason: collision with root package name */
    public i f34955j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f34956k;

    /* renamed from: l, reason: collision with root package name */
    public int f34957l;

    /* renamed from: m, reason: collision with root package name */
    public int f34958m;

    /* renamed from: n, reason: collision with root package name */
    public int f34959n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34960o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34961p;

    /* renamed from: p1, reason: collision with root package name */
    public int f34962p1;

    /* renamed from: p2, reason: collision with root package name */
    public za.f f34963p2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f34964q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34965r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f34966s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f34967t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f34968u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f34969v;

    /* renamed from: w, reason: collision with root package name */
    public int f34970w;

    /* renamed from: x, reason: collision with root package name */
    public int f34971x;

    /* renamed from: x1, reason: collision with root package name */
    public WeakReference f34972x1;

    /* renamed from: x2, reason: collision with root package name */
    public int f34973x2;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34974y;

    /* renamed from: y1, reason: collision with root package name */
    public WeakReference f34975y1;

    /* renamed from: y2, reason: collision with root package name */
    public int f34976y2;

    /* renamed from: z, reason: collision with root package name */
    public n f34977z;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f34983a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34984b;

        public a(View view, int i10) {
            this.f34983a = view;
            this.f34984b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.k1(this.f34983a, this.f34984b, false);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.d1(5);
            WeakReference weakReference = BottomSheetBehavior.this.f34972x1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.f34972x1.get()).requestLayout();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f34955j != null) {
                BottomSheetBehavior.this.f34955j.g0(floatValue);
            }
        }
    }

    public class d implements o.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f34988a;

        public d(boolean z10) {
            this.f34988a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // xa.o.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public F0 a(View view, F0 f02, o.d dVar) {
            boolean z10;
            androidx.core.graphics.e f10 = f02.f(F0.p.g());
            androidx.core.graphics.e f11 = f02.f(F0.p.d());
            BottomSheetBehavior.this.f34971x = f10.f19099b;
            boolean j10 = o.j(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f34961p) {
                BottomSheetBehavior.this.f34970w = f02.j();
                paddingBottom = dVar.f68091d + BottomSheetBehavior.this.f34970w;
            }
            if (BottomSheetBehavior.this.f34964q) {
                paddingLeft = (j10 ? dVar.f68090c : dVar.f68088a) + f10.f19098a;
            }
            if (BottomSheetBehavior.this.f34965r) {
                paddingRight = (j10 ? dVar.f68088a : dVar.f68090c) + f10.f19100c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.f34967t) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = f10.f19098a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                    if (BottomSheetBehavior.this.f34968u) {
                        int i12 = marginLayoutParams.rightMargin;
                        int i13 = f10.f19100c;
                        if (i12 != i13) {
                            marginLayoutParams.rightMargin = i13;
                            z10 = true;
                        }
                    }
                    if (BottomSheetBehavior.this.f34969v) {
                        int i14 = marginLayoutParams.topMargin;
                        int i15 = f10.f19099b;
                        if (i14 != i15) {
                            marginLayoutParams.topMargin = i15;
                            if (z11) {
                                view.setLayoutParams(marginLayoutParams);
                            }
                            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                            if (this.f34988a) {
                                BottomSheetBehavior.this.f34959n = f11.f19101d;
                            }
                            if (BottomSheetBehavior.this.f34961p && !this.f34988a) {
                                return f02;
                            }
                            BottomSheetBehavior.this.p1(false);
                            return f02;
                        }
                    }
                    z11 = z10;
                    if (z11) {
                    }
                    view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                    if (this.f34988a) {
                    }
                    if (BottomSheetBehavior.this.f34961p) {
                    }
                    BottomSheetBehavior.this.p1(false);
                    return f02;
                }
            }
            z10 = false;
            if (BottomSheetBehavior.this.f34968u) {
            }
            if (BottomSheetBehavior.this.f34969v) {
            }
            z11 = z10;
            if (z11) {
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f34988a) {
            }
            if (BottomSheetBehavior.this.f34961p) {
            }
            BottomSheetBehavior.this.p1(false);
            return f02;
        }
    }

    public class e extends c.AbstractC0369c {

        /* renamed from: a, reason: collision with root package name */
        public long f34990a;

        public e() {
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int b(View view, int i10, int i11) {
            return AbstractC6307a.b(i10, BottomSheetBehavior.this.s0(), e(view));
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public int e(View view) {
            return BottomSheetBehavior.this.j0() ? BottomSheetBehavior.this.f34962p1 : BottomSheetBehavior.this.f34922H;
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f34926L) {
                BottomSheetBehavior.this.d1(1);
            }
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.o0(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.f34991b.f1(r0, (r9 * 100.0f) / r10.f34962p1) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.f34991b.f34920F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f34991b.s0()) < java.lang.Math.abs(r8.getTop() - r7.f34991b.f34920F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r7.f34991b.i1() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f34991b.f34919E) < java.lang.Math.abs(r9 - r7.f34991b.f34922H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
        
            if (r7.f34991b.i1() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (r7.f34991b.i1() == false) goto L63;
         */
        @Override // androidx.customview.widget.c.AbstractC0369c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void l(View view, float f10, float f11) {
            int i10 = 6;
            if (f11 < 0.0f) {
                if (!BottomSheetBehavior.this.f34943b) {
                    int top = view.getTop();
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f34990a;
                    if (BottomSheetBehavior.this.i1()) {
                    }
                }
                i10 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f34924J && bottomSheetBehavior.h1(view, f11)) {
                    if ((Math.abs(f10) >= Math.abs(f11) || f11 <= BottomSheetBehavior.this.f34948e) && !n(view)) {
                        if (!BottomSheetBehavior.this.f34943b) {
                        }
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.f34943b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f34920F;
                        if (top2 < i11) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior2.f34922H)) {
                            }
                            i10 = 3;
                        } else {
                            if (Math.abs(top2 - i11) < Math.abs(top2 - BottomSheetBehavior.this.f34922H)) {
                            }
                            i10 = 4;
                        }
                    }
                } else {
                    if (!BottomSheetBehavior.this.f34943b) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.f34920F) < Math.abs(top3 - BottomSheetBehavior.this.f34922H)) {
                        }
                    }
                    i10 = 4;
                }
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.k1(view, i10, bottomSheetBehavior3.j1());
        }

        @Override // androidx.customview.widget.c.AbstractC0369c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f34931R;
            if (i11 == 1 || bottomSheetBehavior.f34929P4) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f34973x2 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f34937V1;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f34990a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f34972x1;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f34962p1 + bottomSheetBehavior.s0()) / 2;
        }
    }

    public class f implements InterfaceC6837C {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f34992a;

        public f(int i10) {
            this.f34992a = i10;
        }

        @Override // y0.InterfaceC6837C
        public boolean a(View view, InterfaceC6837C.a aVar) {
            BottomSheetBehavior.this.c1(this.f34992a);
            return true;
        }
    }

    public static abstract class g {
        public void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f34942a = 0;
        this.f34943b = true;
        this.f34946c = false;
        this.f34957l = -1;
        this.f34958m = -1;
        this.f34916B = new h(this, null);
        this.f34921G = 0.5f;
        this.f34923I = -1.0f;
        this.f34926L = true;
        this.f34927O = true;
        this.f34931R = 4;
        this.f34934T = 4;
        this.f34941Z = 0.1f;
        this.f34945b2 = new ArrayList();
        this.f34976y2 = -1;
        this.f34932R4 = new SparseIntArray();
        this.f34933S4 = new e();
    }

    private void L0() {
        this.f34973x2 = -1;
        this.f34976y2 = -1;
        VelocityTracker velocityTracker = this.f34952g2;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f34952g2 = null;
        }
    }

    public static BottomSheetBehavior q0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c f10 = ((CoordinatorLayout.f) layoutParams).f();
        if (f10 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) f10;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final boolean A0() {
        WeakReference weakReference = this.f34972x1;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f34972x1.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.B(coordinatorLayout, view, savedState.a());
        M0(savedState);
        int i10 = savedState.f34978c;
        if (i10 == 1 || i10 == 2) {
            this.f34931R = 4;
            this.f34934T = 4;
        } else {
            this.f34931R = i10;
            this.f34934T = i10;
        }
    }

    public final boolean B0() {
        if (this.f34931R == 3) {
            return this.f34974y || A0();
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.C(coordinatorLayout, view), this);
    }

    public boolean C0() {
        return this.f34960o;
    }

    public boolean D0() {
        return this.f34924J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.f34939X = 0;
        this.f34940Y = false;
        return (i10 & 2) != 0;
    }

    public boolean E0() {
        return true;
    }

    public final boolean F0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.f34920F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f34919E) < java.lang.Math.abs(r3 - r2.f34922H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (i1() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f34922H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f34920F) < java.lang.Math.abs(r3 - r2.f34922H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
        WeakReference weakReference;
        int i11 = 3;
        if (view.getTop() == s0()) {
            d1(3);
            return;
        }
        if (!G0() || ((weakReference = this.f34937V1) != null && view2 == weakReference.get() && this.f34940Y)) {
            if (this.f34939X > 0) {
                if (!this.f34943b) {
                }
                k1(view, i11, false);
                this.f34940Y = false;
            }
            if (this.f34924J && h1(view, z0())) {
                i11 = 5;
            } else if (this.f34939X == 0) {
                int top = view.getTop();
                if (!this.f34943b) {
                    int i12 = this.f34920F;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f34922H)) {
                        }
                    }
                }
            } else {
                if (!this.f34943b) {
                    int top2 = view.getTop();
                }
                i11 = 4;
            }
            k1(view, i11, false);
            this.f34940Y = false;
        }
    }

    public boolean G0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f34931R == 1 && actionMasked == 0) {
            return true;
        }
        if (g1()) {
            this.f34936V.F(motionEvent);
        }
        if (actionMasked == 0) {
            L0();
        }
        if (this.f34952g2 == null) {
            this.f34952g2 = VelocityTracker.obtain();
        }
        this.f34952g2.addMovement(motionEvent);
        if (g1() && actionMasked == 2 && !this.f34938W && Math.abs(this.f34976y2 - motionEvent.getY()) > this.f34936V.z()) {
            this.f34936V.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f34938W;
    }

    public final boolean H0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f34935T1;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.w(view, i10, i11);
    }

    public final boolean I0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f34937V1;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.w(view, i10, i11);
    }

    public void J0(g gVar) {
        this.f34945b2.remove(gVar);
    }

    public final void K0(View view, z.a aVar, int i10) {
        AbstractC2082d0.h0(view, aVar, null, l0(i10));
    }

    public final void M0(SavedState savedState) {
        int i10 = this.f34942a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f34949f = savedState.f34979d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f34943b = savedState.f34980e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f34924J = savedState.f34981f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f34925K = savedState.f34982g;
        }
    }

    public final void N0(View view, Runnable runnable) {
        if (F0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void O0(boolean z10) {
        this.f34926L = z10;
    }

    public void P0(boolean z10) {
        this.f34927O = z10;
    }

    public void Q0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f34918D = i10;
        n1(this.f34931R, true);
    }

    public void R0(boolean z10) {
        if (this.f34943b == z10) {
            return;
        }
        this.f34943b = z10;
        if (this.f34972x1 != null) {
            d0();
        }
        d1((this.f34943b && this.f34931R == 6) ? 3 : this.f34931R);
        n1(this.f34931R, true);
        l1();
    }

    public void S0(boolean z10) {
        this.f34960o = z10;
    }

    public void T0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f34921G = f10;
        if (this.f34972x1 != null) {
            f0();
        }
    }

    public void U0(boolean z10) {
        if (this.f34924J != z10) {
            this.f34924J = z10;
            if (!z10 && this.f34931R == 5) {
                c1(4);
            }
            l1();
        }
    }

    public void V0(int i10) {
        this.f34958m = i10;
    }

    public void W0(int i10) {
        this.f34957l = i10;
    }

    public void X0(int i10) {
        Y0(i10, false);
    }

    public final void Y0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f34950g) {
                return;
            } else {
                this.f34950g = true;
            }
        } else {
            if (!this.f34950g && this.f34949f == i10) {
                return;
            }
            this.f34950g = false;
            this.f34949f = Math.max(0, i10);
        }
        p1(z10);
    }

    public void Z0(int i10) {
        this.f34942a = i10;
    }

    @Override // za.InterfaceC6951b
    public void a() {
        za.f fVar = this.f34963p2;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    public void a1(int i10) {
        this.f34948e = i10;
    }

    @Override // za.InterfaceC6951b
    public void b(C2035b c2035b) {
        za.f fVar = this.f34963p2;
        if (fVar == null) {
            return;
        }
        fVar.j(c2035b);
    }

    public final int b0(View view, int i10, int i11) {
        return AbstractC2082d0.c(view, view.getResources().getString(i10), l0(i11));
    }

    public void b1(boolean z10) {
        this.f34925K = z10;
    }

    @Override // za.InterfaceC6951b
    public void c(C2035b c2035b) {
        za.f fVar = this.f34963p2;
        if (fVar == null) {
            return;
        }
        fVar.l(c2035b);
    }

    public void c0(g gVar) {
        if (this.f34945b2.contains(gVar)) {
            return;
        }
        this.f34945b2.add(gVar);
    }

    public void c1(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.f34924J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f34943b && y0(i10) <= this.f34919E) ? 3 : i10;
        WeakReference weakReference = this.f34972x1;
        if (weakReference == null || weakReference.get() == null) {
            d1(i10);
        } else {
            View view = (View) this.f34972x1.get();
            N0(view, new a(view, i11));
        }
    }

    @Override // za.InterfaceC6951b
    public void d() {
        za.f fVar = this.f34963p2;
        if (fVar == null) {
            return;
        }
        C2035b c10 = fVar.c();
        if (c10 == null || Build.VERSION.SDK_INT < 34) {
            c1(this.f34924J ? 5 : 4);
        } else if (this.f34924J) {
            this.f34963p2.h(c10, new b());
        } else {
            this.f34963p2.i(c10, null);
            c1(4);
        }
    }

    public final void d0() {
        int h02 = h0();
        if (this.f34943b) {
            this.f34922H = Math.max(this.f34962p1 - h02, this.f34919E);
        } else {
            this.f34922H = this.f34962p1 - h02;
        }
    }

    public void d1(int i10) {
        View view;
        if (this.f34931R == i10) {
            return;
        }
        this.f34931R = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f34924J && i10 == 5)) {
            this.f34934T = i10;
        }
        WeakReference weakReference = this.f34972x1;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            o1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            o1(false);
        }
        n1(i10, true);
        for (int i11 = 0; i11 < this.f34945b2.size(); i11++) {
            ((g) this.f34945b2.get(i11)).c(view, i10);
        }
        l1();
    }

    public final float e0(float f10, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f11 = radius;
            if (f11 > 0.0f && f10 > 0.0f) {
                return f11 / f10;
            }
        }
        return 0.0f;
    }

    public final void e1(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || C0() || this.f34950g) ? false : true;
        if (this.f34961p || this.f34964q || this.f34965r || this.f34967t || this.f34968u || this.f34969v || z10) {
            o.c(view, new d(z10));
        }
    }

    public final void f0() {
        this.f34920F = (int) (this.f34962p1 * (1.0f - this.f34921G));
    }

    public boolean f1(long j10, float f10) {
        return false;
    }

    public final float g0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.f34955j == null || (weakReference = this.f34972x1) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f34972x1.get();
        if (!A0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float M10 = this.f34955j.M();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float e02 = e0(M10, roundedCorner);
        float N10 = this.f34955j.N();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(e02, e0(N10, roundedCorner2));
    }

    public final boolean g1() {
        if (this.f34936V != null) {
            return this.f34926L || this.f34931R == 1;
        }
        return false;
    }

    public final int h0() {
        int i10;
        return this.f34950g ? Math.min(Math.max(this.f34953h, this.f34962p1 - ((this.f34951g1 * 9) / 16)), this.f34944b1) + this.f34970w : (this.f34960o || this.f34961p || (i10 = this.f34959n) <= 0) ? this.f34949f + this.f34970w : Math.max(this.f34949f, i10 + this.f34954i);
    }

    public boolean h1(View view, float f10) {
        if (this.f34925K) {
            return true;
        }
        if (E0() && view.getTop() >= this.f34922H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f34941Z)) - ((float) this.f34922H)) / ((float) h0()) > 0.5f;
        }
        return false;
    }

    public final float i0(int i10) {
        float f10;
        float f11;
        int i11 = this.f34922H;
        if (i10 > i11 || i11 == s0()) {
            int i12 = this.f34922H;
            f10 = i12 - i10;
            f11 = this.f34962p1 - i12;
        } else {
            int i13 = this.f34922H;
            f10 = i13 - i10;
            f11 = i13 - s0();
        }
        return f10 / f11;
    }

    public boolean i1() {
        return false;
    }

    public final boolean j0() {
        return D0() && E0();
    }

    public boolean j1() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        super.k(fVar);
        this.f34972x1 = null;
        this.f34936V = null;
        this.f34963p2 = null;
    }

    public final void k0(View view, int i10) {
        if (view == null) {
            return;
        }
        AbstractC2082d0.f0(view, PKIFailureInfo.signerNotTrusted);
        AbstractC2082d0.f0(view, PKIFailureInfo.transactionIdInUse);
        AbstractC2082d0.f0(view, PKIFailureInfo.badCertTemplate);
        int i11 = this.f34932R4.get(i10, -1);
        if (i11 != -1) {
            AbstractC2082d0.f0(view, i11);
            this.f34932R4.delete(i10);
        }
    }

    public final void k1(View view, int i10, boolean z10) {
        int y02 = y0(i10);
        androidx.customview.widget.c cVar = this.f34936V;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), y02) : cVar.O(view.getLeft(), y02))) {
            d1(i10);
            return;
        }
        d1(2);
        n1(i10, true);
        this.f34916B.c(i10);
    }

    public final InterfaceC6837C l0(int i10) {
        return new f(i10);
    }

    public final void l1() {
        WeakReference weakReference = this.f34972x1;
        if (weakReference != null) {
            m1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f34975y1;
        if (weakReference2 != null) {
            m1((View) weakReference2.get(), 1);
        }
    }

    public final void m0(Context context) {
        if (this.f34977z == null) {
            return;
        }
        i iVar = new i(this.f34977z);
        this.f34955j = iVar;
        iVar.T(context);
        ColorStateList colorStateList = this.f34956k;
        if (colorStateList != null) {
            this.f34955j.f0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f34955j.setTint(typedValue.data);
    }

    public final void m1(View view, int i10) {
        if (view == null) {
            return;
        }
        k0(view, i10);
        if (!this.f34943b && this.f34931R != 6) {
            this.f34932R4.put(i10, b0(view, k.f48521a, 6));
        }
        if (this.f34924J && E0() && this.f34931R != 5) {
            K0(view, z.a.f68239y, 5);
        }
        int i11 = this.f34931R;
        if (i11 == 3) {
            K0(view, z.a.f68238x, this.f34943b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            K0(view, z.a.f68237w, this.f34943b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            K0(view, z.a.f68238x, 4);
            K0(view, z.a.f68237w, 3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void n() {
        super.n();
        this.f34972x1 = null;
        this.f34936V = null;
        this.f34963p2 = null;
    }

    public final void n0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(g0(), 1.0f);
        this.f34917C = ofFloat;
        ofFloat.setDuration(500L);
        this.f34917C.addUpdateListener(new c());
    }

    public final void n1(int i10, boolean z10) {
        boolean B02;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f34915A == (B02 = B0()) || this.f34955j == null) {
            return;
        }
        this.f34915A = B02;
        if (!z10 || (valueAnimator = this.f34917C) == null) {
            ValueAnimator valueAnimator2 = this.f34917C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f34917C.cancel();
            }
            this.f34955j.g0(this.f34915A ? g0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f34917C.reverse();
        } else {
            this.f34917C.setFloatValues(this.f34955j.C(), B02 ? g0() : 1.0f);
            this.f34917C.start();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        androidx.customview.widget.c cVar;
        if (!view.isShown() || !this.f34926L) {
            this.f34938W = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            L0();
        }
        if (this.f34952g2 == null) {
            this.f34952g2 = VelocityTracker.obtain();
        }
        this.f34952g2.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f34976y2 = y10;
            if (this.f34931R != 2 && I0(coordinatorLayout, x10, y10)) {
                this.f34973x2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!H0(coordinatorLayout, x10, this.f34976y2)) {
                    this.f34929P4 = true;
                }
            }
            this.f34938W = this.f34973x2 == -1 && !coordinatorLayout.w(view, x10, this.f34976y2);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34929P4 = false;
            this.f34973x2 = -1;
            if (this.f34938W) {
                this.f34938W = false;
                return false;
            }
        }
        if (!this.f34938W && (cVar = this.f34936V) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f34937V1;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.f34938W || this.f34931R == 1 || coordinatorLayout.w(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f34936V == null || (i10 = this.f34976y2) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f34936V.z())) ? false : true;
    }

    public void o0(int i10) {
        View view = (View) this.f34972x1.get();
        if (view == null || this.f34945b2.isEmpty()) {
            return;
        }
        float i02 = i0(i10);
        for (int i11 = 0; i11 < this.f34945b2.size(); i11++) {
            ((g) this.f34945b2.get(i11)).b(view, i02);
        }
    }

    public final void o1(boolean z10) {
        Map map;
        WeakReference weakReference = this.f34972x1;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f34930Q4 != null) {
                    return;
                } else {
                    this.f34930Q4 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f34972x1.get()) {
                    if (z10) {
                        this.f34930Q4.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f34946c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f34946c && (map = this.f34930Q4) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f34930Q4.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f34930Q4 = null;
            } else if (this.f34946c) {
                ((View) this.f34972x1.get()).sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f34972x1 == null) {
            this.f34953h = coordinatorLayout.getResources().getDimensionPixelSize(ia.e.f48348j);
            e1(view);
            AbstractC2082d0.E0(view, new C5690c(view));
            this.f34972x1 = new WeakReference(view);
            this.f34963p2 = new za.f(view);
            i iVar = this.f34955j;
            if (iVar != null) {
                view.setBackground(iVar);
                i iVar2 = this.f34955j;
                float f10 = this.f34923I;
                if (f10 == -1.0f) {
                    f10 = view.getElevation();
                }
                iVar2.e0(f10);
            } else {
                ColorStateList colorStateList = this.f34956k;
                if (colorStateList != null) {
                    AbstractC2082d0.q0(view, colorStateList);
                }
            }
            l1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f34936V == null) {
            this.f34936V = androidx.customview.widget.c.o(coordinatorLayout, this.f34933S4);
        }
        int top = view.getTop();
        coordinatorLayout.E(view, i10);
        this.f34951g1 = coordinatorLayout.getWidth();
        this.f34962p1 = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f34944b1 = height;
        int i11 = this.f34962p1;
        int i12 = i11 - height;
        int i13 = this.f34971x;
        if (i12 < i13) {
            if (this.f34966s) {
                int i14 = this.f34958m;
                if (i14 != -1) {
                    i11 = Math.min(i11, i14);
                }
                this.f34944b1 = i11;
            } else {
                int i15 = i11 - i13;
                int i16 = this.f34958m;
                if (i16 != -1) {
                    i15 = Math.min(i15, i16);
                }
                this.f34944b1 = i15;
            }
        }
        this.f34919E = Math.max(0, this.f34962p1 - this.f34944b1);
        f0();
        d0();
        int i17 = this.f34931R;
        if (i17 == 3) {
            AbstractC2082d0.W(view, s0());
        } else if (i17 == 6) {
            AbstractC2082d0.W(view, this.f34920F);
        } else if (this.f34924J && i17 == 5) {
            AbstractC2082d0.W(view, this.f34962p1);
        } else if (i17 == 4) {
            AbstractC2082d0.W(view, this.f34922H);
        } else if (i17 == 1 || i17 == 2) {
            AbstractC2082d0.W(view, top - view.getTop());
        }
        n1(this.f34931R, false);
        this.f34937V1 = new WeakReference(p0(view));
        for (int i18 = 0; i18 < this.f34945b2.size(); i18++) {
            ((g) this.f34945b2.get(i18)).a(view);
        }
        return true;
    }

    public View p0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View p02 = p0(viewGroup.getChildAt(i10));
                if (p02 != null) {
                    return p02;
                }
            }
        }
        return null;
    }

    public final void p1(boolean z10) {
        View view;
        if (this.f34972x1 != null) {
            d0();
            if (this.f34931R != 4 || (view = (View) this.f34972x1.get()) == null) {
                return;
            }
            if (z10) {
                c1(4);
            } else {
                view.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(r0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f34957l, marginLayoutParams.width), r0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f34958m, marginLayoutParams.height));
        return true;
    }

    public final int r0(int i10, int i11, int i12, int i13) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return G0() && (weakReference = this.f34937V1) != null && view2 == weakReference.get() && (!(this.f34931R == 3 || this.f34928P) || super.s(coordinatorLayout, view, view2, f10, f11));
    }

    public int s0() {
        if (this.f34943b) {
            return this.f34919E;
        }
        return Math.max(this.f34918D, this.f34966s ? 0 : this.f34971x);
    }

    public float t0() {
        return this.f34921G;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f34937V1;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!G0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.f34940Y && !this.f34927O && view2 == view3 && view2.canScrollVertically(1)) {
                    this.f34928P = true;
                    return;
                }
                if (i13 < s0()) {
                    int s02 = top - s0();
                    iArr[1] = s02;
                    AbstractC2082d0.W(view, -s02);
                    d1(3);
                } else {
                    if (!this.f34926L) {
                        return;
                    }
                    iArr[1] = i11;
                    AbstractC2082d0.W(view, -i11);
                    d1(1);
                }
            } else if (i11 < 0) {
                boolean canScrollVertically = view2.canScrollVertically(-1);
                if (!this.f34940Y && !this.f34927O && view2 == view3 && canScrollVertically) {
                    this.f34928P = true;
                    return;
                }
                if (!canScrollVertically) {
                    if (i13 > this.f34922H && !j0()) {
                        int i14 = top - this.f34922H;
                        iArr[1] = i14;
                        AbstractC2082d0.W(view, -i14);
                        d1(4);
                    } else {
                        if (!this.f34926L) {
                            return;
                        }
                        iArr[1] = i11;
                        AbstractC2082d0.W(view, -i11);
                        d1(1);
                    }
                }
            }
            o0(view.getTop());
            this.f34939X = i11;
            this.f34940Y = true;
            this.f34928P = false;
        }
    }

    public i u0() {
        return this.f34955j;
    }

    public int v0() {
        return this.f34958m;
    }

    public int w0() {
        if (this.f34950g) {
            return -1;
        }
        return this.f34949f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public int x0() {
        return this.f34931R;
    }

    public final int y0(int i10) {
        if (i10 == 3) {
            return s0();
        }
        if (i10 == 4) {
            return this.f34922H;
        }
        if (i10 == 5) {
            return this.f34962p1;
        }
        if (i10 == 6) {
            return this.f34920F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    public final float z0() {
        VelocityTracker velocityTracker = this.f34952g2;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f34947d);
        return this.f34952g2.getYVelocity(this.f34973x2);
    }

    public class h {

        /* renamed from: a, reason: collision with root package name */
        public int f34994a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f34995b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f34996c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f34995b = false;
                androidx.customview.widget.c cVar = BottomSheetBehavior.this.f34936V;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f34994a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f34931R == 2) {
                    bottomSheetBehavior.d1(hVar2.f34994a);
                }
            }
        }

        public h() {
            this.f34996c = new a();
        }

        public void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.f34972x1;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f34994a = i10;
            if (this.f34995b) {
                return;
            }
            ((View) BottomSheetBehavior.this.f34972x1.get()).postOnAnimation(this.f34996c);
            this.f34995b = true;
        }

        public /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public final int f34978c;

        /* renamed from: d, reason: collision with root package name */
        public int f34979d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f34980e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f34981f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f34982g;

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
            this.f34978c = parcel.readInt();
            this.f34979d = parcel.readInt();
            this.f34980e = parcel.readInt() == 1;
            this.f34981f = parcel.readInt() == 1;
            this.f34982g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f34978c);
            parcel.writeInt(this.f34979d);
            parcel.writeInt(this.f34980e ? 1 : 0);
            parcel.writeInt(this.f34981f ? 1 : 0);
            parcel.writeInt(this.f34982g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f34978c = bottomSheetBehavior.f34931R;
            this.f34979d = bottomSheetBehavior.f34949f;
            this.f34980e = bottomSheetBehavior.f34943b;
            this.f34981f = bottomSheetBehavior.f34924J;
            this.f34982g = bottomSheetBehavior.f34925K;
        }
    }

    public BottomSheetBehavior(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f34942a = 0;
        this.f34943b = true;
        this.f34946c = false;
        this.f34957l = -1;
        this.f34958m = -1;
        this.f34916B = new h(this, null);
        this.f34921G = 0.5f;
        this.f34923I = -1.0f;
        this.f34926L = true;
        this.f34927O = true;
        this.f34931R = 4;
        this.f34934T = 4;
        this.f34941Z = 0.1f;
        this.f34945b2 = new ArrayList();
        this.f34976y2 = -1;
        this.f34932R4 = new SparseIntArray();
        this.f34933S4 = new e();
        this.f34954i = context.getResources().getDimensionPixelSize(ia.e.f48373v0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.BottomSheetBehavior_Layout);
        if (obtainStyledAttributes.hasValue(m.f48921i0)) {
            this.f34956k = Ca.c.a(context, obtainStyledAttributes, m.f48921i0);
        }
        if (obtainStyledAttributes.hasValue(m.f48599B0)) {
            this.f34977z = n.e(context, attributeSet, ia.c.f48230e, f34914T4).m();
        }
        m0(context);
        n0();
        this.f34923I = obtainStyledAttributes.getDimension(m.f48911h0, -1.0f);
        if (obtainStyledAttributes.hasValue(m.f48891f0)) {
            W0(obtainStyledAttributes.getDimensionPixelSize(m.f48891f0, -1));
        }
        if (obtainStyledAttributes.hasValue(m.f48901g0)) {
            V0(obtainStyledAttributes.getDimensionPixelSize(m.f48901g0, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(m.f48991p0);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            X0(i10);
        } else {
            X0(obtainStyledAttributes.getDimensionPixelSize(m.f48991p0, -1));
        }
        U0(obtainStyledAttributes.getBoolean(m.f48981o0, false));
        S0(obtainStyledAttributes.getBoolean(m.f49031t0, false));
        R0(obtainStyledAttributes.getBoolean(m.f48961m0, true));
        b1(obtainStyledAttributes.getBoolean(m.f49021s0, false));
        O0(obtainStyledAttributes.getBoolean(m.f48931j0, true));
        P0(obtainStyledAttributes.getBoolean(m.f48941k0, true));
        Z0(obtainStyledAttributes.getInt(m.f49001q0, 0));
        T0(obtainStyledAttributes.getFloat(m.f48971n0, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(m.f48951l0);
        if (peekValue2 != null && peekValue2.type == 16) {
            Q0(peekValue2.data);
        } else {
            Q0(obtainStyledAttributes.getDimensionPixelOffset(m.f48951l0, 0));
        }
        a1(obtainStyledAttributes.getInt(m.f49011r0, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION));
        this.f34961p = obtainStyledAttributes.getBoolean(m.f49071x0, false);
        this.f34964q = obtainStyledAttributes.getBoolean(m.f49081y0, false);
        this.f34965r = obtainStyledAttributes.getBoolean(m.f49091z0, false);
        this.f34966s = obtainStyledAttributes.getBoolean(m.f48589A0, true);
        this.f34967t = obtainStyledAttributes.getBoolean(m.f49041u0, false);
        this.f34968u = obtainStyledAttributes.getBoolean(m.f49051v0, false);
        this.f34969v = obtainStyledAttributes.getBoolean(m.f49061w0, false);
        this.f34974y = obtainStyledAttributes.getBoolean(m.f48609C0, true);
        obtainStyledAttributes.recycle();
        this.f34947d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
