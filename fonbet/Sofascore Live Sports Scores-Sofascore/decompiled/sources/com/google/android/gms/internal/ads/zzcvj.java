package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvj implements zzinw {
    public final zzczc a;

    public zzcvj(zzczc zzczcVar) {
        this.a = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(this.a.a().z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
