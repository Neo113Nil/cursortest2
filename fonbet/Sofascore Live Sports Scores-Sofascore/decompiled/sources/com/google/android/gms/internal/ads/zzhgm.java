package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.me4;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgm extends zzhga {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final zzhgl e;
    public final zzhgk f;

    public /* synthetic */ zzhgm(int i, int i2, int i3, int i4, zzhgl zzhglVar, zzhgk zzhgkVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = zzhglVar;
        this.f = zzhgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.e != zzhgl.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgm)) {
            return false;
        }
        zzhgm zzhgmVar = (zzhgm) obj;
        return zzhgmVar.a == this.a && zzhgmVar.b == this.b && zzhgmVar.c == this.c && zzhgmVar.d == this.d && zzhgmVar.e == this.e && zzhgmVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(zzhgm.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.c;
        int length3 = String.valueOf(i).length();
        int i2 = this.d;
        int length4 = String.valueOf(i2).length();
        int i3 = this.a;
        int length5 = String.valueOf(i3).length();
        int i4 = this.b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        bf3.v(sb, "AesCtrHmacAead Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        me4.r(sb, ", ", i, "-byte IV, and ", i2);
        me4.r(sb, "-byte tags, and ", i3, "-byte AES key, and ", i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
