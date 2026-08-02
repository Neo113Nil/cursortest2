package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.frn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcak {
    public static zzcfe e;
    public final Context a;
    public final AdFormat b;
    public final com.google.android.gms.ads.internal.client.zzeh c;
    public final String d;

    public zzcak(Context context, AdFormat adFormat, com.google.android.gms.ads.internal.client.zzeh zzehVar, String str) {
        this.a = context;
        this.b = adFormat;
        this.c = zzehVar;
        this.d = str;
    }

    public static zzcfe a(Context context) {
        zzcfe zzcfeVar;
        synchronized (zzcak.class) {
            try {
                zzcfeVar = e;
                if (zzcfeVar == null) {
                    zzcfeVar = com.google.android.gms.ads.internal.client.zzay.zzb().zzi(context, new zzbvq());
                    e = zzcfeVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcfeVar;
    }

    public final void b(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zza;
        long currentTimeMillis = System.currentTimeMillis();
        Context context = this.a;
        zzcfe a = a(context);
        if (a == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        ObjectWrapper objectWrapper = new ObjectWrapper(context);
        com.google.android.gms.ads.internal.client.zzeh zzehVar = this.c;
        if (zzehVar == null) {
            zzn zznVar = new zzn();
            zznVar.zzi(currentTimeMillis);
            zza = zznVar.zza();
        } else {
            zzehVar.zzp(currentTimeMillis);
            zza = com.google.android.gms.ads.internal.client.zzq.zza.zza(context, zzehVar);
        }
        try {
            a.zze(objectWrapper, new zzcfi(this.d, this.b.name(), null, zza), new frn(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
