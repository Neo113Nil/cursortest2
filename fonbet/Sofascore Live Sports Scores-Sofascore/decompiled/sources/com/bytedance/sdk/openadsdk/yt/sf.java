package com.bytedance.sdk.openadsdk.yt;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface sf {
    public static final pcc<JSONObject> pcc = new pcc<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.yt.sf.1
        @Override // com.bytedance.sdk.openadsdk.yt.sf.pcc
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public JSONObject sf(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc<T> {
        T sf(String str);
    }
}
