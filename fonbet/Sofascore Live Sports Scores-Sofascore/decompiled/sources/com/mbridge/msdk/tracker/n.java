package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class n implements f {
    private final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        private final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public boolean a() {
            return this.a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.g())) {
            try {
                String g = eVar.g();
                if (this.a.containsKey(g)) {
                    aVar = this.a.get(g);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(g));
                    this.a.put(g, aVar2);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    if (aVar.a()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("TrackManager", "apply", e);
                }
            }
        }
        return false;
    }
}
