package b;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* renamed from: b.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2318o extends F0 {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f24134b;

    public C2318o(byte[] bArr) {
        this.f24134b = bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f24134b;
        }
        return bArr != null ? q0.a(z10, bArr.length) : super.i().a(z10);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f24134b;
        }
        if (bArr != null) {
            q0Var.f(z10, 48, bArr);
        } else {
            super.i().b(q0Var, z10);
        }
    }

    @Override // b.F0, b.w0
    public final w0 h() {
        p();
        return super.h();
    }

    @Override // b.F0, b.w0
    public final int hashCode() {
        p();
        return super.hashCode();
    }

    @Override // b.F0, b.w0
    public final w0 i() {
        p();
        return super.i();
    }

    @Override // b.F0
    public final InterfaceC2323t j(int i10) {
        p();
        return this.f24067a[i10];
    }

    @Override // b.F0
    public final int m() {
        p();
        return this.f24067a.length;
    }

    @Override // b.F0
    public final AbstractC2311h n() {
        p();
        return ((F0) super.i()).n();
    }

    @Override // b.F0
    public final k0 o() {
        p();
        return ((F0) super.i()).o();
    }

    public final synchronized void p() {
        C2326w c2326w;
        try {
            if (this.f24134b != null) {
                byte[] bArr = this.f24134b;
                C2287O c2287o = new C2287O(new ByteArrayInputStream(bArr), bArr.length, true);
                try {
                    w0 r10 = c2287o.r();
                    if (r10 == null) {
                        c2326w = new C2326w(0);
                    } else {
                        C2326w c2326w2 = new C2326w(10);
                        do {
                            c2326w2.b(r10);
                            r10 = c2287o.r();
                        } while (r10 != null);
                        c2326w = c2326w2;
                    }
                    c2287o.close();
                    this.f24067a = c2326w.c();
                    this.f24134b = null;
                } catch (IOException e10) {
                    throw new t0("malformed ASN.1: " + e10, e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
