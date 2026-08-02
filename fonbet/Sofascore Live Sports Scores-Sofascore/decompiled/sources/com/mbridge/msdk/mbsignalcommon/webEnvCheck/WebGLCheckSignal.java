package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import com.mbridge.msdk.foundation.controller.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class WebGLCheckSignal extends BaseWebGLCheckSignal {
    public static final /* synthetic */ int g = 0;

    public void webglState(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            c.n().c(jSONObject.optInt("webgl"));
            c.n().a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
