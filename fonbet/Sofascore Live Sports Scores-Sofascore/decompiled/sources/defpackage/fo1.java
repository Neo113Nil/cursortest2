package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fo1 {
    public final int a;
    public final String b;
    public final long c;
    public final int d;

    public fo1(int i, int i2, String str, long j) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo1)) {
            return false;
        }
        fo1 fo1Var = (fo1) obj;
        return this.a == fo1Var.a && Intrinsics.c(this.b, fo1Var.b) && this.c == fo1Var.c && this.d == fo1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ljg.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "BasicRoundData(id=", ", name=", this.b, ", deadlineTimestamp=");
        t.append(this.c);
        t.append(", sequence=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
