package y9;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import o9.C8659a;

/* loaded from: classes9.dex */
public abstract class r implements h9.o {
    private h9.q c(h9.c cVar, EnumMap enumMap) throws h9.m {
        EnumMap enumMap2;
        int i11;
        int i12;
        EnumMap enumMap3 = enumMap;
        int d11 = cVar.d();
        int c11 = cVar.c();
        C8659a c8659a = new C8659a(d11);
        int i13 = 1;
        boolean z11 = enumMap3 != null && enumMap3.containsKey(h9.e.TRY_HARDER);
        int max = Math.max(1, c11 >> (z11 ? 8 : 5));
        int i14 = z11 ? c11 : 15;
        int i15 = c11 / 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i16 + 1;
            int i18 = i17 / 2;
            if ((i16 & 1) != 0) {
                i18 = -i18;
            }
            int i19 = (i18 * max) + i15;
            if (i19 < 0 || i19 >= c11) {
                break;
            }
            try {
                c8659a = cVar.b(i19, c8659a);
                int i21 = 0;
                while (i21 < 2) {
                    if (i21 == i13) {
                        c8659a.m();
                        if (enumMap3 != null) {
                            h9.e eVar = h9.e.NEED_RESULT_POINT_CALLBACK;
                            if (enumMap3.containsKey(eVar)) {
                                EnumMap enumMap4 = new EnumMap(h9.e.class);
                                enumMap4.putAll(enumMap3);
                                enumMap4.remove(eVar);
                                enumMap3 = enumMap4;
                            }
                        }
                    }
                    try {
                        h9.q b11 = b(i19, c8659a, enumMap3);
                        if (i21 == i13) {
                            try {
                                b11.h(h9.r.ORIENTATION, 180);
                                h9.s[] e11 = b11.e();
                                if (e11 != null) {
                                    i12 = i13;
                                    float f7 = d11;
                                    try {
                                        enumMap2 = enumMap3;
                                        try {
                                            i11 = d11;
                                            try {
                                                e11[0] = new h9.s((f7 - e11[0].b()) - 1.0f, e11[0].c());
                                                e11[i12] = new h9.s((f7 - e11[i12].b()) - 1.0f, e11[i12].c());
                                            } catch (h9.p unused) {
                                                continue;
                                                i21++;
                                                enumMap3 = enumMap2;
                                                i13 = i12;
                                                d11 = i11;
                                            }
                                        } catch (h9.p unused2) {
                                            i11 = d11;
                                            i21++;
                                            enumMap3 = enumMap2;
                                            i13 = i12;
                                            d11 = i11;
                                        }
                                    } catch (h9.p unused3) {
                                        enumMap2 = enumMap3;
                                    }
                                }
                            } catch (h9.p unused4) {
                                enumMap2 = enumMap3;
                                i11 = d11;
                                i12 = i13;
                            }
                        }
                        return b11;
                    } catch (h9.p unused5) {
                        enumMap2 = enumMap3;
                        i11 = d11;
                        i12 = i13;
                    }
                }
            } catch (h9.m unused6) {
            }
            i16 = i17;
            i13 = i13;
            d11 = d11;
        }
        throw h9.m.a();
    }

    protected static float d(int[] iArr, int[] iArr2, float f7) {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            i11 += iArr[i13];
            i12 += iArr2[i13];
        }
        if (i11 < i12) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i11;
        float f12 = f11 / i12;
        float f13 = f7 * f12;
        float f14 = 0.0f;
        for (int i14 = 0; i14 < length; i14++) {
            float f15 = iArr2[i14] * f12;
            float f16 = iArr[i14];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    protected static void e(int i11, C8659a c8659a, int[] iArr) throws h9.m {
        int length = iArr.length;
        int i12 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int j11 = c8659a.j();
        if (i11 >= j11) {
            throw h9.m.a();
        }
        boolean z11 = !c8659a.f(i11);
        while (i11 < j11) {
            if (c8659a.f(i11) == z11) {
                i12++;
                if (i12 == length) {
                    break;
                }
                iArr[i12] = 1;
                z11 = !z11;
            } else {
                iArr[i12] = iArr[i12] + 1;
            }
            i11++;
        }
        if (i12 != length) {
            if (i12 != length - 1 || i11 != j11) {
                throw h9.m.a();
            }
        }
    }

    protected static void f(int i11, C8659a c8659a, int[] iArr) throws h9.m {
        int length = iArr.length;
        boolean f7 = c8659a.f(i11);
        while (i11 > 0 && length >= 0) {
            i11--;
            if (c8659a.f(i11) != f7) {
                length--;
                f7 = !f7;
            }
        }
        if (length >= 0) {
            throw h9.m.a();
        }
        e(i11 + 1, c8659a, iArr);
    }

    @Override // h9.o
    public h9.q a(h9.c cVar, EnumMap enumMap) throws h9.m, h9.h {
        try {
            return c(cVar, enumMap);
        } catch (h9.m e11) {
            if (enumMap == null || !enumMap.containsKey(h9.e.TRY_HARDER) || !cVar.e()) {
                throw e11;
            }
            h9.c f7 = cVar.f();
            h9.q c11 = c(f7, enumMap);
            Map<h9.r, Object> d11 = c11.d();
            int i11 = 270;
            if (d11 != null) {
                h9.r rVar = h9.r.ORIENTATION;
                if (d11.containsKey(rVar)) {
                    i11 = (((Integer) d11.get(rVar)).intValue() + 270) % 360;
                }
            }
            c11.h(h9.r.ORIENTATION, Integer.valueOf(i11));
            h9.s[] e12 = c11.e();
            if (e12 != null) {
                int c12 = f7.c();
                for (int i12 = 0; i12 < e12.length; i12++) {
                    e12[i12] = new h9.s((c12 - e12[i12].c()) - 1.0f, e12[i12].b());
                }
            }
            return c11;
        }
    }

    public abstract h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.d, h9.h;

    @Override // h9.o
    public void reset() {
    }
}
