package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.f6;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxErrorCode;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i6 extends k5 {
    private static final AtomicBoolean o = new AtomicBoolean();
    private final c3 g;
    private final JSONObject h;
    private final List i;
    private final a.InterfaceC0103a j;
    private final WeakReference k;
    private final String l;
    private long m;
    private final List n;

    class a extends k3 {
        final /* synthetic */ MaxAdFormat b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a.InterfaceC0103a interfaceC0103a, MaxAdFormat maxAdFormat) {
            super(interfaceC0103a);
            this.b = maxAdFormat;
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            com.applovin.impl.sdk.p unused = i6.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                i6.this.c.a(i6.this.b, "Failed to load ad to cache for failover: " + maxError);
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", str);
            CollectionUtils.putStringIfValid("ad_format", this.b.getLabel(), hashMap);
            i6.this.a.R().d(f2.G0, hashMap);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            com.applovin.impl.sdk.p unused = i6.this.c;
            if (com.applovin.impl.sdk.p.a()) {
                i6.this.c.a(i6.this.b, "Successfully loaded ad to cache for failover: " + maxAd);
            }
            e3 e3Var = (e3) maxAd;
            i6.this.a.R().a(f2.F0, e3Var);
            i6.this.a.H().a(e3Var);
        }
    }

    private class b extends k5 {
        private final long g;
        private final int h;
        private final a3 i;
        private final List j;

        class a extends k3 {
            final /* synthetic */ MaxAdFormat b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a.InterfaceC0103a interfaceC0103a, MaxAdFormat maxAdFormat, String str) {
                super(interfaceC0103a);
                this.b = maxAdFormat;
                this.c = str;
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoadFailed(String str, MaxError maxError) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.p unused = b.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.c.a(b.this.b, "Ad failed to load in " + elapsedRealtime + " ms for " + this.b.getLabel() + " ad unit " + str + " with error: " + maxError);
                }
                b.this.b("failed to load ad: " + maxError.getCode());
                b bVar = b.this;
                bVar.a(bVar.i, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                if (b.this.h >= b.this.j.size() - 1) {
                    i6.this.b(new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                } else {
                    b bVar2 = b.this;
                    b.this.a.s0().a((k5) new b(i6.this, bVar2.h + 1, b.this.j, null), f6.b.MEDIATION);
                }
            }

            @Override // com.applovin.mediation.MaxAdListener
            public void onAdLoaded(MaxAd maxAd) {
                b.this.b("loaded ad");
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.g;
                com.applovin.impl.sdk.p unused = b.this.c;
                if (com.applovin.impl.sdk.p.a()) {
                    b.this.c.a(b.this.b, "Ad loaded in " + elapsedRealtime + "ms for " + this.b.getLabel() + " ad unit " + this.c);
                }
                a3 a3Var = (a3) maxAd;
                b.this.a(a3Var, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, null);
                int i = b.this.h;
                while (true) {
                    i++;
                    if (i >= b.this.j.size()) {
                        b bVar = b.this;
                        i6.this.a(a3Var, bVar.h);
                        return;
                    } else {
                        b bVar2 = b.this;
                        bVar2.a((a3) bVar2.j.get(i), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1L, null);
                    }
                }
            }
        }

        /* synthetic */ b(i6 i6Var, int i, List list, a aVar) {
            this(i, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str) {
        }

        @Override // java.lang.Runnable
        public void run() {
            String b = i6.this.g.b();
            MaxAdFormat a2 = i6.this.g.a();
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Loading ad " + (this.h + 1) + " of " + this.j.size() + " from " + this.i.c() + " for " + a2.getLabel() + " ad unit " + b);
            }
            b("started to load ad");
            Context context = (Context) i6.this.k.get();
            Activity w0 = context instanceof Activity ? (Activity) context : this.a.w0();
            this.a.c0().b(this.i);
            this.a.Z().loadThirdPartyMediatedAd(b, this.i, w0, new a(i6.this.j, a2, b));
        }

        private b(int i, List list) {
            super(i6.this.b, i6.this.a, i6.this.g.b());
            this.g = SystemClock.elapsedRealtime();
            this.h = i;
            this.i = (a3) list.get(i);
            this.j = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a3 a3Var, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            i6.this.n.add(new MaxNetworkResponseInfoImpl(adLoadState, y3.a(a3Var.b()), a3Var.F(), a3Var.Z(), j, a3Var.C(), maxError));
        }
    }

    public i6(c3 c3Var, JSONObject jSONObject, Context context, com.applovin.impl.sdk.l lVar, a.InterfaceC0103a interfaceC0103a) {
        super("TaskProcessMediationWaterfallV2", lVar, c3Var.b());
        this.g = c3Var;
        this.h = jSONObject;
        this.j = interfaceC0103a;
        this.k = new WeakReference(context);
        this.l = JsonUtils.getString(jSONObject, "mcode", "");
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, com.safedk.android.analytics.brandsafety.m.S, new JSONArray());
        this.i = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.i.add(a3.a(c3Var, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, lVar));
        }
        this.n = new ArrayList(this.i.size());
    }

    @Override // java.lang.Runnable
    public void run() {
        final MaxErrorImpl maxErrorImpl;
        this.m = SystemClock.elapsedRealtime();
        int i = 0;
        if (this.h.optBoolean("is_testing", false) && !this.a.u0().c() && o.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.i6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    i6.this.e();
                }
            });
        }
        String b2 = this.g.b();
        MaxAdFormat a2 = this.g.a();
        if (!CollectionUtils.isEmpty(this.i)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Starting waterfall for " + a2.getLabel() + " ad unit " + b2 + " with " + this.i.size() + " ad(s)...");
            }
            this.a.s0().a(new b(this, i, this.i, null));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.c.k(this.b, "No ads were returned from the server for " + a2.getLabel() + " ad unit " + b2);
        }
        q7.a(b2, a2, this.h, this.a);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.h, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0L);
        if (y3.a(this.h, b2, this.a)) {
            maxErrorImpl = new MaxErrorImpl(MaxErrorCode.INVALID_AD_UNIT_ID, "Ad Unit ID " + b2 + " is invalid or disabled.\nMake sure to use an Ad Unit ID from the MAX dashboard that is enabled and configured for the current application.\nFor more information, see https://support.axon.ai/en/max/getting-started#step-2-create-an-ad-unit\nNote: New ad units cannot load ads until 30-60 minutes after they are created");
            if (q7.c(this.a) && ((Boolean) this.a.a(z4.E6)).booleanValue()) {
                j = 0;
            }
        } else {
            maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device");
        }
        if (j <= 0) {
            b(maxErrorImpl);
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(j);
        Runnable runnable = new Runnable() { // from class: com.applovin.impl.i6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                i6.this.b(maxErrorImpl);
            }
        };
        if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", Boolean.FALSE).booleanValue()) {
            i0.a(millis, this.a, runnable);
        } else {
            AppLovinSdkUtils.runOnUiThreadDelayed(runnable, millis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        q7.a("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", this.a.w0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, int i) {
        this.a.c0().c(a3Var);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Waterfall loaded in " + elapsedRealtime + "ms from " + a3Var.c() + " for " + this.g.a().getLabel() + " ad unit " + this.g.b());
        }
        a3Var.a(new MaxAdWaterfallInfoImpl(a3Var, elapsedRealtime, this.n, this.l));
        v2.f(this.j, a3Var);
        if (((Boolean) this.a.a(t3.Q8)).booleanValue() && a3Var.getFormat().isFullscreenAd() && !y3.b(a3Var)) {
            a(i);
        }
    }

    private void a(int i) {
        a3 a3Var;
        String b2 = this.g.b();
        MaxAdFormat a2 = this.g.a();
        int size = this.i.size();
        do {
            i++;
            if (i < size) {
                a3Var = (a3) this.i.get(i);
            } else {
                if (com.applovin.impl.sdk.p.a()) {
                    this.c.a(this.b, "No available ad in waterfall for failover cache");
                }
                HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", b2);
                CollectionUtils.putStringIfValid("ad_format", a2.getLabel(), hashMap);
                this.a.R().d(f2.D0, hashMap);
                return;
            }
        } while (!y3.b(a3Var));
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Loading ad for failover cache");
        }
        this.a.R().a(f2.E0, a3Var);
        a(a3Var, b2, a2);
    }

    private void a(final a3 a3Var, final String str, final MaxAdFormat maxAdFormat) {
        ((e3) a3Var).a(true);
        Context context = (Context) this.k.get();
        final Activity w0 = context instanceof Activity ? (Activity) context : this.a.w0();
        this.a.s0().a((k5) new u6(this.a, "loadFailoverAd", new Runnable() { // from class: com.applovin.impl.i6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i6.this.a(str, a3Var, w0, maxAdFormat);
            }
        }), f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, a3 a3Var, Activity activity, MaxAdFormat maxAdFormat) {
        this.a.Z().loadThirdPartyMediatedAd(str, a3Var, activity, new a(null, maxAdFormat));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(MaxError maxError) {
        ArrayList arrayList = new ArrayList(this.n.size());
        for (MaxNetworkResponseInfo maxNetworkResponseInfo : this.n) {
            if (maxNetworkResponseInfo.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(maxNetworkResponseInfo);
            }
        }
        if (!CollectionUtils.isEmpty(arrayList)) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo2 = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i).append(") ").append(maxNetworkResponseInfo2.getMediatedNetwork().getName()).append("\n..code: ").append(maxNetworkResponseInfo2.getError().getCode()).append("\n..message: ").append(maxNetworkResponseInfo2.getError().getMessage()).append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        String b2 = this.g.b();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.m;
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Waterfall failed in " + elapsedRealtime + "ms for " + this.g.a().getLabel() + " ad unit " + b2 + " with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl(null, JsonUtils.getString(this.h, "waterfall_name", ""), JsonUtils.getString(this.h, "waterfall_test_name", ""), elapsedRealtime, this.n, this.g, JsonUtils.optList(JsonUtils.getJSONArray(this.h, "mwf_info_urls", null), Collections.EMPTY_LIST), this.l, JsonUtils.getString(this.h, "event_id", "")));
        v2.a(this.j, b2, maxError);
    }
}
