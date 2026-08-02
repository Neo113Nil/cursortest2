package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzfo;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbgv extends AppOpenAd {
    public final zzbgz a;
    public final AtomicReference b;
    public final zzbgw c;
    public FullScreenContentCallback d;
    public OnPaidEventListener e;
    public final AtomicLong f;

    public zzbgv(zzbgz zzbgzVar) {
        this.c = new zzbgw();
        this.f = new AtomicLong();
        this.a = zzbgzVar;
        this.b = new AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        String str;
        String str2;
        AtomicReference atomicReference = this.b;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.a.zzj();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            AtomicReference atomicReference2 = this.b;
            if (str == null) {
                atomicReference2.set("");
            } else {
                atomicReference2.set(str);
            }
            str2 = (String) this.b.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.f;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzk = this.a.zzk();
                    AtomicLong atomicLong2 = this.f;
                    atomicLong2.set(zzk);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.a.zzg();
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            zzdxVar = null;
        }
        return ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.d = fullScreenContentCallback;
        this.c.a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.a.zzh(z);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.e = onPaidEventListener;
        try {
            this.a.L1(new zzfo(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j) {
        try {
            this.a.zzl(j);
            this.f.set(j);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.a.z0(new ObjectWrapper(activity), this.c);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbgv(zzbgz zzbgzVar, String str) {
        this.c = new zzbgw();
        this.f = new AtomicLong();
        this.a = zzbgzVar;
        this.b = new AtomicReference(str);
    }
}
