package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.z;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.dmi;
import defpackage.w9h;
import defpackage.xw3;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public final z a;
    public final ad2 b;
    public final aeh c;
    public final aeh d;

    public b(z zVar, ad2 ad2Var) {
        this.a = zVar;
        this.b = ad2Var;
        aeh b = beh.b(0, 0, null, 7);
        this.c = b;
        this.d = b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        if (Intrinsics.c(jSONObject.getString("event"), CollectionsKt.X(w9h.b("clickthrough")))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughEventHandler", dmi.q("Ad clicked on ", jSONObject.getString("contentType")), false, 4, null);
            xw3.L(this.b, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, jSONObject.getString("url"), null, 3), 3);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        return "ClickthroughEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        return w9h.b("clickthrough");
    }
}
