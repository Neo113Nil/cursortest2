package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.os.Build;
import android.webkit.WebView;
import com.ironsource.L6;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.wt3;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzfxa {
    public final String a;
    public long c = System.nanoTime();
    public int d = 1;
    public zzfyc b = new zzfyc(null);

    public zzfxa(String str) {
        this.a = str;
    }

    public void b() {
        this.b.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView c() {
        return (WebView) this.b.get();
    }

    public void d(zzfvq zzfvqVar, zzfvo zzfvoVar) {
        e(zzfvqVar, zzfvoVar, null);
    }

    public final void e(zzfvq zzfvqVar, zzfvo zzfvoVar, JSONObject jSONObject) {
        String str = zzfvqVar.g;
        JSONObject jSONObject2 = new JSONObject();
        zzfxg.b(jSONObject2, "environment", "app");
        zzfxg.b(jSONObject2, "adSessionType", zzfvoVar.g);
        JSONObject jSONObject3 = new JSONObject();
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        zzfxg.b(jSONObject3, "deviceType", wt3.m(str2, "; ", new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str3).length()), str3));
        zzfxg.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfxg.b(jSONObject3, L6.F, U3.d);
        zzfxg.b(jSONObject2, "deviceInfo", jSONObject3);
        UiModeManager uiModeManager = zzfxf.a;
        zzfvs zzfvsVar = zzfvs.OTHER;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                zzfvsVar = zzfvs.MOBILE;
            } else if (currentModeType == 4) {
                zzfvsVar = zzfvs.CTV;
            }
        }
        zzfxg.b(jSONObject2, "deviceCategory", zzfvsVar.a);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfxg.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfwa zzfwaVar = zzfvoVar.a;
        zzfxg.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, zzfwaVar.a);
        zzfxg.b(jSONObject4, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, zzfwaVar.b);
        zzfxg.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfxg.b(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfxg.b(jSONObject5, "appId", zzfwp.b.a.getApplicationContext().getPackageName());
        zzfxg.b(jSONObject2, "app", jSONObject5);
        String str4 = zzfvoVar.f;
        if (str4 != null) {
            zzfxg.b(jSONObject2, "contentUrl", str4);
        }
        String str5 = zzfvoVar.e;
        if (str5 != null) {
            zzfxg.b(jSONObject2, "customReferenceData", str5);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList(zzfvoVar.c).iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfwr.a.a(c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    public final void f(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfxg.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfwr.a.a(c(), "setLastActivity", jSONObject);
    }

    public void a() {
    }
}
