package E6;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static c f3008a = b.l();

    public static void A(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (w(2)) {
            x(cls, q(str, obj, obj2, obj3));
        }
    }

    public static void B(Class cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f3008a.j(2)) {
            f3008a.f(r(cls), q(str, obj, obj2, obj3, obj4));
        }
    }

    public static void C(Class cls, String str, Object... objArr) {
        if (f3008a.j(2)) {
            f3008a.f(r(cls), q(str, objArr));
        }
    }

    public static void D(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f3008a.j(2)) {
            f3008a.f(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void E(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f3008a.j(2)) {
            f3008a.f(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void F(String str, String str2, Object... objArr) {
        if (f3008a.j(2)) {
            f3008a.f(str, q(str2, objArr));
        }
    }

    public static void G(Class cls, String str) {
        if (f3008a.j(5)) {
            f3008a.d(r(cls), str);
        }
    }

    public static void H(Class cls, String str, Throwable th2) {
        if (f3008a.j(5)) {
            f3008a.b(r(cls), str, th2);
        }
    }

    public static void I(Class cls, String str, Object... objArr) {
        if (f3008a.j(5)) {
            f3008a.d(r(cls), q(str, objArr));
        }
    }

    public static void J(Class cls, Throwable th2, String str, Object... objArr) {
        if (w(5)) {
            H(cls, q(str, objArr), th2);
        }
    }

    public static void K(String str, String str2) {
        if (f3008a.j(5)) {
            f3008a.d(str, str2);
        }
    }

    public static void L(String str, String str2, Throwable th2) {
        if (f3008a.j(5)) {
            f3008a.b(str, str2, th2);
        }
    }

    public static void M(String str, String str2, Object... objArr) {
        if (f3008a.j(5)) {
            f3008a.d(str, q(str2, objArr));
        }
    }

    public static void N(String str, Throwable th2, String str2, Object... objArr) {
        if (f3008a.j(5)) {
            f3008a.b(str, q(str2, objArr), th2);
        }
    }

    public static void O(Class cls, String str, Throwable th2) {
        if (f3008a.j(6)) {
            f3008a.i(r(cls), str, th2);
        }
    }

    public static void P(String str, String str2, Object... objArr) {
        if (f3008a.j(6)) {
            f3008a.g(str, q(str2, objArr));
        }
    }

    public static void a(Class cls, String str, Object obj) {
        if (f3008a.j(3)) {
            f3008a.h(r(cls), q(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f3008a.j(3)) {
            f3008a.h(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f3008a.j(3)) {
            f3008a.h(str, q(str2, obj));
        }
    }

    public static void d(String str, String str2, Object obj, Object obj2) {
        if (f3008a.j(3)) {
            f3008a.h(str, q(str2, obj, obj2));
        }
    }

    public static void e(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f3008a.j(3)) {
            f3008a.h(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void f(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f3008a.j(3)) {
            f3008a.h(str, q(str2, obj, obj2, obj3, obj4));
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        if (f3008a.j(3)) {
            f3008a.a(str, str2, th2);
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (f3008a.j(3)) {
            b(str, q(str2, objArr));
        }
    }

    public static void i(Class cls, String str) {
        if (f3008a.j(6)) {
            f3008a.e(r(cls), str);
        }
    }

    public static void j(Class cls, String str, Throwable th2) {
        if (f3008a.j(6)) {
            f3008a.c(r(cls), str, th2);
        }
    }

    public static void k(Class cls, String str, Object... objArr) {
        if (f3008a.j(6)) {
            f3008a.e(r(cls), q(str, objArr));
        }
    }

    public static void l(Class cls, Throwable th2, String str, Object... objArr) {
        if (f3008a.j(6)) {
            f3008a.c(r(cls), q(str, objArr), th2);
        }
    }

    public static void m(String str, String str2) {
        if (f3008a.j(6)) {
            f3008a.e(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        if (f3008a.j(6)) {
            f3008a.c(str, str2, th2);
        }
    }

    public static void o(String str, String str2, Object... objArr) {
        if (f3008a.j(6)) {
            f3008a.e(str, q(str2, objArr));
        }
    }

    public static void p(String str, Throwable th2, String str2, Object... objArr) {
        if (f3008a.j(6)) {
            f3008a.c(str, q(str2, objArr), th2);
        }
    }

    public static String q(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static String r(Class cls) {
        return cls.getSimpleName();
    }

    public static void s(String str, String str2) {
        if (f3008a.j(4)) {
            f3008a.k(str, str2);
        }
    }

    public static void t(String str, String str2, Object obj, Object obj2) {
        if (f3008a.j(4)) {
            f3008a.k(str, q(str2, obj, obj2));
        }
    }

    public static void u(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (f3008a.j(4)) {
            f3008a.k(str, q(str2, obj, obj2, obj3));
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        if (f3008a.j(4)) {
            f3008a.k(str, q(str2, objArr));
        }
    }

    public static boolean w(int i10) {
        return f3008a.j(i10);
    }

    public static void x(Class cls, String str) {
        if (f3008a.j(2)) {
            f3008a.f(r(cls), str);
        }
    }

    public static void y(Class cls, String str, Object obj) {
        if (f3008a.j(2)) {
            f3008a.f(r(cls), q(str, obj));
        }
    }

    public static void z(Class cls, String str, Object obj, Object obj2) {
        if (f3008a.j(2)) {
            f3008a.f(r(cls), q(str, obj, obj2));
        }
    }
}
