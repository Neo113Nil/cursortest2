package defpackage;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uk4 {
    public final long a;
    public final float b;
    public final pug c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public uk4(long j, float f, pug pugVar, String str, String str2, String str3, String str4, String str5, String str6) {
        pugVar.getClass();
        this.a = j;
        this.b = f;
        this.c = pugVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static uk4 a(uk4 uk4Var, long j, float f, pug pugVar, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if ((i & 1) != 0) {
            j = uk4Var.a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = uk4Var.b;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            pugVar = uk4Var.c;
        }
        pug pugVar2 = pugVar;
        String str7 = (i & 8) != 0 ? uk4Var.d : str;
        String str8 = (i & 16) != 0 ? uk4Var.e : str2;
        String str9 = (i & 32) != 0 ? uk4Var.f : str3;
        String str10 = (i & 64) != 0 ? uk4Var.g : str4;
        String str11 = (i & 128) != 0 ? uk4Var.h : str5;
        String str12 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? uk4Var.i : str6;
        pugVar2.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        return new uk4(j2, f2, pugVar2, str7, str8, str9, str10, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk4)) {
            return false;
        }
        uk4 uk4Var = (uk4) obj;
        return this.a == uk4Var.a && Float.compare(this.b, uk4Var.b) == 0 && this.c == uk4Var.c && this.d.equals(uk4Var.d) && this.e.equals(uk4Var.e) && this.f.equals(uk4Var.f) && this.g.equals(uk4Var.g) && this.h.equals(uk4Var.h) && this.i.equals(uk4Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + dmi.c(dmi.c(dmi.c(dmi.c(dmi.c((this.c.hashCode() + fc6.a(this.b, Long.hashCode(this.a) * 31, 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateUiState(timestamp=");
        sb.append(this.a);
        sb.append(", scrollProgress=");
        sb.append(this.b);
        sb.append(", direction=");
        sb.append(this.c);
        sb.append(", previousLabelDate=");
        sb.append(this.d);
        bf3.v(sb, ", previousLabelDay=", this.e, ", dateLabel=", this.f);
        bf3.v(sb, ", dayLabel=", this.g, ", nextLabelDate=", this.h);
        return wt3.m(", nextLabelDay=", this.i, sb, ")");
    }
}
