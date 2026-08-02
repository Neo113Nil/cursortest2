package com.google.android.gms.internal.ads;

import defpackage.ado;
import defpackage.ahn;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.ddo;
import defpackage.hlo;
import defpackage.ilo;
import defpackage.lrn;
import defpackage.ohn;
import defpackage.slo;
import defpackage.vlo;
import defpackage.yvn;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzghf implements zzggg {
    public final zzgei a;
    public final ddo b;
    public final zzggv c;
    public final ExecutorService d;
    public final zzgrh e;
    public final AtomicReference f = new AtomicReference();

    public zzghf(zzgei zzgeiVar, ddo ddoVar, zzggv zzggvVar, ExecutorService executorService, zzgrh zzgrhVar) {
        this.a = zzgeiVar;
        this.b = ddoVar;
        this.c = zzggvVar;
        this.d = executorService;
        this.e = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        zzgei zzgeiVar = this.a;
        int M = zzgeiVar.M();
        boolean R = zzgeiVar.R();
        ddo ddoVar = this.b;
        ddoVar.getClass();
        zzhcq r = zzhcq.r(zzhcy.c(ddoVar.d, new ado(ddoVar, M)));
        yvn yvnVar = yvn.n;
        slo sloVar = slo.a;
        hlo h = zzhcy.h(r, yvnVar, sloVar);
        if (R && M != ddoVar.f) {
            h = zzhcy.h(zzhcy.e(zzhcq.r(h), Throwable.class, ahn.u, sloVar), new cpn(ddoVar), sloVar);
        }
        ilo i = zzhcy.i(zzhcq.r(h), new lrn(this, 9), sloVar);
        i.addListener(new vlo(0, i, new ohn(this, 22)), this.d);
        return i;
    }
}
