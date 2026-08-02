package Ri;

import java.math.BigInteger;
import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5933k;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class c extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public final C5933k f10392a;

    /* renamed from: b, reason: collision with root package name */
    public final C5933k f10393b;

    /* renamed from: c, reason: collision with root package name */
    public final C5933k f10394c;

    /* renamed from: d, reason: collision with root package name */
    public final C5933k f10395d;

    /* renamed from: e, reason: collision with root package name */
    public final e f10396e;

    public c(AbstractC5941t abstractC5941t) {
        if (abstractC5941t.size() < 3 || abstractC5941t.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + abstractC5941t.size());
        }
        Enumeration o10 = abstractC5941t.o();
        this.f10392a = C5933k.k(o10.nextElement());
        this.f10393b = C5933k.k(o10.nextElement());
        this.f10394c = C5933k.k(o10.nextElement());
        InterfaceC5927e g10 = g(o10);
        if (g10 == null || !(g10 instanceof C5933k)) {
            this.f10395d = null;
        } else {
            this.f10395d = C5933k.k(g10);
            g10 = g(o10);
        }
        if (g10 != null) {
            this.f10396e = e.c(g10.toASN1Primitive());
        } else {
            this.f10396e = null;
        }
    }

    public static c e(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(AbstractC5941t.k(obj));
        }
        return null;
    }

    private static InterfaceC5927e g(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (InterfaceC5927e) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger c() {
        return this.f10393b.m();
    }

    public BigInteger f() {
        C5933k c5933k = this.f10395d;
        if (c5933k == null) {
            return null;
        }
        return c5933k.m();
    }

    public BigInteger h() {
        return this.f10392a.m();
    }

    public BigInteger i() {
        return this.f10394c.m();
    }

    public e j() {
        return this.f10396e;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        C5928f c5928f = new C5928f();
        c5928f.a(this.f10392a);
        c5928f.a(this.f10393b);
        c5928f.a(this.f10394c);
        C5933k c5933k = this.f10395d;
        if (c5933k != null) {
            c5928f.a(c5933k);
        }
        e eVar = this.f10396e;
        if (eVar != null) {
            c5928f.a(eVar);
        }
        return new d0(c5928f);
    }
}
