package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cs0 implements sjd {
    public static final cs0 a = new cs0();
    public static final nz7 b = nz7.a("eventType");
    public static final nz7 c = nz7.a("sessionData");
    public static final nz7 d = nz7.a("applicationInfo");

    @Override // defpackage.en5
    public final void a(Object obj, Object obj2) {
        y7h y7hVar = (y7h) obj;
        tjd tjdVar = (tjd) obj2;
        y7hVar.getClass();
        tjdVar.a(b, pc6.SESSION_START);
        tjdVar.a(c, y7hVar.a);
        tjdVar.a(d, y7hVar.b);
    }
}
