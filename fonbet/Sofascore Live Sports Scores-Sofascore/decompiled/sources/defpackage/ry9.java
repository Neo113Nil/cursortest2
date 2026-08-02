package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.inmobi.ads.listeners.InterstitialAdEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ry9 implements yx9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ MediationAdConfiguration c;
    public final /* synthetic */ InterstitialAdEventListener d;

    public /* synthetic */ ry9(InterstitialAdEventListener interstitialAdEventListener, Context context, MediationAdConfiguration mediationAdConfiguration, int i) {
        this.a = i;
        this.d = interstitialAdEventListener;
        this.b = context;
        this.c = mediationAdConfiguration;
    }

    @Override // defpackage.yx9
    public final void a(AdError adError) {
        int i = this.a;
        InterstitialAdEventListener interstitialAdEventListener = this.d;
        switch (i) {
            case 0:
                adError.toString();
                MediationAdLoadCallback mediationAdLoadCallback = ((sy9) interstitialAdEventListener).b;
                if (mediationAdLoadCallback != null) {
                    mediationAdLoadCallback.onFailure(adError);
                    break;
                }
                break;
            default:
                adError.toString();
                MediationAdLoadCallback mediationAdLoadCallback2 = ((vy9) interstitialAdEventListener).b;
                if (mediationAdLoadCallback2 != null) {
                    mediationAdLoadCallback2.onFailure(adError);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yx9
    public final void b() {
        int i = this.a;
        MediationAdConfiguration mediationAdConfiguration = this.c;
        Context context = this.b;
        InterstitialAdEventListener interstitialAdEventListener = this.d;
        switch (i) {
            case 0:
                ((sy9) interstitialAdEventListener).a(context, (MediationInterstitialAdConfiguration) mediationAdConfiguration);
                break;
            default:
                ((vy9) interstitialAdEventListener).a(context, (MediationRewardedAdConfiguration) mediationAdConfiguration);
                break;
        }
    }
}
