package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sca {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;

    public sca(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sca)) {
            return false;
        }
        sca scaVar = (sca) obj;
        return Intrinsics.c(this.a, scaVar.a) && Intrinsics.c(this.b, scaVar.b) && Intrinsics.c(this.c, scaVar.c) && Intrinsics.c(this.d, scaVar.d) && Intrinsics.c(this.e, scaVar.e) && Intrinsics.c(this.f, scaVar.f) && this.g.equals(scaVar.g) && Intrinsics.c(this.h, scaVar.h) && Intrinsics.c(this.i, scaVar.i) && Intrinsics.c(this.j, scaVar.j);
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
        StringBuilder sb = new StringBuilder("ItunesItemData(author=");
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
