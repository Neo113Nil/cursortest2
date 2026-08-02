package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jhc implements wsg {
    public final s5 a;
    public final zbk b;
    public final rk6 c;

    public jhc(zbk zbkVar, rk6 rk6Var, s5 s5Var) {
        this.b = zbkVar;
        rk6Var.getClass();
        this.c = rk6Var;
        this.a = s5Var;
    }

    @Override // defpackage.wsg
    public final void a(Object obj, Object obj2) {
        atg.k(this.b, obj, obj2);
    }

    @Override // defpackage.wsg
    public final void b(Object obj) {
        this.b.getClass();
        xbk xbkVar = ((hw8) obj).unknownFields;
        if (xbkVar.e) {
            xbkVar.e = false;
        }
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }

    @Override // defpackage.wsg
    public final boolean c(Object obj) {
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }

    @Override // defpackage.wsg
    public final hw8 d() {
        s5 s5Var = this.a;
        return s5Var instanceof hw8 ? ((hw8) s5Var).i() : ((dw8) ((hw8) s5Var).c(5)).b();
    }

    @Override // defpackage.wsg
    public final boolean e(hw8 hw8Var, hw8 hw8Var2) {
        this.b.getClass();
        return hw8Var.unknownFields.equals(hw8Var2.unknownFields);
    }

    @Override // defpackage.wsg
    public final int f(hw8 hw8Var) {
        this.b.getClass();
        return hw8Var.unknownFields.hashCode();
    }

    @Override // defpackage.wsg
    public final int g(hw8 hw8Var) {
        this.b.getClass();
        xbk xbkVar = hw8Var.unknownFields;
        int i = xbkVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < xbkVar.a; i3++) {
            int i4 = xbkVar.b[i3] >>> 3;
            i2 += h03.f(3, (ec2) xbkVar.c[i3]) + h03.i(i4) + h03.h(2) + (h03.h(1) * 2);
        }
        xbkVar.d = i2;
        return i2;
    }

    @Override // defpackage.wsg
    public final void h(Object obj, zz0 zz0Var, ok6 ok6Var) {
        this.b.getClass();
        zbk.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.wsg
    public final void i(Object obj, t9d t9dVar) {
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }
}
