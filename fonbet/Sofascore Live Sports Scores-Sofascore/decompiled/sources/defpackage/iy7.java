package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class iy7 {
    public final Integer a;
    public final String b;

    public iy7(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy7)) {
            return false;
        }
        iy7 iy7Var = (iy7) obj;
        return Intrinsics.c(this.a, iy7Var.a) && Intrinsics.c(this.b, iy7Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedUniqueTournament(uniqueTournamentId=" + this.a + ", uniqueTournamentTranslatedName=" + this.b + ")";
    }
}
