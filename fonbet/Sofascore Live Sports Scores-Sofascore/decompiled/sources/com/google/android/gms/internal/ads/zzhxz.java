package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhxz {
    public static final BigInteger g;
    public static final BigInteger h;
    public Integer a = null;
    public BigInteger b = zzhyc.g;
    public zzhya c = null;
    public zzhya d = null;
    public Integer e = null;
    public zzhyb f = zzhyb.e;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        g = valueOf;
        h = valueOf.pow(NotificationCompat.FLAG_LOCAL_ONLY);
    }

    private zzhxz() {
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.e = Integer.valueOf(i);
    }

    public final zzhyc c() {
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
            defpackage.zzl.x("signature hash type is not set");
            return null;
        }
        if (this.d == null) {
            defpackage.zzl.x("mgf1 hash type is not set");
            return null;
        }
        if (this.f == null) {
            defpackage.zzl.x("variant is not set");
            return null;
        }
        if (this.e == null) {
            defpackage.zzl.x("salt length is not set");
            return null;
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.a, Integer.valueOf(com.ironsource.mediationsdk.metadata.a.o)));
        }
        if (this.c != this.d) {
            defpackage.zzl.x("MGF1 hash is different from signature hash");
            return null;
        }
        BigInteger bigInteger = this.b;
        int compareTo = bigInteger.compareTo(zzhyc.g);
        if (compareTo != 0) {
            if (compareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new zzhyc(this.a.intValue(), this.b, this.f, this.c, this.d, this.e.intValue());
    }

    public /* synthetic */ zzhxz(int i) {
    }
}
