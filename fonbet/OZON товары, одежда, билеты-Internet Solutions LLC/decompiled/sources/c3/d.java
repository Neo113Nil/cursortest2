package c3;

import Hj.C3143a;
import android.view.animation.Interpolator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f56444a;

    /* renamed from: b, reason: collision with root package name */
    private final float f56445b;

    protected d(float[] fArr) {
        this.f56444a = fArr;
        this.f56445b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f56444a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f11 = this.f56445b;
        float f12 = (f7 - (min * f11)) / f11;
        float f13 = fArr[min];
        return C3143a.d(fArr[min + 1], f13, f12, f13);
    }
}
