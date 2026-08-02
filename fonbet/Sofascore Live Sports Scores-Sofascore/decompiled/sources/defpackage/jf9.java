package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jf9 implements uah {
    public static final jf9 b = new jf9(0);
    public static final jf9 c = new jf9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jf9(int i) {
        this.a = i;
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        switch (this.a) {
            case 0:
                float e0 = kx4Var.e0(30.0f);
                return new dxd(new oqf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -e0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + e0));
            case 1:
                float e02 = kx4Var.e0(30.0f);
                return new dxd(new oqf(-e02, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (j >> 32)) + e02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new dxd(jca.r(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
