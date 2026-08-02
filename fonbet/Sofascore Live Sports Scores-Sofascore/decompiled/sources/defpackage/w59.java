package defpackage;

import com.inmobi.media.Ha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class w59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ w59(Ha ha, String str, String str2, int i) {
        this.a = i;
        this.b = ha;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.a(ha, str2, str);
                break;
            case 1:
                Ha.e(ha, str2, str);
                break;
            case 2:
                Ha.b(ha, str2, str);
                break;
            case 3:
                Ha.d(ha, str2, str);
                break;
            case 4:
                Ha.f(ha, str2, str);
                break;
            default:
                Ha.c(ha, str2, str);
                break;
        }
    }
}
