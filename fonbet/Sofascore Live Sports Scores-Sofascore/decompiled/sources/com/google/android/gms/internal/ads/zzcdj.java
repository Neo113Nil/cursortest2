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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcdj extends RewardedAd {
    public final AtomicReference a;
    public final zzcda b;
    public final Context c;
    public final zzcds d;
    public OnAdMetadataChangedListener e;
    public OnPaidEventListener f;
    public FullScreenContentCallback g;
    public final long h;
    public final AtomicLong i;

    public zzcdj(Context context, zzcda zzcdaVar) {
        this.h = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.c = context.getApplicationContext();
        this.a = new AtomicReference();
        this.b = zzcdaVar;
        this.d = new zzcds();
    }

    public final void a(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzehVar.zzp(this.h);
                zzcdaVar.zzb(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.c, zzehVar), new zzcdn(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.b.zzm();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            AtomicReference atomicReference2 = this.a;
            if (str == null) {
                atomicReference2.set("");
            } else {
                atomicReference2.set(str);
            }
            str2 = (String) this.a.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.i;
        long j2 = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzcda zzcdaVar = this.b;
                if (zzcdaVar != null) {
                    j2 = zzcdaVar.zzp();
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
            AtomicLong atomicLong2 = this.i;
            atomicLong2.set(j2);
            j = atomicLong2.get();
        }
        return j;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzcda zzcdaVar = this.b;
            zzccx zzk = zzcdaVar != null ? zzcdaVar.zzk() : null;
            return zzk == null ? RewardItem.DEFAULT_REWARD : new zzcdk(zzk);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.g = fullScreenContentCallback;
        this.d.a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.e = onAdMetadataChangedListener;
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zze(new zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f = onPaidEventListener;
            zzcda zzcdaVar = this.b;
            if (zzcdaVar != null) {
                zzcdaVar.zzn(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzcda zzcdaVar = this.b;
                if (zzcdaVar != null) {
                    zzcdaVar.zzg(new zzcdo(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcds zzcdsVar = this.d;
        zzcdsVar.b = onUserEarnedRewardListener;
        if (activity == null) {
            zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public zzcdj(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new zzbvq()));
    }

    public zzcdj(Context context, String str, zzcda zzcdaVar) {
        this.h = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.c = context.getApplicationContext();
        this.a = new AtomicReference(str);
        this.b = zzcdaVar;
        this.d = new zzcds();
    }
}
