package com.moloco.sdk.internal.unity_bridge;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.internal.t;
import com.moloco.sdk.internal.publisher.g1;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.internal.services.bidtoken.k;
import com.moloco.sdk.internal.services.events.e;
import com.moloco.sdk.internal.services.g;
import com.moloco.sdk.internal.services.init.n;
import com.moloco.sdk.internal.services.init.p;
import com.moloco.sdk.internal.services.j;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.internal.unity_bridge.internal.f;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.service_locator.c;
import com.moloco.sdk.service_locator.i;
import com.moloco.sdk.service_locator.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d;
import defpackage.b8f;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.z45;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context_delegate$lambda$0;
        f adManager_delegate$lambda$1;
        g1 initializationHandler_delegate$lambda$7;
        k bidTokenHandler_delegate$lambda$8;
        s adCreator_delegate$lambda$9;
        ku3 scope_delegate$lambda$10;
        switch (this.a) {
            case 0:
                context_delegate$lambda$0 = MolocoUnityPlugin.context_delegate$lambda$0();
                return context_delegate$lambda$0;
            case 1:
                adManager_delegate$lambda$1 = MolocoUnityPlugin.adManager_delegate$lambda$1();
                return adManager_delegate$lambda$1;
            case 2:
                initializationHandler_delegate$lambda$7 = Moloco.initializationHandler_delegate$lambda$7();
                return initializationHandler_delegate$lambda$7;
            case 3:
                bidTokenHandler_delegate$lambda$8 = Moloco.bidTokenHandler_delegate$lambda$8();
                return bidTokenHandler_delegate$lambda$8;
            case 4:
                adCreator_delegate$lambda$9 = Moloco.adCreator_delegate$lambda$9();
                return adCreator_delegate$lambda$9;
            case 5:
                scope_delegate$lambda$10 = Moloco.scope_delegate$lambda$10();
                return scope_delegate$lambda$10;
            case 6:
                Context e = f1.e(null);
                com.moloco.sdk.acm.recorder.b.Companion.getClass();
                return new j(e, com.moloco.sdk.acm.recorder.a.b());
            case 7:
                return new com.moloco.sdk.internal.services.analytics.a(com.moloco.sdk.service_locator.j.b(), l.a(), (e) l.c.getValue());
            case 8:
                return new com.moloco.sdk.internal.services.k((com.moloco.sdk.internal.services.analytics.a) com.moloco.sdk.service_locator.b.a.getValue(), i.b());
            case 9:
                return new r(b8f.i.f, (com.moloco.sdk.internal.services.k) com.moloco.sdk.service_locator.b.b.getValue());
            case 10:
                return new com.moloco.sdk.internal.error.b((com.moloco.sdk.internal.services.config.a) c.a.getValue(), new t(i.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) d.a.getValue()));
            case 11:
                return new com.moloco.sdk.internal.ilrd.k(f1.e(null));
            case 12:
                return new com.moloco.sdk.internal.services.config.a();
            case 13:
                List c = kotlin.collections.a.c(new com.moloco.sdk.internal.error.crash.filters.a());
                t tVar = new t(i.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) d.a.getValue());
                com.moloco.sdk.acm.recorder.b.Companion.getClass();
                return new com.moloco.sdk.internal.error.crash.b(new t(c, tVar, com.moloco.sdk.acm.recorder.a.b()));
            case 14:
                return new u(f1.e(null));
            case 15:
                return new com.moloco.sdk.internal.services.s(f1.e(null));
            case 16:
                return new w(f1.e(null));
            case 17:
                return new g(f1.e(null));
            case 18:
                return new b0(f1.e(null));
            case 19:
                return new x(f1.e(null));
            case 20:
                return new com.moloco.sdk.internal.services.l(f1.e(null));
            case 21:
                return new p((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) d.a.getValue());
            case 22:
                return new com.moloco.sdk.internal.services.init.e(com.moloco.sdk.service_locator.e.b(), com.moloco.sdk.service_locator.e.a(), (com.moloco.sdk.internal.services.usertracker.c) l.b.getValue(), com.moloco.sdk.service_locator.j.a());
            case 23:
                com.moloco.sdk.internal.services.init.e eVar = (com.moloco.sdk.internal.services.init.e) com.moloco.sdk.service_locator.f.d.getValue();
                SharedPreferences sharedPreferences = f1.e(null).getSharedPreferences("moloco_sdk_init_cache", 0);
                sharedPreferences.getClass();
                hs4 hs4Var = z45.a;
                hq4 hq4Var = hq4.c;
                return new n(eVar, new com.moloco.sdk.internal.services.init.g(sharedPreferences, hq4Var), s9a.c(hq4Var.plus(tz9.o())));
            case 24:
                return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k) ((com.moloco.sdk.internal.services.config.a) c.a.getValue()).a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k.class, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l.a);
            case 25:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.k b = com.moloco.sdk.service_locator.g.b();
                mqi mqiVar = com.moloco.sdk.service_locator.e.e;
                return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j(com.moloco.sdk.service_locator.g.b(), new com.facebook.login.i((b0) mqiVar.getValue(), com.moloco.sdk.service_locator.b.b(), com.moloco.sdk.service_locator.j.a()), new com.moloco.sdk.internal.publisher.nativead.n(b, (b0) mqiVar.getValue(), com.moloco.sdk.service_locator.b.b(), com.moloco.sdk.service_locator.j.a()), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e(f1.e(null), 0));
            case 26:
                return new com.moloco.sdk.internal.services.i();
            case 27:
                return new com.moloco.sdk.internal.services.proto.a();
            case 28:
                return new com.moloco.sdk.internal.services.p(f1.e(null));
            default:
                return new com.moloco.sdk.internal.d();
        }
    }
}
