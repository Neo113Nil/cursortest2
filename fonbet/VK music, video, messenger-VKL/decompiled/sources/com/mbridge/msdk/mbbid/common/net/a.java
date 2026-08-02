package com.mbridge.msdk.mbbid.common.net;

import android.content.Context;
import android.os.Build;
import com.ironsource.O6;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.same.net.wrapper.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;
import xsna.wga0;

/* compiled from: BidRequest.java */
/* loaded from: classes13.dex */
public class a extends h {
    public a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.h, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        g a = wga0.a(i.b());
        if (a == null) {
            a = i.b().a();
        }
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a(CommonUrlParts.APP_VERSION, m0.C(this.mContext));
        eVar.a("app_version_code", m0.B(this.mContext) + "");
        eVar.a("model", m0.o());
        eVar.a("brand", m0.t());
        eVar.a(O6.X0, "");
        eVar.a("gaid2", com.mbridge.msdk.foundation.tools.g.c());
        int s = m0.s(this.mContext);
        eVar.a(StatCustomFieldKey.NETWORK_TYPE, s + "");
        eVar.a("network_str", m0.a(this.mContext, s) + "");
        eVar.a("language", m0.p(this.mContext));
        eVar.a(AnalyticsBaseParamsConstantsKt.TIMEZONE, m0.y());
        eVar.a("useragent", m0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", m0.n(this.mContext) + "x" + m0.m(this.mContext));
        b.a(eVar, a, this.mContext);
        f.a(eVar, this.mContext);
        f.b(eVar);
        f.d(eVar);
        f.j(eVar);
    }
}
