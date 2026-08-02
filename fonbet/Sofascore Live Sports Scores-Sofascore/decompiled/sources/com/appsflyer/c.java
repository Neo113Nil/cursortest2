package com.appsflyer;

import android.app.ActivityManager;
import android.os.Build;
import android.util.Base64;
import com.appsflyer.internal.AFc1dSDK;
import com.appsflyer.internal.AFc1qSDK;
import com.appsflyer.internal.AFg1uSDK;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.share.platform_extension.PluginInfo;
import com.facebook.c0;
import com.facebook.login.i;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.b0;
import com.moloco.sdk.internal.ilrd.k;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.m0;
import com.moloco.sdk.internal.ortb.model.H$a;
import com.moloco.sdk.internal.ortb.model.e1;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.o;
import com.moloco.sdk.internal.ortb.model.u;
import com.moloco.sdk.internal.ortb.model.w;
import com.moloco.sdk.internal.r;
import com.moloco.sdk.internal.s;
import com.moloco.sdk.internal.services.bidtoken.h;
import com.moloco.sdk.internal.services.bidtoken.providers.p;
import com.moloco.sdk.internal.services.bidtoken.providers.v;
import com.moloco.sdk.internal.services.bidtoken.t;
import com.moloco.sdk.internal.services.bidtoken.x;
import com.moloco.sdk.internal.services.g;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettingsImpl;
import com.moloco.sdk.service_locator.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f1;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.cga;
import defpackage.hi9;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.hz8;
import defpackage.ku3;
import defpackage.mqi;
import defpackage.ng2;
import defpackage.p2g;
import defpackage.rob;
import defpackage.s9a;
import defpackage.smi;
import defpackage.tz9;
import defpackage.u2g;
import defpackage.vh9;
import defpackage.w2g;
import defpackage.x7k;
import defpackage.y7k;
import defpackage.yea;
import defpackage.z45;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object u2gVar;
        Set unregisterClient;
        ExecutorService AFLogger;
        String init;
        ExecutorService unregisterClient2;
        SimpleDateFormat afDebugLog;
        PluginInfo AFKeystoreWrapper;
        int i = 0;
        switch (this.a) {
            case 0:
                unregisterClient = AFLogger.unregisterClient();
                return unregisterClient;
            case 1:
                AFLogger = AFLogger.AFLogger();
                return AFLogger;
            case 2:
                init = AFc1dSDK.init();
                return init;
            case 3:
                unregisterClient2 = AFc1qSDK.unregisterClient();
                return unregisterClient2;
            case 4:
                afDebugLog = AFg1uSDK.afDebugLog();
                return afDebugLog;
            case 5:
                AFKeystoreWrapper = AFj1lSDK.AFKeystoreWrapper();
                return AFKeystoreWrapper;
            case 6:
                vh9 vh9Var = com.moloco.sdk.acm.http.a.a;
                if (vh9Var == null) {
                    Intrinsics.i("httpClient");
                    throw null;
                }
                String str = com.moloco.sdk.acm.http.a.b;
                if (str != null) {
                    return new com.moloco.sdk.acm.http.e(vh9Var, str);
                }
                Intrinsics.i("apiUrl");
                throw null;
            case 7:
                return hi9.a(new com.appsflyer.internal.a(7));
            case 8:
                try {
                    p2g p2gVar = w2g.b;
                    hs4 hs4Var = z45.a;
                    u2gVar = s9a.c(rob.a);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                return (ku3) (u2gVar instanceof u2g ? null : u2gVar);
            case 9:
                return new m0(j.b());
            case 10:
                long j = r.c;
                x7k x7kVar = y7k.b;
                w.a aVar = e1.Companion;
                H$a h$a = o.Companion;
                l lVar = new l(j);
                w.a aVar2 = e1.Companion;
                H$a h$a2 = o.Companion;
                com.moloco.sdk.internal.ortb.model.f fVar = new com.moloco.sdk.internal.ortb.model.f(j);
                w.a aVar3 = e1.Companion;
                return new com.moloco.sdk.internal.ortb.model.d(lVar, lVar, fVar, new com.moloco.sdk.internal.ortb.model.b(j), new u());
            case 11:
                return new s(j.b());
            case 12:
                return new com.moloco.sdk.internal.ortb.d((yea) b0.a.getValue());
            case 13:
                return hz8.F("com.moloco.sdk.internal.ortb.model.VerticalAlignment", o.values(), new String[]{PlayerKt.E_SPORTS_TOP, TtmlNode.CENTER, "bottom"}, new Annotation[][]{null, null, null});
            case 14:
                return hz8.F("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", e1.values(), new String[]{"start", TtmlNode.CENTER, TtmlNode.END, "left", "right"}, new Annotation[][]{null, null, null, null, null});
            case 15:
                return new f0(new c(17), null, null);
            case 16:
                return new f0(new c(18), new c(19), new c(20));
            case 17:
                return Unit.a;
            case 18:
                return Unit.a;
            case 19:
                return Unit.a;
            case 20:
                return Unit.a;
            case 21:
                return cga.c(new com.appsflyer.internal.a(11));
            case 22:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
                vh9 a = hi9.a(new com.moloco.sdk.internal.http.a(com.moloco.sdk.service_locator.e.a().a(), com.moloco.sdk.service_locator.e.b().a(), i));
                com.moloco.sdk.internal.services.bidtoken.l lVar2 = new com.moloco.sdk.internal.services.bidtoken.l();
                String language = Locale.getDefault().getLanguage();
                language.getClass();
                Build.VERSION.RELEASE.getClass();
                String str2 = Build.MANUFACTURER;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = Build.MODEL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = Build.HARDWARE;
                c0 c0Var = new c0(a, lVar2, new h(language, str2, str3, str4 != null ? str4 : ""));
                smi o = tz9.o();
                hs4 hs4Var2 = z45.a;
                return new x(c0Var, s9a.c(kotlin.coroutines.e.d(o, hq4.c)), new i(new com.facebook.b(15), new com.moloco.sdk.internal.services.i()));
            case 23:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
                x xVar = (x) com.moloco.sdk.internal.services.bidtoken.a.a.getValue();
                com.moloco.sdk.internal.services.i b = com.moloco.sdk.service_locator.i.b();
                com.moloco.sdk.internal.services.s b2 = com.moloco.sdk.service_locator.e.b();
                mqi mqiVar = com.moloco.sdk.service_locator.e.d;
                com.moloco.sdk.internal.services.bidtoken.r rVar = new com.moloco.sdk.internal.services.bidtoken.r(b2, (g) mqiVar.getValue());
                n nVar = new n(3);
                v vVar = new v();
                vVar.a = Moloco.isInitialized();
                return new com.moloco.sdk.internal.services.bidtoken.o(xVar, new ng2(b, rVar, nVar, new com.moloco.sdk.internal.services.bidtoken.providers.l(kotlin.collections.b.j(vVar, new com.moloco.sdk.internal.services.bidtoken.providers.u(new t(new InternalMolocoPrivacySettingsImpl(f1.e(null)))), new com.moloco.sdk.internal.services.bidtoken.providers.r((ActivityManager) com.moloco.sdk.service_locator.i.e.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.e(f1.e(null)), new com.moloco.sdk.internal.services.bidtoken.providers.t((com.moloco.sdk.internal.services.c) j.b.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.i((com.moloco.sdk.internal.services.x) com.moloco.sdk.service_locator.e.f.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.c((com.moloco.sdk.internal.services.o) com.moloco.sdk.service_locator.i.c.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.n(com.moloco.sdk.service_locator.e.b(), (g) mqiVar.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.g((com.moloco.sdk.internal.services.w) com.moloco.sdk.service_locator.e.c.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.b((com.moloco.sdk.internal.services.l) com.moloco.sdk.service_locator.e.g.getValue()), new p(new c(24)), new com.moloco.sdk.internal.services.bidtoken.providers.x(f1.e(null))))));
            case 24:
                return ((k) com.moloco.sdk.service_locator.b.e.getValue()).b;
            case 25:
                byte[] decode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
                decode.getClass();
                return kotlin.text.c.k(decode);
            case 26:
                return kotlin.text.c.k(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
            case 27:
                return kotlin.text.c.k(new byte[]{65, 69, 83});
            default:
                byte[] decode2 = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
                decode2.getClass();
                return kotlin.text.c.k(decode2);
        }
    }
}
