package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpw {
    public Integer a = null;
    public Integer b = null;
    public zzhpx c = null;
    public zzhpy d = zzhpy.e;

    private zzhpw() {
    }

    public final void a(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final zzhpz c() {
        Integer num = this.a;
        if (num == null) {
            defpackage.zzl.x("key size is not set");
            return null;
        }
        if (this.b == null) {
            defpackage.zzl.x("tag size is not set");
            return null;
        }
        if (this.c == null) {
            defpackage.zzl.x("hash type is not set");
            return null;
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.a));
        }
        Integer num2 = this.b;
        int intValue = num2.intValue();
        zzhpx zzhpxVar = this.c;
        if (intValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (zzhpxVar == zzhpx.b) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (zzhpxVar == zzhpx.c) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (zzhpxVar == zzhpx.d) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (zzhpxVar == zzhpx.e) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (zzhpxVar != zzhpx.f) {
                defpackage.zzl.x("unknown hash type; must be SHA256, SHA384 or SHA512");
                return null;
            }
            if (intValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zzhpz(this.a.intValue(), this.b.intValue(), this.d, this.c);
    }

    public /* synthetic */ zzhpw(int i) {
    }
}
