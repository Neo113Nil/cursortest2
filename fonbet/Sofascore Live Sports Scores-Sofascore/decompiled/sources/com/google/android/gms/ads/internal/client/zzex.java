package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzex {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzex(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    public final String zza() {
        return this.a;
    }

    public final String zzb() {
        String str = this.c;
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("request_id", "");
            } catch (JSONException unused) {
            }
        }
        return "";
    }

    public final Bundle zzc() {
        return this.b;
    }
}
