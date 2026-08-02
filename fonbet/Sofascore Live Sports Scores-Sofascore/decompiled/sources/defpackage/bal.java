package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bal {
    public final pea a;

    public bal(Window window, View view) {
        bka bkaVar = new bka(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new aal(window, bkaVar);
        } else if (i >= 30) {
            this.a = new z9l(window, bkaVar);
        } else {
            this.a = new y9l(window, bkaVar);
        }
    }

    public final void a(int i) {
        this.a.x(i);
    }

    public final void b(boolean z) {
        this.a.C(z);
    }

    public final void c() {
        this.a.D();
    }

    public bal(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new aal(windowInsetsController, new bka(windowInsetsController));
        } else {
            this.a = new z9l(windowInsetsController, new bka(windowInsetsController));
        }
    }
}
