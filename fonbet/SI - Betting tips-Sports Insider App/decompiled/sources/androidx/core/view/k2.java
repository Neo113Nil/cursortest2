package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f1348b;

    /* renamed from: a, reason: collision with root package name */
    public final h2 f1349a;

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            f1348b = g2.f1323s;
        } else if (i5 >= 30) {
            f1348b = e2.f1308r;
        } else {
            f1348b = h2.f1325b;
        }
    }

    public k2(WindowInsets windowInsets) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            this.f1349a = new g2(this, windowInsets);
            return;
        }
        if (i5 >= 31) {
            this.f1349a = new f2(this, windowInsets);
            return;
        }
        if (i5 >= 30) {
            this.f1349a = new e2(this, windowInsets);
            return;
        }
        if (i5 >= 29) {
            this.f1349a = new d2(this, windowInsets);
        } else if (i5 >= 28) {
            this.f1349a = new c2(this, windowInsets);
        } else {
            this.f1349a = new b2(this, windowInsets);
        }
    }

    public static g0.d e(g0.d dVar, int i5, int i10, int i11, int i12) {
        int max = Math.max(0, dVar.f9676a - i5);
        int max2 = Math.max(0, dVar.f9677b - i10);
        int max3 = Math.max(0, dVar.f9678c - i11);
        int max4 = Math.max(0, dVar.f9679d - i12);
        return (max == i5 && max2 == i10 && max3 == i11 && max4 == i12) ? dVar : g0.d.c(max, max2, max3, max4);
    }

    public static k2 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k2 k2Var = new k2(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = z0.f1413a;
            k2 a7 = r0.a(view);
            h2 h2Var = k2Var.f1349a;
            h2Var.q(a7);
            h2Var.d(view.getRootView());
            h2Var.s(view.getWindowSystemUiVisibility());
        }
        return k2Var;
    }

    public final int a() {
        return this.f1349a.k().f9679d;
    }

    public final int b() {
        return this.f1349a.k().f9676a;
    }

    public final int c() {
        return this.f1349a.k().f9678c;
    }

    public final int d() {
        return this.f1349a.k().f9677b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k2) {
            return Objects.equals(this.f1349a, ((k2) obj).f1349a);
        }
        return false;
    }

    public final k2 f(int i5, int i10, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        z1 y1Var = i13 >= 34 ? new y1(this) : i13 >= 31 ? new x1(this) : i13 >= 30 ? new w1(this) : i13 >= 29 ? new v1(this) : new t1(this);
        y1Var.g(g0.d.c(i5, i10, i11, i12));
        return y1Var.b();
    }

    public final WindowInsets g() {
        h2 h2Var = this.f1349a;
        if (h2Var instanceof a2) {
            return ((a2) h2Var).f1286c;
        }
        return null;
    }

    public final int hashCode() {
        h2 h2Var = this.f1349a;
        if (h2Var == null) {
            return 0;
        }
        return h2Var.hashCode();
    }

    public k2() {
        this.f1349a = new h2(this);
    }
}
