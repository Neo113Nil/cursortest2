package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ms3 {
    public final int a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public ms3(int i, String str, Integer num, Integer num2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms3)) {
            return false;
        }
        ms3 ms3Var = (ms3) obj;
        return this.a == ms3Var.a && Intrinsics.c(this.b, ms3Var.b) && Intrinsics.c(this.c, ms3Var.c) && Intrinsics.c(this.d, ms3Var.d);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return fc6.l(this.c, this.d, ", penalties=", ")", dmi.t(this.a, "ContributionsTeamUiModel(id=", ", translatedName=", this.b, ", displayScore="));
    }
}
