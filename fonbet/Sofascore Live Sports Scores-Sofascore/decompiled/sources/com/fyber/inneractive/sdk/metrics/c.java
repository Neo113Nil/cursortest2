package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c extends a {
    public static final String g = String.valueOf(24);
    public static final String h = String.valueOf(3);
    public static final String i = String.valueOf(24);
    public static final String j = String.valueOf(3);
    public final String b;
    public final UnitDisplayType c;
    public final com.fyber.inneractive.sdk.response.e d;
    public final InneractiveAdRequest e;
    public final JSONArray f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.d = eVar;
        this.e = inneractiveAdRequest;
        this.b = str;
        this.c = unitDisplayType;
        this.f = jSONArray;
    }

    public final void a() {
        d dVar = d.d;
        g a = dVar.a(this.b);
        HashMap j2 = a.j();
        boolean a2 = a.a();
        String str = this.b;
        if (!a2) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(str).toString());
            return;
        }
        dVar.a.remove(str);
        r.a.execute(new b(this, a, j2));
    }
}
