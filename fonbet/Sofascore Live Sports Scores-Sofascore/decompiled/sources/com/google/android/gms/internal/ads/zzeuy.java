package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.eq3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeuy implements zzfdi {
    public final Context a;

    public zzeuy(Context context) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return zzhcy.a(new zzeuz(eq3.b(this.a, "com.google.android.gms.permission.AD_ID") == 0));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 2;
    }
}
