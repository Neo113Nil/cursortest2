package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhx implements zzhr {
    public final Context a;
    public final zzhz b;

    public zzhx(Context context) {
        zzhz zzhzVar = new zzhz();
        this.a = context.getApplicationContext();
        this.b = zzhzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final /* bridge */ /* synthetic */ zzhs zza() {
        return new zzhy(this.a, this.b.zza());
    }
}
