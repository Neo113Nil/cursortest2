package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a2 extends h2 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f1282i = false;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f1283k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f1284l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f1285m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1286c;

    /* renamed from: d, reason: collision with root package name */
    public g0.d[] f1287d;

    /* renamed from: e, reason: collision with root package name */
    public g0.d f1288e;

    /* renamed from: f, reason: collision with root package name */
    public k2 f1289f;

    /* renamed from: g, reason: collision with root package name */
    public g0.d f1290g;

    /* renamed from: h, reason: collision with root package name */
    public int f1291h;

    public a2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var);
        this.f1288e = null;
        this.f1286c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private g0.d t(int i5, boolean z5) {
        g0.d dVar = g0.d.f9675e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i5 & i10) != 0) {
                dVar = g0.d.a(dVar, u(i10, z5));
            }
        }
        return dVar;
    }

    private g0.d v() {
        k2 k2Var = this.f1289f;
        return k2Var != null ? k2Var.f1349a.i() : g0.d.f9675e;
    }

    private g0.d w(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f1282i) {
            x();
        }
        Method method = j;
        if (method != null && f1283k != null && f1284l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    io.sentry.android.core.w0.n("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f1284l.get(f1285m.get(invoke));
                if (rect != null) {
                    return g0.d.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e7) {
                io.sentry.android.core.w0.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void x() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1283k = cls;
            f1284l = cls.getDeclaredField("mVisibleInsets");
            f1285m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1284l.setAccessible(true);
            f1285m.setAccessible(true);
        } catch (ReflectiveOperationException e7) {
            io.sentry.android.core.w0.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
        }
        f1282i = true;
    }

    public static boolean z(int i5, int i10) {
        return (i5 & 6) == (i10 & 6);
    }

    @Override // androidx.core.view.h2
    public void d(View view) {
        g0.d w10 = w(view);
        if (w10 == null) {
            w10 = g0.d.f9675e;
        }
        y(w10);
    }

    @Override // androidx.core.view.h2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Objects.equals(this.f1290g, a2Var.f1290g) && z(this.f1291h, a2Var.f1291h);
    }

    @Override // androidx.core.view.h2
    public g0.d f(int i5) {
        return t(i5, false);
    }

    @Override // androidx.core.view.h2
    public g0.d g(int i5) {
        return t(i5, true);
    }

    @Override // androidx.core.view.h2
    public final g0.d k() {
        if (this.f1288e == null) {
            WindowInsets windowInsets = this.f1286c;
            this.f1288e = g0.d.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1288e;
    }

    @Override // androidx.core.view.h2
    public k2 m(int i5, int i10, int i11, int i12) {
        k2 h10 = k2.h(null, this.f1286c);
        int i13 = Build.VERSION.SDK_INT;
        z1 y1Var = i13 >= 34 ? new y1(h10) : i13 >= 31 ? new x1(h10) : i13 >= 30 ? new w1(h10) : i13 >= 29 ? new v1(h10) : new t1(h10);
        y1Var.g(k2.e(k(), i5, i10, i11, i12));
        y1Var.e(k2.e(i(), i5, i10, i11, i12));
        return y1Var.b();
    }

    @Override // androidx.core.view.h2
    public boolean o() {
        return this.f1286c.isRound();
    }

    @Override // androidx.core.view.h2
    public void p(g0.d[] dVarArr) {
        this.f1287d = dVarArr;
    }

    @Override // androidx.core.view.h2
    public void q(k2 k2Var) {
        this.f1289f = k2Var;
    }

    @Override // androidx.core.view.h2
    public void s(int i5) {
        this.f1291h = i5;
    }

    public g0.d u(int i5, boolean z5) {
        g0.d i10;
        int i11;
        g0.d dVar = g0.d.f9675e;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 8) {
                    g0.d[] dVarArr = this.f1287d;
                    i10 = dVarArr != null ? dVarArr[ci.c.A(8)] : null;
                    if (i10 != null) {
                        return i10;
                    }
                    g0.d k6 = k();
                    g0.d v5 = v();
                    int i12 = k6.f9679d;
                    if (i12 > v5.f9679d) {
                        return g0.d.c(0, 0, 0, i12);
                    }
                    g0.d dVar2 = this.f1290g;
                    if (dVar2 != null && !dVar2.equals(dVar) && (i11 = this.f1290g.f9679d) > v5.f9679d) {
                        return g0.d.c(0, 0, 0, i11);
                    }
                } else {
                    if (i5 == 16) {
                        return j();
                    }
                    if (i5 == 32) {
                        return h();
                    }
                    if (i5 == 64) {
                        return l();
                    }
                    if (i5 == 128) {
                        k2 k2Var = this.f1289f;
                        l e7 = k2Var != null ? k2Var.f1349a.e() : e();
                        if (e7 != null) {
                            int i13 = Build.VERSION.SDK_INT;
                            return g0.d.c(i13 >= 28 ? k.j(e7.f1350a) : 0, i13 >= 28 ? k.l(e7.f1350a) : 0, i13 >= 28 ? k.k(e7.f1350a) : 0, i13 >= 28 ? k.i(e7.f1350a) : 0);
                        }
                    }
                }
            } else {
                if (z5) {
                    g0.d v10 = v();
                    g0.d i14 = i();
                    return g0.d.c(Math.max(v10.f9676a, i14.f9676a), 0, Math.max(v10.f9678c, i14.f9678c), Math.max(v10.f9679d, i14.f9679d));
                }
                if ((this.f1291h & 2) == 0) {
                    g0.d k9 = k();
                    k2 k2Var2 = this.f1289f;
                    i10 = k2Var2 != null ? k2Var2.f1349a.i() : null;
                    int i15 = k9.f9679d;
                    if (i10 != null) {
                        i15 = Math.min(i15, i10.f9679d);
                    }
                    return g0.d.c(k9.f9676a, 0, k9.f9678c, i15);
                }
            }
        } else {
            if (z5) {
                return g0.d.c(0, Math.max(v().f9677b, k().f9677b), 0, 0);
            }
            if ((this.f1291h & 4) == 0) {
                return g0.d.c(0, k().f9677b, 0, 0);
            }
        }
        return dVar;
    }

    public void y(g0.d dVar) {
        this.f1290g = dVar;
    }
}
