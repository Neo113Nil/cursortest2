package Ri;

import java.math.BigInteger;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5937o;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class h extends AbstractC5935m implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f10427f = BigInteger.valueOf(1);

    /* renamed from: a, reason: collision with root package name */
    public l f10428a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.math.ec.d f10429b;

    /* renamed from: c, reason: collision with root package name */
    public j f10430c;

    /* renamed from: d, reason: collision with root package name */
    public BigInteger f10431d;

    /* renamed from: e, reason: collision with root package name */
    public BigInteger f10432e;
    private byte[] seed;

    public h(AbstractC5941t abstractC5941t) {
        if (!(abstractC5941t.n(0) instanceof C5933k) || !((C5933k) abstractC5941t.n(0)).n().equals(f10427f)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        g gVar = new g(l.e(abstractC5941t.n(1)), AbstractC5941t.k(abstractC5941t.n(2)));
        this.f10429b = gVar.c();
        InterfaceC5927e n10 = abstractC5941t.n(3);
        if (n10 instanceof j) {
            this.f10430c = (j) n10;
        } else {
            this.f10430c = new j(this.f10429b, (AbstractC5937o) n10);
        }
        this.f10431d = ((C5933k) abstractC5941t.n(4)).n();
        this.seed = gVar.e();
        if (abstractC5941t.size() == 6) {
            this.f10432e = ((C5933k) abstractC5941t.n(5)).n();
        }
    }

    public static h e(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(AbstractC5941t.k(obj));
        }
        return null;
    }

    public org.spongycastle.math.ec.d c() {
        return this.f10429b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(new C5933k(f10427f));
        c5928f.a(this.f10428a);
        c5928f.a(new g(this.f10429b, this.seed));
        c5928f.a(this.f10430c);
        c5928f.a(new C5933k(this.f10431d));
        BigInteger bigInteger = this.f10432e;
        if (bigInteger != null) {
            c5928f.a(new C5933k(bigInteger));
        }
        return new d0(c5928f);
    }

    public h(org.spongycastle.math.ec.d dVar, j jVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(dVar, jVar, bigInteger, bigInteger2, null);
    }

    public h(org.spongycastle.math.ec.d dVar, j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f10429b = dVar;
        this.f10430c = jVar;
        this.f10431d = bigInteger;
        this.f10432e = bigInteger2;
        this.seed = bArr;
        if (org.spongycastle.math.ec.b.k(dVar)) {
            this.f10428a = new l(dVar.s().getCharacteristic());
            return;
        }
        if (org.spongycastle.math.ec.b.i(dVar)) {
            int[] exponentsPresent = ((org.spongycastle.math.field.f) dVar.s()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                this.f10428a = new l(exponentsPresent[2], exponentsPresent[1]);
                return;
            } else {
                if (exponentsPresent.length == 5) {
                    this.f10428a = new l(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
                    return;
                }
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        }
        throw new IllegalArgumentException("'curve' is of an unsupported type");
    }
}
