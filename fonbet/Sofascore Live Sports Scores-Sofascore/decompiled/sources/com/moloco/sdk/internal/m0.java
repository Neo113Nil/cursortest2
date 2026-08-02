package com.moloco.sdk.internal;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m0 {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k a;

    public m0(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar) {
        kVar.getClass();
        this.a = kVar;
    }

    public final boolean a(String str, long j, d0 d0Var) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar;
        str.getClass();
        if (d0Var != null) {
            try {
                cVar = d0Var.b;
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "SdkEventUrlTrackerImpl", e.toString(), null, false, 12, null);
                return false;
            }
        } else {
            cVar = null;
        }
        if (cVar != null) {
            String a = cVar.a();
            a.getClass();
            str = kotlin.text.c.r(str, "[ERROR_CODE]", a, false);
        }
        Uri build = Uri.parse(kotlin.text.c.r(str, "[HAPPENED_AT_TS]", String.valueOf(j), false)).buildUpon().build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k kVar = this.a;
        String uri = build.toString();
        uri.getClass();
        kVar.a(uri);
        return true;
    }
}
