package u9;

/* loaded from: classes9.dex */
class c implements g {
    static void e(h hVar, StringBuilder sb2) {
        int charAt = sb2.charAt(2) + (sb2.charAt(1) * '(') + (sb2.charAt(0) * 1600) + 1;
        hVar.r(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb2.delete(0, 3);
    }

    @Override // u9.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.h()) {
                break;
            }
            char c11 = hVar.c();
            hVar.f100410f++;
            int b11 = b(c11, sb2);
            int a11 = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.p(a11);
            int a12 = hVar.g().a() - a11;
            if (!hVar.h()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && a12 != 2) {
                    int length = sb2.length();
                    sb2.delete(length - b11, length);
                    hVar.f100410f--;
                    b11 = b(hVar.c(), sb3);
                    hVar.j();
                }
                while (sb2.length() % 3 == 1 && (b11 > 3 || a12 != 1)) {
                    int length2 = sb2.length();
                    sb2.delete(length2 - b11, length2);
                    hVar.f100410f--;
                    b11 = b(hVar.c(), sb3);
                    hVar.j();
                }
            } else if (sb2.length() % 3 == 0) {
                if (j.g(hVar.f100410f, c(), hVar.d()) != c()) {
                    hVar.n(0);
                    break;
                }
            }
        }
        d(hVar, sb2);
    }

    int b(char c11, StringBuilder sb2) {
        if (c11 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c11 >= '0' && c11 <= '9') {
            sb2.append((char) (c11 - ','));
            return 1;
        }
        if (c11 >= 'A' && c11 <= 'Z') {
            sb2.append((char) (c11 - '3'));
            return 1;
        }
        if (c11 < ' ') {
            sb2.append((char) 0);
            sb2.append(c11);
            return 2;
        }
        if (c11 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '!'));
            return 2;
        }
        if (c11 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - '+'));
            return 2;
        }
        if (c11 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) (c11 - 'E'));
            return 2;
        }
        if (c11 > 127) {
            sb2.append("\u0001\u001e");
            return b((char) (c11 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c11 - '`'));
        return 2;
    }

    public int c() {
        return 1;
    }

    void d(h hVar, StringBuilder sb2) {
        int length = (sb2.length() / 3) << 1;
        int length2 = sb2.length() % 3;
        int a11 = hVar.a() + length;
        hVar.p(a11);
        int a12 = hVar.g().a() - a11;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                e(hVar, sb2);
            }
            if (hVar.h()) {
                hVar.q((char) 254);
            }
        } else if (a12 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                e(hVar, sb2);
            }
            if (hVar.h()) {
                hVar.q((char) 254);
            }
            hVar.f100410f--;
        } else {
            if (length2 != 0) {
                throw new IllegalStateException("Unexpected case. Please report!");
            }
            while (sb2.length() >= 3) {
                e(hVar, sb2);
            }
            if (a12 > 0 || hVar.h()) {
                hVar.q((char) 254);
            }
        }
        hVar.n(0);
    }
}
