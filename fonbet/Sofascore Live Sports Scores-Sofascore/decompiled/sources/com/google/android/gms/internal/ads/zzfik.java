package com.google.android.gms.internal.ads;

import defpackage.ddb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfik implements zzfiu {
    public zzdcx a;

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ddb a(zzfiv zzfivVar, zzfit zzfitVar) {
        return b(zzfivVar, zzfitVar, null);
    }

    public final synchronized ddb b(zzfiv zzfivVar, zzfit zzfitVar, zzdcx zzdcxVar) {
        zzczp zza;
        try {
            if (zzdcxVar != null) {
                this.a = zzdcxVar;
            } else {
                zzdcxVar = (zzdcx) zzfitVar.h(zzfivVar.b).zzh();
                this.a = zzdcxVar;
            }
            zza = zzdcxVar.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zza.c(zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final Object zzd() {
        zzdcx zzdcxVar;
        synchronized (this) {
            zzdcxVar = this.a;
        }
        return zzdcxVar;
    }
}
