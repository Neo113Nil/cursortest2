package com.google.android.gms.ads.rewarded;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class RewardedAd {
    @Deprecated
    public static boolean isAdAvailable(@NonNull Context context, @NonNull String str) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        try {
            return com.google.android.gms.ads.zzb.zza(context).zzf(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdManagerAdRequest adManagerAdRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        Preconditions.j(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.j(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(context);
        if (((Boolean) zzblf.k.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                zzo.zzd("Loading on background thread");
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzb
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        Context context2 = context;
                        try {
                            new zzcdj(context2, str).a(adManagerAdRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaq.c(context2).a("RewardedAd.loadAdManager", e);
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new zzcdj(context, str).a(adManagerAdRequest.zza(), rewardedAdLoadCallback);
    }

    @Nullable
    @Deprecated
    public static RewardedAd pollAd(@NonNull Context context, @NonNull String str) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        try {
            zzcda zzg = com.google.android.gms.ads.zzb.zza(context).zzg(str);
            if (zzg != null) {
                return new zzcdj(context, str, zzg);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @NonNull
    public abstract Bundle getAdMetadata();

    @NonNull
    public abstract String getAdUnitId();

    @Nullable
    public abstract FullScreenContentCallback getFullScreenContentCallback();

    @Nullable
    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    @Nullable
    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract long getPlacementId();

    @NonNull
    public abstract ResponseInfo getResponseInfo();

    @NonNull
    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener);

    public abstract void setPlacementId(long j);

    public abstract void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(@NonNull final Context context, @NonNull final String str, @NonNull final AdRequest adRequest, @NonNull final RewardedAdLoadCallback rewardedAdLoadCallback) {
        Preconditions.j(context, "Context cannot be null.");
        Preconditions.j(str, "AdUnitId cannot be null.");
        Preconditions.j(adRequest, "AdRequest cannot be null.");
        Preconditions.j(rewardedAdLoadCallback, "LoadCallback cannot be null.");
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzbjg.a(context);
        if (((Boolean) zzblf.k.c()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewarded.zzc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        RewardedAdLoadCallback rewardedAdLoadCallback2 = rewardedAdLoadCallback;
                        AdRequest adRequest2 = adRequest;
                        Context context2 = context;
                        try {
                            new zzcdj(context2, str).a(adRequest2.zza(), rewardedAdLoadCallback2);
                        } catch (IllegalStateException e) {
                            zzcaq.c(context2).a("RewardedAd.load", e);
                        }
                    }
                });
                return;
            }
        }
        zzo.zzd("Loading on UI thread");
        new zzcdj(context, str).a(adRequest.zza(), rewardedAdLoadCallback);
    }
}
