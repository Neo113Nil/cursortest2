package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.msg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfgb implements zzfdi {
    public final zzhdi a;

    public zzfgb(zzhdi zzhdiVar) {
        this.a = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(msg.e);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 51;
    }
}
