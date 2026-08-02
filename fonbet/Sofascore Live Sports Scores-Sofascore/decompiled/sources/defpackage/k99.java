package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k99 {
    public final int a;
    public final long b;
    public final vv9 c;

    public k99(int i, long j, Set set) {
        this.a = i;
        this.b = j;
        this.c = vv9.t(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k99.class != obj.getClass()) {
            return false;
        }
        k99 k99Var = (k99) obj;
        return this.a == k99Var.a && this.b == k99Var.b && sha.r(this.c, k99Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.f("maxAttempts", String.valueOf(this.a));
        I.c(this.b, "hedgingDelayNanos");
        I.e(this.c, "nonFatalStatusCodes");
        return I.toString();
    }
}
