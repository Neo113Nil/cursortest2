package H1;

import H1.y;
import b1.C2334C;
import b1.C2338G;
import com.google.common.collect.AbstractC3445z;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y f4480a;

        public a(y yVar) {
            this.f4480a = yVar;
        }
    }

    public static boolean a(InterfaceC1184q interfaceC1184q) {
        e1.J j10 = new e1.J(4);
        interfaceC1184q.n(j10.f(), 0, 4);
        return j10.O() == 1716281667;
    }

    public static int b(InterfaceC1184q interfaceC1184q) {
        interfaceC1184q.g();
        e1.J j10 = new e1.J(2);
        interfaceC1184q.n(j10.f(), 0, 2);
        int U10 = j10.U();
        if ((U10 >> 2) == 16382) {
            interfaceC1184q.g();
            return U10;
        }
        interfaceC1184q.g();
        throw C2338G.a("First frame does not start with sync code.", null);
    }

    public static C2334C c(InterfaceC1184q interfaceC1184q, boolean z10) {
        C2334C a10 = new D().a(interfaceC1184q, z10 ? null : V1.h.f12348b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static C2334C d(InterfaceC1184q interfaceC1184q, boolean z10) {
        interfaceC1184q.g();
        long i10 = interfaceC1184q.i();
        C2334C c10 = c(interfaceC1184q, z10);
        interfaceC1184q.l((int) (interfaceC1184q.i() - i10));
        return c10;
    }

    public static boolean e(InterfaceC1184q interfaceC1184q, a aVar) {
        interfaceC1184q.g();
        e1.I i10 = new e1.I(new byte[4]);
        interfaceC1184q.n(i10.data, 0, 4);
        boolean g10 = i10.g();
        int h10 = i10.h(7);
        int h11 = i10.h(24) + 4;
        if (h10 == 0) {
            aVar.f4480a = h(interfaceC1184q);
            return g10;
        }
        y yVar = aVar.f4480a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (h10 == 3) {
            aVar.f4480a = yVar.b(f(interfaceC1184q, h11));
            return g10;
        }
        if (h10 == 4) {
            aVar.f4480a = yVar.c(j(interfaceC1184q, h11));
            return g10;
        }
        if (h10 != 6) {
            interfaceC1184q.l(h11);
            return g10;
        }
        e1.J j10 = new e1.J(h11);
        interfaceC1184q.readFully(j10.f(), 0, h11);
        j10.c0(4);
        aVar.f4480a = yVar.a(AbstractC3445z.u(T1.a.d(j10)));
        return g10;
    }

    public static y.a f(InterfaceC1184q interfaceC1184q, int i10) {
        e1.J j10 = new e1.J(i10);
        interfaceC1184q.readFully(j10.f(), 0, i10);
        return g(j10);
    }

    public static y.a g(e1.J j10) {
        j10.c0(1);
        int P10 = j10.P();
        long g10 = j10.g() + P10;
        int i10 = P10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long F10 = j10.F();
            if (F10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = F10;
            jArr2[i11] = j10.F();
            j10.c0(2);
            i11++;
        }
        j10.c0((int) (g10 - j10.g()));
        return new y.a(jArr, jArr2);
    }

    public static y h(InterfaceC1184q interfaceC1184q) {
        byte[] bArr = new byte[38];
        interfaceC1184q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC1184q interfaceC1184q) {
        e1.J j10 = new e1.J(4);
        interfaceC1184q.readFully(j10.f(), 0, 4);
        if (j10.O() != 1716281667) {
            throw C2338G.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(InterfaceC1184q interfaceC1184q, int i10) {
        e1.J j10 = new e1.J(i10);
        interfaceC1184q.readFully(j10.f(), 0, i10);
        j10.c0(4);
        return Arrays.asList(S.k(j10, false, false).comments);
    }
}
