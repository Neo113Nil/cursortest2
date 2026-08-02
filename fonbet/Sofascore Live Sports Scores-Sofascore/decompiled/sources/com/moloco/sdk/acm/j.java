package com.moloco.sdk.acm;

import defpackage.dmi;
import defpackage.ljg;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final String a;
    public String b;
    public long c;
    public final Map d;

    public j(String str, String str2, long j, Map map) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.c(this.a, jVar.a) && Intrinsics.c(this.b, jVar.b) && this.c == jVar.c && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ljg.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ACMConfig(appId=");
        sb.append(this.a);
        sb.append(", postAnalyticsUrl=");
        sb.append(this.b);
        sb.append(", requestPeriodSeconds=");
        sb.append(this.c);
        sb.append(", clientOptions=");
        return dmi.s(sb, this.d, ')');
    }
}
