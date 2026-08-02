package defpackage;

import com.sofascore.results.ads.iml.banner.AdBannerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lf implements Function0 {
    public final /* synthetic */ AdBannerView a;

    public lf(AdBannerView adBannerView) {
        this.a = adBannerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0<Unit> adLoadedListener = this.a.getAdLoadedListener();
        if (adLoadedListener != null) {
            adLoadedListener.invoke();
        }
        return Unit.a;
    }
}
