package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class qbf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;

    public qbf(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, Integer num) {
        str2.getClass();
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbf)) {
            return false;
        }
        qbf qbfVar = (qbf) obj;
        return Intrinsics.c(this.a, qbfVar.a) && Intrinsics.c(this.b, qbfVar.b) && this.c.equals(qbfVar.c) && this.d.equals(qbfVar.d) && this.e == qbfVar.e && Intrinsics.c(this.f, qbfVar.f) && Intrinsics.c(this.g, qbfVar.g) && Intrinsics.c(this.h, qbfVar.h) && this.i.equals(qbfVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int e = dmi.e(dmi.c(dmi.c(dmi.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return this.i.hashCode() + dmi.c((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder s = mz1.s("ProfileLeaderboardUserRowData(userId=", this.a, ", rank=", this.b, ", imageUrl=");
        bf3.v(s, this.c, ", nickname=", this.d, ", isOwnProfile=");
        s.append(this.e);
        s.append(", valueColumn1=");
        s.append(this.f);
        s.append(", valueColumn2=");
        bf3.v(s, this.g, ", valueColumn3=", this.h, ", rankingMove=");
        return vxd.n(s, this.i, ")");
    }
}
