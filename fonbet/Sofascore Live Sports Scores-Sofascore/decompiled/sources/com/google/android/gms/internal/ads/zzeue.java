package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeue implements com.google.android.gms.ads.internal.client.zza, zzdlw {
    public com.google.android.gms.ads.internal.client.zzbe a;

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void M() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception at onPhysicalClick.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final synchronized void O() {
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zzbe zzbeVar = this.a;
        if (zzbeVar != null) {
            try {
                zzbeVar.zza();
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzj("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
