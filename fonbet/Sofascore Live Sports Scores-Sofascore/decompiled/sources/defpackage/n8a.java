package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n8a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8a b;

    public /* synthetic */ n8a(t8a t8aVar, int i) {
        this.a = i;
        this.b = t8aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8a t8aVar = this.b;
                t8aVar.p = null;
                t8aVar.i.D(2, "CONNECTING after backoff");
                t8aVar.e(rk3.a);
                t8aVar.h();
                break;
            case 1:
                if (this.b.w.a == rk3.d) {
                    this.b.i.D(2, "CONNECTING as requested");
                    this.b.e(rk3.a);
                    this.b.h();
                    break;
                }
                break;
            default:
                t8a t8aVar2 = this.b;
                t8aVar2.i.D(2, "Terminated");
                qrb qrbVar = ((prb) t8aVar2.d.c).p;
                qrbVar.A.remove(t8aVar2);
                qrbVar.i();
                break;
        }
    }
}
