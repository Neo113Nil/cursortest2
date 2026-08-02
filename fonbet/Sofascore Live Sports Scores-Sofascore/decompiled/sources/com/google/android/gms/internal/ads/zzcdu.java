package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzfn;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdu extends RewardedInterstitialAd {
    public final String a;
    public final zzcda b;
    public final Context c;
    public FullScreenContentCallback e;
    public OnAdMetadataChangedListener f;
    public OnPaidEventListener g;
    public final long h = System.currentTimeMillis();
    public final AtomicLong i = new AtomicLong();
    public final zzcds d = new zzcds();

    public zzcdu(Context context, String str) {
        this.a = str;
        this.c = context.getApplicationContext();
        this.b = com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new zzbvq());
    }

    public final void a(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzehVar.zzp(this.h);
                zzcdaVar.zzc(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.c, zzehVar), new zzcdt(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                return zzcdaVar.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final long getPlacementId() {
        AtomicLong atomicLong = this.i;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    zzcda zzcdaVar = this.b;
                    if (zzcdaVar != null) {
                        long zzp = zzcdaVar.zzp();
                        AtomicLong atomicLong2 = this.i;
                        atomicLong2.set(zzp);
                        return atomicLong2.get();
                    }
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
                return 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzdxVar = zzcdaVar.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            zzcda zzcdaVar = this.b;
            zzccx zzk = zzcdaVar != null ? zzcdaVar.zzk() : null;
            if (zzk != null) {
                return new zzcdk(zzk);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.e = fullScreenContentCallback;
        this.d.a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzo(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f = onAdMetadataChangedListener;
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zze(new zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.g = onPaidEventListener;
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzn(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setPlacementId(long j) {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzq(j);
                this.i.set(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzg(new zzcdo(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcds zzcdsVar = this.d;
        zzcdsVar.b = onUserEarnedRewardListener;
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzd(zzcdsVar);
                zzcdaVar.zza(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
