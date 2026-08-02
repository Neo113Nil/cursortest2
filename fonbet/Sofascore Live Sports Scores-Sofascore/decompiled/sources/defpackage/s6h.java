package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s6h {
    public final String a;
    public final Map b;

    public s6h(String str, Map map) {
        z1a.y(str, "policyName");
        this.a = str;
        z1a.y(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s6h) {
            s6h s6hVar = (s6h) obj;
            if (this.a.equals(s6hVar.a) && this.b.equals(s6hVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.a, "policyName");
        I.e(this.b, "rawConfigValue");
        return I.toString();
    }
}
