package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.fc6;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzajn implements zzao {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public zzajn(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static zzajn b(zzeu zzeuVar) {
        int b = zzeuVar.b();
        String h = zzas.h(zzeuVar.k(zzeuVar.b(), StandardCharsets.US_ASCII));
        String k = zzeuVar.k(zzeuVar.b(), StandardCharsets.UTF_8);
        int b2 = zzeuVar.b();
        int b3 = zzeuVar.b();
        int b4 = zzeuVar.b();
        int b5 = zzeuVar.b();
        int b6 = zzeuVar.b();
        byte[] bArr = new byte[b6];
        zzeuVar.F(0, b6, bArr);
        return new zzajn(b, h, k, b2, b3, b4, b5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void a(zzam zzamVar) {
        zzamVar.a(this.a, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzajn.class != obj.getClass()) {
            return false;
        }
        zzajn zzajnVar = (zzajn) obj;
        return this.a == zzajnVar.a && this.b.equals(zzajnVar.b) && this.c.equals(zzajnVar.c) && this.d == zzajnVar.d && this.e == zzajnVar.e && this.f == zzajnVar.f && this.g == zzajnVar.g && Arrays.equals(this.h, zzajnVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((((this.c.hashCode() + ((this.b.hashCode() + ((this.a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        String str = this.b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.c;
        return fc6.o(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
