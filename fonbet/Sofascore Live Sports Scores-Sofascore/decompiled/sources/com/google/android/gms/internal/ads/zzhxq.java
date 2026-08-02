package com.google.android.gms.internal.ads;

import defpackage.bf3;
import defpackage.fn0;
import defpackage.wt3;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhxq extends zzhym {
    public static final BigInteger e = BigInteger.valueOf(65537);
    public final int a;
    public final BigInteger b;
    public final zzhxp c;
    public final zzhxo d;

    public /* synthetic */ zzhxq(int i, BigInteger bigInteger, zzhxp zzhxpVar, zzhxo zzhxoVar) {
        this.a = i;
        this.b = bigInteger;
        this.c = zzhxpVar;
        this.d = zzhxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.c != zzhxp.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhxq)) {
            return false;
        }
        zzhxq zzhxqVar = (zzhxq) obj;
        return zzhxqVar.a == this.a && Objects.equals(zzhxqVar.b, this.b) && zzhxqVar.c == this.c && zzhxqVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(zzhxq.class, Integer.valueOf(this.a), this.b, this.c, this.d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int i = this.a;
        StringBuilder sb = new StringBuilder(fn0.b(length, 47, length2, 18, length3, 6, String.valueOf(i).length()) + 13);
        bf3.v(sb, "RSA SSA PKCS1 Parameters (variant: ", valueOf, ", hashType: ", valueOf2);
        wt3.t(i, ", publicExponent: ", valueOf3, ", and ", sb);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
