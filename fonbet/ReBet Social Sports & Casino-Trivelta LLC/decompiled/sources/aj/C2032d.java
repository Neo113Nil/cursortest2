package aj;

import java.util.Vector;

/* renamed from: aj.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2032d implements InterfaceC2029a {

    /* renamed from: a, reason: collision with root package name */
    public Vector f16264a;

    public final void a(int i10) {
        int size = this.f16264a.size();
        if (size <= i10) {
            int[] iArr = (int[]) this.f16264a.elementAt(size - 1);
            do {
                iArr = Aj.a.g(iArr);
                AbstractC2031c.f(iArr, iArr);
                this.f16264a.addElement(iArr);
                size++;
            } while (size <= i10);
        }
    }

    @Override // aj.InterfaceC2029a
    public void exponentiateX(long j10, byte[] bArr) {
        int[] i10 = AbstractC2031c.i();
        int i11 = 0;
        while (j10 > 0) {
            if ((1 & j10) != 0) {
                a(i11);
                AbstractC2031c.f(i10, (int[]) this.f16264a.elementAt(i11));
            }
            i11++;
            j10 >>>= 1;
        }
        AbstractC2031c.a(i10, bArr);
    }

    @Override // aj.InterfaceC2029a
    public void init(byte[] bArr) {
        int[] c10 = AbstractC2031c.c(bArr);
        Vector vector = this.f16264a;
        if (vector == null || !Aj.a.c(c10, (int[]) vector.elementAt(0))) {
            Vector vector2 = new Vector(8);
            this.f16264a = vector2;
            vector2.addElement(c10);
        }
    }
}
