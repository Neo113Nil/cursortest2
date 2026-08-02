package defpackage;

import com.ironsource.Vd;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ulk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Vd b;

    public /* synthetic */ ulk(Vd vd, int i) {
        this.a = i;
        this.b = vd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Vd vd = this.b;
        switch (i) {
            case 0:
                Vd.a(vd);
                break;
            case 1:
                Vd.c(vd);
                break;
            case 2:
                Vd.e(vd);
                break;
            case 3:
                Vd.b(vd);
                break;
            default:
                Vd.d(vd);
                break;
        }
    }
}
