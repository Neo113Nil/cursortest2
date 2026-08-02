package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class rcf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cdf b;

    public /* synthetic */ rcf(cdf cdfVar, int i) {
        this.a = i;
        this.b = cdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cdf cdfVar = this.b;
        switch (i) {
            case 0:
                cdfVar.m();
                break;
            case 1:
                if (!cdfVar.K) {
                    t6c t6cVar = cdfVar.p;
                    t6cVar.getClass();
                    t6cVar.b(cdfVar);
                    break;
                }
                break;
            default:
                cdfVar.E = true;
                break;
        }
    }
}
