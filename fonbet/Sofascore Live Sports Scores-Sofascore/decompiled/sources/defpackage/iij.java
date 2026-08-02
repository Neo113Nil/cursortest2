package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iij {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public kg g = kg.g;

    static {
        wt3.s(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        hg b = this.g.b(i);
        return b.b != -1 ? b.g[i2] : C.TIME_UNSET;
    }

    public final long b(int i) {
        return this.g.b(i).a;
    }

    public final int c(int i) {
        return this.g.b(i).b(-1);
    }

    public final boolean d(int i) {
        kg kgVar = this.g;
        if (i != kgVar.b - 1) {
            return false;
        }
        kgVar.e(i);
        return false;
    }

    public final boolean e(int i) {
        this.g.b(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !iij.class.equals(obj.getClass())) {
            return false;
        }
        iij iijVar = (iij) obj;
        return Objects.equals(this.a, iijVar.a) && Objects.equals(this.b, iijVar.b) && this.c == iijVar.c && this.d == iijVar.d && this.e == iijVar.e && this.f == iijVar.f && Objects.equals(this.g, iijVar.g);
    }

    public final void f(Object obj, Object obj2, int i, long j, long j2, kg kgVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = kgVar;
        this.f = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.d;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return this.g.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
