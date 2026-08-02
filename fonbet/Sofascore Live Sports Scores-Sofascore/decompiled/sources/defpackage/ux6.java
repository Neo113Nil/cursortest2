package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ux6 {
    public final int a;
    public final int b;
    public final o68 c;
    public final p68 d;
    public final String e;

    public ux6(int i, int i2, o68 o68Var, p68 p68Var, String str) {
        this.a = i;
        this.b = i2;
        this.c = o68Var;
        this.d = p68Var;
        this.e = str;
    }

    public final String a() {
        p68 p68Var = this.d;
        return CollectionsKt.f0(ph0.x(new String[]{this.e, p68Var != null ? lnb.o("(", p68Var.a, ")") : null}), " ", null, null, null, 62);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux6)) {
            return false;
        }
        ux6 ux6Var = (ux6) obj;
        return this.a == ux6Var.a && this.b == ux6Var.b && this.c == ux6Var.c && this.d == ux6Var.d && Intrinsics.c(this.e, ux6Var.e);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        o68 o68Var = this.c;
        int hashCode = (a + (o68Var == null ? 0 : o68Var.hashCode())) * 31;
        p68 p68Var = this.d;
        int hashCode2 = (hashCode + (p68Var == null ? 0 : p68Var.hashCode())) * 31;
        String str = this.e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "FantasyFdrGameweekFixture(eventId=", ", opponentId=", ", fdr=");
        s.append(this.c);
        s.append(", locationType=");
        s.append(this.d);
        s.append(", opponentNameCode=");
        return mz1.o(s, this.e, ")");
    }
}
