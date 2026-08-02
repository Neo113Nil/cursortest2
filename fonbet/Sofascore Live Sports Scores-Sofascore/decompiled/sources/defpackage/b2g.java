package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class b2g {
    public qzf a;
    public qff b;
    public String d;
    public w69 e;
    public ooh h;
    public d2g i;
    public d2g j;
    public d2g k;
    public long l;
    public long m;
    public ge6 n;
    public int c = -1;
    public i2g g = i2g.EMPTY;
    public vuj o = vuj.C7;
    public ef0 f = new ef0(1);

    public static void b(String str, d2g d2gVar) {
        if (d2gVar != null) {
            if (d2gVar.i != null) {
                ogj.h(str.concat(".networkResponse != null"));
            } else if (d2gVar.j != null) {
                ogj.h(str.concat(".cacheResponse != null"));
            } else {
                if (d2gVar.k == null) {
                    return;
                }
                ogj.h(str.concat(".priorResponse != null"));
            }
        }
    }

    public final d2g a() {
        int i = this.c;
        if (i < 0) {
            ilg.e(this.c, "code < 0: ");
            return null;
        }
        qzf qzfVar = this.a;
        if (qzfVar == null) {
            a70.r("request == null");
            return null;
        }
        qff qffVar = this.b;
        if (qffVar == null) {
            a70.r("protocol == null");
            return null;
        }
        String str = this.d;
        if (str == null) {
            a70.r("message == null");
            return null;
        }
        w69 w69Var = this.e;
        ef0 ef0Var = this.f;
        ef0Var.getClass();
        return new d2g(qzfVar, qffVar, str, i, w69Var, vha.i(ef0Var), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }
}
