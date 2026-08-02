package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C3278a2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class tql implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3278a2 b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ tql(C3278a2 c3278a2, AdMetaInfo adMetaInfo, int i) {
        this.a = i;
        this.b = c3278a2;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdMetaInfo adMetaInfo = this.c;
        C3278a2 c3278a2 = this.b;
        switch (i) {
            case 0:
                C3278a2.b(c3278a2, adMetaInfo);
                break;
            default:
                C3278a2.a(c3278a2, adMetaInfo);
                break;
        }
    }
}
