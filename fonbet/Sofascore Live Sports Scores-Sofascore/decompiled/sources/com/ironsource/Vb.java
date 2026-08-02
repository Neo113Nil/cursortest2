package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vb extends B implements NativeAdListener {

    @Nullable
    private AdapterNativeAdViewBinder A;

    @Nullable
    private AdapterNativeAdData z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(@NotNull T0 t0, @NotNull C c, @NotNull I i, @NotNull F f) {
        super(t0, c, i, null, f, 8, null);
        t0.getClass();
        c.getClass();
        i.getClass();
        f.getClass();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().f().h().g("activity must not be null");
            return;
        }
        Object g = g();
        g.getClass();
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        activeContext.getClass();
        ((AdapterNativeAdInterface) g).loadAd(i, activeContext, this);
    }

    @Nullable
    public final AdapterNativeAdData K() {
        return this.z;
    }

    @Nullable
    public final AdapterNativeAdViewBinder L() {
        return this.A;
    }

    public final void a(@NotNull Ob ob) {
        ob.getClass();
        ob.a(this.z);
        ob.a(this.A);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        super.b();
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            a(new a());
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        this.z = adapterNativeAdData;
        this.A = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    @Override // com.ironsource.B
    public void a(@NotNull K k) {
        k.getClass();
        k.a(this);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function0<Unit> {
        public a() {
            super(0);
        }

        public final void a() {
            try {
                if (!(Vb.this.g() instanceof AdapterNativeAdInterface)) {
                    IronLog.INTERNAL.error(Vb.this.a("adapter not instance of AdapterNativeAdInterface"));
                    return;
                }
                Object g = Vb.this.g();
                g.getClass();
                ((AdapterNativeAdInterface) g).destroyAd(Vb.this.i());
            } catch (Throwable th) {
                Vb.this.f().a(new hh(0, th, Vb.this));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Throwable th, Vb vb) {
            th.getClass();
            vb.getClass();
            C4157k4.d().a(th);
            String q = dmi.q("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(vb.a(q));
            vb.f().f().h().g(q);
        }
    }
}
