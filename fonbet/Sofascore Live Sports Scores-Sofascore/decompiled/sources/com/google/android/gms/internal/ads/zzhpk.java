package com.google.android.gms.internal.ads;

import defpackage.me4;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhpk {
    public Integer a = null;
    public Integer b = null;
    public zzhpl c = zzhpl.e;

    private zzhpk() {
    }

    public final void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(me4.g(i, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i).length() + 40)));
        }
        this.b = Integer.valueOf(i);
    }

    public final zzhpm c() {
        Integer num = this.a;
        if (num == null) {
            defpackage.zzl.x("key size not set");
            return null;
        }
        if (this.b != null) {
            return new zzhpm(num.intValue(), this.b.intValue(), this.c);
        }
        defpackage.zzl.x("tag size not set");
        return null;
    }

    public /* synthetic */ zzhpk(int i) {
    }
}
