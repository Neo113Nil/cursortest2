package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC2483j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* loaded from: classes4.dex */
public class K2 extends AbstractC2483j3<InterfaceC2659t0> implements BannerAdListener, E0 {
    public static final String t = "bannerLayout";
    public static final String u = "bannerSize";
    private final com.ironsource.mediationsdk.o r;
    private final boolean s;

    class a extends AbstractRunnableC2512ke {
        final /* synthetic */ View b;
        final /* synthetic */ FrameLayout.LayoutParams c;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.b = view;
            this.c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            K2.this.a(this.b, this.c);
        }
    }

    class b extends AbstractRunnableC2512ke {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC2512ke
        public void a() {
            K2.this.J();
        }
    }

    public K2(InterfaceC2619qd interfaceC2619qd, C2552n0 c2552n0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.o oVar, C2440gd c2440gd, boolean z, C2608q2 c2608q2, InterfaceC2659t0 interfaceC2659t0) {
        super(interfaceC2619qd, c2552n0, baseAdAdapter, new C2392e1(c2552n0.g(), c2552n0.g().getBannerSettings(), IronSource.a.BANNER), c2608q2, interfaceC2659t0);
        this.r = oVar;
        this.g = c2440gd;
        this.s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.e == AbstractC2483j3.h.FAILED) {
            return;
        }
        ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", k(), this.e));
        if (this.d != null) {
            this.d.j.q(String.format("unexpected onAdOpened, state - %s", this.e));
        }
    }

    @Override // com.ironsource.AbstractC2483j3
    protected void G() {
        Object obj = this.c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC2483j3
    protected boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC2483j3.h.NONE);
        Object obj = this.c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.k);
            } else {
                ironLog.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            F0 f0 = this.d;
            if (f0 != null) {
                f0.j.g(str);
            }
        }
        F0 f02 = this.d;
        if (f02 != null) {
            f02.f.a(r().intValue());
        }
    }

    public void Q() {
        Object obj = this.c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.k);
        }
    }

    public void R() {
        Object obj = this.c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.k);
        }
    }

    @Override // com.ironsource.AbstractC2483j3
    protected AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        F0 f0;
        C2440gd c2440gd = this.g;
        if (c2440gd != null && (f0 = this.d) != null) {
            f0.i.f(c2440gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC2659t0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC2483j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        F0 f0;
        C2440gd c2440gd = this.g;
        if (c2440gd != null && (f0 = this.d) != null) {
            f0.i.c(c2440gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC2659t0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        F0 f0;
        C2440gd c2440gd = this.g;
        if (c2440gd != null && (f0 = this.d) != null) {
            f0.i.h(c2440gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC2659t0) listener).f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
    }

    @Override // com.ironsource.AbstractC2483j3
    protected boolean v() {
        return this.s;
    }

    @Override // com.ironsource.AbstractC2483j3
    protected Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a2 = super.a(map);
        C2552n0 c2552n0 = this.a;
        if (c2552n0 != null && this.r != null && TextUtils.isEmpty(c2552n0.g().getCustomNetwork())) {
            a2.put(t, this.r);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.b) == 0) {
            return;
        }
        ((InterfaceC2659t0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC2483j3, com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> a2 = super.a(c0);
        com.ironsource.mediationsdk.o oVar = this.r;
        if (oVar != null && !oVar.b()) {
            com.ironsource.mediationsdk.j.a(a2, this.r.getSize());
        }
        if (this.g != null) {
            a2.put("placement", j());
        }
        return a2;
    }
}
