package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class t5c implements i72 {
    public static final t5c f = new t5c(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    public t5c(long j, long j2, long j3, float f2, float f3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f2;
        this.e = f3;
    }

    public final s5c a() {
        s5c s5cVar = new s5c();
        s5cVar.a = this.a;
        s5cVar.b = this.b;
        s5cVar.c = this.c;
        s5cVar.d = this.d;
        s5cVar.e = this.e;
        return s5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5c)) {
            return false;
        }
        t5c t5cVar = (t5c) obj;
        return this.a == t5cVar.a && this.b == t5cVar.b && this.c == t5cVar.c && this.d == t5cVar.d && this.e == t5cVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f2 = this.d;
        int floatToIntBits = (i2 + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return floatToIntBits + (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f3) : 0);
    }
}
