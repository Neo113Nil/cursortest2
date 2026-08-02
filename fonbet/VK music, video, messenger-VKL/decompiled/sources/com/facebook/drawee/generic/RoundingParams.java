package com.facebook.drawee.generic;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.sex0;

/* loaded from: classes.dex */
public final class RoundingParams {
    public RoundingMethod a = RoundingMethod.BITMAP_ONLY;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public int f = 0;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public boolean h = false;
    public boolean i = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RoundingMethod {
        private static final /* synthetic */ RoundingMethod[] $VALUES;
        public static final RoundingMethod BITMAP_ONLY;
        public static final RoundingMethod OVERLAY_COLOR;

        static {
            RoundingMethod roundingMethod = new RoundingMethod("OVERLAY_COLOR", 0);
            OVERLAY_COLOR = roundingMethod;
            RoundingMethod roundingMethod2 = new RoundingMethod("BITMAP_ONLY", 1);
            BITMAP_ONLY = roundingMethod2;
            $VALUES = new RoundingMethod[]{roundingMethod, roundingMethod2};
        }

        public RoundingMethod() {
            throw null;
        }

        public static RoundingMethod valueOf(String str) {
            return (RoundingMethod) Enum.valueOf(RoundingMethod.class, str);
        }

        public static RoundingMethod[] values() {
            return (RoundingMethod[]) $VALUES.clone();
        }
    }

    public static RoundingParams a() {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.b = true;
        return roundingParams;
    }

    public static RoundingParams b(float f) {
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.f(f);
        return roundingParams;
    }

    public final void c(float f, int i) {
        sex0.b("the border width cannot be < 0", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = f;
        this.f = i;
    }

    public final void d(float f) {
        sex0.b("the border width cannot be < 0", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.e = f;
    }

    public final void e(float f, float f2, float f3, float f4) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RoundingParams.class != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.b == roundingParams.b && this.d == roundingParams.d && Float.compare(roundingParams.e, this.e) == 0 && this.f == roundingParams.f && Float.compare(roundingParams.g, this.g) == 0 && this.a == roundingParams.a && this.h == roundingParams.h && this.i == roundingParams.i) {
            return Arrays.equals(this.c, roundingParams.c);
        }
        return false;
    }

    public final void f(float f) {
        if (this.c == null) {
            this.c = new float[8];
        }
        Arrays.fill(this.c, f);
    }

    public final void g(float f) {
        sex0.b("the padding cannot be < 0", f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = f;
    }

    public final int hashCode() {
        RoundingMethod roundingMethod = this.a;
        int hashCode = (((roundingMethod != null ? roundingMethod.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        int floatToIntBits = (((hashCode2 + (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return ((((floatToIntBits + (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f2) : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
