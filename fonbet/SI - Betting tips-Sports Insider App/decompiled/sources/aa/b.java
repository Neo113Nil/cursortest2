package aa;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import com.sports.insider.R;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f88a;

    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final Bitmap b(MediaMetadataRetriever mediaMetadataRetriever, int i5, Bitmap.Config config) {
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        Unit unit = Unit.f19194a;
        return mediaMetadataRetriever.getFrameAtIndex(i5, bitmapParams);
    }

    public static final Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j, int i5, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getFrameAtTime(j, i5);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getFrameAtTime(j, i5, bitmapParams);
    }

    public static final Bitmap d(MediaMetadataRetriever mediaMetadataRetriever, long j, int i5, int i10, int i11, Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 30) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i5, i10, i11);
        }
        MediaMetadataRetriever.BitmapParams bitmapParams = new MediaMetadataRetriever.BitmapParams();
        bitmapParams.setPreferredConfig(config);
        return mediaMetadataRetriever.getScaledFrameAtTime(j, i5, i10, i11, bitmapParams);
    }

    public static a e() {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = f88a.getCurrentWindowMetrics();
            return new a(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        f88a.getDefaultDisplay().getRealMetrics(displayMetrics);
        return new a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static CharSequence f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String g(h.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (input instanceof h.e) {
            return "image/*";
        }
        if (input instanceof h.d) {
            return null;
        }
        throw new gf.m();
    }

    public static boolean h() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            return true;
        }
        return i5 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static Integer i(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        char[] charArray = upperCase.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        if (charArray.length != 3) {
            return null;
        }
        int i5 = 0;
        if (charArray[0] != 'P') {
            return null;
        }
        char c2 = charArray[2];
        if (c2 == 'D') {
            i5 = 1;
        } else if (c2 == 'M') {
            i5 = 30;
        } else if (c2 == 'W') {
            i5 = 7;
        } else if (c2 == 'Y') {
            i5 = 365;
        }
        return Integer.valueOf(kotlin.text.a.b(charArray[1]) * i5);
    }

    public static Pair j(String str) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        char[] charArray = upperCase.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        if (charArray.length == 3 && charArray[0] == 'P') {
            return new Pair(Integer.valueOf(kotlin.text.a.b(charArray[1])), Character.valueOf(charArray[2]));
        }
        return null;
    }

    public static String k(String str, Resources resources) {
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        char[] charArray = upperCase.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        if (charArray.length != 3 || charArray[0] != 'P') {
            return null;
        }
        if (resources != null) {
            int b10 = kotlin.text.a.b(charArray[1]);
            char c2 = charArray[2];
            if (c2 == 'D') {
                return resources.getQuantityString(R.plurals.dayQuantity, b10, Integer.valueOf(b10));
            }
            if (c2 == 'M') {
                return resources.getQuantityString(R.plurals.monthQuantity, b10, Integer.valueOf(b10));
            }
            if (c2 == 'W') {
                return resources.getQuantityString(R.plurals.weekQuantity, b10, Integer.valueOf(b10));
            }
            if (c2 != 'Y') {
                return null;
            }
            return resources.getQuantityString(R.plurals.yearQuantity, b10, Integer.valueOf(b10));
        }
        char c8 = charArray[2];
        if (c8 == 'D') {
            return charArray[1] + " day";
        }
        if (c8 == 'M') {
            return charArray[1] + " month";
        }
        if (c8 == 'W') {
            return charArray[1] + " week";
        }
        if (c8 != 'Y') {
            return null;
        }
        return charArray[1] + " year";
    }

    public static void l(Window window, boolean z5) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z5);
    }

    public static void m(Window window, boolean z5) {
        window.setDecorFitsSystemWindows(z5);
    }

    public static void n(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static synchronized void o(WindowManager windowManager) {
        synchronized (b.class) {
            f88a = windowManager;
        }
    }

    public static int p(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            return insets.top - insets.bottom;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService2 = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService2).getDefaultDisplay().getMetrics(displayMetrics);
        int i5 = displayMetrics.densityDpi;
        return (int) ((i5 != 120 ? i5 != 240 ? 25 : 38 : 23) * context.getResources().getDisplayMetrics().density);
    }
}
