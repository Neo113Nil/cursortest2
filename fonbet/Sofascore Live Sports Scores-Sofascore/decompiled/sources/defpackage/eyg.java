package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eyg implements e9d {
    public final /* synthetic */ float a;
    public final /* synthetic */ xnh b;

    public eyg(float f, xnh xnhVar) {
        this.a = f;
        this.b = xnhVar;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.b.h() > (-this.a)) {
            return a(intBitsToFloat);
        }
        return 0L;
    }

    public final long a(float f) {
        xnh xnhVar = this.b;
        xnhVar.i(llf.b(f + xnhVar.h(), -this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        return (Float.floatToRawIntBits(r4 - r1) & 4294967295L) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32);
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & j2));
        if (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        return a(intBitsToFloat);
    }
}
