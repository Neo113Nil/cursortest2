package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbhh {
    public com.google.android.gms.ads.internal.client.zzbu a;
    public final Context b;
    public final String c;
    public final com.google.android.gms.ads.internal.client.zzeh d;
    public final AppOpenAd.AppOpenAdLoadCallback e;
    public final zzbvq f = new zzbvq();
    public final com.google.android.gms.ads.internal.client.zzq g = com.google.android.gms.ads.internal.client.zzq.zza;

    public zzbhh(Context context, String str, com.google.android.gms.ads.internal.client.zzeh zzehVar, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.b = context;
        this.c = str;
        this.d = zzehVar;
        this.e = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzr zzd = com.google.android.gms.ads.internal.client.zzr.zzd();
            com.google.android.gms.ads.internal.client.zzaw zzb = com.google.android.gms.ads.internal.client.zzay.zzb();
            Context context = this.b;
            String str = this.c;
            com.google.android.gms.ads.internal.client.zzbu zza = zzb.zza(context, zzd, str, this.f);
            this.a = zza;
            if (zza != null) {
                com.google.android.gms.ads.internal.client.zzeh zzehVar = this.d;
                zzehVar.zzp(currentTimeMillis);
                this.a.zzI(new zzbgu(this.e, str));
                this.a.zzd(this.g.zza(context, zzehVar));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
