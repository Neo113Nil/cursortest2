package xa;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.AbstractC2074d;
import androidx.core.view.AbstractC2109r0;
import sa.AbstractC6344a;

/* loaded from: classes3.dex */
public abstract class c {
    public static void a(Window window, boolean z10, Integer num, Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int b10 = AbstractC6344a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z11) {
                num = Integer.valueOf(b10);
            }
            if (z12) {
                num2 = Integer.valueOf(b10);
            }
        }
        AbstractC2109r0.b(window, !z10);
        int c10 = c(window.getContext(), z10);
        int b11 = b(window.getContext(), z10);
        window.setStatusBarColor(c10);
        window.setNavigationBarColor(b11);
        f(window, d(c10, AbstractC6344a.h(num.intValue())));
        e(window, d(b11, AbstractC6344a.h(num2.intValue())));
    }

    public static int b(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return AbstractC2074d.k(AbstractC6344a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z10) {
            return 0;
        }
        return AbstractC6344a.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return AbstractC6344a.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i10, boolean z10) {
        if (AbstractC6344a.h(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void e(Window window, boolean z10) {
        AbstractC2109r0.a(window, window.getDecorView()).d(z10);
    }

    public static void f(Window window, boolean z10) {
        AbstractC2109r0.a(window, window.getDecorView()).e(z10);
    }
}
