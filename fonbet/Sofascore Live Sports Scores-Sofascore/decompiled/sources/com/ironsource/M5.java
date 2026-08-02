package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M5 implements Kc {
    private boolean a = true;

    @NotNull
    private String b = N5.j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements InterfaceC4017c7 {
        @Override // com.ironsource.InterfaceC4017c7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Ta.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.b(applicationContext));
            P9 d = IronSourceUtils.d(applicationContext);
            if (d != null) {
                jSONObject.put("advId", d.c());
                jSONObject.put("advIdType", d.d());
            }
        }
        String h = com.ironsource.mediationsdk.p.g().h();
        if (h != null) {
            jSONObject.put(U3.j.g, h);
        }
        return jSONObject;
    }

    public final void a(@NotNull String str, @NotNull JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
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
            C3999b7.a(this.b, jSONObject2.toString(), new a());
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Kc
    public void g(@Nullable String str) {
    }

    @Override // com.ironsource.Kc
    public void a() {
    }

    @Override // com.ironsource.Kc
    public void a(@Nullable List<IronSource.a> list, boolean z, @Nullable K3 k3) {
        if (k3 != null) {
            A1 b = k3.b();
            K1 f = b != null ? b.f() : null;
            f.getClass();
            this.a = f.m();
            this.b = k3.b().f().d();
        }
    }
}
