package org.spongycastle.crypto.engines;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.params.E f62476a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62477b;

    public BigInteger a(byte[] bArr, int i10, int i11) {
        if (i11 > c() + 1) {
            throw new org.spongycastle.crypto.l("input too large for RSA cipher.");
        }
        if (i11 == c() + 1 && !this.f62477b) {
            throw new org.spongycastle.crypto.l("input too large for RSA cipher.");
        }
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(this.f62476a.c()) < 0) {
            return bigInteger;
        }
        throw new org.spongycastle.crypto.l("input too large for RSA cipher.");
    }

    public byte[] b(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.f62477b) {
            if (byteArray[0] == 0 && byteArray.length > d()) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            }
            if (byteArray.length < d()) {
                int d10 = d();
                byte[] bArr2 = new byte[d10];
                System.arraycopy(byteArray, 0, bArr2, d10 - byteArray.length, byteArray.length);
                return bArr2;
            }
        } else if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray, 1, bArr3, 0, length2);
            return bArr3;
        }
        return byteArray;
    }

    public int c() {
        return this.f62477b ? ((r0 + 7) / 8) - 1 : (this.f62476a.c().bitLength() + 7) / 8;
    }

    public int d() {
        return this.f62477b ? (this.f62476a.c().bitLength() + 7) / 8 : ((r0 + 7) / 8) - 1;
    }

    public void e(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.A) {
            this.f62476a = (org.spongycastle.crypto.params.E) ((org.spongycastle.crypto.params.A) jVar).a();
        } else {
            this.f62476a = (org.spongycastle.crypto.params.E) jVar;
        }
        this.f62477b = z10;
    }

    public BigInteger f(BigInteger bigInteger) {
        org.spongycastle.crypto.params.E e10 = this.f62476a;
        if (!(e10 instanceof org.spongycastle.crypto.params.F)) {
            return bigInteger.modPow(e10.b(), this.f62476a.c());
        }
        org.spongycastle.crypto.params.F f10 = (org.spongycastle.crypto.params.F) e10;
        BigInteger g10 = f10.g();
        BigInteger i10 = f10.i();
        BigInteger e11 = f10.e();
        BigInteger f11 = f10.f();
        BigInteger j10 = f10.j();
        BigInteger modPow = bigInteger.remainder(g10).modPow(e11, g10);
        BigInteger modPow2 = bigInteger.remainder(i10).modPow(f11, i10);
        return modPow.subtract(modPow2).multiply(j10).mod(g10).multiply(i10).add(modPow2);
    }
}
