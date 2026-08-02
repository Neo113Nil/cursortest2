package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q5l {
    public final Integer a;
    public final Integer b;

    public q5l(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5l)) {
            return false;
        }
        q5l q5lVar = (q5l) obj;
        return Intrinsics.c(this.a, q5lVar.a) && Intrinsics.c(this.b, q5lVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "WeeklyStreakUiModel(currentStreak=" + this.a + ", maxStreak=" + this.b + ")";
    }
}
