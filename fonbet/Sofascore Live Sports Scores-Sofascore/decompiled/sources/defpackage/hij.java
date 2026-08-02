package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hij implements i72 {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public jg g = jg.f;

    public final long a(int i, int i2) {
        gg a = this.g.a(i);
        return a.b != -1 ? a.f[i2] : C.TIME_UNSET;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(long j) {
        gg a;
        int i;
        jg jgVar = this.g;
        long j2 = this.d;
        int i2 = jgVar.a;
        if (j != Long.MIN_VALUE && (j2 == C.TIME_UNSET || j < j2)) {
            int i3 = jgVar.d;
            while (i3 < i2 && ((jgVar.a(i3).a != Long.MIN_VALUE && jgVar.a(i3).a <= j) || ((i = (a = jgVar.a(i3)).b) != -1 && a.a(-1) >= i))) {
                i3++;
            }
        }
        return -1;
    }

    public final int c(long j) {
        int i;
        jg jgVar = this.g;
        long j2 = this.d;
        int i2 = jgVar.a - 1;
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            long j3 = jgVar.a(i2).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i2--;
            } else {
                if (j2 != C.TIME_UNSET && j >= j2) {
                    break;
                }
                i2--;
            }
        }
        if (i2 >= 0) {
            gg a = jgVar.a(i2);
            int i3 = a.b;
            if (i3 != -1) {
                while (i < i3) {
                    int i4 = a.e[i];
                    i = (i4 == 0 || i4 == 1) ? 0 : i + 1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        return this.g.a(i).a;
    }

    public final int e(int i, int i2) {
        gg a = this.g.a(i);
        if (a.b != -1) {
            return a.e[i2];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hij.class.equals(obj.getClass())) {
            hij hijVar = (hij) obj;
            if (lik.a(this.a, hijVar.a) && lik.a(this.b, hijVar.b) && this.c == hijVar.c && this.d == hijVar.d && this.e == hijVar.e && this.f == hijVar.f && lik.a(this.g, hijVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean g(int i) {
        return this.g.a(i).h;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, jg jgVar, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = jgVar;
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
