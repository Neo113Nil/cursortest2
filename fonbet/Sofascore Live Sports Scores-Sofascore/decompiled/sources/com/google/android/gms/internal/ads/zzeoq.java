package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.evn;
import defpackage.hsn;
import defpackage.j5o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeoq implements zzemw {
    public final Context a;
    public final zzdoe b;
    public final VersionInfoParcel c;
    public final hsn d;

    public zzeoq(Context context, VersionInfoParcel versionInfoParcel, zzdoe zzdoeVar, hsn hsnVar) {
        this.a = context;
        this.c = versionInfoParcel;
        this.b = zzdoeVar;
        this.d = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        evn d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdnb(new j5o(this, zzemtVar, zzfldVar), null));
        ((zzdeo) d.e.zzb()).n0(new zzctr((zzfmu) zzemtVar.b), this.d);
        ((zzeof) zzemtVar.c).F4(new zzeru((zzddn) d.m.zzb(), (zzdlu) d.p.zzb(), (zzdeh) d.i.zzb(), (zzdew) d.l.zzb(), (zzdfb) d.q.zzb(), (zzdit) d.d.T.zzb(), (zzdga) d.s.zzb(), (zzdms) d.t.zzb(), (zzdip) d.u.zzb(), (zzdec) d.w.zzb()));
        return d.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
        zzflw zzflwVar = zzfloVar.a.a;
        String jSONObject = zzfldVar.v.toString();
        String zzm = zzbp.zzm(zzfldVar.s);
        Context context = this.a;
        zzbwa zzbwaVar = (zzbwa) zzemtVar.c;
        try {
            zzfmuVar.a.a4(new ObjectWrapper(context), zzflwVar.d, jSONObject, zzm, zzbwaVar);
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }
}
