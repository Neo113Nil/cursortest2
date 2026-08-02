package defpackage;

import com.ironsource.Jf;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class wda implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TestSuiteActivity b;
    public final /* synthetic */ LevelPlayBannerAdView c;

    public /* synthetic */ wda(TestSuiteActivity testSuiteActivity, LevelPlayBannerAdView levelPlayBannerAdView, int i) {
        this.a = i;
        this.b = testSuiteActivity;
        this.c = levelPlayBannerAdView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LevelPlayBannerAdView levelPlayBannerAdView = this.c;
        TestSuiteActivity testSuiteActivity = this.b;
        switch (i) {
            case 0:
                Jf.b(testSuiteActivity, levelPlayBannerAdView);
                break;
            default:
                Jf.a(testSuiteActivity, levelPlayBannerAdView);
                break;
        }
    }
}
