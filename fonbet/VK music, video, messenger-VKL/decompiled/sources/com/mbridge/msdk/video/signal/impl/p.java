package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JSRewardVideoV1Diff.java */
/* loaded from: classes14.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put("device", new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
