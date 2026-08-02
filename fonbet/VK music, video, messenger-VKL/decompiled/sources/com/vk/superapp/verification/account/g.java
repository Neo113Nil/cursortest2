package com.vk.superapp.verification.account;

import com.vk.superapp.verification.account.b;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;

/* compiled from: VkVerificationOAuthInfo.kt */
/* loaded from: classes6.dex */
public final class g {
    public final String a;
    public final String b;
    public final String c;
    public final List<b.f> d;

    public g(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c.equals(gVar.c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(true) * 31;
        String str = this.a;
        return this.d.hashCode() + urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkVerificationOAuthInfo(needOAuthLink=true, sid=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", vkName=");
        sb.append(this.c);
        sb.append(", migrationItems=");
        return ms9.a(')', sb, this.d);
    }
}
