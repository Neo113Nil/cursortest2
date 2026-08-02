package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Binder;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcq;
import com.google.android.gms.internal.ads.zzhcy;
import defpackage.ddb;
import defpackage.een;
import defpackage.q3o;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzba implements zzhcg {
    public final Executor a;
    public final zzegd b;

    public zzba(Executor executor, zzegd zzegdVar) {
        this.a = executor;
        this.b = zzegdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) throws Exception {
        ddb submit;
        final zzcbv zzcbvVar = (zzcbv) obj;
        zzegd zzegdVar = this.b;
        zzegdVar.getClass();
        String str = zzcbvVar.d;
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 1;
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            submit = zzhcy.b(new zzehp(1));
        } else {
            submit = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D8)).booleanValue() || ((Boolean) zzbls.a.c()).booleanValue()) ? zzegdVar.c.submit(new een(7, zzegdVar, zzcbvVar)) : zzegdVar.d.c(zzcbvVar);
        }
        return zzhcy.h(zzhcy.f((zzhcq) zzhcy.g(zzhcq.r(submit), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J6)).intValue(), TimeUnit.SECONDS, zzegdVar.a), Throwable.class, new q3o(zzegdVar, zzcbvVar, Binder.getCallingUid(), i), zzegdVar.b), new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final ddb zza(Object obj2) {
                zzehq zzehqVar = (zzehq) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzehqVar.a)), zzehqVar.b);
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzcbv.this.a).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = "{}";
                }
                return zzhcy.a(zzbcVar);
            }
        }, this.a);
    }
}
