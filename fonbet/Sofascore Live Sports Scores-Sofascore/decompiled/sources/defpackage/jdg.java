package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jdg {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public jdg(String str, String str2, String str3, Integer num, Integer num2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = num2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdg)) {
            return false;
        }
        jdg jdgVar = (jdg) obj;
        return Intrinsics.c(this.a, jdgVar.a) && Intrinsics.c(this.b, jdgVar.b) && Intrinsics.c(this.c, jdgVar.c) && Intrinsics.c(this.d, jdgVar.d) && Intrinsics.c(this.e, jdgVar.e) && this.f == jdgVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("SASHtmlAd(htmlContent=", this.a, ", scriptUrl=", this.b, ", trackingScript=");
        me4.o(this.d, this.c, ", width=", ", height=", s);
        s.append(this.e);
        s.append(", isImpressionPixelInAdMarkup=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
