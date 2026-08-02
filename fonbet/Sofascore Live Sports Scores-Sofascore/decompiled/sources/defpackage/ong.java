package defpackage;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ong {
    public final float a;
    public final float b;
    public float c;
    public float d;
    public boolean e = false;

    public ong(float f, float f2, float f3, float f4) {
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a = f;
        this.b = f2;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            this.c = (float) (f3 / sqrt);
            this.d = (float) (f4 / sqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.a;
        float f4 = f2 - this.b;
        double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (sqrt != 0.0d) {
            f3 = (float) (f3 / sqrt);
            f4 = (float) (f4 / sqrt);
        }
        float f5 = this.c;
        if (f3 != (-f5) || f4 != (-this.d)) {
            this.c = f5 + f3;
            this.d += f4;
        } else {
            this.e = true;
            this.c = -f4;
            this.d = f3;
        }
    }

    public final void b(ong ongVar) {
        float f = ongVar.c;
        float f2 = this.c;
        if (f == (-f2)) {
            float f3 = ongVar.d;
            if (f3 == (-this.d)) {
                this.e = true;
                this.c = -f3;
                this.d = ongVar.c;
                return;
            }
        }
        this.c = f2 + f;
        this.d += ongVar.d;
    }

    public final String toString() {
        return "(" + this.a + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + this.b + " " + this.c + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + this.d + ")";
    }
}
