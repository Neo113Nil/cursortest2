package w0;

import B1.W;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import c1.AbstractC5715f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.ranges.IntRange;
import l1.InterfaceC7823h0;
import n0.C8393n;
import r0.EnumC9142v;
import u0.C9915y;
import x0.C10610o;
import x0.InterfaceC10573B;

/* loaded from: classes8.dex */
final class y extends AbstractC7737t implements Function2<InterfaceC10573B, Z1.b, C10377D> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ O f103316b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C9915y f103317c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.n f103318d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M f103319e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5179b.l f103320f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ xe.M f103321g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ InterfaceC7823h0 f103322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(O o11, C9915y c9915y, kotlin.reflect.n nVar, M m11, C5179b.l lVar, C5179b.e eVar, xe.M m12, InterfaceC7823h0 interfaceC7823h0) {
        super(2);
        this.f103316b = o11;
        this.f103317c = c9915y;
        this.f103318d = nVar;
        this.f103319e = m11;
        this.f103320f = lVar;
        this.f103321g = m12;
        this.f103322h = interfaceC7823h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0645  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10377D invoke(InterfaceC10573B interfaceC10573B, Z1.b bVar) {
        int c11;
        int n11;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C10379F c10379f;
        int i19;
        List list;
        ArrayList arrayList;
        C10377D c10377d;
        O o11;
        int i21;
        int i22;
        InterfaceC10573B interfaceC10573B2;
        int i23;
        int i24;
        C10404u c10404u;
        int i25;
        C10378E[] b11;
        C10378E c10378e;
        int i26;
        int i27;
        InterfaceC10573B interfaceC10573B3 = interfaceC10573B;
        long p11 = bVar.p();
        O o12 = this.f103316b;
        o12.r().getValue();
        EnumC9142v enumC9142v = EnumC9142v.Vertical;
        C8393n.a(p11, enumC9142v);
        Z1.s layoutDirection = interfaceC10573B3.getLayoutDirection();
        C9915y c9915y = this.f103317c;
        int Y02 = interfaceC10573B3.Y0(c9915y.b(layoutDirection));
        int Y03 = interfaceC10573B3.Y0(c9915y.c(interfaceC10573B3.getLayoutDirection()));
        int Y04 = interfaceC10573B3.Y0(c9915y.d());
        int Y05 = interfaceC10573B3.Y0(c9915y.a()) + Y04;
        int i28 = Y02 + Y03;
        int i29 = Y05 - Y04;
        long k11 = Z1.c.k(-i28, -Y05, p11);
        InterfaceC10396l interfaceC10396l = (InterfaceC10396l) this.f103318d.invoke();
        N h11 = interfaceC10396l.h();
        L a11 = this.f103319e.a(interfaceC10573B3, p11);
        int length = a11.b().length;
        h11.e(length);
        C5179b.l lVar = this.f103320f;
        if (lVar == null) {
            throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
        }
        int Y06 = interfaceC10573B3.Y0(lVar.a());
        int itemCount = interfaceC10396l.getItemCount();
        int j11 = Z1.b.j(p11) - Y05;
        v vVar = new v(interfaceC10396l, interfaceC10573B3, Y06, this.f103316b, Y04, i29, Z1.n.a(Y02, Y04));
        w wVar = new w(a11, itemCount, Y06, vVar, h11);
        int i31 = itemCount;
        x xVar = new x(h11, wVar);
        AbstractC5715f a12 = AbstractC5715f.a.a();
        List list2 = null;
        Function1<Object, Unit> h12 = a12 != null ? a12.h() : null;
        AbstractC5715f b12 = AbstractC5715f.a.b(a12);
        try {
            int B11 = o12.B(interfaceC10396l, o12.m());
            if (B11 >= i31 && i31 > 0) {
                c11 = h11.c(i31 - 1);
                n11 = 0;
                int i32 = c11;
                Unit unit = Unit.f71690a;
                AbstractC5715f.a.d(a12, b12, h12);
                List<Integer> a13 = C10610o.a(interfaceC10396l, o12.t(), o12.l());
                float y11 = o12.y();
                LazyLayoutItemAnimator<C10378E> p12 = o12.p();
                InterfaceC3978p0<Unit> u11 = o12.u();
                C10404u c10404u2 = new C10404u(interfaceC10573B3, p11, i28, Y05);
                if (Y04 >= 0) {
                    throw new IllegalArgumentException("negative beforeContentPadding");
                }
                if (i29 < 0) {
                    throw new IllegalArgumentException("negative afterContentPadding");
                }
                xe.M m11 = this.f103321g;
                InterfaceC7823h0 interfaceC7823h0 = this.f103322h;
                float f7 = y11;
                if (i31 <= 0) {
                    int m12 = Z1.b.m(k11);
                    int l11 = Z1.b.l(k11);
                    p12.h(0, m12, l11, new ArrayList(), vVar.d(), vVar, true, false, length, false, 0, 0, m11, interfaceC7823h0);
                    long e11 = p12.e();
                    if (!Z1.q.c(e11, 0L)) {
                        m12 = Z1.c.h((int) (e11 >> 32), k11);
                        l11 = Z1.c.g((int) (e11 & 4294967295L), k11);
                    }
                    o11 = o12;
                    c10377d = new C10377D(null, 0, false, 0.0f, (W) c10404u2.invoke(Integer.valueOf(m12), Integer.valueOf(l11), C10375B.f103130b), false, m11, interfaceC10573B3, length, xVar, kotlin.collections.K.f71697a, -Y04, j11 + i29, 0, enumC9142v, i29, Y06);
                } else {
                    InterfaceC10573B interfaceC10573B4 = interfaceC10573B3;
                    O o13 = o12;
                    int round = Math.round(f7);
                    int i33 = n11 - round;
                    if (i32 == 0 && i33 < 0) {
                        round += i33;
                        i33 = 0;
                    }
                    C7704k c7704k = new C7704k();
                    int i34 = -Y04;
                    int i35 = i34 + (Y06 < 0 ? Y06 : 0);
                    int i36 = i33 + i35;
                    while (i36 < 0 && i32 > 0) {
                        O o14 = o13;
                        int i37 = i32 - 1;
                        float f11 = f7;
                        C10379F c12 = wVar.c(i37);
                        i32 = i37;
                        c7704k.add(0, c12);
                        i36 += c12.d();
                        o13 = o14;
                        f7 = f11;
                    }
                    O o15 = o13;
                    float f12 = f7;
                    if (i36 < i35) {
                        round += i36;
                        i36 = i35;
                    }
                    int i38 = i36 - i35;
                    int i39 = j11 + i29;
                    if (i39 < 0) {
                        i12 = i39;
                        i11 = 0;
                    } else {
                        i11 = i39;
                        i12 = i11;
                    }
                    int i41 = -i38;
                    int i42 = i38;
                    int i43 = i32;
                    int i44 = 0;
                    boolean z12 = false;
                    while (i44 < c7704k.getF26995b()) {
                        if (i41 >= i11) {
                            c7704k.b(i44);
                            z12 = true;
                        } else {
                            i43++;
                            i41 += ((C10379F) c7704k.get(i44)).d();
                            i44++;
                        }
                    }
                    boolean z13 = z12;
                    int i45 = i43;
                    while (i45 < i31 && (i41 < i11 || i41 <= 0 || c7704k.isEmpty())) {
                        z11 = z13;
                        C10379F c13 = wVar.c(i45);
                        if (c13.e()) {
                            break;
                        }
                        int d11 = c13.d() + i41;
                        if (d11 <= i35) {
                            i26 = i35;
                            i27 = d11;
                            if (((C10378E) C7705l.Q(c13.b())).getIndex() != i31 - 1) {
                                i42 -= c13.d();
                                i32 = i45 + 1;
                                z13 = true;
                                i45++;
                                i41 = i27;
                                i35 = i26;
                            }
                        } else {
                            i26 = i35;
                            i27 = d11;
                        }
                        c7704k.addLast(c13);
                        z13 = z11;
                        i45++;
                        i41 = i27;
                        i35 = i26;
                    }
                    z11 = z13;
                    if (i41 < j11) {
                        int i46 = j11 - i41;
                        i41 += i46;
                        i14 = i42 - i46;
                        while (i14 < Y04 && i32 > 0) {
                            int i47 = i32 - 1;
                            C10379F c14 = wVar.c(i47);
                            c7704k.add(0, c14);
                            i14 += c14.d();
                            i46 = i46;
                            i32 = i47;
                        }
                        int i48 = round + i46;
                        if (i14 < 0) {
                            i41 += i14;
                            i13 = i48 + i14;
                            i14 = 0;
                        } else {
                            i13 = i48;
                        }
                    } else {
                        i13 = round;
                        i14 = i42;
                    }
                    float f13 = (Integer.signum(Math.round(f12)) != Integer.signum(i13) || Math.abs(Math.round(f12)) < Math.abs(i13)) ? f12 : i13;
                    if (i14 < 0) {
                        throw new IllegalArgumentException("negative initial offset");
                    }
                    int i49 = -i14;
                    C10379F c10379f2 = (C10379F) c7704k.first();
                    C10378E c10378e2 = (C10378E) C7705l.F(c10379f2.b());
                    if (c10378e2 != null) {
                        int index = c10378e2.getIndex();
                        i15 = i49;
                        i16 = index;
                    } else {
                        i15 = i49;
                        i16 = 0;
                    }
                    C10379F c10379f3 = (C10379F) c7704k.m();
                    if (c10379f3 == null || (b11 = c10379f3.b()) == null || (c10378e = (C10378E) C7705l.R(b11)) == null) {
                        i17 = i14;
                        i18 = 0;
                    } else {
                        int index2 = c10378e.getIndex();
                        i17 = i14;
                        i18 = index2;
                    }
                    int size = a13.size();
                    List list3 = null;
                    int i51 = 0;
                    while (i51 < size) {
                        int i52 = size;
                        int intValue = a13.get(i51).intValue();
                        if (intValue < 0 || intValue >= i16) {
                            i23 = i16;
                            i24 = i18;
                            c10404u = c10404u2;
                            i25 = i51;
                        } else {
                            i25 = i51;
                            int d12 = wVar.d(intValue);
                            i23 = i16;
                            i24 = i18;
                            c10404u = c10404u2;
                            C10378E b13 = vVar.b(intValue, d12, wVar.a(0, d12));
                            if (list3 == null) {
                                list3 = new ArrayList();
                            }
                            List list4 = list3;
                            list4.add(b13);
                            list3 = list4;
                        }
                        i51 = i25 + 1;
                        size = i52;
                        i16 = i23;
                        c10404u2 = c10404u;
                        i18 = i24;
                    }
                    int i53 = i16;
                    int i54 = i18;
                    C10404u c10404u3 = c10404u2;
                    if (list3 == null) {
                        list3 = kotlin.collections.K.f71697a;
                    }
                    List list5 = list3;
                    int size2 = a13.size();
                    int i55 = 0;
                    while (i55 < size2) {
                        int intValue2 = a13.get(i55).intValue();
                        if (i54 + 1 > intValue2 || intValue2 >= i31) {
                            i21 = size2;
                            i22 = i31;
                            interfaceC10573B2 = interfaceC10573B4;
                        } else {
                            int d13 = wVar.d(intValue2);
                            i21 = size2;
                            i22 = i31;
                            interfaceC10573B2 = interfaceC10573B4;
                            C10378E b14 = vVar.b(intValue2, d13, wVar.a(0, d13));
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            List list6 = list2;
                            list6.add(b14);
                            list2 = list6;
                        }
                        i55++;
                        size2 = i21;
                        i31 = i22;
                        interfaceC10573B4 = interfaceC10573B2;
                    }
                    int i56 = i31;
                    InterfaceC10573B interfaceC10573B5 = interfaceC10573B4;
                    if (list2 == null) {
                        list2 = kotlin.collections.K.f71697a;
                    }
                    List list7 = list2;
                    if (Y04 > 0 || Y06 < 0) {
                        int f26995b = c7704k.getF26995b();
                        int i57 = i17;
                        c10379f = c10379f2;
                        int i58 = 0;
                        while (i58 < f26995b) {
                            int d14 = ((C10379F) c7704k.get(i58)).d();
                            if (i57 == 0 || d14 > i57 || i58 == C7714v.P(c7704k)) {
                                break;
                            }
                            i57 -= d14;
                            i58++;
                            c10379f = (C10379F) c7704k.get(i58);
                        }
                        i19 = i57;
                    } else {
                        i19 = i17;
                        c10379f = c10379f2;
                    }
                    int k12 = Z1.b.k(k11);
                    int g10 = Z1.c.g(i41, k11);
                    boolean z14 = i41 < Math.min(g10, j11);
                    if (z14 && i15 != 0) {
                        throw new IllegalStateException("non-zero firstLineScrollOffset");
                    }
                    int f26995b2 = c7704k.getF26995b();
                    int i59 = 0;
                    int i61 = 0;
                    while (i59 < f26995b2) {
                        i61 += ((C10379F) c7704k.get(i59)).b().length;
                        i59++;
                        i41 = i41;
                    }
                    int i62 = i41;
                    ArrayList arrayList2 = new ArrayList(i61);
                    if (!z14) {
                        int size3 = list5.size() - 1;
                        if (size3 >= 0) {
                            int i63 = i15;
                            while (true) {
                                int i64 = size3 - 1;
                                C10378E c10378e3 = (C10378E) list5.get(size3);
                                i63 -= c10378e3.j();
                                c10378e3.f(i63, 0, k12, g10);
                                arrayList2.add(c10378e3);
                                if (i64 < 0) {
                                    break;
                                }
                                size3 = i64;
                            }
                        }
                        int f26995b3 = c7704k.getF26995b();
                        int i65 = i15;
                        int i66 = 0;
                        while (i66 < f26995b3) {
                            C10379F c10379f4 = (C10379F) c7704k.get(i66);
                            List list8 = list5;
                            C10378E[] f14 = c10379f4.f(i65, k12, g10);
                            C7704k c7704k2 = c7704k;
                            int length2 = f14.length;
                            int i67 = 0;
                            while (i67 < length2) {
                                int i68 = i67;
                                arrayList2.add(f14[i68]);
                                i67 = i68 + 1;
                            }
                            i65 += c10379f4.d();
                            i66++;
                            list5 = list8;
                            c7704k = c7704k2;
                        }
                        list = list5;
                        int size4 = list7.size();
                        for (int i69 = 0; i69 < size4; i69++) {
                            C10378E c10378e4 = (C10378E) list7.get(i69);
                            c10378e4.f(i65, 0, k12, g10);
                            arrayList2.add(c10378e4);
                            i65 += c10378e4.j();
                        }
                    } else {
                        if (!list5.isEmpty() || !list7.isEmpty()) {
                            throw new IllegalArgumentException("no items");
                        }
                        int f26995b4 = c7704k.getF26995b();
                        int[] iArr = new int[f26995b4];
                        for (int i71 = 0; i71 < f26995b4; i71++) {
                            iArr[i71] = ((C10379F) c7704k.get(i71)).c();
                        }
                        int[] iArr2 = new int[f26995b4];
                        for (int i72 = 0; i72 < f26995b4; i72++) {
                            iArr2[i72] = 0;
                        }
                        if (lVar == null) {
                            throw new IllegalArgumentException("null verticalArrangement");
                        }
                        lVar.b(g10, interfaceC10573B5, iArr, iArr2);
                        IntRange H11 = C7705l.H(iArr2);
                        int f71842a = H11.getF71842a();
                        interfaceC10573B5 = interfaceC10573B5;
                        int f71843b = H11.getF71843b();
                        int f71844c = H11.getF71844c();
                        if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                            while (true) {
                                int[] iArr3 = iArr2;
                                C10378E[] f15 = ((C10379F) c7704k.get(f71842a)).f(iArr2[f71842a], k12, g10);
                                int length3 = f15.length;
                                int i73 = 0;
                                while (i73 < length3) {
                                    int i74 = i73;
                                    arrayList2.add(f15[i74]);
                                    i73 = i74 + 1;
                                }
                                if (f71842a == f71843b) {
                                    break;
                                }
                                f71842a += f71844c;
                                iArr2 = iArr3;
                            }
                        }
                        list = list5;
                    }
                    p12.h((int) f13, k12, g10, arrayList2, vVar.d(), vVar, true, false, length, false, i19, i62, m11, interfaceC7823h0);
                    long e12 = p12.e();
                    if (!Z1.q.c(e12, 0L)) {
                        k12 = Z1.c.h(Math.max(k12, (int) (e12 >> 32)), k11);
                        int g11 = Z1.c.g(Math.max(g10, (int) (e12 & 4294967295L)), k11);
                        if (g11 != g10) {
                            int size5 = arrayList2.size();
                            for (int i75 = 0; i75 < size5; i75++) {
                                ((C10378E) arrayList2.get(i75)).u(g11);
                            }
                        }
                        g10 = g11;
                    }
                    boolean z15 = i54 != i56 + (-1) || i62 > j11;
                    W w11 = (W) c10404u3.invoke(Integer.valueOf(k12), Integer.valueOf(g10), new C10376C(arrayList2, u11));
                    if (list.isEmpty() && list7.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        ArrayList arrayList3 = new ArrayList(arrayList2.size());
                        int size6 = arrayList2.size();
                        int i76 = 0;
                        while (i76 < size6) {
                            Object obj = arrayList2.get(i76);
                            int index3 = ((C10378E) obj).getIndex();
                            int i77 = i53;
                            if (i77 <= index3 && index3 <= i54) {
                                arrayList3.add(obj);
                            }
                            i76++;
                            i53 = i77;
                        }
                        arrayList = arrayList3;
                    }
                    o11 = o15;
                    c10377d = new C10377D(c10379f, i19, z15, f13, w11, z11, m11, interfaceC10573B5, length, xVar, arrayList, i34, i12, i56, EnumC9142v.Vertical, i29, Y06);
                }
                o11.j(c10377d, false);
                return c10377d;
            }
            c11 = h11.c(B11);
            n11 = o12.n();
            int i322 = c11;
            Unit unit2 = Unit.f71690a;
            AbstractC5715f.a.d(a12, b12, h12);
            List<Integer> a132 = C10610o.a(interfaceC10396l, o12.t(), o12.l());
            float y112 = o12.y();
            LazyLayoutItemAnimator<C10378E> p122 = o12.p();
            InterfaceC3978p0<Unit> u112 = o12.u();
            C10404u c10404u22 = new C10404u(interfaceC10573B3, p11, i28, Y05);
            if (Y04 >= 0) {
            }
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a12, b12, h12);
            throw th2;
        }
    }
}
