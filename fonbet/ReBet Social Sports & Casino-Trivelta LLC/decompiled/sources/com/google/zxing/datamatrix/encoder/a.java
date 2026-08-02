package com.google.zxing.datamatrix.encoder;

/* loaded from: classes3.dex */
public final class a implements g {
    public static char b(char c10, char c11) {
        if (j.f(c10) && j.f(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c10 + c11);
    }

    @Override // com.google.zxing.datamatrix.encoder.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f38399d) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f38399d), hVar.d().charAt(hVar.f38399d + 1)));
            hVar.f38399d += 2;
            return;
        }
        char c10 = hVar.c();
        int n10 = j.n(hVar.d(), hVar.f38399d, c());
        if (n10 == c()) {
            if (!j.g(c10)) {
                hVar.r((char) (c10 + 1));
                hVar.f38399d++;
                return;
            } else {
                hVar.r((char) 235);
                hVar.r((char) (c10 - 127));
                hVar.f38399d++;
                return;
            }
        }
        if (n10 == 1) {
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (n10 == 2) {
            hVar.r((char) 239);
            hVar.o(2);
            return;
        }
        if (n10 == 3) {
            hVar.r((char) 238);
            hVar.o(3);
        } else if (n10 == 4) {
            hVar.r((char) 240);
            hVar.o(4);
        } else {
            if (n10 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n10)));
            }
            hVar.r((char) 231);
            hVar.o(5);
        }
    }

    public int c() {
        return 0;
    }
}
