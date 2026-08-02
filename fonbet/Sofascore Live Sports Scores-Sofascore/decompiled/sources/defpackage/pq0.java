package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pq0 implements sjd {
    public static final pq0 a = new pq0();
    public static final nz7 b = nz7.a("identifier");
    public static final nz7 c = nz7.a("version");
    public static final nz7 d = nz7.a("displayVersion");
    public static final nz7 e = nz7.a("organization");
    public static final nz7 f = nz7.a("installationUuid");
    public static final nz7 g = nz7.a("developmentPlatform");
    public static final nz7 h = nz7.a("developmentPlatformVersion");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        yw3 yw3Var = (yw3) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, ((at0) yw3Var).a);
        at0 at0Var = (at0) yw3Var;
        tjdVar.a(c, at0Var.b);
        tjdVar.a(d, at0Var.c);
        tjdVar.a(e, null);
        tjdVar.a(f, at0Var.d);
        tjdVar.a(g, at0Var.e);
        tjdVar.a(h, at0Var.f);
    }
}
