package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC2483j3;
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
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2367cc extends AbstractC2483j3<R0> implements NativeAdListener, E0 {
    private AdapterNativeAdData r;
    private AdapterNativeAdViewBinder s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367cc(InterfaceC2619qd threadInterface, C2552n0 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C2440gd c2440gd, C2608q2 item, R0 r0) {
        super(threadInterface, adSmashData, baseAdAdapter, new C2392e1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), item, r0);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.g = c2440gd;
    }

    private final void J() {
        C2514kg c2514kg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e != AbstractC2483j3.h.FAILED) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{k(), this.e}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            F0 f0 = this.d;
            if (f0 == null || (c2514kg = f0.j) == null) {
                return;
            }
            c2514kg.q(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2367cc this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC2483j3
    protected void G() {
        C2514kg c2514kg;
        if (!(this.c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            F0 f0 = this.d;
            if (f0 == null || (c2514kg = f0.j) == null) {
                return;
            }
            c2514kg.g("activity must not be null");
            return;
        }
        Object obj = this.c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final void P() {
        C2514kg c2514kg;
        C2760yb c2760yb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC2483j3.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null && (c2514kg = f0.j) != null) {
                c2514kg.g(str);
            }
        }
        F0 f02 = this.d;
        if (f02 == null || (c2760yb = f02.f) == null) {
            return;
        }
        Integer sessionDepth = r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        c2760yb.a(sessionDepth.intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.r;
    }

    public final AdapterNativeAdViewBinder R() {
        return this.s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.cc$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C2367cc.a(C2367cc.this, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC2483j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new Runnable() { // from class: com.ironsource.cc$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C2367cc.a(C2367cc.this);
                }
            });
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2367cc this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC2483j3, com.ironsource.E0
    public Map<String, Object> a(C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
