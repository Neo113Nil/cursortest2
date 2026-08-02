package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ey2 {
    public String a;
    public sm0 b;
    public ki9 c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ey2)) {
            return false;
        }
        ey2 ey2Var = (ey2) obj;
        return this.a.equals(ey2Var.a) && this.b.equals(ey2Var.b) && sha.r(null, null) && sha.r(this.c, ey2Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, this.c});
    }
}
