package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeov implements zzems {
    public final zzdya a;

    public zzeov(zzdya zzdyaVar) {
        this.a = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt a(String str, JSONObject jSONObject) {
        return new zzemt(this.a.a(str, jSONObject), new zzeof(), str);
    }
}
