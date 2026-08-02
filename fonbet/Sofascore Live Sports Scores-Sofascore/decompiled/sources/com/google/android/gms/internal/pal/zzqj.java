package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqj extends zzqu {
    public final int a() {
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzqj) && ((zzqj) obj).a() == a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, null});
    }

    public final String toString() {
        throw null;
    }
}
