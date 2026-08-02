package org.spongycastle.asn1;

import com.plaid.internal.EnumC3631g;
import java.util.Enumeration;

/* loaded from: classes5.dex */
public class K extends AbstractC5947z {
    public K(int i10, InterfaceC5927e interfaceC5927e) {
        super(true, i10, interfaceC5927e);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        Enumeration p10;
        c5939q.k(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, this.f62287a);
        c5939q.c(128);
        if (!this.f62288b) {
            if (this.f62289c) {
                c5939q.j(this.f62290d);
            } else {
                InterfaceC5927e interfaceC5927e = this.f62290d;
                if (interfaceC5927e instanceof AbstractC5937o) {
                    p10 = interfaceC5927e instanceof E ? ((E) interfaceC5927e).q() : new E(((AbstractC5937o) interfaceC5927e).m()).q();
                } else if (interfaceC5927e instanceof AbstractC5941t) {
                    p10 = ((AbstractC5941t) interfaceC5927e).o();
                } else {
                    if (!(interfaceC5927e instanceof AbstractC5943v)) {
                        throw new C5930h("not implemented: " + this.f62290d.getClass().getName());
                    }
                    p10 = ((AbstractC5943v) interfaceC5927e).p();
                }
                while (p10.hasMoreElements()) {
                    c5939q.j((InterfaceC5927e) p10.nextElement());
                }
            }
        }
        c5939q.c(0);
        c5939q.c(0);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int b10;
        if (this.f62288b) {
            return z0.b(this.f62287a) + 1;
        }
        int f10 = this.f62290d.toASN1Primitive().f();
        if (this.f62289c) {
            b10 = z0.b(this.f62287a) + z0.a(f10);
        } else {
            f10--;
            b10 = z0.b(this.f62287a);
        }
        return b10 + f10;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        if (this.f62288b || this.f62289c) {
            return true;
        }
        return this.f62290d.toASN1Primitive().i().h();
    }

    public K(boolean z10, int i10, InterfaceC5927e interfaceC5927e) {
        super(z10, i10, interfaceC5927e);
    }
}
