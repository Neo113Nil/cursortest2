package defpackage;

import com.ironsource.Va;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class zjk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Va b;

    public /* synthetic */ zjk(Va va, int i) {
        this.a = i;
        this.b = va;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Va va = this.b;
        switch (i) {
            case 0:
                Va.a(va);
                break;
            default:
                Va.c(va);
                break;
        }
    }
}
