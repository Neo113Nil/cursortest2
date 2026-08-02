package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cz9 extends iz9 {
    public final Integer c;
    public final int d;

    public cz9(int i, Integer num) {
        this.c = num;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz9)) {
            return false;
        }
        cz9 cz9Var = (cz9) obj;
        return Intrinsics.c(this.c, cz9Var.c) && this.d == cz9Var.d;
    }

    public final int hashCode() {
        Integer num = this.c;
        return Integer.hashCode(this.d) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "InjuryTimeIncident(time=" + this.c + ", length=" + this.d + ")";
    }
}
