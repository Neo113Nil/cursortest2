package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x {
    public final JSONObject a = new JSONObject();

    public final x a(Object obj, String str) {
        try {
            this.a.put(str, obj);
            return this;
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", str, obj);
            return this;
        }
    }
}
