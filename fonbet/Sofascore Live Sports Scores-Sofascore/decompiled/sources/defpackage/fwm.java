package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fwm implements Comparable, Runnable {
    public final int a;
    public final /* synthetic */ itm b;
    public final /* synthetic */ jwm c;

    public fwm(jwm jwmVar, int i, itm itmVar) {
        this.c = jwmVar;
        this.b = itmVar;
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((fwm) obj).a - this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.d(this.b, true);
    }
}
