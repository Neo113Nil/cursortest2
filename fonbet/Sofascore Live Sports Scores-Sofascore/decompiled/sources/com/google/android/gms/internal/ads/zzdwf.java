package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdwf extends VideoController.VideoLifecycleCallbacks {
    public final zzdqr a;

    public zzdwf(zzdqr zzdqrVar) {
        this.a = zzdqrVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzea r = this.a.r();
        zzed zzedVar = null;
        if (r != null) {
            try {
                zzedVar = r.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVar == null) {
            return;
        }
        try {
            zzedVar.zzh();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzea r = this.a.r();
        zzed zzedVar = null;
        if (r != null) {
            try {
                zzedVar = r.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVar == null) {
            return;
        }
        try {
            zzedVar.zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzea r = this.a.r();
        zzed zzedVar = null;
        if (r != null) {
            try {
                zzedVar = r.zzo();
            } catch (RemoteException unused) {
            }
        }
        if (zzedVar == null) {
            return;
        }
        try {
            zzedVar.zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }
}
