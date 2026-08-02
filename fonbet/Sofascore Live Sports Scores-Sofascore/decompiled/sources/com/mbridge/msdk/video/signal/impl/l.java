package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import defpackage.is8;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class l extends d {
    public boolean s = true;

    private com.mbridge.msdk.click.a q() {
        com.mbridge.msdk.click.a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.click.a aVar2 = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.j);
        this.l = aVar2;
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(CampaignEx campaignEx, Context context) {
        int i;
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.m);
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(queryParameter)) {
            i = Integer.parseInt(queryParameter);
            this.m.a(i == 2);
            q().a(this.m);
            q().a(campaignEx);
            com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        i = 0;
        this.m.a(i == 2);
        q().a(this.m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }

    public void b(JSONObject jSONObject) {
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(U3.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e) {
            is8.h(e);
        }
    }
}
