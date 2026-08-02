package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qh3 implements uah {
    public final int a;
    public final int b;

    public qh3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.uah
    public final pea a(long j, ema emaVar, kx4 kx4Var) {
        float f;
        emaVar.getClass();
        kx4Var.getClass();
        b20 a = e20.a();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float H0 = kx4Var.H0(28.0f);
        float H02 = kx4Var.H0(8.0f);
        float f2 = intBitsToFloat / this.b;
        ema emaVar2 = ema.a;
        int i = this.a;
        if (emaVar == emaVar2) {
            f = (f2 / 2.0f) + (i * f2);
        } else {
            f = intBitsToFloat - ((f2 / 2.0f) + (i * f2));
        }
        a.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float sqrt = (float) Math.sqrt((H0 * H0) - (H02 * H02));
        a.f(f - sqrt, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float f3 = f - H0;
        float f4 = H02 - H0;
        float f5 = f + H0;
        float f6 = H0 + H02;
        double d = -H02;
        double d2 = sqrt;
        float degrees = (float) Math.toDegrees(Math.atan2(d, -d2));
        float degrees2 = ((float) Math.toDegrees(Math.atan2(d, d2))) - degrees;
        if (degrees2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            degrees2 += 360.0f;
        }
        RectF rectF = a.b;
        if (rectF == null) {
            rectF = new RectF();
            a.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = a.a;
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.arcTo(rectF2, degrees, degrees2, false);
        a.f(intBitsToFloat, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a.f(intBitsToFloat, intBitsToFloat2);
        a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat2);
        a.d();
        return new cxd(a);
    }
}
