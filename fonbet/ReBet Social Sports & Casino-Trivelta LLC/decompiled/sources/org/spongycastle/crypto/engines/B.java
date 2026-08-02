package org.spongycastle.crypto.engines;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class B implements org.spongycastle.crypto.C {

    /* renamed from: a, reason: collision with root package name */
    public Zi.b f62461a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.params.z f62462b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62463c;

    /* renamed from: d, reason: collision with root package name */
    public SecureRandom f62464d;

    public B(org.spongycastle.crypto.e eVar) {
        this.f62461a = new Zi.b(eVar);
    }

    @Override // org.spongycastle.crypto.C
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f62463c = z10;
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            org.spongycastle.crypto.params.A a10 = (org.spongycastle.crypto.params.A) jVar;
            this.f62464d = a10.b();
            this.f62462b = (org.spongycastle.crypto.params.z) a10.a();
        } else {
            if (z10) {
                this.f62464d = new SecureRandom();
            }
            this.f62462b = (org.spongycastle.crypto.params.z) jVar;
        }
    }

    @Override // org.spongycastle.crypto.C
    public String getAlgorithmName() {
        return this.f62461a.d().getAlgorithmName() + "/RFC3211Wrap";
    }

    @Override // org.spongycastle.crypto.C
    public byte[] unwrap(byte[] bArr, int i10, int i11) {
        if (this.f62463c) {
            throw new IllegalStateException("not set for unwrapping");
        }
        int blockSize = this.f62461a.getBlockSize();
        if (i11 < blockSize * 2) {
            throw new org.spongycastle.crypto.r("input too short");
        }
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[blockSize];
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        System.arraycopy(bArr, i10, bArr3, 0, blockSize);
        this.f62461a.a(false, new org.spongycastle.crypto.params.z(this.f62462b.b(), bArr3));
        for (int i13 = blockSize; i13 < i11; i13 += blockSize) {
            this.f62461a.processBlock(bArr2, i13, bArr2, i13);
        }
        System.arraycopy(bArr2, i11 - blockSize, bArr3, 0, blockSize);
        this.f62461a.a(false, new org.spongycastle.crypto.params.z(this.f62462b.b(), bArr3));
        this.f62461a.processBlock(bArr2, 0, bArr2, 0);
        this.f62461a.a(false, this.f62462b);
        for (int i14 = 0; i14 < i11; i14 += blockSize) {
            this.f62461a.processBlock(bArr2, i14, bArr2, i14);
        }
        int i15 = bArr2[0];
        if ((i15 & 255) > i11 - 4) {
            throw new org.spongycastle.crypto.r("wrapped key corrupted");
        }
        byte[] bArr4 = new byte[i15 & 255];
        System.arraycopy(bArr2, 4, bArr4, 0, i15);
        int i16 = 0;
        while (i12 != 3) {
            int i17 = i12 + 1;
            i16 |= ((byte) (~bArr2[i17])) ^ bArr4[i12];
            i12 = i17;
        }
        if (i16 == 0) {
            return bArr4;
        }
        throw new org.spongycastle.crypto.r("wrapped key fails checksum");
    }

    @Override // org.spongycastle.crypto.C
    public byte[] wrap(byte[] bArr, int i10, int i11) {
        if (!this.f62463c) {
            throw new IllegalStateException("not set for wrapping");
        }
        this.f62461a.a(true, this.f62462b);
        int blockSize = this.f62461a.getBlockSize();
        int i12 = i11 + 4;
        int i13 = blockSize * 2;
        byte[] bArr2 = i12 < i13 ? new byte[i13] : new byte[i12 % blockSize == 0 ? i12 : ((i12 / blockSize) + 1) * blockSize];
        bArr2[0] = (byte) i11;
        bArr2[1] = (byte) (~bArr[i10]);
        bArr2[2] = (byte) (~bArr[i10 + 1]);
        bArr2[3] = (byte) (~bArr[i10 + 2]);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        int length = bArr2.length - i12;
        byte[] bArr3 = new byte[length];
        this.f62464d.nextBytes(bArr3);
        System.arraycopy(bArr3, 0, bArr2, i12, length);
        for (int i14 = 0; i14 < bArr2.length; i14 += blockSize) {
            this.f62461a.processBlock(bArr2, i14, bArr2, i14);
        }
        for (int i15 = 0; i15 < bArr2.length; i15 += blockSize) {
            this.f62461a.processBlock(bArr2, i15, bArr2, i15);
        }
        return bArr2;
    }
}
