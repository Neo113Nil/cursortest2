package z9;

import Ql0.h;
import h9.EnumC6876a;
import h9.m;
import h9.q;
import h9.s;
import h9.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import o9.C8659a;
import y9.r;

/* loaded from: classes9.dex */
public final class e extends AbstractC11003a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f107364i = {1, 10, 34, 70, 126};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f107365j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f107366k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f107367l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f107368m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f107369n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f107370o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f107371g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f107372h = new ArrayList();

    private static void p(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        arrayList.add(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a5, code lost:
    
        if (r5 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00a7, code lost:
    
        r14 = false;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00aa, code lost:
    
        r13 = false;
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00bf, code lost:
    
        if (r5 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C11004b q(C8659a c8659a, c cVar, boolean z11) throws m {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int[] h11 = h();
        Arrays.fill(h11, 0);
        if (z11) {
            r.f(cVar.b()[0], c8659a, h11);
        } else {
            r.e(cVar.b()[1], c8659a, h11);
            int i11 = 0;
            for (int length = h11.length - 1; i11 < length; length--) {
                int i12 = h11[i11];
                h11[i11] = h11[length];
                h11[length] = i12;
                i11++;
            }
        }
        int i13 = z11 ? 16 : 15;
        float f7 = h.f(h11) / i13;
        int[] l11 = l();
        int[] j11 = j();
        float[] m11 = m();
        float[] k11 = k();
        for (int i14 = 0; i14 < h11.length; i14++) {
            float f11 = h11[i14] / f7;
            int i15 = (int) (0.5f + f11);
            if (i15 <= 0) {
                i15 = 1;
            } else if (i15 > 8) {
                i15 = 8;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                l11[i16] = i15;
                m11[i16] = f11 - i15;
            } else {
                j11[i16] = i15;
                k11[i16] = f11 - i15;
            }
        }
        int f12 = h.f(l());
        int f13 = h.f(j());
        if (z11) {
            if (f12 > 12) {
                z12 = false;
                z13 = true;
            } else if (f12 < 4) {
                z13 = false;
                z12 = true;
            } else {
                z12 = false;
                z13 = false;
            }
            if (f13 <= 12) {
            }
            z14 = false;
            z15 = true;
        } else {
            if (f12 > 11) {
                z12 = false;
                z13 = true;
            } else if (f12 < 5) {
                z13 = false;
                z12 = true;
            } else {
                z12 = false;
                z13 = false;
            }
            if (f13 <= 10) {
            }
            z14 = false;
            z15 = true;
        }
        int i17 = (f12 + f13) - i13;
        boolean z16 = (f12 & 1) == z11;
        boolean z17 = (f13 & 1) == 1;
        if (i17 != -1) {
            if (i17 != 0) {
                if (i17 != 1) {
                    throw m.a();
                }
                if (z16) {
                    if (z17) {
                        throw m.a();
                    }
                    z13 = true;
                } else {
                    if (!z17) {
                        throw m.a();
                    }
                    z15 = true;
                }
            } else if (z16) {
                if (!z17) {
                    throw m.a();
                }
                if (f12 < f13) {
                    z12 = true;
                    z15 = true;
                } else {
                    z13 = true;
                    z14 = true;
                }
            } else if (z17) {
                throw m.a();
            }
        } else if (z16) {
            if (z17) {
                throw m.a();
            }
            z12 = true;
        } else {
            if (!z17) {
                throw m.a();
            }
            z14 = true;
        }
        if (z12) {
            if (z13) {
                throw m.a();
            }
            AbstractC11003a.n(m(), l());
        }
        if (z13) {
            AbstractC11003a.g(m(), l());
        }
        if (z14) {
            if (z15) {
                throw m.a();
            }
            AbstractC11003a.n(m(), j());
        }
        if (z15) {
            AbstractC11003a.g(k(), j());
        }
        int i18 = 0;
        int i19 = 0;
        for (int length2 = l11.length - 1; length2 >= 0; length2--) {
            int i21 = l11[length2];
            i18 = (i18 * 9) + i21;
            i19 += i21;
        }
        int i22 = 0;
        int i23 = 0;
        for (int length3 = j11.length - 1; length3 >= 0; length3--) {
            int i24 = j11[length3];
            i22 = (i22 * 9) + i24;
            i23 += i24;
        }
        int i25 = (i22 * 3) + i18;
        if (!z11) {
            if ((i23 & 1) != 0 || i23 > 10 || i23 < 4) {
                throw m.a();
            }
            int i26 = (10 - i23) / 2;
            int i27 = f107369n[i26];
            return new C11004b((h.d(j11, 9 - i27, false) * f107365j[i26]) + h.d(l11, i27, true) + f107367l[i26], i25);
        }
        if ((i19 & 1) != 0 || i19 > 12 || i19 < 4) {
            throw m.a();
        }
        int i28 = (12 - i19) / 2;
        int i29 = f107368m[i28];
        return new C11004b((h.d(l11, i29, false) * f107364i[i28]) + h.d(j11, 9 - i29, true) + f107366k[i28], i25);
    }

    private d r(C8659a c8659a, boolean z11, int i11, EnumMap enumMap) {
        try {
            c t2 = t(c8659a, i11, z11, s(c8659a, z11));
            t tVar = enumMap == null ? null : (t) enumMap.get(h9.e.NEED_RESULT_POINT_CALLBACK);
            if (tVar != null) {
                int[] b11 = t2.b();
                float f7 = ((b11[0] + b11[1]) - 1) / 2.0f;
                if (z11) {
                    f7 = (c8659a.j() - 1) - f7;
                }
                tVar.a(new s(f7, i11));
            }
            C11004b q11 = q(c8659a, t2, true);
            C11004b q12 = q(c8659a, t2, false);
            return new d((q11.b() * 1597) + q12.b(), (q12.a() * 4) + q11.a(), t2);
        } catch (m unused) {
            return null;
        }
    }

    private int[] s(C8659a c8659a, boolean z11) throws m {
        int[] i11 = i();
        i11[0] = 0;
        i11[1] = 0;
        i11[2] = 0;
        i11[3] = 0;
        int j11 = c8659a.j();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < j11) {
            z12 = !c8659a.f(i12);
            if (z11 == z12) {
                break;
            }
            i12++;
        }
        int i13 = 0;
        int i14 = i12;
        while (i12 < j11) {
            if (c8659a.f(i12) != z12) {
                i11[i13] = i11[i13] + 1;
            } else {
                if (i13 != 3) {
                    i13++;
                } else {
                    if (AbstractC11003a.o(i11)) {
                        return new int[]{i14, i12};
                    }
                    i14 += i11[0] + i11[1];
                    i11[0] = i11[2];
                    i11[1] = i11[3];
                    i11[2] = 0;
                    i11[3] = 0;
                    i13--;
                }
                i11[i13] = 1;
                z12 = !z12;
            }
            i12++;
        }
        throw m.a();
    }

    private c t(C8659a c8659a, int i11, boolean z11, int[] iArr) throws m {
        int i12;
        boolean f7 = c8659a.f(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && f7 != c8659a.f(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] i16 = i();
        System.arraycopy(i16, 0, i16, 1, i16.length - 1);
        i16[0] = i15;
        int[][] iArr2 = f107370o;
        for (int i17 = 0; i17 < 9; i17++) {
            if (r.d(i16, iArr2[i17], 0.45f) < 0.2f) {
                int i18 = iArr[1];
                if (z11) {
                    int j11 = (c8659a.j() - 1) - i14;
                    i18 = (c8659a.j() - 1) - i18;
                    i12 = j11;
                } else {
                    i12 = i14;
                }
                return new c(i17, i12, i18, i11, new int[]{i14, iArr[1]});
            }
        }
        throw m.a();
    }

    @Override // y9.r
    public final q b(int i11, C8659a c8659a, EnumMap enumMap) throws m {
        d r11 = r(c8659a, false, i11, enumMap);
        ArrayList arrayList = this.f107371g;
        p(arrayList, r11);
        c8659a.m();
        d r12 = r(c8659a, true, i11, enumMap);
        ArrayList arrayList2 = this.f107372h;
        p(arrayList2, r12);
        c8659a.m();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.c() > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2.c() > 1) {
                        int a11 = ((dVar2.a() * 16) + dVar.a()) % 79;
                        int c11 = dVar2.d().c() + (dVar.d().c() * 9);
                        if (c11 > 72) {
                            c11--;
                        }
                        if (c11 > 8) {
                            c11--;
                        }
                        if (a11 == c11) {
                            String valueOf = String.valueOf((dVar.b() * 4537077) + dVar2.b());
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(valueOf);
                            int i12 = 0;
                            for (int i13 = 0; i13 < 13; i13++) {
                                int charAt = sb2.charAt(i13) - '0';
                                if ((i13 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i12 += charAt;
                            }
                            int i14 = 10 - (i12 % 10);
                            if (i14 == 10) {
                                i14 = 0;
                            }
                            sb2.append(i14);
                            s[] a12 = dVar.d().a();
                            s[] a13 = dVar2.d().a();
                            return new q(sb2.toString(), null, new s[]{a12[0], a12[1], a13[0], a13[1]}, EnumC6876a.RSS_14);
                        }
                    }
                }
            }
        }
        throw m.a();
    }

    @Override // y9.r, h9.o
    public final void reset() {
        this.f107371g.clear();
        this.f107372h.clear();
    }
}
