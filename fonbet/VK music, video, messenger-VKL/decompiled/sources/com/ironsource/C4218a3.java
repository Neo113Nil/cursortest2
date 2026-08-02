package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import com.ironsource.C4218a3;
import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4392jg;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.json.JSONObject;
import xsna.pn00;
import xsna.pzl;
import xsna.s3q0;
import xsna.v9j;
import xsna.zcl;

/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4218a3 implements Bb, E2 {
    private final BannerAdRequest a;
    private final AdSize b;
    private final InterfaceC4486p2 c;
    private final Cb d;
    private final InterfaceC4585uc e;
    private final InterfaceC4538s1 f;
    private final V<BannerAdView> g;
    private final H2 h;
    private final InterfaceC4392jg.c i;
    private final Executor j;
    private C4328g5 k;
    private InterfaceC4392jg l;
    private Y1 m;
    private boolean n;

    /* renamed from: com.ironsource.a3$a */
    public static final class a implements InterfaceC4392jg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4392jg.a
        public void a() {
            C4218a3.this.a(C4578u5.a.s());
        }
    }

    public C4218a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4486p2 interfaceC4486p2, Cb cb, InterfaceC4585uc interfaceC4585uc, InterfaceC4538s1 interfaceC4538s1, V<BannerAdView> v, H2 h2, InterfaceC4392jg.c cVar, Executor executor) {
        this.a = bannerAdRequest;
        this.b = adSize;
        this.c = interfaceC4486p2;
        this.d = cb;
        this.e = interfaceC4585uc;
        this.f = interfaceC4538s1;
        this.g = v;
        this.h = h2;
        this.i = cVar;
        this.j = executor;
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a2 = R5.a.a(bundle);
        for (String str : a2.keySet()) {
            InterfaceC4413l1.c.a.a(new C4467o1.l(pzl.b(str, "=", String.valueOf(a2.get(str))))).a(this.f);
        }
    }

    @Override // com.ironsource.E2
    public void onBannerLoadFail(String str) {
        a(C4578u5.a.c(str));
    }

    @Override // com.ironsource.E2
    public void onBannerLoadSuccess(final K9 k9, final C4331g8 c4331g8) {
        try {
            this.j.execute(new Runnable() { // from class: xsna.u9y0
                @Override // java.lang.Runnable
                public final void run() {
                    C4218a3.a(C4218a3.this, k9, c4331g8);
                }
            });
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.k = new C4328g5();
        this.f.a(new C4467o1.s(this.d.f()), new C4467o1.n(this.d.g().b()), new C4467o1.c(this.b), new C4467o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4413l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.d.h();
        InterfaceC4392jg.c cVar = this.i;
        InterfaceC4392jg.b bVar = new InterfaceC4392jg.b();
        bVar.b(h);
        s3q0 s3q0Var = s3q0.a;
        InterfaceC4392jg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.c.a();
        Throwable a4 = Result.a(a3);
        if (a4 != null) {
            a(((C4241b8) a4).a());
            a3 = null;
        }
        C4432m2 c4432m2 = (C4432m2) a3;
        if (c4432m2 == null) {
            return;
        }
        InterfaceC4538s1 interfaceC4538s1 = this.f;
        String b = c4432m2.b();
        if (b != null) {
            interfaceC4538s1.a(new C4467o1.d(b));
        }
        JSONObject f = c4432m2.f();
        if (f != null) {
            interfaceC4538s1.a(new C4467o1.m(f));
        }
        String a5 = c4432m2.a();
        if (a5 != null) {
            interfaceC4538s1.a(new C4467o1.g(a5));
        }
        EnumC4493p9 g = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4295e8 c4295e8 = new C4295e8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Jc jc = new Jc();
        jc.a(this);
        K9 a6 = new L9(this.a.getProviderName$mediationsdk_release().value(), jc).a(g.b(EnumC4493p9.Bidder)).a(c4295e8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(pn00.n(new C4460nc().a(), R5.a.a(this.a.getExtraParams()))).a();
        C4621wc c4621wc = new C4621wc(c4432m2, this.d.j());
        this.m = new Y1(new C4457n9(this.a.getInstanceId(), g.b(), c4432m2.a()), new com.ironsource.mediationsdk.d(), c4432m2.c());
        InterfaceC4413l1.d.a.c().a(this.f);
        this.e.a(a6, c4621wc);
    }

    public /* synthetic */ C4218a3(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4486p2 interfaceC4486p2, Cb cb, InterfaceC4585uc interfaceC4585uc, InterfaceC4538s1 interfaceC4538s1, V v, H2 h2, InterfaceC4392jg.c cVar, Executor executor, int i, zcl zclVar) {
        this(bannerAdRequest, adSize, interfaceC4486p2, cb, interfaceC4585uc, interfaceC4538s1, v, h2, (i & 256) != 0 ? new InterfaceC4392jg.d() : cVar, (i & 512) != 0 ? R7.a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4218a3 c4218a3, K9 k9, C4331g8 c4331g8) {
        if (c4218a3.n) {
            return;
        }
        c4218a3.n = true;
        InterfaceC4392jg interfaceC4392jg = c4218a3.l;
        if (interfaceC4392jg != null) {
            interfaceC4392jg.cancel();
        }
        C4328g5 c4328g5 = c4218a3.k;
        if (c4328g5 == null) {
            c4328g5 = null;
        }
        InterfaceC4413l1.c.a.a(new C4467o1.f(C4328g5.a(c4328g5))).a(c4218a3.f);
        Y1 y1 = c4218a3.m;
        if (y1 != null) {
            y1.c("onBannerLoadSuccess");
        }
        c4218a3.g.a(c4218a3.h.a(k9, c4331g8, c4218a3.m));
    }

    public final void a(IronSourceError ironSourceError) {
        try {
            this.j.execute(new v9j(9, this, ironSourceError));
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4218a3 c4218a3, IronSourceError ironSourceError) {
        if (c4218a3.n) {
            return;
        }
        c4218a3.n = true;
        InterfaceC4392jg interfaceC4392jg = c4218a3.l;
        if (interfaceC4392jg != null) {
            interfaceC4392jg.cancel();
        }
        InterfaceC4413l1.c.a aVar = InterfaceC4413l1.c.a;
        C4467o1.j jVar = new C4467o1.j(ironSourceError.getErrorCode());
        C4467o1.k kVar = new C4467o1.k(ironSourceError.getErrorMessage());
        C4328g5 c4328g5 = c4218a3.k;
        if (c4328g5 == null) {
            c4328g5 = null;
        }
        aVar.a(jVar, kVar, new C4467o1.f(C4328g5.a(c4328g5))).a(c4218a3.f);
        Y1 y1 = c4218a3.m;
        if (y1 != null) {
            y1.a("onBannerLoadFail");
        }
        c4218a3.g.b(ironSourceError);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4413l1.d.a.a(new C4467o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
