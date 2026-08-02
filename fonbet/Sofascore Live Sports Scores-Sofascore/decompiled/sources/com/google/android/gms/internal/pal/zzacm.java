package com.google.android.gms.internal.pal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzacm {
    public static volatile zzacm b;
    public static final zzacm c = new zzacm(0);
    public final Map a;

    public zzacm() {
        this.a = new HashMap();
    }

    public static zzacm a() {
        zzacm zzacmVar;
        zzacm zzacmVar2 = b;
        if (zzacmVar2 != null) {
            return zzacmVar2;
        }
        synchronized (zzacm.class) {
            try {
                zzacmVar = b;
                if (zzacmVar == null) {
                    zzacmVar = c;
                    b = zzacmVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzacmVar;
    }

    public zzacm(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
