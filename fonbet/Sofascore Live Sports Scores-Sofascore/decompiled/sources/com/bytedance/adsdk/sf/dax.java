package com.bytedance.adsdk.sf;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
class dax implements Interpolator {
    private final float[] pcc;
    private final float[] sf;

    public dax(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i2 = i + 1;
        this.pcc = new float[i2];
        this.sf = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((i3 * length) / i, fArr, null);
            this.pcc[i3] = fArr[0];
            this.sf[i3] = fArr[1];
        }
    }

    private static Path pcc(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        float[] fArr;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.pcc.length - 1;
        int i = 0;
        while (true) {
            int i2 = length - i;
            fArr = this.pcc;
            if (i2 <= 1) {
                break;
            }
            int i3 = (i + length) / 2;
            if (f < fArr[i3]) {
                length = i3;
            } else {
                i = i3;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        float[] fArr2 = this.sf;
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return fArr2[i];
        }
        float f5 = fArr2[i];
        return me4.b(fArr2[length], f5, (f - f3) / f4, f5);
    }

    public dax(float f, float f2, float f3, float f4) {
        this(pcc(f, f2, f3, f4));
    }
}
