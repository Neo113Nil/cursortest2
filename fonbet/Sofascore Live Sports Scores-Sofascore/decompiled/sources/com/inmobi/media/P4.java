package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class P4 implements A4 {
    @Override // com.inmobi.media.A4
    public final void a(Config config) {
        config.getClass();
        synchronized (this) {
            try {
                S4 s4 = S4.a;
                C3694q4 c3694q4 = AbstractC3435g4.a;
                S4.e = AbstractC3411f6.a(((SignalsConfig) c3694q4.a(SignalsConfig.class)).getKA());
                Context context = AbstractC3424fj.a;
                if (context != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Qa a = Pa.a(context, "c_data_store");
                    Context context2 = AbstractC3424fj.a;
                    if (((SignalsConfig) c3694q4.a(SignalsConfig.class)).getVAK() != (context2 != null ? Pa.a(context2, "c_data_store").a.getInt("akv", 1) : 1)) {
                        a.a("akv", ((SignalsConfig) c3694q4.a(SignalsConfig.class)).getVAK(), false);
                        s4.f();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
