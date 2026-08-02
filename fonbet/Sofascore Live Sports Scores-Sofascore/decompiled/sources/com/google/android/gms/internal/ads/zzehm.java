package com.google.android.gms.internal.ads;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.ddb;
import defpackage.ohn;
import defpackage.spn;
import defpackage.vlo;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzehm implements zzeho {
    public final Map a;
    public final zzhdi b;
    public final zzdgt c;

    public zzehm(Map map, zzhdi zzhdiVar, zzdgt zzdgtVar) {
        this.a = map;
        this.b = zzhdiVar;
        this.c = zzdgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeho
    public final ddb e(zzcbv zzcbvVar) {
        this.c.Z(zzcbvVar);
        ddb b = zzhcy.b(new zzefb(3));
        int i = 0;
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D9)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) {
            zziol zziolVar = (zziol) this.a.get(str.trim());
            if (zziolVar != null) {
                b = zzhcy.f(b, zzefb.class, new spn(7, zziolVar, zzcbvVar), this.b);
            }
        }
        b.addListener(new vlo(i, b, new ohn(this, 13)), zzcgj.h);
        return b;
    }
}
