package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ wk b;

    public /* synthetic */ tk(wk wkVar) {
        this.b = wkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wk wkVar = this.b;
        switch (i) {
            case 0:
                wkVar.n.getClass();
                if (!wkVar.t) {
                    Handler handler = wkVar.z;
                    handler.getClass();
                    handler.post(new tk(wkVar));
                    break;
                }
                break;
            default:
                wkVar.y();
                break;
        }
    }
}
