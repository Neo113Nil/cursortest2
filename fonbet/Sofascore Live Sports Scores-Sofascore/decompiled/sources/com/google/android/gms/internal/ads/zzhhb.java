package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhb {
    public Integer a = null;
    public Integer b = null;
    public Integer c = null;
    public zzhhc d = zzhhc.d;

    private zzhhb() {
    }

    public final void a(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void b() {
        this.b = 12;
    }

    public final void c() {
        this.c = 16;
    }

    public final zzhhd d() {
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
        this.b.getClass();
        this.c.getClass();
        return new zzhhd(intValue, this.d);
    }

    public /* synthetic */ zzhhb(int i) {
    }
}
