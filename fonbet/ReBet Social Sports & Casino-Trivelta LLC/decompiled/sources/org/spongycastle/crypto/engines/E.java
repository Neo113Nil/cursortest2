package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.InterfaceC5948a;

/* loaded from: classes5.dex */
public class E implements InterfaceC5948a {

    /* renamed from: d, reason: collision with root package name */
    public static final BigInteger f62472d = BigInteger.valueOf(1);

    /* renamed from: a, reason: collision with root package name */
    public F f62473a = new F();

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.params.E f62474b;

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f62475c;

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f62473a.e(z10, jVar);
        if (!(jVar instanceof org.spongycastle.crypto.params.A)) {
            this.f62474b = (org.spongycastle.crypto.params.E) jVar;
            this.f62475c = new SecureRandom();
        } else {
            org.spongycastle.crypto.params.A a10 = (org.spongycastle.crypto.params.A) jVar;
            this.f62474b = (org.spongycastle.crypto.params.E) a10.a();
            this.f62475c = a10.b();
        }
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getInputBlockSize() {
        return this.f62473a.c();
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getOutputBlockSize() {
        return this.f62473a.d();
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        BigInteger f10;
        if (this.f62474b == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        BigInteger a10 = this.f62473a.a(bArr, i10, i11);
        org.spongycastle.crypto.params.E e10 = this.f62474b;
        if (e10 instanceof org.spongycastle.crypto.params.F) {
            org.spongycastle.crypto.params.F f11 = (org.spongycastle.crypto.params.F) e10;
            BigInteger h10 = f11.h();
            if (h10 != null) {
                BigInteger c10 = f11.c();
                BigInteger bigInteger = f62472d;
                BigInteger c11 = Aj.b.c(bigInteger, c10.subtract(bigInteger), this.f62475c);
                f10 = this.f62473a.f(c11.modPow(h10, c10).multiply(a10).mod(c10)).multiply(c11.modInverse(c10)).mod(c10);
                if (!a10.equals(f10.modPow(h10, c10))) {
                    throw new IllegalStateException("RSA engine faulty decryption/signing detected");
                }
            } else {
                f10 = this.f62473a.f(a10);
            }
        } else {
            f10 = this.f62473a.f(a10);
        }
        return this.f62473a.b(f10);
    }
}
