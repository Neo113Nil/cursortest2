package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhlu implements zzhcv {
    private final Map zza;

    static {
        new zzhlt().zza();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhlu) {
            return this.zza.equals(((zzhlu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final boolean zza() {
        return this.zza.isEmpty();
    }
}
