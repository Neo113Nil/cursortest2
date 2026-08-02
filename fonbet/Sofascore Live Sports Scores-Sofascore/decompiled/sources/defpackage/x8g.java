package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x8g {
    public String a;
    public String b;
    public String c;
    public a9g d;
    public String e;
    public String f;
    public final List g;
    public qca h;
    public eol i;

    public x8g() {
        ArrayList arrayList = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = arrayList;
        this.h = null;
        this.i = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8g)) {
            return false;
        }
        x8g x8gVar = (x8g) obj;
        return Intrinsics.c(this.a, x8gVar.a) && Intrinsics.c(this.b, x8gVar.b) && Intrinsics.c(this.c, x8gVar.c) && Intrinsics.c(this.d, x8gVar.d) && Intrinsics.c(this.e, x8gVar.e) && Intrinsics.c(this.f, x8gVar.f) && this.g.equals(x8gVar.g) && Intrinsics.c(this.h, x8gVar.h) && Intrinsics.c(this.i, x8gVar.i);
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
        return "Builder(title=" + this.a + ", link=" + this.b + ", description=" + this.c + ", image=" + this.d + ", lastBuildDate=" + this.e + ", updatePeriod=" + this.f + ", items=" + this.g + ", itunesChannelData=" + this.h + ", youtubeChannelData=" + this.i + ')';
    }
}
