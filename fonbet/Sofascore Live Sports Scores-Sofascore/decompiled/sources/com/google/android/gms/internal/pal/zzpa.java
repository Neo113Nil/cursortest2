package com.google.android.gms.internal.pal;

import defpackage.a70;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzpa {
    public final Map a;
    public final Class b;

    public zzpa(Class cls, zzpq... zzpqVarArr) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzpq zzpqVar = zzpqVarArr[i];
            boolean containsKey = hashMap.containsKey(zzpqVar.a);
            Class cls2 = zzpqVar.a;
            if (containsKey) {
                a70.p("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(cls2.getCanonicalName())));
                throw null;
            }
            hashMap.put(cls2, zzpqVar);
        }
        this.b = zzpqVarArr[0].a;
        this.a = Collections.unmodifiableMap(hashMap);
    }

    public zzoz a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract String b();

    public int c() {
        return 1;
    }
}
