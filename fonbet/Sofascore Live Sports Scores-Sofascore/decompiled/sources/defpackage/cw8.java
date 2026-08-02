package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cw8 implements Cloneable {
    public final gw8 a;
    public gw8 b;

    public cw8(gw8 gw8Var) {
        this.a = gw8Var;
        if (gw8Var.f()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = gw8Var.h();
    }

    public static void d(Object obj, Object obj2) {
        hff hffVar = hff.c;
        hffVar.getClass();
        hffVar.a(obj.getClass()).a(obj, obj2);
    }

    public final gw8 a() {
        gw8 b = b();
        b.getClass();
        if (gw8.e(b, true)) {
            return b;
        }
        throw new gak();
    }

    public final gw8 b() {
        boolean f = this.b.f();
        gw8 gw8Var = this.b;
        if (!f) {
            return gw8Var;
        }
        gw8Var.getClass();
        hff hffVar = hff.c;
        hffVar.getClass();
        hffVar.a(gw8Var.getClass()).b(gw8Var);
        gw8Var.g();
        return this.b;
    }

    public final void c() {
        if (this.b.f()) {
            return;
        }
        gw8 h = this.a.h();
        d(h, this.b);
        this.b = h;
    }

    public final Object clone() {
        cw8 cw8Var = (cw8) this.a.b(5);
        cw8Var.b = b();
        return cw8Var;
    }
}
