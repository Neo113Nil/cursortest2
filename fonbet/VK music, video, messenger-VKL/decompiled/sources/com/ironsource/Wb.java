package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import xsna.go9;

/* loaded from: classes13.dex */
public final class Wb extends B implements NativeAdListener {
    private AdapterNativeAdViewBinder A;
    private AdapterNativeAdData z;

    public Wb(V0 v0, C c, I i, F f) {
        super(v0, c, i, null, f, 8, null);
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData i = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
            ((AdapterNativeAdInterface) g()).loadAd(i, ContextProvider.getInstance().getActiveContext(), this);
        } else {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().d().h().g("activity must not be null");
        }
    }

    public final AdapterNativeAdData K() {
        return this.z;
    }

    public final AdapterNativeAdViewBinder L() {
        return this.A;
    }

    @Override // com.ironsource.B
    public void a(K k) {
        k.a(this);
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
                ((AdapterNativeAdInterface) g()).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(a(b));
            f().d().h().g(b);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.z = adapterNativeAdData;
        this.A = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(Pb pb) {
        pb.a(this.z);
        pb.a(this.A);
    }
}
