package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qv4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4a b;

    public /* synthetic */ qv4(d4a d4aVar, int i) {
        this.a = i;
        this.b = d4aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        d4a d4aVar = this.b;
        switch (i) {
            case 0:
                d4aVar.x(true);
                break;
            case 1:
                d4aVar.x(false);
                break;
            default:
                qrb qrbVar = (qrb) d4aVar.b;
                z1a.D("Channel must have been shut down", qrbVar.G.get());
                qrbVar.H = true;
                qrbVar.k(false);
                qrbVar.i();
                break;
        }
    }
}
