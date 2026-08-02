package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.dmi;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.w9h;
import defpackage.xw3;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {
    public final /* synthetic */ int a;
    public final ad2 b;
    public final aeh c;
    public final aeh d;

    public f(int i, ad2 ad2Var) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ad2Var;
                aeh b = beh.b(1, 0, null, 6);
                this.c = b;
                this.d = b;
                break;
            default:
                this.b = ad2Var;
                aeh b2 = beh.b(0, 0, null, 7);
                this.c = b2;
                this.d = b2;
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        e eVar;
        int i = this.a;
        int i2 = 0;
        rq3 rq3Var = null;
        ad2 ad2Var = this.b;
        switch (i) {
            case 0:
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", jSONObject + " displaying.", false, 4, null);
                if (!Intrinsics.c(jSONObject.getString("event"), CollectionsKt.X(w9h.b("playlistItemDisplaying")))) {
                    MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    String string = jSONObject.getString("creativeType");
                    com.facebook.b bVar = e.b;
                    string.getClass();
                    bVar.getClass();
                    e[] values = e.values();
                    int length = values.length;
                    while (true) {
                        if (i2 < length) {
                            e eVar2 = values[i2];
                            if (eVar2.a.equals(string)) {
                                eVar = eVar2;
                            } else {
                                i2++;
                            }
                        } else {
                            eVar = null;
                        }
                    }
                    MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", eVar + " displaying.", false, 4, null);
                    if (eVar != null) {
                        xw3.L(ad2Var, null, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a(this, eVar, rq3Var, 4), 3);
                        break;
                    }
                }
                break;
            default:
                String string2 = jSONObject.getString("event");
                if (!Intrinsics.c(string2, "requiredContentLoaded")) {
                    if (!Intrinsics.c(string2, "requiredContentError")) {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RequiredContentEventHandler", dmi.q("Event not handled: ", string2), false, 4, null);
                        Unit unit = Unit.a;
                        break;
                    } else {
                        xw3.L(ad2Var, null, null, new g(this, rq3Var, 1), 3);
                        break;
                    }
                } else {
                    xw3.L(ad2Var, null, null, new g(this, rq3Var, i2), 3);
                    break;
                }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.a) {
            case 0:
                return "PlayListItemDisplayingEventHandler";
            default:
                return "RequiredContentEventHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.a) {
            case 0:
                return w9h.b("playlistItemDisplaying");
            default:
                return ph0.a0(new String[]{"requiredContentLoaded", "requiredContentError"});
        }
    }
}
