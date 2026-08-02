package com.mbridge.msdk.setting.net;

import android.content.Context;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    public static void a(Context context, e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            eVar.a(L6.X0, g.d());
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("SettingRequestDiff", e.getMessage());
            }
        }
    }
}
