package defpackage;

import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z3g {
    public final int a;
    public final long b;
    public final long c;
    public final double d;
    public final Long e;
    public final vv9 f;

    public z3g(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = vv9.t(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return this.a == z3gVar.a && this.b == z3gVar.b && this.c == z3gVar.c && Double.compare(this.d, z3gVar.d) == 0 && sha.r(this.e, z3gVar.e) && sha.r(this.f, z3gVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.f("maxAttempts", String.valueOf(this.a));
        I.c(this.b, "initialBackoffNanos");
        I.c(this.c, "maxBackoffNanos");
        I.f("backoffMultiplier", String.valueOf(this.d));
        I.e(this.e, "perAttemptRecvTimeoutNanos");
        I.e(this.f, "retryableStatusCodes");
        return I.toString();
    }
}
