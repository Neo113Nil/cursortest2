package defpackage;

import com.ironsource.C4111hb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class dhm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4111hb b;

    public /* synthetic */ dhm(C4111hb c4111hb, int i) {
        this.a = i;
        this.b = c4111hb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4111hb c4111hb = this.b;
        switch (i) {
            case 0:
                C4111hb.c(c4111hb);
                break;
            case 1:
                C4111hb.a(c4111hb);
                break;
            default:
                C4111hb.b(c4111hb);
                break;
        }
    }
}
