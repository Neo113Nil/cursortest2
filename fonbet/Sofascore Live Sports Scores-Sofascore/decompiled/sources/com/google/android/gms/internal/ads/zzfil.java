package com.google.android.gms.internal.ads;

import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfil implements zzfiu {
    public final zzfik a;
    public zzdcx b;

    public zzfil(zzfik zzfikVar) {
        this.a = zzfikVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ddb a(zzfiv zzfivVar, zzfit zzfitVar) {
        return b(zzfivVar, zzfitVar, null);
    }

    public final synchronized ddb b(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzcbv zzcbvVar;
        this.b = zzdcxVar;
        if (zzdcxVar == null || (zzcbvVar = zzfivVar.a) == null) {
            return this.a.b(zzfivVar, zzfitVar, zzdcxVar);
        }
        zzczp zza = zzdcxVar.zza();
        return zza.c(zza.a(zzhcy.a(zzcbvVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final Object zzd() {
        zzdcx zzdcxVar;
        synchronized (this) {
            zzdcxVar = this.b;
        }
        return zzdcxVar;
    }
}
