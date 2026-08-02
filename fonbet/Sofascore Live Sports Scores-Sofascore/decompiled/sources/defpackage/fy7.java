package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Gender;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class fy7 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final ey7 e;
    public final ey7 f;
    public final String g;
    public final Double h;
    public final String i;
    public final Gender j;
    public final String k;
    public final boolean l;

    public /* synthetic */ fy7(int i, String str, String str2, ey7 ey7Var, ey7 ey7Var2, Double d, int i2) {
        this(i, str, str2, 1, (i2 & 16) != 0 ? null : ey7Var, (i2 & 32) != 0 ? null : ey7Var2, (i2 & 64) != 0 ? null : "ATP 1", (i2 & 128) != 0 ? null : d, (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : "HR", null, (i2 & 1024) == 0 ? "4" : null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy7)) {
            return false;
        }
        fy7 fy7Var = (fy7) obj;
        return this.a == fy7Var.a && Intrinsics.c(this.b, fy7Var.b) && Intrinsics.c(this.c, fy7Var.c) && this.d == fy7Var.d && Intrinsics.c(this.e, fy7Var.e) && Intrinsics.c(this.f, fy7Var.f) && Intrinsics.c(this.g, fy7Var.g) && Intrinsics.c(this.h, fy7Var.h) && Intrinsics.c(this.i, fy7Var.i) && this.j == fy7Var.j && Intrinsics.c(this.k, fy7Var.k) && this.l == fy7Var.l;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int a = wv8.a(this.d, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ey7 ey7Var = this.e;
        int hashCode3 = (a + (ey7Var == null ? 0 : ey7Var.hashCode())) * 31;
        ey7 ey7Var2 = this.f;
        int hashCode4 = (hashCode3 + (ey7Var2 == null ? 0 : ey7Var2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.h;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        String str4 = this.i;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Gender gender = this.j;
        int hashCode8 = (hashCode7 + (gender == null ? 0 : gender.hashCode())) * 31;
        String str5 = this.k;
        return Boolean.hashCode(this.l) + ((hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "FeedTeam(id=", ", translatedName=", this.b, ", translatedShortName=");
        w1l.q(this.d, this.c, ", type=", ", subTeam1=", t);
        t.append(this.e);
        t.append(", subTeam2=");
        t.append(this.f);
        t.append(", tennisRanking=");
        t.append(this.g);
        t.append(", rating=");
        t.append(this.h);
        t.append(", countryAlpha2=");
        t.append(this.i);
        t.append(", gender=");
        t.append(this.j);
        t.append(", seed=");
        t.append(this.k);
        t.append(", national=");
        t.append(this.l);
        t.append(")");
        return t.toString();
    }

    public fy7(int i, String str, String str2, int i2, ey7 ey7Var, ey7 ey7Var2, String str3, Double d, String str4, Gender gender, String str5, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = ey7Var;
        this.f = ey7Var2;
        this.g = str3;
        this.h = d;
        this.i = str4;
        this.j = gender;
        this.k = str5;
        this.l = z;
    }
}
