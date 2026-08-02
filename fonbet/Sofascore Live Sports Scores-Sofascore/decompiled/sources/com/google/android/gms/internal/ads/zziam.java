package com.google.android.gms.internal.ads;

import defpackage.j40;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zziam implements zzibs {
    public static final j40 d = new j40(16);
    public final SecretKeySpec a;
    public final int b;
    public final int c;

    public zziam(byte[] bArr, int i) {
        if (!zzhlx.a(2)) {
            defpackage.zzl.x("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        zzicf.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) d.get()).getBlockSize();
        this.c = blockSize;
        if (i <= blockSize) {
            this.b = i;
        } else {
            defpackage.zzl.x("invalid IV size");
            throw null;
        }
    }
}
