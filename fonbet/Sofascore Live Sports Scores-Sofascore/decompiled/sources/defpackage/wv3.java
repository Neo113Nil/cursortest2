package defpackage;

import com.google.firebase.perf.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv3 b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ wv3(xv3 xv3Var, Timer timer, int i) {
        this.a = i;
        this.b = xv3Var;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Timer timer = this.c;
        xv3 xv3Var = this.b;
        switch (i) {
            case 0:
                aw3 b = xv3Var.b(timer);
                if (b != null) {
                    xv3Var.a.add(b);
                    break;
                }
                break;
            default:
                aw3 b2 = xv3Var.b(timer);
                if (b2 != null) {
                    xv3Var.a.add(b2);
                    break;
                }
                break;
        }
    }
}
