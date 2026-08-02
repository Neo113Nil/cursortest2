package com.google.android.gms.internal.pal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzd extends zzyy {
    public static boolean d(zzzd zzzdVar) {
        return false;
    }

    public final Number c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzzd.class != obj.getClass()) {
            return false;
        }
        zzzd zzzdVar = (zzzd) obj;
        if (d(this) && d(zzzdVar)) {
            return c().longValue() == zzzdVar.c().longValue();
        }
        throw null;
    }

    public final int hashCode() {
        if (!d(this)) {
            throw null;
        }
        long longValue = c().longValue();
        return (int) ((longValue >>> 32) ^ longValue);
    }
}
