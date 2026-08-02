package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.hvn;
import defpackage.qpn;
import defpackage.s5o;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqr implements zzemw {
    public final Context a;
    public final zzdwp b;

    public zzeqr(Context context, zzdwp zzdwpVar) {
        this.a = context;
        this.b = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        qpn qpnVar = new qpn(zzfldVar, (zzbxt) zzemtVar.b, AdFormat.REWARDED);
        hvn a = this.b.a(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdwm(qpnVar, null));
        qpnVar.e = a.b();
        ((zzeof) zzemtVar.c).F4(new zzern((zzddn) a.m.zzb(), (zzdlu) a.o.zzb(), (zzdeh) a.i.zzb(), (zzdew) a.l.zzb(), (zzdfb) a.p.zzb(), (zzdec) a.v.zzb(), (zzdit) a.d.X.zzb(), (zzdms) a.s.zzb(), (zzdga) a.r.zzb(), (zzdmf) a.x.zzb(), (zzdip) a.t.zzb()));
        return a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        try {
            Object obj = zzemtVar.b;
            zzdez zzdezVar = zzemtVar.c;
            zzbxt zzbxtVar = (zzbxt) obj;
            String str = zzfldVar.Z;
            JSONObject jSONObject = zzfldVar.v;
            zzbxtVar.zzo(str);
            zzflw zzflwVar = zzfloVar.a.a;
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
            int i = zzflwVar.p.a;
            String str2 = zzfldVar.U;
            Context context = this.a;
            if (i == 3) {
                zzbxtVar.r2(str2, jSONObject.toString(), zzmVar, new ObjectWrapper(context), new s5o(this, zzemtVar), (zzbwa) zzdezVar);
            } else {
                zzbxtVar.z3(str2, jSONObject.toString(), zzmVar, new ObjectWrapper(context), new s5o(this, zzemtVar), (zzbwa) zzdezVar);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
