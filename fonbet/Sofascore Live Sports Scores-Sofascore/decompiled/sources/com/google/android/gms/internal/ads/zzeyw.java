package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeyw implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzeyw(zzeva zzevaVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzevaVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Object zzeuyVar = new zzeuy(((zzcok) ((zzeva) this.a).a).a());
        Object obj = (zzexw) this.b.zzb();
        if (true == ((List) this.c.zzb()).contains("2")) {
            zzeuyVar = obj;
        }
        zzioe.a(zzeuyVar);
        return zzeuyVar;
    }
}
