package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.e5;
import com.applovin.impl.f6;
import com.applovin.impl.r5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class r5 extends k5 {
    private static JSONObject j;
    private static final Object k = new Object();
    private static final Map l = Collections.synchronizedMap(new HashMap());
    private final c3 g;
    private final Context h;
    private final b i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements e5.a, Runnable {
        private final b a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection e;
        private final com.applovin.impl.sdk.l f;
        private final com.applovin.impl.sdk.p g;

        @Override // com.applovin.impl.e5.a
        public void a(e5 e5Var) {
            boolean z;
            synchronized (this.b) {
                this.e.add(e5Var);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (q7.i() && ((Boolean) this.f.a(z4.P)).booleanValue()) {
                    this.f.s0().a((k5) new u6(this.f, "handleSignalCollectionCompleted", new Runnable() { // from class: com.applovin.impl.r5$c$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            r5.c.this.a();
                        }
                    }), f6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i, b bVar, com.applovin.impl.sdk.l lVar) {
            this.c = i;
            this.a = bVar;
            this.f = lVar;
            this.g = lVar.Q();
            this.b = new Object();
            this.e = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            ArrayList<e5> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.e);
            }
            JSONArray jSONArray = new JSONArray();
            for (e5 e5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    f5 f = e5Var.f();
                    jSONObject.put("name", f.c());
                    jSONObject.put(SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, f.b());
                    jSONObject.put("adapter_version", e5Var.a());
                    jSONObject.put("sdk_version", e5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c = e5Var.c();
                    if (c != null) {
                        jSONObject2.put("error_message", c.getMessage());
                    } else {
                        jSONObject2.put("signal", e5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", e5Var.b());
                    jSONObject2.put("is_cached", e5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.p.a()) {
                        this.g.a("TaskCollectSignals", "Collected signal from " + f);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.g.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f.E().a("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public r5(c3 c3Var, Context context, com.applovin.impl.sdk.l lVar, b bVar) {
        super("TaskCollectSignals", lVar);
        this.g = c3Var;
        this.h = context;
        this.i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(jSONArray.length(), this.i, this.a);
        this.a.s0().a(new u6(this.a, "timeoutCollectSignal", cVar), f6.b.TIMEOUT, ((Long) this.a.a(t3.H7)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new f5(this.g, jSONArray.getJSONObject(i), jSONObject, this.a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) l.get(this.g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (k) {
                jSONArray = JsonUtils.getJSONArray(j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (l.size() > 0) {
                    b(jSONArray, j);
                    return;
                } else {
                    a(jSONArray, j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.a.a(b5.F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e) {
            a("Failed to wait for signals", e);
            this.a.E().a("TaskCollectSignals", "waitForSignals", e);
        } catch (JSONException e2) {
            a("Failed to parse signals JSON", e2);
            this.a.E().a("TaskCollectSignals", "parseSignalsJSON", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.a.E().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(final f5 f5Var, final e5.a aVar) {
        if (f5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.r5$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    r5.this.b(f5Var, aVar);
                }
            });
        } else {
            this.a.Z().collectSignal(f5Var, this.h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(f5 f5Var, e5.a aVar) {
        this.a.Z().collectSignal(f5Var, this.h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "No signals collected: " + str, th);
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (k) {
            j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            com.applovin.impl.sdk.p.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            lVar.E().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }
}
