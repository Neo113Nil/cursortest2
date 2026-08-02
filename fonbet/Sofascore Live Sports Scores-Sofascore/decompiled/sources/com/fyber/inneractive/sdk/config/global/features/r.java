package com.fyber.inneractive.sdk.config.global.features;

import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r extends i {
    public r() {
        super("store_webpage");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        r rVar = new r();
        a(rVar);
        return rVar;
    }

    public final q c() {
        String a = a("presentation_mode", null);
        if (a != null) {
            for (q qVar : q.values()) {
                Locale locale = Locale.US;
                if (a.toLowerCase(locale).equals(qVar.value.toLowerCase(locale))) {
                    return qVar;
                }
            }
        }
        return q.FullScreen;
    }
}
