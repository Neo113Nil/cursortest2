package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Z implements Y {
    private final InterfaceC2582oc a;

    public static final class a implements Lc {
        final /* synthetic */ X8 a;
        final /* synthetic */ InitListener b;

        a(X8 x8, InitListener initListener) {
            this.a = x8;
            this.b = initListener;
        }

        @Override // com.ironsource.Lc
        public void onFail(C2596p8 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + error);
            this.b.onInitFailed(C2682u5.a.a(new IronSourceError(error.a(), error.b())));
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

    public Z(InterfaceC2582oc networkInitApi) {
        Intrinsics.checkNotNullParameter(networkInitApi, "networkInitApi");
        this.a = networkInitApi;
    }

    @Override // com.ironsource.Y
    public void a(Context context, X8 initConfig, InitListener initListener) {
        JSONObject b;
        String a2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initConfig, "initConfig");
        Intrinsics.checkNotNullParameter(initListener, "initListener");
        InterfaceC2582oc interfaceC2582oc = this.a;
        X e = initConfig.e();
        interfaceC2582oc.a(e != null ? e.c() : 0);
        X e2 = initConfig.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.a.b(a2);
        }
        X e3 = initConfig.e();
        if (e3 != null && (b = e3.b()) != null) {
            InterfaceC2582oc interfaceC2582oc2 = this.a;
            String jSONObject = b.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "applicationConfig.toString()");
            interfaceC2582oc2.a(jSONObject);
        }
        Map<String, String> a3 = new C2546mc().a();
        this.a.a(new a(initConfig, initListener));
        this.a.a(context, initConfig.d(), initConfig.h(), a3);
    }
}
