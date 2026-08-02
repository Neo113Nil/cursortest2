package H1;

import V1.h;
import b1.C2334C;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final e1.J f4322a = new e1.J(10);

    public C2334C a(InterfaceC1184q interfaceC1184q, h.a aVar) {
        C2334C c2334c = null;
        int i10 = 0;
        while (true) {
            try {
                interfaceC1184q.n(this.f4322a.f(), 0, 10);
                this.f4322a.b0(0);
                if (this.f4322a.P() != 4801587) {
                    break;
                }
                this.f4322a.c0(3);
                int L10 = this.f4322a.L();
                int i11 = L10 + 10;
                if (c2334c == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f4322a.f(), 0, bArr, 0, 10);
                    interfaceC1184q.n(bArr, 10, L10);
                    c2334c = new V1.h(aVar).e(bArr, i11);
                } else {
                    interfaceC1184q.j(L10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        interfaceC1184q.g();
        interfaceC1184q.j(i10);
        return c2334c;
    }
}
