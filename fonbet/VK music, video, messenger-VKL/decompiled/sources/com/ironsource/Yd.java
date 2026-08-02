package com.ironsource;

import android.os.Bundle;
import com.ironsource.C4467o1;
import com.ironsource.InterfaceC4392jg;
import com.ironsource.InterfaceC4413l1;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import org.json.JSONObject;
import xsna.li0;
import xsna.pn00;
import xsna.pzl;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Yd implements Bb, InterfaceC4257c6 {
    private final RewardedAdRequest a;
    private final Cb b;
    private final V<RewardedAd> c;
    private final InterfaceC4486p2 d;
    private final InterfaceC4585uc e;
    private final InterfaceC4538s1 f;
    private final InterfaceC4287e0<RewardedAd> g;
    private final InterfaceC4392jg.c h;
    private final Executor i;
    private C4328g5 j;
    private InterfaceC4392jg k;
    private Y1 l;
    private boolean m;

    public static final class a implements InterfaceC4392jg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4392jg.a
        public void a() {
            Yd.this.a(C4578u5.a.s());
        }
    }

    public Yd(RewardedAdRequest rewardedAdRequest, Cb cb, V<RewardedAd> v, InterfaceC4486p2 interfaceC4486p2, InterfaceC4585uc interfaceC4585uc, InterfaceC4538s1 interfaceC4538s1, InterfaceC4287e0<RewardedAd> interfaceC4287e0, InterfaceC4392jg.c cVar, Executor executor) {
        this.a = rewardedAdRequest;
        this.b = cb;
        this.c = v;
        this.d = interfaceC4486p2;
        this.e = interfaceC4585uc;
        this.f = interfaceC4538s1;
        this.g = interfaceC4287e0;
        this.h = cVar;
        this.i = executor;
    }

    @Override // com.ironsource.InterfaceC4257c6
    public void a(K9 k9) {
        try {
            this.i.execute(new xsna.c0(9, this, k9));
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.Bb
    public void start() {
        this.j = new C4328g5();
        this.f.a(new C4467o1.s(this.b.f()), new C4467o1.n(this.b.g().b()), new C4467o1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4413l1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.b.h();
        InterfaceC4392jg.c cVar = this.h;
        InterfaceC4392jg.b bVar = new InterfaceC4392jg.b();
        bVar.b(h);
        s3q0 s3q0Var = s3q0.a;
        InterfaceC4392jg a2 = cVar.a(bVar);
        this.k = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.d.a();
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
        EnumC4493p9 g = this.b.g();
        C4239b6 c4239b6 = new C4239b6();
        c4239b6.a(this);
        K9 a6 = new L9(this.a.getProviderName$mediationsdk_release().value(), c4239b6).a(g.b(EnumC4493p9.Bidder)).b(this.b.i()).c().a(this.a.getAdId$mediationsdk_release()).a(pn00.n(new C4460nc().a(), R5.a.a(this.a.getExtraParams()))).a();
        this.f.a(new C4467o1.b(a6.e()));
        C4621wc c4621wc = new C4621wc(c4432m2, this.b.j());
        this.l = new Y1(new C4457n9(this.a.getInstanceId(), g.b(), c4432m2.a()), new com.ironsource.mediationsdk.d(), c4432m2.c());
        InterfaceC4413l1.d.a.c().a(this.f);
        this.e.a(a6, c4621wc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Yd yd, K9 k9) {
        if (yd.m) {
            return;
        }
        yd.m = true;
        InterfaceC4392jg interfaceC4392jg = yd.k;
        if (interfaceC4392jg != null) {
            interfaceC4392jg.cancel();
        }
        C4328g5 c4328g5 = yd.j;
        if (c4328g5 == null) {
            c4328g5 = null;
        }
        InterfaceC4413l1.c.a.a(new C4467o1.f(C4328g5.a(c4328g5))).a(yd.f);
        Y1 y1 = yd.l;
        if (y1 != null) {
            y1.c("onAdInstanceLoadSuccess");
        }
        yd.c.a(yd.g.a(k9, yd.l));
    }

    public /* synthetic */ Yd(RewardedAdRequest rewardedAdRequest, Cb cb, V v, InterfaceC4486p2 interfaceC4486p2, InterfaceC4585uc interfaceC4585uc, InterfaceC4538s1 interfaceC4538s1, InterfaceC4287e0 interfaceC4287e0, InterfaceC4392jg.c cVar, Executor executor, int i, zcl zclVar) {
        this(rewardedAdRequest, cb, v, interfaceC4486p2, interfaceC4585uc, interfaceC4538s1, interfaceC4287e0, (i & 128) != 0 ? new InterfaceC4392jg.d() : cVar, (i & 256) != 0 ? R7.a.d() : executor);
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

    @Override // com.ironsource.InterfaceC4257c6
    public void a(String str) {
        a(C4578u5.a.c(str));
    }

    public final void a(IronSourceError ironSourceError) {
        try {
            this.i.execute(new li0(7, this, ironSourceError));
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Yd yd, IronSourceError ironSourceError) {
        if (yd.m) {
            return;
        }
        yd.m = true;
        InterfaceC4392jg interfaceC4392jg = yd.k;
        if (interfaceC4392jg != null) {
            interfaceC4392jg.cancel();
        }
        InterfaceC4413l1.c.a aVar = InterfaceC4413l1.c.a;
        C4467o1.j jVar = new C4467o1.j(ironSourceError.getErrorCode());
        C4467o1.k kVar = new C4467o1.k(ironSourceError.getErrorMessage());
        C4328g5 c4328g5 = yd.j;
        if (c4328g5 == null) {
            c4328g5 = null;
        }
        aVar.a(jVar, kVar, new C4467o1.f(C4328g5.a(c4328g5))).a(yd.f);
        Y1 y1 = yd.l;
        if (y1 != null) {
            y1.a("onAdInstanceLoadFail");
        }
        yd.c.b(ironSourceError);
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4413l1.d.a.a(new C4467o1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
