package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class m9l extends u9l {
    public static boolean n = false;
    public static Method o;
    public static Class p;
    public static Field q;
    public static Field r;
    public final WindowInsets c;
    public u4a[] d;
    public u4a e;
    public x9l f;
    public u4a g;
    public int h;
    public h55 i;
    public int j;
    public int k;
    public Rect[][] l;
    public Rect[][] m;

    public m9l(x9l x9lVar, WindowInsets windowInsets) {
        super(x9lVar);
        this.e = null;
        this.l = new Rect[10][];
        this.m = new Rect[10][];
        this.c = windowInsets;
    }

    private h55 D(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.a.a.t()) {
            return h55.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        m7g n2 = qz.n(display, 0);
        m7g n3 = qz.n(display, 1);
        m7g n4 = qz.n(display, 2);
        m7g n5 = qz.n(display, 3);
        return h55.a(point.x, point.y, false, n2 != null ? n2.b : 0, n3 != null ? n3.b : 0, n4 != null ? n4.b : 0, n5 != null ? n5.b : 0);
    }

    private static List<Rect> E(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[oea.o(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] F(u4a u4aVar) {
        ArrayList arrayList = new ArrayList();
        int i = u4aVar.a;
        int i2 = u4aVar.d;
        int i3 = u4aVar.c;
        int i4 = u4aVar.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, u4aVar.a, this.j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.k, i4));
        }
        if (i3 != 0) {
            int i5 = this.k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.j));
        }
        if (i2 != 0) {
            int i6 = this.j;
            arrayList.add(new Rect(0, i6 - i2, this.k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private u4a G(int i, boolean z) {
        u4a u4aVar = u4a.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                u4aVar = u4a.a(u4aVar, H(i2, z));
            }
        }
        return u4aVar;
    }

    private u4a I() {
        x9l x9lVar = this.f;
        return x9lVar != null ? x9lVar.a.l() : u4a.e;
    }

    private u4a J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            a70.m("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!n) {
            L();
        }
        Method method = o;
        if (method != null && p != null && q != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) q.get(r.get(invoke));
                if (rect != null) {
                    return u4a.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static void L() {
        try {
            o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            p = cls;
            q = cls.getDeclaredField("mVisibleInsets");
            r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            q.setAccessible(true);
            r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        n = true;
    }

    public static boolean M(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // defpackage.u9l
    public void A(int i) {
        this.h = i;
    }

    @Override // defpackage.u9l
    public void B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.u9l
    public void C(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.m = (Rect[][]) rectArr.clone();
    }

    public u4a H(int i, boolean z) {
        u4a l;
        int i2;
        u4a u4aVar = u4a.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    u4a[] u4aVarArr = this.d;
                    l = u4aVarArr != null ? u4aVarArr[oea.o(8)] : null;
                    if (l != null) {
                        return l;
                    }
                    u4a n2 = n();
                    u4a I = I();
                    int i3 = n2.d;
                    if (i3 > I.d) {
                        return u4a.c(0, 0, 0, i3);
                    }
                    u4a u4aVar2 = this.g;
                    if (u4aVar2 != null && !u4aVar2.equals(u4aVar) && (i2 = this.g.d) > I.d) {
                        return u4a.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return m();
                    }
                    if (i == 32) {
                        return k();
                    }
                    if (i == 64) {
                        return o();
                    }
                    if (i == 128) {
                        x9l x9lVar = this.f;
                        e55 h = x9lVar != null ? x9lVar.a.h() : h();
                        if (h != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return u4a.c(i4 >= 28 ? c90.x(h.a) : 0, i4 >= 28 ? c90.z(h.a) : 0, i4 >= 28 ? c90.y(h.a) : 0, i4 >= 28 ? c90.w(h.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    u4a I2 = I();
                    u4a l2 = l();
                    return u4a.c(Math.max(I2.a, l2.a), 0, Math.max(I2.c, l2.c), Math.max(I2.d, l2.d));
                }
                if ((this.h & 2) == 0) {
                    u4a n3 = n();
                    x9l x9lVar2 = this.f;
                    l = x9lVar2 != null ? x9lVar2.a.l() : null;
                    int i5 = n3.d;
                    if (l != null) {
                        i5 = Math.min(i5, l.d);
                    }
                    return u4a.c(n3.a, 0, n3.c, i5);
                }
            }
        } else {
            if (z) {
                return u4a.c(0, Math.max(I().b, n().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return u4a.c(0, n().b, 0, 0);
            }
        }
        return u4aVar;
    }

    public boolean K(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !H(i, false).equals(u4a.e);
    }

    @Override // defpackage.u9l
    public void d(View view) {
        this.k = view.getWidth();
        this.j = view.getHeight();
        u4a J = J(view);
        if (J == null) {
            J = u4a.e;
        }
        x(J);
    }

    @Override // defpackage.u9l
    public void e(x9l x9lVar) {
        x9lVar.a.y(this.f);
        u4a u4aVar = this.g;
        u9l u9lVar = x9lVar.a;
        u9lVar.x(u4aVar);
        u9lVar.A(this.h);
        u9lVar.v(this.i);
        u9lVar.B(this.l);
        u9lVar.C(this.m);
    }

    @Override // defpackage.u9l
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        m9l m9lVar = (m9l) obj;
        return Objects.equals(this.g, m9lVar.g) && M(this.h, m9lVar.h);
    }

    @Override // defpackage.u9l
    public List<Rect> f(int i) {
        return E(this.l, i);
    }

    @Override // defpackage.u9l
    public List<Rect> g(int i) {
        return E(this.m, i);
    }

    @Override // defpackage.u9l
    public u4a i(int i) {
        return G(i, false);
    }

    @Override // defpackage.u9l
    public u4a j(int i) {
        return G(i, true);
    }

    @Override // defpackage.u9l
    public final u4a n() {
        u4a u4aVar = this.e;
        if (u4aVar != null) {
            return u4aVar;
        }
        WindowInsets windowInsets = this.c;
        u4a c = u4a.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.e = c;
        return c;
    }

    @Override // defpackage.u9l
    public void p(View view) {
        this.i = D(view);
    }

    @Override // defpackage.u9l
    public void q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int o2 = oea.o(i);
            this.l[o2] = F(i(i));
            if (i != 8) {
                this.m[o2] = F(j(i));
            }
        }
    }

    @Override // defpackage.u9l
    public x9l r(int i, int i2, int i3, int i4) {
        x9l h = x9l.h(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        l9l k9lVar = i5 >= 36 ? new k9l(h) : i5 >= 35 ? new j9l(h) : i5 >= 34 ? new i9l(h) : i5 >= 31 ? new h9l(h) : i5 >= 30 ? new g9l(h) : i5 >= 29 ? new f9l(h) : new e9l(h);
        k9lVar.h(x9l.e(n(), i, i2, i3, i4));
        k9lVar.f(x9l.e(l(), i, i2, i3, i4));
        return k9lVar.b();
    }

    @Override // defpackage.u9l
    public boolean t() {
        return this.c.isRound();
    }

    @Override // defpackage.u9l
    public boolean u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !K(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.u9l
    public void v(h55 h55Var) {
        this.i = h55Var;
    }

    @Override // defpackage.u9l
    public void w(u4a[] u4aVarArr) {
        this.d = u4aVarArr;
    }

    @Override // defpackage.u9l
    public void x(u4a u4aVar) {
        this.g = u4aVar;
    }

    @Override // defpackage.u9l
    public void y(x9l x9lVar) {
        this.f = x9lVar;
    }

    public m9l(x9l x9lVar, m9l m9lVar) {
        this(x9lVar, new WindowInsets(m9lVar.c));
    }
}
