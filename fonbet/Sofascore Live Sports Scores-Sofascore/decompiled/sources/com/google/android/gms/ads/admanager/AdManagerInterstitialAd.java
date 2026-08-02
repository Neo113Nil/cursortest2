package com.google.android.gms.ads.admanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class AdManagerInterstitialAd extends InterstitialAd {
    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        Preconditions.j(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.j(adManagerInterstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(context);
        if (((Boolean) zzblf.i.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback2 = adManagerInterstitialAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new zzbtd(context2, str).a(adManagerAdRequest2.zza(), adManagerInterstitialAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaq.c(context2).a("AdManagerInterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new zzbtd(context, str).a(adManagerAdRequest.zza(), adManagerInterstitialAdLoadCallback);
    }

    @Nullable
    public abstract AppEventListener getAppEventListener();

    public abstract void setAppEventListener(@Nullable AppEventListener appEventListener);
}
