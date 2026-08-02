package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdh implements MuteThisAdReason {
    public final String a;
    public final zzdg b;

    public zzdh(zzdg zzdgVar) {
        String str;
        this.b = zzdgVar;
        try {
            str = zzdgVar.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            str = null;
        }
        this.a = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final zzdg zza() {
        return this.b;
    }
}
