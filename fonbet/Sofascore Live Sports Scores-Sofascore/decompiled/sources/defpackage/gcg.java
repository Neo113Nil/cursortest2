package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gcg {
    public final rag a;
    public final List b;
    public final List c;
    public final List d;
    public final String e;
    public final List f;
    public final List g;

    public gcg(rag ragVar, List list, List list2, List list3, String str, List list4, List list5) {
        ragVar.getClass();
        list.getClass();
        this.a = ragVar;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = str;
        this.f = list4;
        this.g = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcg)) {
            return false;
        }
        gcg gcgVar = (gcg) obj;
        return this.a == gcgVar.a && Intrinsics.c(this.b, gcgVar.b) && Intrinsics.c(this.c, gcgVar.c) && Intrinsics.c(this.d, gcgVar.d) && Intrinsics.c(this.e, gcgVar.e) && Intrinsics.c(this.f, gcgVar.f) && Intrinsics.c(this.g, gcgVar.g);
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list3 = this.f;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.g;
        return hashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASBaseAd(formatType=");
        sb.append(this.a);
        sb.append(", impressionPixelUrls=");
        sb.append(this.b);
        sb.append(", adLoadedPixelUrls=");
        vxd.w(sb, this.c, ", clickPixelUrls=", this.d, ", clickThroughUrl=");
        sb.append(this.e);
        sb.append(", viewabilityTrackingEvents=");
        sb.append(this.f);
        sb.append(", videoTrackingEvents=");
        return mz1.p(sb, this.g, ")");
    }
}
