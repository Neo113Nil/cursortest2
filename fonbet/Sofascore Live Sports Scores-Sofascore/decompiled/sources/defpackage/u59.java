package defpackage;

import com.inmobi.media.Ha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class u59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;

    public /* synthetic */ u59(Ha ha, int i) {
        this.a = i;
        this.b = ha;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.b(ha);
                break;
            case 1:
                Ha.c(ha);
                break;
            default:
                Ha.a(ha);
                break;
        }
    }
}
