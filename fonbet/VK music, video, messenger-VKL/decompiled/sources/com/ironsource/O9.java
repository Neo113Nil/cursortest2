package com.ironsource;

import android.content.Context;
import com.ironsource.X;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import java.util.ArrayList;
import org.json.JSONObject;
import xsna.ir40;
import xsna.lap;
import xsna.rl3;

/* loaded from: classes13.dex */
public final class O9 {
    public static final O9 a = new O9();
    private static final C4368i9 b = new C4368i9();

    private O9() {
    }

    public final void b(boolean z) {
        a(z);
        new C4478oc().a(z);
    }

    public static final class b implements InterfaceC4569te {
        final /* synthetic */ Context a;
        final /* synthetic */ C4328g5 b;
        final /* synthetic */ InitListener c;

        public b(Context context, C4328g5 c4328g5, InitListener initListener) {
            this.a = context;
            this.b = c4328g5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4462ne c4462ne) {
            O9.a.a(this.a, c4462ne.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC4569te
        public void a(C4498pe c4498pe, C4278d9 c4278d9) {
            O9.a.a(this.c, this.b, c4498pe);
        }
    }

    public final void a(Context context, InitRequest initRequest, InitListener initListener) {
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new lap(initRequest, context, initListener, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initListener) {
        C4328g5 c4328g5 = new C4328g5();
        Ce.a.c(context, new C4605ve(initRequest.getAppKey(), null, rl3.w0(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4328g5, initListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Ve ve, C4328g5 c4328g5, InitListener initListener) {
        String o = com.ironsource.mediationsdk.p.h().o();
        Y8 g = ve.g();
        g.a(new X.a(ve.l().b("IronSource").getInterstitialSettings(), Kb.u.d().h()));
        g.a(ConfigFile.getConfigFile().getPluginType());
        g.b(o);
        new Z(new C4514qc()).a(context, g, new a());
        a(ve, c4328g5, initListener);
    }

    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(IronSourceError ironSourceError) {
        }
    }

    private final void a(Ve ve, C4328g5 c4328g5, InitListener initListener) {
        L1 e;
        C1 b2 = ve.c().b();
        new Lb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        String o = com.ironsource.mediationsdk.p.h().o();
        C4388jc a2 = C4388jc.e.a();
        a2.a(ve.l());
        a2.a(ve.c());
        a2.a(o);
        a2.g();
        long a3 = C4328g5.a(c4328g5);
        C4368i9 c4368i9 = b;
        c4368i9.a(a3, ve.i());
        c4368i9.b(new xsna.j0(initListener, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InitListener initListener, C4328g5 c4328g5, C4498pe c4498pe) {
        long a2 = C4328g5.a(c4328g5);
        C4368i9 c4368i9 = b;
        C4498pe b2 = c4368i9.b(c4498pe);
        c4368i9.a(b2, a2);
        c4368i9.b(new ir40(c4498pe, initListener, b2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4498pe c4498pe, InitListener initListener, C4498pe c4498pe2) {
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + c4498pe);
        if (initListener != null) {
            initListener.onInitFailed(b.a(c4498pe2));
        }
    }

    private final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Kb.u.d().q().a(new C4632x5(EnumC4650y5.CONSENT_IADS, jSONObject));
    }

    public final void a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        com.ironsource.mediationsdk.p.h().a(str, arrayList);
    }
}
