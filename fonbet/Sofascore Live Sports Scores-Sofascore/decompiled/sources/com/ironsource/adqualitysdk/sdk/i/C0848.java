package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0848 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f2857;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f2858;

    public C0848(String str, String str2) {
        if (str == null || str.trim().isEmpty()) {
            a70.p(StringFog.decrypt("mzOFRUXjO86hGKBFXvM6yegZoRET5CydqhuvC1g=\n", "yHfOZTOGSb0=\n"));
            throw null;
        }
        if (str2 == null || str2.trim().isEmpty()) {
            a70.p(StringFog.decrypt("g0VxBEhJ8Q+jRmkEbHiiE+JbblAhb7RHoFlgSmo=\n", "wjUBJAEN0Wc=\n"));
            throw null;
        }
        this.f2858 = str;
        this.f2857 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0848)) {
            return false;
        }
        C0848 c0848 = (C0848) obj;
        return this.f2858.equals(c0848.f2858) && this.f2857.equals(c0848.f2857);
    }

    public final int hashCode() {
        Long l = 300000L;
        return l.hashCode() + ((((((this.f2857.hashCode() + (this.f2858.hashCode() * 31)) * 31) + 2) * 31) + 2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("+g6MGkErqgzQDp0sXCCABM4QnAtYGIMf2gKAAQ5p\n", "qWvvbzNO5m0=\n"));
        sb.append(this.f2858);
        sb.append('\'');
        sb.append(StringFog.decrypt("Np9ljfeobFx7zGzAoA==\n", "Gr8E/YfhCBQ=\n"));
        sb.append(this.f2857);
        sb.append('\'');
        sb.append(StringFog.decrypt("4Oce+52GB3m+qlM=\n", "zMdul/zyYRY=\n"));
        sb.append(2);
        sb.append(StringFog.decrypt("pun7KmAL1cb5uvEqYy/e0+/0\n", "ismYRQ17p6M=\n"));
        sb.append(2);
        return AbstractC0424.m255("U4IHKe0ODHca0R4p+Co2cRrVJzuo\n", "f6JqSJVaZRo=\n", sb, "300000}");
    }
}
