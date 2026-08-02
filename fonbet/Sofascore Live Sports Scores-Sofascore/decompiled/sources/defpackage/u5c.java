package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u5c {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new u5c(new s5c());
        nik.N(0);
        nik.N(1);
        nik.N(2);
        nik.N(3);
        nik.N(4);
    }

    public u5c(s5c s5cVar) {
        long j = s5cVar.a;
        long j2 = s5cVar.b;
        long j3 = s5cVar.c;
        float f = s5cVar.d;
        float f2 = s5cVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
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
        if (!(obj instanceof u5c)) {
            return false;
        }
        u5c u5cVar = (u5c) obj;
        return this.a == u5cVar.a && this.b == u5cVar.b && this.c == u5cVar.c && this.d == u5cVar.d && this.e == u5cVar.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.d;
        int floatToIntBits = (i2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        return floatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0);
    }
}
