package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iq0 implements sjd {
    public static final iq0 a = new iq0();
    public static final nz7 b = nz7.a("pid");
    public static final nz7 c = nz7.a("processName");
    public static final nz7 d = nz7.a("reasonCode");
    public static final nz7 e = nz7.a("importance");
    public static final nz7 f = nz7.a("pss");
    public static final nz7 g = nz7.a("rss");
    public static final nz7 h = nz7.a("timestamp");
    public static final nz7 i = nz7.a("traceFile");
    public static final nz7 j = nz7.a("buildIdMappingForArch");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        rw3 rw3Var = (rw3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.e(b, ((rs0) rw3Var).a);
        rs0 rs0Var = (rs0) rw3Var;
        tjdVar.a(c, rs0Var.b);
        tjdVar.e(d, rs0Var.c);
        tjdVar.e(e, rs0Var.d);
        tjdVar.g(f, rs0Var.e);
        tjdVar.g(g, rs0Var.f);
        tjdVar.g(h, rs0Var.g);
        tjdVar.a(i, rs0Var.h);
        tjdVar.a(j, rs0Var.i);
    }
}
