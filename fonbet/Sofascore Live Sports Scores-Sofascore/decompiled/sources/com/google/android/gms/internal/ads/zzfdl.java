package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.ddb;
import defpackage.hsn;
import defpackage.inn;
import defpackage.mpi;
import defpackage.r0o;
import defpackage.rlo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdl {
    public final Context a;
    public final Set b;
    public final hsn c;
    public final zzfrg d;

    public zzfdl(Context context, hsn hsnVar, Set set, zzfrg zzfrgVar) {
        this.a = context;
        this.c = hsnVar;
        this.b = set;
        this.d = zzfrgVar;
    }

    public final rlo a(Bundle bundle, Object obj) {
        zzfqw e = zzfqw.e(8, this.a);
        e.zza();
        Set<zzfdi> set = this.b;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        inn innVar = zzbjg.td;
        if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() && bundle != null) {
            long a = com.google.android.gms.ads.internal.zzt.zzk().a();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", a);
            } else {
                bundle.putLong("gms-signals-start", a);
            }
        }
        for (zzfdi zzfdiVar : set) {
            if (!arrayList2.contains(String.valueOf(zzfdiVar.zzb()))) {
                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                ddb zza = zzfdiVar.zza();
                Bundle bundle3 = bundle2;
                bundle2 = bundle3;
                zza.addListener(new mpi(this, elapsedRealtime, zzfdiVar, bundle3), zzcgj.h);
                arrayList.add(zza);
            }
        }
        rlo a2 = new zzhcx(zzgxm.x(arrayList), true).a(this.c, new r0o(arrayList, obj, bundle, bundle2, 2));
        if (zzfrj.a()) {
            zzfrf.c(a2, this.d, e, false);
        }
        return a2;
    }
}
