package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kba implements MediationBannerAd {
    public static final ConcurrentHashMap f = new ConcurrentHashMap();
    public static final lba g = new lba();
    public MediationBannerAdCallback a;
    public final MediationAdLoadCallback b;
    public FrameLayout c;
    public ISDemandOnlyBannerLayout d;
    public ISBannerSize e;

    public kba(MediationAdLoadCallback mediationAdLoadCallback) {
        this.b = mediationAdLoadCallback;
    }

    public static kba a(String str) {
        ConcurrentHashMap concurrentHashMap = f;
        if (concurrentHashMap.containsKey(str)) {
            return (kba) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public final View getView() {
        return this.c;
    }
}
