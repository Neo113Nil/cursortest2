package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajk implements zzao {
    public final long a;

    public zzajk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzajk.class == obj.getClass() && this.a == ((zzajk) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j = this.a;
        return x5n.m(j, "ThumbnailMetadata: presentationTimeUs=", new StringBuilder(String.valueOf(j).length() + 38));
    }
}
