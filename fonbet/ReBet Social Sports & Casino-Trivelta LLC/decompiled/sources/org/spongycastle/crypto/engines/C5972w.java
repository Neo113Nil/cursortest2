package org.spongycastle.crypto.engines;

import ej.AbstractC4217a;
import java.security.SecureRandom;

/* renamed from: org.spongycastle.crypto.engines.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5972w implements org.spongycastle.crypto.C {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};

    /* renamed from: a, reason: collision with root package name */
    public Zi.b f62606a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.j f62607b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.crypto.params.z f62608c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62609d;

    /* renamed from: e, reason: collision with root package name */
    public SecureRandom f62610e;
    private byte[] iv;

    /* renamed from: f, reason: collision with root package name */
    public org.spongycastle.crypto.o f62611f = AbstractC4217a.b();
    byte[] digest = new byte[20];

    private byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.f62611f.update(bArr, 0, bArr.length);
        this.f62611f.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean c(byte[] bArr, byte[] bArr2) {
        return Aj.a.k(b(bArr), bArr2);
    }

    @Override // org.spongycastle.crypto.C
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f62609d = z10;
        this.f62606a = new Zi.b(new C5971v());
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            org.spongycastle.crypto.params.A a10 = (org.spongycastle.crypto.params.A) jVar;
            this.f62610e = a10.b();
            jVar = a10.a();
        } else {
            this.f62610e = new SecureRandom();
        }
        if (!(jVar instanceof org.spongycastle.crypto.params.z)) {
            this.f62607b = jVar;
            if (this.f62609d) {
                byte[] bArr = new byte[8];
                this.iv = bArr;
                this.f62610e.nextBytes(bArr);
                this.f62608c = new org.spongycastle.crypto.params.z(this.f62607b, this.iv);
                return;
            }
            return;
        }
        org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
        this.f62608c = zVar;
        this.iv = zVar.a();
        this.f62607b = this.f62608c.b();
        if (!this.f62609d) {
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        byte[] bArr2 = this.iv;
        if (bArr2 == null || bArr2.length != 8) {
            throw new IllegalArgumentException("IV is not 8 octets");
        }
    }

    @Override // org.spongycastle.crypto.C
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.C
    public byte[] unwrap(byte[] bArr, int i10, int i11) {
        if (this.f62609d) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr == null) {
            throw new org.spongycastle.crypto.r("Null pointer as ciphertext");
        }
        if (i11 % this.f62606a.getBlockSize() != 0) {
            throw new org.spongycastle.crypto.r("Ciphertext not multiple of " + this.f62606a.getBlockSize());
        }
        this.f62606a.a(false, new org.spongycastle.crypto.params.z(this.f62607b, IV2));
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        for (int i12 = 0; i12 < i11 / this.f62606a.getBlockSize(); i12++) {
            int blockSize = this.f62606a.getBlockSize() * i12;
            this.f62606a.processBlock(bArr2, blockSize, bArr2, blockSize);
        }
        byte[] bArr3 = new byte[i11];
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[i11 - i14];
            i13 = i14;
        }
        byte[] bArr4 = new byte[8];
        this.iv = bArr4;
        int i15 = i11 - 8;
        byte[] bArr5 = new byte[i15];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i15);
        org.spongycastle.crypto.params.z zVar = new org.spongycastle.crypto.params.z(this.f62607b, this.iv);
        this.f62608c = zVar;
        this.f62606a.a(false, zVar);
        byte[] bArr6 = new byte[i15];
        System.arraycopy(bArr5, 0, bArr6, 0, i15);
        for (int i16 = 0; i16 < i15 / this.f62606a.getBlockSize(); i16++) {
            int blockSize2 = this.f62606a.getBlockSize() * i16;
            this.f62606a.processBlock(bArr6, blockSize2, bArr6, blockSize2);
        }
        int i17 = i11 - 16;
        byte[] bArr7 = new byte[i17];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i17);
        System.arraycopy(bArr6, i17, bArr8, 0, 8);
        if (!c(bArr7, bArr8)) {
            throw new org.spongycastle.crypto.r("Checksum inside ciphertext is corrupted");
        }
        int i18 = bArr7[0];
        if (i17 - ((i18 & 255) + 1) <= 7) {
            byte[] bArr9 = new byte[i18];
            System.arraycopy(bArr7, 1, bArr9, 0, i18);
            return bArr9;
        }
        throw new org.spongycastle.crypto.r("too many pad bytes (" + (i17 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // org.spongycastle.crypto.C
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f62609d) {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i12 = i11 + 1;
        int i13 = i12 % 8;
        int i14 = i13 != 0 ? (8 - i13) + i12 : i12;
        byte[] bArr2 = new byte[i14];
        bArr2[0] = (byte) i11;
        System.arraycopy(bArr, i10, bArr2, 1, i11);
        int i15 = (i14 - i11) - 1;
        byte[] bArr3 = new byte[i15];
        if (i15 > 0) {
            this.f62610e.nextBytes(bArr3);
            System.arraycopy(bArr3, 0, bArr2, i12, i15);
        }
        byte[] b10 = b(bArr2);
        int length = b10.length + i14;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr2, 0, bArr4, 0, i14);
        System.arraycopy(b10, 0, bArr4, i14, b10.length);
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, 0, bArr5, 0, length);
        int blockSize = length / this.f62606a.getBlockSize();
        if (length % this.f62606a.getBlockSize() != 0) {
            throw new IllegalStateException("Not multiple of block length");
        }
        this.f62606a.a(true, this.f62608c);
        for (int i16 = 0; i16 < blockSize; i16++) {
            int blockSize2 = this.f62606a.getBlockSize() * i16;
            this.f62606a.processBlock(bArr5, blockSize2, bArr5, blockSize2);
        }
        byte[] bArr6 = this.iv;
        int length2 = bArr6.length + length;
        byte[] bArr7 = new byte[length2];
        System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
        System.arraycopy(bArr5, 0, bArr7, this.iv.length, length);
        byte[] bArr8 = new byte[length2];
        int i17 = 0;
        while (i17 < length2) {
            int i18 = i17 + 1;
            bArr8[i17] = bArr7[length2 - i18];
            i17 = i18;
        }
        this.f62606a.a(true, new org.spongycastle.crypto.params.z(this.f62607b, IV2));
        for (int i19 = 0; i19 < blockSize + 1; i19++) {
            int blockSize3 = this.f62606a.getBlockSize() * i19;
            this.f62606a.processBlock(bArr8, blockSize3, bArr8, blockSize3);
        }
        return bArr8;
    }
}
