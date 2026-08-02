package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class a {
    public InneractiveAdSpot a;
    public boolean c;
    public boolean b = false;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    public final void a(boolean z) {
        this.c = z;
        boolean z2 = this.b;
        String str = CampaignEx.JSON_NATIVE_VIDEO_CLOSE;
        if (z2) {
            if (z) {
                str = FreeSpaceBox.TYPE;
            }
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", str);
        } else {
            if (z) {
                str = FreeSpaceBox.TYPE;
            }
            IAlog.a("%s%s timer started", "AdExperienceLatency: ", str);
            this.d = System.currentTimeMillis();
            this.b = true;
        }
    }

    public final void a() {
        if (!this.b || this.e <= 0) {
            return;
        }
        this.f += System.currentTimeMillis() - this.e;
        this.e = 0L;
    }

    public final void a(String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (!this.b || this.c) {
            return;
        }
        String a = c0.a(System.currentTimeMillis(), this.d, this.f);
        InneractiveAdSpot inneractiveAdSpot = this.a;
        com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
        InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.a : null;
        com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.b : null;
        JSONArray b = (adContent == null || (rVar = adContent.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("close_action_latency", a);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "close_action_latency", a);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("origin", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.b = false;
    }
}
