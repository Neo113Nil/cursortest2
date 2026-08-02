package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g5i {
    public final int a;
    public final Integer b;

    public g5i(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5i)) {
            return false;
        }
        g5i g5iVar = (g5i) obj;
        return this.a == g5iVar.a && Intrinsics.c(this.b, g5iVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CyclingShirtColors(shirtColorResId=" + this.a + ", polkaDotsColorResId=" + this.b + ")";
    }
}
