package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedw implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final JSONObject a = new JSONObject();
    public List b;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null && this.b.contains(str)) {
            try {
                Object obj = sharedPreferences.getAll().get(str);
                JSONObject jSONObject = this.a;
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzt.zzh().e("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e);
            }
        }
    }
}
