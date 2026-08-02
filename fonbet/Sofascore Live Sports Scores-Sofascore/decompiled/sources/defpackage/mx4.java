package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mx4 implements lx4, mal {
    public static final mx4 a = new mx4();
    public static final mx4 b = new mx4();

    @Override // defpackage.lx4
    public float a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // defpackage.mal
    public ial g(Context context, lx4 lx4Var) {
        WindowManager windowManager = context.isUiContext() ? (WindowManager) context.getSystemService(WindowManager.class) : (WindowManager) context.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new ial(windowManager.getCurrentWindowMetrics().getDensity(), bounds);
    }

    @Override // defpackage.mal
    public ial k(Activity activity, lx4 lx4Var) {
        u02.h7.getClass();
        return new ial(new t02(f8h.q().f(activity)), lx4Var.a(activity));
    }
}
