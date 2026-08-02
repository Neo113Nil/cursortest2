package Ri;

import java.math.BigInteger;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.Z;
import org.spongycastle.math.ec.e;

/* loaded from: classes5.dex */
public class k extends AbstractC5935m {

    /* renamed from: b, reason: collision with root package name */
    public static m f10436b = new m();

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.math.ec.e f10437a;

    public k(org.spongycastle.math.ec.e eVar) {
        this.f10437a = eVar;
    }

    public org.spongycastle.math.ec.e c() {
        return this.f10437a;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return new Z(f10436b.c(this.f10437a.t(), f10436b.b(this.f10437a)));
    }

    public k(BigInteger bigInteger, AbstractC5937o abstractC5937o) {
        this(new e.b(bigInteger, new BigInteger(1, abstractC5937o.m())));
    }

    public k(int i10, int i11, int i12, int i13, AbstractC5937o abstractC5937o) {
        this(new e.a(i10, i11, i12, i13, new BigInteger(1, abstractC5937o.m())));
    }
}
