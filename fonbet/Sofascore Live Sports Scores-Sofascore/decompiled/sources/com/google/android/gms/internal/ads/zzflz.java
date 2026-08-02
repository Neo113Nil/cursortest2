package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzflz {
    public final JSONObject a;

    public zzflz(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final int a() {
        int optInt = this.a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
