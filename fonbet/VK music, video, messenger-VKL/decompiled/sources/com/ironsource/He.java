package com.ironsource;

import android.content.Context;
import com.ironsource.P3;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.json.JSONObject;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class He {
    private final Oe a;
    private final C4646y1 b;
    private final G9 c;
    private final C4337ge d;
    private final U9 e;

    public He() {
        this(null, null, null, null, null, 31, null);
    }

    public final void a(Context context, Se se) {
        P3.c.C0207c m;
        JSONObject u;
        String c;
        P3.c.C0207c m2;
        String q;
        Boolean t;
        P3.c g = se.d().g();
        this.a.a(context, InterfaceC4652y7.a, (g == null || (t = g.t()) == null) ? true : t.booleanValue());
        P3.c g2 = se.d().g();
        if (g2 != null && (m2 = g2.m()) != null && (q = m2.q()) != null) {
            this.b.a(q);
            this.c.a(q);
            this.d.a(q);
        }
        P3.b f = se.d().f();
        if (f != null && (c = f.c()) != null) {
            this.e.b(c);
        }
        P3.c g3 = se.d().g();
        if (g3 == null || (m = g3.m()) == null || (u = m.u()) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(u.toString());
        JSONObject optJSONObject = jSONObject.optJSONObject("events");
        if (optJSONObject != null) {
            jSONObject.remove("events");
            Map<String, String> b = IronSourceUtils.b(optJSONObject);
            this.b.b(b);
            this.c.b(b);
            this.d.b(b);
        }
        Map<String, String> b2 = IronSourceUtils.b(jSONObject);
        this.b.a(b2);
        this.c.a(b2);
        this.d.a(b2);
    }

    public He(Oe oe, C4646y1 c4646y1, G9 g9, C4337ge c4337ge, U9 u9) {
        this.a = oe;
        this.b = c4646y1;
        this.c = g9;
        this.d = c4337ge;
        this.e = u9;
    }

    public /* synthetic */ He(Oe oe, C4646y1 c4646y1, G9 g9, C4337ge c4337ge, U9 u9, int i, zcl zclVar) {
        this((i & 1) != 0 ? new Ne() : oe, (i & 2) != 0 ? Kb.u.d().q() : c4646y1, (i & 4) != 0 ? G9.i() : g9, (i & 8) != 0 ? C4337ge.i() : c4337ge, (i & 16) != 0 ? new U9() : u9);
    }
}
