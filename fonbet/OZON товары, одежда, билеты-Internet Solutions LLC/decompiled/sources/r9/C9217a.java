package r9;

import h9.EnumC6876a;
import h9.c;
import h9.d;
import h9.e;
import h9.h;
import h9.m;
import h9.o;
import h9.q;
import h9.r;
import h9.s;
import java.util.EnumMap;
import java.util.List;
import o9.C8660b;
import o9.C8663e;
import o9.C8665g;
import s9.C9631d;
import t9.C9780a;

/* renamed from: r9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9217a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f83213b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final C9631d f83214a = new C9631d();

    @Override // h9.o
    public final q a(c cVar, EnumMap enumMap) throws m, d, h {
        s[] b11;
        C8663e c8663e;
        C9631d c9631d = this.f83214a;
        if (enumMap == null || !enumMap.containsKey(e.PURE_BARCODE)) {
            C8665g a11 = new C9780a(cVar.a()).a();
            C8663e a12 = c9631d.a(a11.a());
            b11 = a11.b();
            c8663e = a12;
        } else {
            C8660b a13 = cVar.a();
            int[] i11 = a13.i();
            int[] e11 = a13.e();
            if (i11 == null || e11 == null) {
                throw m.a();
            }
            int j11 = a13.j();
            int i12 = i11[0];
            int i13 = i11[1];
            while (i12 < j11 && a13.d(i12, i13)) {
                i12++;
            }
            if (i12 == j11) {
                throw m.a();
            }
            int i14 = i11[0];
            int i15 = i12 - i14;
            if (i15 == 0) {
                throw m.a();
            }
            int i16 = i11[1];
            int i17 = e11[1];
            int i18 = ((e11[0] - i14) + 1) / i15;
            int i19 = ((i17 - i16) + 1) / i15;
            if (i18 <= 0 || i19 <= 0) {
                throw m.a();
            }
            int i21 = i15 / 2;
            int i22 = i16 + i21;
            int i23 = i14 + i21;
            C8660b c8660b = new C8660b(i18, i19);
            for (int i24 = 0; i24 < i19; i24++) {
                int i25 = (i24 * i15) + i22;
                for (int i26 = 0; i26 < i18; i26++) {
                    if (a13.d((i26 * i15) + i23, i25)) {
                        c8660b.l(i26, i24);
                    }
                }
            }
            c8663e = c9631d.a(c8660b);
            b11 = f83213b;
        }
        q qVar = new q(c8663e.g(), c8663e.d(), b11, EnumC6876a.DATA_MATRIX);
        List<byte[]> a14 = c8663e.a();
        if (a14 != null) {
            qVar.h(r.BYTE_SEGMENTS, a14);
        }
        String b12 = c8663e.b();
        if (b12 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b12);
        }
        return qVar;
    }

    @Override // h9.o
    public final void reset() {
    }
}
