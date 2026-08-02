package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhhk {
    public Integer a = null;
    public zzhhl b = zzhhl.d;

    private zzhhk() {
    }

    public final void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final zzhhm b() {
        Integer num = this.a;
        if (num != null) {
            return new zzhhm(num.intValue(), this.b);
        }
        defpackage.zzl.x("Key size is not set");
        return null;
    }

    public /* synthetic */ zzhhk(int i) {
    }
}
