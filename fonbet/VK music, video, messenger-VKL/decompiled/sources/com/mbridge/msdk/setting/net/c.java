package com.mbridge.msdk.setting.net;

import android.content.Context;
import android.os.Build;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.out.MBConfiguration;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* compiled from: SettingRequest.java */
/* loaded from: classes14.dex */
public class c extends com.mbridge.msdk.foundation.same.net.wrapper.c {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a("os_version", Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a(CommonUrlParts.APP_VERSION, m0.C(this.mContext));
        eVar.a("app_version_code", m0.B(this.mContext) + "");
        eVar.a(X3.i.n, m0.G(this.mContext) + "");
        eVar.a("model", m0.o());
        eVar.a("brand", m0.t());
        eVar.a("gaid2", g.c());
        int s = m0.s(this.mContext);
        eVar.a(StatCustomFieldKey.NETWORK_TYPE, s + "");
        eVar.a("network_str", m0.a(this.mContext, s));
        eVar.a("language", m0.p(this.mContext));
        eVar.a(AnalyticsBaseParamsConstantsKt.TIMEZONE, m0.y());
        eVar.a("useragent", m0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", m0.n(this.mContext) + "x" + m0.m(this.mContext));
        d.a(this.mContext, eVar);
        f.h(eVar);
    }
}
