package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.facebook.c0;
import com.ironsource.U3;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import defpackage.a70;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.w9h;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) obj;
                String string = jSONObject.getString("event");
                String string2 = jSONObject.getString("metricName");
                String string3 = jSONObject.getString("type");
                JSONObject optJSONObject = jSONObject.optJSONObject("tags");
                String string4 = jSONObject.getString(U3.i.X);
                if (!Intrinsics.c(string3, "counter")) {
                    if (!Intrinsics.c(string3, "timer")) {
                        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ACMHandler", dmi.q("Unknown event type: ", string), null, false, 12, null);
                        break;
                    } else {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ACMHandler", fc6.n("Timer metric recorded: ", string2, " = ", string4), false, 4, null);
                        com.moloco.sdk.acm.g gVar = h.Companion;
                        string2.getClass();
                        gVar.getClass();
                        h hVar = new h(string2, new c0(new com.facebook.b(14)));
                        string4.getClass();
                        long parseLong = Long.parseLong(string4);
                        if (parseLong < 0) {
                            a70.p("Count cannot be negative");
                            break;
                        } else {
                            hVar.b = parseLong;
                            if (optJSONObject != null) {
                                Iterator<String> keys = optJSONObject.keys();
                                keys.getClass();
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    next.getClass();
                                    String string5 = optJSONObject.getString(next);
                                    string5.getClass();
                                    hVar.a(next, string5);
                                }
                            }
                            cVar.b(hVar);
                            break;
                        }
                    }
                } else {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ACMHandler", fc6.n("Count metric recorded: ", string2, " = ", string4), false, 4, null);
                    string2.getClass();
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(string2);
                    string4.getClass();
                    int parseInt = Integer.parseInt(string4);
                    if (parseInt < 0) {
                        a70.p("Count cannot be negative");
                        break;
                    } else {
                        dVar.c = parseInt;
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            keys2.getClass();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                next2.getClass();
                                String string6 = optJSONObject.getString(next2);
                                string6.getClass();
                                dVar.a(next2, string6);
                            }
                        }
                        cVar.a(dVar);
                        break;
                    }
                }
            default:
                String string7 = jSONObject.getString("url");
                string7.getClass();
                ((t0) obj).a(string7);
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.a) {
            case 0:
                return "ACMHandler";
            default:
                return "LaunchUrlHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.a) {
            case 0:
                return w9h.b("metric");
            default:
                return w9h.b("launchUrl");
        }
    }
}
