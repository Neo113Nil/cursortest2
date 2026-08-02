package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.dmi;
import defpackage.h1n;
import defpackage.tub;
import defpackage.wem;
import defpackage.xka;
import defpackage.zol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.z2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4424z2 extends B implements BannerAdListener {

    @Nullable
    private FrameLayout.LayoutParams A;

    @Nullable
    private View z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4424z2(@NotNull T0 t0, @NotNull C c, @NotNull I i, @NotNull B2 b2) {
        super(t0, c, i, null, null, 24, null);
        t0.getClass();
        c.getClass();
        i.getClass();
        b2.getClass();
        a(b2);
    }

    private final B2 K() {
        F s = s();
        if (s instanceof B2) {
            return (B2) s;
        }
        return null;
    }

    private final ISBannerSize L() {
        T0 f = f();
        AbstractC4386x0 j = n().j();
        j.getClass();
        return f.a(((K2) j).b().i());
    }

    private final void M() {
        C4077fd j = j();
        if (j != null) {
            f().f().a().f(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.a(this);
        }
    }

    private final void N() {
        C4077fd j = j();
        if (j != null) {
            f().f().a().c(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.b(this);
        }
    }

    private final void O() {
        C4077fd j = j();
        if (j != null) {
            f().f().a().h(j.c());
        }
        B2 K = K();
        if (K != null) {
            K.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4424z2 c4424z2, Bg bg) {
        FrameLayout.LayoutParams layoutParams;
        c4424z2.getClass();
        bg.getClass();
        View view = c4424z2.z;
        if (view == null || (layoutParams = c4424z2.A) == null) {
            return;
        }
        bg.a(view, layoutParams, c4424z2.f());
        IronLog.INTERNAL.verbose(C4243p0.a(c4424z2.f(), "Bind banner view", (String) null, 2, (Object) null));
        c4424z2.f().a(new h1n(c4424z2, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4424z2 c4424z2) {
        c4424z2.getClass();
        c4424z2.O();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i = i();
        ISBannerSize L = L();
        Map<String, Object> adUnitData = i.getAdUnitData();
        adUnitData.getClass();
        adUnitData.put(I2.t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), L));
        Object g = g();
        g.getClass();
        ((AdapterBannerInterface) g).loadAd(i, ContextProvider.getInstance().getCurrentActiveActivity(), L, this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C4325tb.a(f(), new h1n(this, 1), 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        a(new a());
    }

    @Override // com.ironsource.B
    @NotNull
    public LevelPlayAdInfo e() {
        String uuid = n().j().b().b().toString();
        uuid.getClass();
        String c = n().j().b().c();
        String aVar = n().i().toString();
        aVar.getClass();
        C4227o2 o = n().o();
        AbstractC4386x0 j = n().j();
        j.getClass();
        return new LevelPlayAdInfo(uuid, c, aVar, o, ((K2) j).b().i(), n().j().l(), tub.p(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        f().a(new h1n(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull Map<String, Object> map) {
        view.getClass();
        layoutParams.getClass();
        map.getClass();
        C4325tb.a(f(), new zol(16, this, view, layoutParams), 0L, 2, null);
        super.onAdLoadSuccess(map);
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(@NotNull Map<String, Object> map) {
        map.getClass();
        f().a(new wem(22, this, map));
        super.onAdOpened(map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        f().a(new h1n(this, 2));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        f().a(new h1n(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4424z2 c4424z2) {
        c4424z2.getClass();
        c4424z2.N();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        view.getClass();
        layoutParams.getClass();
        onAdLoadSuccess(view, layoutParams, new LinkedHashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4424z2 c4424z2) {
        c4424z2.getClass();
        c4424z2.M();
    }

    public final void a(@NotNull Bg bg) {
        bg.getClass();
        C4325tb.a(f(), new wem(23, this, bg), 0L, 2, null);
    }

    @Override // com.ironsource.B
    public void a(@NotNull K k) {
        k.getClass();
        k.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4424z2 c4424z2) {
        c4424z2.getClass();
        c4424z2.z = null;
        c4424z2.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4424z2 c4424z2, View view, FrameLayout.LayoutParams layoutParams) {
        c4424z2.getClass();
        view.getClass();
        layoutParams.getClass();
        c4424z2.z = view;
        c4424z2.A = layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4424z2 c4424z2, Map map) {
        c4424z2.getClass();
        map.getClass();
        c4424z2.l().putAll(map);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.z2$a */
    public static final class a extends xka implements Function0<Unit> {
        public a() {
            super(0);
        }

        public final void a() {
            try {
                if (!(C4424z2.this.g() instanceof AdapterBannerInterface)) {
                    IronLog.INTERNAL.error(C4424z2.this.a("adapter not instance of AdapterBannerInterface"));
                    return;
                }
                Object g = C4424z2.this.g();
                g.getClass();
                ((AdapterBannerInterface) g).destroyAd(C4424z2.this.i());
            } catch (Throwable th) {
                C4424z2.this.f().a(new hh(5, th, C4424z2.this));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, C4424z2 c4424z2) {
            th.getClass();
            c4424z2.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("destroyBanner - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(c4424z2.a(q));
            c4424z2.f().f().h().g(q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4424z2 c4424z2) {
        String str;
        c4424z2.getClass();
        O a2 = c4424z2.f().f().a();
        C4077fd j = c4424z2.j();
        if (j == null || (str = j.c()) == null) {
            str = "";
        }
        a2.j(str);
    }
}
