package defpackage;

import com.moloco.sdk.acm.services.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jhh extends Thread {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jhh(Object obj, int i) {
        super("ExoPlayer:SimpleDecoder");
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e) {
                        yhk.q(e);
                        return;
                    }
                } while (((qhh) obj).d());
            case 1:
                do {
                    try {
                    } catch (InterruptedException e2) {
                        yhk.q(e2);
                        return;
                    }
                } while (((khh) obj).g());
            default:
                ((d) obj).invoke();
                break;
        }
    }

    public jhh(d dVar) {
        this.a = 2;
        this.b = dVar;
    }
}
