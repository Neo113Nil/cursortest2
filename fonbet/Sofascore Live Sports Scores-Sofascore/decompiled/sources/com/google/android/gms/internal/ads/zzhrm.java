package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhrm implements zzhrh {
    public final SecretKeySpec a;
    public final Provider b;

    public zzhrm(byte[] bArr, Provider provider) {
        if (!zzhlx.a(1)) {
            defpackage.zzl.x("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
            throw null;
        }
        this.a = new SecretKeySpec(bArr, "AES");
        this.b = provider;
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public final byte[] a(int i, byte[] bArr) {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.b);
        mac.init(this.a);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : Arrays.copyOf(doFinal, i);
    }
}
