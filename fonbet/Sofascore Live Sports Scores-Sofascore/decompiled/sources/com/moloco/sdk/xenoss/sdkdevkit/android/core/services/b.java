package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import com.moloco.sdk.internal.publisher.h0;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b extends h0 {
    public final long a;

    public b(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fn0.n(new StringBuilder("AppForeground(lastBgTimestamp="), this.a, ')');
    }
}
