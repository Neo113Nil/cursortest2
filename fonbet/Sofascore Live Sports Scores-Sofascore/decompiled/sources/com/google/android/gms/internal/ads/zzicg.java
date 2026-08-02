package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzicg implements zzhek {
    public final zzhkz a;
    public final byte[] b;

    public zzicg(byte[] bArr, byte[] bArr2) {
        this.a = new zzhkz(bArr);
        this.b = bArr2;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 40) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        return this.a.F(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return a(bArr, bArr2);
        }
        if (zzhpd.c(bArr3, bArr)) {
            return a(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
        return null;
    }
}
