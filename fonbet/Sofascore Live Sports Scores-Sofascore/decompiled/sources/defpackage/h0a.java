package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h0a {
    public final boolean a;
    public final String b;
    public final rz9 c;
    public final String d;
    public final wz9 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final kae k;
    public final boolean l;
    public final oz9 m;
    public final int n;
    public final uz9 o;

    public h0a(boolean z, String str, rz9 rz9Var, String str2, wz9 wz9Var, String str3, String str4, String str5, String str6, boolean z2, kae kaeVar, boolean z3, oz9 oz9Var, int i, uz9 uz9Var, int i2) {
        str2 = (i2 & 8) != 0 ? null : str2;
        wz9 wz9Var2 = (i2 & 16) != 0 ? null : wz9Var;
        String str7 = (i2 & 128) != 0 ? null : str5;
        String str8 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str6;
        boolean z4 = (i2 & 512) != 0 ? false : z2;
        kae kaeVar2 = (i2 & 1024) != 0 ? null : kaeVar;
        boolean z5 = (i2 & a.o) == 0 ? z3 : false;
        oz9 oz9Var2 = (i2 & 4096) != 0 ? null : oz9Var;
        int i3 = (i2 & 8192) != 0 ? 2 : i;
        uz9 uz9Var2 = (i2 & 16384) == 0 ? uz9Var : null;
        this.a = z;
        this.b = str;
        this.c = rz9Var;
        this.d = str2;
        this.e = wz9Var2;
        this.f = str3;
        this.g = str4;
        this.h = str7;
        this.i = str8;
        this.j = z4;
        this.k = kaeVar2;
        this.l = z5;
        this.m = oz9Var2;
        this.n = i3;
        this.o = uz9Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0a)) {
            return false;
        }
        h0a h0aVar = (h0a) obj;
        return this.a == h0aVar.a && Intrinsics.c(this.b, h0aVar.b) && Intrinsics.c(this.c, h0aVar.c) && Intrinsics.c(this.d, h0aVar.d) && Intrinsics.c(this.e, h0aVar.e) && Intrinsics.c(this.f, h0aVar.f) && Intrinsics.c(this.g, h0aVar.g) && Intrinsics.c(this.h, h0aVar.h) && Intrinsics.c(this.i, h0aVar.i) && this.j == h0aVar.j && Intrinsics.c(this.k, h0aVar.k) && this.l == h0aVar.l && this.m == h0aVar.m && this.n == h0aVar.n && Intrinsics.c(this.o, h0aVar.o);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        rz9 rz9Var = this.c;
        int hashCode3 = (hashCode2 + (rz9Var == null ? 0 : rz9Var.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wz9 wz9Var = this.e;
        int hashCode5 = (hashCode4 + (wz9Var == null ? 0 : wz9Var.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int e = dmi.e((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.j);
        kae kaeVar = this.k;
        int e2 = dmi.e((e + (kaeVar == null ? 0 : kaeVar.hashCode())) * 31, 31, this.l);
        oz9 oz9Var = this.m;
        int a = wv8.a(this.n, (e2 + (oz9Var == null ? 0 : oz9Var.hashCode())) * 31, 31);
        uz9 uz9Var = this.o;
        return a + (uz9Var != null ? uz9Var.hashCode() : 0);
    }

    public final String toString() {
        String C = b6a.C(this.n);
        StringBuilder sb = new StringBuilder("IncidentUIModel(isHome=");
        sb.append(this.a);
        sb.append(", time=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", points=");
        sb.append(this.d);
        sb.append(", score=");
        sb.append(this.e);
        sb.append(", firstDescription=");
        sb.append(this.f);
        sb.append(", secondDescription=");
        bf3.v(sb, this.g, ", thirdDescription=", this.h, ", fourthDescription=");
        dmi.w(sb, this.i, ", verticalDescriptionOrientation=", this.j, ", passingNetworkData=");
        sb.append(this.k);
        sb.append(", useLiveColor=");
        sb.append(this.l);
        sb.append(", incidentDetailsButtonType=");
        sb.append(this.m);
        sb.append(", secondDescriptionTextOverflow=");
        sb.append(C);
        sb.append(", penaltyHistory=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
