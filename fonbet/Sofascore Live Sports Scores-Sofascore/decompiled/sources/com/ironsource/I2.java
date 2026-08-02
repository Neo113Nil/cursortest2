package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4085g3;
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
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class I2 extends AbstractC4085g3<InterfaceC4314t0> implements BannerAdListener, D0 {
    public static final String t = "bannerLayout";
    public static final String u = "bannerSize";
    private final com.ironsource.mediationsdk.o r;
    private final boolean s;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.ironsource.environment.thread.a {
        final /* synthetic */ View b;
        final /* synthetic */ FrameLayout.LayoutParams c;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.b = view;
            this.c = layoutParams;
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            I2.this.a(this.b, this.c);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b extends com.ironsource.environment.thread.a {
        public b() {
        }

        @Override // com.ironsource.environment.thread.a
        public void a() {
            I2.this.J();
        }
    }

    public I2(InterfaceC4256pd interfaceC4256pd, C4207n0 c4207n0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, com.ironsource.mediationsdk.o oVar, C4077fd c4077fd, boolean z, C4227o2 c4227o2, InterfaceC4314t0 interfaceC4314t0) {
        super(interfaceC4256pd, c4207n0, baseAdAdapter, new C4011c1(c4207n0.g(), c4207n0.g().getBannerSettings(), IronSource.a.BANNER), c4227o2, interfaceC4314t0);
        this.r = oVar;
        this.g = c4077fd;
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
        if (this.e == AbstractC4085g3.h.FAILED) {
            return;
        }
        ironLog.error("unexpected onAdOpened for " + k() + ", state - " + this.e);
        if (this.d != null) {
            this.d.j.q("unexpected onAdOpened, state - " + this.e);
        }
    }

    @Override // com.ironsource.AbstractC4085g3
    public void G() {
        Object obj = this.c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.k, ContextProvider.getInstance().getCurrentActiveActivity(), this.r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC4085g3
    public boolean O() {
        return false;
    }

    public void P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC4085g3.h.NONE);
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
            C4157k4.d().a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.e;
            IronLog.INTERNAL.error(a(str));
            E0 e0 = this.d;
            if (e0 != null) {
                e0.j.g(str);
            }
        }
        E0 e02 = this.d;
        if (e02 != null) {
            e02.f.a(r().intValue());
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

    @Override // com.ironsource.AbstractC4085g3, com.ironsource.D0
    public Map<String, Object> a(B0 b0) {
        Map<String, Object> a2 = super.a(b0);
        com.ironsource.mediationsdk.o oVar = this.r;
        if (oVar != null && !oVar.b()) {
            com.ironsource.mediationsdk.j.a(a2, this.r.getSize());
        }
        if (this.g != null) {
            a2.put("placement", j());
        }
        return a2;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        E0 e0;
        C4077fd c4077fd = this.g;
        if (c4077fd != null && (e0 = this.d) != null) {
            e0.i.f(c4077fd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4314t0) listener).c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        if (u().c()) {
            u().a(new a(view, layoutParams));
        } else {
            a(view, layoutParams);
        }
    }

    @Override // com.ironsource.AbstractC4085g3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().c()) {
            u().a(new b());
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        E0 e0;
        C4077fd c4077fd = this.g;
        if (c4077fd != null && (e0 = this.d) != null) {
            e0.i.c(c4077fd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4314t0) listener).b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        E0 e0;
        C4077fd c4077fd = this.g;
        if (c4077fd != null && (e0 = this.d) != null) {
            e0.i.h(c4077fd.c());
        }
        Listener listener = this.b;
        if (listener != 0) {
            ((InterfaceC4314t0) listener).f(this);
        }
    }

    @Override // com.ironsource.AbstractC4085g3
    public boolean v() {
        return this.s;
    }

    @Override // com.ironsource.AbstractC4085g3
    public Map<String, Object> a(Map<String, Object> map) {
        Map<String, Object> a2 = super.a(map);
        C4207n0 c4207n0 = this.a;
        if (c4207n0 != null && this.r != null && TextUtils.isEmpty(c4207n0.g().getCustomNetwork())) {
            a2.put(t, this.r);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!y() || (listener = this.b) == 0) {
            return;
        }
        ((InterfaceC4314t0) listener).a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC4085g3
    public AdData a(String str, Map<String, Object> map) {
        return new AdData(str, q(), a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
    }
}
