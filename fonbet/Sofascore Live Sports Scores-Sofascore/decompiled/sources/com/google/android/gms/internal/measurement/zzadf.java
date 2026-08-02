package com.google.android.gms.internal.measurement;

import defpackage.j8n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadf {
    public static volatile zzadf b;
    public static final zzadf c = new zzadf(0);
    public final Map a;

    public zzadf() {
        this.a = new HashMap();
    }

    public static zzadf a() {
        zzadf zzadfVar = b;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = b;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i = j8n.a;
                zzadf b2 = zzadn.b();
                b = b2;
                return b2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzadf(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
