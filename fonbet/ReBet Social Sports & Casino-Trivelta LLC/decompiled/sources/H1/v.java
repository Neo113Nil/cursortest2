package H1;

import b1.C2338G;
import e1.Z;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class v {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f4479a;
    }

    public static boolean a(e1.J j10, y yVar, int i10) {
        int j11 = j(j10, i10);
        return j11 != -1 && j11 <= yVar.f4484b;
    }

    public static boolean b(e1.J j10, int i10) {
        return j10.M() == Z.x(j10.f(), i10, j10.g() - 1, 0);
    }

    public static boolean c(e1.J j10, y yVar, boolean z10, a aVar) {
        try {
            long V10 = j10.V();
            if (!z10) {
                V10 *= yVar.f4484b;
            }
            aVar.f4479a = V10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(e1.J j10, y yVar, int i10, a aVar) {
        int g10 = j10.g();
        long O10 = j10.O();
        long j11 = O10 >>> 16;
        if (j11 != i10) {
            return false;
        }
        return g((int) ((O10 >> 4) & 15), yVar) && f((int) ((O10 >> 1) & 7), yVar) && !(((O10 & 1) > 1L ? 1 : ((O10 & 1) == 1L ? 0 : -1)) == 0) && c(j10, yVar, ((j11 & 1) > 1L ? 1 : ((j11 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(j10, yVar, (int) ((O10 >> 12) & 15)) && e(j10, yVar, (int) ((O10 >> 8) & 15)) && b(j10, g10);
    }

    public static boolean e(e1.J j10, y yVar, int i10) {
        int i11 = yVar.f4487e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f4488f;
        }
        if (i10 == 12) {
            return j10.M() * 1000 == i11;
        }
        if (i10 <= 14) {
            int U10 = j10.U();
            if (i10 == 14) {
                U10 *= 10;
            }
            if (U10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f4491i;
    }

    public static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f4489g - 1 : i10 <= 10 && yVar.f4489g == 2;
    }

    public static boolean h(InterfaceC1184q interfaceC1184q, y yVar, int i10, a aVar) {
        long i11 = interfaceC1184q.i();
        byte[] bArr = new byte[2];
        interfaceC1184q.n(bArr, 0, 2);
        if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i10) {
            interfaceC1184q.g();
            interfaceC1184q.j((int) (i11 - interfaceC1184q.getPosition()));
            return false;
        }
        e1.J j10 = new e1.J(16);
        System.arraycopy(bArr, 0, j10.f(), 0, 2);
        j10.a0(AbstractC1185s.d(interfaceC1184q, j10.f(), 2, 14));
        interfaceC1184q.g();
        interfaceC1184q.j((int) (i11 - interfaceC1184q.getPosition()));
        return d(j10, yVar, i10, aVar);
    }

    public static long i(InterfaceC1184q interfaceC1184q, y yVar) {
        interfaceC1184q.g();
        interfaceC1184q.j(1);
        byte[] bArr = new byte[1];
        interfaceC1184q.n(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC1184q.j(2);
        int i10 = z10 ? 7 : 6;
        e1.J j10 = new e1.J(i10);
        j10.a0(AbstractC1185s.d(interfaceC1184q, j10.f(), 0, i10));
        interfaceC1184q.g();
        a aVar = new a();
        if (c(j10, yVar, z10, aVar)) {
            return aVar.f4479a;
        }
        throw C2338G.a(null, null);
    }

    public static int j(e1.J j10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return j10.M() + 1;
            case 7:
                return j10.U() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
