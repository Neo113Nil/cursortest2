package oj;

import java.math.BigInteger;
import org.spongycastle.math.ec.h;
import org.spongycastle.math.ec.o;

/* renamed from: oj.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5921c implements InterfaceC5920b {

    /* renamed from: a, reason: collision with root package name */
    public final org.spongycastle.math.ec.d f61304a;

    /* renamed from: b, reason: collision with root package name */
    public final C5922d f61305b;

    /* renamed from: c, reason: collision with root package name */
    public final h f61306c;

    public C5921c(org.spongycastle.math.ec.d dVar, C5922d c5922d) {
        this.f61304a = dVar;
        this.f61305b = c5922d;
        this.f61306c = new o(dVar.m(c5922d.b()));
    }

    public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, int i10) {
        boolean z10 = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i10 - 1);
        BigInteger shiftRight = multiply.shiftRight(i10);
        if (testBit) {
            shiftRight = shiftRight.add(org.spongycastle.math.ec.c.f62725b);
        }
        return z10 ? shiftRight.negate() : shiftRight;
    }

    @Override // oj.InterfaceC5920b
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        int c10 = this.f61305b.c();
        BigInteger a10 = a(bigInteger, this.f61305b.d(), c10);
        BigInteger a11 = a(bigInteger, this.f61305b.e(), c10);
        C5922d c5922d = this.f61305b;
        return new BigInteger[]{bigInteger.subtract(a10.multiply(c5922d.f()).add(a11.multiply(c5922d.h()))), a10.multiply(c5922d.g()).add(a11.multiply(c5922d.i())).negate()};
    }

    @Override // oj.InterfaceC5919a
    public h getPointMap() {
        return this.f61306c;
    }

    @Override // oj.InterfaceC5919a
    public boolean hasEfficientPointMap() {
        return true;
    }
}
