package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class wfg {
    public final vfg a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final agg e;

    public wfg(vfg vfgVar, int i, Integer num, Integer num2, agg aggVar) {
        this.a = vfgVar;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = aggVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfg)) {
            return false;
        }
        wfg wfgVar = (wfg) obj;
        return this.a == wfgVar.a && this.b == wfgVar.b && Intrinsics.c(this.c, wfgVar.c) && Intrinsics.c(this.d, wfgVar.d) && Intrinsics.c(this.e, wfgVar.e);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        agg aggVar = this.e;
        return hashCode2 + (aggVar != null ? aggVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASParallaxAd(parallaxMode=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", creativeWidth=");
        vxd.r(this.c, this.d, ", creativeHeight=", ", parallaxMargins=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
