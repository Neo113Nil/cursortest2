package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹰ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1075 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long f3377;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final byte[] f3378;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3379;

    public C1075(String str, byte[] bArr, long j) {
        this.f3379 = str;
        this.f3378 = bArr;
        this.f3377 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1075) {
            return this.f3379.equals(((C1075) obj).f3379);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3379.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("BLA6VsE62CEzpjhKyyfXADOkPkbXPeUWa/I=\n", "VtVLI6RJrHI=\n"));
        sb.append(this.f3379);
        sb.append('\'');
        sb.append(StringFog.decrypt("Z8SnZPLUcvY=\n", "S+TMAYudFss=\n"));
        sb.append(1);
        sb.append(StringFog.decrypt("60twZ3ojRjS1Bj0=\n", "x2sACxtXIFs=\n"));
        sb.append(2);
        sb.append(StringFog.decrypt("mV6vj7WvAdjRP7iwo/M=\n", "tX7M/dDOdb0=\n"));
        return fn0.n(sb, this.f3377, '}');
    }
}
