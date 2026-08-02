package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzkl {
    public static zzkk a(String str) {
        Map unmodifiableMap;
        Logger logger = zzlf.a;
        synchronized (zzlf.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzlf.f);
        }
        zzkk zzkkVar = (zzkk) unmodifiableMap.get(str);
        if (zzkkVar != null) {
            return zzkkVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
