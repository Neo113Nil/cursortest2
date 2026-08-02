package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yp0 implements sjd {
    public static final yp0 a = new yp0();
    public static final nz7 b = nz7.a("eventTimeMs");
    public static final nz7 c = nz7.a("eventCode");
    public static final nz7 d = nz7.a("complianceData");
    public static final nz7 e = nz7.a("eventUptimeMs");
    public static final nz7 f = nz7.a("sourceExtension");
    public static final nz7 g = nz7.a("sourceExtensionJsonProto3");
    public static final nz7 h = nz7.a("timezoneOffsetSeconds");
    public static final nz7 i = nz7.a("networkConnectionInfo");
    public static final nz7 j = nz7.a("experimentIds");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        pib pibVar = (pib) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.g(b, ((ou0) pibVar).a);
        ou0 ou0Var = (ou0) pibVar;
        tjdVar.a(c, ou0Var.b);
        tjdVar.a(d, ou0Var.c);
        tjdVar.g(e, ou0Var.d);
        tjdVar.a(f, ou0Var.e);
        tjdVar.a(g, ou0Var.f);
        tjdVar.g(h, ou0Var.g);
        tjdVar.a(i, ou0Var.h);
        tjdVar.a(j, ou0Var.i);
    }
}
