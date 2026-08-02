package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w5f {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public w5f(int i, int i2, int i3, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
        this.e = num2;
        this.f = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5f)) {
            return false;
        }
        w5f w5fVar = (w5f) obj;
        return this.a == w5fVar.a && this.b == w5fVar.b && this.c == w5fVar.c && Intrinsics.c(this.d, w5fVar.d) && Intrinsics.c(this.e, w5fVar.e) && Intrinsics.c(this.f, w5fVar.f);
    }

    public final int hashCode() {
        int a = wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "PrematchH2HEventItem(eventId=", ", homeTeamId=", ", awayTeamId=");
        s.append(this.c);
        s.append(", homeTeamScore=");
        s.append(this.d);
        s.append(", awayTeamScore=");
        return fc6.l(this.e, this.f, ", winnerCode=", ")", s);
    }
}
