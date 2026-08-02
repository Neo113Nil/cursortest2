package com.fyber.inneractive.sdk.flow.endcard.loaders.fmp;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.endcard.o;
import com.fyber.inneractive.sdk.flow.endcard.p;
import com.fyber.inneractive.sdk.flow.y0;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.g;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c implements f0 {
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a a;
    public final o b;

    public c(o oVar, com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        this.b = oVar;
        this.a = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        String str = (String) obj;
        if (str != null && exc == null) {
            ((p) this.b.f()).e = str.concat("<style>body {margin: 0px; background-color: rgba(0, 0, 0, 0.0);}</style>");
            ((p) this.b.f()).l = z;
            ((p) this.b.f()).b(this.a);
            return;
        }
        if (exc == null || (exc instanceof g) || z) {
            return;
        }
        o oVar = this.b;
        IAlog.a("%s sending FMP_COMPANION_FAILED_LOADING event", "TemplateCallback");
        JSONObject jSONObject = new JSONObject();
        String a = v.a(exc);
        if (!TextUtils.isEmpty(a)) {
            try {
                jSONObject.put("error", a);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "error", a);
            }
        }
        String n = oVar.n();
        if (!TextUtils.isEmpty(n)) {
            try {
                jSONObject.put("version", n);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "version", n);
            }
        }
        Boolean bool = Boolean.FALSE;
        try {
            jSONObject.put("loaded_from_cache", bool);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", bool);
        }
        y0 y0Var = oVar.c;
        t tVar = t.FMP_COMPANION_FAILED_LOADING;
        InneractiveAdRequest inneractiveAdRequest = y0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = y0Var.d;
        JSONArray jSONArray = y0Var.f;
        w wVar = new w(gVar);
        wVar.b = tVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }
}
