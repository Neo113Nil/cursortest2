package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.lo;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface vj {
    public static final sf<JSONObject> pcc = new sf<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vj.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public JSONObject sf(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e) {
                lo.pcc("ISettingsDataRepository", "", e);
                return null;
            }
        }
    };
    public static final sf<Set<String>> sf = new sf<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.vj.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.vj.sf
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public Set<String> sf(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                return hashSet;
            } catch (Exception e) {
                lo.pcc("ISettingsDataRepository", "", e);
                return hashSet;
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        pcc pcc(String str);

        pcc pcc(String str, float f);

        pcc pcc(String str, int i);

        pcc pcc(String str, long j);

        pcc pcc(String str, String str2);

        pcc pcc(String str, boolean z);

        void pcc();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf<T> {
        T sf(String str);
    }

    void pcc(JSONObject jSONObject);
}
