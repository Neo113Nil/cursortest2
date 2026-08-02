package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x9b {
    public final Double a;
    public final t9b b;
    public final t9b c;

    public x9b(Double d, t9b t9bVar, t9b t9bVar2) {
        this.a = d;
        this.b = t9bVar;
        this.c = t9bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9b)) {
            return false;
        }
        x9b x9bVar = (x9b) obj;
        return Intrinsics.c(this.a, x9bVar.a) && Intrinsics.c(this.b, x9bVar.b) && Intrinsics.c(this.c, x9bVar.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        t9b t9bVar = this.b;
        int hashCode2 = (hashCode + (t9bVar == null ? 0 : t9bVar.hashCode())) * 31;
        t9b t9bVar2 = this.c;
        return hashCode2 + (t9bVar2 != null ? t9bVar2.hashCode() : 0);
    }

    public final String toString() {
        return "RatingBreakdownData(normalizedValue=" + this.a + ", primaryValue=" + this.b + ", secondaryValue=" + this.c + ")";
    }
}
