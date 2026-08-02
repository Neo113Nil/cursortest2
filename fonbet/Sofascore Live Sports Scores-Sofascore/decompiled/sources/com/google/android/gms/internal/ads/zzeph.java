package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.jvn;
import defpackage.m5o;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeph implements zzemw {
    public final Context a;
    public final zzdpa b;
    public zzbwj c;
    public final VersionInfoParcel d;

    public zzeph(Context context, zzdpa zzdpaVar, VersionInfoParcel versionInfoParcel) {
        this.a = context;
        this.b = zzdpaVar;
        this.d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        ArrayList arrayList = zzfloVar.a.a.h;
        if (!arrayList.contains(Integer.toString(6))) {
            throw new zzeqf(2, "Unified must be used for RTB.");
        }
        zzdqr l = zzdqr.l(this.c);
        if (!arrayList.contains(Integer.toString(l.q()))) {
            throw new zzeqf(1, "No corresponding native ad listener");
        }
        jvn d = this.b.d(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdrc(l), new zzdsv(null, null, this.c));
        ((zzeof) zzemtVar.c).F4(new zzero((zzddn) d.d.zzb(), (zzdlu) d.f.zzb(), (zzdeh) d.e.zzb(), (zzdew) d.c.zzb(), (zzdfb) d.g.zzb(), (zzdit) d.a.U.zzb(), (zzdga) d.h.zzb(), (zzdms) d.i.zzb(), (zzdip) d.j.zzb(), (zzdec) d.k.zzb()));
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
            int i = this.d.clientJarVersion;
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x2)).intValue();
            String str2 = zzfldVar.U;
            Context context = this.a;
            if (i < intValue) {
                zzbxtVar.j3(str2, jSONObject.toString(), zzfloVar.a.a.d, new ObjectWrapper(context), new m5o(this, zzemtVar), (zzbwa) zzdezVar);
                return;
            }
            String jSONObject2 = jSONObject.toString();
            zzflw zzflwVar = zzfloVar.a.a;
            zzbxtVar.j2(str2, jSONObject2, zzflwVar.d, new ObjectWrapper(context), new m5o(this, zzemtVar), (zzbwa) zzdezVar, zzflwVar.j);
        } catch (RemoteException e) {
            throw new zzfmd(e);
        }
    }
}
