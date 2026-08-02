package com.ironsource;

import android.content.Context;
import com.ironsource.Ve;
import com.ironsource.X;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N9 {
    public static final N9 a = new N9();
    private static final C2454h9 b = new C2454h9();

    public static final class a implements InitListener {
        a() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    private N9() {
    }

    public final void b(boolean z) {
        a(z);
        new C2564nc().a(z);
    }

    public static final class b implements InterfaceC2673te {
        final /* synthetic */ Context a;
        final /* synthetic */ C2432g5 b;
        final /* synthetic */ InitListener c;

        b(Context context, C2432g5 c2432g5, InitListener initListener) {
            this.a = context;
            this.b = c2432g5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(C2566ne sdkConfig) {
            Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
            N9.a.a(this.a, sdkConfig.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC2673te
        public void a(C2602pe error, C2364c9 c2364c9) {
            Intrinsics.checkNotNullParameter(error, "error");
            N9.a.a(this.c, this.b, error);
        }
    }

    public final void a(final Context context, final InitRequest initRequest, final InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(InitRequest.this, context, initializationListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(initRequest, "$initRequest");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(initializationListener, "$initializationListener");
        C2432g5 c2432g5 = new C2432g5();
        Ce.a.c(context, new C2709ve(initRequest.getAppKey(), null, ArraysKt.toMutableList(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c2432g5, initializationListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ve ve, C2432g5 c2432g5, InitListener initListener) {
        String o = com.ironsource.mediationsdk.p.h().o();
        X8 g = ve.g();
        Intrinsics.checkNotNullExpressionValue(g, "serverResponse.initialConfiguration");
        NetworkSettings b2 = ve.l().b("IronSource");
        Intrinsics.checkNotNullExpressionValue(b2, "serverResponse.providerS…s.IRONSOURCE_CONFIG_NAME)");
        JSONObject interstitialSettings = b2.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "networkSettings.interstitialSettings");
        g.a(new X.a(interstitialSettings, Jb.u.d().h()));
        g.a(ConfigFile.getConfigFile().getPluginType());
        g.b(o);
        new Z(new C2600pc()).a(context, g, new a());
        a(ve, c2432g5, initListener);
    }

    private final void a(Ve ve, C2432g5 c2432g5, final InitListener initListener) {
        L1 e;
        C1 b2 = ve.c().b();
        new Kb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        String sessionId = com.ironsource.mediationsdk.p.h().o();
        C2475ic a2 = C2475ic.e.a();
        a2.a(ve.l());
        a2.a(ve.c());
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        a2.a(sessionId);
        a2.g();
        long a3 = C2432g5.a(c2432g5);
        C2454h9 c2454h9 = b;
        Ve.a i = ve.i();
        Intrinsics.checkNotNullExpressionValue(i, "serverResponse.origin");
        c2454h9.a(a3, i);
        c2454h9.b(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(InitListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final InitListener initListener, C2432g5 c2432g5, final C2602pe c2602pe) {
        long a2 = C2432g5.a(c2432g5);
        C2454h9 c2454h9 = b;
        final C2602pe b2 = c2454h9.b(c2602pe);
        c2454h9.a(b2, a2);
        c2454h9.b(new Runnable() { // from class: com.ironsource.N9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                N9.a(C2602pe.this, initListener, b2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2602pe error, InitListener initListener, C2602pe eventError) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(eventError, "$eventError");
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + error);
        if (initListener != null) {
            initListener.onInitFailed(b.a(eventError));
        }
    }

    private final void a(boolean z) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Jb.u.d().q().a(new C2736x5(EnumC2754y5.CONSENT_IADS, jsonObjectInit));
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(value);
        com.ironsource.mediationsdk.p.h().a(key, arrayList);
    }
}
