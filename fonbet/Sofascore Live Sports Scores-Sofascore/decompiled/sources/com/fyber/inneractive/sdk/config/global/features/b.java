package com.fyber.inneractive.sdk.config.global.features;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends i {
    public static final a e = a.OPEN;

    public b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        b bVar = new b();
        a(bVar);
        return bVar;
    }

    public final a c() {
        String a = a("identifier_click_action", e.mKey);
        for (a aVar : a.values()) {
            if (a.equalsIgnoreCase(aVar.mKey)) {
                return aVar;
            }
        }
        return a.NONE;
    }
}
