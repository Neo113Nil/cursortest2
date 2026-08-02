package com.moloco.sdk.acm;

import android.content.Context;
import defpackage.dmi;
import defpackage.ljg;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f {
    public final String a;
    public final String b;
    public final Context c;
    public final long d;
    public final Map e;

    public f(String str, String str2, Context context, long j, Map map) {
        str.getClass();
        str2.getClass();
        context.getClass();
        this.a = str;
        this.b = str2;
        this.c = context;
        this.d = j;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.c(this.a, fVar.a) && Intrinsics.c(this.b, fVar.b) && Intrinsics.c(this.c, fVar.c) && this.d == fVar.d && this.e.equals(fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ljg.c((this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitConfig(appId=");
        sb.append(this.a);
        sb.append(", postAnalyticsUrl=");
        sb.append(this.b);
        sb.append(", context=");
        sb.append(this.c);
        sb.append(", requestPeriodSeconds=");
        sb.append(this.d);
        sb.append(", clientOptions=");
        return dmi.s(sb, this.e, ')');
    }
}
