package com.moloco.sdk.internal.error;

import com.facebook.internal.t;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.i;
import defpackage.fc6;
import java.util.LinkedHashMap;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public final com.moloco.sdk.internal.services.config.a a;
    public final t b;

    public b(com.moloco.sdk.internal.services.config.a aVar, t tVar) {
        aVar.getClass();
        this.a = aVar;
        this.b = tVar;
    }

    public final void a(String str, a aVar) {
        com.moloco.sdk.internal.services.config.a aVar2 = this.a;
        aVar2.getClass();
        LinkedHashMap linkedHashMap = aVar2.b;
        if (!linkedHashMap.containsKey("ReportSDKError")) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", "Error reporting is disabled. Tried to report error: ".concat(str), null, false, 12, null);
            return;
        }
        String str2 = (String) linkedHashMap.get("ReportSDKError");
        if (str2 == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "ErrorReportingServiceImpl", "Error reporting is enabled but with invalid url", null, false, 12, null);
            return;
        }
        t tVar = this.b;
        ((i) tVar.b).getClass();
        String r = c.r(c.r(str2, "[ERROR_CODE]", str, false), "[HAPPENED_AT_TS]", String.valueOf(System.currentTimeMillis()), false);
        String str3 = aVar.a;
        if (str3 != null) {
            r = c.r(r, "[MTID]", str3, false);
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ErrorReportingApi", fc6.n("Reporting error: ", str, " to url: ", r), null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) tVar.c;
        cVar.getClass();
        cVar.a.a(r);
    }
}
