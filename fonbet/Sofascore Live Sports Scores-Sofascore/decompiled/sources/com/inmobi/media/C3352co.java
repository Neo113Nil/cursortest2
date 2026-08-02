package com.inmobi.media;

import defpackage.ku3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3352co {
    public final ku3 a;
    public final int b;

    public C3352co(ku3 ku3Var, int i) {
        ku3Var.getClass();
        this.a = ku3Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3352co)) {
            return false;
        }
        C3352co c3352co = (C3352co) obj;
        return Intrinsics.c(this.a, c3352co.a) && this.b == c3352co.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.a + ", impressionMinDuration=" + this.b + ")";
    }
}
