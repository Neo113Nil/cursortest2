package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k3d {
    public final List a;
    public final sm0 b;
    public final j3d c;

    public k3d(List list, sm0 sm0Var, j3d j3dVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        z1a.y(sm0Var, "attributes");
        this.b = sm0Var;
        this.c = j3dVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k3d)) {
            return false;
        }
        k3d k3dVar = (k3d) obj;
        return sha.r(this.a, k3dVar.a) && sha.r(this.b, k3dVar.b) && sha.r(this.c, k3dVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "addresses");
        I.e(this.b, "attributes");
        I.e(this.c, "serviceConfig");
        return I.toString();
    }
}
