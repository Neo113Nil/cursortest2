package com.mbridge.msdk.config.component.common.metrics;

import com.ironsource.U3;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import defpackage.yhk;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    m a;
    x b;
    JSONObject c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        static final a a = new a();
    }

    private x b() {
        x xVar = this.b;
        if (xVar != null) {
            return xVar;
        }
        x a = new x.b().a(604800000).b(50).d(50).c(15000).e(2).a(new d()).a(new yhk()).a(new n()).a(0, new p(new h(), com.mbridge.msdk.foundation.same.net.utils.d.h().d, 0)).a();
        this.b = a;
        return a;
    }

    private m c() {
        try {
            m mVar = this.a;
            if (mVar == null) {
                m a = m.a("metrics_component", c.n().d(), b());
                this.a = a;
                if (a != null) {
                    JSONObject jSONObject = this.c;
                    if (jSONObject != null) {
                        a.a(jSONObject);
                    }
                    this.a.h();
                }
            } else {
                JSONObject jSONObject2 = this.c;
                if (jSONObject2 != null) {
                    mVar.a(jSONObject2);
                }
            }
        } catch (Exception e) {
            q0.b("ComponentMetrics", e.getMessage());
        }
        return this.a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                String valueOf = String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(U3.i.W)));
                JSONObject jSONObject = new JSONObject(map);
                if (jSONObject.length() > 0) {
                    e eVar = new e(valueOf);
                    eVar.a(jSONObject);
                    eVar.b(0);
                    eVar.a(0);
                    c().d(eVar);
                }
            } catch (Throwable th) {
                q0.b("ComponentMetrics", th.getMessage(), th);
            }
        }
    }

    public void d() {
        m mVar = this.a;
        if (mVar == null) {
            mVar = c();
            this.a = mVar;
        }
        mVar.a();
    }

    private a() {
    }

    public static a a() {
        return b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    public void a(x xVar) {
        if (xVar != null) {
            this.b = xVar;
            m mVar = this.a;
            if (mVar != null) {
                mVar.i();
                m.b("metrics_component");
                this.a = null;
            }
            c();
        }
    }

    public void b(Map<String, Object> map) {
        if (map != null) {
            try {
                this.c = new JSONObject(map);
            } catch (Exception e) {
                q0.b("ComponentMetrics", e.getMessage());
            }
        }
    }
}
