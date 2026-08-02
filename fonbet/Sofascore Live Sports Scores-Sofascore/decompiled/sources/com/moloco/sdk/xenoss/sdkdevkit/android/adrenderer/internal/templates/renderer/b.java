package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.JavascriptInterface;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.dmi;
import defpackage.lnb;
import defpackage.mqi;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public final com.facebook.login.i a;

    public b(com.facebook.login.i iVar) {
        this.a = iVar;
    }

    @JavascriptInterface
    public final void log(@NotNull String str) {
        str.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateJavascript", str, null, false, 12, null);
    }

    @JavascriptInterface
    public final void onEvent(@NotNull String str) {
        List list;
        com.moloco.sdk.acm.h hVar;
        String str2;
        String str3;
        String str4;
        String str5;
        com.moloco.sdk.acm.h hVar2;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar;
        com.moloco.sdk.acm.h hVar3;
        String str6;
        str.getClass();
        com.facebook.login.i iVar = this.a;
        com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) iVar.c;
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        com.moloco.sdk.acm.h c = cVar.c("webview_event_handled_time_ms");
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString("event");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "CompositeEventHandler", dmi.q("Event received: ", string), false, 4, null);
        List list2 = (List) ((Map) ((mqi) iVar.d).getValue()).get(string);
        if (list2 == null || list2.isEmpty()) {
            MolocoLogger.error$default(molocoLogger, "CompositeEventHandler", dmi.q("Event not handled: ", string), null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_event_handled");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("result", "failure");
            dVar.a("reason", "no_handler");
            string.getClass();
            dVar.a("event", string);
            cVar.a(dVar);
            c.a("result", "failure");
            c.a("reason", "no_handler");
            c.a("event", string);
            cVar.b(c);
            return;
        }
        if (list2.size() > 1) {
            str2 = "webview_event_handled";
            list = list2;
            str3 = "reason";
            str5 = "result";
            hVar = c;
            str4 = "failure";
            MolocoLogger.warn$default(molocoLogger, "CompositeEventHandler", lnb.o("Found multiple event handlers for event: ", string, ", using first one"), null, false, 12, null);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("webview_event_multiple_handlers");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar2.a(str5, str4);
            string.getClass();
            dVar2.a("event", string);
            cVar.a(dVar2);
        } else {
            list = list2;
            hVar = c;
            str2 = "webview_event_handled";
            str3 = "reason";
            str4 = "failure";
            str5 = "result";
        }
        com.moloco.sdk.acm.h c2 = cVar.c("webview_event_handler_latency_ms");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) CollectionsKt.Y(list);
        try {
            aVar2.a(jSONObject);
            hVar2 = c2;
        } catch (Exception e) {
            e = e;
            hVar2 = c2;
        }
        try {
            aVar = aVar2;
            try {
                MolocoLogger.info$default(molocoLogger, "CompositeEventHandler", "Event handled: " + string, null, false, 12, null);
                string.getClass();
                hVar2.a("event", string);
                hVar2.a("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                hVar2.a(str5, "success");
                cVar.b(hVar2);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                str6 = str2;
                try {
                    com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d(str6);
                    dVar3.a(str5, "success");
                    dVar3.a("handler", aVar.b());
                    dVar3.a("event", string);
                    cVar.a(dVar3);
                    hVar3 = hVar;
                } catch (Exception e2) {
                    e = e2;
                    hVar3 = hVar;
                }
            } catch (Exception e3) {
                e = e3;
                hVar3 = hVar;
                str6 = str2;
                Exception exc = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", dmi.q("Event handling failed: ", string), exc, false, 8, null);
                string.getClass();
                hVar2.a("event", string);
                hVar2.a("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                String str7 = str3;
                hVar2.a(str7, exc.getClass().getSimpleName());
                hVar2.a(str5, str4);
                cVar.b(hVar2);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d(str6);
                dVar4.a(str5, str4);
                dVar4.a(str7, exc.getClass().getSimpleName());
                dVar4.a("handler", aVar.b());
                dVar4.a("event", string);
                cVar.a(dVar4);
                hVar3.a(str5, str4);
                hVar3.a(str7, exc.getClass().getSimpleName());
                hVar3.a("handler", aVar.b());
                hVar3.a("event", string);
                cVar.b(hVar3);
            }
            try {
                hVar3.a(str5, "success");
                hVar3.a("handler", aVar.b());
                hVar3.a("event", string);
                cVar.b(hVar3);
            } catch (Exception e4) {
                e = e4;
                Exception exc2 = e;
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", dmi.q("Event handling failed: ", string), exc2, false, 8, null);
                string.getClass();
                hVar2.a("event", string);
                hVar2.a("handler", aVar.b());
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr42 = com.moloco.sdk.internal.client_metrics_data.b.a;
                String str72 = str3;
                hVar2.a(str72, exc2.getClass().getSimpleName());
                hVar2.a(str5, str4);
                cVar.b(hVar2);
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr42 = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar42 = new com.moloco.sdk.acm.d(str6);
                dVar42.a(str5, str4);
                dVar42.a(str72, exc2.getClass().getSimpleName());
                dVar42.a("handler", aVar.b());
                dVar42.a("event", string);
                cVar.a(dVar42);
                hVar3.a(str5, str4);
                hVar3.a(str72, exc2.getClass().getSimpleName());
                hVar3.a("handler", aVar.b());
                hVar3.a("event", string);
                cVar.b(hVar3);
            }
        } catch (Exception e5) {
            e = e5;
            aVar = aVar2;
            hVar3 = hVar;
            str6 = str2;
            Exception exc22 = e;
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "CompositeEventHandler", dmi.q("Event handling failed: ", string), exc22, false, 8, null);
            string.getClass();
            hVar2.a("event", string);
            hVar2.a("handler", aVar.b());
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr422 = com.moloco.sdk.internal.client_metrics_data.b.a;
            String str722 = str3;
            hVar2.a(str722, exc22.getClass().getSimpleName());
            hVar2.a(str5, str4);
            cVar.b(hVar2);
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr422 = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar422 = new com.moloco.sdk.acm.d(str6);
            dVar422.a(str5, str4);
            dVar422.a(str722, exc22.getClass().getSimpleName());
            dVar422.a("handler", aVar.b());
            dVar422.a("event", string);
            cVar.a(dVar422);
            hVar3.a(str5, str4);
            hVar3.a(str722, exc22.getClass().getSimpleName());
            hVar3.a("handler", aVar.b());
            hVar3.a("event", string);
            cVar.b(hVar3);
        }
    }

    @JavascriptInterface
    @NotNull
    public final String sdkVersion() {
        return BuildConfig.SDK_VERSION_NAME;
    }
}
