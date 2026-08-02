package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h1;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class i extends s {
    public p A;
    public final t0 B;
    public final o z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i(Context context, a aVar, com.fyber.inneractive.sdk.player.n nVar, com.fyber.inneractive.sdk.config.global.r rVar, String str) {
        super(context, r5, null);
        com.fyber.inneractive.sdk.flow.g gVar;
        boolean z;
        p pVar;
        t0 t0Var;
        t0 t0Var2;
        com.fyber.inneractive.sdk.config.global.r rVar2 = rVar;
        this.B = null;
        this.B = nVar != null ? nVar.b : null;
        if (context == null || nVar == null || (t0Var2 = nVar.b) == null) {
            gVar = null;
        } else {
            rVar2 = rVar;
            gVar = new com.fyber.inneractive.sdk.flow.g(context, false, t0Var2.a, t0Var2.b, rVar);
        }
        if (nVar == null || (t0Var = nVar.b) == null) {
            z = false;
        } else {
            com.fyber.inneractive.sdk.response.e eVar = t0Var.b;
            z = com.fyber.inneractive.sdk.player.f.a(rVar2, eVar != null ? ((com.fyber.inneractive.sdk.response.g) eVar).E : com.fyber.inneractive.sdk.ignite.m.NONE);
        }
        o oVar = new o(context, gVar, aVar, rVar2, z, str);
        this.z = oVar;
        if (nVar == null) {
            IAlog.a("%s : flow manager is missing, unexpected and dynamic controls status are unknown", "IAVideoViewComposition");
            com.fyber.inneractive.sdk.network.events.a.a(com.fyber.inneractive.sdk.network.t.VAST_ERROR_DVC_FAILURE, com.fyber.inneractive.sdk.network.events.b.TEMPLATE_CONTENT_ERROR, getAdRequest(), getAdResponse(), "Missing flow manager", "", (Boolean) null);
        } else {
            com.fyber.inneractive.sdk.model.vast.b bVar = nVar.q;
            if (bVar != null && !TextUtils.isEmpty(bVar.n)) {
                com.fyber.inneractive.sdk.player.ui.remote.g gVar2 = nVar.v;
                if ((gVar2 != null ? gVar2.a : null) != null) {
                    com.fyber.inneractive.sdk.player.ui.remote.d dVar = gVar2 != null ? gVar2.a : null;
                    if (dVar.h) {
                        IAlog.a("%s : dynamic controls are already destroyed", "IAVideoViewComposition");
                    } else if (dVar.g) {
                        IAlog.a("%s : dynamic controls load process timed out", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar3 = nVar.v;
                        (gVar3 != null ? gVar3.a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_LOAD_TIMEOUT, "Template loading is timed out", true, null);
                    } else {
                        if (dVar.b.j) {
                            pVar = new p(getContext().getApplicationContext(), aVar, dVar, oVar);
                            this.A = pVar;
                            this.m = oVar.m;
                            this.r = oVar.r;
                            this.s = oVar.s;
                            this.n = oVar.n;
                            TextView textView = oVar.v;
                            this.v = textView;
                            a(textView, 10);
                            a(this.n, 8);
                            a(this.m, 7);
                            a(this.r, -1);
                            if (b()) {
                                p pVar2 = this.A;
                                IAsmoothProgressBar iAsmoothProgressBar = oVar.P;
                                f(iAsmoothProgressBar != null && iAsmoothProgressBar.getVisibility() == 0);
                                ImageView imageView = oVar.N;
                                d(imageView != null && imageView.getVisibility() == 0);
                                oVar.i();
                                attachViewToParent(pVar2, 0, new RelativeLayout.LayoutParams(-1, -1));
                                u uVar = u.VAST_EVENT_DVC_IMPRESSION;
                                InneractiveAdRequest adRequest = getAdRequest();
                                com.fyber.inneractive.sdk.response.e adResponse = getAdResponse();
                                com.fyber.inneractive.sdk.player.ui.remote.d dVar2 = pVar2.M;
                                String str2 = dVar2.f;
                                Boolean valueOf = Boolean.valueOf(dVar2.i);
                                w wVar = new w(uVar, adRequest, adResponse);
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("loaded_from_cache", valueOf);
                                } catch (Exception unused) {
                                    IAlog.f("Got exception adding param to json object: %s, %s", "loaded_from_cache", valueOf);
                                }
                                try {
                                    jSONObject.put("templateURL", str2);
                                } catch (Exception unused2) {
                                    IAlog.f("Got exception adding param to json object: %s, %s", "templateURL", str2);
                                }
                                wVar.f.put(jSONObject);
                                wVar.a((String) null);
                            }
                            View view = this.z;
                            attachViewToParent(view, 0, view.getLayoutParams());
                        }
                        IAlog.a("%s : dynamic controls are not ready, yet", "IAVideoViewComposition");
                        com.fyber.inneractive.sdk.player.ui.remote.g gVar4 = nVar.v;
                        (gVar4 != null ? gVar4.a : null).a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_ERROR, "Template isn't loaded yet", true, null);
                    }
                }
            }
            IAlog.a("%s : dynamic controls are not available", "IAVideoViewComposition");
        }
        pVar = null;
        this.A = pVar;
        this.m = oVar.m;
        this.r = oVar.r;
        this.s = oVar.s;
        this.n = oVar.n;
        TextView textView2 = oVar.v;
        this.v = textView2;
        a(textView2, 10);
        a(this.n, 8);
        a(this.m, 7);
        a(this.r, -1);
        if (b()) {
        }
        View view2 = this.z;
        attachViewToParent(view2, 0, view2.getLayoutParams());
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.d dVar, b bVar) {
        ViewGroup viewGroup;
        p pVar;
        this.z.a(dVar, bVar);
        if (!a(this.A) || (viewGroup = this.r) == null || viewGroup.getVisibility() != 0 || (pVar = this.A) == null) {
            return;
        }
        pVar.destroy();
        this.A = null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e, com.fyber.inneractive.sdk.player.ui.m
    public final boolean b() {
        p pVar = this.A;
        return pVar != null && pVar.b();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void c(boolean z) {
        this.z.c(z);
        if (a(this.A)) {
            this.A.c(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void d(boolean z) {
        this.z.d(z);
        if (a(this.A)) {
            this.A.d(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void e(boolean z) {
        if (a(this.A)) {
            this.A.e(z);
        } else {
            this.z.e(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void f(boolean z) {
        this.z.f(z);
        if (a(this.A)) {
            this.A.f(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g(boolean z) {
        if (a(this.A)) {
            this.A.g(z);
        } else {
            this.z.g(z);
        }
    }

    public InneractiveAdRequest getAdRequest() {
        t0 t0Var = this.B;
        if (t0Var != null) {
            return t0Var.a;
        }
        return null;
    }

    public com.fyber.inneractive.sdk.response.e getAdResponse() {
        t0 t0Var = this.B;
        if (t0Var != null) {
            return t0Var.b;
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View getEndCardView() {
        return this.z.getEndCardView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyView() {
        return a(this.A) ? this.A.getTrackingFriendlyView() : this.z.getTrackingFriendlyView();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public View[] getTrackingFriendlyViewObstructionPurposeOther() {
        return a(this.A) ? this.A.getTrackingFriendlyViewObstructionPurposeOther() : this.z.getTrackingFriendlyViewObstructionPurposeOther();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void h() {
        this.z.h();
        if (a(this.A)) {
            this.A.h();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void i() {
        this.z.i();
        if (a(this.A)) {
            this.A.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void j() {
        this.z.j();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void k() {
        this.z.k();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final boolean l() {
        return a(this.A) ? this.A.M.m : this.z.l();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void m() {
        this.z.m();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void n() {
        this.z.n();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void o() {
        this.z.o();
        this.u = this.z.u;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setAppInfoButtonRound(TextView textView) {
        this.z.setAppInfoButtonRound(textView);
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setListener(n nVar) {
        super.setListener(nVar);
        this.z.setListener(nVar);
        if (a(this.A)) {
            this.A.setListener(nVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setMuteButtonState(boolean z) {
        this.z.setMuteButtonState(z);
        if (a(this.A)) {
            this.A.setMuteButtonState(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setRemainingTime(String str) {
        this.z.setRemainingTime(str);
        if (a(this.A)) {
            this.A.setRemainingTime(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public void setSkipText(String str) {
        this.z.setSkipText(str);
        if (a(this.A)) {
            this.A.setSkipText(str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public void setUnitConfig(s0 s0Var) {
        super.setUnitConfig(s0Var);
        this.z.setUnitConfig(s0Var);
        if (a(this.A)) {
            this.A.setUnitConfig(s0Var);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void b(boolean z) {
        this.z.b(z);
        if (a(this.A)) {
            this.A.b(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void g() {
        o oVar = this.z;
        oVar.p();
        oVar.C = true;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, com.fyber.inneractive.sdk.ignite.m mVar) {
        if (!a(this.A)) {
            this.z.a(z, mVar);
        } else {
            this.A.a(z, mVar);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, String str) {
        this.z.a(z, str);
        if (a(this.A)) {
            this.A.a(z, str);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z, int i, int i2) {
        this.o = i;
        this.p = i2;
        this.q = z;
        o oVar = this.z;
        oVar.o = i;
        oVar.p = i2;
        oVar.q = z;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.m
    public final boolean a() {
        if (a(this.A)) {
            return this.A.M.n;
        }
        return this.z.a();
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(com.fyber.inneractive.sdk.flow.endcard.b bVar, b bVar2) {
        this.z.a(bVar, bVar2);
        p pVar = this.A;
        if (pVar != null) {
            pVar.destroy();
            this.A = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(boolean z) {
        if (a(this.A)) {
            this.A.a(z);
        } else {
            this.z.a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.s
    public final void a(int i, int i2) {
        this.z.a(i, i2);
        if (a(this.A)) {
            this.A.a(i, i2);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.e
    public final void a(h1 h1Var, int i, int i2) {
        this.z.a(h1Var, i, i2);
    }

    public static boolean a(p pVar) {
        return (pVar == null || pVar.M.h || !pVar.b()) ? false : true;
    }
}
