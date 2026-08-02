package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b9g {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public final List m;
    public sca n;
    public String o;
    public gol p;
    public gnf q;
    public inf r;
    public int s;

    public b9g() {
        ArrayList arrayList = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = arrayList;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = -1;
    }

    public final void a(String str) {
        if (this.h != null || str == null || str.length() <= 0) {
            return;
        }
        this.h = str;
    }

    public final void b(String str, String str2) {
        if (str != null) {
            String str3 = null;
            if (StringsKt.R(str)) {
                str = null;
            }
            if (str == null) {
                return;
            }
            if (str2 != null) {
                str3 = str2.toLowerCase(Locale.ROOT);
                str3.getClass();
            }
            int i = Intrinsics.c(str3, "alternate") ? 3 : (str3 == null || StringsKt.R(str3)) ? 2 : str3.equals("related") ? 0 : 1;
            if (i > this.s) {
                this.d = str;
                this.s = i;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9g)) {
            return false;
        }
        b9g b9gVar = (b9g) obj;
        return Intrinsics.c(this.a, b9gVar.a) && Intrinsics.c(this.b, b9gVar.b) && Intrinsics.c(this.c, b9gVar.c) && Intrinsics.c(this.d, b9gVar.d) && Intrinsics.c(this.e, b9gVar.e) && Intrinsics.c(this.f, b9gVar.f) && Intrinsics.c(this.g, b9gVar.g) && Intrinsics.c(this.h, b9gVar.h) && Intrinsics.c(this.i, b9gVar.i) && Intrinsics.c(this.j, b9gVar.j) && Intrinsics.c(this.k, b9gVar.k) && Intrinsics.c(this.l, b9gVar.l) && Intrinsics.c(this.m, b9gVar.m) && Intrinsics.c(this.n, b9gVar.n) && Intrinsics.c(this.o, b9gVar.o) && Intrinsics.c(this.p, b9gVar.p) && Intrinsics.c(this.q, b9gVar.q) && Intrinsics.c(this.r, b9gVar.r);
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
        return "Builder(guid=" + this.a + ", title=" + this.b + ", author=" + this.c + ", link=" + this.d + ", pubDate=" + this.e + ", description=" + this.f + ", content=" + this.g + ", image=" + this.h + ", audio=" + this.i + ", video=" + this.j + ", sourceName=" + this.k + ", sourceUrl=" + this.l + ", categories=" + this.m + ", itunesItemData=" + this.n + ", commentUrl=" + this.o + ", youtubeItemData=" + this.p + ", rawEnclosure=" + this.q + ", rawMediaContent=" + this.r + ')';
    }
}
