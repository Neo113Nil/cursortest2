package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcsw implements zzcsm {
    public final zzedp a;

    public zzcsw(zzedp zzedpVar) {
        this.a = zzedpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final void a(JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.La)).booleanValue()) {
            zzedp zzedpVar = this.a;
            synchronized (zzedpVar) {
                zzedpVar.p = jSONObject;
            }
        }
    }
}
