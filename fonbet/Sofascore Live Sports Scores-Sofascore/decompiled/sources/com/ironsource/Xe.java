package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Xe {

    @Nullable
    private X5 a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class a extends We {
        public a() {
        }

        @Override // com.ironsource.We, java.lang.Runnable
        public void run() {
            JSONObject b = IronSourceUtils.b(false);
            try {
                b.put(IronSourceConstants.EVENTS_DURATION, a());
            } catch (JSONException e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
            C4023cd.P.a(new C4355v5(EnumC4373w5.APP_ENTER_BACKGROUND, b));
        }
    }

    public final void a(@NotNull InterfaceC4107h7 interfaceC4107h7) {
        interfaceC4107h7.getClass();
        this.a = new X5(interfaceC4107h7, new a());
    }
}
