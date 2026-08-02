package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ i51(k51 k51Var, int i) {
        this.a = i;
        this.b = k51Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        k51 k51Var = this.b;
        switch (i) {
            case 0:
                if (k51Var.d > 0) {
                    k51Var.e = SystemClock.uptimeMillis();
                }
                k51Var.setVisibility(0);
                break;
            default:
                ((hb5) k51Var.getCurrentDrawable()).d(false, false, true);
                if ((k51Var.getProgressDrawable() == null || !k51Var.getProgressDrawable().isVisible()) && (k51Var.getIndeterminateDrawable() == null || !k51Var.getIndeterminateDrawable().isVisible())) {
                    k51Var.setVisibility(4);
                }
                k51Var.e = -1L;
                break;
        }
    }
}
