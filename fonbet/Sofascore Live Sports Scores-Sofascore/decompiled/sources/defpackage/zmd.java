package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zmd {
    public final int a;
    public final String b;
    public final zmd c;
    public final String d;
    public final ymd e;

    public zmd(int i, String str, zmd zmdVar, String str2, ymd ymdVar) {
        this.a = i;
        this.b = str;
        this.c = zmdVar;
        this.d = str2;
        this.e = ymdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmd)) {
            return false;
        }
        zmd zmdVar = (zmd) obj;
        return this.a == zmdVar.a && Intrinsics.c(this.b, zmdVar.b) && Intrinsics.c(this.c, zmdVar.c) && Intrinsics.c(this.d, zmdVar.d) && this.e == zmdVar.e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        zmd zmdVar = this.c;
        int hashCode3 = (hashCode2 + (zmdVar == null ? 0 : zmdVar.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "OddsTeamUIModel(id=", ", name=", this.b, ", parentTeam=");
        t.append(this.c);
        t.append(", countryAlpha2=");
        t.append(this.d);
        t.append(", type=");
        t.append(this.e);
        t.append(")");
        return t.toString();
    }
}
