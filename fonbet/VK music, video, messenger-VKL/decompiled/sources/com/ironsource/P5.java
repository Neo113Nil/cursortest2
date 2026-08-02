package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.json.JSONObject;
import xsna.yq;

/* loaded from: classes13.dex */
public final class P5 implements Lc {
    private boolean a = true;
    private String b = Q5.j;

    public static final class a implements InterfaceC4330g7 {
        @Override // com.ironsource.InterfaceC4330g7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject d = yq.d(Wa.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            d.put("deviceType", IronSourceUtils.b(applicationContext));
            Q9 d2 = IronSourceUtils.d(applicationContext);
            if (d2 != null) {
                d.put("advId", d2.c());
                d.put("advIdType", d2.d());
            }
        }
        String i = com.ironsource.mediationsdk.p.h().i();
        if (i != null) {
            d.put(X3.j.g, i);
        }
        return d;
    }

    @Override // com.ironsource.Lc
    public void a() {
    }

    public final void a(String str, JSONObject jSONObject) {
        if (!this.a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b = b();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("externalMediationSource", str);
            jSONObject2.putOpt("externalMediationData", jSONObject);
            jSONObject2.putOpt("clientParams", b);
            IronLog.API.info("impressionData: " + jSONObject2);
            C4312f7.a(this.b, jSONObject2.toString(), new a());
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Lc
    public void a(List<IronSource.a> list, boolean z, N3 n3) {
        if (n3 != null) {
            C1 b = n3.b();
            this.a = (b != null ? b.f() : null).l();
            this.b = n3.b().f().d();
        }
    }

    @Override // com.ironsource.Lc
    public void g(String str) {
    }
}
