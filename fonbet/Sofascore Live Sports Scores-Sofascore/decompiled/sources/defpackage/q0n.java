package defpackage;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.media.C3881xa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C3881xa b;
    public final /* synthetic */ AdMetaInfo c;

    public /* synthetic */ q0n(C3881xa c3881xa, AdMetaInfo adMetaInfo, int i) {
        this.a = i;
        this.b = c3881xa;
        this.c = adMetaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdMetaInfo adMetaInfo = this.c;
        C3881xa c3881xa = this.b;
        switch (i) {
            case 0:
                C3881xa.b(c3881xa, adMetaInfo);
                break;
            default:
                C3881xa.a(c3881xa, adMetaInfo);
                break;
        }
    }
}
