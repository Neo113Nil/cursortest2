package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class o1k {
    public final int a;
    public final Integer b;

    public o1k(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1k)) {
            return false;
        }
        o1k o1kVar = (o1k) obj;
        return this.a == o1kVar.a && Intrinsics.c(this.b, o1kVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "TripleDoubleItem(label=" + this.a + ", value=" + this.b + ")";
    }
}
