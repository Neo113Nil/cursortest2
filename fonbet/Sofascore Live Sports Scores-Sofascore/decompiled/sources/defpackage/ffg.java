package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ffg {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final Integer e;
    public final String f;
    public final List g;
    public final List h;
    public final String i;
    public final ubg j;

    public ffg(String str, int i, int i2, int i3, Integer num, String str2, List list, List list2, String str3, ubg ubgVar) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = num;
        this.f = str2;
        this.g = list;
        this.h = list2;
        this.i = str3;
        this.j = ubgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffg)) {
            return false;
        }
        ffg ffgVar = (ffg) obj;
        return Intrinsics.c(this.a, ffgVar.a) && this.b == ffgVar.b && this.c == ffgVar.c && this.d == ffgVar.d && Intrinsics.c(this.e, ffgVar.e) && Intrinsics.c(this.f, ffgVar.f) && Intrinsics.c(this.g, ffgVar.g) && Intrinsics.c(this.h, ffgVar.h) && Intrinsics.c(this.i, ffgVar.i) && this.j == ffgVar.j;
    }

    public final int hashCode() {
        int a = wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        Integer num = this.e;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.h;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.i;
        return this.j.hashCode() + ((hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "SASNativeVideoAd(videoUrl=", this.a, ", videoWidth=", ", videoHeight=");
        me4.q(q, this.c, ", backgroundColor=", this.d, ", blurRadius=");
        vxd.s(this.e, ", clickThroughUrl=", this.f, ", adVerifications=", q);
        vxd.w(q, this.g, ", vastErrorPixelUrls=", this.h, ", vastMarkup=");
        q.append(this.i);
        q.append(", audioMode=");
        q.append(this.j);
        q.append(")");
        return q.toString();
    }
}
