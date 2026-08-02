package com.iab.omid.library.adsbynimbus.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
