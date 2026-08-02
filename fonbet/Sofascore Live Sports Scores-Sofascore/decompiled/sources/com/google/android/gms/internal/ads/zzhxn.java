package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhxn {
    public static final BigInteger e;
    public static final BigInteger f;
    public Integer a = null;
    public BigInteger b = zzhxq.e;
    public zzhxo c = null;
    public zzhxp d = zzhxp.e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        e = valueOf;
        f = valueOf.pow(NotificationCompat.FLAG_LOCAL_ONLY);
    }

    private zzhxn() {
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final zzhxq b() {
        Integer num = this.a;
        if (num == null) {
            defpackage.zzl.x("key size is not set");
            return null;
        }
        if (this.b == null) {
            defpackage.zzl.x("publicExponent is not set");
            return null;
        }
        if (this.c == null) {
            defpackage.zzl.x("hash type is not set");
            return null;
        }
        if (this.d == null) {
            defpackage.zzl.x("variant is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.a));
        }
        BigInteger bigInteger = this.b;
        int compareTo = bigInteger.compareTo(zzhxq.e);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhxq(this.a.intValue(), this.b, this.d, this.c);
    }

    public /* synthetic */ zzhxn(int i) {
    }
}
