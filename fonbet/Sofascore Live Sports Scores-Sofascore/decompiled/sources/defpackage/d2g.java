package defpackage;

import java.io.Closeable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class d2g implements Closeable {
    public final qzf a;
    public final qff b;
    public final String c;
    public final int d;
    public final w69 e;
    public final q89 f;
    public final i2g g;
    public final ooh h;
    public final d2g i;
    public final d2g j;
    public final d2g k;
    public final long l;
    public final long m;
    public final ge6 n;
    public final vuj o;
    public je2 p;
    public final boolean q;
    public final boolean r;

    public d2g(qzf qzfVar, qff qffVar, String str, int i, w69 w69Var, q89 q89Var, i2g i2gVar, ooh oohVar, d2g d2gVar, d2g d2gVar2, d2g d2gVar3, long j, long j2, ge6 ge6Var, vuj vujVar) {
        qzfVar.getClass();
        qffVar.getClass();
        str.getClass();
        i2gVar.getClass();
        vujVar.getClass();
        this.a = qzfVar;
        this.b = qffVar;
        this.c = str;
        this.d = i;
        this.e = w69Var;
        this.f = q89Var;
        this.g = i2gVar;
        this.h = oohVar;
        this.i = d2gVar;
        this.j = d2gVar2;
        this.k = d2gVar3;
        this.l = j;
        this.m = j2;
        this.n = ge6Var;
        this.o = vujVar;
        boolean z = true;
        this.q = 200 <= i && i < 300;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case MRAID_ERROR_VALUE:
                case INVALID_IFA_STATUS_VALUE:
                case 303:
                    break;
                default:
                    z = false;
                    break;
            }
        }
        this.r = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final je2 h() {
        je2 je2Var = this.p;
        if (je2Var != null) {
            return je2Var;
        }
        je2 je2Var2 = je2.n;
        je2 M = c5n.M(this.f);
        this.p = M;
        return M;
    }

    public final b2g k() {
        b2g b2gVar = new b2g();
        b2gVar.c = -1;
        b2gVar.g = i2g.EMPTY;
        b2gVar.o = vuj.C7;
        b2gVar.a = this.a;
        b2gVar.b = this.b;
        b2gVar.c = this.d;
        b2gVar.d = this.c;
        b2gVar.e = this.e;
        b2gVar.f = vha.k(this.f);
        b2gVar.g = this.g;
        b2gVar.h = this.h;
        b2gVar.i = this.i;
        b2gVar.j = this.j;
        b2gVar.k = this.k;
        b2gVar.l = this.l;
        b2gVar.m = this.m;
        b2gVar.n = this.n;
        b2gVar.o = this.o;
        return b2gVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + '}';
    }
}
