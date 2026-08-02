package Zb;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14754a;

    public b(Context context) {
        this.f14754a = context;
    }

    public Yb.a a() {
        if (this.f14754a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return Yb.a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f14754a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return Yb.a.TV;
        }
        Yb.a c10 = c();
        return (c10 == null || c10 == Yb.a.UNKNOWN) ? b() : c10;
    }

    public final Yb.a b() {
        WindowManager windowManager = (WindowManager) this.f14754a.getSystemService("window");
        if (windowManager == null) {
            return Yb.a.UNKNOWN;
        }
        windowManager.getDefaultDisplay().getRealMetrics(new DisplayMetrics());
        double sqrt = Math.sqrt(Math.pow(r1.widthPixels / r1.xdpi, 2.0d) + Math.pow(r1.heightPixels / r1.ydpi, 2.0d));
        return (sqrt < 3.0d || sqrt > 6.9d) ? (sqrt <= 6.9d || sqrt > 18.0d) ? Yb.a.UNKNOWN : Yb.a.TABLET : Yb.a.HANDSET;
    }

    public final Yb.a c() {
        int i10 = this.f14754a.getResources().getConfiguration().smallestScreenWidthDp;
        return i10 == 0 ? Yb.a.UNKNOWN : i10 >= 600 ? Yb.a.TABLET : Yb.a.HANDSET;
    }

    public boolean d() {
        return a() == Yb.a.TABLET;
    }
}
