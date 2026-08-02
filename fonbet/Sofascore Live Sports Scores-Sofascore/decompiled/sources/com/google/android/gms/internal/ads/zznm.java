package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zznm {
    public static final zznm b;
    public static final zznm c;
    public final long a;

    static {
        zznm zznmVar = new zznm(0L);
        b = new zznm(Long.MAX_VALUE);
        c = zznmVar;
    }

    public zznm(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zznm.class == obj.getClass() && this.a == ((zznm) obj).a;
    }

    public final int hashCode() {
        return ((int) this.a) * 31;
    }
}
