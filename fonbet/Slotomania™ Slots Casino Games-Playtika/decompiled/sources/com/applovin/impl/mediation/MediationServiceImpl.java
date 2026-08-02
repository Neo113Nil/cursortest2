package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.a3;
import com.applovin.impl.b5;
import com.applovin.impl.c3;
import com.applovin.impl.d5;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.e5;
import com.applovin.impl.f2;
import com.applovin.impl.f5;
import com.applovin.impl.f6;
import com.applovin.impl.h2;
import com.applovin.impl.i;
import com.applovin.impl.j3;
import com.applovin.impl.k5;
import com.applovin.impl.l6;
import com.applovin.impl.m3;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.q6;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.u3;
import com.applovin.impl.u4;
import com.applovin.impl.v2;
import com.applovin.impl.v3;
import com.applovin.impl.x6;
import com.applovin.impl.y3;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    private final l a;
    private final p b;
    private final d5 c;
    private final AtomicReference d = new AtomicReference();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MaxAdapter.InitializationStatus.values().length];
            a = iArr;
            try {
                iArr[MaxAdapter.InitializationStatus.DOES_NOT_APPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MaxAdapter.InitializationStatus.NOT_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MaxAdapter.InitializationStatus.INITIALIZING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class b implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.InterfaceC0103a {
        private final a3 a;
        private a.InterfaceC0103a b;

        public b(a3 a3Var, a.InterfaceC0103a interfaceC0103a) {
            this.a = a3Var;
            this.b = interfaceC0103a;
        }

        public void a(a.InterfaceC0103a interfaceC0103a) {
            this.b = interfaceC0103a;
        }

        public void b(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            v2.b(this.b, maxAd);
        }

        public void c(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.e0();
            p unused = MediationServiceImpl.this.b;
            if (p.a()) {
                MediationServiceImpl.this.b.a("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.a, this.b);
            if (!((Boolean) MediationServiceImpl.this.a.a(t3.J8)).booleanValue() || this.a.u().compareAndSet(false, true)) {
                MediationServiceImpl.this.a.m().a(this.a, h.c.SHOW);
                MediationServiceImpl.this.a.u().b(this.a, "DID_DISPLAY");
                if (maxAd.getFormat().isFullscreenAd()) {
                    MediationServiceImpl.this.a.J().a(this.a);
                }
                v2.c(this.b, maxAd);
            }
        }

        public void d(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            v2.d(this.b, maxAd);
        }

        public void e(final MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.f0();
            MediationServiceImpl.this.a.m().a(this.a, h.c.HIDE);
            MediationServiceImpl.this.a(this.a);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.b.this.a(maxAd);
                }
            }, maxAd instanceof e3 ? ((e3) maxAd).o0() : 0L);
        }

        public void f(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            this.a.h0();
            MediationServiceImpl.this.a.m().a(this.a, h.c.LOAD);
            MediationServiceImpl.this.b(this.a);
            v2.f(this.b, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            a(maxAd, maxError, (Bundle) null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            e(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.a.h0();
            MediationServiceImpl.this.b(this.a, maxError, this.b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            f(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            a(maxAd, maxReward, (Bundle) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.a.J().b(maxAd);
            }
            v2.e(this.b, maxAd);
        }

        public void a(MaxAd maxAd, Bundle bundle) {
            this.a.a(bundle);
            MediationServiceImpl.this.a.m().a(this.a, h.c.CLICK);
            MediationServiceImpl.this.a(this.a, this.b);
            v2.a((MaxAdListener) this.b, maxAd);
        }

        public void a(MaxAd maxAd, MaxError maxError, Bundle bundle) {
            this.a.a(bundle);
            this.a.d0();
            MediationServiceImpl.this.a(this.a, maxError, this.b);
            if (maxAd.getFormat() == MaxAdFormat.REWARDED && (maxAd instanceof e3)) {
                ((e3) maxAd).m0();
            }
        }

        public void a(MaxAd maxAd, MaxReward maxReward, Bundle bundle) {
            this.a.a(bundle);
            v2.a(this.b, maxAd, maxReward);
            MediationServiceImpl.this.a.s0().a((k5) new q6((e3) maxAd, MediationServiceImpl.this.a), f6.b.OTHER);
        }
    }

    public MediationServiceImpl(l lVar) {
        this.a = lVar;
        this.b = lVar.Q();
        this.c = new d5(lVar);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    public void collectSignal(final f5 f5Var, Context context, final e5.a aVar) {
        if (f5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        c3 u = f5Var.u();
        final String b2 = u.b();
        final MaxAdFormat a2 = u.a();
        e5 b3 = this.c.b(f5Var, b2, a2);
        if (b3 != null) {
            aVar.a(e5.a(b3));
            return;
        }
        final h a3 = this.a.V().a(f5Var, f5Var.A());
        if (a3 == null) {
            aVar.a(e5.a(f5Var, new MaxErrorImpl("Could not load adapter")));
            return;
        }
        final u4 u4Var = new u4("SignalCollection:" + f5Var.c());
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        Executor executor = u4.j;
        u4Var.a(executor, new u4.b() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda4
            @Override // com.applovin.impl.u4.b
            public final void a(boolean z, Object obj, Object obj2) {
                MediationServiceImpl.this.a(elapsedRealtime, a3, b2, f5Var, a2, aVar, z, (String) obj, (MaxError) obj2);
            }
        });
        l6.a(f5Var.m(), u4Var, new MaxErrorImpl(MaxAdapterError.ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "The adapter (" + f5Var.c() + ") timed out collecting signal"), "MediationService", this.a);
        final Activity w0 = context instanceof Activity ? (Activity) context : this.a.w0();
        final MaxAdapterParametersImpl a4 = MaxAdapterParametersImpl.a(f5Var, b2, a2);
        if (f5Var.w()) {
            u4 a5 = this.a.U().a(f5Var, w0);
            a5.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(u4Var, a3, a4, f5Var, w0);
                }
            });
            a5.a(executor, new u4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda6
                @Override // com.applovin.impl.u4.a
                public final void a(Object obj) {
                    MediationServiceImpl.this.a(a3, u4Var, (String) obj);
                }
            });
            return;
        }
        if (f5Var.x()) {
            u4 a6 = this.a.U().a(f5Var, w0);
            if (a6.e() && !f5Var.z()) {
                if (p.a()) {
                    this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + a3.g());
                }
                u4Var.a(new MaxErrorImpl("Could not initialize adapter: " + ((String) a6.b())));
                return;
            }
        }
        if (p.a()) {
            this.b.a("MediationService", "Collecting signal for adapter: " + a3.g());
        }
        a3.a(a4, f5Var, w0, u4Var);
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof a3) {
            if (p.a()) {
                this.b.d("MediationService", "Destroying " + maxAd);
            }
            a3 a3Var = (a3) maxAd;
            h B = a3Var.B();
            if (B != null) {
                B.a();
                a3Var.t();
            }
            this.a.k().c(a3Var.T());
            this.a.m().a(a3Var, h.c.DESTROY);
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return (JSONObject) this.d.getAndSet(null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, i iVar, Map<String, Object> map, Map<String, Object> map2, Context context, a.InterfaceC0103a interfaceC0103a) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No Ad Unit ID specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC0103a == null) {
            throw new IllegalArgumentException("No listener specified");
        }
        if (TextUtils.isEmpty(this.a.X())) {
            p.h("AppLovinSdk", "Mediation provider is null. Please set the mediation provider in the AppLovinSdkInitializationConfiguration.Builder when initializing the AppLovinSDK.");
        }
        if (!this.a.D0()) {
            p.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        List<String> adUnitIds = this.a.L() != null ? this.a.L().getAdUnitIds() : null;
        boolean startsWith = str.startsWith("test_mode");
        if (adUnitIds != null && adUnitIds.size() > 0 && !adUnitIds.contains(str) && !startsWith) {
            if (q7.c(this.a)) {
                String str3 = "Ad Unit ID " + str + " has not been initialized. When you use selective init, any ad units that you do not explicitly specify are excluded from serving ads for the current session. For more information visit our docs: https://support.axon.ai/en/max/android/overview/advanced-settings#selective-init";
                if (((Boolean) this.a.a(z4.F6)).booleanValue()) {
                    throw new RuntimeException(str3);
                }
                if (p.a()) {
                    this.b.b("MediationService", str3);
                }
            }
            this.a.E().a(f2.b1, "uninitialized_ad_unit_id", CollectionUtils.hashMap("ad_unit_id", str), "uninitialized_ad_unit_id" + str);
        }
        this.a.c();
        if (str.length() != 16 && !startsWith && !this.a.k0().startsWith("05TMD")) {
            p.h("MediationService", "Ad unit ID provided for " + maxAdFormat.getLabel() + " is invalid (" + str + "). Expected length: 16 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (this.a.a(maxAdFormat)) {
            p.h("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
            v2.a(interfaceC0103a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
            return;
        }
        this.a.W0();
        v2.a((MaxAdRequestListener) interfaceC0103a, str, true);
        if (this.a.T() != null) {
            this.a.T().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0103a);
        } else {
            this.a.S().a(str, str2, maxAdFormat, iVar, map, map2, context, interfaceC0103a);
        }
    }

    public void loadThirdPartyMediatedAd(final String str, final a3 a3Var, final Activity activity, final a.InterfaceC0103a interfaceC0103a) {
        u4 u4Var;
        if (a3Var == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (p.a()) {
            this.b.a("MediationService", "Loading " + a3Var + "...");
        }
        this.a.R().a(f2.l0, a3Var, CollectionUtils.hashMap("details", "sdk_initialized=" + this.a.D0()));
        this.a.m().a(a3Var, h.c.LOADING);
        this.a.u().b(a3Var, "WILL_LOAD");
        final h a2 = this.a.V().a(a3Var);
        if (a2 == null) {
            String str2 = "Failed to load " + a3Var + ": adapter not loaded";
            p.h("MediationService", str2);
            b(a3Var, new MaxErrorImpl(-5001, str2), interfaceC0103a);
            return;
        }
        final MaxAdapterParametersImpl a3 = MaxAdapterParametersImpl.a(a3Var);
        if (a3Var.b0()) {
            u4Var = this.a.U().a(a3Var, activity);
        } else {
            if (a3Var.c0()) {
                this.a.U().a(a3Var, activity);
            }
            u4Var = null;
        }
        final a3 a4 = a3Var.a(a2);
        a2.a(str, a4);
        a4.i0();
        if (u4Var == null) {
            a2.a(str, a3, a4, activity, new b(a4, interfaceC0103a));
            return;
        }
        Executor executor = u4.j;
        u4Var.a(executor, new u4.a() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda7
            @Override // com.applovin.impl.u4.a
            public final void a(Object obj) {
                MediationServiceImpl.this.a(a3Var, interfaceC0103a, (String) obj);
            }
        });
        u4Var.a(executor, new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(a2, str, a3, a4, activity, interfaceC0103a);
            }
        });
    }

    public void maybeFireAppKilledWhilePlayingMediatedAdPostback() {
        String str = (String) this.a.b(b5.R);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str, new JSONObject());
        if (a(JsonUtils.getLong(jsonObjectFromJsonString, "timestamp_ms", 0L))) {
            Long l = (Long) this.a.b(b5.S);
            String l2 = l != null ? l.toString() : "";
            JSONObject jSONObject = JsonUtils.getJSONObject(jsonObjectFromJsonString, "ad_info");
            Map tryToStringMap = jSONObject != null ? JsonUtils.tryToStringMap(jSONObject) : new HashMap(1);
            CollectionUtils.putStringIfValid("duration_ms", l2, tryToStringMap);
            this.a.E().d(f2.R0, tryToStringMap);
            List list = JsonUtils.getList(jsonObjectFromJsonString, "app_killed_urls", Collections.emptyList());
            if (CollectionUtils.isEmpty(list)) {
                if (p.a()) {
                    this.b.k("MediationService", "Unable to track app killed during mediated ad from previous run. Missing app killed tracking URLs.");
                }
            } else {
                JSONObject jSONObject2 = JsonUtils.getJSONObject(jsonObjectFromJsonString, "user_info");
                Map<String, String> tryToStringMap2 = jSONObject2 != null ? JsonUtils.tryToStringMap(jSONObject2) : y3.c(this.a);
                tryToStringMap2.put("{IMP_DURATION_MS}", l2);
                JSONObject jSONObject3 = JsonUtils.getJSONObject(jsonObjectFromJsonString, "postback_body");
                a("mappk", list, tryToStringMap2, jSONObject3 != null ? JsonUtils.tryToStringObjectMap(jSONObject3) : null, null, null, true);
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object a2 = this.a.J().a();
            if (a2 instanceof a3) {
                a((MaxError) MaxAdapterError.WEBVIEW_ERROR, (a3) a2, true);
            }
        }
    }

    public void processAdDisplayErrorPostbackForUserError(MaxError maxError, a3 a3Var) {
        a(maxError, a3Var, false);
    }

    public void processAdapterInitializationPostback(m3 m3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        a("minit", hashMap, new MaxErrorImpl(str), m3Var);
        Map a2 = h2.a(m3Var);
        CollectionUtils.putStringIfValid("adapter_init_status", String.valueOf(initializationStatus.getCode()), a2);
        CollectionUtils.putStringIfValid("error_message", str, a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j), a2);
        switch (a.a[initializationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.a.R().d(f2.e0, a2);
                break;
            case 4:
                this.a.R().d(f2.f0, a2);
                break;
            case 5:
            case 6:
                this.a.Q();
                if (p.a()) {
                    this.a.Q().k("MediationService", "Adapter init postback called while the adapter is not fully initialized.");
                }
                this.a.E().a(f2.d, "adapterNotInitializedForPostback", a2);
                break;
        }
    }

    public void processCallbackAdImpressionPostback(a3 a3Var, a.InterfaceC0103a interfaceC0103a) {
        if (a3Var.R().endsWith("cimp")) {
            this.a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0103a, (MaxAd) a3Var);
        }
        HashMap hashMap = new HashMap(2);
        if (a3Var instanceof e3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((e3) a3Var).x0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.a.y0().e());
        if (!((Boolean) this.a.a(z4.N3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mcimp", hashMap, a3Var);
        this.a.R().a(f2.q0, a3Var);
    }

    public void processRawAdImpression(a3 a3Var, a.InterfaceC0103a interfaceC0103a) {
        this.a.u().b(a3Var, "WILL_DISPLAY");
        if (a3Var.R().endsWith("mimp")) {
            this.a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0103a, (MaxAd) a3Var);
        }
        if (((Boolean) this.a.a(z4.R4)).booleanValue()) {
            this.a.a0().a(u3.g, v3.a(a3Var), Long.valueOf(System.currentTimeMillis() - this.a.M()));
        }
        HashMap hashMap = new HashMap(3);
        if (a3Var instanceof e3) {
            e3 e3Var = (e3) a3Var;
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(e3Var.s0()));
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(e3Var.x0()));
        }
        String emptyIfNull = StringUtils.emptyIfNull(this.a.y0().e());
        if (!((Boolean) this.a.a(z4.N3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mimp", hashMap, a3Var);
        this.a.R().a(f2.p0, a3Var);
    }

    public void processViewabilityAdImpressionPostback(j3 j3Var, long j, a.InterfaceC0103a interfaceC0103a) {
        if (j3Var.R().endsWith("vimp")) {
            this.a.u().b(j3Var);
            v2.a((MaxAdRevenueListener) interfaceC0103a, (MaxAd) j3Var);
        }
        HashMap hashMap = new HashMap(3);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(j3Var.t0()));
        String emptyIfNull = StringUtils.emptyIfNull(this.a.y0().e());
        if (!((Boolean) this.a.a(z4.N3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mvimp", hashMap, j3Var);
        this.a.R().a(f2.r0, j3Var);
    }

    public void processWaterfallInfoPostback(MaxAdWaterfallInfoImpl maxAdWaterfallInfoImpl, MaxError maxError, long j, long j2) {
        c3 requestParameters = maxAdWaterfallInfoImpl.getRequestParameters();
        String b2 = requestParameters.b();
        MaxAdFormat a2 = requestParameters.a();
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("ad_format", a2.getLabel(), hashMap);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(j2), hashMap);
        CollectionUtils.putStringIfValid("ad_event_id", maxAdWaterfallInfoImpl.getEventId(), hashMap);
        if (maxError != null) {
            hashMap.putAll(h2.a(maxError));
        }
        this.a.R().d(f2.o0, hashMap);
        if (CollectionUtils.isEmpty(maxAdWaterfallInfoImpl.getPostbackUrls())) {
            return;
        }
        HashMap hashMap2 = new HashMap(8);
        CollectionUtils.putStringIfValid("mcode", maxAdWaterfallInfoImpl.getMCode(), hashMap2);
        CollectionUtils.putStringIfValid("ad_unit_id", b2, hashMap2);
        CollectionUtils.putStringIfValid("ad_format", a2.getLabel(), hashMap2);
        CollectionUtils.putStringIfValid("name", maxAdWaterfallInfoImpl.getName(), hashMap2);
        CollectionUtils.putLongIfValid("request_latency_ms", Long.valueOf(j2), hashMap2);
        CollectionUtils.putLongIfValid("request_start_timestamp_ms", Long.valueOf(j), hashMap2);
        CollectionUtils.putLongIfValid("wf_latency_ms", Long.valueOf(maxAdWaterfallInfoImpl.getLatencyMillis()), hashMap2);
        hashMap2.put("arn_info", requestParameters.f().e());
        List<MaxNetworkResponseInfo> networkResponses = maxAdWaterfallInfoImpl.getNetworkResponses();
        ArrayList arrayList = new ArrayList(networkResponses.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : networkResponses) {
            MaxMediatedNetworkInfo mediatedNetwork = maxNetworkResponseInfo.getMediatedNetwork();
            HashMap hashMap3 = new HashMap(5);
            CollectionUtils.putStringIfValid("bcode", ((MaxNetworkResponseInfoImpl) maxNetworkResponseInfo).getBCode(), hashMap3);
            hashMap3.put("name", mediatedNetwork.getName());
            CollectionUtils.putLongIfValid("latency_ms", Long.valueOf(maxNetworkResponseInfo.getLatencyMillis()), hashMap3);
            hashMap3.put("load_state", Integer.valueOf(maxNetworkResponseInfo.getAdLoadState().ordinal()));
            MaxErrorImpl maxErrorImpl = (MaxErrorImpl) maxNetworkResponseInfo.getError();
            if (maxErrorImpl != null) {
                HashMap hashMap4 = new HashMap(4);
                hashMap4.put("error_code", Integer.valueOf(maxErrorImpl.getCode()));
                hashMap4.put("error_message", maxErrorImpl.getMessage());
                hashMap4.put("third_party_sdk_error_code", Integer.valueOf(maxErrorImpl.getMediatedNetworkErrorCode()));
                hashMap4.put("third_party_sdk_error_message", maxErrorImpl.getMediatedNetworkErrorMessage());
                hashMap3.put("error_info", hashMap4);
            }
            arrayList.add(hashMap3);
        }
        hashMap2.put("ads_info", arrayList);
        a("mwf_info", maxAdWaterfallInfoImpl.getPostbackUrls(), Collections.EMPTY_MAP, hashMap2, null, null, false);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.d.set(jSONObject);
    }

    public void showFullscreenAd(final e3 e3Var, final Activity activity, final Map<String, Object> map, final Map<String, Object> map2, final a.InterfaceC0103a interfaceC0103a) {
        if (e3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null && MaxAdFormat.APP_OPEN != e3Var.getFormat()) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.a.J().a(true);
        final h b2 = b(e3Var);
        long u0 = e3Var.u0();
        if (p.a()) {
            this.b.d("MediationService", "Showing ad " + e3Var.getAdUnitId() + " with delay of " + u0 + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(e3Var, b2, activity, interfaceC0103a, map, map2);
            }
        }, u0);
    }

    private h b(e3 e3Var) {
        h B = e3Var.B();
        if (B != null) {
            return B;
        }
        this.a.J().a(false);
        if (p.a()) {
            this.b.k("MediationService", "Failed to show " + e3Var + ": adapter not found");
        }
        p.h("MediationService", "There may be an integration problem with the adapter for Ad Unit ID '" + e3Var.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, h hVar, Activity activity, a.InterfaceC0103a interfaceC0103a, Map map, Map map2) {
        a(e3Var);
        hVar.b(e3Var, activity);
        a(e3Var, interfaceC0103a, activity, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, h hVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, a.InterfaceC0103a interfaceC0103a, Map map, Map map2) {
        a(e3Var);
        hVar.a(e3Var, viewGroup, lifecycle, activity);
        a(e3Var, interfaceC0103a, activity, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a3 a3Var, MaxError maxError, MaxAdListener maxAdListener) {
        a(maxError, a3Var);
        destroyAd(a3Var);
        v2.a(maxAdListener, a3Var.getAdUnitId(), maxError);
    }

    public void showFullscreenAd(final e3 e3Var, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity, final Map<String, Object> map, final Map<String, Object> map2, final a.InterfaceC0103a interfaceC0103a) {
        if (e3Var == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity != null) {
            this.a.J().a(true);
            final h b2 = b(e3Var);
            long u0 = e3Var.u0();
            if (p.a()) {
                this.b.d("MediationService", "Showing ad " + e3Var.getAdUnitId() + " with delay of " + u0 + "ms...");
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(e3Var, b2, viewGroup, lifecycle, activity, interfaceC0103a, map, map2);
                }
            }, u0);
            return;
        }
        throw new IllegalArgumentException("No activity specified");
    }

    private void a(e3 e3Var) {
        if (e3Var.getFormat() == MaxAdFormat.REWARDED) {
            this.a.s0().a((k5) new x6(e3Var, this.a), f6.b.OTHER);
        }
    }

    private void a(final e3 e3Var, a.InterfaceC0103a interfaceC0103a, final Activity activity, final Map map, final Map map2) {
        this.a.J().a(false);
        a(e3Var, (MaxAdListener) interfaceC0103a);
        if (p.a()) {
            this.b.a("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpression(e3Var, interfaceC0103a);
        if (((Boolean) this.a.a(t3.q8)).booleanValue() && this.a.T() == null && this.a.S().a((MaxAd) e3Var)) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MediationServiceImpl.this.a(e3Var, map, map2, activity);
                }
            }, ((Long) this.a.a(t3.r8)).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a3 a3Var) {
        this.a.u().b(a3Var, "DID_LOAD");
        if (a3Var.R().endsWith("load")) {
            this.a.u().b(a3Var);
        }
        HashMap hashMap = new HashMap(3);
        long I = a3Var.I();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(I));
        if (a3Var.getFormat().isFullscreenAd()) {
            o.a b2 = this.a.J().b(a3Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
            hashMap.put("{FAILOVER_LOAD}", String.valueOf(((e3) a3Var).z0()));
        }
        a("load", hashMap, a3Var);
        Map a2 = h2.a(a3Var);
        a2.put("duration_ms", String.valueOf(I));
        a2.put("details", "sdk_initialized=" + this.a.D0());
        this.a.R().d(f2.m0, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, Map map, Map map2, Activity activity) {
        this.a.S().a(e3Var.getAdUnitId(), (String) null, e3Var.getFormat(), i.SEQUENTIAL_OR_PRECACHE, map, map2, activity, (a.InterfaceC0103a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(a3 a3Var, a.InterfaceC0103a interfaceC0103a, String str) {
        String str2 = "Failed to load " + a3Var + ": adapter init failed with error: " + str;
        if (p.a()) {
            this.b.k("MediationService", str2);
        }
        b(a3Var, new MaxErrorImpl(MaxAdapterError.NOT_INITIALIZED.getErrorCode(), "Adapter initialization failed"), interfaceC0103a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, String str, MaxAdapterParametersImpl maxAdapterParametersImpl, a3 a3Var, Activity activity, a.InterfaceC0103a interfaceC0103a) {
        hVar.a(str, maxAdapterParametersImpl, a3Var, activity, new b(a3Var, interfaceC0103a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, h hVar, String str, f5 f5Var, MaxAdFormat maxAdFormat, e5.a aVar, boolean z, String str2, MaxError maxError) {
        e5 a2;
        String str3;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (z) {
            if (p.a()) {
                str3 = str2;
                this.b.a("MediationService", "Signal collection successful from: " + hVar.g() + " for Ad Unit ID: " + str + " with signal: \"" + str3 + "\"");
            } else {
                str3 = str2;
            }
            a2 = e5.a(f5Var, hVar, str3, j, elapsedRealtime);
            this.c.a(a2, f5Var, str, maxAdFormat);
            HashMap hashMap = new HashMap();
            CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, f5Var.c(), hashMap);
            CollectionUtils.putStringIfValid("adapter_class", f5Var.b(), hashMap);
            CollectionUtils.putStringIfValid("adapter_version", hVar.b(), hashMap);
            CollectionUtils.putStringIfValid("duration_ms", String.valueOf(elapsedRealtime), hashMap);
            CollectionUtils.putStringIfValid("ad_format", String.valueOf(maxAdFormat.getLabel()), hashMap);
            CollectionUtils.putStringIfValid("ad_unit_id", str, hashMap);
            this.a.R().d(f2.g0, hashMap);
        } else {
            if (p.a()) {
                this.b.b("MediationService", "Signal collection failed from: " + hVar.g() + " for Ad Unit ID: " + str + " with error message: \"" + maxError.getMessage() + "\"");
            }
            a2 = e5.a(f5Var, hVar, maxError, j, elapsedRealtime);
            a(a2, f5Var, hVar);
        }
        aVar.a(a2);
        hVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(u4 u4Var, h hVar, MaxAdapterParametersImpl maxAdapterParametersImpl, f5 f5Var, Activity activity) {
        if (u4Var.d()) {
            return;
        }
        if (p.a()) {
            this.b.a("MediationService", "Collecting signal for now-initialized adapter: " + hVar.g());
        }
        hVar.a(maxAdapterParametersImpl, f5Var, activity, u4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h hVar, u4 u4Var, String str) {
        if (p.a()) {
            this.b.b("MediationService", "Skip collecting signal for failed-initialized adapter: " + hVar.g());
        }
        u4Var.a(new MaxErrorImpl(MaxAdapterError.ERROR_CODE_NOT_INITIALIZED, "Could not initialize adapter: " + str));
    }

    private void a(final e3 e3Var, final MaxAdListener maxAdListener) {
        final Long l = (Long) this.a.a(t3.f8);
        if (l.longValue() <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MediationServiceImpl.this.a(e3Var, l, maxAdListener);
            }
        }, l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(e3 e3Var, Long l, MaxAdListener maxAdListener) {
        if (e3Var.u().get()) {
            return;
        }
        String str = "Ad (" + e3Var.k() + ") has not been displayed after " + l + "ms. Failing ad display...";
        p.h("MediationService", str);
        a(e3Var, new MaxErrorImpl(-1, str), maxAdListener);
        this.a.J().b(e3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, MaxError maxError, MaxAdListener maxAdListener) {
        this.a.m().a(a3Var, h.c.SHOW_ERROR);
        this.a.u().b(a3Var, "DID_FAIL_DISPLAY");
        a(maxError, a3Var, true);
        if (a3Var.u().compareAndSet(false, true)) {
            v2.a(maxAdListener, a3Var, maxError);
        }
    }

    private void a(MaxError maxError, a3 a3Var) {
        HashMap hashMap = new HashMap(3);
        long I = a3Var.I();
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(I));
        if (a3Var.getFormat().isFullscreenAd()) {
            o.a b2 = this.a.J().b(a3Var.getAdUnitId());
            hashMap.put("{SHOW_ATTEMPT_COUNT}", String.valueOf(b2.a()));
            hashMap.put("{SHOW_ATTEMPT_TIMESTAMP_MS}", String.valueOf(b2.b()));
            hashMap.put("{FAILOVER_LOAD}", String.valueOf(((e3) a3Var).z0()));
        }
        a("mlerr", hashMap, maxError, a3Var);
        Map a2 = h2.a(a3Var);
        a2.putAll(h2.a(maxError));
        a2.put("duration_ms", String.valueOf(I));
        a2.put("details", "sdk_initialized=" + this.a.D0());
        this.a.R().d(f2.n0, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var) {
        MediationServiceImpl mediationServiceImpl;
        a3 a3Var2;
        this.a.u().b(a3Var, "DID_HIDE");
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.y0().e());
        if (!((Boolean) this.a.a(z4.N3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        boolean z = a3Var.w().get();
        if (((Boolean) this.a.a(z4.W2)).booleanValue()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_hidden_callback_manually_invoked", Boolean.valueOf(z));
            mediationServiceImpl = this;
            a3Var2 = a3Var;
            mediationServiceImpl.a("mclose", null, hashMap, hashMap2, null, a3Var2, true);
        } else {
            mediationServiceImpl = this;
            a3Var2 = a3Var;
            a("mclose", hashMap, a3Var2);
        }
        long V = a3Var2.V();
        long K = a3Var2.K();
        Map map = CollectionUtils.map("duration_ms", String.valueOf(V));
        map.put("details", "foreground_duration_ms=" + K + ",ad_hidden_callback_manually_invoked=" + z);
        mediationServiceImpl.a.R().a(f2.t0, a3Var2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, a.InterfaceC0103a interfaceC0103a) {
        this.a.u().b(a3Var, "DID_CLICKED");
        this.a.u().b(a3Var, "DID_CLICK");
        if (a3Var.R().endsWith("click")) {
            this.a.u().b(a3Var);
            v2.a((MaxAdRevenueListener) interfaceC0103a, (MaxAd) a3Var);
        }
        HashMap hashMap = new HashMap(1);
        String emptyIfNull = StringUtils.emptyIfNull(this.a.y0().e());
        if (!((Boolean) this.a.a(z4.N3)).booleanValue()) {
            emptyIfNull = "";
        }
        hashMap.put("{CUID}", emptyIfNull);
        a("mclick", hashMap, a3Var);
    }

    private void a(MaxError maxError, a3 a3Var, boolean z) {
        HashMap hashMap = new HashMap(1);
        if (a3Var instanceof e3) {
            hashMap.put("{PREVIOUS_FAILED_NETWORK_NAME}", StringUtils.emptyIfNull(((e3) a3Var).x0()));
        }
        a("mierr", hashMap, maxError, a3Var, z);
        if (!z || a3Var == null) {
            return;
        }
        this.a.R().a(f2.s0, a3Var, maxError, CollectionUtils.map("duration_ms", String.valueOf(a3Var.G())));
    }

    private void a(e5 e5Var, f5 f5Var, h hVar) {
        long b2 = e5Var.b();
        HashMap hashMap = new HashMap(3);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(b2));
        CollectionUtils.putStringIfValid("{ADAPTER_VERSION}", hVar.b(), hashMap);
        CollectionUtils.putStringIfValid("{SDK_VERSION}", hVar.i(), hashMap);
        a("serr", hashMap, e5Var.c(), f5Var);
        Map a2 = h2.a(e5Var.c());
        CollectionUtils.putStringIfValid(BrandSafetyEvent.ad, f5Var.c(), a2);
        CollectionUtils.putStringIfValid("adapter_class", f5Var.b(), a2);
        CollectionUtils.putStringIfValid("adapter_version", hVar.b(), a2);
        CollectionUtils.putStringIfValid("duration_ms", String.valueOf(b2), a2);
        this.a.R().d(f2.h0, a2);
    }

    private void a(String str, Map map, m3 m3Var) {
        a(str, map, (MaxError) null, m3Var);
    }

    private void a(String str, Map map, MaxError maxError, m3 m3Var) {
        a(str, map, maxError, m3Var, true);
    }

    private void a(String str, Map map, MaxError maxError, m3 m3Var, boolean z) {
        String str2;
        Map map2 = CollectionUtils.map(map);
        String str3 = "";
        map2.put("{PLACEMENT}", z ? StringUtils.emptyIfNull(m3Var.getPlacement()) : "");
        if (!z) {
            str2 = "";
        } else {
            str2 = StringUtils.emptyIfNull(m3Var.e());
        }
        map2.put("{CUSTOM_DATA}", str2);
        if (m3Var instanceof a3) {
            a3 a3Var = (a3) m3Var;
            if (z) {
                str3 = StringUtils.emptyIfNull(a3Var.getCreativeId());
            }
            map2.put("{CREATIVE_ID}", str3);
        }
        a(str, null, map2, null, maxError, m3Var, z);
    }

    private void a(String str, List list, Map map, Map map2, MaxError maxError, m3 m3Var, boolean z) {
        this.a.s0().a((k5) new d6(str, list, map, map2, maxError, m3Var, this.a, z), f6.b.OTHER);
    }

    private boolean a(long j) {
        return System.currentTimeMillis() - j <= ((Long) this.a.a(z4.I2)).longValue();
    }
}
