package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.ddb;
import defpackage.f0o;
import defpackage.hsn;
import defpackage.q7o;
import defpackage.u8f;
import defpackage.v0o;
import defpackage.v5o;
import defpackage.yun;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzerz implements zzemq {
    public final Context a;
    public final zzcxi b;
    public final zzbkb c;
    public final zzhdi d;
    public final zzfqi e;

    public zzerz(Context context, zzcxi zzcxiVar, zzfqi zzfqiVar, zzhdi zzhdiVar, zzbkb zzbkbVar) {
        this.a = context;
        this.b = zzcxiVar;
        this.e = zzfqiVar;
        this.d = zzhdiVar;
        this.c = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ddb a(zzflo zzfloVar, zzfld zzfldVar) {
        v5o v5oVar = new v5o(new View(this.a), null, u8f.i, (zzfle) zzfldVar.u.get(0));
        yun d = this.b.d(new zzczb(zzfloVar, zzfldVar, null), v5oVar);
        zzery zzeryVar = new zzery((zzddn) d.k.zzb(), (zzdeh) d.n.zzb(), (zzdly) d.p.zzb(), (zzdlq) d.y.zzb(), (zzcuy) d.e.zzb());
        zzfli zzfliVar = zzfldVar.s;
        zzbjw zzbjwVar = new zzbjw(zzeryVar, zzfliVar.b, zzfliVar.a);
        zzfqi zzfqiVar = this.e;
        Objects.requireNonNull(zzfqiVar);
        q7o q7oVar = new q7o(new f0o(11, this, zzbjwVar), 9);
        zzfpz zzfpzVar = new zzfpz(zzfqiVar, zzfqc.CUSTOM_RENDER_SYN, null, zzfqa.d, Collections.EMPTY_LIST, this.d.submit(q7oVar));
        zzfpz a = zzfpzVar.f.a(zzfpzVar.d(), zzfqc.CUSTOM_RENDER_ACK);
        v0o v0oVar = new v0o(1, zzhcy.a(d.d()));
        hsn hsnVar = zzcgj.h;
        return new zzfpz(a.f, a.a, a.b, a.c, a.d, zzhcy.h(a.e, v0oVar, hsnVar)).d();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean b(zzflo zzfloVar, zzfld zzfldVar) {
        zzfli zzfliVar;
        return (this.c == null || (zzfliVar = zzfldVar.s) == null || zzfliVar.a == null) ? false : true;
    }
}
