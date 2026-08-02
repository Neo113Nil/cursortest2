package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f2736a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f2737b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2736a = new v0(3);
        } else {
            f2736a = new u0(3);
        }
        f2737b = new b(Float.class, "translationAlpha", 5);
        new b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i5, int i10, int i11, int i12) {
        f2736a.H(view, i5, i10, i11, i12);
    }

    public static void b(View view, int i5) {
        f2736a.A(view, i5);
    }
}
