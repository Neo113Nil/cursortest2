package defpackage;

import com.ironsource.C4378wa;
import com.ironsource.C4432za;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4432za b;
    public final /* synthetic */ C4378wa c;

    public /* synthetic */ s1n(C4432za c4432za, C4378wa c4378wa, int i) {
        this.a = i;
        this.b = c4432za;
        this.c = c4378wa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4378wa c4378wa = this.c;
        C4432za c4432za = this.b;
        switch (i) {
            case 0:
                C4432za.b(c4432za, c4378wa);
                break;
            default:
                C4432za.a(c4432za, c4378wa);
                break;
        }
    }
}
