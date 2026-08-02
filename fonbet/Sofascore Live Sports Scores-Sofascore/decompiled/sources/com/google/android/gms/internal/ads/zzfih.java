package com.google.android.gms.internal.ads;

import defpackage.ahn;
import defpackage.b1l;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.i8o;
import defpackage.spn;
import defpackage.utn;
import defpackage.vlo;
import defpackage.x3f;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfih implements zzfiu {
    public final r a;
    public final Executor b;
    public final x3f c = new x3f(17);

    public zzfih(r rVar, hsn hsnVar) {
        this.a = rVar;
        this.b = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ ddb a(zzfiv zzfivVar, zzfit zzfitVar) {
        return b(null);
    }

    public final zzhcq b(zzdcx zzdcxVar) {
        ddb a;
        ddb e;
        r rVar = this.a;
        zzfns zzfnsVar = rVar.b;
        Executor executor = this.b;
        utn utnVar = new utn(rVar, zzdcxVar, executor);
        zzfio zzfioVar = (zzfio) utnVar.e;
        if (zzfioVar == null) {
            if (((Boolean) zzblo.a.c()).booleanValue()) {
                zzczp zza = zzdcxVar.zza();
                zzdcu zzdcuVar = zza.i;
                zzfpp d = zza.c.a(zzdcuVar.b(), zzfqc.GET_CACHE_KEY).b(new spn(3, zza, zzfnsVar)).d();
                b1l b1lVar = new b1l(zza, 10);
                d.addListener(new vlo(0, d, b1lVar), zza.j);
                e = zzhcy.e(zzhcy.i(zzhcq.r(d), new i8o(utnVar, 1), executor), zzehp.class, new i8o(utnVar, 0), executor);
            } else {
                zzflw zzb = zzdcxVar.zzb();
                zzfio zzfioVar2 = new zzfio(null, new zzfnw(zzb.d, zzb.g, new zzcby(zzfnsVar.a).a().j, zzfnsVar.g, zzb.k));
                utnVar.e = zzfioVar2;
                e = zzhcy.a(zzfioVar2);
            }
            a = zzhcy.i(e, ahn.q, executor);
        } else {
            a = zzhcy.a(zzfioVar);
        }
        return zzhcy.e(zzhcy.h(zzhcq.r(a), new spn(13, this, zzdcxVar), executor), Exception.class, new ahn(16), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfiu
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
