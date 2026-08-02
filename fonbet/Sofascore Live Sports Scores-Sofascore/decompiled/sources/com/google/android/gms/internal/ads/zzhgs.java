package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhgs {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public zzhgt d = zzhgt.d;

    private zzhgs() {
    }

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i != 12 && i != 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public final void c() {
        this.c = 16;
    }

    public final zzhgu d() {
        Integer num = this.a;
        if (num == null) {
            defpackage.zzl.x("Key size is not set");
            return null;
        }
        if (this.b == null) {
            defpackage.zzl.x("IV size is not set");
            return null;
        }
        if (this.c == null) {
            defpackage.zzl.x("Tag size is not set");
            return null;
        }
        int intValue = num.intValue();
        int intValue2 = this.b.intValue();
        this.c.getClass();
        return new zzhgu(intValue, intValue2, this.d);
    }

    public /* synthetic */ zzhgs(int i) {
    }
}
