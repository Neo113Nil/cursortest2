package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.ironsource.mediationsdk.metadata.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class z9l extends pea {
    public final WindowInsetsController g;
    public final bka h;
    public final Window i;

    public z9l(Window window, bka bkaVar) {
        this(window.getInsetsController(), bkaVar);
        this.i = window;
    }

    @Override // defpackage.pea
    public void B(boolean z) {
        Window window = this.i;
        if (window != null) {
            if (!z) {
                K(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.g;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.pea
    public void C(boolean z) {
        Window window = this.i;
        if (window != null) {
            if (!z) {
                K(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.g;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.pea
    public void D() {
        Window window = this.i;
        if (window == null) {
            this.g.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        K(a.o);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    @Override // defpackage.pea
    public final void E(int i) {
        if ((i & 8) != 0) {
            ((yia) this.h.b).j();
        }
        this.g.show(i & (-9));
    }

    public final void K(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.pea
    public final void x(int i) {
        if ((i & 8) != 0) {
            ((yia) this.h.b).g();
        }
        this.g.hide(i & (-9));
    }

    @Override // defpackage.pea
    public boolean y() {
        Window window = this.i;
        if (window == null) {
            this.g.setSystemBarsAppearance(0, 0);
            if ((this.g.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    public z9l(WindowInsetsController windowInsetsController, bka bkaVar) {
        this.g = windowInsetsController;
        this.h = bkaVar;
    }
}
