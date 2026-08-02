package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbtd extends AdManagerInterstitialAd {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzq b;
    public final com.google.android.gms.ads.internal.client.zzbu c;
    public final AtomicReference d;
    public final long e;
    public AppEventListener f;
    public FullScreenContentCallback g;
    public OnPaidEventListener h;
    public final AtomicLong i;

    public zzbtd(Context context, String str) {
        zzbvq zzbvqVar = new zzbvq();
        this.e = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.a = context;
        this.d = new AtomicReference(str);
        this.b = com.google.android.gms.ads.internal.client.zzq.zza;
        this.c = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbvqVar);
    }

    public final void a(com.google.android.gms.ads.internal.client.zzeh zzehVar, AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzehVar.zzp(this.e);
                zzbuVar.zzP(this.b.zza(this.a, zzehVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.c.zzt();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            AtomicReference atomicReference2 = this.d;
            if (str == null) {
                atomicReference2.set("");
            } else {
                atomicReference2.set(str);
            }
            str2 = (String) this.d.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final long getPlacementId() {
        AtomicLong atomicLong = this.i;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
                    if (zzbuVar != null) {
                        long zzT = zzbuVar.zzT();
                        AtomicLong atomicLong2 = this.i;
                        atomicLong2.set(zzT);
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

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzdxVar = zzbuVar.zzs();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f = appEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzdU(appEventListener != null ? new zzbfv(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.g = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzR(new com.google.android.gms.ads.internal.client.zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzJ(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.h = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzO(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setPlacementId(long j) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzS(j);
                this.i.set(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.c;
            if (zzbuVar != null) {
                zzbuVar.zzQ(new ObjectWrapper(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbtd(Context context, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        new zzbvq();
        this.e = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.a = context;
        this.d = new AtomicReference();
        this.b = com.google.android.gms.ads.internal.client.zzq.zza;
        this.c = zzbuVar;
    }

    public zzbtd(Context context, String str, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar = com.google.android.gms.ads.internal.client.zzq.zza;
        new zzbvq();
        this.e = System.currentTimeMillis();
        this.i = new AtomicLong();
        this.a = context;
        this.d = new AtomicReference(str);
        this.b = zzqVar;
        this.c = zzbuVar;
    }
}
