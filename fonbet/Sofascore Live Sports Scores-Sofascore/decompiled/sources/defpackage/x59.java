package defpackage;

import com.inmobi.media.Ha;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class x59 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ha b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ x59(Ha ha, boolean z, String str, int i) {
        this.a = i;
        this.b = ha;
        this.c = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        boolean z = this.c;
        Ha ha = this.b;
        switch (i) {
            case 0:
                Ha.a(ha, z, str);
                break;
            default:
                Ha.b(ha, z, str);
                break;
        }
    }
}
