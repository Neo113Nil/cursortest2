package androidx.core.view;

import android.app.job.JobParameters;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static void c(com.logrocket.core.graphics.n nVar, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        int style = typeface.getStyle();
        nVar.e(com.logrocket.core.graphics.c.typefaceStyle, Integer.valueOf(style != 1 ? style != 2 ? style != 3 ? yg.a.a(2) : yg.a.a(5) : yg.a.a(4) : yg.a.a(3)));
        if (Build.VERSION.SDK_INT >= 28) {
            nVar.e(com.logrocket.core.graphics.c.weight, Integer.valueOf(typeface.getWeight()));
        }
        nVar.e(com.logrocket.core.graphics.c.defaultTypeface, Integer.valueOf(typeface == Typeface.DEFAULT ? r4.k.f(2) : typeface == Typeface.DEFAULT_BOLD ? r4.k.f(3) : typeface == Typeface.MONOSPACE ? r4.k.f(4) : typeface == Typeface.SANS_SERIF ? r4.k.f(5) : typeface == Typeface.SERIF ? r4.k.f(6) : r4.k.f(1)));
    }

    public static String[] d(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long e(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void f(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static int g(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String h(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int m(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params n(androidx.appcompat.widget.n1 n1Var) {
        return n1Var.getTextMetricsParams();
    }

    public static int o(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri p(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void q(TextView textView, int i5) {
        textView.setFirstBaselineToTopHeight(i5);
    }

    public static boolean r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
