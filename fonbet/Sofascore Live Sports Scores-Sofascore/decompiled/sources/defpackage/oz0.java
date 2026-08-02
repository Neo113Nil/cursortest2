package defpackage;

import com.ironsource.InterfaceC4433zb;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class oz0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ InterfaceC4433zb b;

    public /* synthetic */ oz0(InterfaceC4433zb interfaceC4433zb, int i) {
        this.a = i;
        this.b = interfaceC4433zb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        InterfaceC4433zb interfaceC4433zb = this.b;
        switch (i) {
            case 0:
                BannerAdLoader.a(interfaceC4433zb);
                break;
            case 1:
                InterstitialAdLoader.a(interfaceC4433zb);
                break;
            default:
                RewardedAdLoader.a(interfaceC4433zb);
                break;
        }
    }
}
