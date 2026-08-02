package defpackage;

import java.util.Locale;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nlh {
    public final long a;
    public final long b;
    public final int c;

    public nlh(long j, long j2, int i) {
        z1a.s(j < j2);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nlh.class == obj.getClass()) {
            nlh nlhVar = (nlh) obj;
            if (this.a == nlhVar.a && this.b == nlhVar.b && this.c == nlhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = nik.a;
        Locale locale = Locale.US;
        StringBuilder o = ljg.o("Segment: startTimeMs=", this.a, ", endTimeMs=");
        o.append(this.b);
        o.append(", speedDivisor=");
        o.append(this.c);
        return o.toString();
    }
}
