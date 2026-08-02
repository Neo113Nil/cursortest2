package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rca {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List g;
    public String h;
    public String i;
    public String j;

    public rca() {
        km5 km5Var = km5.a;
        km5Var.getClass();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = km5Var;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rca)) {
            return false;
        }
        rca rcaVar = (rca) obj;
        return Intrinsics.c(this.a, rcaVar.a) && Intrinsics.c(this.b, rcaVar.b) && Intrinsics.c(this.c, rcaVar.c) && Intrinsics.c(this.d, rcaVar.d) && Intrinsics.c(this.e, rcaVar.e) && Intrinsics.c(this.f, rcaVar.f) && this.g.equals(rcaVar.g) && Intrinsics.c(this.h, rcaVar.h) && Intrinsics.c(this.i, rcaVar.i) && Intrinsics.c(this.j, rcaVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int d = dmi.d((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.g);
        String str7 = this.h;
        int hashCode6 = (d + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        return hashCode7 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(author=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", episode=");
        sb.append(this.c);
        sb.append(", episodeType=");
        sb.append(this.d);
        sb.append(", explicit=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", keywords=");
        sb.append(this.g);
        sb.append(", subtitle=");
        sb.append(this.h);
        sb.append(", summary=");
        sb.append(this.i);
        sb.append(", season=");
        return lnb.q(sb, this.j, ')');
    }
}
