package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f57 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public f57(String str, String str2, String str3, String str4) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f57)) {
            return false;
        }
        f57 f57Var = (f57) obj;
        return Intrinsics.c(this.a, f57Var.a) && Intrinsics.c(this.b, f57Var.b) && Intrinsics.c(this.c, f57Var.c) && Intrinsics.c(this.d, f57Var.d);
    }

    public final int hashCode() {
        int c = dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return fc6.o(mz1.s("FantasyLeagueParticipantTeam(userId=", this.a, ", teamName=", this.b, ", userNickname="), this.c, ", userImageUrl=", this.d, ")");
    }
}
