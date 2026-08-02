package com.moloco.sdk.internal.services.bidtoken;

import android.os.Build;
import defpackage.dmi;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public h(String str, String str2, String str3, String str4) {
        String str5 = Build.VERSION.RELEASE;
        str.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Intrinsics.c(this.a, hVar.a)) {
            return false;
        }
        String str = Build.VERSION.RELEASE;
        return Intrinsics.c(str, str) && this.b.equals(hVar.b) && this.c.equals(hVar.c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dmi.c(dmi.c(dmi.c(this.a.hashCode() * 31, 31, Build.VERSION.RELEASE), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidTokenDeviceRequestInfo(language=");
        sb.append(this.a);
        sb.append(", osVersion=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(", make=");
        sb.append(this.b);
        sb.append(", model=");
        sb.append(this.c);
        sb.append(", hardwareVersion=");
        return lnb.q(sb, this.d, ')');
    }
}
