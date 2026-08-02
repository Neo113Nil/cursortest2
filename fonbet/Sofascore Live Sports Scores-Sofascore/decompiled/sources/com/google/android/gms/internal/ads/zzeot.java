package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.evn;
import defpackage.k5o;
import defpackage.qpn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeot implements zzemw {
    public final Context a;
    public final zzdoe b;

    public zzeot(Context context, zzdoe zzdoeVar) {
        this.a = context;
        this.b = zzdoeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        qpn qpnVar = new qpn(zzfldVar, (zzbxt) zzemtVar.b, AdFormat.INTERSTITIAL);
        evn d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdnb(qpnVar, null));
        qpnVar.e = d.b();
        ((zzeof) zzemtVar.c).F4(new zzero((zzddn) d.m.zzb(), (zzdlu) d.p.zzb(), (zzdeh) d.i.zzb(), (zzdew) d.l.zzb(), (zzdfb) d.q.zzb(), (zzdit) d.d.T.zzb(), (zzdga) d.s.zzb(), (zzdms) d.t.zzb(), (zzdip) d.u.zzb(), (zzdec) d.w.zzb()));
        return d.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.b;
            zzbxtVar.zzo(zzfldVar.Z);
            zzbxtVar.q3(zzfldVar.U, zzfldVar.v.toString(), zzfloVar.a.a.d, new ObjectWrapper(this.a), new k5o(this, zzemtVar), (zzbwa) zzemtVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfmd(e);
        }
    }
}
