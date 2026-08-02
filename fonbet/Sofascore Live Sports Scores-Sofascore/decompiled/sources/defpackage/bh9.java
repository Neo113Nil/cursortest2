package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bh9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nia b;

    public bh9(nia niaVar, long j) {
        this.b = niaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        nia niaVar = this.b;
        switch (i) {
            case 0:
                niaVar.getClass();
                break;
            default:
                ((ood) niaVar.a.a).p(xei.m.h("Keepalive failed. The connection is likely gone"));
                break;
        }
    }

    public bh9(nia niaVar, Throwable th) {
        this.b = niaVar;
    }
}
