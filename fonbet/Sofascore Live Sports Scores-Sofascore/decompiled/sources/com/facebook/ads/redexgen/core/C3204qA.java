package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.qA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3204qA implements AnonymousClass24 {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"DHM3ogSyPiOeoDv5bW0AxEOdKkHHyzoj", "DikGrT", "5TP2r3oYS7ZAxQ2Lbh6O1Hwgb27IVuVZ", "BcOsGW4wr7kIZtXNBjWS4kH8Hq7r3t1j", "xCBSo", "o3SRWC", "etImtR6pfOeyK0p12rnN", "VXmJTa"};
    public static final C3204qA A07 = new AnonymousClass30().A05();
    public static final AnonymousClass23<C3204qA> A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qB
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C3204qA.A00(bundle);
        }
    };

    @Deprecated
    public C3204qA(long j, long j2, long j3, float f, float f2) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = f;
        this.A00 = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3204qA(AnonymousClass30 anonymousClass30) {
        this(r1, r3, r5, r7, r8);
        long j;
        long j2;
        long j3;
        float f;
        float f2;
        j = anonymousClass30.A04;
        j2 = anonymousClass30.A03;
        j3 = anonymousClass30.A02;
        f = anonymousClass30.A01;
        f2 = anonymousClass30.A00;
    }

    public static /* synthetic */ C3204qA A00(Bundle bundle) {
        return new C3204qA(bundle.getLong(A01(0), C.TIME_UNSET), bundle.getLong(A01(1), C.TIME_UNSET), bundle.getLong(A01(2), C.TIME_UNSET), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3204qA)) {
            return false;
        }
        C3204qA c3204qA = (C3204qA) obj;
        if (this.A04 == c3204qA.A04 && this.A03 == c3204qA.A03) {
            long j = this.A02;
            if (A05[3].charAt(15) == 'f') {
                throw new RuntimeException();
            }
            A05[3] = "Dnbo0S1X4SiwSLqrl4n96G4h1rg7k6Qp";
            if (j == c3204qA.A02) {
                float f = this.A01;
                float f2 = c3204qA.A01;
                String[] strArr = A05;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "apznZec0lqKPAkNyEzYuPUZE7fb8LaPc";
                strArr2[6] = "99vPzfkBdBLW0Tl0nQsz";
                if (f == f2 && this.A00 == c3204qA.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        return ((((i + result) * 31) + (this.A01 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(this.A01) : 0)) * 31) + (this.A00 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(this.A00) : 0);
    }
}
