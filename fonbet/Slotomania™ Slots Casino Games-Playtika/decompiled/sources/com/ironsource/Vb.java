package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Vb extends B implements NativeAdListener {
    private AdapterNativeAdData y;
    private AdapterNativeAdViewBinder z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(V0 adTools, C instanceData, I adInstancePayload, F listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) g).loadAd(i, activeContext, this);
    }

    public final AdapterNativeAdData K() {
        return this.y;
    }

    public final AdapterNativeAdViewBinder L() {
        return this.z;
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object g = g();
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) g).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.y = adapterNativeAdData;
        this.z = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.y);
        nativeAdBinder.a(this.z);
    }
}
