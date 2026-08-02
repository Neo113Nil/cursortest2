package defpackage;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.executor.j;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ eu(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                AnalyticsClient.a(jVar);
                break;
            case 1:
                j.c(jVar);
                break;
            case 2:
                j.a(jVar);
                break;
            default:
                j.b(jVar);
                break;
        }
    }
}
