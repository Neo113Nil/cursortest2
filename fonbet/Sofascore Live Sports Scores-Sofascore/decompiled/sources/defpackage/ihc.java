package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ihc implements usg {
    public final r5 a;
    public final ybk b;
    public final qk6 c;

    public ihc(ybk ybkVar, qk6 qk6Var, r5 r5Var) {
        this.b = ybkVar;
        qk6Var.getClass();
        this.c = qk6Var;
        this.a = r5Var;
    }

    @Override // defpackage.usg
    public final void a(Object obj, Object obj2) {
        zsg.k(this.b, obj, obj2);
    }

    @Override // defpackage.usg
    public final void b(Object obj) {
        this.b.getClass();
        wbk wbkVar = ((gw8) obj).unknownFields;
        if (wbkVar.e) {
            wbkVar.e = false;
        }
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }

    @Override // defpackage.usg
    public final boolean c(Object obj) {
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }

    @Override // defpackage.usg
    public final gw8 d() {
        r5 r5Var = this.a;
        return r5Var instanceof gw8 ? ((gw8) r5Var).h() : ((cw8) ((gw8) r5Var).b(5)).b();
    }

    @Override // defpackage.usg
    public final void e(Object obj, zz0 zz0Var, nk6 nk6Var) {
        this.b.getClass();
        ybk.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.usg
    public final void f(Object obj, sz8 sz8Var) {
        this.c.getClass();
        wt3.z(obj);
        throw null;
    }

    @Override // defpackage.usg
    public final boolean g(gw8 gw8Var, gw8 gw8Var2) {
        this.b.getClass();
        return gw8Var.unknownFields.equals(gw8Var2.unknownFields);
    }

    @Override // defpackage.usg
    public final int h(gw8 gw8Var) {
        this.b.getClass();
        wbk wbkVar = gw8Var.unknownFields;
        int i = wbkVar.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < wbkVar.a; i3++) {
            int i4 = wbkVar.b[i3] >>> 3;
            i2 += g03.f(3, (cc2) wbkVar.c[i3]) + g03.i(i4) + g03.h(2) + (g03.h(1) * 2);
        }
        wbkVar.d = i2;
        return i2;
    }

    @Override // defpackage.usg
    public final int i(gw8 gw8Var) {
        this.b.getClass();
        return gw8Var.unknownFields.hashCode();
    }
}
