package com.fyber.inneractive.sdk.config.remote;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.Track;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f {
    public Set a = null;

    public static f a(JSONObject jSONObject) {
        Track fromValue;
        f fVar = null;
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("track");
        if (optJSONArray != null) {
            fVar = new f();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString) && (fromValue = Track.fromValue(optString)) != null) {
                    linkedHashSet.add(fromValue);
                }
            }
            fVar.a = linkedHashSet;
        }
        return fVar;
    }
}
