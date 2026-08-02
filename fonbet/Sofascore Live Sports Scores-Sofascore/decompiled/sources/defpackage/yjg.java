package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yjg {
    public final int a;
    public final String b;
    public final xjg c;
    public final int d;
    public final String e;

    public yjg(int i, String str, xjg xjgVar, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = xjgVar;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjg)) {
            return false;
        }
        yjg yjgVar = (yjg) obj;
        return this.a == yjgVar.a && Intrinsics.c(this.b, yjgVar.b) && Intrinsics.c(this.c, yjgVar.c) && this.d == yjgVar.d && Intrinsics.c(this.e, yjgVar.e);
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        xjg xjgVar = this.c;
        return this.e.hashCode() + wv8.a(this.d, (c + (xjgVar == null ? 0 : xjgVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "SmartConfig(networkId=", ", adCallBaseUrl=", this.b, ", adCallAdditionalParameters=");
        t.append(this.c);
        t.append(", latestSdkVersionId=");
        t.append(this.d);
        t.append(", latestSdkMessage=");
        return mz1.o(t, this.e, ")");
    }
}
