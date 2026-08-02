package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zil {
    public final int a;
    public final String b;
    public final String c;
    public final Integer d;

    public zil(int i, String str, String str2, Integer num) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zil)) {
            return false;
        }
        zil zilVar = (zil) obj;
        return this.a == zilVar.a && Intrinsics.c(this.b, zilVar.b) && this.c.equals(zilVar.c) && Intrinsics.c(this.d, zilVar.d);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "WorldCupTeamData(teamId=", ", teamName=", this.b, ", teamAlpha2=");
        t.append(this.c);
        t.append(", fifaRanking=");
        t.append(this.d);
        t.append(")");
        return t.toString();
    }
}
