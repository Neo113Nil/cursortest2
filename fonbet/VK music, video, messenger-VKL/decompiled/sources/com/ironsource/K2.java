package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4379j3;
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

/* loaded from: classes13.dex */
public class K2 extends AbstractC4379j3<InterfaceC4555t0> implements BannerAdListener, E0 {
    public static final String t = "bannerLayout";
    public static final String u = "bannerSize";
    private final com.ironsource.mediationsdk.o r;
    private final boolean s;

    public class a extends AbstractRunnableC4408ke {
        final /* synthetic */ View b;
        final /* synthetic */ FrameLayout.LayoutParams c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.b = view;
            this.c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            K2.this.a(this.b, this.c);
        }
    }

    public class b extends AbstractRunnableC4408ke {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4408ke
        public void a() {
            K2.this.J();
        }
    }

    public K2(InterfaceC4515qd interfaceC4515qd, C4448n0 c4448n0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.o oVar, C4336gd c4336gd, boolean z, C4504q2 c4504q2, InterfaceC4555t0 interfaceC4555t0) {
        super(interfaceC4515qd, c4448n0, baseAdAdapter, new C4288e1(c4448n0.g(), c4448n0.g().getBannerSettings(), IronSource.a.BANNER), c4504q2, interfaceC4555t0);
        this.r = oVar;
        this.g = c4336gd;
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
        if (this.e == AbstractC4379j3.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + k() + ", state - " + this.e);
        if (this.d != null) {
            this.d.j.q("unexpected onAdOpened, state - " + this.e);
        }
    }

    @Override // com.ironsource.AbstractC4379j3
    public void G() {
        Object obj = this.c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC4379j3
    public boolean O() {
        return false;
    }

    public void R() {
        Object obj = this.c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.k);
        }
    }

    @Override // com.ironsource.AbstractC4379j3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        F0 f0;
        C4336gd c4336gd = this.g;
        if (c4336gd != null && (f0 = this.d) != null) {
            f0.i.f(c4336gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4555t0) listener).c(this);
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

    @Override // com.ironsource.AbstractC4379j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
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
        C4336gd c4336gd = this.g;
        if (c4336gd != null && (f0 = this.d) != null) {
            f0.i.c(c4336gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4555t0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        F0 f0;
        C4336gd c4336gd = this.g;
        if (c4336gd != null && (f0 = this.d) != null) {
            f0.i.h(c4336gd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4555t0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC4379j3
    public boolean v() {
        return this.s;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4379j3.h.NONE);
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
            C4452n4.d().a(th);
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

    @Override // com.ironsource.AbstractC4379j3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a2 = super.a(map);
        C4448n0 c4448n0 = this.a;
        if (c4448n0 != null && this.r != null && TextUtils.isEmpty(c4448n0.g().getCustomNetwork())) {
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
        ((InterfaceC4555t0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC4379j3, com.ironsource.E0
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

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
    }
}
