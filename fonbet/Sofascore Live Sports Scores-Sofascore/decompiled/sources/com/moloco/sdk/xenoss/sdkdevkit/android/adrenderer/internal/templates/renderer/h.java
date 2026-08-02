package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.b98;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        j jVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", com.appsflyer.internal.i.j("Webview page pending error resolution: ", booleanValue), null, false, 12, null);
                if (!booleanValue) {
                    int i2 = j.s;
                    jVar.c();
                }
                break;
            default:
                Boolean bool = (Boolean) obj;
                boolean booleanValue2 = bool.booleanValue();
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", com.appsflyer.internal.i.j("Content loaded event received, isSuccess: ", booleanValue2), null, false, 12, null);
                fdi fdiVar = jVar.e;
                com.moloco.sdk.acm.recorder.c cVar = jVar.b;
                fdiVar.getClass();
                fdiVar.m(null, bool);
                g9i g9iVar = jVar.o;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_required_content_loaded");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar.a("result", booleanValue2 ? "success" : "failure");
                cVar.a(dVar);
                com.moloco.sdk.acm.h hVar = jVar.q;
                if (hVar != null) {
                    hVar.a("result", booleanValue2 ? "success" : "failure");
                    cVar.b(hVar);
                }
                if (booleanValue2) {
                    g9i g9iVar2 = jVar.l;
                    if (g9iVar2 != null) {
                        g9iVar2.e(null);
                    }
                    jVar.l = null;
                    jVar.k = 0;
                }
                break;
        }
        return Unit.a;
    }
}
