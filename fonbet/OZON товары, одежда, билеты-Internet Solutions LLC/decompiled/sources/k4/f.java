package k4;

import java.util.List;
import k4.o;
import l3.C7855a;
import m3.InterfaceC8068j;

/* loaded from: classes8.dex */
public final class f {
    private static void a(i iVar, int i11, InterfaceC8068j<c> interfaceC8068j) {
        long a11 = iVar.a(i11);
        List<C7855a> d11 = iVar.d(a11);
        if (d11.isEmpty()) {
            return;
        }
        if (i11 == iVar.b() - 1) {
            throw new IllegalStateException();
        }
        long a12 = iVar.a(i11 + 1) - iVar.a(i11);
        if (a12 > 0) {
            interfaceC8068j.accept(new c(d11, a11, a12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(i iVar, o.b bVar, InterfaceC8068j<c> interfaceC8068j) {
        int c11;
        boolean z11;
        int i11;
        long j11 = bVar.f70476a;
        if (j11 == -9223372036854775807L) {
            c11 = 0;
        } else {
            c11 = iVar.c(j11);
            if (c11 == -1) {
                c11 = iVar.b();
            }
            if (c11 > 0 && iVar.a(c11 - 1) == j11) {
                c11--;
            }
        }
        if (j11 != -9223372036854775807L && c11 < iVar.b()) {
            List<C7855a> d11 = iVar.d(j11);
            long a11 = iVar.a(c11);
            if (!d11.isEmpty()) {
                long j12 = bVar.f70476a;
                if (j12 < a11) {
                    interfaceC8068j.accept(new c(d11, j12, a11 - j12));
                    z11 = true;
                    for (i11 = c11; i11 < iVar.b(); i11++) {
                        a(iVar, i11, interfaceC8068j);
                    }
                    if (bVar.f70477b) {
                        return;
                    }
                    if (z11) {
                        c11--;
                    }
                    for (int i12 = 0; i12 < c11; i12++) {
                        a(iVar, i12, interfaceC8068j);
                    }
                    if (z11) {
                        interfaceC8068j.accept(new c(iVar.d(j11), iVar.a(c11), j11 - iVar.a(c11)));
                        return;
                    }
                    return;
                }
            }
        }
        z11 = false;
        while (i11 < iVar.b()) {
        }
        if (bVar.f70477b) {
        }
    }
}
