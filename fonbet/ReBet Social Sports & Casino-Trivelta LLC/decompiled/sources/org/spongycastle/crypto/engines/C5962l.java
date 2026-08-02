package org.spongycastle.crypto.engines;

import ej.AbstractC4217a;
import java.security.SecureRandom;

/* renamed from: org.spongycastle.crypto.engines.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5962l implements org.spongycastle.crypto.C {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a, reason: collision with root package name */
    public Zi.b f62561a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.params.w f62562b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.crypto.params.z f62563c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62564d;
    private byte[] iv;

    /* renamed from: e, reason: collision with root package name */
    public org.spongycastle.crypto.o f62565e = AbstractC4217a.b();
    byte[] digest = new byte[20];

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = i10 + 1;
            bArr2[i10] = bArr[bArr.length - i11];
            i10 = i11;
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.C
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        SecureRandom secureRandom;
        this.f62564d = z10;
        this.f62561a = new Zi.b(new C5961k());
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            org.spongycastle.crypto.params.A a10 = (org.spongycastle.crypto.params.A) jVar;
            org.spongycastle.crypto.j a11 = a10.a();
            SecureRandom b10 = a10.b();
            jVar = a11;
            secureRandom = b10;
        } else {
            secureRandom = new SecureRandom();
        }
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62562b = (org.spongycastle.crypto.params.w) jVar;
            if (this.f62564d) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                secureRandom.nextBytes(bArr);
                this.f62563c = new org.spongycastle.crypto.params.z(this.f62562b, this.iv);
                return;
            }
            return;
        }
        if (jVar instanceof org.spongycastle.crypto.params.z) {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.f62563c = zVar;
            this.iv = zVar.a();
            this.f62562b = (org.spongycastle.crypto.params.w) this.f62563c.b();
            if (!this.f62564d) {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
            byte[] bArr2 = this.iv;
            if (bArr2 == null || bArr2.length != 8) {
                throw new IllegalArgumentException("IV is not 8 octets");
            }
        }
    }

    public final byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f62565e.update(bArr, 0, bArr.length);
        this.f62565e.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    public final boolean c(byte[] bArr, byte[] bArr2) {
        return Aj.a.k(b(bArr), bArr2);
    }

    @Override // org.spongycastle.crypto.C
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // org.spongycastle.crypto.C
    public byte[] unwrap(byte[] bArr, int i10, int i11) {
        if (this.f62564d) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.spongycastle.crypto.r("Null pointer as ciphertext");
        }
        int blockSize = this.f62561a.getBlockSize();
        if (i11 % blockSize != 0) {
            throw new org.spongycastle.crypto.r("Ciphertext not multiple of " + blockSize);
        }
        this.f62561a.a(false, new org.spongycastle.crypto.params.z(this.f62562b, IV2));
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 != i11; i12 += blockSize) {
            this.f62561a.processBlock(bArr, i10 + i12, bArr2, i12);
        }
        byte[] d10 = d(bArr2);
        byte[] bArr3 = new byte[8];
        this.iv = bArr3;
        int length = d10.length;
        int i13 = length - 8;
        byte[] bArr4 = new byte[i13];
        System.arraycopy(d10, 0, bArr3, 0, 8);
        System.arraycopy(d10, 8, bArr4, 0, d10.length - 8);
        org.spongycastle.crypto.params.z zVar = new org.spongycastle.crypto.params.z(this.f62562b, this.iv);
        this.f62563c = zVar;
        this.f62561a.a(false, zVar);
        byte[] bArr5 = new byte[i13];
        for (int i14 = 0; i14 != i13; i14 += blockSize) {
            this.f62561a.processBlock(bArr4, i14, bArr5, i14);
        }
        int i15 = length - 16;
        byte[] bArr6 = new byte[i15];
        byte[] bArr7 = new byte[8];
        System.arraycopy(bArr5, 0, bArr6, 0, i15);
        System.arraycopy(bArr5, i15, bArr7, 0, 8);
        if (c(bArr6, bArr7)) {
            return bArr6;
        }
        throw new org.spongycastle.crypto.r("Checksum inside ciphertext is corrupted");
    }

    @Override // org.spongycastle.crypto.C
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f62564d) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        byte[] b10 = b(bArr2);
        int length = b10.length + i11;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, 0, bArr3, 0, i11);
        System.arraycopy(b10, 0, bArr3, i11, b10.length);
        int blockSize = this.f62561a.getBlockSize();
        if (length % blockSize != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f62561a.a(true, this.f62563c);
        byte[] bArr4 = new byte[length];
        for (int i12 = 0; i12 != length; i12 += blockSize) {
            this.f62561a.processBlock(bArr3, i12, bArr4, i12);
        }
        byte[] bArr5 = this.iv;
        byte[] bArr6 = new byte[bArr5.length + length];
        System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
        System.arraycopy(bArr4, 0, bArr6, this.iv.length, length);
        byte[] d10 = d(bArr6);
        this.f62561a.a(true, new org.spongycastle.crypto.params.z(this.f62562b, IV2));
        for (int i13 = 0; i13 != d10.length; i13 += blockSize) {
            this.f62561a.processBlock(d10, i13, d10, i13);
        }
        return d10;
    }
}
