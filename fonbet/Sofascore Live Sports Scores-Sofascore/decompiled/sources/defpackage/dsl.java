package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dsl {
    public final WeakReference a;

    public dsl(@NotNull Activity activity, @NotNull BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        activity.getClass();
        blazeVideosPlayerStyle.getClass();
        this.a = new WeakReference(activity);
    }

    public static final x9l a(boolean z, bal balVar, Window window, View view, x9l x9lVar) {
        view.getClass();
        if (z) {
            balVar.a.E(519);
            bea.L(window, true);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
            }
        } else {
            balVar.a(519);
            bea.L(window, false);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
        }
        return bsk.l(view, x9lVar);
    }

    public final void b(boolean z) {
        Window window;
        Activity activity = (Activity) this.a.get();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        bal balVar = new bal(window, window.getDecorView());
        balVar.c();
        View decorView = window.getDecorView();
        lt4 lt4Var = new lt4(z, balVar, window);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(decorView, lt4Var);
    }
}
