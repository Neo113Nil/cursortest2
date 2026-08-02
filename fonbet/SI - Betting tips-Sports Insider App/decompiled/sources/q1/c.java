package q1;

import android.view.animation.Interpolator;
import d9.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f21921a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21922b;

    public c(float[] fArr) {
        this.f21921a = fArr;
        this.f21922b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f21921a;
        int min = Math.min((int) ((fArr.length - 1) * f6), fArr.length - 2);
        float f10 = this.f21922b;
        float d10 = e.d(min, f10, f6, f10);
        float f11 = fArr[min];
        return e.w(fArr[min + 1], f11, d10, f11);
    }
}
