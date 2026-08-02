package Qi;

import java.math.BigInteger;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class i extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f9787a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f9788b;

    /* renamed from: c, reason: collision with root package name */
    public C5933k f9789c;

    public i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f9787a = new C5933k(bigInteger);
        this.f9788b = new C5933k(bigInteger2);
        this.f9789c = new C5933k(bigInteger3);
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f9787a);
        c5928f.a(this.f9788b);
        c5928f.a(this.f9789c);
        return new d0(c5928f);
    }
}
