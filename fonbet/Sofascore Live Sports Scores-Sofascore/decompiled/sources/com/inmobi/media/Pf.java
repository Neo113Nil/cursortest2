package com.inmobi.media;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Pf {
    public final String a;
    public final Set b;

    public Pf(String str, Set set) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pf)) {
            return false;
        }
        Pf pf = (Pf) obj;
        return Intrinsics.c(this.a, pf.a) && Intrinsics.c(this.b, pf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReporterState(appVersion=" + this.a + ", reportedEvents=" + this.b + ")";
    }
}
