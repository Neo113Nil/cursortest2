package defpackage;

import com.ironsource.N2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ N2 b;

    public /* synthetic */ n2d(N2 n2, int i) {
        this.a = i;
        this.b = n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        N2 n2 = this.b;
        switch (i) {
            case 0:
                N2.d(n2);
                break;
            case 1:
                N2.c(n2);
                break;
            default:
                N2.b(n2);
                break;
        }
    }
}
