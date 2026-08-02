package com.google.android.gms.internal.ads;

import defpackage.dpo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziew {
    public static volatile zziew b;
    public static final zziew c = new zziew(0);
    public final Map a;

    public zziew() {
        this.a = new HashMap();
    }

    public static zziew a() {
        zziew zziewVar = b;
        if (zziewVar != null) {
            return zziewVar;
        }
        synchronized (zziew.class) {
            try {
                zziew zziewVar2 = b;
                if (zziewVar2 != null) {
                    return zziewVar2;
                }
                int i = dpo.a;
                zziew b2 = zzife.b();
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zziew(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
