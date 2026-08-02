package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s77 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public s77(Integer num, String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s77)) {
            return false;
        }
        s77 s77Var = (s77) obj;
        return Intrinsics.c(this.a, s77Var.a) && Intrinsics.c(this.b, s77Var.b) && Intrinsics.c(this.c, s77Var.c) && this.d.equals(s77Var.d) && Intrinsics.c(this.e, s77Var.e) && this.f.equals(s77Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int c = dmi.c(dmi.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        return this.f.hashCode() + ((c + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = wv8.m("FantasyMatchupTeamUiModel(userCompetitionId=", this.a, ", userId=", this.b, ", teamName=");
        bf3.v(m, this.c, ", rank=", this.d, ", wdl=");
        return fc6.o(m, this.e, ", score=", this.f, ")");
    }
}
