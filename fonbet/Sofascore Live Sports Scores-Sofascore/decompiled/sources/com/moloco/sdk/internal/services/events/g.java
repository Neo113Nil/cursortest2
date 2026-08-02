package com.moloco.sdk.internal.services.events;

import defpackage.dmi;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;

    public g(String str, String str2, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c.equals(gVar.c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserEventConfig(eventReportingEnabled=");
        sb.append(this.a);
        sb.append(", userTrackingEnabled=");
        sb.append(this.b);
        sb.append(", appForegroundUrl=");
        sb.append(this.c);
        sb.append(", appBackgroundUrl=");
        return lnb.q(sb, this.d, ')');
    }
}
