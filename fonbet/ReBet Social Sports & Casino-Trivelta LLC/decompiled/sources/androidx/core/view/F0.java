package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import x0.AbstractC6773b;

/* loaded from: classes.dex */
public class F0 {

    /* renamed from: b, reason: collision with root package name */
    public static final F0 f19136b;

    /* renamed from: a, reason: collision with root package name */
    public final o f19137a;

    public static class d extends c {
        public d() {
        }

        @Override // androidx.core.view.F0.g
        public void c(int i10, androidx.core.graphics.e eVar) {
            this.f19145b.setInsets(q.a(i10), eVar.f());
        }

        public d(F0 f02) {
            super(f02);
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(F0 f02) {
            super(f02);
        }
    }

    public static class f extends e {
        public f() {
        }

        @Override // androidx.core.view.F0.d, androidx.core.view.F0.g
        public void c(int i10, androidx.core.graphics.e eVar) {
            this.f19145b.setInsets(r.a(i10), eVar.f());
        }

        public f(F0 f02) {
            super(f02);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final F0 f19146a;
        androidx.core.graphics.e[] mInsetsTypeMask;

        public g() {
            this(new F0((F0) null));
        }

        public final void a() {
            androidx.core.graphics.e[] eVarArr = this.mInsetsTypeMask;
            if (eVarArr != null) {
                androidx.core.graphics.e eVar = eVarArr[p.c(1)];
                androidx.core.graphics.e eVar2 = this.mInsetsTypeMask[p.c(2)];
                if (eVar2 == null) {
                    eVar2 = this.f19146a.f(2);
                }
                if (eVar == null) {
                    eVar = this.f19146a.f(1);
                }
                g(androidx.core.graphics.e.b(eVar, eVar2));
                androidx.core.graphics.e eVar3 = this.mInsetsTypeMask[p.c(16)];
                if (eVar3 != null) {
                    f(eVar3);
                }
                androidx.core.graphics.e eVar4 = this.mInsetsTypeMask[p.c(32)];
                if (eVar4 != null) {
                    d(eVar4);
                }
                androidx.core.graphics.e eVar5 = this.mInsetsTypeMask[p.c(64)];
                if (eVar5 != null) {
                    h(eVar5);
                }
            }
        }

        public abstract F0 b();

        public void c(int i10, androidx.core.graphics.e eVar) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new androidx.core.graphics.e[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.mInsetsTypeMask[p.c(i11)] = eVar;
                }
            }
        }

        public void d(androidx.core.graphics.e eVar) {
        }

        public abstract void e(androidx.core.graphics.e eVar);

        public void f(androidx.core.graphics.e eVar) {
        }

        public abstract void g(androidx.core.graphics.e eVar);

        public void h(androidx.core.graphics.e eVar) {
        }

        public g(F0 f02) {
            this.f19146a = f02;
        }
    }

    public static class j extends i {
        public j(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        @Override // androidx.core.view.F0.o
        public F0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f19152c.consumeDisplayCutout();
            return F0.y(consumeDisplayCutout);
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Objects.equals(this.f19152c, jVar.f19152c) && Objects.equals(this.f19155f, jVar.f19155f) && h.C(this.f19156g, jVar.f19156g);
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.view.r f() {
            DisplayCutout displayCutout;
            displayCutout = this.f19152c.getDisplayCutout();
            return androidx.core.view.r.e(displayCutout);
        }

        @Override // androidx.core.view.F0.o
        public int hashCode() {
            return this.f19152c.hashCode();
        }

        public j(F0 f02, j jVar) {
            super(f02, jVar);
        }
    }

    public static class l extends k {

        /* renamed from: q, reason: collision with root package name */
        public static final F0 f19161q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f19161q = F0.y(windowInsets);
        }

        public l(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public final void d(View view) {
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public androidx.core.graphics.e g(int i10) {
            Insets insets;
            insets = this.f19152c.getInsets(q.a(i10));
            return androidx.core.graphics.e.e(insets);
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public androidx.core.graphics.e h(int i10) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f19152c.getInsetsIgnoringVisibility(q.a(i10));
            return androidx.core.graphics.e.e(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public boolean q(int i10) {
            boolean isVisible;
            isVisible = this.f19152c.isVisible(q.a(i10));
            return isVisible;
        }

        public l(F0 f02, l lVar) {
            super(f02, lVar);
        }
    }

    public static class m extends l {
        public m(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        public m(F0 f02, m mVar) {
            super(f02, mVar);
        }
    }

    public static class n extends m {

        /* renamed from: r, reason: collision with root package name */
        public static final F0 f19162r;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f19162r = F0.y(windowInsets);
        }

        public n(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
        }

        @Override // androidx.core.view.F0.l, androidx.core.view.F0.h, androidx.core.view.F0.o
        public androidx.core.graphics.e g(int i10) {
            Insets insets;
            insets = this.f19152c.getInsets(r.a(i10));
            return androidx.core.graphics.e.e(insets);
        }

        @Override // androidx.core.view.F0.l, androidx.core.view.F0.h, androidx.core.view.F0.o
        public androidx.core.graphics.e h(int i10) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f19152c.getInsetsIgnoringVisibility(r.a(i10));
            return androidx.core.graphics.e.e(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.F0.l, androidx.core.view.F0.h, androidx.core.view.F0.o
        public boolean q(int i10) {
            boolean isVisible;
            isVisible = this.f19152c.isVisible(r.a(i10));
            return isVisible;
        }

        public n(F0 f02, n nVar) {
            super(f02, nVar);
        }
    }

    public static class o {

        /* renamed from: b, reason: collision with root package name */
        public static final F0 f19163b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        public final F0 f19164a;

        public o(F0 f02) {
            this.f19164a = f02;
        }

        public F0 a() {
            return this.f19164a;
        }

        public F0 b() {
            return this.f19164a;
        }

        public F0 c() {
            return this.f19164a;
        }

        public void d(View view) {
        }

        public void e(F0 f02) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return p() == oVar.p() && o() == oVar.o() && AbstractC6773b.a(l(), oVar.l()) && AbstractC6773b.a(j(), oVar.j()) && AbstractC6773b.a(f(), oVar.f());
        }

        public androidx.core.view.r f() {
            return null;
        }

        public androidx.core.graphics.e g(int i10) {
            return androidx.core.graphics.e.f19097e;
        }

        public androidx.core.graphics.e h(int i10) {
            if ((i10 & 8) == 0) {
                return androidx.core.graphics.e.f19097e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return AbstractC6773b.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public androidx.core.graphics.e i() {
            return l();
        }

        public androidx.core.graphics.e j() {
            return androidx.core.graphics.e.f19097e;
        }

        public androidx.core.graphics.e k() {
            return l();
        }

        public androidx.core.graphics.e l() {
            return androidx.core.graphics.e.f19097e;
        }

        public androidx.core.graphics.e m() {
            return l();
        }

        public F0 n(int i10, int i11, int i12, int i13) {
            return f19163b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i10) {
            return true;
        }

        public void r(androidx.core.graphics.e[] eVarArr) {
        }

        public void s(androidx.core.graphics.e eVar) {
        }

        public void t(F0 f02) {
        }

        public void u(androidx.core.graphics.e eVar) {
        }

        public void v(int i10) {
        }
    }

    public static final class p {
        public static int a() {
            return 128;
        }

        public static int b() {
            return 8;
        }

        public static int c(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int d() {
            return 32;
        }

        public static int e() {
            return 2;
        }

        public static int f() {
            return 1;
        }

        public static int g() {
            return 519;
        }
    }

    public static final class q {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    public static final class r {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        statusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f19136b = n.f19162r;
        } else if (i10 >= 30) {
            f19136b = l.f19161q;
        } else {
            f19136b = o.f19163b;
        }
    }

    public F0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f19137a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f19137a = new m(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f19137a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f19137a = new k(this, windowInsets);
        } else if (i10 >= 28) {
            this.f19137a = new j(this, windowInsets);
        } else {
            this.f19137a = new i(this, windowInsets);
        }
    }

    public static androidx.core.graphics.e o(androidx.core.graphics.e eVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, eVar.f19098a - i10);
        int max2 = Math.max(0, eVar.f19099b - i11);
        int max3 = Math.max(0, eVar.f19100c - i12);
        int max4 = Math.max(0, eVar.f19101d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? eVar : androidx.core.graphics.e.c(max, max2, max3, max4);
    }

    public static F0 y(WindowInsets windowInsets) {
        return z(windowInsets, null);
    }

    public static F0 z(WindowInsets windowInsets, View view) {
        F0 f02 = new F0((WindowInsets) x0.f.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            f02.u(AbstractC2082d0.G(view));
            f02.d(view.getRootView());
            f02.w(view.getWindowSystemUiVisibility());
        }
        return f02;
    }

    public F0 a() {
        return this.f19137a.a();
    }

    public F0 b() {
        return this.f19137a.b();
    }

    public F0 c() {
        return this.f19137a.c();
    }

    public void d(View view) {
        this.f19137a.d(view);
    }

    public androidx.core.view.r e() {
        return this.f19137a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F0) {
            return AbstractC6773b.a(this.f19137a, ((F0) obj).f19137a);
        }
        return false;
    }

    public androidx.core.graphics.e f(int i10) {
        return this.f19137a.g(i10);
    }

    public androidx.core.graphics.e g(int i10) {
        return this.f19137a.h(i10);
    }

    public androidx.core.graphics.e h() {
        return this.f19137a.j();
    }

    public int hashCode() {
        o oVar = this.f19137a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    public androidx.core.graphics.e i() {
        return this.f19137a.k();
    }

    public int j() {
        return this.f19137a.l().f19101d;
    }

    public int k() {
        return this.f19137a.l().f19098a;
    }

    public int l() {
        return this.f19137a.l().f19100c;
    }

    public int m() {
        return this.f19137a.l().f19099b;
    }

    public F0 n(int i10, int i11, int i12, int i13) {
        return this.f19137a.n(i10, i11, i12, i13);
    }

    public boolean p() {
        return this.f19137a.o();
    }

    public boolean q(int i10) {
        return this.f19137a.q(i10);
    }

    public F0 r(int i10, int i11, int i12, int i13) {
        return new a(this).d(androidx.core.graphics.e.c(i10, i11, i12, i13)).a();
    }

    public void s(androidx.core.graphics.e[] eVarArr) {
        this.f19137a.r(eVarArr);
    }

    public void t(androidx.core.graphics.e eVar) {
        this.f19137a.s(eVar);
    }

    public void u(F0 f02) {
        this.f19137a.t(f02);
    }

    public void v(androidx.core.graphics.e eVar) {
        this.f19137a.u(eVar);
    }

    public void w(int i10) {
        this.f19137a.v(i10);
    }

    public WindowInsets x() {
        o oVar = this.f19137a;
        if (oVar instanceof h) {
            return ((h) oVar).f19152c;
        }
        return null;
    }

    public static class b extends g {

        /* renamed from: d, reason: collision with root package name */
        public static Field f19139d = null;

        /* renamed from: e, reason: collision with root package name */
        public static boolean f19140e = false;

        /* renamed from: f, reason: collision with root package name */
        public static Constructor f19141f = null;

        /* renamed from: g, reason: collision with root package name */
        public static boolean f19142g = false;

        /* renamed from: b, reason: collision with root package name */
        public WindowInsets f19143b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.core.graphics.e f19144c;

        public b() {
            this.f19143b = i();
        }

        private static WindowInsets i() {
            if (!f19140e) {
                try {
                    f19139d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f19140e = true;
            }
            Field field = f19139d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f19142g) {
                try {
                    f19141f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f19142g = true;
            }
            Constructor constructor = f19141f;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.F0.g
        public F0 b() {
            a();
            F0 y10 = F0.y(this.f19143b);
            y10.s(this.mInsetsTypeMask);
            y10.v(this.f19144c);
            return y10;
        }

        @Override // androidx.core.view.F0.g
        public void e(androidx.core.graphics.e eVar) {
            this.f19144c = eVar;
        }

        @Override // androidx.core.view.F0.g
        public void g(androidx.core.graphics.e eVar) {
            WindowInsets windowInsets = this.f19143b;
            if (windowInsets != null) {
                this.f19143b = windowInsets.replaceSystemWindowInsets(eVar.f19098a, eVar.f19099b, eVar.f19100c, eVar.f19101d);
            }
        }

        public b(F0 f02) {
            super(f02);
            this.f19143b = f02.x();
        }
    }

    public static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsets.Builder f19145b;

        public c() {
            this.f19145b = N0.a();
        }

        @Override // androidx.core.view.F0.g
        public F0 b() {
            WindowInsets build;
            a();
            build = this.f19145b.build();
            F0 y10 = F0.y(build);
            y10.s(this.mInsetsTypeMask);
            return y10;
        }

        @Override // androidx.core.view.F0.g
        public void d(androidx.core.graphics.e eVar) {
            this.f19145b.setMandatorySystemGestureInsets(eVar.f());
        }

        @Override // androidx.core.view.F0.g
        public void e(androidx.core.graphics.e eVar) {
            this.f19145b.setStableInsets(eVar.f());
        }

        @Override // androidx.core.view.F0.g
        public void f(androidx.core.graphics.e eVar) {
            this.f19145b.setSystemGestureInsets(eVar.f());
        }

        @Override // androidx.core.view.F0.g
        public void g(androidx.core.graphics.e eVar) {
            this.f19145b.setSystemWindowInsets(eVar.f());
        }

        @Override // androidx.core.view.F0.g
        public void h(androidx.core.graphics.e eVar) {
            this.f19145b.setTappableElementInsets(eVar.f());
        }

        public c(F0 f02) {
            super(f02);
            WindowInsets.Builder a10;
            WindowInsets x10 = f02.x();
            if (x10 != null) {
                a10 = M0.a(x10);
            } else {
                a10 = N0.a();
            }
            this.f19145b = a10;
        }
    }

    public static class i extends h {

        /* renamed from: m, reason: collision with root package name */
        public androidx.core.graphics.e f19157m;

        public i(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
            this.f19157m = null;
        }

        @Override // androidx.core.view.F0.o
        public F0 b() {
            return F0.y(this.f19152c.consumeStableInsets());
        }

        @Override // androidx.core.view.F0.o
        public F0 c() {
            return F0.y(this.f19152c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.F0.o
        public final androidx.core.graphics.e j() {
            if (this.f19157m == null) {
                this.f19157m = androidx.core.graphics.e.c(this.f19152c.getStableInsetLeft(), this.f19152c.getStableInsetTop(), this.f19152c.getStableInsetRight(), this.f19152c.getStableInsetBottom());
            }
            return this.f19157m;
        }

        @Override // androidx.core.view.F0.o
        public boolean o() {
            return this.f19152c.isConsumed();
        }

        @Override // androidx.core.view.F0.o
        public void u(androidx.core.graphics.e eVar) {
            this.f19157m = eVar;
        }

        public i(F0 f02, i iVar) {
            super(f02, iVar);
            this.f19157m = null;
            this.f19157m = iVar.f19157m;
        }
    }

    public static class h extends o {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f19147h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f19148i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f19149j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f19150k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f19151l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f19152c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.core.graphics.e f19153d;

        /* renamed from: e, reason: collision with root package name */
        public F0 f19154e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.core.graphics.e f19155f;

        /* renamed from: g, reason: collision with root package name */
        public int f19156g;
        private androidx.core.graphics.e[] mOverriddenInsets;

        public h(F0 f02, WindowInsets windowInsets) {
            super(f02);
            this.f19153d = null;
            this.f19152c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() {
            try {
                f19148i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f19149j = cls;
                f19150k = cls.getDeclaredField("mVisibleInsets");
                f19151l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f19150k.setAccessible(true);
                f19151l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f19147h = true;
        }

        public static boolean C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.e w(int i10, boolean z10) {
            androidx.core.graphics.e eVar = androidx.core.graphics.e.f19097e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    eVar = androidx.core.graphics.e.b(eVar, x(i11, z10));
                }
            }
            return eVar;
        }

        private androidx.core.graphics.e y() {
            F0 f02 = this.f19154e;
            return f02 != null ? f02.h() : androidx.core.graphics.e.f19097e;
        }

        private androidx.core.graphics.e z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f19147h) {
                B();
            }
            Method method = f19148i;
            if (method != null && f19149j != null && f19150k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f19150k.get(f19151l.get(invoke));
                    if (rect != null) {
                        return androidx.core.graphics.e.d(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        public boolean A(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !x(i10, false).equals(androidx.core.graphics.e.f19097e);
        }

        @Override // androidx.core.view.F0.o
        public void d(View view) {
            androidx.core.graphics.e z10 = z(view);
            if (z10 == null) {
                z10 = androidx.core.graphics.e.f19097e;
            }
            s(z10);
        }

        @Override // androidx.core.view.F0.o
        public void e(F0 f02) {
            f02.u(this.f19154e);
            f02.t(this.f19155f);
            f02.w(this.f19156g);
        }

        @Override // androidx.core.view.F0.o
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f19155f, hVar.f19155f) && C(this.f19156g, hVar.f19156g);
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.graphics.e g(int i10) {
            return w(i10, false);
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.graphics.e h(int i10) {
            return w(i10, true);
        }

        @Override // androidx.core.view.F0.o
        public final androidx.core.graphics.e l() {
            if (this.f19153d == null) {
                this.f19153d = androidx.core.graphics.e.c(this.f19152c.getSystemWindowInsetLeft(), this.f19152c.getSystemWindowInsetTop(), this.f19152c.getSystemWindowInsetRight(), this.f19152c.getSystemWindowInsetBottom());
            }
            return this.f19153d;
        }

        @Override // androidx.core.view.F0.o
        public F0 n(int i10, int i11, int i12, int i13) {
            a aVar = new a(F0.y(this.f19152c));
            aVar.d(F0.o(l(), i10, i11, i12, i13));
            aVar.c(F0.o(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.F0.o
        public boolean p() {
            return this.f19152c.isRound();
        }

        @Override // androidx.core.view.F0.o
        @SuppressLint({"WrongConstant"})
        public boolean q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !A(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.F0.o
        public void r(androidx.core.graphics.e[] eVarArr) {
            this.mOverriddenInsets = eVarArr;
        }

        @Override // androidx.core.view.F0.o
        public void s(androidx.core.graphics.e eVar) {
            this.f19155f = eVar;
        }

        @Override // androidx.core.view.F0.o
        public void t(F0 f02) {
            this.f19154e = f02;
        }

        @Override // androidx.core.view.F0.o
        public void v(int i10) {
            this.f19156g = i10;
        }

        public androidx.core.graphics.e x(int i10, boolean z10) {
            androidx.core.graphics.e h10;
            int i11;
            if (i10 == 1) {
                return z10 ? androidx.core.graphics.e.c(0, Math.max(y().f19099b, l().f19099b), 0, 0) : (this.f19156g & 4) != 0 ? androidx.core.graphics.e.f19097e : androidx.core.graphics.e.c(0, l().f19099b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    androidx.core.graphics.e y10 = y();
                    androidx.core.graphics.e j10 = j();
                    return androidx.core.graphics.e.c(Math.max(y10.f19098a, j10.f19098a), 0, Math.max(y10.f19100c, j10.f19100c), Math.max(y10.f19101d, j10.f19101d));
                }
                if ((this.f19156g & 2) != 0) {
                    return androidx.core.graphics.e.f19097e;
                }
                androidx.core.graphics.e l10 = l();
                F0 f02 = this.f19154e;
                h10 = f02 != null ? f02.h() : null;
                int i12 = l10.f19101d;
                if (h10 != null) {
                    i12 = Math.min(i12, h10.f19101d);
                }
                return androidx.core.graphics.e.c(l10.f19098a, 0, l10.f19100c, i12);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return androidx.core.graphics.e.f19097e;
                }
                F0 f03 = this.f19154e;
                androidx.core.view.r e10 = f03 != null ? f03.e() : f();
                return e10 != null ? androidx.core.graphics.e.c(e10.b(), e10.d(), e10.c(), e10.a()) : androidx.core.graphics.e.f19097e;
            }
            androidx.core.graphics.e[] eVarArr = this.mOverriddenInsets;
            h10 = eVarArr != null ? eVarArr[p.c(8)] : null;
            if (h10 != null) {
                return h10;
            }
            androidx.core.graphics.e l11 = l();
            androidx.core.graphics.e y11 = y();
            int i13 = l11.f19101d;
            if (i13 > y11.f19101d) {
                return androidx.core.graphics.e.c(0, 0, 0, i13);
            }
            androidx.core.graphics.e eVar = this.f19155f;
            return (eVar == null || eVar.equals(androidx.core.graphics.e.f19097e) || (i11 = this.f19155f.f19101d) <= y11.f19101d) ? androidx.core.graphics.e.f19097e : androidx.core.graphics.e.c(0, 0, 0, i11);
        }

        public h(F0 f02, h hVar) {
            this(f02, new WindowInsets(hVar.f19152c));
        }
    }

    public static class k extends j {

        /* renamed from: n, reason: collision with root package name */
        public androidx.core.graphics.e f19158n;

        /* renamed from: o, reason: collision with root package name */
        public androidx.core.graphics.e f19159o;

        /* renamed from: p, reason: collision with root package name */
        public androidx.core.graphics.e f19160p;

        public k(F0 f02, WindowInsets windowInsets) {
            super(f02, windowInsets);
            this.f19158n = null;
            this.f19159o = null;
            this.f19160p = null;
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.graphics.e i() {
            Insets mandatorySystemGestureInsets;
            if (this.f19159o == null) {
                mandatorySystemGestureInsets = this.f19152c.getMandatorySystemGestureInsets();
                this.f19159o = androidx.core.graphics.e.e(mandatorySystemGestureInsets);
            }
            return this.f19159o;
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.graphics.e k() {
            Insets systemGestureInsets;
            if (this.f19158n == null) {
                systemGestureInsets = this.f19152c.getSystemGestureInsets();
                this.f19158n = androidx.core.graphics.e.e(systemGestureInsets);
            }
            return this.f19158n;
        }

        @Override // androidx.core.view.F0.o
        public androidx.core.graphics.e m() {
            Insets tappableElementInsets;
            if (this.f19160p == null) {
                tappableElementInsets = this.f19152c.getTappableElementInsets();
                this.f19160p = androidx.core.graphics.e.e(tappableElementInsets);
            }
            return this.f19160p;
        }

        @Override // androidx.core.view.F0.h, androidx.core.view.F0.o
        public F0 n(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f19152c.inset(i10, i11, i12, i13);
            return F0.y(inset);
        }

        @Override // androidx.core.view.F0.i, androidx.core.view.F0.o
        public void u(androidx.core.graphics.e eVar) {
        }

        public k(F0 f02, k kVar) {
            super(f02, kVar);
            this.f19158n = null;
            this.f19159o = null;
            this.f19160p = null;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final g f19138a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f19138a = new f();
                return;
            }
            if (i10 >= 31) {
                this.f19138a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f19138a = new d();
            } else if (i10 >= 29) {
                this.f19138a = new c();
            } else {
                this.f19138a = new b();
            }
        }

        public F0 a() {
            return this.f19138a.b();
        }

        public a b(int i10, androidx.core.graphics.e eVar) {
            this.f19138a.c(i10, eVar);
            return this;
        }

        public a c(androidx.core.graphics.e eVar) {
            this.f19138a.e(eVar);
            return this;
        }

        public a d(androidx.core.graphics.e eVar) {
            this.f19138a.g(eVar);
            return this;
        }

        public a(F0 f02) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f19138a = new f(f02);
                return;
            }
            if (i10 >= 31) {
                this.f19138a = new e(f02);
                return;
            }
            if (i10 >= 30) {
                this.f19138a = new d(f02);
            } else if (i10 >= 29) {
                this.f19138a = new c(f02);
            } else {
                this.f19138a = new b(f02);
            }
        }
    }

    public F0(F0 f02) {
        if (f02 != null) {
            o oVar = f02.f19137a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (oVar instanceof n)) {
                this.f19137a = new n(this, (n) oVar);
            } else if (i10 >= 31 && (oVar instanceof m)) {
                this.f19137a = new m(this, (m) oVar);
            } else if (i10 >= 30 && (oVar instanceof l)) {
                this.f19137a = new l(this, (l) oVar);
            } else if (i10 >= 29 && (oVar instanceof k)) {
                this.f19137a = new k(this, (k) oVar);
            } else if (i10 >= 28 && (oVar instanceof j)) {
                this.f19137a = new j(this, (j) oVar);
            } else if (oVar instanceof i) {
                this.f19137a = new i(this, (i) oVar);
            } else if (oVar instanceof h) {
                this.f19137a = new h(this, (h) oVar);
            } else {
                this.f19137a = new o(this);
            }
            oVar.e(this);
            return;
        }
        this.f19137a = new o(this);
    }
}
