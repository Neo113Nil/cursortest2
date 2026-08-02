package com.ironsource;

import android.content.Context;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N5 implements Kc {
    private boolean a = true;
    private String b = O5.j;

    public static final class a implements InterfaceC2416f7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC2416f7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jsonObjectInit.put(Va.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jsonObjectInit.put("deviceType", IronSourceUtils.b(applicationContext));
            P9 d = IronSourceUtils.d(applicationContext);
            if (d != null) {
                jsonObjectInit.put("advId", d.c());
                jsonObjectInit.put("advIdType", d.d());
            }
        }
        String i = com.ironsource.mediationsdk.p.h().i();
        if (i != null) {
            jsonObjectInit.put(X3.j.g, i);
        }
        return jsonObjectInit;
    }

    @Override // com.ironsource.Kc
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b = b();
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            jsonObjectInit.putOpt("externalMediationSource", dataSource);
            jsonObjectInit.putOpt("externalMediationData", impressionData);
            jsonObjectInit.putOpt("clientParams", b);
            IronLog.API.info("impressionData: " + jsonObjectInit);
            C2398e7.a(this.b, jsonObjectInit.toString(), new a());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Kc
    public void g(String str) {
    }

    @Override // com.ironsource.Kc
    public void a(List<IronSource.a> list, boolean z, N3 n3) {
        if (n3 != null) {
            C1 b = n3.b();
            M1 f = b != null ? b.f() : null;
            Intrinsics.checkNotNull(f);
            this.a = f.l();
            this.b = n3.b().f().d();
        }
    }
}
