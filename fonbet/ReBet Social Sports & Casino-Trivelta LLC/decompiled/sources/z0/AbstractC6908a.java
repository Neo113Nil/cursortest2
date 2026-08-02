package z0;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6908a {

    /* renamed from: z0.a$a, reason: collision with other inner class name */
    public static class C0977a {
        public static Interpolator a(float f10, float f11, float f12, float f13) {
            return new PathInterpolator(f10, f11, f12, f13);
        }
    }

    public static Interpolator a(float f10, float f11, float f12, float f13) {
        return C0977a.a(f10, f11, f12, f13);
    }
}
