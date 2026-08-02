package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p1k {
    public final o1k a;
    public final o1k b;
    public final o1k c;

    public p1k(o1k o1kVar, o1k o1kVar2, o1k o1kVar3) {
        o1kVar.getClass();
        o1kVar2.getClass();
        o1kVar3.getClass();
        this.a = o1kVar;
        this.b = o1kVar2;
        this.c = o1kVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1k)) {
            return false;
        }
        p1k p1kVar = (p1k) obj;
        return Intrinsics.c(this.a, p1kVar.a) && Intrinsics.c(this.b, p1kVar.b) && Intrinsics.c(this.c, p1kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TripleDoubleStatistics(primary=" + this.a + ", secondary=" + this.b + ", tertiary=" + this.c + ")";
    }
}
