package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcob;
import com.google.android.gms.internal.ads.zzcok;
import com.google.android.gms.internal.ads.zzcpa;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzfmv;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.ads.zziof;
import defpackage.hsn;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaq implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;
    public final zziof d;
    public final zziof e;
    public final zziof f;
    public final zziof g;
    public final zziof h;
    public final zziof i;
    public final zziof j;
    public final zziof k;
    public final zziof l;

    public zzaq(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11, zziof zziofVar12) {
        this.a = zziofVar;
        this.b = zziofVar2;
        this.c = zziofVar3;
        this.d = zziofVar4;
        this.e = zziofVar5;
        this.f = zziofVar6;
        this.g = zziofVar7;
        this.h = zziofVar8;
        this.i = zziofVar9;
        this.j = zziofVar10;
        this.k = zziofVar11;
        this.l = zziofVar12;
    }

    public static zzaq zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9, zziof zziofVar10, zziof zziofVar11, zziof zziofVar12, zziof zziofVar13) {
        return new zzaq(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar6, zziofVar7, zziofVar8, zziofVar9, zziofVar10, zziofVar11, zziofVar12, zziofVar13);
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzcob zzcobVar = (zzcob) this.a.zzb();
        Context a = ((zzcok) this.b).a();
        zzbbd zzbbdVar = (zzbbd) this.c.zzb();
        zzfmv zzfmvVar = (zzfmv) this.d.zzb();
        hsn hsnVar = zzcgj.a;
        zzioe.a(hsnVar);
        return new zzap(zzcobVar, a, zzbbdVar, zzfmvVar, hsnVar, (ScheduledExecutorService) this.e.zzb(), (zzeao) this.f.zzb(), (zzfte) this.g.zzb(), ((zzcpa) this.h).a(), ((zzbkm) this.i).zzb(), (zzfma) this.j.zzb(), (zzj) this.k.zzb(), (zza) this.l.zzb());
    }
}
