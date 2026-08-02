package com.google.android.gms.ads.internal.util.client;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzv {
    public final zzx a;

    public zzv() {
        this.a = new zzn(1, 0, 1.0d, false);
    }

    public static zzv zzb(@Nullable JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new zzv(optJSONObject == null ? new zzn(1, 0, 1.0d, false) : new zzn(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final zzx zza() {
        return this.a;
    }

    public zzv(zzx zzxVar) {
        this.a = zzxVar;
    }
}
