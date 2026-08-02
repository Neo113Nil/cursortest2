package com.moloco.sdk.internal.services.bidtoken.providers;

import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class m {
    public final com.moloco.sdk.internal.services.h a;
    public final String b;
    public final String c;

    public m(com.moloco.sdk.internal.services.h hVar, String str, String str2) {
        this.a = hVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && Intrinsics.c(this.b, mVar.b) && Intrinsics.c(this.c, mVar.c);
    }

    public final int hashCode() {
        com.moloco.sdk.internal.services.h hVar = this.a;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceSignalInfo(orientation=");
        sb.append(this.a);
        sb.append(", locale=");
        sb.append(this.b);
        sb.append(", keyboardLocale=");
        return lnb.q(sb, this.c, ')');
    }
}
