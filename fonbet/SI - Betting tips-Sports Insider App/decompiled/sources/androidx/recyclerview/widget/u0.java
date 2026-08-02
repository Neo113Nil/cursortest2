package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        float f10 = f6 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
