package defpackage;

import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lb5 {
    public final float[] a;
    public final float[] b;
    public final Matrix c;

    public lb5(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        float[] fArr4 = new float[2];
        this.b = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.c = new Matrix();
    }

    public final void a(float f) {
        float[] fArr = this.b;
        float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.a;
        double d = f;
        double d2 = atan2;
        fArr2[0] = (float) ((Math.cos(d2) * d) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d2) * d) + fArr2[1]);
    }

    public final void b() {
        Arrays.fill(this.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        float[] fArr = this.b;
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fArr[0] = 1.0f;
        this.c.reset();
    }

    public final void c(float f) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.a);
        matrix.mapPoints(this.b);
    }

    public final void d(float f) {
        float[] fArr = this.a;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f;
        float[] fArr2 = this.b;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f;
    }

    public final void e(float f) {
        float[] fArr = this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public lb5() {
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new Matrix();
    }
}
