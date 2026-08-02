package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import defpackage.ddb;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewh implements zzfdi {
    public final Context a;
    public final zzhdi b;

    public zzewh(Context context, zzhdi zzhdiVar) {
        this.b = zzhdiVar;
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Je)).booleanValue()) {
            return zzhcy.a(new zzewi(null, false));
        }
        ContentResolver contentResolver = this.a.getContentResolver();
        if (contentResolver == null) {
            return zzhcy.a(new zzewi(null, false));
        }
        return this.b.submit(new v35(contentResolver, 17));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 61;
    }
}
