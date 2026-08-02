package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gqe {
    public final Integer a;
    public final String b;
    public final boolean c;

    public gqe(Integer num, String str, boolean z) {
        str.getClass();
        this.a = num;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqe)) {
            return false;
        }
        gqe gqeVar = (gqe) obj;
        return Intrinsics.c(this.a, gqeVar.a) && Intrinsics.c(this.b, gqeVar.b) && this.c == gqeVar.c;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.c) + dmi.c((num == null ? 0 : num.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return wt3.p(wv8.m("PlayerEventTournamentInfo(id=", this.a, ", name=", this.b, ", hasBasketballRating="), this.c, ")");
    }
}
