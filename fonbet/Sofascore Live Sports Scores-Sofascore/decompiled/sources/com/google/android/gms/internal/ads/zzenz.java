package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.b5o;
import defpackage.fjn;
import defpackage.qxn;
import defpackage.xlo;
import defpackage.yun;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenz implements zzemw {
    public final Context a;
    public final zzcxi b;
    public View c;
    public zzbwd d;

    public zzenz(Context context, zzcxi zzcxiVar) {
        this.a = context;
        this.b = zzcxiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f9)).booleanValue() && zzfldVar.g0) {
            try {
                view = (View) ObjectWrapper.Z1(this.d.zze());
                boolean zzf = this.d.zzf();
                if (view == null) {
                    throw new zzfmd(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzhcy.h(xlo.b, new qxn(6, this, view, zzfldVar), zzcgj.f).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfmd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfmd(e2);
            }
        } else {
            view = this.c;
        }
        yun d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzcwk(view, null, new fjn(zzemtVar, 14), (zzfle) zzfldVar.u.get(0)));
        d.g().q0(view);
        ((zzeof) zzemtVar.c).F4(new zzero((zzddn) d.k.zzb(), (zzdlu) d.q.zzb(), (zzdeh) d.n.zzb(), (zzdew) d.j.zzb(), d.e(), (zzdit) d.d.V.zzb(), (zzdga) d.t.zzb(), (zzdms) d.u.zzb(), (zzdip) d.v.zzb(), (zzdec) d.w.zzb()));
        return d.d();
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
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f9)).booleanValue();
            Context context = this.a;
            if (booleanValue && zzfldVar.g0) {
                String str2 = zzfldVar.U;
                String jSONObject2 = jSONObject.toString();
                zzflw zzflwVar = zzfloVar.a.a;
                zzbxtVar.w1(str2, jSONObject2, zzflwVar.d, new ObjectWrapper(context), new b5o(this, zzemtVar), (zzbwa) zzdezVar, zzflwVar.f);
                return;
            }
            String str3 = zzfldVar.U;
            String jSONObject3 = jSONObject.toString();
            zzflw zzflwVar2 = zzfloVar.a.a;
            zzbxtVar.H3(str3, jSONObject3, zzflwVar2.d, new ObjectWrapper(context), new b5o(this, zzemtVar), (zzbwa) zzdezVar, zzflwVar2.f);
        } catch (RemoteException e) {
            throw new zzfmd(e);
        }
    }
}
