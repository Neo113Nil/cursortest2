package Oi;

import java.util.Enumeration;
import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5941t;
import org.spongycastle.asn1.AbstractC5947z;
import org.spongycastle.asn1.InterfaceC5926d;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;

/* loaded from: classes5.dex */
public class c extends AbstractC5935m implements InterfaceC5926d {

    /* renamed from: d, reason: collision with root package name */
    public static e f8665d = Pi.b.f9151N;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8666a;

    /* renamed from: b, reason: collision with root package name */
    public int f8667b;

    /* renamed from: c, reason: collision with root package name */
    public e f8668c;
    private b[] rdns;

    public c(AbstractC5941t abstractC5941t) {
        this(f8665d, abstractC5941t);
    }

    public static c c(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(AbstractC5941t.k(obj));
        }
        return null;
    }

    public static c e(AbstractC5947z abstractC5947z, boolean z10) {
        return c(AbstractC5941t.l(abstractC5947z, true));
    }

    @Override // org.spongycastle.asn1.AbstractC5935m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) && !(obj instanceof AbstractC5941t)) {
            return false;
        }
        if (toASN1Primitive().equals(((InterfaceC5927e) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.f8668c.b(this, new c(AbstractC5941t.k(((InterfaceC5927e) obj).toASN1Primitive())));
        } catch (Exception unused) {
            return false;
        }
    }

    public b[] f() {
        b[] bVarArr = this.rdns;
        int length = bVarArr.length;
        b[] bVarArr2 = new b[length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
        return bVarArr2;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m
    public int hashCode() {
        if (this.f8666a) {
            return this.f8667b;
        }
        this.f8666a = true;
        int a10 = this.f8668c.a(this);
        this.f8667b = a10;
        return a10;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return new d0(this.rdns);
    }

    public String toString() {
        return this.f8668c.d(this);
    }

    public c(e eVar, AbstractC5941t abstractC5941t) {
        this.f8668c = eVar;
        this.rdns = new b[abstractC5941t.size()];
        Enumeration o10 = abstractC5941t.o();
        int i10 = 0;
        while (o10.hasMoreElements()) {
            this.rdns[i10] = b.e(o10.nextElement());
            i10++;
        }
    }

    public c(b[] bVarArr) {
        this(f8665d, bVarArr);
    }

    public c(e eVar, b[] bVarArr) {
        this.rdns = bVarArr;
        this.f8668c = eVar;
    }

    public c(String str) {
        this(f8665d, str);
    }

    public c(e eVar, String str) {
        this(eVar.fromString(str));
        this.f8668c = eVar;
    }
}
