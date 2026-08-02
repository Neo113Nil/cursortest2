package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zto extends puo {
    public final boolean h;

    public zto(zro zroVar, s9n s9nVar, int i) {
        super(zroVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", s9nVar, i, 61);
        this.h = zroVar.o.a;
    }

    @Override // defpackage.puo
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, this.a.a, Boolean.valueOf(this.h))).longValue();
        s9n s9nVar = this.d;
        synchronized (s9nVar) {
            s9nVar.b();
            ((cmn) s9nVar.b).P(longValue);
        }
    }
}
