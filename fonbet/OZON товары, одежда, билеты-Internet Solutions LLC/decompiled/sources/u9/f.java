package u9;

/* loaded from: classes9.dex */
final class f implements g {
    private static String b(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c11 = (char) ((charAt >> 16) & 255);
        char c12 = (char) ((charAt >> 8) & 255);
        char c13 = (char) (charAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c11);
        if (length >= 2) {
            sb3.append(c12);
        }
        if (length >= 3) {
            sb3.append(c13);
        }
        return sb3.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0051, code lost:
    
        u9.j.c(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0055, code lost:
    
        throw null;
     */
    @Override // u9.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(h hVar) {
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            z11 = true;
            if (!hVar.h()) {
                break;
            }
            char c11 = hVar.c();
            if (c11 >= ' ' && c11 <= '?') {
                sb2.append(c11);
            } else if (c11 < '@' || c11 > '^') {
                break;
            } else {
                sb2.append((char) (c11 - '@'));
            }
            hVar.f100410f++;
            if (sb2.length() >= 4) {
                hVar.r(b(sb2));
                sb2.delete(0, 4);
                if (j.g(hVar.f100410f, 4, hVar.d()) != 4) {
                    hVar.n(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        try {
            int length = sb2.length();
            if (length == 0) {
                return;
            }
            if (length == 1) {
                hVar.o();
                int a11 = hVar.g().a() - hVar.a();
                int f7 = hVar.f();
                if (f7 > a11) {
                    hVar.p(hVar.a() + 1);
                    a11 = hVar.g().a() - hVar.a();
                }
                if (f7 <= a11 && a11 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i11 = length - 1;
            String b11 = b(sb2);
            if (hVar.h() || i11 > 2) {
                z11 = false;
            }
            if (i11 <= 2) {
                hVar.p(hVar.a() + i11);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.p(hVar.a() + b11.length());
                    z11 = false;
                }
            }
            if (z11) {
                hVar.j();
                hVar.f100410f -= i11;
            } else {
                hVar.r(b11);
            }
        } finally {
            hVar.n(0);
        }
    }
}
