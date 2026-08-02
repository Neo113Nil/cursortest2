package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzdcu;
import com.google.android.gms.internal.ads.zzdcv;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzay implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zziof d;

    public zzay(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zziofVar4;
    }

    public static zzay zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzay(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfqi zzfqiVar = (zzfqi) this.a.zzb();
        zzba zzb = ((zzbb) this.b).zzb();
        zzdcu zzb2 = ((zzdcv) this.c).zzb();
        zzdml zzdmlVar = (zzdml) this.d.zzb();
        zzfpp d = zzfqiVar.a(zzb2.b(), zzfqc.GENERATE_SIGNALS).b(zzb).c(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J6)).intValue()).d();
        d.addListener(new vlo(0, d, new zzar(zzdmlVar)), zzcgj.a);
        return d;
    }
}
