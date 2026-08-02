package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import xsna.c5g;
import xsna.cs2;
import xsna.drm0;
import xsna.go9;
import xsna.hv2;
import xsna.vk9;
import xsna.yh9;
import xsna.z27;

/* renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4382j6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {
    private C4328g5 z;

    public C4382j6(V0 v0, C c, I i) {
        super(v0, c, i, null, null, 24, null);
    }

    private final void Q() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC4400k6 L = L();
        if (L != null) {
            L.a(this);
        }
    }

    private final void R() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().i(k());
    }

    private final void S() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4382j6 c4382j6) {
        c4382j6.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4382j6 c4382j6) {
        c4382j6.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4382j6 c4382j6) {
        c4382j6.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C4382j6 c4382j6) {
        c4382j6.S();
    }

    @Override // com.ironsource.B
    public void C() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) g()).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    @Override // com.ironsource.B
    public void a(K k) {
        k.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (g() instanceof AdapterAdFullScreenInterface) {
            ((AdapterAdFullScreenInterface) g()).destroyAd(n().h());
        } else {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new hv2(this, 20));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new vk9(this, 15));
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new io.reactivex.rxjava3.android.a(this, 19));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new yh9(this, 18));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new cs2(this, 22));
    }

    private final List<String> K() {
        JSONObject optJSONObject = new Q6().a(new String[]{O6.u}).optJSONObject(O6.u);
        if (optJSONObject == null) {
            return EmptyList.b;
        }
        Object opt = optJSONObject.opt(O6.C);
        List list = opt instanceof List ? (List) opt : null;
        if (list == null) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final InterfaceC4400k6 L() {
        F s = s();
        if (s instanceof InterfaceC4400k6) {
            return (InterfaceC4400k6) s;
        }
        return null;
    }

    private final Map<String, Object> M() {
        MapBuilder mapBuilder = new MapBuilder();
        for (String str : K()) {
            List c0 = drm0.c0(str, new String[]{"="}, 2, 2);
            if (c0.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                String str2 = (String) c0.get(0);
                mapBuilder.put("custom_" + str2, (String) c0.get(1));
            }
        }
        return mapBuilder.h();
    }

    private final void N() {
        if (w()) {
            f().d().h().l("closed after failure");
            return;
        }
        if (!z()) {
            a(1000, "ad closed before ad opened");
            return;
        }
        this.z = new C4328g5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().a(k(), "");
        InterfaceC4400k6 L = L();
        if (L != null) {
            L.b(this);
        }
        c();
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().d().a().d(k());
    }

    private final void P() {
        if (w()) {
            f().d().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> M = M();
        long currentTimeMillis = System.currentTimeMillis();
        String a = f().a(currentTimeMillis, p());
        long a2 = C4328g5.a(this.z);
        LevelPlayReward a3 = Kb.u.d().C().a(k(), n().j().b().c());
        f().d().a().a(k(), a3.getName(), a3.getAmount(), currentTimeMillis, a, a2, M, f().i());
        InterfaceC4400k6 L = L();
        if (L != null) {
            L.a(this, a3);
        }
    }

    public final void a(Activity activity) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().d().a().a(activity, k());
            if (g() instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) g()).showAd(i(), activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().d().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            }
        } catch (Throwable th) {
            C4452n4.d().a(th);
            String b = go9.b("showAd - exception = ", th.getMessage());
            IronLog.INTERNAL.error(a(b));
            f().d().h().g(b);
            a(B0.h(n().i()), b);
        }
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> map) {
        super.onAdOpened(map);
        a(new z27(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4382j6 c4382j6) {
        c4382j6.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4382j6 c4382j6) {
        c4382j6.N();
    }
}
