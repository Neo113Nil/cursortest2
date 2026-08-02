package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y8g {
    public final String a;
    public final String b;
    public final String c;
    public final a9g d;
    public final String e;
    public final String f;
    public final List g;
    public final qca h;
    public final eol i;

    public y8g(String str, String str2, String str3, a9g a9gVar, String str4, String str5, List list, qca qcaVar, eol eolVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a9gVar;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = qcaVar;
        this.i = eolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8g)) {
            return false;
        }
        y8g y8gVar = (y8g) obj;
        return Intrinsics.c(this.a, y8gVar.a) && Intrinsics.c(this.b, y8gVar.b) && Intrinsics.c(this.c, y8gVar.c) && Intrinsics.c(this.d, y8gVar.d) && Intrinsics.c(this.e, y8gVar.e) && Intrinsics.c(this.f, y8gVar.f) && this.g.equals(y8gVar.g) && Intrinsics.c(this.h, y8gVar.h) && Intrinsics.c(this.i, y8gVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a9g a9gVar = this.d;
        int hashCode4 = (hashCode3 + (a9gVar == null ? 0 : a9gVar.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int d = dmi.d((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.g);
        qca qcaVar = this.h;
        int hashCode6 = (d + (qcaVar == null ? 0 : qcaVar.hashCode())) * 31;
        eol eolVar = this.i;
        return hashCode6 + (eolVar != null ? eolVar.hashCode() : 0);
    }

    public final String toString() {
        return "RssChannel(title=" + this.a + ", link=" + this.b + ", description=" + this.c + ", image=" + this.d + ", lastBuildDate=" + this.e + ", updatePeriod=" + this.f + ", items=" + this.g + ", itunesChannelData=" + this.h + ", youtubeChannelData=" + this.i + ')';
    }
}
