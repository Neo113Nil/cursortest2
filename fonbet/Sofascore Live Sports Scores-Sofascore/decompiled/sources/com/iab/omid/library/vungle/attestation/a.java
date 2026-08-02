package com.iab.omid.library.vungle.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private final Map<String, String> a;

    public a(Map<String, String> map) {
        this.a = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.a;
    }
}
