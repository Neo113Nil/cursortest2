package L2;

import android.os.Build;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6771a = true;

    public static class a {
        public static void a(ViewGroup viewGroup, boolean z10) {
            viewGroup.suppressLayout(z10);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (f6771a) {
            try {
                a.a(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f6771a = false;
            }
        }
    }

    public static void b(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(viewGroup, z10);
        } else {
            a(viewGroup, z10);
        }
    }
}
