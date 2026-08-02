package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bfb {
    public static final bfb e = new bfb(null, null, xei.e, false);
    public final o6a a;
    public final by2 b;
    public final xei c;
    public final boolean d;

    public bfb(o6a o6aVar, by2 by2Var, xei xeiVar, boolean z) {
        this.a = o6aVar;
        this.b = by2Var;
        z1a.y(xeiVar, "status");
        this.c = xeiVar;
        this.d = z;
    }

    public static bfb a(xei xeiVar) {
        z1a.r("error status shouldn't be OK", !xeiVar.f());
        return new bfb(null, null, xeiVar, false);
    }

    public static bfb b(o6a o6aVar, ywd ywdVar) {
        z1a.y(o6aVar, "subchannel");
        return new bfb(o6aVar, ywdVar, xei.e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bfb)) {
            return false;
        }
        bfb bfbVar = (bfb) obj;
        return sha.r(this.a, bfbVar.a) && sha.r(this.c, bfbVar.c) && sha.r(this.b, bfbVar.b) && this.d == bfbVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "subchannel");
        I.e(this.b, "streamTracerFactory");
        I.e(this.c, "status");
        I.d("drop", this.d);
        return I.toString();
    }
}
