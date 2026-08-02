package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdqy implements zzinw {
    public final zzczc a;
    public final zzdpp b;

    public zzdqy(zzczc zzczcVar, zzdpp zzdppVar) {
        this.a = zzczcVar;
        this.b = zzdppVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfld a = this.a.a();
        JSONObject jSONObject = this.b.a.a;
        zzioe.a(jSONObject);
        return new zzdqv(a, jSONObject);
    }
}
