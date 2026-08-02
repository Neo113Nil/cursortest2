package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pge implements lic {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public pge(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static pge a(j9e j9eVar) {
        int m = j9eVar.m();
        String p = sjc.p(j9eVar.y(j9eVar.m(), StandardCharsets.US_ASCII));
        String y = j9eVar.y(j9eVar.m(), StandardCharsets.UTF_8);
        int m2 = j9eVar.m();
        int m3 = j9eVar.m();
        int m4 = j9eVar.m();
        int m5 = j9eVar.m();
        int m6 = j9eVar.m();
        byte[] bArr = new byte[m6];
        j9eVar.k(bArr, 0, m6);
        return new pge(m, p, y, m2, m3, m4, m5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pge.class != obj.getClass()) {
            return false;
        }
        pge pgeVar = (pge) obj;
        return this.a == pgeVar.a && this.b.equals(pgeVar.b) && this.c.equals(pgeVar.c) && this.d == pgeVar.d && this.e == pgeVar.e && this.f == pgeVar.f && this.g == pgeVar.g && Arrays.equals(this.h, pgeVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((dmi.c(dmi.c((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // defpackage.lic
    public final void u(o6c o6cVar) {
        o6cVar.a(this.a, this.h);
    }
}
