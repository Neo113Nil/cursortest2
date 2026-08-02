package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzdh implements MuteThisAdReason {
    private final String zza;
    private final zzdg zzb;

    public zzdh(zzdg zzdgVar) {
        String str;
        this.zzb = zzdgVar;
        try {
            str = zzdgVar.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzdg zza() {
        return this.zzb;
    }
}
