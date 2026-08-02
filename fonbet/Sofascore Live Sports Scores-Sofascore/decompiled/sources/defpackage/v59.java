package defpackage;

import com.inmobi.media.Ha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class v59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;
    public final /* synthetic */ String c;

    public /* synthetic */ v59(Ha ha, String str, int i) {
        this.a = i;
        this.b = ha;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.c(ha, str);
                break;
            case 1:
                Ha.b(ha, str);
                break;
            default:
                Ha.a(ha, str);
                break;
        }
    }
}
