package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kb8 implements n8g {
    public static final kb8 a = new kb8();

    @Override // defpackage.n8g
    public final xtc a(float f, xtc xtcVar, boolean z) {
        if (f <= 0.0d) {
            p3a.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return xtcVar.z(new goa(f, z));
    }
}
