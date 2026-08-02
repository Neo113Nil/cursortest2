package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ί, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0350 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f886;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f887;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final List f888;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean f889;

    public C0350(boolean z, List list, String str, String str2) {
        this.f889 = z;
        this.f888 = Collections.unmodifiableList(new ArrayList(list));
        this.f887 = str;
        this.f886 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0350.class == obj.getClass()) {
            C0350 c0350 = (C0350) obj;
            if (this.f889 != c0350.f889 || !this.f888.equals(c0350.f888)) {
                return false;
            }
            String str = this.f887;
            String str2 = c0350.f887;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.f886;
            String str4 = c0350.f886;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f888.hashCode() + ((this.f889 ? 1 : 0) * 31)) * 31;
        String str = this.f887;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f886;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("XKkWAQYwhWVevgoCAyCbZHm4GhIcJ90=\n", "DNt5d29U4Bc=\n"));
        sb.append(this.f889);
        sb.append(StringFog.decrypt("tIbqfPqbtfXrmw==\n", "mKaZFZ311Jk=\n"));
        sb.append(this.f888);
        sb.append(StringFog.decrypt("pry/ZbKNMfOt\n", "ipzLCtnoX84=\n"));
        sb.append(this.f887);
        sb.append('\'');
        sb.append(StringFog.decrypt("21gIW/CuGKHQ\n", "93htKYLBapw=\n"));
        return mz1.o(sb, this.f886, "'}");
    }
}
