package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.msg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfae implements zzfdi {
    public final zzhdi a;

    public zzfae(zzhdi zzhdiVar) {
        this.a = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(msg.d);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 20;
    }
}
