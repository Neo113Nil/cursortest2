package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class edn {
    public abstract void a(int i, long j, Object obj);

    public abstract void b(int i, int i2, Object obj);

    public abstract void c(int i, long j, Object obj);

    public abstract void d(Object obj, int i, g8n g8nVar);

    public abstract void e(int i, Object obj, Object obj2);

    public abstract fdn f();

    public abstract fdn g(Object obj);

    public abstract fdn h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(Object obj);

    public final boolean k(int i, zz0 zz0Var, Object obj) {
        m8n m8nVar = (m8n) zz0Var.e;
        int i2 = zz0Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zz0Var.h1(0);
            a(i3, m8nVar.l(), obj);
            return true;
        }
        if (i4 == 1) {
            zz0Var.h1(1);
            c(i3, m8nVar.n(), obj);
            return true;
        }
        if (i4 == 2) {
            zz0Var.h1(2);
            d(obj, i3, m8nVar.s());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                hbo.m("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                zzl.u();
                return false;
            }
            zz0Var.h1(5);
            b(i3, m8nVar.o(), obj);
            return true;
        }
        fdn f = f();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            hbo.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (zz0Var.H1() != Integer.MAX_VALUE && k(i6, zz0Var, f)) {
        }
        if ((i5 | 4) == zz0Var.b) {
            e(i3, obj, g(f));
            return true;
        }
        hbo.m("Protocol message end-group tag did not match expected tag.");
        return false;
    }
}
