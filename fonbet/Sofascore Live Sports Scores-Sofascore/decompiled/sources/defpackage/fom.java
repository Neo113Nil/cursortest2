package defpackage;

import com.inmobi.media.AbstractC3587m1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class fom implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC3587m1 b;

    public /* synthetic */ fom(AbstractC3587m1 abstractC3587m1, int i) {
        this.a = i;
        this.b = abstractC3587m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AbstractC3587m1 abstractC3587m1 = this.b;
        switch (i) {
            case 0:
                AbstractC3587m1.b(abstractC3587m1);
                break;
            default:
                AbstractC3587m1.c(abstractC3587m1);
                break;
        }
    }
}
