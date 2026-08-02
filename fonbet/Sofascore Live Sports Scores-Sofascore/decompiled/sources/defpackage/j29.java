package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j29 implements Serializable {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public Integer d;
    public final Integer e;
    public ixa f;

    public j29(Integer num, Integer num2, Integer num3, int i) {
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        num3 = (i & 8) != 0 ? null : num3;
        Integer num4 = (i & 64) != 0 ? null : 92;
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = null;
        this.e = num4;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j29)) {
            return false;
        }
        j29 j29Var = (j29) obj;
        return Intrinsics.c(this.a, j29Var.a) && Intrinsics.c(this.b, j29Var.b) && Intrinsics.c(this.c, j29Var.c) && Intrinsics.c(this.d, j29Var.d) && Intrinsics.c(this.e, j29Var.e) && Intrinsics.c(this.f, j29Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 961;
        Integer num5 = this.e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 961;
        ixa ixaVar = this.f;
        return hashCode5 + (ixaVar != null ? ixaVar.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.d;
        ixa ixaVar = this.f;
        StringBuilder k = wv8.k(this.a, "GraphicLargeItem(smallDrawableResource=null, largeDrawableResource=", ", titleResource=", ", subtitleResource=", this.b);
        vxd.r(this.c, num, ", buttonTextResource=", ", backgroundColorResource=null, paddingTop=", k);
        k.append(this.e);
        k.append(", paddingBottom=null, onButtonClickedListener=");
        k.append(ixaVar);
        k.append(")");
        return k.toString();
    }
}
