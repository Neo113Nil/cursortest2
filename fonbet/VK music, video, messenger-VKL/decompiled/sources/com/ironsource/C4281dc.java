package com.ironsource;

import com.ironsource.AbstractC4379j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;
import xsna.go9;
import xsna.h3r;
import xsna.qd0;

/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4281dc extends AbstractC4379j3<R0> implements NativeAdListener, E0 {
    private AdapterNativeAdData r;
    private AdapterNativeAdViewBinder s;

    public C4281dc(InterfaceC4515qd interfaceC4515qd, C4448n0 c4448n0, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C4336gd c4336gd, C4504q2 c4504q2, R0 r0) {
        super(interfaceC4515qd, c4448n0, baseAdAdapter, new C4288e1(c4448n0.g(), c4448n0.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), c4504q2, r0);
        this.g = c4336gd;
    }

    private final void J() {
        C4518qg c4518qg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != AbstractC4379j3.h.FAILED) {
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.e}, 2));
            F0 f0 = this.d;
            if (f0 == null || (c4518qg = f0.j) == null) {
                return;
            }
            c4518qg.q(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4281dc c4281dc, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        c4281dc.a(adapterNativeAdData, adapterNativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC4379j3
    public void G() {
        C4518qg c4518qg;
        if (!(this.c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null) {
            ((AdapterNativeAdInterface) this.c).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this);
            return;
        }
        IronLog.INTERNAL.error(a("activity must not be null"));
        F0 f0 = this.d;
        if (f0 == null || (c4518qg = f0.j) == null) {
            return;
        }
        c4518qg.g("activity must not be null");
    }

    public final AdapterNativeAdViewBinder R() {
        return this.s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        if (u().c()) {
            u().a(new h3r(this, adapterNativeAdData, adapterNativeAdViewBinder, 3));
        } else {
            a(adapterNativeAdData, adapterNativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC4379j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new qd0(this, 22));
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.r = adapterNativeAdData;
        this.s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void P() {
        C4518qg c4518qg;
        C4674zb c4674zb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4379j3.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                ((AdapterNativeAdInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(a(b));
            F0 f0 = this.d;
            if (f0 != null && (c4518qg = f0.j) != null) {
                c4518qg.g(b);
            }
        }
        F0 f02 = this.d;
        if (f02 == null || (c4674zb = f02.f) == null) {
            return;
        }
        c4674zb.a(r().intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4281dc c4281dc) {
        c4281dc.J();
    }

    @Override // com.ironsource.AbstractC4379j3, com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> a = super.a(c0);
        if (this.g != null) {
            a.put("placement", j());
        }
        return a;
    }
}
