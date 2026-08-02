package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.sxb;
import defpackage.txb;
import defpackage.uuf;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class l0 {
    public static final Regex a = new Regex("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", uuf.IGNORE_CASE);

    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a(String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar;
        String str2;
        str.getClass();
        txb b = a.b(str);
        if (b == null || (str2 = (String) ((sxb) b.a()).get(1)) == null) {
            mVar = null;
        } else if (kotlin.text.c.v(str2, "video", true)) {
            mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.d;
        } else if (str2.equalsIgnoreCase(CampaignEx.JSON_KEY_MRAID)) {
            mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.e;
        } else if (str2.equalsIgnoreCase("static")) {
            mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.f;
        } else {
            com.moloco.sdk.acm.recorder.b.Companion.getClass();
            com.moloco.sdk.acm.recorder.c b2 = com.moloco.sdk.acm.recorder.a.b();
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("unknown_creative_type");
            dVar.a("template_name", str2);
            b2.a(dVar);
            mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.f;
        }
        return mVar == null ? StringsKt.J(str, "<VAST", true) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a : StringsKt.J(str, "mraid.js", true) ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.b : com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.c : mVar;
    }
}
