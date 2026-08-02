package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ds0 implements sjd {
    public static final ds0 a = new ds0();
    public static final nz7 b = nz7.a("sessionId");
    public static final nz7 c = nz7.a("firstSessionId");
    public static final nz7 d = nz7.a("sessionIndex");
    public static final nz7 e = nz7.a("eventTimestampUs");
    public static final nz7 f = nz7.a("dataCollectionStatus");
    public static final nz7 g = nz7.a("firebaseInstallationId");
    public static final nz7 h = nz7.a("firebaseAuthenticationToken");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        e8h e8hVar = (e8h) obj;
        tjd tjdVar = (tjd) obj2;
        tjdVar.a(b, e8hVar.a);
        tjdVar.a(c, e8hVar.b);
        tjdVar.e(d, e8hVar.c);
        tjdVar.g(e, e8hVar.d);
        tjdVar.a(f, e8hVar.e);
        tjdVar.a(g, e8hVar.f);
        tjdVar.a(h, e8hVar.g);
    }
}
