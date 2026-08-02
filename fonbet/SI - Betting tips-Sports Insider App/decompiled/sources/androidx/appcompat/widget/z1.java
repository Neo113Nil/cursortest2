package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1033a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1034b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f1035c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 29 || i5 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1033a);
        } else {
            drawable.setState(f1034b);
        }
        drawable.setState(state);
    }

    public static Rect b(Drawable drawable) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a7 = y1.a(drawable);
            i5 = a7.left;
            i10 = a7.top;
            i11 = a7.right;
            i12 = a7.bottom;
            return new Rect(i5, i10, i11, i12);
        }
        Drawable d02 = ci.c.d0(drawable);
        if (i13 >= 29) {
            boolean z5 = x1.f998a;
        } else if (x1.f998a) {
            try {
                Object invoke = x1.f999b.invoke(d02, null);
                if (invoke != null) {
                    return new Rect(x1.f1000c.getInt(invoke), x1.f1001d.getInt(invoke), x1.f1002e.getInt(invoke), x1.f1003f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f1035c;
    }

    public static PorterDuff.Mode c(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
