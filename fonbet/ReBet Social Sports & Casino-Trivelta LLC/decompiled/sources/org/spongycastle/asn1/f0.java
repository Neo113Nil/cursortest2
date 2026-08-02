package org.spongycastle.asn1;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class f0 extends AbstractC5943v {

    /* renamed from: c, reason: collision with root package name */
    public int f62254c;

    public f0() {
        this.f62254c = -1;
    }

    private int t() {
        if (this.f62254c < 0) {
            Enumeration p10 = p();
            int i10 = 0;
            while (p10.hasMoreElements()) {
                i10 += ((InterfaceC5927e) p10.nextElement()).toASN1Primitive().i().f();
            }
            this.f62254c = i10;
        }
        return this.f62254c;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        C5939q a10 = c5939q.a();
        int t10 = t();
        c5939q.c(49);
        c5939q.i(t10);
        Enumeration p10 = p();
        while (p10.hasMoreElements()) {
            a10.j((InterfaceC5927e) p10.nextElement());
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int t10 = t();
        return z0.a(t10) + 1 + t10;
    }

    public f0(InterfaceC5927e interfaceC5927e) {
        super(interfaceC5927e);
        this.f62254c = -1;
    }

    public f0(C5928f c5928f) {
        super(c5928f, true);
        this.f62254c = -1;
    }

    public f0(InterfaceC5927e[] interfaceC5927eArr) {
        super(interfaceC5927eArr, true);
        this.f62254c = -1;
    }

    public f0(C5928f c5928f, boolean z10) {
        super(c5928f, z10);
        this.f62254c = -1;
    }
}
