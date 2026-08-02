package Oi;

import org.spongycastle.asn1.AbstractC5935m;
import org.spongycastle.asn1.AbstractC5940s;
import org.spongycastle.asn1.AbstractC5943v;
import org.spongycastle.asn1.C5928f;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;
import org.spongycastle.asn1.d0;
import org.spongycastle.asn1.f0;

/* loaded from: classes5.dex */
public class b extends AbstractC5935m {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC5943v f8664a;

    public b(AbstractC5943v abstractC5943v) {
        this.f8664a = abstractC5943v;
    }

    public static b e(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(AbstractC5943v.l(obj));
        }
        return null;
    }

    public a c() {
        if (this.f8664a.size() == 0) {
            return null;
        }
        return a.c(this.f8664a.o(0));
    }

    public a[] f() {
        int size = this.f8664a.size();
        a[] aVarArr = new a[size];
        for (int i10 = 0; i10 != size; i10++) {
            aVarArr[i10] = a.c(this.f8664a.o(i10));
        }
        return aVarArr;
    }

    public boolean g() {
        return this.f8664a.size() > 1;
    }

    @Override // org.spongycastle.asn1.AbstractC5935m, org.spongycastle.asn1.InterfaceC5927e
    public AbstractC5940s toASN1Primitive() {
        return this.f8664a;
    }

    public b(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        C5928f c5928f = new C5928f();
        c5928f.a(c5936n);
        c5928f.a(interfaceC5927e);
        this.f8664a = new f0(new d0(c5928f));
    }

    public b(a[] aVarArr) {
        this.f8664a = new f0(aVarArr);
    }
}
