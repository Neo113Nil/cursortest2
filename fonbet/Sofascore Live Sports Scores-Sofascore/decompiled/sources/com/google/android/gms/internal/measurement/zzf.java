package com.google.android.gms.internal.measurement;

import defpackage.msg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf {
    public final zzaw a;
    public final zzg b;
    public final zzg c;
    public final zzj d;

    public zzf() {
        zzaw zzawVar = new zzaw();
        this.a = zzawVar;
        zzg zzgVar = new zzg(null, zzawVar);
        this.c = zzgVar;
        this.b = zzgVar.c();
        zzj zzjVar = new zzj();
        this.d = zzjVar;
        zzgVar.e("require", new zzw(zzjVar));
        zzjVar.a.put("internal.platform", msg.c);
        zzgVar.e("runtime.counter", new zzah(Double.valueOf(0.0d)));
    }

    public final zzao a(zzg zzgVar, zzje... zzjeVarArr) {
        zzao zzaoVar = zzao.I7;
        for (zzje zzjeVar : zzjeVarArr) {
            zzaoVar = zzi.b(zzjeVar);
            zzh.k(this.c);
            if ((zzaoVar instanceof zzap) || (zzaoVar instanceof zzan)) {
                zzaoVar = this.a.b(zzgVar, zzaoVar);
            }
        }
        return zzaoVar;
    }
}
