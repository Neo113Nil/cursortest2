package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sk3 {
    public final rk3 a;
    public final xei b;

    public sk3(rk3 rk3Var, xei xeiVar) {
        this.a = rk3Var;
        z1a.y(xeiVar, "status is null");
        this.b = xeiVar;
    }

    public static sk3 a(rk3 rk3Var) {
        z1a.r("state is TRANSIENT_ERROR. Use forError() instead", rk3Var != rk3.c);
        return new sk3(rk3Var, xei.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sk3)) {
            return false;
        }
        sk3 sk3Var = (sk3) obj;
        if (!this.a.equals(sk3Var.a)) {
            return false;
        }
        xei xeiVar = sk3Var.b;
        xei xeiVar2 = this.b;
        xeiVar2.getClass();
        return xeiVar2 == xeiVar;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        xei xeiVar = this.b;
        boolean f = xeiVar.f();
        rk3 rk3Var = this.a;
        if (f) {
            return rk3Var.toString();
        }
        return rk3Var + "(" + xeiVar + ")";
    }
}
