package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzby implements zzth {
    public final zztg a;
    public final zzce b;

    public zzby(zztg zztgVar, zzce zzceVar) {
        this.a = zztgVar;
        this.b = zzceVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public final Object zzb() {
        zzbz zzbzVar = (zzbz) this.a.zzb();
        Handler handler = zzcz.a;
        zztj.a(handler);
        return new zzbx(zzbzVar, handler, this.b.zzb());
    }
}
