package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class znj {
    public final int a;
    public final String b;
    public final Integer c;
    public final String d;
    public final Integer e;

    public znj(int i, Integer num, Integer num2, String str, String str2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znj)) {
            return false;
        }
        znj znjVar = (znj) obj;
        return this.a == znjVar.a && Intrinsics.c(this.b, znjVar.b) && Intrinsics.c(this.c, znjVar.c) && Intrinsics.c(this.d, znjVar.d) && this.e.equals(znjVar.e);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TopStatsTeamData(id=", ", translatedName=", this.b, ", displayScore=");
        vxd.s(this.c, ", countryCode=", this.d, ", type=", t);
        return vxd.n(t, this.e, ")");
    }
}
