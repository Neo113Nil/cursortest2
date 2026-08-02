package defpackage;

import com.google.firebase.perf.util.Timer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class qec implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rec b;
    public final /* synthetic */ Timer c;

    public /* synthetic */ qec(rec recVar, Timer timer, int i) {
        this.a = i;
        this.b = recVar;
        this.c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Timer timer = this.c;
        rec recVar = this.b;
        switch (i) {
            case 0:
                p10 b = recVar.b(timer);
                if (b != null) {
                    recVar.b.add(b);
                    break;
                }
                break;
            default:
                p10 b2 = recVar.b(timer);
                if (b2 != null) {
                    recVar.b.add(b2);
                    break;
                }
                break;
        }
    }
}
