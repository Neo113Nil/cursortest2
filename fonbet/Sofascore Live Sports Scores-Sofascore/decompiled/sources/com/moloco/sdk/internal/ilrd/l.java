package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.i1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l {
    public final i1 a;

    public l(i1 i1Var) {
        i1Var.getClass();
        this.a = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.c(this.a, ((l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LevelPlay(impression=" + this.a + ')';
    }
}
