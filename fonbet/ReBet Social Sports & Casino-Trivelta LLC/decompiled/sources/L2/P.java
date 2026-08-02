package L2;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class P extends N {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f6781g = true;

    public static class a {
        public static void a(View view, int i10) {
            view.setTransitionVisibility(i10);
        }
    }

    @Override // L2.I
    public void f(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i10);
        } else if (f6781g) {
            try {
                a.a(view, i10);
            } catch (NoSuchMethodError unused) {
                f6781g = false;
            }
        }
    }
}
