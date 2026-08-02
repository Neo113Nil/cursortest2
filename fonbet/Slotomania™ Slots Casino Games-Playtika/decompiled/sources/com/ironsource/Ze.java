package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Ze {
    private Y5 a;

    private final class a extends Ye {
        public a() {
        }

        @Override // com.ironsource.Ye, java.lang.Runnable
        public void run() {
            JSONObject b = IronSourceUtils.b(false);
            try {
                b.put("duration", a());
            } catch (JSONException e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C2386dd.P.a(new C2736x5(EnumC2754y5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(InterfaceC2505k7 applicationLifecycleService) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        this.a = new Y5(applicationLifecycleService, new a());
    }
}
