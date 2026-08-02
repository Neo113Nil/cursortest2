package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4085g3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.dmi;
import defpackage.ped;
import defpackage.xtl;
import defpackage.zol;
import java.util.Arrays;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4022cc extends AbstractC4085g3<P0> implements NativeAdListener, D0 {

    @Nullable
    private AdapterNativeAdData r;

    @Nullable
    private AdapterNativeAdViewBinder s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022cc(@NotNull InterfaceC4256pd interfaceC4256pd, @NotNull C4207n0 c4207n0, @Nullable BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, @Nullable C4077fd c4077fd, @NotNull C4227o2 c4227o2, @Nullable P0 p0) {
        super(interfaceC4256pd, c4207n0, baseAdAdapter, new C4011c1(c4207n0.g(), c4207n0.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), c4227o2, p0);
        interfaceC4256pd.getClass();
        c4207n0.getClass();
        c4227o2.getClass();
        this.g = c4077fd;
    }

    private final void J() {
        C4223ng c4223ng;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != AbstractC4085g3.h.FAILED) {
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.e}, 2));
            E0 e0 = this.d;
            if (e0 == null || (c4223ng = e0.j) == null) {
                return;
            }
            c4223ng.q(format);
        }
    }

    @Override // com.ironsource.AbstractC4085g3
    public void G() {
        C4223ng c4223ng;
        if (!(this.c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            E0 e0 = this.d;
            if (e0 == null || (c4223ng = e0.j) == null) {
                return;
            }
            c4223ng.g("activity must not be null");
            return;
        }
        Object obj = this.c;
        obj.getClass();
        AdData adData = this.k;
        adData.getClass();
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        currentActiveActivity.getClass();
        ((AdapterNativeAdInterface) obj).loadAd(adData, currentActiveActivity, this);
    }

    public final void P() {
        C4223ng c4223ng;
        C4397xb c4397xb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4085g3.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                AdData adData = this.k;
                adData.getClass();
                ((AdapterNativeAdInterface) obj).destroyAd(adData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C4157k4.d().a(th);
            String q = dmi.q("destroyNativeAd - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(a(q));
            E0 e0 = this.d;
            if (e0 != null && (c4223ng = e0.j) != null) {
                c4223ng.g(q);
            }
        }
        E0 e02 = this.d;
        if (e02 == null || (c4397xb = e02.f) == null) {
            return;
        }
        Integer r = r();
        r.getClass();
        c4397xb.a(r.intValue());
    }

    @Nullable
    public final AdapterNativeAdViewBinder R() {
        return this.s;
    }

    @Override // com.ironsource.AbstractC4085g3, com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@NotNull B0 b0) {
        b0.getClass();
        Map<String, Object> a = super.a(b0);
        if (this.g != null) {
            a.getClass();
            a.put("placement", j());
        }
        a.getClass();
        return a;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(@NotNull AdapterNativeAdData adapterNativeAdData, @NotNull AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        if (u().c()) {
            u().a(new zol(2, this, adapterNativeAdData, adapterNativeAdViewBinder));
        } else {
            a(adapterNativeAdData, adapterNativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC4085g3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new xtl(this, 6));
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, @Nullable String str) {
        throw new ped("An operation is not implemented: Not yet implemented");
    }

    @Nullable
    public final AdapterNativeAdData Q() {
        return this.r;
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.r = adapterNativeAdData;
        this.s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4022cc c4022cc) {
        c4022cc.getClass();
        c4022cc.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4022cc c4022cc, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        c4022cc.getClass();
        adapterNativeAdData.getClass();
        adapterNativeAdViewBinder.getClass();
        c4022cc.a(adapterNativeAdData, adapterNativeAdViewBinder);
    }
}
