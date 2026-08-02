package t20;

import android.app.Application;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f98977a;

    /* renamed from: b, reason: collision with root package name */
    private final WindowManager f98978b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NAVIGATION_BAR;
        public static final a STATUS_BAR;

        @NotNull
        private final String resourceName;

        static {
            a aVar = new a("STATUS_BAR", 0, "status_bar_height");
            STATUS_BAR = aVar;
            a aVar2 = new a("NAVIGATION_BAR", 1, "navigation_bar_height");
            NAVIGATION_BAR = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.resourceName = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.resourceName;
        }
    }

    public j(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f98977a = context;
        Object systemService = context.getSystemService("window");
        this.f98978b = systemService instanceof WindowManager ? (WindowManager) systemService : null;
    }

    public final float a() {
        return this.f98977a.getResources().getDisplayMetrics().density;
    }

    public final int b() {
        return this.f98977a.getResources().getDisplayMetrics().densityDpi;
    }

    public final int c() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = this.f98978b;
        if (windowManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds.bottom - bounds.top;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int d() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int systemBars;
        Insets insetsIgnoringVisibility;
        int i11;
        int i12;
        int c11 = c();
        WindowManager windowManager = this.f98978b;
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemBars = WindowInsets.Type.systemBars();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemBars);
                i11 = insetsIgnoringVisibility.top;
                i12 = insetsIgnoringVisibility.bottom;
                r1 = i12 + i11;
            } else {
                a aVar = a.STATUS_BAR;
                Application application = this.f98977a;
                int identifier = application.getResources().getIdentifier(aVar.a(), "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? application.getResources().getDimensionPixelSize(identifier) : 0;
                int identifier2 = application.getResources().getIdentifier(a.NAVIGATION_BAR.a(), "dimen", "android");
                r1 = (identifier2 > 0 ? application.getResources().getDimensionPixelSize(identifier2) : 0) + dimensionPixelSize;
            }
        }
        return (int) ((c11 - r1) / a());
    }

    public final int e() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = this.f98978b;
        if (windowManager == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds.right - bounds.left;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
