package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.InitListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Z implements Y {
    private final InterfaceC4496pc a;

    public static final class a implements Mc {
        final /* synthetic */ Y8 a;
        final /* synthetic */ InitListener b;

        public a(Y8 y8, InitListener initListener) {
            this.a = y8;
            this.b = initListener;
        }

        @Override // com.ironsource.Mc
        public void onFail(C4510q8 c4510q8) {
            IronLog.ADAPTER_API.verbose("initSDKWithNetworkConfigurations error: " + c4510q8);
            this.b.onInitFailed(C4578u5.a.a(new IronSourceError(c4510q8.a(), c4510q8.b())));
        }

        @Override // com.ironsource.Mc
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

    public Z(InterfaceC4496pc interfaceC4496pc) {
        this.a = interfaceC4496pc;
    }

    @Override // com.ironsource.Y
    public void a(Context context, Y8 y8, InitListener initListener) {
        JSONObject b;
        String a2;
        InterfaceC4496pc interfaceC4496pc = this.a;
        X e = y8.e();
        interfaceC4496pc.a(e != null ? e.c() : 0);
        X e2 = y8.e();
        if (e2 != null && (a2 = e2.a()) != null) {
            this.a.b(a2);
        }
        X e3 = y8.e();
        if (e3 != null && (b = e3.b()) != null) {
            this.a.a(b.toString());
        }
        Map<String, String> a3 = new C4460nc().a();
        this.a.a(new a(y8, initListener));
        this.a.a(context, y8.d(), y8.h(), a3);
    }
}
