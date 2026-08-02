package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class dw8 implements Cloneable {
    public final hw8 a;
    public hw8 b;

    public dw8(hw8 hw8Var) {
        this.a = hw8Var;
        if (hw8Var.g()) {
            a70.p("Default instance must be immutable.");
            throw null;
        }
        this.b = hw8Var.i();
    }

    public final hw8 a() {
        hw8 b = b();
        b.getClass();
        if (hw8.f(b, true)) {
            return b;
        }
        throw new hak();
    }

    public final hw8 b() {
        boolean g = this.b.g();
        hw8 hw8Var = this.b;
        if (!g) {
            return hw8Var;
        }
        hw8Var.getClass();
        kff kffVar = kff.c;
        kffVar.getClass();
        kffVar.a(hw8Var.getClass()).b(hw8Var);
        hw8Var.h();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        hw8 i = this.a.i();
        hw8 hw8Var = this.b;
        kff kffVar = kff.c;
        kffVar.getClass();
        kffVar.a(i.getClass()).a(i, hw8Var);
        this.b = i;
    }

    public final Object clone() {
        dw8 dw8Var = (dw8) this.a.c(5);
        dw8Var.b = b();
        return dw8Var;
    }
}
