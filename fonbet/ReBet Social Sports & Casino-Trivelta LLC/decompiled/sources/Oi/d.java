package Oi;

import java.util.Vector;
import org.spongycastle.asn1.C5936n;
import org.spongycastle.asn1.InterfaceC5927e;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public e f8669a;

    /* renamed from: b, reason: collision with root package name */
    public Vector f8670b = new Vector();

    public d(e eVar) {
        this.f8669a = eVar;
    }

    public d a(a[] aVarArr) {
        this.f8670b.addElement(new b(aVarArr));
        return this;
    }

    public d b(C5936n[] c5936nArr, String[] strArr) {
        int length = strArr.length;
        InterfaceC5927e[] interfaceC5927eArr = new InterfaceC5927e[length];
        for (int i10 = 0; i10 != length; i10++) {
            interfaceC5927eArr[i10] = this.f8669a.c(c5936nArr[i10], strArr[i10]);
        }
        return c(c5936nArr, interfaceC5927eArr);
    }

    public d c(C5936n[] c5936nArr, InterfaceC5927e[] interfaceC5927eArr) {
        a[] aVarArr = new a[c5936nArr.length];
        for (int i10 = 0; i10 != c5936nArr.length; i10++) {
            aVarArr[i10] = new a(c5936nArr[i10], interfaceC5927eArr[i10]);
        }
        return a(aVarArr);
    }

    public d d(C5936n c5936n, String str) {
        e(c5936n, this.f8669a.c(c5936n, str));
        return this;
    }

    public d e(C5936n c5936n, InterfaceC5927e interfaceC5927e) {
        this.f8670b.addElement(new b(c5936n, interfaceC5927e));
        return this;
    }

    public c f() {
        int size = this.f8670b.size();
        b[] bVarArr = new b[size];
        for (int i10 = 0; i10 != size; i10++) {
            bVarArr[i10] = (b) this.f8670b.elementAt(i10);
        }
        return new c(this.f8669a, bVarArr);
    }
}
