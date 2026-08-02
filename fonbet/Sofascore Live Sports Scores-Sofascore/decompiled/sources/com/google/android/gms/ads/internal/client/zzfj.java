package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfj extends zzcx {
    public zzbso a;

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbso zzbsoVar = zzfj.this.a;
                if (zzbsoVar != null) {
                    try {
                        zzbsoVar.zza(Collections.EMPTY_LIST);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not notify onComplete event.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbso zzbsoVar) throws RemoteException {
        this.a = zzbsoVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbvu zzbvuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
