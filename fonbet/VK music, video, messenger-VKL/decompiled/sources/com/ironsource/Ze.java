package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class Ze {
    private C4221a6 a;

    public final class a extends Ye {
        public a() {
        }

        @Override // com.ironsource.Ye, java.lang.Runnable
        public void run() {
            JSONObject b = IronSourceUtils.b(false);
            try {
                b.put("duration", a());
            } catch (JSONException e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4282dd.P.a(new C4632x5(EnumC4650y5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(InterfaceC4419l7 interfaceC4419l7) {
        this.a = new C4221a6(interfaceC4419l7, new a());
    }
}
