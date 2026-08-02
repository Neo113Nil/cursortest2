package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wbg {
    public final vbg a;
    public final Integer b;
    public final Integer c;

    public wbg(vbg vbgVar, Integer num, Integer num2) {
        this.a = vbgVar;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbg)) {
            return false;
        }
        wbg wbgVar = (wbg) obj;
        return this.a == wbgVar.a && Intrinsics.c(this.b, wbgVar.b) && Intrinsics.c(this.c, wbgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASBannerAd(bannerIntegrationType=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return vxd.n(sb, this.c, ")");
    }
}
