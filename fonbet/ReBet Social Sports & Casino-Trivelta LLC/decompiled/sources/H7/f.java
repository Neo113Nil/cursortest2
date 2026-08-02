package H7;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public interface f extends d {
    static f S0(H6.a aVar, p pVar, int i10, int i11) {
        return b.b2() ? new b(aVar, pVar, i10, i11) : new i(aVar, pVar, i10, i11);
    }

    static f V(H6.a aVar, p pVar, int i10) {
        return S0(aVar, pVar, i10, 0);
    }

    static f c1(Bitmap bitmap, H6.h hVar, p pVar, int i10, int i11) {
        return b.b2() ? new b(bitmap, hVar, pVar, i10, i11) : new i(bitmap, hVar, pVar, i10, i11);
    }

    static f m0(Bitmap bitmap, H6.h hVar, p pVar, int i10) {
        return c1(bitmap, hVar, pVar, i10, 0);
    }

    H6.a D();

    int K0();

    int Y0();
}
