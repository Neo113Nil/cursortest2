package defpackage;

import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class br0 implements sjd {
    public static final br0 a = new br0();
    public static final nz7 b = nz7.a(U3.j.Y);
    public static final nz7 c = nz7.a("batteryVelocity");
    public static final nz7 d = nz7.a("proximityOn");
    public static final nz7 e = nz7.a(U3.i.n);
    public static final nz7 f = nz7.a("ramUsed");
    public static final nz7 g = nz7.a("diskUsed");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        ix3 ix3Var = (ix3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, ((st0) ix3Var).a);
        st0 st0Var = (st0) ix3Var;
        tjdVar.e(c, st0Var.b);
        tjdVar.d(d, st0Var.c);
        tjdVar.e(e, st0Var.d);
        tjdVar.g(f, st0Var.e);
        tjdVar.g(g, st0Var.f);
    }
}
