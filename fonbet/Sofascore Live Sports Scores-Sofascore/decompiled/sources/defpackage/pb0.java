package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pb0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, ub0 ub0Var) {
        Objects.requireNonNull(ub0Var);
        h90 h90Var = new h90(ub0Var, 1);
        a70.h(obj).registerOnBackInvokedCallback(1000000, h90Var);
        return h90Var;
    }

    public static void c(Object obj, Object obj2) {
        a70.h(obj).unregisterOnBackInvokedCallback(a70.g(obj2));
    }
}
