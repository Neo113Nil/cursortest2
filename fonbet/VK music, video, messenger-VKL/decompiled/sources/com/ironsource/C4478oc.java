package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4492p8;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.oc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4478oc {
    private final InterfaceC4652y7 b = Kb.Y().a();
    S6 a = new S6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.a.a(O6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.a.a(O6.i, new JSONObject(controllerConfig).opt(X3.a.q));
        } catch (JSONException e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.a.a(O6.V, "9.4.3");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(O6.E, Gc.f);
        hashMap.put(O6.D, Gc.e);
        this.a.a(hashMap);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.a.a(O6.l, jSONObject);
    }

    public void a(C4492p8.c cVar) {
        this.a.a(O6.y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.a.a(O6.B1, list);
    }

    public void a(boolean z) {
        this.a.a(O6.U0, Boolean.valueOf(z));
    }
}
