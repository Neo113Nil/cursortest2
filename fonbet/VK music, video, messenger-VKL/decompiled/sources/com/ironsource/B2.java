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
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.go9;
import xsna.ou5;
import xsna.pn00;
import xsna.pu5;
import xsna.xj3;
import xsna.yn2;

/* loaded from: classes13.dex */
public final class B2 extends B implements BannerAdListener {
    private FrameLayout.LayoutParams A;
    private View z;

    public B2(V0 v0, C c, I i, D2 d2) {
        super(v0, c, i, null, null, 24, null);
        a(d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(B2 b2) {
        b2.O();
    }

    @Override // com.ironsource.B
    public void C() {
        if (!(g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData i = i();
        ISBannerSize L = L();
        i.getAdUnitData().put(K2.t, new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), L));
        ((AdapterBannerInterface) g()).loadAd(i, ContextProvider.getInstance().getCurrentActiveActivity(), L, this);
    }

    @Override // com.ironsource.B
    public void a(K k) {
        k.a(this);
    }

    @Override // com.ironsource.B
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        C4602vb.a(f(), new xsna.d0(this, 1), 0L, 2, null);
        if (g() == null) {
            ironLog.warning("adapter == null");
        } else {
            c();
            super.b();
        }
    }

    @Override // com.ironsource.B
    public void c() {
        try {
            if (g() instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) g()).destroyAd(i());
            } else {
                IronLog.INTERNAL.error(a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("destroyBanner - exception = ", th.getLocalizedMessage());
            IronLog.INTERNAL.error(a(b));
            f().d().h().g(b);
        }
    }

    @Override // com.ironsource.B
    public LevelPlayAdInfo e() {
        return new LevelPlayAdInfo(n().j().b().b().toString(), n().j().b().c(), n().i().toString(), n().o(), ((M2) n().j()).b().i(), n().j().l(), pn00.t(l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        a(new ou5(this, 0));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        onAdLoadSuccess(view, layoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> map) {
        a(new xsna.i0(1, this, map));
        super.onAdOpened(map);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        a(new xsna.g0(this, 4));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        a(new pu5(this, 0));
    }

    private final D2 K() {
        F s = s();
        if (s instanceof D2) {
            return (D2) s;
        }
        return null;
    }

    private final ISBannerSize L() {
        return f().a(((M2) n().j()).b().i());
    }

    private final void M() {
        C4336gd j = j();
        if (j != null) {
            f().d().a().f(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.a(this);
        }
    }

    private final void N() {
        C4336gd j = j();
        if (j != null) {
            f().d().a().c(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.b(this);
        }
    }

    private final void O() {
        C4336gd j = j();
        if (j != null) {
            f().d().a().h(j.c());
        }
        D2 K = K();
        if (K != null) {
            K.c(this);
        }
    }

    public final void a(Eg eg) {
        C4602vb.a(f(), new xsna.e0(2, this, eg), 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map<String, Object> map) {
        C4602vb.a(f(), new xj3(this, view, layoutParams, 1), 0L, 2, null);
        super.onAdLoadSuccess(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 b2, Eg eg) {
        FrameLayout.LayoutParams layoutParams;
        View view = b2.z;
        if (view == null || (layoutParams = b2.A) == null) {
            return;
        }
        eg.a(view, layoutParams, b2.f());
        IronLog.INTERNAL.verbose(C4484p0.a(b2.f(), "Bind banner view", (String) null, 2, (Object) null));
        b2.f().c(new yn2(b2, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B2 b2) {
        b2.M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 b2) {
        b2.z = null;
        b2.A = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 b2, View view, FrameLayout.LayoutParams layoutParams) {
        b2.z = view;
        b2.A = layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(B2 b2) {
        String str;
        O a = b2.f().d().a();
        C4336gd j = b2.j();
        if (j == null || (str = j.c()) == null) {
            str = "";
        }
        a.j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(B2 b2, Map map) {
        b2.l().putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B2 b2) {
        b2.N();
    }
}
