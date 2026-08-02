package com.mbridge.msdk.video.signal.impl;

import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.t;
import defpackage.is8;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(U3.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e) {
            is8.h(e);
        }
    }
}
