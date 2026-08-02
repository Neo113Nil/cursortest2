package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public final class y0 {
    public final Context a;
    public final t0 b;
    public final InneractiveAdRequest c;
    public final com.fyber.inneractive.sdk.response.g d;
    public final com.fyber.inneractive.sdk.model.vast.b e;
    public final JSONArray f;
    public final com.fyber.inneractive.sdk.config.global.features.v g;

    public y0(Context context, t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.v vVar;
        JSONArray jSONArray;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.N;
        if (rVar != null) {
            vVar = (com.fyber.inneractive.sdk.config.global.features.v) rVar.a(com.fyber.inneractive.sdk.config.global.features.v.class);
            jSONArray = rVar.b();
        } else {
            vVar = null;
            jSONArray = null;
        }
        this.a = context;
        this.b = t0Var;
        this.c = inneractiveAdRequest;
        this.d = gVar;
        this.e = bVar;
        this.g = vVar;
        this.f = jSONArray;
    }
}
