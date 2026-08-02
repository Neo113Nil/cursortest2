package Ri;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.Z;

/* loaded from: classes5.dex */
public class j extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5937o f10434a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.math.ec.d f10435b;

    public j(org.spongycastle.math.ec.d dVar, byte[] bArr) {
        this.f10435b = dVar;
        this.f10434a = new Z(Aj.a.d(bArr));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f10434a;
    }

    public j(org.spongycastle.math.ec.d dVar, AbstractC5937o abstractC5937o) {
        this(dVar, abstractC5937o.m());
    }
}
