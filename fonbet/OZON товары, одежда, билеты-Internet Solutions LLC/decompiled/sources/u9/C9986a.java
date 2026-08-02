package u9;

/* renamed from: u9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C9986a implements g {
    @Override // u9.g
    public final void a(h hVar) {
        int i11;
        String d11 = hVar.d();
        int i12 = hVar.f100410f;
        int length = d11.length();
        if (i12 < length) {
            char charAt = d11.charAt(i12);
            i11 = 0;
            while (j.d(charAt) && i12 < length) {
                i11++;
                i12++;
                if (i12 < length) {
                    charAt = d11.charAt(i12);
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 >= 2) {
            char charAt2 = hVar.d().charAt(hVar.f100410f);
            char charAt3 = hVar.d().charAt(hVar.f100410f + 1);
            if (j.d(charAt2) && j.d(charAt3)) {
                hVar.q((char) ((charAt3 - '0') + ((charAt2 - '0') * 10) + 130));
                hVar.f100410f += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + charAt2 + charAt3);
            }
        }
        char c11 = hVar.c();
        int g10 = j.g(hVar.f100410f, 0, hVar.d());
        if (g10 == 0) {
            if (!j.e(c11)) {
                hVar.q((char) (c11 + 1));
                hVar.f100410f++;
                return;
            } else {
                hVar.q((char) 235);
                hVar.q((char) (c11 - 127));
                hVar.f100410f++;
                return;
            }
        }
        if (g10 == 1) {
            hVar.q((char) 230);
            hVar.n(1);
            return;
        }
        if (g10 == 2) {
            hVar.q((char) 239);
            hVar.n(2);
            return;
        }
        if (g10 == 3) {
            hVar.q((char) 238);
            hVar.n(3);
        } else if (g10 == 4) {
            hVar.q((char) 240);
            hVar.n(4);
        } else {
            if (g10 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(g10)));
            }
            hVar.q((char) 231);
            hVar.n(5);
        }
    }
}
