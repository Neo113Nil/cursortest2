package defpackage;

import com.ironsource.C4424z2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4424z2 b;

    public /* synthetic */ h1n(C4424z2 c4424z2, int i) {
        this.a = i;
        this.b = c4424z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4424z2 c4424z2 = this.b;
        switch (i) {
            case 0:
                C4424z2.e(c4424z2);
                break;
            case 1:
                C4424z2.a(c4424z2);
                break;
            case 2:
                C4424z2.c(c4424z2);
                break;
            case 3:
                C4424z2.d(c4424z2);
                break;
            default:
                C4424z2.b(c4424z2);
                break;
        }
    }
}
