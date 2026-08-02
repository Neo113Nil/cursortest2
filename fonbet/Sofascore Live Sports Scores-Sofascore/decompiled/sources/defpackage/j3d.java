package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j3d {
    public final xei a;
    public final Object b;

    public j3d(xei xeiVar) {
        this.b = null;
        z1a.y(xeiVar, "status");
        this.a = xeiVar;
        z1a.q(xeiVar, "cannot use OK status: %s", !xeiVar.f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j3d.class == obj.getClass()) {
            j3d j3dVar = (j3d) obj;
            if (sha.r(this.a, j3dVar.a) && sha.r(this.b, j3dVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            en0 I = qea.I(this);
            I.e(obj, "config");
            return I.toString();
        }
        en0 I2 = qea.I(this);
        I2.e(this.a, "error");
        return I2.toString();
    }

    public j3d(Object obj) {
        this.b = obj;
        this.a = null;
    }
}
