package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sig {
    public final String a;
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final Map g;
    public final b10 h;

    public sig(String str, int i, String str2, int i2, int i3, String str3, Map map, b10 b10Var) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = map;
        this.h = b10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sig) {
            sig sigVar = (sig) obj;
            return Intrinsics.c(this.a, sigVar.a) && this.b == sigVar.b && Intrinsics.c(this.c, sigVar.c) && this.d == sigVar.d && this.e == sigVar.e && this.f.equals(sigVar.f) && Intrinsics.c(this.g, sigVar.g) && this.h == sigVar.h;
        }
        return false;
    }

    public final int hashCode() {
        int a = wv8.a(this.b, dmi.c(Integer.hashCode(415167) * 31, 31, this.a), 31);
        String str = this.c;
        int c = dmi.c(wv8.a(this.e, wv8.a(this.d, (a + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.f);
        return (this.h.hashCode() + dmi.e(wv8.a(3131, (((((c + (this.g != null ? r3.hashCode() : 0)) * 31) - 914500552) * 31) + 53140931) * 31, 31), 31, true)) * 29791;
    }

    public final String toString() {
        StringBuilder q = mz1.q(this.b, "SCSCustomerFeedbackInfo(siteId=415167, pageIdOrName=", this.a, ", formatId=", ", keywordTargeting=");
        w1l.q(this.d, this.c, ", formatType=", ", networkId=", q);
        vxd.p(this.e, ", insertionId=", this.f, ", extraParameters=", q);
        q.append(this.g);
        q.append(", sdkName=displaysdk, sdkVersion=8.6.1, sdkVersionId=3131, isPrimarySdk=true, identity=");
        q.append(this.h);
        q.append(", primarySdkName=null, primarySdkVersion=null, mediationAdapterVersion=null)");
        return q.toString();
    }
}
