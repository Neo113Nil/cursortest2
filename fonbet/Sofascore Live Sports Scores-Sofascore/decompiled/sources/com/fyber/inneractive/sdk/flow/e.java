package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ InneractiveInfrastructureError a;
    public final /* synthetic */ f b;

    public e(f fVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.b = fVar;
        this.a = inneractiveInfrastructureError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        com.fyber.inneractive.sdk.response.e eVar = this.b.b;
        if (eVar == null || (str = eVar.h) == null) {
            return;
        }
        Map map = eVar.p;
        if (map == null && eVar.q == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.o oVar = IAConfigManager.N.t.b;
        String a = oVar.a("max_failed_creatives_interval_hours", f.e);
        String a2 = oVar.a("max_failed_creatives_per_interval", f.f);
        int a3 = com.fyber.inneractive.sdk.util.v.a(a, 24);
        int a4 = com.fyber.inneractive.sdk.util.v.a(a2, 1);
        Application application = com.fyber.inneractive.sdk.util.o.a;
        if (application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray = new JSONArray(sharedPreferences.getString("lt", "[]"));
            } catch (JSONException unused) {
            }
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (oVar.a(false, this.b.a) && !com.fyber.inneractive.sdk.metrics.a.a(a3, a4, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                if (map != null) {
                    try {
                        str2 = new JSONObject(map).toString();
                    } catch (Throwable unused2) {
                        str2 = "";
                    }
                } else {
                    str2 = this.b.b.q;
                }
                f fVar = this.b;
                InneractiveAdRequest inneractiveAdRequest = fVar.c;
                com.fyber.inneractive.sdk.response.e eVar2 = fVar.b;
                InneractiveInfrastructureError inneractiveInfrastructureError = this.a;
                JSONArray jSONArray2 = fVar.d;
                com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_FAILURE_DATA;
                com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar2);
                wVar.b = tVar;
                wVar.a = inneractiveAdRequest;
                wVar.d = jSONArray2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("raw_response", str);
                } catch (Exception unused3) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "raw_response", str);
                }
                try {
                    jSONObject.put("headers", str2);
                } catch (Exception unused4) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "headers", str2);
                }
                String description = inneractiveInfrastructureError.description();
                try {
                    jSONObject.put("error_code", description);
                } catch (Exception unused5) {
                    IAlog.f("Got exception adding param to json object: %s, %s", "error_code", description);
                }
                wVar.f.put(jSONObject);
                wVar.a((String) null);
            }
            sharedPreferences.edit().putString("lt", new JSONArray((Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
