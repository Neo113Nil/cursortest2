package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzezs implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zziof c;

    public zzezs(zzfbx zzfbxVar, zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzfbxVar;
        this.b = zzinvVar;
        this.c = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object zzb = ((zzfbx) this.a).zzb();
        Object obj = (zzexw) this.b.zzb();
        if (true == ((List) this.c.zzb()).contains("29")) {
            zzb = obj;
        }
        zzioe.a(zzb);
        return zzb;
    }
}
