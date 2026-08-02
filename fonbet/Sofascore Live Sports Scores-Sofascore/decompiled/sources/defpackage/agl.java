package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class agl {
    public final Integer a;
    public final String b;
    public final String c;
    public final r9k d;
    public final int e;
    public final int f;

    public agl(Integer num, String str, String str2, r9k r9kVar, int i, int i2) {
        str2.getClass();
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = r9kVar;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agl)) {
            return false;
        }
        agl aglVar = (agl) obj;
        return Intrinsics.c(this.a, aglVar.a) && Intrinsics.c(this.b, aglVar.b) && Intrinsics.c(this.c, aglVar.c) && this.d.equals(aglVar.d) && this.e == aglVar.e && this.f == aglVar.f;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return Integer.hashCode(this.f) + wv8.a(this.e, (this.d.hashCode() + dmi.c((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = wv8.m("WorldCupMyTeamSelectedTeamData(teamId=", this.a, ", teamCountryAlpha2=", this.b, ", teamName=");
        m.append(this.c);
        m.append(", groupName=");
        m.append(this.d);
        m.append(", ranking=");
        return me4.i(m, this.e, ", points=", this.f, ")");
    }
}
