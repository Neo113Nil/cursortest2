package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.a5o;
import defpackage.qpn;
import defpackage.vun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeni implements zzemw {
    public final Context a;
    public final zzcvr b;

    public zzeni(Context context, zzcvr zzcvrVar) {
        this.a = context;
        this.b = zzcvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        qpn qpnVar = new qpn(zzfldVar, (zzbxt) zzemtVar.b, AdFormat.APP_OPEN_AD);
        vun a = this.b.a(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdnb(qpnVar, null), new zzcvp(zzfldVar.a0));
        qpnVar.e = a.b();
        ((zzeof) zzemtVar.c).F4(new zzero((zzddn) a.n.zzb(), (zzdlu) a.p.zzb(), (zzdeh) a.j.zzb(), (zzdew) a.m.zzb(), (zzdfb) a.q.zzb(), (zzdit) a.e.T.zzb(), (zzdga) a.r.zzb(), (zzdms) a.s.zzb(), (zzdip) a.t.zzb(), (zzdec) a.v.zzb()));
        return a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        try {
            zzbxt zzbxtVar = (zzbxt) zzemtVar.b;
            zzbxtVar.zzo(zzfldVar.Z);
            zzbxtVar.G1(zzfldVar.U, zzfldVar.v.toString(), zzfloVar.a.a.d, new ObjectWrapper(this.a), new a5o(zzemtVar), (zzbwa) zzemtVar.c);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfmd(e);
        }
    }
}
