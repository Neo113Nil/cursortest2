package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzcaq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class InterstitialAd {
    @Deprecated
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        try {
            return zzb.zza(context).zzj(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        Preconditions.j(adRequest, "AdRequest cannot be null.");
        Preconditions.j(interstitialAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(context);
        if (((Boolean) zzblf.i.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        InterstitialAdLoadCallback interstitialAdLoadCallback2 = interstitialAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzbtd(context2, str).a(adRequest2.zza(), interstitialAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaq.c(context2).a("InterstitialAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        new zzbtd(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    @Nullable
    @Deprecated
    public static InterstitialAd pollAd(@NonNull Context context, @NonNull String str) {
        try {
            zzbu zzk = zzb.zza(context).zzk(str);
            if (zzk != null) {
                return new zzbtd(context, str, zzk);
            }
            zzo.zzl("Failed to obtain an Interstitial Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j);

    public abstract void show(@NonNull Activity activity);
}
