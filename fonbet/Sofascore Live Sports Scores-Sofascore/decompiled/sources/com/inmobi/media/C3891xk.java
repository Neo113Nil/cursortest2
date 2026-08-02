package com.inmobi.media;

import defpackage.dmi;
import defpackage.vxd;
import defpackage.w1l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3891xk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final double g;

    public C3891xk(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, double d) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = list;
        this.g = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3891xk)) {
            return false;
        }
        C3891xk c3891xk = (C3891xk) obj;
        return this.a == c3891xk.a && this.b == c3891xk.b && this.c == c3891xk.c && this.d == c3891xk.d && this.e == c3891xk.e && Intrinsics.c(this.f, c3891xk.f) && Double.compare(this.g, c3891xk.g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.g) + dmi.d(dmi.e(dmi.e(dmi.e(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        List list = this.f;
        double d = this.g;
        StringBuilder k = w1l.k("TelemetryConfigMetaData(isTelemetryEnabled=", z, ", isImageEnabled=", z2, ", isGIFEnabled=");
        vxd.t(", isVideoEnabled=", ", isGeneralEventsDisabled=", k, z3, z4);
        k.append(z5);
        k.append(", priorityEventsList=");
        k.append(list);
        k.append(", samplingFactor=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
