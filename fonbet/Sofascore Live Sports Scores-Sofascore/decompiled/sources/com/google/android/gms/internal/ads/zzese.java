package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.f0o;
import defpackage.hsn;
import defpackage.p03;
import defpackage.q7o;
import defpackage.v0o;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzese implements zzemq {
    public final zzbkb a;
    public final zzhdi b;
    public final zzfqi c;
    public final zzesn d;

    public zzese(zzfqi zzfqiVar, zzhdi zzhdiVar, zzbkb zzbkbVar, zzesn zzesnVar) {
        this.c = zzfqiVar;
        this.b = zzhdiVar;
        this.a = zzbkbVar;
        this.d = zzesnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        zzcgo zzcgoVar = new zzcgo();
        zzesj zzesjVar = new zzesj();
        p03 p03Var = new p03(this, zzcgoVar, zzfloVar, zzfldVar, zzesjVar, 22, false);
        synchronized (zzesjVar) {
            zzesjVar.a = p03Var;
        }
        zzfli zzfliVar = zzfldVar.s;
        zzbjw zzbjwVar = new zzbjw(zzesjVar, zzfliVar.b, zzfliVar.a);
        zzfqc zzfqcVar = zzfqc.CUSTOM_RENDER_SYN;
        zzfqi zzfqiVar = this.c;
        Objects.requireNonNull(zzfqiVar);
        f0o f0oVar = new f0o(12, this, zzbjwVar);
        zzfpz zzfpzVar = new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, this.b.submit(new q7o(f0oVar, 9)));
        zzfpz a = zzfpzVar.f.a(zzfpzVar.d(), zzfqc.CUSTOM_RENDER_ACK);
        v0o v0oVar = new v0o(1, zzcgoVar);
        hsn hsnVar = zzcgj.h;
        return new zzfpz(a.f, a.a, a.b, a.c, a.d, zzhcy.h(a.e, v0oVar, hsnVar)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.a == null || (zzfliVar = zzfldVar.s) == null || zzfliVar.a == null) ? false : true;
    }
}
