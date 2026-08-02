package w9;

import h9.EnumC6876a;
import h9.d;
import h9.h;
import h9.m;
import h9.o;
import h9.q;
import h9.r;
import h9.s;
import java.util.EnumMap;
import o9.C8660b;
import o9.C8663e;
import x9.c;

/* renamed from: w9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C10449a implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final s[] f103630b = new s[0];

    /* renamed from: a, reason: collision with root package name */
    private final c f103631a = new c();

    @Override // h9.o
    public final q a(h9.c cVar, EnumMap enumMap) throws m, d, h {
        C8660b a11 = cVar.a();
        int[] f7 = a11.f();
        if (f7 == null) {
            throw m.a();
        }
        int i11 = f7[0];
        int i12 = f7[1];
        int i13 = f7[2];
        int i14 = f7[3];
        C8660b c8660b = new C8660b(30, 33);
        for (int i15 = 0; i15 < 33; i15++) {
            int i16 = (((i14 / 2) + (i15 * i14)) / 33) + i12;
            for (int i17 = 0; i17 < 30; i17++) {
                if (a11.d((((((i15 & 1) * i13) / 2) + ((i13 / 2) + (i17 * i13))) / 30) + i11, i16)) {
                    c8660b.l(i17, i15);
                }
            }
        }
        C8663e b11 = this.f103631a.b(c8660b);
        q qVar = new q(b11.g(), b11.d(), f103630b, EnumC6876a.MAXICODE);
        String b12 = b11.b();
        if (b12 != null) {
            qVar.h(r.ERROR_CORRECTION_LEVEL, b12);
        }
        return qVar;
    }

    @Override // h9.o
    public final void reset() {
    }
}
