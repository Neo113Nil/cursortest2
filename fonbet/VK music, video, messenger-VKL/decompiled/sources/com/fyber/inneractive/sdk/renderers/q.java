package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;

/* loaded from: classes12.dex */
public final class q implements com.fyber.inneractive.sdk.player.controller.a0 {
    public final /* synthetic */ r a;

    public q(r rVar) {
        this.a = rVar;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void h() {
        this.a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void j() {
        this.a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.ignite.m o() {
        return com.fyber.inneractive.sdk.ignite.m.NONE;
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onPlayerError() {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.a;
        VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onPlayerError();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void onProgress(int i, int i2) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.a;
        VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onProgress(i, i2);
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.c
    public final void t() {
        this.a.I();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(String str, String str2) {
        r rVar = this.a;
        rVar.getClass();
        IAlog.a("%s ad view video ad renderer callback: onSuspiciousNoUserWebActionDetected", IAlog.a(rVar));
        ViewGroup viewGroup = this.a.p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        r rVar2 = this.a;
        if (!rVar2.u) {
            com.fyber.inneractive.sdk.network.b0.a(rVar2.p.getContext(), str, str2, this.a.b);
            r rVar3 = this.a;
            rVar3.u = true;
            IAlog.a("%s reporting auto redirect", IAlog.a(rVar3));
            return;
        }
        IAlog.a("%s redirect already reported for this ad", IAlog.a(rVar2));
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void c() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void e() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void f() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void g() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void i() {
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view, String str) {
        if (view != null) {
            InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(this.a.c(view), str);
            this.a.c(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final com.fyber.inneractive.sdk.util.d0 a(g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        Context context;
        com.fyber.inneractive.sdk.response.e eVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        r rVar = this.a;
        if (rVar.m.getContext() == null) {
            context = com.fyber.inneractive.sdk.util.o.a;
        } else {
            context = this.a.m.getContext();
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.a.b;
        return rVar.a(context, (xVar == null || (eVar = ((t0) xVar).b) == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).N) == null) ? null : bVar.b, g1Var, gVar, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    @Override // com.fyber.inneractive.sdk.player.controller.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var, boolean z) {
        String str2;
        f0 f0Var;
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.model.vast.b bVar;
        if (TextUtils.isEmpty(str) && (xVar = this.a.b) != null) {
            com.fyber.inneractive.sdk.response.e eVar = ((t0) xVar).b;
            str = (eVar == null || (bVar = ((com.fyber.inneractive.sdk.response.g) eVar).N) == null) ? null : bVar.b;
        }
        r rVar = this.a;
        com.fyber.inneractive.sdk.ui.controller.b bVar2 = (com.fyber.inneractive.sdk.player.controller.b) rVar.k;
        if (bVar2 == null && (f0Var = rVar.q) != null) {
            bVar2 = f0Var.a;
        }
        com.fyber.inneractive.sdk.flow.endcard.k j = bVar2 != null ? ((com.fyber.inneractive.sdk.player.controller.z) bVar2).j() : null;
        com.fyber.inneractive.sdk.flow.endcard.b a = j != null ? j.b.a() : null;
        if (a instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
            String str3 = ((com.fyber.inneractive.sdk.flow.endcard.c) a).g.g;
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
                r rVar2 = this.a;
                return rVar2.a(rVar2.c((View) rVar2.p), str2, g1Var, !z ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
            }
        }
        str2 = str;
        r rVar22 = this.a;
        return rVar22.a(rVar22.c((View) rVar22.p), str2, g1Var, !z ? com.fyber.inneractive.sdk.util.g.DEFAULT_ENDCARD : com.fyber.inneractive.sdk.util.g.VAST_ENDCARD, false, null);
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.ui.m mVar;
        r rVar = this.a;
        VideoContentListener videoContentListener = rVar.n;
        if (videoContentListener == null || (mVar = rVar.m) == null || !((com.fyber.inneractive.sdk.player.ui.e) mVar).e) {
            return;
        }
        videoContentListener.onCompleted();
    }

    @Override // com.fyber.inneractive.sdk.player.controller.g0
    public final void a(View view) {
        r rVar = this.a;
        if (rVar.c != null) {
            rVar.c(view);
            rVar.c(false);
        }
    }
}
