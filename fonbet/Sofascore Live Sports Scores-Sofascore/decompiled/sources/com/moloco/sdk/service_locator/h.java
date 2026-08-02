package com.moloco.sdk.service_locator;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.d0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aeh;
import defpackage.hi9;
import defpackage.k13;
import defpackage.sub;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ h(com.moloco.sdk.xenoss.sdkdevkit.android.core.b bVar) {
        this.a = 28;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVar;
        int i = 19;
        int i2 = 0;
        switch (this.a) {
            case 0:
                Object systemService = f1.e(null).getSystemService("activity");
                systemService.getClass();
                return (ActivityManager) systemService;
            case 1:
                return hi9.a(new com.moloco.sdk.internal.http.a(e.a().a(), e.b().a(), i2));
            case 2:
                return new com.moloco.sdk.internal.services.c(f1.e(null), e.b());
            case 3:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l(f1.e(null));
            case 4:
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) j.c.getValue();
                lVar.getClass();
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k(lVar);
            case 5:
                SharedPreferences sharedPreferences = f1.e(null).getSharedPreferences("moloco_sdk_preferences", 0);
                sharedPreferences.getClass();
                return new com.moloco.sdk.internal.services.e(sharedPreferences);
            case 6:
                return new com.moloco.sdk.internal.services.usertracker.a((com.moloco.sdk.internal.services.e) k.a.getValue());
            case 7:
                return new com.moloco.sdk.internal.services.usertracker.c(new com.facebook.b(i), (com.moloco.sdk.internal.services.usertracker.a) l.a.getValue());
            case 8:
                com.moloco.sdk.internal.services.events.e eVar2 = new com.moloco.sdk.internal.services.events.e();
                eVar2.a = com.moloco.sdk.internal.services.events.f.a;
                return eVar2;
            case 9:
                aeh aehVar = MraidActivity.h;
                return l.a();
            case 10:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "MraidActivity", "Skip button shown in MraidActivity", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.f.j.invoke();
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                Function0 function0 = StaticAdActivity.g;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            case 15:
                List j = kotlin.collections.b.j(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.e, z.f, x.f, y.f, a0.f, b0.f, c0.f, d0.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.j.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.d.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.e.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c.f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f.f, t.f, u.f, m.e, w.e, n.f, o.f, p.f);
                int c = sub.c(k13.r(j, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(c >= 16 ? c : 16);
                for (Object obj : j) {
                    linkedHashMap.put(((s) obj).a(), obj);
                }
                return linkedHashMap;
            case 16:
                return Unit.a;
            case 17:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z();
            case 18:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1(j.b());
            case 19:
                return androidx.compose.runtime.e.f(Boolean.TRUE);
            case 20:
                return androidx.compose.runtime.e.f(Boolean.TRUE);
            case 21:
                return Unit.a;
            case 22:
                return androidx.compose.runtime.e.f(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            case 23:
                return Unit.a;
            case 24:
                return Unit.a;
            case 25:
                return Unit.a;
            case 26:
                return Unit.a;
            case 27:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.b();
            case 28:
                try {
                    String property = System.getProperty("http.agent");
                    return property != null ? StringsKt.R(property) ? "" : property : "";
                } catch (Exception e) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebBrowserUserAgentService", e.toString(), null, false, 12, null);
                    return "";
                }
            default:
                try {
                    eVar = j.b();
                } catch (Exception e2) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e2, false, 8, null);
                    eVar = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.j.a.getValue();
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c(eVar);
        }
    }

    public /* synthetic */ h(int i) {
        this.a = i;
    }
}
