package defpackage;

import com.ironsource.C4432za;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4432za b;

    public /* synthetic */ q1n(C4432za c4432za, int i) {
        this.a = i;
        this.b = c4432za;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4432za c4432za = this.b;
        switch (i) {
            case 0:
                C4432za.d(c4432za);
                break;
            case 1:
                C4432za.c(c4432za);
                break;
            case 2:
                C4432za.a(c4432za);
                break;
            default:
                C4432za.b(c4432za);
                break;
        }
    }
}
