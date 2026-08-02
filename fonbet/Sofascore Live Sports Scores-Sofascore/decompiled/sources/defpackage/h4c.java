package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h4c implements k4c {
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;

    public h4c(int i, int i2, boolean z, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4c)) {
            return false;
        }
        h4c h4cVar = (h4c) obj;
        return this.a == h4cVar.a && this.b == h4cVar.b && this.c == h4cVar.c && Intrinsics.c(this.d, h4cVar.d) && Intrinsics.c(this.e, h4cVar.e) && Intrinsics.c(this.f, h4cVar.f) && Intrinsics.c(this.g, h4cVar.g) && Intrinsics.c(this.h, h4cVar.h);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.e(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d);
        Integer num = this.e;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "EventMediaEntity(homeTeamId=", ", awayTeamId=", ", isDoublesMatch=");
        s.append(this.c);
        s.append(", sport=");
        s.append(this.d);
        s.append(", homeSubTeam1Id=");
        vxd.r(this.e, this.f, ", homeSubTeam2Id=", ", awaySubTeam1Id=", s);
        return fc6.l(this.g, this.h, ", awaySubTeam2Id=", ")", s);
    }
}
