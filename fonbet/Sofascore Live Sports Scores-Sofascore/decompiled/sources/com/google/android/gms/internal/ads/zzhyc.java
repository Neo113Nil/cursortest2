package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.wt3;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhyc extends zzhym {
    public static final BigInteger g = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final zzhyb c;
    public final zzhya d;
    public final zzhya e;
    public final int f;

    public /* synthetic */ zzhyc(int i, BigInteger bigInteger, zzhyb zzhybVar, zzhya zzhyaVar, zzhya zzhyaVar2, int i2) {
        this.a = i;
        this.b = bigInteger;
        this.c = zzhybVar;
        this.d = zzhyaVar;
        this.e = zzhyaVar2;
        this.f = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhyb.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhyc)) {
            return false;
        }
        zzhyc zzhycVar = (zzhyc) obj;
        return zzhycVar.a == this.a && Objects.equals(zzhycVar.b, this.b) && zzhycVar.c == this.c && zzhycVar.d == this.d && zzhycVar.e == this.e && zzhycVar.f == this.f;
    }

    public final int hashCode() {
        return Objects.hash(zzhyc.class, Integer.valueOf(this.a), this.b, this.c, this.d, this.e, Integer.valueOf(this.f));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.f;
        int length4 = String.valueOf(i).length();
        int length5 = valueOf4.length();
        int i2 = this.a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i2).length() + 13);
        bf3.v(sb, "RSA SSA PSS Parameters (variant: ", valueOf, ", signature hashType: ", valueOf2);
        wt3.t(i, ", mgf1 hashType: ", valueOf3, ", saltLengthBytes: ", sb);
        wt3.t(i2, ", publicExponent: ", valueOf4, ", and ", sb);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
