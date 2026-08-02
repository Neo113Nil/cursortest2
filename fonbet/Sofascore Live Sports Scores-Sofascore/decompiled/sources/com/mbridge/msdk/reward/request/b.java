package com.mbridge.msdk.reward.request;

import android.content.Context;
import android.os.Build;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class b extends com.mbridge.msdk.foundation.same.net.wrapper.b {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a(L6.H, "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a("app_version_name", m0.C(this.mContext));
        eVar.a("app_version_code", m0.B(this.mContext) + "");
        eVar.a(U3.i.n, m0.G(this.mContext) + "");
        eVar.a(L6.B, m0.o());
        eVar.a("brand", m0.t());
        eVar.a(L6.X0, "");
        eVar.a("gaid2", g.c());
        int s = m0.s(this.mContext);
        eVar.a("network_type", s + "");
        eVar.a("network_str", m0.a(this.mContext, s) + "");
        eVar.a("language", m0.p(this.mContext));
        eVar.a("timezone", m0.y());
        eVar.a("useragent", m0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", m0.n(this.mContext) + "x" + m0.m(this.mContext));
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("gp_version", v.d(this.mContext));
        }
        eVar.a("version_flag", "1");
        f.a(eVar, this.mContext);
        f.b(eVar);
        f.d(eVar);
        f.j(eVar);
    }
}
