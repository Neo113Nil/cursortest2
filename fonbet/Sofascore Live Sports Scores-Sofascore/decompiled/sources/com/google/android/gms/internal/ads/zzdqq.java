package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqq extends com.google.android.gms.ads.internal.client.zzdz {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.client.zzea b;
    public final zzbwj c;

    public zzdqq(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbwj zzbwjVar) {
        this.b = zzeaVar;
        this.c = zzbwjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzf() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzg(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final int zzi() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzj() {
        zzbwj zzbwjVar = this.c;
        return zzbwjVar != null ? zzbwjVar.zzA() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzk() {
        zzbwj zzbwjVar = this.c;
        return zzbwjVar != null ? zzbwjVar.zzB() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzl(zzed zzedVar) {
        synchronized (this.a) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.b;
                if (zzeaVar != null) {
                    zzeaVar.zzl(zzedVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final float zzm() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final zzed zzo() {
        synchronized (this.a) {
            try {
                com.google.android.gms.ads.internal.client.zzea zzeaVar = this.b;
                if (zzeaVar == null) {
                    return null;
                }
                return zzeaVar.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzea
    public final void zzq() {
        throw new RemoteException();
    }
}
