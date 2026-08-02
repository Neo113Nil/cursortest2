package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4197m8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4219nc {
    private final InterfaceC4339u7 b = Ib.a0().a();
    P6 a = new P6();

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(L6.i, new JSONObject(controllerConfig).opt(U3.a.q));
        } catch (JSONException e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(L6.V, "9.5.0");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(L6.E, Fc.f);
        hashMap.put(L6.D, Fc.e);
        this.a.a(hashMap);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(L6.l, jSONObject);
    }

    public void a(C4197m8.c cVar) {
        this.a.a(L6.y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(L6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void a(List<String> list) {
        this.a.a(L6.B1, list);
    }

    public void a(boolean z) {
        this.a.a(L6.U0, Boolean.valueOf(z));
    }
}
