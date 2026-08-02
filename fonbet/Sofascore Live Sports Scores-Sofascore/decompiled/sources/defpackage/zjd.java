package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zjd {
    public final int a;
    public final Integer b;

    public zjd(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjd)) {
            return false;
        }
        zjd zjdVar = (zjd) obj;
        return this.a == zjdVar.a && Intrinsics.c(this.b, zjdVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectLocation(group=");
        sb.append(this.a);
        sb.append(", dataOffset=");
        return bf3.n(sb, this.b, ')');
    }
}
