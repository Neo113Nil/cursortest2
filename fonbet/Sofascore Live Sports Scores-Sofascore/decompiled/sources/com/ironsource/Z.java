package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z implements Y {

    @NotNull
    private final InterfaceC4237oc a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Lc {
        final /* synthetic */ Y8 a;
        final /* synthetic */ InitListener b;

        public a(Y8 y8, InitListener initListener) {
            this.a = y8;
            this.b = initListener;
        }

        @Override // com.ironsource.Lc
        public void onFail(@NotNull C4215n8 c4215n8) {
            c4215n8.getClass();
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + c4215n8);
            this.b.onInitFailed(C4301s5.a.a(new IronSourceError(c4215n8.a(), c4215n8.b())));
        }

        @Override // com.ironsource.Lc
        public void onSuccess() {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("initSDKWithNetworkConfigurations success");
            X e = this.a.e();
            ironLog.verbose("controllerURL = " + (e != null ? e.a() : null));
            X e2 = this.a.e();
            ironLog.verbose("controllerConfig = " + (e2 != null ? e2.b() : null));
            X e3 = this.a.e();
            ironLog.verbose("debugMode = " + (e3 != null ? Integer.valueOf(e3.c()) : null));
            ironLog.verbose("applicationKey = " + this.a.d());
            ironLog.verbose("userId = " + this.a.h());
            this.b.onInitSuccess();
        }
    }

    public Z(@NotNull InterfaceC4237oc interfaceC4237oc) {
        interfaceC4237oc.getClass();
        this.a = interfaceC4237oc;
    }

    @Override // com.ironsource.Y
    public void a(@NotNull Context context, @NotNull Y8 y8, @NotNull InitListener initListener) {
        JSONObject b;
        String a2;
        context.getClass();
        y8.getClass();
        initListener.getClass();
        InterfaceC4237oc interfaceC4237oc = this.a;
        X e = y8.e();
        interfaceC4237oc.a(e != null ? e.c() : 0);
        X e2 = y8.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.a.b(a2);
        }
        X e3 = y8.e();
        if (e3 != null && (b = e3.b()) != null) {
            InterfaceC4237oc interfaceC4237oc2 = this.a;
            String jSONObject = b.toString();
            jSONObject.getClass();
            interfaceC4237oc2.a(jSONObject);
        }
        Map<String, String> a3 = new C4201mc().a();
        this.a.a(new a(y8, initListener));
        this.a.a(context, y8.d(), y8.h(), a3);
    }
}
