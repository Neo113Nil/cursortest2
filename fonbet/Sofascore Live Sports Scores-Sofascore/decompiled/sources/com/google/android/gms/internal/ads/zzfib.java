package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.h8o;
import defpackage.hsn;
import defpackage.i5o;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfib implements zzfiu {
    public final zzfil a;
    public final zzfih b;
    public final zzfoh c;
    public final String d;
    public zzdcx e;
    public final Executor f;

    public zzfib(zzfil zzfilVar, zzfih zzfihVar, zzfoh zzfohVar, String str, hsn hsnVar) {
        this.a = zzfilVar;
        this.b = zzfihVar;
        this.c = zzfohVar;
        this.d = str;
        this.f = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final ddb a(zzfiv zzfivVar, zzfit zzfitVar) {
        synchronized (this) {
            zzdcw h = zzfitVar.h(zzfivVar.b);
            h.b(new zzfic(this.d));
            zzdcx zzdcxVar = (zzdcx) h.zzh();
            zzdcxVar.zzb();
            zzdcxVar.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzdcxVar.zzb().d;
            if (zzmVar.zzs != null || zzmVar.zzx != null) {
                this.e = zzdcxVar;
                return this.a.b(zzfivVar, zzfitVar, zzdcxVar);
            }
            zzflw zzb = zzdcxVar.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzb.d;
            String str = zzb.g;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzb.k;
            Executor executor = this.f;
            return zzhcy.h(zzhcq.r(this.b.b(zzdcxVar)), new i5o(this, zzfivVar, new h8o(zzfitVar, zzfivVar, zzmVar2, str, executor, zzxVar, null), zzfitVar, zzdcxVar, 1), executor);
        }
    }

    public final ddb b(zzfnu zzfnuVar, zzfiv zzfivVar) {
        zzdcx zzdcxVar = zzfnuVar.a;
        this.e = zzdcxVar;
        if (zzfnuVar.c != null) {
            if (zzdcxVar.zzc() != null) {
                zzfnuVar.c.e.c(zzfnuVar.a.zzc());
            }
            return zzhcy.a(zzfnuVar.c);
        }
        zzdcxVar.zza().g = zzfnuVar.b;
        return this.a.b(zzfivVar, null, zzfnuVar.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final Object zzd() {
        zzdcx zzdcxVar;
        synchronized (this) {
            zzdcxVar = this.e;
        }
        return zzdcxVar;
    }
}
