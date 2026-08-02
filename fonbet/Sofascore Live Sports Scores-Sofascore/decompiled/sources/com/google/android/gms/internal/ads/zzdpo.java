package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpo implements zzinw {
    public final zzdpq a;

    public zzdpo(zzdpq zzdpqVar) {
        this.a = zzdpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzdqv zzdqvVar = (zzdqv) this.a.a.zzb();
        zzioe.a(zzdqvVar);
        JSONObject jSONObject = zzdqvVar.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(zzdqvVar.a.z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
