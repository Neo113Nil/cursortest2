package p9;

import Ql0.h;
import h9.m;
import h9.s;
import o9.C8660b;

/* renamed from: p9.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8873a {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f80317a;

    /* renamed from: b, reason: collision with root package name */
    private final int f80318b;

    /* renamed from: c, reason: collision with root package name */
    private final int f80319c;

    /* renamed from: d, reason: collision with root package name */
    private final int f80320d;

    /* renamed from: e, reason: collision with root package name */
    private final int f80321e;

    /* renamed from: f, reason: collision with root package name */
    private final int f80322f;

    /* renamed from: g, reason: collision with root package name */
    private final int f80323g;

    public C8873a(C8660b c8660b) throws m {
        this(c8660b, 10, c8660b.j() / 2, c8660b.g() / 2);
    }

    private boolean a(int i11, int i12, int i13, boolean z11) {
        C8660b c8660b = this.f80317a;
        if (z11) {
            while (i11 <= i12) {
                if (c8660b.d(i11, i13)) {
                    return true;
                }
                i11++;
            }
            return false;
        }
        while (i11 <= i12) {
            if (c8660b.d(i13, i11)) {
                return true;
            }
            i11++;
        }
        return false;
    }

    private s c(float f7, float f11, float f12, float f13) {
        int e11 = h.e(h.b(f7, f11, f12, f13));
        float f14 = e11;
        float f15 = (f12 - f7) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i11 = 0; i11 < e11; i11++) {
            float f17 = i11;
            int e12 = h.e((f17 * f15) + f7);
            int e13 = h.e((f17 * f16) + f11);
            if (this.f80317a.d(e12, e13)) {
                return new s(e12, e13);
            }
        }
        return null;
    }

    public final s[] b() throws m {
        int i11;
        int i12;
        int i13 = this.f80320d;
        int i14 = this.f80321e;
        int i15 = this.f80323g;
        int i16 = this.f80322f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        do {
            i11 = this.f80319c;
            if (!z16) {
                break;
            }
            boolean z17 = false;
            boolean z18 = true;
            while (true) {
                if ((z18 || !z12) && i14 < i11) {
                    z18 = a(i15, i16, i14, false);
                    if (z18) {
                        i14++;
                        z12 = true;
                        z17 = true;
                    } else if (!z12) {
                        i14++;
                    }
                }
            }
            if (i14 >= i11) {
                break;
            }
            boolean z19 = true;
            while (true) {
                i12 = this.f80318b;
                if ((z19 || !z13) && i16 < i12) {
                    z19 = a(i13, i14, i16, true);
                    if (z19) {
                        i16++;
                        z13 = true;
                        z17 = true;
                    } else if (!z13) {
                        i16++;
                    }
                }
            }
            if (i16 >= i12) {
                break;
            }
            boolean z21 = true;
            while (true) {
                if ((z21 || !z14) && i13 >= 0) {
                    z21 = a(i15, i16, i13, false);
                    if (z21) {
                        i13--;
                        z14 = true;
                        z17 = true;
                    } else if (!z14) {
                        i13--;
                    }
                }
            }
            if (i13 < 0) {
                break;
            }
            z16 = z17;
            boolean z22 = true;
            while (true) {
                if ((z22 || !z15) && i15 >= 0) {
                    z22 = a(i13, i14, i15, true);
                    if (z22) {
                        i15--;
                        z16 = true;
                        z15 = true;
                    } else if (!z15) {
                        i15--;
                    }
                }
            }
        } while (i15 >= 0);
        z11 = true;
        if (z11) {
            throw m.a();
        }
        int i17 = i14 - i13;
        s sVar = null;
        s sVar2 = null;
        for (int i18 = 1; sVar2 == null && i18 < i17; i18++) {
            sVar2 = c(i13, i16 - i18, i13 + i18, i16);
        }
        if (sVar2 == null) {
            throw m.a();
        }
        s sVar3 = null;
        for (int i19 = 1; sVar3 == null && i19 < i17; i19++) {
            sVar3 = c(i13, i15 + i19, i13 + i19, i15);
        }
        if (sVar3 == null) {
            throw m.a();
        }
        s sVar4 = null;
        for (int i21 = 1; sVar4 == null && i21 < i17; i21++) {
            sVar4 = c(i14, i15 + i21, i14 - i21, i15);
        }
        if (sVar4 == null) {
            throw m.a();
        }
        for (int i22 = 1; sVar == null && i22 < i17; i22++) {
            sVar = c(i14, i16 - i22, i14 - i22, i16);
        }
        if (sVar == null) {
            throw m.a();
        }
        float b11 = sVar.b();
        float c11 = sVar.c();
        float b12 = sVar2.b();
        float c12 = sVar2.c();
        float b13 = sVar4.b();
        float c13 = sVar4.c();
        float b14 = sVar3.b();
        float c14 = sVar3.c();
        return b11 < ((float) i11) / 2.0f ? new s[]{new s(b14 - 1.0f, c14 + 1.0f), new s(b12 + 1.0f, c12 + 1.0f), new s(b13 - 1.0f, c13 - 1.0f), new s(b11 + 1.0f, c11 - 1.0f)} : new s[]{new s(b14 + 1.0f, c14 + 1.0f), new s(b12 + 1.0f, c12 - 1.0f), new s(b13 - 1.0f, c13 + 1.0f), new s(b11 - 1.0f, c11 - 1.0f)};
    }

    public C8873a(C8660b c8660b, int i11, int i12, int i13) throws m {
        this.f80317a = c8660b;
        int g10 = c8660b.g();
        this.f80318b = g10;
        int j11 = c8660b.j();
        this.f80319c = j11;
        int i14 = i11 / 2;
        int i15 = i12 - i14;
        this.f80320d = i15;
        int i16 = i12 + i14;
        this.f80321e = i16;
        int i17 = i13 - i14;
        this.f80323g = i17;
        int i18 = i13 + i14;
        this.f80322f = i18;
        if (i17 < 0 || i15 < 0 || i18 >= g10 || i16 >= j11) {
            throw m.a();
        }
    }
}
