package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class khg {
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final ubg g;

    public khg(String str, String str2, List list, List list2, String str3, String str4, ubg ubgVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = str3;
        this.f = str4;
        this.g = ubgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khg)) {
            return false;
        }
        khg khgVar = (khg) obj;
        return Intrinsics.c(this.a, khgVar.a) && Intrinsics.c(this.b, khgVar.b) && Intrinsics.c(this.c, khgVar.c) && Intrinsics.c(this.d, khgVar.d) && Intrinsics.c(this.e, khgVar.e) && Intrinsics.c(this.f, khgVar.f) && this.g == khgVar.g;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = mz1.s("SASVpaidAd(vpaidUrl=", this.a, ", clickThroughUrl=", this.b, ", adVerifications=");
        vxd.w(s, this.c, ", vastErrorPixelUrls=", this.d, ", vastMarkup=");
        bf3.v(s, this.e, ", adParameters=", this.f, ", audioMode=");
        s.append(this.g);
        s.append(")");
        return s.toString();
    }
}
