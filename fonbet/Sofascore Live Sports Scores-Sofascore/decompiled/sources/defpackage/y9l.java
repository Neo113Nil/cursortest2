package defpackage;

import android.view.View;
import android.view.Window;
import com.ironsource.mediationsdk.metadata.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y9l extends pea {
    public final Window g;
    public final bka h;

    public y9l(Window window, bka bkaVar) {
        this.g = window;
        this.h = bkaVar;
    }

    @Override // defpackage.pea
    public final void B(boolean z) {
        if (!z) {
            L(16);
            return;
        }
        Window window = this.g;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        K(16);
    }

    @Override // defpackage.pea
    public final void C(boolean z) {
        if (!z) {
            L(8192);
            return;
        }
        Window window = this.g;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        K(8192);
    }

    @Override // defpackage.pea
    public final void D() {
        this.g.getDecorView().setTag(356039078, 2);
        L(a.o);
        K(4096);
    }

    @Override // defpackage.pea
    public final void E(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    L(4);
                    this.g.clearFlags(1024);
                } else if (i2 == 2) {
                    L(2);
                } else if (i2 == 8) {
                    ((yia) this.h.b).j();
                }
            }
        }
    }

    public final void K(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void L(int i) {
        View decorView = this.g.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.pea
    public final void x(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    K(4);
                } else if (i2 == 2) {
                    K(2);
                } else if (i2 == 8) {
                    ((yia) this.h.b).g();
                }
            }
        }
    }

    @Override // defpackage.pea
    public final boolean y() {
        return (this.g.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
