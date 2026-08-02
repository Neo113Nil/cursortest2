package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x extends y {
    public final long a;

    public x(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.a == ((x) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return fn0.n(new StringBuilder("Time(millis="), this.a, ')');
    }
}
