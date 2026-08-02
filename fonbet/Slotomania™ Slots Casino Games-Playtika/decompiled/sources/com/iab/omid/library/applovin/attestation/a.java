package com.iab.omid.library.applovin.attestation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class a {
    private final Map<String, String> a;

    public a(Map<String, String> map) {
        this.a = map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map));
    }

    public Map<String, String> a() {
        return this.a;
    }
}
