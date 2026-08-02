package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.C2075a;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.shape.i;
import ia.g;
import ia.l;
import m.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sa.AbstractC6344a;
import xa.o;
import y0.z;
import za.C6952c;

/* loaded from: classes3.dex */
public class a extends r {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f34999f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f35000g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f35001h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f35002i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f35003j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f35004k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f35005l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f35006m;

    /* renamed from: n, reason: collision with root package name */
    public f f35007n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35008o;

    /* renamed from: p, reason: collision with root package name */
    public C6952c f35009p;

    /* renamed from: q, reason: collision with root package name */
    public BottomSheetBehavior.g f35010q;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    public class C0495a implements J {
        public C0495a() {
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            if (a.this.f35007n != null) {
                a.this.f34999f.J0(a.this.f35007n);
            }
            if (f02 != null) {
                a aVar = a.this;
                aVar.f35007n = new f(aVar.f35002i, f02, null);
                a.this.f35007n.e(a.this.getWindow());
                a.this.f34999f.c0(a.this.f35007n);
            }
            return f02;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f35004k && aVar.isShowing() && a.this.r()) {
                a.this.cancel();
            }
        }
    }

    public class c extends C2075a {
        public c() {
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, z zVar) {
            super.onInitializeAccessibilityNodeInfo(view, zVar);
            if (!a.this.f35004k) {
                zVar.B0(false);
            } else {
                zVar.a(PKIFailureInfo.badCertTemplate);
                zVar.B0(true);
            }
        }

        @Override // androidx.core.view.C2075a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f35004k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class e extends BottomSheetBehavior.g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    public static class f extends BottomSheetBehavior.g {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f35016a;

        /* renamed from: b, reason: collision with root package name */
        public final F0 f35017b;

        /* renamed from: c, reason: collision with root package name */
        public Window f35018c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f35019d;

        public /* synthetic */ f(View view, F0 f02, C0495a c0495a) {
            this(view, f02);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i10) {
            d(view);
        }

        public final void d(View view) {
            if (view.getTop() < this.f35017b.m()) {
                Window window = this.f35018c;
                if (window != null) {
                    Boolean bool = this.f35016a;
                    xa.c.f(window, bool == null ? this.f35019d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f35017b.m() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f35018c;
                if (window2 != null) {
                    xa.c.f(window2, this.f35019d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        public void e(Window window) {
            if (this.f35018c == window) {
                return;
            }
            this.f35018c = window;
            if (window != null) {
                this.f35019d = AbstractC2109r0.a(window, window.getDecorView()).c();
            }
        }

        public f(View view, F0 f02) {
            this.f35017b = f02;
            i u02 = BottomSheetBehavior.q0(view).u0();
            ColorStateList B10 = u02 != null ? u02.B() : view.getBackgroundTintList();
            if (B10 != null) {
                this.f35016a = Boolean.valueOf(AbstractC6344a.h(B10.getDefaultColor()));
                return;
            }
            Integer e10 = o.e(view);
            if (e10 != null) {
                this.f35016a = Boolean.valueOf(AbstractC6344a.h(e10.intValue()));
            } else {
                this.f35016a = null;
            }
        }
    }

    public a(Context context, int i10) {
        super(context, f(context, i10));
        this.f35004k = true;
        this.f35005l = true;
        this.f35010q = new e();
        h(1);
        p();
    }

    public static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(ia.c.f48228d, typedValue, true) ? typedValue.resourceId : l.f48569h;
    }

    private void p() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{ia.c.f48272z});
        this.f35008o = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior n10 = n();
        if (!this.f35003j || n10.x0() == 5) {
            super.cancel();
        } else {
            n10.c1(5);
        }
    }

    public final FrameLayout m() {
        if (this.f35000g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), ia.i.f48469b, null);
            this.f35000g = frameLayout;
            this.f35001h = (CoordinatorLayout) frameLayout.findViewById(g.f48427e);
            FrameLayout frameLayout2 = (FrameLayout) this.f35000g.findViewById(g.f48429f);
            this.f35002i = frameLayout2;
            BottomSheetBehavior q02 = BottomSheetBehavior.q0(frameLayout2);
            this.f34999f = q02;
            q02.c0(this.f35010q);
            this.f34999f.U0(this.f35004k);
            this.f35009p = new C6952c(this.f34999f, this.f35002i);
        }
        return this.f35000g;
    }

    public BottomSheetBehavior n() {
        if (this.f34999f == null) {
            m();
        }
        return this.f34999f;
    }

    public boolean o() {
        return this.f35003j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f35008o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f35000g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f35001h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            AbstractC2109r0.b(window, !z10);
            f fVar = this.f35007n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        s();
    }

    @Override // m.r, androidx.activity.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f35007n;
        if (fVar != null) {
            fVar.e(null);
        }
        C6952c c6952c = this.f35009p;
        if (c6952c != null) {
            c6952c.d();
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f34999f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.x0() != 5) {
            return;
        }
        this.f34999f.c1(4);
    }

    public void q() {
        this.f34999f.J0(this.f35010q);
    }

    public boolean r() {
        if (!this.f35006m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f35005l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f35006m = true;
        }
        return this.f35005l;
    }

    public final void s() {
        C6952c c6952c = this.f35009p;
        if (c6952c == null) {
            return;
        }
        if (this.f35004k) {
            c6952c.b();
        } else {
            c6952c.d();
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f35004k != z10) {
            this.f35004k = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f34999f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.U0(z10);
            }
            if (getWindow() != null) {
                s();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f35004k) {
            this.f35004k = true;
        }
        this.f35005l = z10;
        this.f35006m = true;
    }

    @Override // m.r, androidx.activity.q, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(t(i10, null, null));
    }

    public final View t(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f35000g.findViewById(g.f48427e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f35008o) {
            AbstractC2082d0.x0(this.f35000g, new C0495a());
        }
        this.f35002i.removeAllViews();
        if (layoutParams == null) {
            this.f35002i.addView(view);
        } else {
            this.f35002i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(g.f48446n0).setOnClickListener(new b());
        AbstractC2082d0.l0(this.f35002i, new c());
        this.f35002i.setOnTouchListener(new d());
        return this.f35000g;
    }

    @Override // m.r, androidx.activity.q, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(t(0, view, null));
    }

    @Override // m.r, androidx.activity.q, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(t(0, view, layoutParams));
    }
}
