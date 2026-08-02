package Ri;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class a extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public C5933k f10385a;

    /* renamed from: b, reason: collision with root package name */
    public C5933k f10386b;

    /* renamed from: c, reason: collision with root package name */
    public C5933k f10387c;

    /* renamed from: d, reason: collision with root package name */
    public C5933k f10388d;

    /* renamed from: e, reason: collision with root package name */
    public b f10389e;

    public a(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() < 3 || abstractC5941t.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        Enumeration o10 = abstractC5941t.o();
        this.f10385a = C5933k.k(o10.nextElement());
        this.f10386b = C5933k.k(o10.nextElement());
        this.f10387c = C5933k.k(o10.nextElement());
        InterfaceC5927e f10 = f(o10);
        if (f10 != null && (f10 instanceof C5933k)) {
            this.f10388d = C5933k.k(f10);
            f10 = f(o10);
        }
        if (f10 != null) {
            this.f10389e = b.c(f10.toASN1Primitive());
        }
    }

    public static a e(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof AbstractC5941t) {
            return new a((AbstractC5941t) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static InterfaceC5927e f(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (InterfaceC5927e) enumeration.nextElement();
        }
        return null;
    }

    public C5933k c() {
        return this.f10386b;
    }

    public C5933k g() {
        return this.f10385a;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f10385a);
        c5928f.a(this.f10386b);
        c5928f.a(this.f10387c);
        C5933k c5933k = this.f10388d;
        if (c5933k != null) {
            c5928f.a(c5933k);
        }
        b bVar = this.f10389e;
        if (bVar != null) {
            c5928f.a(bVar);
        }
        return new d0(c5928f);
    }
}
