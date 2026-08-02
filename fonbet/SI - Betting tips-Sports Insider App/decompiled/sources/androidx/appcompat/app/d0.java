package androidx.appcompat.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, l0 l0Var) {
        Objects.requireNonNull(l0Var);
        c0 c0Var = new c0(0, l0Var);
        b0.g(obj).registerOnBackInvokedCallback(1000000, c0Var);
        return c0Var;
    }

    public static void c(Object obj, Object obj2) {
        b0.g(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
