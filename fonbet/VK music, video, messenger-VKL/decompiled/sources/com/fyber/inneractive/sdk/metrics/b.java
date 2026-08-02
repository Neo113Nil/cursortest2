package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.o;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import com.vk.core.preference.Preference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class b implements Runnable {
    public final /* synthetic */ g a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ c c;

    public b(c cVar, g gVar, Map map) {
        this.c = cVar;
        this.a = gVar;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnitDisplayType unitDisplayType;
        int a;
        int a2;
        String str;
        IAlog.a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
        c cVar = this.c;
        UnitDisplayType unitDisplayType2 = cVar.c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = UnitDisplayType.BANNER) || unitDisplayType2 == UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            UnitDisplayType unitDisplayType3 = cVar.c;
            IAlog.a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.a.toString());
        o oVar = IAConfigManager.N.t.b;
        UnitDisplayType unitDisplayType4 = this.c.c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == UnitDisplayType.MRECT) {
            String a3 = oVar.a("ad_metrics_interval_banner", c.g);
            String a4 = oVar.a("ad_metrics_limit_banner", c.h);
            a = v.a(a3, 24);
            a2 = v.a(a4, 3);
            str = "LastSentMetricsBanner";
        } else {
            String a5 = oVar.a("ad_metrics_interval_interstitial", c.i);
            String a6 = oVar.a("ad_metrics_limit_interstitial", c.j);
            a = v.a(a5, 24);
            a2 = v.a(a6, 3);
            str = "LastSentMetricsInterstitial";
        }
        Application application = com.fyber.inneractive.sdk.util.o.a;
        if (application != null) {
            SharedPreferences h = Preference.h(application, 0, "IAConfigPrefs");
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(h.getString(str, "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.c.a) && !a.a(a, a2, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                c cVar2 = this.c;
                InneractiveAdRequest inneractiveAdRequest = cVar2.e;
                com.fyber.inneractive.sdk.response.e eVar = cVar2.d;
                Map map = this.b;
                try {
                    u uVar = u.METRIC_MEASUREMENTS_EVENT;
                    JSONArray jSONArray2 = cVar2.f;
                    w wVar = new w(eVar);
                    wVar.c = uVar;
                    wVar.a = inneractiveAdRequest;
                    wVar.d = jSONArray2;
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : map.keySet()) {
                        Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (Exception unused2) {
                            IAlog.f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    wVar.f.put(jSONObject);
                    wVar.a((String) null);
                } catch (Exception unused3) {
                }
            }
            h.edit().putString(str, new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
