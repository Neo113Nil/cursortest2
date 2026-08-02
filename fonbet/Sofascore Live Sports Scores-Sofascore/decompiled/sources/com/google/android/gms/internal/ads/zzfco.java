package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.ar4;
import defpackage.b1l;
import defpackage.ddb;
import defpackage.non;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfco implements zzfdi {
    public static final zzfcp j = new zzfcp(new JSONArray().toString(), new Bundle(), "");
    public final zzhdi a;
    public final ScheduledExecutorService b;
    public final zzesu c;
    public final Context d;
    public final zzflw e;
    public final zzesp f;
    public final zzdya g;
    public final zzecw h;
    public final String i;

    public zzfco(zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, String str, zzesu zzesuVar, Context context, zzflw zzflwVar, zzesp zzespVar, zzdya zzdyaVar, zzecw zzecwVar) {
        this.a = zzhdiVar;
        this.b = scheduledExecutorService;
        this.i = str;
        this.c = zzesuVar;
        this.d = context;
        this.e = zzflwVar;
        this.f = zzespVar;
        this.g = zzdyaVar;
        this.h = zzecwVar;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzesy zzesyVar = (zzesy) ((Map.Entry) it.next()).getValue();
            String str = zzesyVar.a;
            Bundle bundle = this.e.d.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            zzfco zzfcoVar = this;
            arrayList.add(zzfcoVar.b(str, Collections.singletonList(zzesyVar.e), bundle2, zzesyVar.b, zzesyVar.c));
            this = zzfcoVar;
        }
    }

    public final zzhcq b(String str, List list, Bundle bundle, boolean z, boolean z2) {
        ar4 ar4Var = new ar4(this, str, list, bundle, z, z2);
        zzhdi zzhdiVar = this.a;
        zzhcq r = zzhcq.r(zzhcy.d(ar4Var, zzhdiVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.p2)).booleanValue()) {
            r = (zzhcq) zzhcy.g(r, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.i2)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return zzhcy.e(r, Throwable.class, new non(str, 3), zzhdiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        zzflw zzflwVar = this.e;
        if (zzflwVar.s) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v2)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflwVar.d)))) {
                return zzhcy.a(j);
            }
        }
        return zzhcy.d(new b1l(this, 20), this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 32;
    }
}
