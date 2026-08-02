package defpackage;

import android.content.Context;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oba implements MediationRewardedAd {
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final pba e = new pba();
    public MediationRewardedAdCallback a;
    public final MediationAdLoadCallback b;
    public final String c;

    public oba(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback mediationAdLoadCallback) {
        this.c = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.b = mediationAdLoadCallback;
    }

    public static oba a(String str) {
        ConcurrentHashMap concurrentHashMap = d;
        if (concurrentHashMap.containsKey(str)) {
            return (oba) ((WeakReference) concurrentHashMap.get(str)).get();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public final void showAd(Context context) {
        StringBuilder sb = new StringBuilder("Showing IronSource rewarded ad for instance ID: ");
        String str = this.c;
        sb.append(str);
        IronSource.showISDemandOnlyRewardedVideo(str);
    }
}
