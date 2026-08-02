package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f701b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static b0 f702c;

    /* renamed from: a, reason: collision with root package name */
    public a3 f703a;

    public static synchronized b0 a() {
        b0 b0Var;
        synchronized (b0.class) {
            try {
                if (f702c == null) {
                    d();
                }
                b0Var = f702c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b0Var;
    }

    public static synchronized PorterDuffColorFilter c(int i5, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (b0.class) {
            h10 = a3.h(i5, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (b0.class) {
            if (f702c == null) {
                b0 b0Var = new b0();
                f702c = b0Var;
                b0Var.f703a = a3.d();
                f702c.f703a.m(new a0(0));
            }
        }
    }

    public static void e(Drawable drawable, a4 a4Var, int[] iArr) {
        PorterDuff.Mode mode = a3.f686h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z5 = a4Var.f696b;
        if (z5 || a4Var.f695a) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = z5 ? (ColorStateList) a4Var.f697c : null;
            PorterDuff.Mode mode2 = a4Var.f695a ? (PorterDuff.Mode) a4Var.f698d : a3.f686h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilter = a3.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i5) {
        return this.f703a.f(context, i5);
    }
}
