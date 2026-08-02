package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.InterfaceC5948a;

/* renamed from: org.spongycastle.crypto.engines.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5963m implements InterfaceC5948a {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f62566e = BigInteger.valueOf(0);

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f62567f = BigInteger.valueOf(1);

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f62568g = BigInteger.valueOf(2);

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.params.p f62569a;

    /* renamed from: b, reason: collision with root package name */
    public SecureRandom f62570b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62571c;

    /* renamed from: d, reason: collision with root package name */
    public int f62572d;

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            org.spongycastle.crypto.params.A a10 = (org.spongycastle.crypto.params.A) jVar;
            this.f62569a = (org.spongycastle.crypto.params.p) a10.a();
            this.f62570b = a10.b();
        } else {
            this.f62569a = (org.spongycastle.crypto.params.p) jVar;
            this.f62570b = new SecureRandom();
        }
        this.f62571c = z10;
        this.f62572d = this.f62569a.b().c().bitLength();
        if (z10) {
            if (!(this.f62569a instanceof org.spongycastle.crypto.params.s)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (!(this.f62569a instanceof org.spongycastle.crypto.params.r)) {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getInputBlockSize() {
        return this.f62571c ? (this.f62572d - 1) / 8 : ((this.f62572d + 7) / 8) * 2;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getOutputBlockSize() {
        return this.f62571c ? ((this.f62572d + 7) / 8) * 2 : (this.f62572d - 1) / 8;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        if (this.f62569a == null) {
            throw new IllegalStateException("ElGamal engine not initialised");
        }
        if (i11 > (this.f62571c ? (this.f62572d + 6) / 8 : getInputBlockSize())) {
            throw new org.spongycastle.crypto.l("input too large for ElGamal cipher.\n");
        }
        BigInteger c10 = this.f62569a.b().c();
        if (this.f62569a instanceof org.spongycastle.crypto.params.r) {
            int i12 = i11 / 2;
            byte[] bArr2 = new byte[i12];
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            System.arraycopy(bArr, i10 + i12, bArr3, 0, i12);
            return Aj.b.b(new BigInteger(1, bArr2).modPow(c10.subtract(f62567f).subtract(((org.spongycastle.crypto.params.r) this.f62569a).c()), c10).multiply(new BigInteger(1, bArr3)).mod(c10));
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr4 = new byte[i11];
            System.arraycopy(bArr, i10, bArr4, 0, i11);
            bArr = bArr4;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(c10) >= 0) {
            throw new org.spongycastle.crypto.l("input too large for ElGamal cipher.\n");
        }
        org.spongycastle.crypto.params.s sVar = (org.spongycastle.crypto.params.s) this.f62569a;
        int bitLength = c10.bitLength();
        BigInteger bigInteger2 = new BigInteger(bitLength, this.f62570b);
        while (true) {
            if (!bigInteger2.equals(f62566e) && bigInteger2.compareTo(c10.subtract(f62568g)) <= 0) {
                break;
            }
            bigInteger2 = new BigInteger(bitLength, this.f62570b);
        }
        BigInteger modPow = this.f62569a.b().a().modPow(bigInteger2, c10);
        BigInteger mod = bigInteger.multiply(sVar.c().modPow(bigInteger2, c10)).mod(c10);
        byte[] byteArray = modPow.toByteArray();
        byte[] byteArray2 = mod.toByteArray();
        int outputBlockSize = getOutputBlockSize();
        byte[] bArr5 = new byte[outputBlockSize];
        int i13 = outputBlockSize / 2;
        if (byteArray.length > i13) {
            System.arraycopy(byteArray, 1, bArr5, i13 - (byteArray.length - 1), byteArray.length - 1);
        } else {
            System.arraycopy(byteArray, 0, bArr5, i13 - byteArray.length, byteArray.length);
        }
        if (byteArray2.length > i13) {
            System.arraycopy(byteArray2, 1, bArr5, outputBlockSize - (byteArray2.length - 1), byteArray2.length - 1);
            return bArr5;
        }
        System.arraycopy(byteArray2, 0, bArr5, outputBlockSize - byteArray2.length, byteArray2.length);
        return bArr5;
    }
}
