package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class afg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Double e;
    public final zeg f;
    public final zeg g;

    public afg(String str, String str2, String str3, String str4, Double d, zeg zegVar, zeg zegVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d;
        this.f = zegVar;
        this.g = zegVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afg)) {
            return false;
        }
        afg afgVar = (afg) obj;
        return Intrinsics.c(this.a, afgVar.a) && Intrinsics.c(this.b, afgVar.b) && Intrinsics.c(this.c, afgVar.c) && Intrinsics.c(this.d, afgVar.d) && Intrinsics.c(this.e, afgVar.e) && Intrinsics.c(this.f, afgVar.f) && Intrinsics.c(this.g, afgVar.g);
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
        Double d = this.e;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        zeg zegVar = this.f;
        int hashCode6 = (hashCode5 + (zegVar == null ? 0 : zegVar.hashCode())) * 31;
        zeg zegVar2 = this.g;
        return hashCode6 + (zegVar2 != null ? zegVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = mz1.s("SASNativeAdAssets(title=", this.a, ", body=", this.b, ", callToAction=");
        bf3.v(s, this.c, ", advertiser=", this.d, ", rating=");
        s.append(this.e);
        s.append(", iconImage=");
        s.append(this.f);
        s.append(", mainView=");
        s.append(this.g);
        s.append(")");
        return s.toString();
    }
}
