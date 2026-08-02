package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qzd {
    public final String a;
    public final double b;

    public qzd(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzd)) {
            return false;
        }
        qzd qzdVar = (qzd) obj;
        return Intrinsics.c(this.a, qzdVar.a) && Double.compare(this.b, qzdVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PESMRatingBreakdownComponent(name=" + this.a + ", value=" + this.b + ")";
    }
}
