package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.hsn;
import defpackage.vun;
import defpackage.z4o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenf implements zzemw {
    public final Context a;
    public final zzcvr b;
    public final hsn c;

    public zzenf(Context context, zzcvr zzcvrVar, hsn hsnVar) {
        this.a = context;
        this.b = zzcvrVar;
        this.c = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        vun a = this.b.a(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdnb(new z4o(this, zzemtVar, zzfldVar, 0), null), new zzcvp(zzfldVar.a0));
        ((zzdeo) a.f.zzb()).n0(new zzctr((zzfmu) zzemtVar.b), this.c);
        ((zzeof) zzemtVar.c).F4(new zzeru((zzddn) a.n.zzb(), (zzdlu) a.p.zzb(), (zzdeh) a.j.zzb(), (zzdew) a.m.zzb(), (zzdfb) a.q.zzb(), (zzdit) a.e.T.zzb(), (zzdga) a.r.zzb(), (zzdms) a.s.zzb(), (zzdip) a.t.zzb(), (zzdec) a.v.zzb()));
        return a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
        zzflw zzflwVar = zzfloVar.a.a;
        String jSONObject = zzfldVar.v.toString();
        Context context = this.a;
        zzbwa zzbwaVar = (zzbwa) zzemtVar.c;
        try {
            zzfmuVar.a.U1(new ObjectWrapper(context), zzflwVar.d, jSONObject, zzbwaVar);
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }
}
