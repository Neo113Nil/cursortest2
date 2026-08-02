package u9;

/* loaded from: classes9.dex */
final class n extends c {
    @Override // u9.c, u9.g
    public final void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.h()) {
                break;
            }
            char c11 = hVar.c();
            hVar.f100410f++;
            b(c11, sb2);
            if (sb2.length() % 3 == 0) {
                c.e(hVar, sb2);
                if (j.g(hVar.f100410f, 3, hVar.d()) != 3) {
                    hVar.n(0);
                    break;
                }
            }
        }
        d(hVar, sb2);
    }

    @Override // u9.c
    final int b(char c11, StringBuilder sb2) {
        if (c11 == '\r') {
            sb2.append((char) 0);
            return 1;
        }
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 == '*') {
            sb2.append((char) 1);
            return 1;
        }
        if (c11 == '>') {
            sb2.append((char) 2);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 < 'A' || c11 > 'Z') {
            j.c(c11);
            throw null;
        }
        sb2.append((char) (c11 - '3'));
        return 1;
    }

    @Override // u9.c
    public final int c() {
        return 3;
    }

    @Override // u9.c
    final void d(h hVar, StringBuilder sb2) {
        hVar.o();
        int a11 = hVar.g().a() - hVar.a();
        hVar.f100410f -= sb2.length();
        if (hVar.f() > 1 || a11 > 1 || hVar.f() != a11) {
            hVar.q((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.n(0);
        }
    }
}
