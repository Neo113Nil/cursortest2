package com.inmobi.media;

import defpackage.lnb;
import defpackage.mz1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.j4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3512j4 extends AbstractC3875x4 {
    public final String a;
    public final int b;
    public final long c;

    public C3512j4(int i, long j, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3512j4)) {
            return false;
        }
        C3512j4 c3512j4 = (C3512j4) obj;
        return Intrinsics.c(this.a, c3512j4.a) && this.b == c3512j4.b && this.c == c3512j4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + Ai.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.a;
        return lnb.l(this.c, ")", mz1.q(this.b, "ConfigFailure(configType=", str, ", errorCode=", ", lastUpdatedTimestamp="));
    }
}
