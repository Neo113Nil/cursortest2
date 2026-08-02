package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n71 {
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final ViewGroup g;
    public final Context h;
    public final m71 i;
    public final yp3 j;
    public int k;
    public k71 l;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public ArrayList u;
    public final AccessibilityManager v;
    public static final qq7 x = e80.b;
    public static final LinearInterpolator y = e80.a;
    public static final qq7 z = e80.d;
    public static final int[] B = {R.attr.snackbarStyle};
    public static final Handler A = new Handler(Looper.getMainLooper(), new h71(0));
    public final i71 m = new i71(this, 0);
    public final j71 w = new j71(this);

    public n71(Context context, ViewGroup viewGroup, View view, yp3 yp3Var) {
        if (view == null) {
            a70.p("Transient bottom bar must have non-null content");
            throw null;
        }
        if (yp3Var == null) {
            a70.p("Transient bottom bar must have non-null callback");
            throw null;
        }
        this.g = viewGroup;
        this.j = yp3Var;
        this.h = context;
        m6k.x(context, "Theme.AppCompat", m6k.e);
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        m71 m71Var = (m71) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.i = m71Var;
        m71Var.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float actionTextColorAlpha = m71Var.getActionTextColorAlpha();
            if (actionTextColorAlpha != 1.0f) {
                snackbarContentLayout.b.setTextColor(o3a.J(actionTextColorAlpha, o3a.O(snackbarContentLayout.getContext(), x2a.O(R.attr.colorSurface, snackbarContentLayout)), snackbarContentLayout.b.getCurrentTextColor()));
            }
            snackbarContentLayout.setMaxInlineActionWidth(m71Var.getMaxInlineActionWidth());
        }
        m71Var.addView(view);
        m71Var.setAccessibilityLiveRegion(1);
        m71Var.setImportantForAccessibility(1);
        m71Var.setFitsSystemWindows(true);
        sa0 sa0Var = new sa0(this, 3);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(m71Var, sa0Var);
        bsk.q(m71Var, new euk(this, 1));
        this.v = (AccessibilityManager) context.getSystemService("accessibility");
        this.c = x2a.M(context, R.attr.motionDurationLong2, 250);
        this.a = x2a.M(context, R.attr.motionDurationLong2, 150);
        this.b = x2a.M(context, R.attr.motionDurationMedium1, 75);
        this.d = yfa.E(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.f = yfa.E(context, R.attr.motionEasingEmphasizedInterpolator, z);
        this.e = yfa.E(context, R.attr.motionEasingEmphasizedInterpolator, x);
    }

    public void a() {
        b(3);
    }

    public final void b(int i) {
        ujg O = ujg.O();
        j71 j71Var = this.w;
        synchronized (O.b) {
            try {
                if (O.S(j71Var)) {
                    O.K((jmh) O.d, i);
                } else {
                    jmh jmhVar = (jmh) O.e;
                    if ((jmhVar == null || j71Var == null || jmhVar.a.get() != j71Var) ? false : true) {
                        O.K((jmh) O.e, i);
                    }
                }
            } finally {
            }
        }
    }

    public final View c() {
        k71 k71Var = this.l;
        if (k71Var == null) {
            return null;
        }
        return (View) k71Var.b.get();
    }

    public int d() {
        return this.k;
    }

    public final void e() {
        WindowInsets rootWindowInsets;
        int i;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.i.getRootWindowInsets()) == null) {
            return;
        }
        i = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        this.r = i;
        k();
    }

    public final void f(int i) {
        ujg O = ujg.O();
        j71 j71Var = this.w;
        synchronized (O.b) {
            try {
                if (O.S(j71Var)) {
                    O.d = null;
                    if (((jmh) O.e) != null) {
                        O.e0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                k94 k94Var = (k94) this.u.get(size);
                k94Var.getClass();
                if (i == 2 || i == 4) {
                    k94Var.a.invoke();
                }
            }
        }
        ViewParent parent = this.i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.i);
        }
    }

    public final void g() {
        ujg O = ujg.O();
        j71 j71Var = this.w;
        synchronized (O.b) {
            try {
                if (O.S(j71Var)) {
                    O.c0((jmh) O.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k94) this.u.get(size)).getClass();
            }
        }
    }

    public final void h(View view) {
        k71 k71Var = this.l;
        if (k71Var != null) {
            k71Var.a();
        }
        k71 k71Var2 = new k71(this, view);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(k71Var2);
        }
        view.addOnAttachStateChangeListener(k71Var2);
        this.l = k71Var2;
    }

    public void i() {
        ujg O = ujg.O();
        int d = d();
        j71 j71Var = this.w;
        synchronized (O.b) {
            try {
                if (O.S(j71Var)) {
                    jmh jmhVar = (jmh) O.d;
                    jmhVar.b = d;
                    ((Handler) O.c).removeCallbacksAndMessages(jmhVar);
                    O.c0((jmh) O.d);
                    return;
                }
                jmh jmhVar2 = (jmh) O.e;
                if ((jmhVar2 == null || j71Var == null || jmhVar2.a.get() != j71Var) ? false : true) {
                    ((jmh) O.e).b = d;
                } else {
                    O.e = new jmh(d, j71Var);
                }
                jmh jmhVar3 = (jmh) O.d;
                if (jmhVar3 == null || !O.K(jmhVar3, 4)) {
                    O.d = null;
                    O.e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        AccessibilityManager accessibilityManager = this.v;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z2 = false;
        }
        m71 m71Var = this.i;
        if (z2) {
            m71Var.post(new i71(this, 2));
            return;
        }
        if (m71Var.getParent() != null) {
            m71Var.setVisibility(0);
        }
        g();
    }

    public final void k() {
        m71 m71Var = this.i;
        ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || m71Var.j == null || m71Var.getParent() == null) {
            return;
        }
        int i = c() != null ? this.q : this.n;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = m71Var.j;
        int i2 = rect.bottom + i;
        int i3 = rect.left + this.o;
        int i4 = rect.right + this.p;
        int i5 = rect.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            m71Var.requestLayout();
        }
        if ((z2 || this.s != this.r) && Build.VERSION.SDK_INT >= 29 && this.r > 0) {
            ViewGroup.LayoutParams layoutParams2 = m71Var.getLayoutParams();
            if ((layoutParams2 instanceof xs3) && (((xs3) layoutParams2).a instanceof SwipeDismissBehavior) && c() == null) {
                i71 i71Var = this.m;
                m71Var.removeCallbacks(i71Var);
                m71Var.post(i71Var);
            }
        }
    }
}
