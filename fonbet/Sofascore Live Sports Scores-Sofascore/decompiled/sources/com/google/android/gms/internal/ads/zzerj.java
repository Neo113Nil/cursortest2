package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.hvn;
import defpackage.u5o;
import defpackage.utn;
import defpackage.z4o;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzerj implements zzemw {
    public final Context a;
    public final Executor b;
    public final zzdwp c;

    public zzerj(Context context, Executor executor, zzdwp zzdwpVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdwpVar;
    }

    public static final void c(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        try {
            zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
            try {
                zzfmuVar.a.q2(zzfloVar.a.a.d, zzfldVar.v.toString());
            } catch (Throwable th) {
                throw new zzfmd(th);
            }
        } catch (Exception e) {
            String str = zzemtVar.a;
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        hvn a = this.c.a(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdwm(new z4o(this, zzemtVar, zzfldVar, 2), null));
        a.h().n0(new zzctr((zzfmu) zzemtVar.b), this.b);
        zzdew zzdewVar = (zzdew) a.l.zzb();
        zzddn a2 = a.a();
        zzdga zzdgaVar = (zzdga) a.r.zzb();
        zzdmf f = a.f();
        zzeog zzeogVar = (zzeog) zzemtVar.c;
        u5o u5oVar = new u5o(this, zzdgaVar, a2, zzdewVar, f);
        synchronized (zzeogVar) {
            zzeogVar.a = u5oVar;
        }
        return a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmu zzfmuVar = (zzfmu) zzemtVar.b;
        if (zzfmuVar.a()) {
            c(zzfloVar, zzfldVar, zzemtVar);
            return;
        }
        utn utnVar = new utn(this, zzfloVar, zzfldVar, zzemtVar, 4);
        zzdez zzdezVar = zzemtVar.c;
        zzeog zzeogVar = (zzeog) zzdezVar;
        synchronized (zzeogVar) {
            zzeogVar.c = utnVar;
        }
        Context context = this.a;
        zzflw zzflwVar = zzfloVar.a.a;
        zzccs zzccsVar = (zzccs) zzdezVar;
        String jSONObject = zzfldVar.v.toString();
        try {
            zzfmuVar.a.s3(new ObjectWrapper(context), zzflwVar.d, zzccsVar, jSONObject);
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }
}
