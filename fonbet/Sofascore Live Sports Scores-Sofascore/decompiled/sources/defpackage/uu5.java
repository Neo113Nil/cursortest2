package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uu5 implements e9d {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    public uu5(boolean z, List list, int i, float f, float f2) {
        this.a = z;
        this.b = list;
        this.c = i;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.e9d
    public final long P(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        boolean z = this.a;
        if (z) {
            intBitsToFloat = -intBitsToFloat;
        }
        mzg mzgVar = (mzg) this.b.get(this.c);
        float h = mzgVar.a.h();
        if (intBitsToFloat >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float f = this.d;
        if (h <= f) {
            return 0L;
        }
        float f2 = f - h;
        if (intBitsToFloat < f2) {
            intBitsToFloat = f2;
        }
        float f3 = h + intBitsToFloat;
        if (f3 <= h) {
            h = f3;
        }
        mzgVar.a.i(h);
        if (z) {
            intBitsToFloat = -intBitsToFloat;
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    @Override // defpackage.e9d
    public final long b0(int i, long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        boolean z = this.a;
        if (z) {
            intBitsToFloat = -intBitsToFloat;
        }
        mzg mzgVar = (mzg) this.b.get(this.c);
        float h = mzgVar.a.h();
        if (intBitsToFloat <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        float f = this.e;
        if (h >= f) {
            return 0L;
        }
        float f2 = f - h;
        if (intBitsToFloat > f2) {
            intBitsToFloat = f2;
        }
        float f3 = h + intBitsToFloat;
        if (f3 >= h) {
            h = f3;
        }
        mzgVar.a.i(h);
        if (z) {
            intBitsToFloat = -intBitsToFloat;
        }
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }
}
