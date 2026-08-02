package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbdu {
    public final HashMap a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                HashMap hashMap = this.a;
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
