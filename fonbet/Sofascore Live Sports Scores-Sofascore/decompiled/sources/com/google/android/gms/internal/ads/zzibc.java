package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzibc implements zzhek {
    public final zziam a;
    public final zzibx b;
    public final int c;
    public final byte[] d;

    public zzibc(zziam zziamVar, zzibx zzibxVar, int i, byte[] bArr) {
        this.a = zziamVar;
        this.b = zzibxVar;
        this.c = i;
        this.d = bArr;
    }

    public static zzibc a(zzhge zzhgeVar) {
        zzicj zzicjVar = zzhgeVar.b;
        zzhfr zzhfrVar = zzhfr.a;
        byte[] b = zzicjVar.a.b();
        zzhgm zzhgmVar = zzhgeVar.a;
        zziam zziamVar = new zziam(b, zzhgmVar.c);
        String valueOf = String.valueOf(zzhgmVar.f);
        zzibw zzibwVar = new zzibw("HMAC".concat(valueOf), new SecretKeySpec(zzhgeVar.c.a.b(), "HMAC"));
        int i = zzhgmVar.d;
        return new zzibc(zziamVar, new zzibx(zzibwVar, i), i, zzhgeVar.d.b());
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < i + length2) {
            defpackage.zzl.x("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!zzhpd.c(bArr3, bArr)) {
            defpackage.zzl.x("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int i2 = length - i;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] a = zziat.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
        zzibx zzibxVar = this.b;
        int i3 = zzibxVar.b;
        zzhrh zzhrhVar = zzibxVar.a;
        byte[] bArr4 = zzibxVar.d;
        int length3 = bArr4.length;
        byte[] bArr5 = zzibxVar.c;
        if (!MessageDigest.isEqual(length3 > 0 ? zziat.a(bArr5, zzhrhVar.a(i3, zziat.a(a, bArr4))) : zziat.a(bArr5, zzhrhVar.a(i3, a)), copyOfRange2)) {
            defpackage.zzl.x("invalid MAC");
            return null;
        }
        int length4 = copyOfRange.length;
        zziam zziamVar = this.a;
        int i4 = zziamVar.b;
        if (length4 < i4) {
            defpackage.zzl.x("ciphertext too short");
            return null;
        }
        byte[] bArr6 = new byte[i4];
        System.arraycopy(copyOfRange, 0, bArr6, 0, i4);
        int i5 = length4 - i4;
        byte[] bArr7 = new byte[i5];
        Cipher cipher = (Cipher) zziam.d.get();
        byte[] bArr8 = new byte[zziamVar.c];
        System.arraycopy(bArr6, 0, bArr8, 0, i4);
        cipher.init(2, zziamVar.a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(copyOfRange, i4, i5, bArr7, 0) == i5) {
            return bArr7;
        }
        defpackage.zzl.x("stored output's length does not match input's length");
        return null;
    }
}
