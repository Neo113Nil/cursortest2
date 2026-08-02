package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ohn;
import defpackage.qxn;
import defpackage.xlo;
import defpackage.yun;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzenu implements zzemw {
    public final Context a;
    public final zzcxi b;
    public final Executor c;

    public zzenu(Context context, zzcxi zzcxiVar, Executor executor) {
        this.a = context;
        this.b = zzcxiVar;
        this.c = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmd zzfmdVar;
        View view;
        Object obj = zzemtVar.b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f9)).booleanValue() && zzfldVar.g0) {
            try {
                zzbwd b = ((zzfmu) obj).a.b();
                if (b == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new zzfmd(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
                try {
                    view = (View) ObjectWrapper.Z1(b.zze());
                    boolean zzf = b.zzf();
                    if (view == null) {
                        throw new zzfmd(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zzf) {
                        try {
                            view = (View) zzhcy.h(xlo.b, new qxn(5, this, view, zzfldVar), zzcgj.f).get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new zzfmd(e);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new zzfmd(e2);
                }
            } finally {
            }
        } else {
            try {
                view = (View) ObjectWrapper.Z1(((zzfmu) obj).a.zzf());
            } finally {
            }
        }
        zzfmu zzfmuVar = (zzfmu) obj;
        yun d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzcwk(view, null, new ohn(zzfmuVar, 15), (zzfle) zzfldVar.u.get(0)));
        d.g().q0(view);
        ((zzdeo) d.f.zzb()).n0(new zzctr(zzfmuVar), this.c);
        ((zzeof) zzemtVar.c).F4(new zzeru((zzddn) d.k.zzb(), (zzdlu) d.q.zzb(), (zzdeh) d.n.zzb(), (zzdew) d.j.zzb(), d.e(), (zzdit) d.d.V.zzb(), (zzdga) d.t.zzb(), (zzdms) d.u.zzb(), (zzdip) d.v.zzb(), (zzdec) d.w.zzb()));
        return d.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        zzfmd zzfmdVar;
        zzfli zzfliVar = zzfldVar.s;
        JSONObject jSONObject = zzfldVar.v;
        boolean z = zzfldVar.g0;
        zzdez zzdezVar = zzemtVar.c;
        Object obj = zzemtVar.b;
        zzflw zzflwVar = zzfloVar.a.a;
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzflwVar.f;
        boolean z2 = zzrVar2.zzn;
        Context context = this.a;
        if (z2) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(context, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f9)).booleanValue() && z) ? new com.google.android.gms.ads.internal.client.zzr(context, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : zzfmc.a(context, zzfldVar.u);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f9)).booleanValue() && z) {
            try {
                ((zzfmu) obj).a.t4(new ObjectWrapper(context), zzrVar3, zzmVar, jSONObject.toString(), zzbp.zzm(zzfliVar), (zzbwa) zzdezVar);
            } finally {
            }
        } else {
            try {
                ((zzfmu) obj).a.h0(new ObjectWrapper(context), zzrVar3, zzmVar, jSONObject.toString(), zzbp.zzm(zzfliVar), (zzbwa) zzdezVar);
            } finally {
            }
        }
    }
}
