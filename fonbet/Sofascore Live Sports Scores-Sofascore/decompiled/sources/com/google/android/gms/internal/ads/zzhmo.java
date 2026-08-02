package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhmo {
    public final Map a;
    public final Map b;

    public /* synthetic */ zzhmo(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public static zzhmn a() {
        return new zzhmn(0);
    }

    public final Enum b(Object obj) {
        Enum r1 = (Enum) this.b.get(obj);
        if (r1 != null) {
            return r1;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(zzhtl zzhtlVar) {
        Object obj = this.a.get(zzhtlVar);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(zzhtlVar)));
    }
}
