package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wyi {
    public final int a;
    public final long b;
    public final int c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final boolean h;
    public final vyi i;
    public final boolean j;

    public wyi(int i, long j, int i2, Integer num, Integer num2, String str, String str2, boolean z, vyi vyiVar, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = str2;
        this.h = z;
        this.i = vyiVar;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyi)) {
            return false;
        }
        wyi wyiVar = (wyi) obj;
        return this.a == wyiVar.a && this.b == wyiVar.b && this.c == wyiVar.c && Intrinsics.c(this.d, wyiVar.d) && Intrinsics.c(this.e, wyiVar.e) && Intrinsics.c(this.f, wyiVar.f) && Intrinsics.c(this.g, wyiVar.g) && this.h == wyiVar.h && this.i == wyiVar.i && this.j == wyiVar.j;
    }

    public final int hashCode() {
        int a = wv8.a(this.c, ljg.c(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        Integer num = this.d;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + dmi.e((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TeamRecentFormEventUiModel(eventId=");
        sb.append(this.a);
        sb.append(", startTimestamp=");
        sb.append(this.b);
        sb.append(", opponentTeamId=");
        sb.append(this.c);
        sb.append(", opponentSubTeam1Id=");
        sb.append(this.d);
        fn0.x(this.e, ", opponentSubTeam2Id=", ", homeScoreDisplay=", this.f, sb);
        sb.append(", awayScoreDisplay=");
        sb.append(this.g);
        sb.append(", isHomeTeam=");
        sb.append(this.h);
        sb.append(", result=");
        sb.append(this.i);
        sb.append(", isHockeyOvertimeLoss=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
