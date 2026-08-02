package defpackage;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class mba implements MediationInterstitialAd {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final nba e = new nba();
    public MediationInterstitialAdCallback a;
    public final MediationAdLoadCallback b;
    public final String c;

    public mba(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.c = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.b = mediationAdLoadCallback;
    }

    public static mba a(String str) {
        ConcurrentHashMap concurrentHashMap = d;
        if (concurrentHashMap.containsKey(str)) {
            return (mba) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public final void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.c);
    }
}
