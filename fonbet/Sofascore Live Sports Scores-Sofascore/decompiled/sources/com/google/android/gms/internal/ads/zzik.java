package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzik {
    public final HashMap a = new HashMap();
    public Map b;

    public final synchronized Map a() {
        Map map;
        map = this.b;
        if (map == null) {
            map = Collections.unmodifiableMap(new HashMap(this.a));
            this.b = map;
        }
        return map;
    }
}
