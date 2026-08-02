package defpackage;

import com.inmobi.media.C3881xa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3881xa b;

    public /* synthetic */ p0n(C3881xa c3881xa, int i) {
        this.a = i;
        this.b = c3881xa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C3881xa c3881xa = this.b;
        switch (i) {
            case 0:
                C3881xa.b(c3881xa);
                break;
            case 1:
                C3881xa.c(c3881xa);
                break;
            default:
                C3881xa.a(c3881xa);
                break;
        }
    }
}
