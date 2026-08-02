package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f1050a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f6, float f10, boolean z5) {
        if (!z5) {
            return f6;
        }
        return (float) (((1.0d - f1050a) * f10) + f6);
    }

    public static float b(float f6, float f10, boolean z5) {
        if (!z5) {
            return f6 * 1.5f;
        }
        return (float) (((1.0d - f1050a) * f10) + (f6 * 1.5f));
    }
}
