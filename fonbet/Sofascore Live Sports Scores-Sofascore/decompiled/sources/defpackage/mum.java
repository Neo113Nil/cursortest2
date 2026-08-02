package defpackage;

import com.vungle.ads.internal.presenter.r;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class mum implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ mum(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r rVar = this.b;
        switch (i) {
            case 0:
                r.d(rVar);
                break;
            case 1:
                r.c(rVar);
                break;
            default:
                r.e(rVar);
                break;
        }
    }
}
