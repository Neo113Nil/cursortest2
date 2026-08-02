package defpackage;

import com.ironsource.L6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rq0 implements sjd {
    public static final rq0 a = new rq0();
    public static final nz7 b = nz7.a("arch");
    public static final nz7 c = nz7.a(L6.B);
    public static final nz7 d = nz7.a("cores");
    public static final nz7 e = nz7.a("ram");
    public static final nz7 f = nz7.a("diskSpace");
    public static final nz7 g = nz7.a("simulator");
    public static final nz7 h = nz7.a("state");
    public static final nz7 i = nz7.a("manufacturer");
    public static final nz7 j = nz7.a("modelClass");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        zw3 zw3Var = (zw3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.e(b, ((dt0) zw3Var).a);
        dt0 dt0Var = (dt0) zw3Var;
        tjdVar.a(c, dt0Var.b);
        tjdVar.e(d, dt0Var.c);
        tjdVar.g(e, dt0Var.d);
        tjdVar.g(f, dt0Var.e);
        tjdVar.d(g, dt0Var.f);
        tjdVar.e(h, dt0Var.g);
        tjdVar.a(i, dt0Var.h);
        tjdVar.a(j, dt0Var.i);
    }
}
