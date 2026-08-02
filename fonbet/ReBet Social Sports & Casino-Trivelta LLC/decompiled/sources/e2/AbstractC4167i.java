package e2;

import e1.InterfaceC4148o;
import e2.s;
import java.util.List;

/* renamed from: e2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4167i {
    public static int a(InterfaceC4169k interfaceC4169k, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int a10 = interfaceC4169k.a(j10);
        if (a10 == -1) {
            a10 = interfaceC4169k.d();
        }
        return (a10 <= 0 || interfaceC4169k.c(a10 + (-1)) != j10) ? a10 : a10 - 1;
    }

    public static void b(InterfaceC4169k interfaceC4169k, int i10, InterfaceC4148o interfaceC4148o) {
        long c10 = interfaceC4169k.c(i10);
        List b10 = interfaceC4169k.b(c10);
        if (b10.isEmpty()) {
            return;
        }
        if (i10 == interfaceC4169k.d() - 1) {
            throw new IllegalStateException();
        }
        long c11 = interfaceC4169k.c(i10 + 1) - interfaceC4169k.c(i10);
        if (c11 > 0) {
            interfaceC4148o.accept(new C4163e(b10, c10, c11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[LOOP:0: B:11:0x003c->B:13:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(InterfaceC4169k interfaceC4169k, s.b bVar, InterfaceC4148o interfaceC4148o) {
        boolean z10;
        int i10;
        int a10 = a(interfaceC4169k, bVar.f45619a);
        if (bVar.f45619a != -9223372036854775807L && a10 < interfaceC4169k.d()) {
            List b10 = interfaceC4169k.b(bVar.f45619a);
            long c10 = interfaceC4169k.c(a10);
            if (!b10.isEmpty()) {
                long j10 = bVar.f45619a;
                if (j10 < c10) {
                    interfaceC4148o.accept(new C4163e(b10, j10, c10 - j10));
                    z10 = true;
                    for (i10 = a10; i10 < interfaceC4169k.d(); i10++) {
                        b(interfaceC4169k, i10, interfaceC4148o);
                    }
                    if (bVar.f45620b) {
                        return;
                    }
                    if (z10) {
                        a10--;
                    }
                    for (int i11 = 0; i11 < a10; i11++) {
                        b(interfaceC4169k, i11, interfaceC4148o);
                    }
                    if (z10) {
                        interfaceC4148o.accept(new C4163e(interfaceC4169k.b(bVar.f45619a), interfaceC4169k.c(a10), bVar.f45619a - interfaceC4169k.c(a10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i10 < interfaceC4169k.d()) {
        }
        if (bVar.f45620b) {
        }
    }
}
