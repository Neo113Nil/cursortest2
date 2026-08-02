package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.q7o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdo implements zzfdi {
    public final Context a;
    public final zzhdi b;

    public zzfdo(Context context, zzhdi zzhdiVar) {
        this.a = context;
        this.b = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        if (!((Boolean) zzbkz.b.c()).booleanValue()) {
            return zzhcy.a(new zzfdp(-1, -1));
        }
        return this.b.submit(new q7o(this, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 59;
    }
}
