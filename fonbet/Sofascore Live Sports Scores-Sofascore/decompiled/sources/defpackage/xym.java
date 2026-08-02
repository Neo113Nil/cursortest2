package defpackage;

import com.inmobi.media.C3829va;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class xym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3829va b;

    public /* synthetic */ xym(C3829va c3829va, int i) {
        this.a = i;
        this.b = c3829va;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C3829va c3829va = this.b;
        switch (i) {
            case 0:
                C3829va.a(c3829va);
                break;
            case 1:
                C3829va.b(c3829va);
                break;
            case 2:
                C3829va.c(c3829va);
                break;
            default:
                C3829va.e(c3829va);
                break;
        }
    }
}
