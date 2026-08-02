package com.moloco.sdk.internal;

import defpackage.bf3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class u extends x {
    public final Integer c;

    public u(Integer num) {
        super(0, 0);
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.c(this.c, ((u) obj).c);
    }

    public final int hashCode() {
        Integer num = this.c;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return bf3.n(new StringBuilder("AnchoredAdaptive(availableWidth="), this.c, ')');
    }
}
