package com.ironsource;

import android.content.Context;
import com.ironsource.Te;
import com.ironsource.X;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.InitListener;
import com.unity3d.ironsourceads.InitRequest;
import defpackage.kdc;
import defpackage.ph0;
import defpackage.yp8;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N9 {

    @NotNull
    public static final N9 a = new N9();

    @NotNull
    private static final C4127i9 b = new C4127i9();

    private N9() {
    }

    private final void a(Te te, C4051e5 c4051e5, InitListener initListener) {
        J1 e;
        A1 b2 = te.c().b();
        new Jb().a((b2 == null || (e = b2.e()) == null) ? null : e.b(), true);
        String n = com.ironsource.mediationsdk.p.g().n();
        C4130ic a2 = C4130ic.e.a();
        a2.a(te.l());
        a2.a(te.c());
        n.getClass();
        a2.a(n);
        a2.g();
        long a3 = C4051e5.a(c4051e5);
        C4127i9 c4127i9 = b;
        Te.a i = te.i();
        i.getClass();
        c4127i9.a(a3, i);
        c4127i9.b(new yp8(initListener, 20));
    }

    public final void b(boolean z) {
        a(z);
        new C4219nc().a(z);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InitListener {
        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitFailed(@NotNull IronSourceError ironSourceError) {
            ironSourceError.getClass();
        }

        @Override // com.unity3d.ironsourceads.InitListener
        public void onInitSuccess() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements InterfaceC4292re {
        final /* synthetic */ Context a;
        final /* synthetic */ C4051e5 b;
        final /* synthetic */ InitListener c;

        public b(Context context, C4051e5 c4051e5, InitListener initListener) {
            this.a = context;
            this.b = c4051e5;
            this.c = initListener;
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4185le c4185le) {
            c4185le.getClass();
            N9.a.a(this.a, c4185le.d(), this.b, this.c);
        }

        @Override // com.ironsource.InterfaceC4292re
        public void a(@NotNull C4221ne c4221ne, @Nullable C4037d9 c4037d9) {
            c4221ne.getClass();
            N9.a.a(this.c, this.b, c4221ne);
        }
    }

    public final void a(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initListener) {
        context.getClass();
        initRequest.getClass();
        initListener.getClass();
        IronLog.API.info("IronSourceAds.init() appkey: " + initRequest.getAppKey() + ", legacyAdFormats: " + initRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        b.a(new kdc(4, initRequest, context, initListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitRequest initRequest, Context context, InitListener initListener) {
        initRequest.getClass();
        context.getClass();
        initListener.getClass();
        C4051e5 c4051e5 = new C4051e5();
        Ae.a.c(context, new C4328te(initRequest.getAppKey(), null, ph0.Z(b.a(initRequest.getLegacyAdFormats())), 2, null), new b(context, c4051e5, initListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Context context, Te te, C4051e5 c4051e5, InitListener initListener) {
        String n = com.ironsource.mediationsdk.p.g().n();
        Y8 g = te.g();
        g.getClass();
        NetworkSettings b2 = te.l().b("IronSource");
        b2.getClass();
        JSONObject interstitialSettings = b2.getInterstitialSettings();
        interstitialSettings.getClass();
        g.a(new X.a(interstitialSettings, Ib.v.d().h()));
        g.a(ConfigFile.getConfigFile().getPluginType());
        g.b(n);
        new Z(new C4255pc()).a(context, g, new a());
        a(te, c4051e5, initListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InitListener initListener) {
        IronLog.CALLBACK.info("InitListener.onInitSuccess()");
        if (initListener != null) {
            initListener.onInitSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(InitListener initListener, C4051e5 c4051e5, C4221ne c4221ne) {
        long a2 = C4051e5.a(c4051e5);
        C4127i9 c4127i9 = b;
        C4221ne b2 = c4127i9.b(c4221ne);
        c4127i9.a(b2, a2);
        c4127i9.b(new kdc(5, c4221ne, initListener, b2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4221ne c4221ne, InitListener initListener, C4221ne c4221ne2) {
        c4221ne.getClass();
        c4221ne2.getClass();
        IronLog.CALLBACK.info("InitListener.onInitFailed() error " + c4221ne);
        if (initListener != null) {
            initListener.onInitFailed(b.a(c4221ne2));
        }
    }

    private final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        Ib.v.d().q().a(new C4355v5(EnumC4373w5.CONSENT_IADS, jSONObject));
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        com.ironsource.mediationsdk.p.g().a(str, arrayList);
    }
}
