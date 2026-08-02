package defpackage;

import com.inmobi.media.C3381e2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3381e2 b;

    public /* synthetic */ n6m(C3381e2 c3381e2, int i) {
        this.a = i;
        this.b = c3381e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C3381e2 c3381e2 = this.b;
        switch (i) {
            case 0:
                C3381e2.d(c3381e2);
                break;
            case 1:
                C3381e2.b(c3381e2);
                break;
            case 2:
                C3381e2.a(c3381e2);
                break;
            case 3:
                C3381e2.c(c3381e2);
                break;
            default:
                C3381e2.f(c3381e2);
                break;
        }
    }
}
