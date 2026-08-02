package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class q {
    public final Boolean a;
    public final Long b;
    public final Long c;

    public q(Boolean bool, Long l, Long l2) {
        this.a = bool;
        this.b = l;
        this.c = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.c(this.a, qVar.a) && Intrinsics.c(this.b, qVar.b) && Intrinsics.c(this.c, qVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "MemoryInfoSignal(lowMemory=" + this.a + ", threshold=" + this.b + ", totalMem=" + this.c + ')';
    }
}
