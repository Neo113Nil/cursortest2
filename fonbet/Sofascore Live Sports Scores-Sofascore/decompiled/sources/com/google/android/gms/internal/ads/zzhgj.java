package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgj {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public Integer d = null;
    public zzhgk e = null;
    public zzhgl f = zzhgl.d;

    private zzhgj() {
    }

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void d(int i) {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.d = Integer.valueOf(i);
    }

    public final zzhgm e() {
        if (this.a == null) {
            defpackage.zzl.x("AES key size is not set");
            return null;
        }
        if (this.b == null) {
            defpackage.zzl.x("HMAC key size is not set");
            return null;
        }
        if (this.c == null) {
            defpackage.zzl.x("iv size is not set");
            return null;
        }
        Integer num = this.d;
        if (num == null) {
            defpackage.zzl.x("tag size is not set");
            return null;
        }
        if (this.e == null) {
            defpackage.zzl.x("hash type is not set");
            return null;
        }
        int intValue = num.intValue();
        zzhgk zzhgkVar = this.e;
        if (zzhgkVar == zzhgk.b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (zzhgkVar == zzhgk.c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (zzhgkVar == zzhgk.d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (zzhgkVar == zzhgk.e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (zzhgkVar != zzhgk.f) {
                defpackage.zzl.x("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new zzhgm(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.f, this.e);
    }

    public /* synthetic */ zzhgj(int i) {
    }
}
