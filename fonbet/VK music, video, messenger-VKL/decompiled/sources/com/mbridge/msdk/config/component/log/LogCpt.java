package com.mbridge.msdk.config.component.log;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.foundation.same.report.d;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.network.toolbox.h;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.util.HashMap;
import java.util.Map;
import xsna.hr;

/* loaded from: classes13.dex */
public class LogCpt extends a {
    private com.mbridge.msdk.config.component.log.model.a h;
    x i;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(e eVar) throws Exception {
        return true;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f = "913001";
        this.h = new com.mbridge.msdk.config.component.log.model.a(map);
        this.i = new x.b().a(this.h.k()).b(this.h.d()).d(this.h.g()).c(this.h.b()).e(this.h.a()).a(new d()).a(new hr(19)).a(new n()).a(this.h.f(), a(this.h.f())).a();
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        com.mbridge.msdk.config.component.common.metrics.a.a().a(this.i);
        if (this.h.h() != null) {
            com.mbridge.msdk.config.component.common.metrics.a.a().b(this.h.h());
        }
        if (this.h.e() == 1) {
            com.mbridge.msdk.config.component.common.metrics.a.a().d();
        }
        a("913002", (HashMap<String, Object>) null);
    }

    private p a(int i) {
        return i == 1 ? new p(new m((byte) 2), this.h.i(), this.h.j()) : new p(new h(), this.h.c(), 0);
    }
}
