package com.ironsource;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.ironsource.C4190m1;
import com.ironsource.InterfaceC4098gg;
import com.ironsource.InterfaceC4136j1;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import defpackage.tub;
import defpackage.w2g;
import defpackage.wem;
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
/* renamed from: com.ironsource.x9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4395x9 implements InterfaceC4433zb, Z5 {

    @NotNull
    private final InterstitialAdRequest a;

    @NotNull
    private final Ab b;

    @NotNull
    private final V<InterstitialAd> c;

    @NotNull
    private final InterfaceC4209n2 d;

    @NotNull
    private final InterfaceC4326tc e;

    @NotNull
    private final InterfaceC4262q1 f;

    @NotNull
    private final InterfaceC4046e0<InterstitialAd> g;

    @NotNull
    private final InterfaceC4098gg.c h;

    @NotNull
    private final Executor i;
    private C4051e5 j;

    @Nullable
    private InterfaceC4098gg k;

    @Nullable
    private W1 l;
    private boolean m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.x9$a */
    public static final class a implements InterfaceC4098gg.a {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4098gg.a
        public void a() {
            C4395x9.this.a(C4301s5.a.s());
        }
    }

    public C4395x9(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull Ab ab, @NotNull V<InterstitialAd> v, @NotNull InterfaceC4209n2 interfaceC4209n2, @NotNull InterfaceC4326tc interfaceC4326tc, @NotNull InterfaceC4262q1 interfaceC4262q1, @NotNull InterfaceC4046e0<InterstitialAd> interfaceC4046e0, @NotNull InterfaceC4098gg.c cVar, @NotNull Executor executor) {
        interstitialAdRequest.getClass();
        ab.getClass();
        v.getClass();
        interfaceC4209n2.getClass();
        interfaceC4326tc.getClass();
        interfaceC4262q1.getClass();
        interfaceC4046e0.getClass();
        cVar.getClass();
        executor.getClass();
        this.a = interstitialAdRequest;
        this.b = ab;
        this.c = v;
        this.d = interfaceC4209n2;
        this.e = interfaceC4326tc;
        this.f = interfaceC4262q1;
        this.g = interfaceC4046e0;
        this.h = cVar;
        this.i = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4395x9 c4395x9, IronSourceError ironSourceError) {
        c4395x9.getClass();
        ironSourceError.getClass();
        if (c4395x9.m) {
            return;
        }
        c4395x9.m = true;
        InterfaceC4098gg interfaceC4098gg = c4395x9.k;
        if (interfaceC4098gg != null) {
            interfaceC4098gg.cancel();
        }
        InterfaceC4136j1.c.a aVar = InterfaceC4136j1.c.a;
        C4190m1.j jVar = new C4190m1.j(ironSourceError.getErrorCode());
        C4190m1.k kVar = new C4190m1.k(ironSourceError.getErrorMessage());
        C4051e5 c4051e5 = c4395x9.j;
        if (c4051e5 == null) {
            Intrinsics.i("taskStartedTime");
            throw null;
        }
        aVar.a(jVar, kVar, new C4190m1.f(C4051e5.a(c4051e5))).a(c4395x9.f);
        W1 w1 = c4395x9.l;
        if (w1 != null) {
            w1.a("onAdInstanceDidFailToLoad");
        }
        c4395x9.c.a(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4433zb
    public void start() {
        this.j = new C4051e5();
        this.f.a(new C4190m1.s(this.b.f()), new C4190m1.n(this.b.g().b()), new C4190m1.b(this.a.getAdId$mediationsdk_release()));
        InterfaceC4136j1.c.a.a().a(this.f);
        a(this.a.getExtraParams());
        long h = this.b.h();
        InterfaceC4098gg.c cVar = this.h;
        InterfaceC4098gg.b bVar = new InterfaceC4098gg.b();
        bVar.b(h);
        Unit unit = Unit.a;
        InterfaceC4098gg a2 = cVar.a(bVar);
        this.k = a2;
        if (a2 != null) {
            a2.a(new a());
        }
        Object a3 = this.d.a();
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
        EnumC4252p9 g = this.b.g();
        Y5 y5 = new Y5();
        y5.a(this);
        J9 a6 = new K9(this.a.getProviderName$mediationsdk_release().value(), y5).a(g.b(EnumC4252p9.Bidder)).b(this.b.i()).a(this.a.getAdId$mediationsdk_release()).a(tub.k(new C4201mc().a(), O5.a.a(this.a.getExtraParams()))).a();
        InterfaceC4262q1 interfaceC4262q12 = this.f;
        String e = a6.e();
        e.getClass();
        interfaceC4262q12.a(new C4190m1.b(e));
        C4362vc c4362vc = new C4362vc(c4155k2, this.b.j());
        this.l = new W1(new C4216n9(this.a.getInstanceId(), g.b(), c4155k2.a()), new com.ironsource.mediationsdk.d(), c4155k2.c());
        InterfaceC4136j1.d.a.c().a(this.f);
        this.e.a(a6, c4362vc);
    }

    public /* synthetic */ C4395x9(InterstitialAdRequest interstitialAdRequest, Ab ab, V v, InterfaceC4209n2 interfaceC4209n2, InterfaceC4326tc interfaceC4326tc, InterfaceC4262q1 interfaceC4262q1, InterfaceC4046e0 interfaceC4046e0, InterfaceC4098gg.c cVar, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interstitialAdRequest, ab, v, interfaceC4209n2, interfaceC4326tc, interfaceC4262q1, interfaceC4046e0, (i & 128) != 0 ? new InterfaceC4098gg.d() : cVar, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? O7.a.d() : executor);
    }

    @Override // com.ironsource.Z5
    public void a(@NotNull J9 j9) {
        j9.getClass();
        try {
            this.i.execute(new wem(19, this, j9));
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4395x9 c4395x9, J9 j9) {
        c4395x9.getClass();
        j9.getClass();
        if (c4395x9.m) {
            return;
        }
        c4395x9.m = true;
        InterfaceC4098gg interfaceC4098gg = c4395x9.k;
        if (interfaceC4098gg != null) {
            interfaceC4098gg.cancel();
        }
        C4051e5 c4051e5 = c4395x9.j;
        if (c4051e5 != null) {
            InterfaceC4136j1.c.a.a(new C4190m1.f(C4051e5.a(c4051e5))).a(c4395x9.f);
            W1 w1 = c4395x9.l;
            if (w1 != null) {
                w1.c("onAdInstanceDidLoad");
            }
            InterfaceC4046e0<InterstitialAd> interfaceC4046e0 = c4395x9.g;
            W1 w12 = c4395x9.l;
            w12.getClass();
            c4395x9.c.a((V<InterstitialAd>) interfaceC4046e0.a(j9, w12));
            return;
        }
        Intrinsics.i("taskStartedTime");
        throw null;
    }

    @Override // com.ironsource.Z5
    public void a(@NotNull String str) {
        str.getClass();
        a(C4301s5.a.c(str));
    }

    public final void a(@NotNull IronSourceError ironSourceError) {
        ironSourceError.getClass();
        try {
            this.i.execute(new wem(18, this, ironSourceError));
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
