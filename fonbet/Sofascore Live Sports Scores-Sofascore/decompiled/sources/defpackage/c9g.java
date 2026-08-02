package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class c9g {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final List m;
    public final sca n;
    public final String o;
    public final gol p;
    public final gnf q;
    public final inf r;

    public c9g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, sca scaVar, String str13, gol golVar, gnf gnfVar, inf infVar) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = list;
        this.n = scaVar;
        this.o = str13;
        this.p = golVar;
        this.q = gnfVar;
        this.r = infVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9g)) {
            return false;
        }
        c9g c9gVar = (c9g) obj;
        return Intrinsics.c(this.a, c9gVar.a) && Intrinsics.c(this.b, c9gVar.b) && Intrinsics.c(this.c, c9gVar.c) && Intrinsics.c(this.d, c9gVar.d) && Intrinsics.c(this.e, c9gVar.e) && Intrinsics.c(this.f, c9gVar.f) && Intrinsics.c(this.g, c9gVar.g) && Intrinsics.c(this.h, c9gVar.h) && Intrinsics.c(this.i, c9gVar.i) && Intrinsics.c(this.j, c9gVar.j) && Intrinsics.c(this.k, c9gVar.k) && Intrinsics.c(this.l, c9gVar.l) && Intrinsics.c(this.m, c9gVar.m) && Intrinsics.c(this.n, c9gVar.n) && Intrinsics.c(this.o, c9gVar.o) && Intrinsics.c(this.p, c9gVar.p) && Intrinsics.c(this.q, c9gVar.q) && Intrinsics.c(this.r, c9gVar.r);
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
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.l;
        int d = dmi.d((hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.m);
        sca scaVar = this.n;
        int hashCode12 = (d + (scaVar == null ? 0 : scaVar.hashCode())) * 31;
        String str13 = this.o;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        gol golVar = this.p;
        int hashCode14 = (hashCode13 + (golVar == null ? 0 : golVar.hashCode())) * 31;
        gnf gnfVar = this.q;
        int hashCode15 = (hashCode14 + (gnfVar == null ? 0 : gnfVar.hashCode())) * 31;
        inf infVar = this.r;
        return hashCode15 + (infVar != null ? infVar.hashCode() : 0);
    }

    public final String toString() {
        return "RssItem(guid=" + this.a + ", title=" + this.b + ", author=" + this.c + ", link=" + this.d + ", pubDate=" + this.e + ", description=" + this.f + ", content=" + this.g + ", image=" + this.h + ", audio=" + this.i + ", video=" + this.j + ", sourceName=" + this.k + ", sourceUrl=" + this.l + ", categories=" + this.m + ", itunesItemData=" + this.n + ", commentsUrl=" + this.o + ", youtubeItemData=" + this.p + ", rawEnclosure=" + this.q + ", rawMediaContent=" + this.r + ')';
    }
}
