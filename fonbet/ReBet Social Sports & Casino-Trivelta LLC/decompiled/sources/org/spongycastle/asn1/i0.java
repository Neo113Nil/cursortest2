package org.spongycastle.asn1;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes5.dex */
public class i0 extends AbstractC5947z {
    private static final byte[] ZERO_BYTES = new byte[0];

    public i0(boolean z10, int i10, InterfaceC5927e interfaceC5927e) {
        super(z10, i10, interfaceC5927e);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        boolean z10 = this.f62288b;
        int i10 = EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
        if (z10) {
            c5939q.f(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, this.f62287a, ZERO_BYTES);
            return;
        }
        AbstractC5940s i11 = this.f62290d.toASN1Primitive().i();
        if (this.f62289c) {
            c5939q.k(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, this.f62287a);
            c5939q.i(i11.f());
            c5939q.j(i11);
        } else {
            if (!i11.h()) {
                i10 = 128;
            }
            c5939q.k(i10, this.f62287a);
            c5939q.h(i11);
        }
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        int b10;
        if (this.f62288b) {
            return z0.b(this.f62287a) + 1;
        }
        int f10 = this.f62290d.toASN1Primitive().i().f();
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

    public i0(int i10, InterfaceC5927e interfaceC5927e) {
        super(true, i10, interfaceC5927e);
    }
}
