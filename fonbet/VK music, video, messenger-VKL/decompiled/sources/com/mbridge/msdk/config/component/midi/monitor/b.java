package com.mbridge.msdk.config.component.midi.monitor;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: MonitorOMSDKPlayer.java */
/* loaded from: classes13.dex */
public class b {
    public void a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        try {
            new com.mbridge.msdk.config.component.common.kit.a().a(str, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("OMSDKPlayerMonitor", e.getMessage(), e);
            }
        }
    }
}
