package com.google.android.gms.internal.pal;

import defpackage.a70;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzrb {
    public static final zzrb b;
    public final Map a;

    static {
        zzqz zzqzVar = new zzqz();
        HashMap hashMap = zzqzVar.a;
        if (hashMap == null) {
            a70.r("cannot call build() twice");
            return;
        }
        zzrb zzrbVar = new zzrb(Collections.unmodifiableMap(hashMap));
        zzqzVar.a = null;
        b = zzrbVar;
    }

    public /* synthetic */ zzrb(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzrb) {
            return this.a.equals(((zzrb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
