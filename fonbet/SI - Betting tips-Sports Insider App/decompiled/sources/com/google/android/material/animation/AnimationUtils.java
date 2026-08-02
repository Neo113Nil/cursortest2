package com.google.android.material.animation;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import d9.e;
import q1.a;
import q1.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new b();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new a();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new a(a.f21919d);
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f6, float f10, float f11) {
        return e.w(f10, f6, f11, f6);
    }

    public static int lerp(int i5, int i10, float f6) {
        return Math.round(f6 * (i10 - i5)) + i5;
    }

    public static float lerp(float f6, float f10, float f11, float f12, float f13) {
        return f13 <= f11 ? f6 : f13 >= f12 ? f10 : lerp(f6, f10, (f13 - f11) / (f12 - f11));
    }
}
