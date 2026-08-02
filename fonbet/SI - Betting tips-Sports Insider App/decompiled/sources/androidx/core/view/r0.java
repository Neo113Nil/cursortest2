package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r0 {
    public static k2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        k2 h10 = k2.h(null, rootWindowInsets);
        h2 h2Var = h10.f1349a;
        h2Var.q(h10);
        h2Var.d(view.getRootView());
        return h10;
    }

    public static void b(View view, int i5, int i10) {
        view.setScrollIndicators(i5, i10);
    }
}
