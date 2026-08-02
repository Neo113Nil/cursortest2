package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zp0 implements sjd {
    public static final zp0 a = new zp0();
    public static final nz7 b = nz7.a("requestTimeMs");
    public static final nz7 c = nz7.a("requestUptimeMs");
    public static final nz7 d = nz7.a("clientInfo");
    public static final nz7 e = nz7.a("logSource");
    public static final nz7 f = nz7.a("logSourceName");
    public static final nz7 g = nz7.a("logEvent");
    public static final nz7 h = nz7.a("qosTier");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        tib tibVar = (tib) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, ((pu0) tibVar).a);
        pu0 pu0Var = (pu0) tibVar;
        tjdVar.g(c, pu0Var.b);
        tjdVar.a(d, pu0Var.c);
        tjdVar.a(e, pu0Var.d);
        tjdVar.a(f, pu0Var.e);
        tjdVar.a(g, pu0Var.f);
        tjdVar.a(h, mif.a);
    }
}
