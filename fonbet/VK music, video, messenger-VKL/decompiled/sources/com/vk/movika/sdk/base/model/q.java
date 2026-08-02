package com.vk.movika.sdk.base.model;

import xsna.epx;
import xsna.h5s;
import xsna.qoy;

/* loaded from: classes3.dex */
public final class q {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public q(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public static q a(q qVar, String str, String str2, String str3, int i) {
        String str4 = qVar.a;
        boolean z = qVar.b;
        boolean z2 = qVar.c;
        if ((i & 8) != 0) {
            str = qVar.d;
        }
        String str5 = str;
        if ((i & 16) != 0) {
            str2 = qVar.e;
        }
        String str6 = str2;
        if ((i & 32) != 0) {
            str3 = qVar.f;
        }
        return new q(str4, str5, str6, str3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return epx.f(this.a, qVar.a) && this.b == qVar.b && this.c == qVar.c && epx.f(this.d, qVar.d) && epx.f(this.e, qVar.e) && epx.f(this.f, qVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int b = qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractionResult(selectedBranchId=");
        sb.append(this.a);
        sb.append(", isAutoSelect=");
        sb.append(this.b);
        sb.append(", shouldOpenNow=");
        sb.append(this.c);
        sb.append(", blameControlId=");
        sb.append(this.d);
        sb.append(", blameContainerId=");
        return h5s.d(sb, this.e, ", blameChapterId=", this.f, ")");
    }
}
