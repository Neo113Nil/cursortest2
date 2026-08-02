package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C2578o8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2564nc {
    private final InterfaceC2738x7 b = Jb.Y().a();
    Q6 a = new Q6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(M6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(M6.i, IronSourceNetworkBridge.jsonObjectInit(controllerConfig).opt(X3.a.q));
        } catch (JSONException e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(M6.V, "9.4.0");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(M6.E, Fc.f);
        hashMap.put(M6.D, Fc.e);
        this.a.a(hashMap);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(M6.l, jSONObject);
    }

    public void b(Context context) {
        this.a.a("gpi", Boolean.valueOf(C2350bd.e(context)));
    }

    public void a(C2578o8.c cVar) {
        this.a.a(M6.A1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.a.a(M6.D1, list);
    }

    public void a(boolean z) {
        this.a.a(M6.U0, Boolean.valueOf(z));
    }
}
