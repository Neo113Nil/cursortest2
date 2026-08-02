package defpackage;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LevelPlayNativeAd b;
    public final /* synthetic */ AdInfo c;

    public /* synthetic */ a6b(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo, int i) {
        this.a = i;
        this.b = levelPlayNativeAd;
        this.c = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdInfo adInfo = this.c;
        LevelPlayNativeAd levelPlayNativeAd = this.b;
        switch (i) {
            case 0:
                LevelPlayNativeAd.a(levelPlayNativeAd, adInfo);
                break;
            default:
                LevelPlayNativeAd.b(levelPlayNativeAd, adInfo);
                break;
        }
    }
}
