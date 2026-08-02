package Oi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5936n f8662a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5927e f8663b;

    public a(AbstractC5941t abstractC5941t) {
        this.f8662a = (C5936n) abstractC5941t.n(0);
        this.f8663b = abstractC5941t.n(1);
    }

    public static a c(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(AbstractC5941t.k(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public C5936n e() {
        return this.f8662a;
    }

    public InterfaceC5927e f() {
        return this.f8663b;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f8662a);
        c5928f.a(this.f8663b);
        return new d0(c5928f);
    }

    public a(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.f8662a = c5936n;
        this.f8663b = interfaceC5927e;
    }
}
