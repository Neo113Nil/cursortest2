package com.ironsource;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4098gg;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import defpackage.kdc;
import defpackage.s5l;
import defpackage.tub;
import defpackage.w2g;
import defpackage.wv8;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y2 implements InterfaceC4433zb, C2 {

    @NotNull
    private final BannerAdRequest a;

    @NotNull
    private final AdSize b;

    @NotNull
    private final InterfaceC4209n2 c;

    @NotNull
    private final Ab d;

    @NotNull
    private final InterfaceC4326tc e;

    @NotNull
    private final InterfaceC4262q1 f;

    @NotNull
    private final V<BannerAdView> g;

    @NotNull
    private final F2 h;

    @NotNull
    private final InterfaceC4098gg.c i;

    @NotNull
    private final Executor j;
    private C4051e5 k;

    @Nullable
    private InterfaceC4098gg l;

    @Nullable
    private W1 m;
    private boolean n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InterfaceC4098gg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4098gg.a
        public void a() {
            Y2.this.a(C4301s5.a.s());
        }
    }

    public Y2(@NotNull BannerAdRequest bannerAdRequest, @NotNull AdSize adSize, @NotNull InterfaceC4209n2 interfaceC4209n2, @NotNull Ab ab, @NotNull InterfaceC4326tc interfaceC4326tc, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull V<BannerAdView> v, @NotNull F2 f2, @NotNull InterfaceC4098gg.c cVar, @NotNull Executor executor) {
        bannerAdRequest.getClass();
        adSize.getClass();
        interfaceC4209n2.getClass();
        ab.getClass();
        interfaceC4326tc.getClass();
        interfaceC4262q1.getClass();
        v.getClass();
        f2.getClass();
        cVar.getClass();
        executor.getClass();
        this.a = bannerAdRequest;
        this.b = adSize;
        this.c = interfaceC4209n2;
        this.d = ab;
        this.e = interfaceC4326tc;
        this.f = interfaceC4262q1;
        this.g = v;
        this.h = f2;
        this.i = cVar;
        this.j = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y2 y2, IronSourceError ironSourceError) {
        y2.getClass();
        ironSourceError.getClass();
        if (y2.n) {
            return;
        }
        y2.n = true;
        InterfaceC4098gg interfaceC4098gg = y2.l;
        if (interfaceC4098gg != null) {
            interfaceC4098gg.cancel();
        }
        InterfaceC4136j1.c.a aVar = InterfaceC4136j1.c.a;
        C4190m1.j jVar = new C4190m1.j(ironSourceError.getErrorCode());
        C4190m1.k kVar = new C4190m1.k(ironSourceError.getErrorMessage());
        C4051e5 c4051e5 = y2.k;
        if (c4051e5 == null) {
            Intrinsics.i("taskStartedTime");
            throw null;
        }
        aVar.a(jVar, kVar, new C4190m1.f(C4051e5.a(c4051e5))).a(y2.f);
        W1 w1 = y2.m;
        if (w1 != null) {
            w1.a("onBannerLoadFail");
        }
        y2.g.a(ironSourceError);
    }

    @Override // com.ironsource.C2
    public void onBannerLoadFail(@NotNull String str) {
        str.getClass();
        a(C4301s5.a.c(str));
    }

    @Override // com.ironsource.C2
    public void onBannerLoadSuccess(@NotNull J9 j9, @NotNull C4036d8 c4036d8) {
        j9.getClass();
        c4036d8.getClass();
        try {
            this.j.execute(new kdc(28, this, j9, c4036d8));
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // com.ironsource.InterfaceC4433zb
    public void start() {
        this.k = new C4051e5();
        this.f.a(new C4190m1.s(this.d.f()), new C4190m1.n(this.d.g().b()), new C4190m1.c(this.b), new C4190m1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4136j1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.d.h();
        InterfaceC4098gg.c cVar = this.i;
        InterfaceC4098gg.b bVar = new InterfaceC4098gg.b();
        bVar.b(h);
        Unit unit = Unit.a;
        InterfaceC4098gg a2 = cVar.a(bVar);
        this.l = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.c.a();
        Throwable a4 = w2g.a(a3);
        if (a4 != null) {
            a(((Y7) a4).a());
            a3 = null;
        }
        C4155k2 c4155k2 = (C4155k2) a3;
        if (c4155k2 == null) {
            return;
        }
        InterfaceC4262q1 interfaceC4262q1 = this.f;
        String b = c4155k2.b();
        if (b != null) {
            interfaceC4262q1.a(new C4190m1.d(b));
        }
        JSONObject f = c4155k2.f();
        if (f != null) {
            interfaceC4262q1.a(new C4190m1.m(f));
        }
        String a5 = c4155k2.a();
        if (a5 != null) {
            interfaceC4262q1.a(new C4190m1.g(a5));
        }
        EnumC4252p9 g = this.d.g();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        C4000b8 c4000b8 = new C4000b8(AdapterUtils.dpToPixels(applicationContext, this.b.getWidth()), AdapterUtils.dpToPixels(applicationContext, this.b.getHeight()), this.b.getSizeDescription());
        Ic ic = new Ic();
        ic.a(this);
        J9 a6 = new K9(this.a.getProviderName$mediationsdk_release().value(), ic).a(g.b(EnumC4252p9.Bidder)).a(c4000b8).b(this.d.i()).a(this.a.getAdId$mediationsdk_release()).a(tub.k(new C4201mc().a(), O5.a.a(this.a.getExtraParams()))).a();
        C4362vc c4362vc = new C4362vc(c4155k2, this.d.j());
        this.m = new W1(new C4216n9(this.a.getInstanceId(), g.b(), c4155k2.a()), new com.ironsource.mediationsdk.d(), c4155k2.c());
        InterfaceC4136j1.d.a.c().a(this.f);
        InterfaceC4326tc interfaceC4326tc = this.e;
        a6.getClass();
        interfaceC4326tc.a(a6, c4362vc);
    }

    public /* synthetic */ Y2(BannerAdRequest bannerAdRequest, AdSize adSize, InterfaceC4209n2 interfaceC4209n2, Ab ab, InterfaceC4326tc interfaceC4326tc, InterfaceC4262q1 interfaceC4262q1, V v, F2 f2, InterfaceC4098gg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bannerAdRequest, adSize, interfaceC4209n2, ab, interfaceC4326tc, interfaceC4262q1, v, f2, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? new InterfaceC4098gg.d() : cVar, (i & 512) != 0 ? O7.a.d() : executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Y2 y2, J9 j9, C4036d8 c4036d8) {
        y2.getClass();
        j9.getClass();
        c4036d8.getClass();
        if (y2.n) {
            return;
        }
        y2.n = true;
        InterfaceC4098gg interfaceC4098gg = y2.l;
        if (interfaceC4098gg != null) {
            interfaceC4098gg.cancel();
        }
        C4051e5 c4051e5 = y2.k;
        if (c4051e5 != null) {
            InterfaceC4136j1.c.a.a(new C4190m1.f(C4051e5.a(c4051e5))).a(y2.f);
            W1 w1 = y2.m;
            if (w1 != null) {
                w1.c("onBannerLoadSuccess");
            }
            F2 f2 = y2.h;
            W1 w12 = y2.m;
            w12.getClass();
            y2.g.a((V<BannerAdView>) f2.a(j9, c4036d8, w12));
            return;
        }
        Intrinsics.i("taskStartedTime");
        throw null;
    }

    public final void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        try {
            this.j.execute(new s5l(4, this, ironSourceError));
        } catch (Exception e) {
            a(e);
        }
    }

    private final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        Map<String, String> a2 = O5.a.a(bundle);
        for (String str : a2.keySet()) {
            InterfaceC4136j1.c.a.a(new C4190m1.l(wv8.i(str, U3.j.b, String.valueOf(a2.get(str))))).a(this.f);
        }
    }

    private final void a(Exception exc) {
        IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError(exc.getMessage());
        InterfaceC4136j1.d.a.a(new C4190m1.k(buildLoadFailedError.getErrorMessage())).a(this.f);
        IronLog.CALLBACK.error(buildLoadFailedError.getErrorMessage());
    }
}
