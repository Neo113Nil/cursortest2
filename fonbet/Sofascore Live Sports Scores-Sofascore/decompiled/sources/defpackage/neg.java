package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class neg {
    public final String a;
    public final Integer b;
    public final String c;
    public final String d;

    public neg(String str, Integer num, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof neg)) {
            return false;
        }
        neg negVar = (neg) obj;
        return Intrinsics.c(this.a, negVar.a) && Intrinsics.c(this.b, negVar.b) && Intrinsics.c(this.c, negVar.c) && Intrinsics.c(this.d, negVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return dmi.c((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SASMediationAd(mediationAdapterClassName=");
        sb.append(this.a);
        sb.append(", sdkId=");
        sb.append(this.b);
        sb.append(", sdkName=");
        return fc6.o(sb, this.c, ", serverSideParametersString=", this.d, ", clientSideParameters=null)");
    }
}
