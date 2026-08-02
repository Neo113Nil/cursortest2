package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.y0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class c extends b implements com.fyber.inneractive.sdk.response.i {
    public final com.fyber.inneractive.sdk.model.vast.c g;

    public c(y0 y0Var, com.fyber.inneractive.sdk.model.vast.c cVar, int i) {
        super(i, y0Var);
        this.g = cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.a);
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.VAST_COMPANION_FAILED_LOADING;
        if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject a = this.g.a();
        try {
            jSONObject.put("companion_data", a);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a);
        }
        Throwable cause = inneractiveInfrastructureError.getCause();
        String description = inneractiveInfrastructureError.description();
        if (TextUtils.isEmpty(description)) {
            description = com.fyber.inneractive.sdk.util.v.a(cause);
        }
        if (!TextUtils.isEmpty(description)) {
            try {
                jSONObject.put("reason", inneractiveInfrastructureError);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "reason", inneractiveInfrastructureError);
            }
        }
        y0 y0Var = this.c;
        InneractiveAdRequest inneractiveAdRequest = y0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = y0Var.d;
        JSONArray jSONArray = y0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.b = tVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArray;
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.v vVar = this.c.g;
        View b = f().b();
        com.fyber.inneractive.sdk.player.ui.c d = super.d();
        d.e = b;
        boolean z = false;
        if (vVar != null) {
            Boolean c = vVar.c("cta_text_all_caps");
            if (c != null ? c.booleanValue() : false) {
                z = true;
            }
        }
        d.b = z;
        boolean b2 = b.b(vVar);
        Integer valueOf = Integer.valueOf(b.a(vVar));
        if (b2) {
            d.d = valueOf;
        }
        return d;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void e() {
        a();
        View b = f().b();
        if (b != null) {
            b.setVisibility(8);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.util.g g() {
        return com.fyber.inneractive.sdk.util.g.VAST_ENDCARD;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final l h() {
        return l.Companion;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final com.fyber.inneractive.sdk.model.vast.i i() {
        return this.g.a;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public boolean l() {
        return f().b() != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void m() {
        super.m();
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_LOADED, this.c);
    }

    public final void a(int i, y0 y0Var) {
        com.fyber.inneractive.sdk.player.n.a(this, com.fyber.inneractive.sdk.model.vast.x.EVENT_CREATIVE_VIEW);
        a(com.fyber.inneractive.sdk.network.u.VAST_COMPANION_DISPLAYED, y0Var);
    }

    public final void a(com.fyber.inneractive.sdk.network.u uVar, y0 y0Var) {
        InneractiveAdRequest inneractiveAdRequest = y0Var.c;
        com.fyber.inneractive.sdk.response.g gVar = y0Var.d;
        JSONArray jSONArray = y0Var.f;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(gVar);
        wVar.c = uVar;
        wVar.a = inneractiveAdRequest;
        wVar.d = jSONArray;
        JSONObject jSONObject = new JSONObject();
        JSONObject a = this.g.a();
        try {
            jSONObject.put("companion_data", a);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "companion_data", a);
        }
        JSONArray jSONArray2 = this.b;
        if (jSONArray2 != null && jSONArray2.length() > 0) {
            JSONArray jSONArray3 = this.b;
            try {
                jSONObject.put("plbl_det", jSONArray3);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "plbl_det", jSONArray3);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.b
    public final void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar) {
        View b = f().b();
        if (b != null) {
            ((a) f()).c();
            com.fyber.inneractive.sdk.util.v.a(b);
            viewGroup.addView(b);
            b.requestFocus();
            a(this.e, this.c);
        }
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(com.fyber.inneractive.sdk.model.vast.x xVar) {
        return this.g.a(xVar);
    }
}
