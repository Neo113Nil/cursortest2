package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.hvn;
import defpackage.z4o;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqo implements zzemw {
    public final Context a;
    public final Executor b;
    public final zzdwp c;

    public zzeqo(Context context, Executor executor, zzdwp zzdwpVar) {
        this.a = context;
        this.b = executor;
        this.c = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final Object a(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        hvn a = this.c.a(new zzczb(zzfloVar, zzfldVar, zzemtVar.a), new zzdwm(new z4o(this, zzemtVar, zzfldVar, 1), null));
        a.h().n0(new zzctr((zzfmu) zzemtVar.b), this.b);
        ((zzeof) zzemtVar.c).F4((zzeqt) a.z.zzb());
        return a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void b(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        zzfmd zzfmdVar;
        JSONObject jSONObject = zzfldVar.v;
        zzdez zzdezVar = zzemtVar.c;
        try {
            zzflw zzflwVar = zzfloVar.a.a;
            zzflk zzflkVar = zzflwVar.p;
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.d;
            int i = zzflkVar.a;
            Object obj = zzemtVar.b;
            Context context = this.a;
            if (i == 3) {
                zzfmu zzfmuVar = (zzfmu) obj;
                try {
                    zzfmuVar.a.R3(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbwa) zzdezVar);
                    return;
                } finally {
                }
            }
            zzfmu zzfmuVar2 = (zzfmu) obj;
            try {
                zzfmuVar2.a.e4(new ObjectWrapper(context), zzmVar, jSONObject.toString(), (zzbwa) zzdezVar);
                return;
            } finally {
            }
        } catch (Exception e) {
            String str = zzemtVar.a;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str)), e);
        }
        String str2 = zzemtVar.a;
        int i22 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzj("Fail to load ad from adapter ".concat(String.valueOf(str2)), e);
    }
}
