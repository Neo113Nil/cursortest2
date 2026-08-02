package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k;
import defpackage.ad2;
import defpackage.dmi;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.pdk;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.t53;
import defpackage.up3;
import defpackage.xw3;
import defpackage.yqo;
import defpackage.z45;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public final k a;
    public final ad2 b;

    public d(k kVar) {
        kVar.getClass();
        this.a = kVar;
        hs4 hs4Var = z45.a;
        this.b = s9a.c(hq4.c);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        String string = jSONObject.getString("event");
        boolean c = Intrinsics.c(string, "sendGet");
        rq3 rq3Var = null;
        ad2 ad2Var = this.b;
        if (c) {
            String string2 = jSONObject.getString("url");
            string2.getClass();
            xw3.L(ad2Var, null, null, new pdk(this, string2, rq3Var, 25), 3);
        } else {
            if (!Intrinsics.c(string, "sendPost")) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpEventHandler", dmi.q("Unsupported event type: ", string), null, false, 12, null);
                Unit unit = Unit.a;
                return;
            }
            String string3 = jSONObject.getString("url");
            String string4 = jSONObject.getString("body");
            String optString = jSONObject.optString("contentType", up3.e.toString());
            optString.getClass();
            up3 G = yqo.G(optString);
            string3.getClass();
            string4.getClass();
            xw3.L(ad2Var, null, null, new t53(string4, this, string3, G, null, 15), 3);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        return "HttpEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        return ph0.a0(new String[]{"sendGet", "sendPost"});
    }
}
