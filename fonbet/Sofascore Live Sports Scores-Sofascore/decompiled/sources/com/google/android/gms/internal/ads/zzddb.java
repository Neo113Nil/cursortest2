package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzddb implements zzinw {
    public final zzdcz a;
    public final zziof b;

    public zzddb(zzdcz zzdczVar, zzcok zzcokVar) {
        this.a = zzdczVar;
        this.b = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        ((zzcok) this.b).a();
        Context context = this.a.a;
        zzioe.a(context);
        return context;
    }
}
