package com.ironsource;

import android.app.Activity;
import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
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
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* renamed from: com.ironsource.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2451h6 extends B implements InterstitialAdListener, RewardedVideoAdListener, AdapterAdRewardListener {
    private C2432g5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2451h6(V0 adTools, C instanceData, I adInstancePayload) {
        super(adTools, instanceData, adInstancePayload, null, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
    }

    private final List<String> K() {
        JSONObject optJSONObject = new O6().a(new String[]{M6.u}).optJSONObject(M6.u);
        if (optJSONObject == null) {
            return CollectionsKt.emptyList();
        }
        Object opt = optJSONObject.opt(M6.C);
        List list = opt instanceof List ? (List) opt : null;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next()));
        }
        return arrayList;
    }

    private final InterfaceC2469i6 L() {
        F s = s();
        if (s instanceof InterfaceC2469i6) {
            return (InterfaceC2469i6) s;
        }
        return null;
    }

    private final Map<String, Object> M() {
        Map createMapBuilder = MapsKt.createMapBuilder();
        for (String str : K()) {
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{"="}, false, 2, 2, (Object) null);
            if (split$default.size() < 2) {
                IronLog.INTERNAL.warning(a("\"" + str + "\" is not a valid key=value format"));
            } else {
                createMapBuilder.put(ContentMetadata.KEY_CUSTOM_PREFIX + ((String) split$default.get(0)), (String) split$default.get(1));
            }
        }
        return MapsKt.build(createMapBuilder);
    }

    private final void N() {
        if (w()) {
            f().e().h().l("closed after failure");
            return;
        }
        this.y = new C2432g5();
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().a(k(), "");
        InterfaceC2469i6 L = L();
        if (L != null) {
            L.b(this);
        }
        c();
    }

    private final void O() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().d(k());
    }

    private final void P() {
        if (w()) {
            f().e().h().l("rewarded after failure");
            return;
        }
        Map<String, Object> M = M();
        long currentTimeMillis = System.currentTimeMillis();
        String a = f().a(currentTimeMillis, p());
        long a2 = C2432g5.a(this.y);
        LevelPlayReward a3 = Jb.u.d().C().a(k(), n().j().b().c());
        f().e().a().a(k(), a3.getName(), a3.getAmount(), currentTimeMillis, a, a2, M, f().j());
        InterfaceC2469i6 L = L();
        if (L != null) {
            L.a(this, a3);
        }
    }

    private final void Q() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        InterfaceC2469i6 L = L();
        if (L != null) {
            L.a(this);
        }
    }

    private final void R() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().i(k());
    }

    private final void S() {
        IronLog.INTERNAL.verbose(B.a(this, (String) null, 1, (Object) null));
        f().e().a().k(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.S();
    }

    @Override // com.ironsource.B
    protected void C() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterAdFullScreenInterface) g).loadAd(n().h(), ContextProvider.getInstance().getActiveContext(), this);
    }

    @Override // com.ironsource.B
    public void a(K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.B
    public void c() {
        if (!(g() instanceof AdapterAdFullScreenInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterAdFullScreenInterface"));
            return;
        }
        Object g = g();
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<*>");
        ((AdapterAdFullScreenInterface) g).destroyAd(n().h());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.a(C2451h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.b(C2451h6.this);
            }
        });
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        onAdOpened(new LinkedHashMap());
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.d(C2451h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.e(C2451h6.this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.f(C2451h6.this);
            }
        });
    }

    public final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + k()));
        try {
            f().e().a().a(activity, k());
            if (!(g() instanceof AdapterAdFullScreenInterface)) {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                f().e().h().g("showAd - adapter not instance of AdapterAdFullScreenInterface");
            } else {
                Object g = g();
                Intrinsics.checkNotNull(g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
                ((AdapterAdFullScreenInterface) g).showAd(i(), activity, this);
            }
        } catch (Throwable th) {
            C2556n4.d().a(th);
            String str = "showAd - exception = " + th.getMessage();
            IronLog.INTERNAL.error(a(str));
            f().e().h().g(str);
            a(B0.h(n().i()), str);
        }
    }

    @Override // com.ironsource.B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        super.onAdOpened(extraData);
        a(new Runnable() { // from class: com.ironsource.h6$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C2451h6.c(C2451h6.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2451h6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.N();
    }
}
