package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import com.google.android.material.carousel.h;
import ja.AbstractC5104a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final h f35137a;

    /* renamed from: b, reason: collision with root package name */
    public final List f35138b;

    /* renamed from: c, reason: collision with root package name */
    public final List f35139c;

    /* renamed from: d, reason: collision with root package name */
    public final float f35140d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35141e;
    private final float[] endStateStepsInterpolationPoints;
    private final float[] startStateStepsInterpolationPoints;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType;

        static {
            int[] iArr = new int[f.a.values().length];
            $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType = iArr;
            try {
                iArr[f.a.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public i(h hVar, List list, List list2) {
        this.f35137a = hVar;
        this.f35138b = Collections.unmodifiableList(list);
        this.f35139c = Collections.unmodifiableList(list2);
        float f10 = ((h) list.get(list.size() - 1)).d().f35129a - hVar.d().f35129a;
        this.f35140d = f10;
        float f11 = hVar.k().f35129a - ((h) list2.get(list2.size() - 1)).k().f35129a;
        this.f35141e = f11;
        this.startStateStepsInterpolationPoints = m(f10, list, true);
        this.endStateStepsInterpolationPoints = m(f11, list2, false);
    }

    public static int b(h hVar, float f10) {
        for (int j10 = hVar.j(); j10 < hVar.h().size(); j10++) {
            if (f10 == ((h.c) hVar.h().get(j10)).f35131c) {
                return j10;
            }
        }
        return hVar.h().size() - 1;
    }

    public static int c(h hVar) {
        for (int i10 = 0; i10 < hVar.h().size(); i10++) {
            if (!((h.c) hVar.h().get(i10)).f35133e) {
                return i10;
            }
        }
        return -1;
    }

    public static int d(h hVar, float f10) {
        for (int c10 = hVar.c() - 1; c10 >= 0; c10--) {
            if (f10 == ((h.c) hVar.h().get(c10)).f35131c) {
                return c10;
            }
        }
        return 0;
    }

    public static int e(h hVar) {
        for (int size = hVar.h().size() - 1; size >= 0; size--) {
            if (!((h.c) hVar.h().get(size)).f35133e) {
                return size;
            }
        }
        return -1;
    }

    public static i f(b bVar, h hVar, float f10, float f11, float f12, f.a aVar) {
        return new i(hVar, p(bVar, hVar, f10, f11, aVar), n(bVar, hVar, f10, f12, aVar));
    }

    public static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? hVar2.d().f35129a - hVar.d().f35129a : hVar.k().f35129a - hVar2.k().f35129a) / f10);
            i10++;
        }
        return fArr;
    }

    public static List n(b bVar, h hVar, float f10, float f11, f.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        int e10 = e(hVar);
        int a10 = bVar.k() ? bVar.a() : bVar.b();
        if (!r(bVar, hVar) && e10 != -1) {
            int j10 = e10 - hVar.j();
            float f12 = hVar.d().f35130b - (hVar.d().f35132d / 2.0f);
            if (j10 <= 0 && hVar.i().f35134f > 0.0f) {
                arrayList.add(x(hVar, (f12 - hVar.i().f35134f) - f11, a10));
                return arrayList;
            }
            float f13 = 0.0f;
            int i10 = 0;
            while (i10 < j10) {
                h hVar2 = (h) arrayList.get(arrayList.size() - 1);
                int i11 = e10 - i10;
                float f14 = f13 + ((h.c) hVar.h().get(i11)).f35134f;
                int i12 = i11 + 1;
                int i13 = a10;
                h t10 = t(hVar2, e10, i12 < hVar.h().size() ? d(hVar2, ((h.c) hVar.h().get(i12)).f35131c) + 1 : 0, f12 - f14, hVar.c() + i10 + 1, hVar.j() + i10 + 1, i13);
                if (i10 == j10 - 1 && f11 > 0.0f) {
                    t10 = u(t10, f11, i13, false, f10, aVar);
                    i13 = i13;
                }
                arrayList.add(t10);
                i10++;
                a10 = i13;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(hVar, f11, a10, false, f10, aVar));
        }
        return arrayList;
    }

    public static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{AbstractC5104a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List p(b bVar, h hVar, float f10, float f11, f.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hVar);
        int c10 = c(hVar);
        int a10 = bVar.k() ? bVar.a() : bVar.b();
        if (!q(hVar) && c10 != -1) {
            int c11 = hVar.c() - c10;
            float f12 = hVar.d().f35130b - (hVar.d().f35132d / 2.0f);
            if (c11 <= 0 && hVar.b().f35134f > 0.0f) {
                arrayList.add(x(hVar, f12 + hVar.b().f35134f + f11, a10));
                return arrayList;
            }
            float f13 = 0.0f;
            for (int i10 = 0; i10 < c11; i10++) {
                h hVar2 = (h) arrayList.get(arrayList.size() - 1);
                int i11 = c10 + i10;
                int size = hVar.h().size() - 1;
                f13 += ((h.c) hVar.h().get(i11)).f35134f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(hVar2, ((h.c) hVar.h().get(i12)).f35131c) - 1;
                }
                int i13 = a10;
                h t10 = t(hVar2, c10, size, f12 + f13, (hVar.c() - i10) - 1, (hVar.j() - i10) - 1, i13);
                a10 = i13;
                if (i10 == c11 - 1 && f11 > 0.0f) {
                    t10 = u(t10, f11, a10, true, f10, aVar);
                }
                arrayList.add(t10);
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(hVar, f11, a10, true, f10, aVar));
        }
        return arrayList;
    }

    public static boolean q(h hVar) {
        return hVar.b().f35130b - (hVar.b().f35132d / 2.0f) >= 0.0f && hVar.b() == hVar.e();
    }

    public static boolean r(b bVar, h hVar) {
        int b10 = bVar.b();
        if (bVar.k()) {
            b10 = bVar.a();
        }
        return hVar.i().f35130b + (hVar.i().f35132d / 2.0f) <= ((float) b10) && hVar.i() == hVar.l();
    }

    public static h s(List list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return h.o((h) list.get((int) o10[1]), (h) list.get((int) o10[2]), o10[0]);
    }

    public static h t(h hVar, int i10, int i11, float f10, int i12, int i13, int i14) {
        ArrayList arrayList = new ArrayList(hVar.h());
        arrayList.add(i11, (h.c) arrayList.remove(i10));
        h.b bVar = new h.b(hVar.g(), i14);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            h.c cVar = (h.c) arrayList.get(i15);
            float f11 = cVar.f35132d;
            bVar.e(f10 + (f11 / 2.0f), cVar.f35131c, f11, i15 >= i12 && i15 <= i13, cVar.f35133e, cVar.f35134f);
            f10 += cVar.f35132d;
            i15++;
        }
        return bVar.i();
    }

    public static h u(h hVar, float f10, int i10, boolean z10, float f11, f.a aVar) {
        return a.$SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType[aVar.ordinal()] != 1 ? w(hVar, f10, i10, z10) : v(hVar, f10, i10, z10, f11);
    }

    public static h v(h hVar, float f10, int i10, boolean z10, float f11) {
        ArrayList arrayList = new ArrayList(hVar.h());
        h.b bVar = new h.b(hVar.g(), i10);
        float m10 = f10 / hVar.m();
        float f12 = z10 ? f10 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            h.c cVar = (h.c) arrayList.get(i11);
            if (cVar.f35133e) {
                bVar.e(cVar.f35130b, cVar.f35131c, cVar.f35132d, false, true, cVar.f35134f);
            } else {
                boolean z11 = i11 >= hVar.c() && i11 <= hVar.j();
                float f13 = cVar.f35132d - m10;
                float b10 = f.b(f13, hVar.g(), f11);
                float f14 = (f13 / 2.0f) + f12;
                float abs = Math.abs(f14 - cVar.f35130b);
                bVar.f(f14, b10, f13, z11, false, cVar.f35134f, z10 ? abs : 0.0f, z10 ? 0.0f : abs);
                f12 += f13;
            }
            i11++;
        }
        return bVar.i();
    }

    public static h w(h hVar, float f10, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList(hVar.h());
        h.b bVar = new h.b(hVar.g(), i10);
        boolean z11 = true;
        int size = z10 ? 0 : arrayList.size() - 1;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            h.c cVar = (h.c) arrayList.get(i11);
            if (cVar.f35133e && i11 == size) {
                bVar.e(cVar.f35130b, cVar.f35131c, cVar.f35132d, false, true, cVar.f35134f);
            } else {
                float f11 = cVar.f35130b;
                float f12 = z10 ? f11 + f10 : f11 - f10;
                float f13 = z10 ? f10 : 0.0f;
                float f14 = z10 ? 0.0f : f10;
                boolean z12 = (i11 < hVar.c() || i11 > hVar.j()) ? false : z11;
                float f15 = f12;
                float f16 = cVar.f35131c;
                float f17 = cVar.f35132d;
                bVar.f(f15, f16, f17, z12, cVar.f35133e, Math.abs(z10 ? Math.max(0.0f, ((f17 / 2.0f) + f15) - i10) : Math.min(0.0f, f15 - (f17 / 2.0f))), f13, f14);
            }
            i11++;
            z11 = true;
        }
        return bVar.i();
    }

    public static h x(h hVar, float f10, int i10) {
        return t(hVar, 0, 0, f10, hVar.c(), hVar.j(), i10);
    }

    public final h a(List list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return o10[0] >= 0.5f ? (h) list.get((int) o10[2]) : (h) list.get((int) o10[1]);
    }

    public h g() {
        return this.f35137a;
    }

    public h h() {
        return (h) this.f35139c.get(r0.size() - 1);
    }

    public Map i(int i10, int i11, int i12, boolean z10) {
        float g10 = this.f35137a.g();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * g10 * (z10 ? -1 : 1) > i12 - this.f35141e || i13 >= i10 - this.f35139c.size()) {
                Integer valueOf = Integer.valueOf(i15);
                List list = this.f35139c;
                hashMap.put(valueOf, (h) list.get(AbstractC6307a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * g10 * (z10 ? -1 : 1) < i11 + this.f35140d || i17 < this.f35138b.size()) {
                Integer valueOf2 = Integer.valueOf(i18);
                List list2 = this.f35138b;
                hashMap.put(valueOf2, (h) list2.get(AbstractC6307a.b(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return hashMap;
    }

    public h j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    public h k(float f10, float f11, float f12, boolean z10) {
        float b10;
        List list;
        float[] fArr;
        float f13 = this.f35140d + f11;
        float f14 = f12 - this.f35141e;
        float f15 = l().b().f35135g;
        float f16 = h().b().f35136h;
        if (this.f35140d == f15) {
            f13 += f15;
        }
        if (this.f35141e == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            b10 = AbstractC5104a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.f35138b;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f10 <= f14) {
                return this.f35137a;
            }
            b10 = AbstractC5104a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f35139c;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z10 ? a(list, b10, fArr) : s(list, b10, fArr);
    }

    public h l() {
        return (h) this.f35138b.get(r0.size() - 1);
    }
}
