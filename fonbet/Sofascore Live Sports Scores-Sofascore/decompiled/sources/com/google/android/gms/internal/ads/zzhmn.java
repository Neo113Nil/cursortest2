package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhmn {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    private zzhmn() {
    }

    public final void a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
    }

    public final zzhmo b() {
        return new zzhmo(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b));
    }

    public /* synthetic */ zzhmn(int i) {
    }
}
