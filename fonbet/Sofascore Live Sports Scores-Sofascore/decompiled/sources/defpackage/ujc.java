package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ujc {
    public static ujc h;
    public final ema a;
    public final dfj b;
    public final nx4 c;
    public final sf8 d;
    public final dfj e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public ujc(ema emaVar, dfj dfjVar, nx4 nx4Var, sf8 sf8Var) {
        this.a = emaVar;
        this.b = dfjVar;
        this.c = nx4Var;
        this.d = sf8Var;
        this.e = g7a.C(dfjVar, emaVar);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = vjc.a;
            long b = cn3.b(0, 0, 0, 0, 15);
            dfj dfjVar = this.e;
            nx4 nx4Var = this.c;
            float b2 = waa.e(str, dfjVar, b, nx4Var, this.d, null, 1, 96).b();
            float b3 = waa.e(vjc.b, dfjVar, cn3.b(0, 0, 0, 0, 15), nx4Var, this.d, null, 2, 96).b() - b2;
            this.g = b2;
            this.f = b3;
            f2 = b3;
            f = b2;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            i2 = round >= 0 ? round : 0;
            int g = an3.g(j);
            if (i2 > g) {
                i2 = g;
            }
        } else {
            i2 = an3.i(j);
        }
        return cn3.a(an3.j(j), an3.h(j), i2, an3.g(j));
    }
}
