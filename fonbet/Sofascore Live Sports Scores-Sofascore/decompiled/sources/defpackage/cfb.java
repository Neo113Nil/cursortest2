package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cfb {
    public final List a;
    public final sm0 b;
    public final Object c;

    public cfb(List list, sm0 sm0Var, Object obj) {
        z1a.y(list, "addresses");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        z1a.y(sm0Var, "attributes");
        this.b = sm0Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cfb)) {
            return false;
        }
        cfb cfbVar = (cfb) obj;
        return sha.r(this.a, cfbVar.a) && sha.r(this.b, cfbVar.b) && sha.r(this.c, cfbVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "addresses");
        I.e(this.b, "attributes");
        I.e(this.c, "loadBalancingPolicyConfig");
        return I.toString();
    }
}
