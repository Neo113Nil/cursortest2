package com.google.android.gms.internal.pal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgi implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!"flag_configuration".equals(str) || this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) zzgl.a(new zzis() { // from class: com.google.android.gms.internal.pal.zzgg
                @Override // com.google.android.gms.internal.pal.zzis
                public final Object zza() {
                    return zzgi.this.e.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }
}
