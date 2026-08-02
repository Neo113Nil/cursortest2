package defpackage;

import com.mbridge.msdk.config.component.common.network.retry.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class kyl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ kyl(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.c();
                break;
            default:
                cVar.e();
                break;
        }
    }
}
