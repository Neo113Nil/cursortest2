package v0;

import B1.W;
import S0.InterfaceC3978p0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import c1.AbstractC5715f;
import e1.InterfaceC6250b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7704k;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l1.InterfaceC7823h0;
import n0.C8393n;
import r0.EnumC9142v;
import u0.C9915y;
import x0.C10610o;
import x0.InterfaceC10573B;

/* loaded from: classes.dex */
final class w extends AbstractC7737t implements Function2<InterfaceC10573B, Z1.b, C10157B> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ I f101593b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f101594c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C9915y f101595d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlin.reflect.n f101596e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5179b.l f101597f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C5179b.e f101598g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f101599h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ xe.M f101600i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC7823h0 f101601j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.InterfaceC0966b f101602k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ InterfaceC6250b.c f101603l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(I i11, boolean z11, C9915y c9915y, kotlin.reflect.n nVar, C5179b.l lVar, C5179b.e eVar, boolean z12, xe.M m11, InterfaceC7823h0 interfaceC7823h0, InterfaceC6250b.InterfaceC0966b interfaceC0966b, InterfaceC6250b.c cVar) {
        super(2);
        this.f101593b = i11;
        this.f101594c = z11;
        this.f101595d = c9915y;
        this.f101596e = nVar;
        this.f101597f = lVar;
        this.f101598g = eVar;
        this.f101599h = z12;
        this.f101600i = m11;
        this.f101601j = interfaceC7823h0;
        this.f101602k = interfaceC0966b;
        this.f101603l = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:332:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10157B invoke(InterfaceC10573B interfaceC10573B, Z1.b bVar) {
        float a11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        List list;
        List<Integer> list2;
        List list3;
        List list4;
        float f11;
        ArrayList arrayList;
        String str;
        List list5;
        long j11;
        u uVar;
        InterfaceC10573B interfaceC10573B2;
        float f12;
        C10158C c10158c;
        int i17;
        C10157B c10157b;
        InterfaceC10573B interfaceC10573B3;
        I i18;
        ArrayList arrayList2;
        C10158C c10158c2;
        InterfaceC10174n interfaceC10174n;
        float f13;
        C10158C c10158c3;
        Object obj;
        int j12;
        Object obj2;
        int index;
        int min;
        C10158C c10158c4;
        Object obj3;
        int i19;
        List list6;
        int i21;
        InterfaceC10573B interfaceC10573B4 = interfaceC10573B;
        long p11 = bVar.p();
        I i22 = this.f101593b;
        i22.u().getValue();
        boolean z11 = i22.q() || interfaceC10573B4.R0();
        boolean z12 = this.f101594c;
        C8393n.a(p11, z12 ? EnumC9142v.Vertical : EnumC9142v.Horizontal);
        C9915y c9915y = this.f101595d;
        int Y02 = z12 ? interfaceC10573B4.Y0(c9915y.b(interfaceC10573B4.getLayoutDirection())) : interfaceC10573B4.Y0(T.d(c9915y, interfaceC10573B4.getLayoutDirection()));
        int Y03 = z12 ? interfaceC10573B4.Y0(c9915y.c(interfaceC10573B4.getLayoutDirection())) : interfaceC10573B4.Y0(T.c(c9915y, interfaceC10573B4.getLayoutDirection()));
        int Y04 = interfaceC10573B4.Y0(c9915y.d());
        int Y05 = interfaceC10573B4.Y0(c9915y.a()) + Y04;
        int i23 = Y02 + Y03;
        int i24 = z12 ? Y05 : i23;
        if (z12) {
            Y03 = Y04;
        } else if (!z12) {
            Y03 = Y02;
        }
        int i25 = i24 - Y03;
        long k11 = Z1.c.k(-i23, -Y05, p11);
        o oVar = (o) this.f101596e.invoke();
        int i26 = -1;
        oVar.e().b(Z1.b.k(k11), Z1.b.j(k11));
        C5179b.e eVar = this.f101598g;
        C5179b.l lVar = this.f101597f;
        if (z12) {
            if (lVar == null) {
                throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
            }
            a11 = lVar.a();
        } else {
            if (eVar == null) {
                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
            }
            a11 = eVar.a();
        }
        int Y06 = interfaceC10573B4.Y0(a11);
        int itemCount = oVar.getItemCount();
        int j13 = z12 ? Z1.b.j(p11) - Y05 : Z1.b.k(p11) - i23;
        int i27 = Y03;
        int i28 = j13;
        v vVar = new v(k11, this.f101594c, oVar, interfaceC10573B4, itemCount, Y06, this.f101602k, this.f101603l, i27, i25, Z1.n.a(Y02, Y04), this.f101593b);
        InterfaceC10573B interfaceC10573B5 = interfaceC10573B4;
        AbstractC5715f a12 = AbstractC5715f.a.a();
        Function1<Object, Unit> h11 = a12 != null ? a12.h() : null;
        AbstractC5715f b11 = AbstractC5715f.a.b(a12);
        try {
            int I11 = i22.I(oVar, i22.o());
            int p12 = i22.p();
            Unit unit = Unit.f71690a;
            AbstractC5715f.a.d(a12, b11, h11);
            List<Integer> a13 = C10610o.a(oVar, i22.w(), i22.n());
            float D11 = (interfaceC10573B5.R0() || !z11) ? i22.D() : i22.C();
            kotlin.collections.K g10 = this.f101599h ? oVar.g() : kotlin.collections.K.f71697a;
            LazyLayoutItemAnimator<C10158C> s11 = i22.s();
            boolean R02 = interfaceC10573B5.R0();
            C10157B y11 = i22.y();
            InterfaceC3978p0<Unit> x11 = i22.x();
            int i29 = I11;
            List<Integer> list7 = a13;
            u uVar2 = new u(interfaceC10573B5, p11, i23, Y05);
            if (i27 < 0) {
                throw new IllegalArgumentException("invalid beforeContentPadding");
            }
            if (i25 < 0) {
                throw new IllegalArgumentException("invalid afterContentPadding");
            }
            xe.M m11 = this.f101600i;
            InterfaceC7823h0 interfaceC7823h0 = this.f101601j;
            boolean z13 = this.f101594c;
            float f14 = D11;
            if (itemCount <= 0) {
                int m12 = Z1.b.m(k11);
                int l11 = Z1.b.l(k11);
                s11.h(0, m12, l11, new ArrayList(), vVar.e(), vVar, z13, R02, 1, z11, 0, 0, m11, interfaceC7823h0);
                if (!R02) {
                    long e11 = s11.e();
                    if (!Z1.q.c(e11, 0L)) {
                        i21 = Z1.c.h((int) (e11 >> 32), k11);
                        l11 = Z1.c.g((int) (e11 & 4294967295L), k11);
                        W w11 = (W) uVar2.invoke(Integer.valueOf(i21), Integer.valueOf(l11), z.f101604b);
                        interfaceC10573B3 = interfaceC10573B5;
                        c10157b = new C10157B(null, 0, false, 0.0f, w11, 0.0f, false, m11, interfaceC10573B3, vVar.d(), kotlin.collections.K.f71697a, -i27, i28 + i25, 0, !z13 ? EnumC9142v.Vertical : EnumC9142v.Horizontal, i25, Y06);
                        i18 = i22;
                    }
                }
                i21 = m12;
                W w112 = (W) uVar2.invoke(Integer.valueOf(i21), Integer.valueOf(l11), z.f101604b);
                interfaceC10573B3 = interfaceC10573B5;
                c10157b = new C10157B(null, 0, false, 0.0f, w112, 0.0f, false, m11, interfaceC10573B3, vVar.d(), kotlin.collections.K.f71697a, -i27, i28 + i25, 0, !z13 ? EnumC9142v.Vertical : EnumC9142v.Horizontal, i25, Y06);
                i18 = i22;
            } else {
                String str2 = "null verticalArrangement when isVertical == true";
                if (i29 >= itemCount) {
                    i29 = itemCount - 1;
                    p12 = 0;
                }
                int round = Math.round(f14);
                int i31 = p12 - round;
                if (i29 == 0 && i31 < 0) {
                    round += i31;
                    i31 = 0;
                }
                C7704k c7704k = new C7704k();
                int i32 = -i27;
                int i33 = i32 + (Y06 < 0 ? Y06 : 0);
                int i34 = i31 + i33;
                int i35 = i29;
                int i36 = 0;
                while (i34 < 0 && i35 > 0) {
                    float f15 = f14;
                    int i37 = i35 - 1;
                    LazyLayoutItemAnimator<C10158C> lazyLayoutItemAnimator = s11;
                    C10158C c11 = AbstractC10159D.c(vVar, i37);
                    i35 = i37;
                    c7704k.add(0, c11);
                    i36 = Math.max(i36, c11.e());
                    i34 += c11.j();
                    f14 = f15;
                    s11 = lazyLayoutItemAnimator;
                }
                float f16 = f14;
                LazyLayoutItemAnimator<C10158C> lazyLayoutItemAnimator2 = s11;
                if (i34 < i33) {
                    round += i34;
                    i34 = i33;
                }
                int i38 = round;
                int i39 = i34 - i33;
                int i41 = i28 + i25;
                int i42 = i41 < 0 ? 0 : i41;
                int i43 = i39;
                int i44 = -i39;
                int i45 = i36;
                int i46 = i35;
                int i47 = 0;
                boolean z14 = false;
                while (i47 < c7704k.getF26995b()) {
                    if (i44 >= i42) {
                        c7704k.b(i47);
                        z14 = true;
                    } else {
                        i46++;
                        i44 += ((C10158C) c7704k.get(i47)).j();
                        i47++;
                    }
                }
                int i48 = i46;
                int i49 = i45;
                while (i48 < itemCount && (i44 < i42 || i44 <= 0 || c7704k.isEmpty())) {
                    int i51 = i42;
                    C10158C c12 = AbstractC10159D.c(vVar, i48);
                    i44 = c12.j() + i44;
                    int i52 = i33;
                    if (i44 > i33 || i48 == itemCount - 1) {
                        int max = Math.max(i49, c12.e());
                        c7704k.addLast(c12);
                        i49 = max;
                    } else {
                        i43 -= c12.j();
                        i35 = i48 + 1;
                        z14 = true;
                    }
                    i48++;
                    i42 = i51;
                    i33 = i52;
                }
                if (i44 < i28) {
                    int i53 = i28 - i44;
                    int i54 = i44 + i53;
                    int i55 = i43 - i53;
                    while (i55 < i27 && i35 > 0) {
                        int i56 = i53;
                        int i57 = i35 - 1;
                        int i58 = i54;
                        C10158C c13 = AbstractC10159D.c(vVar, i57);
                        i35 = i57;
                        c7704k.add(0, c13);
                        i49 = Math.max(i49, c13.e());
                        i55 += c13.j();
                        i54 = i58;
                        i53 = i56;
                    }
                    int i59 = i54;
                    i14 = i38 + i53;
                    if (i55 < 0) {
                        i14 += i55;
                        int i61 = i59 + i55;
                        int i62 = i35;
                        i11 = i27;
                        i12 = i62;
                        i13 = i61;
                        i15 = 0;
                    } else {
                        int i63 = i35;
                        i11 = i27;
                        i12 = i63;
                        i15 = i55;
                        i13 = i59;
                    }
                } else {
                    int i64 = i35;
                    i11 = i27;
                    i12 = i64;
                    i13 = i44;
                    i14 = i38;
                    i15 = i43;
                }
                int i65 = i48;
                int i66 = i49;
                float f17 = (Integer.signum(Math.round(f16)) != Integer.signum(i14) || Math.abs(Math.round(f16)) < Math.abs(i14)) ? f16 : i14;
                float f18 = f16 - f17;
                float f19 = (!R02 || i14 <= i38 || f18 > 0.0f) ? 0.0f : (i14 - i38) + f18;
                if (i15 < 0) {
                    throw new IllegalArgumentException("negative currentFirstItemScrollOffset");
                }
                int i67 = -i15;
                C10158C c10158c5 = (C10158C) c7704k.first();
                if (i11 > 0 || Y06 < 0) {
                    f7 = f19;
                    int f26995b = c7704k.getF26995b();
                    C10158C c10158c6 = c10158c5;
                    int i68 = 0;
                    while (i68 < f26995b) {
                        int i69 = f26995b;
                        int j14 = ((C10158C) c7704k.get(i68)).j();
                        if (i15 == 0 || j14 > i15 || i68 == C7714v.P(c7704k)) {
                            break;
                        }
                        i15 -= j14;
                        i68++;
                        c10158c6 = (C10158C) c7704k.get(i68);
                        f26995b = i69;
                    }
                    c10158c5 = c10158c6;
                } else {
                    f7 = f19;
                }
                int i71 = i15;
                int max2 = Math.max(0, i12);
                int i72 = i12 - 1;
                if (max2 <= i72) {
                    list = null;
                    while (true) {
                        if (list == null) {
                            list = new ArrayList();
                        }
                        i16 = i67;
                        list.add(AbstractC10159D.c(vVar, i72));
                        if (i72 == max2) {
                            break;
                        }
                        i72--;
                        i67 = i16;
                    }
                } else {
                    i16 = i67;
                    list = null;
                }
                int size = list7.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i73 = size - 1;
                        list3 = list;
                        list2 = list7;
                        int intValue = list2.get(size).intValue();
                        if (intValue < max2) {
                            if (list3 == null) {
                                i19 = max2;
                                list6 = new ArrayList();
                            } else {
                                i19 = max2;
                                list6 = list3;
                            }
                            list6.add(AbstractC10159D.c(vVar, intValue));
                            list3 = list6;
                        } else {
                            i19 = max2;
                        }
                        if (i73 < 0) {
                            break;
                        }
                        size = i73;
                        max2 = i19;
                        list7 = list2;
                        list = list3;
                    }
                } else {
                    List list8 = list;
                    list2 = list7;
                    list3 = list8;
                }
                if (list3 == null) {
                    list3 = kotlin.collections.K.f71697a;
                }
                List list9 = list3;
                int i74 = i66;
                int i75 = 0;
                for (int size2 = list9.size(); i75 < size2; size2 = size2) {
                    i74 = Math.max(i74, ((C10158C) list9.get(i75)).e());
                    i75++;
                }
                int i76 = itemCount - 1;
                int min2 = Math.min(((C10158C) C7714v.X(c7704k)).getIndex(), i76);
                int i77 = i74;
                int index2 = ((C10158C) C7714v.X(c7704k)).getIndex() + 1;
                if (index2 <= min2) {
                    ArrayList arrayList3 = null;
                    while (true) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        f11 = f17;
                        arrayList = arrayList3;
                        list4 = list9;
                        arrayList.add(AbstractC10159D.c(vVar, index2));
                        if (index2 == min2) {
                            break;
                        }
                        index2++;
                        list9 = list4;
                        arrayList3 = arrayList;
                        f17 = f11;
                    }
                } else {
                    list4 = list9;
                    f11 = f17;
                    arrayList = null;
                }
                if (!R02 || y11 == null || y11.g().isEmpty()) {
                    str = str2;
                    list5 = arrayList;
                } else {
                    List<C10158C> g11 = y11.g();
                    ArrayList arrayList4 = arrayList;
                    for (int size3 = g11.size() - 1; i26 < size3; size3--) {
                        if (g11.get(size3).getIndex() > min2 && (size3 == 0 || g11.get(size3 - 1).getIndex() <= min2)) {
                            c10158c2 = g11.get(size3);
                            break;
                        }
                        i26 = -1;
                    }
                    c10158c2 = null;
                    InterfaceC10174n interfaceC10174n2 = (InterfaceC10174n) C7714v.X(y11.g());
                    if (c10158c2 == null || (index = c10158c2.getIndex()) > (min = Math.min(interfaceC10174n2.getIndex(), i76))) {
                        interfaceC10174n = interfaceC10174n2;
                        str = str2;
                        list5 = arrayList4;
                    } else {
                        ArrayList arrayList5 = arrayList4;
                        while (true) {
                            interfaceC10174n = interfaceC10174n2;
                            if (arrayList5 != null) {
                                int size4 = arrayList5.size();
                                str = str2;
                                int i78 = 0;
                                while (true) {
                                    if (i78 >= size4) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList5.get(i78);
                                    int i79 = size4;
                                    if (((C10158C) obj3).getIndex() == index) {
                                        break;
                                    }
                                    i78++;
                                    size4 = i79;
                                }
                                c10158c4 = (C10158C) obj3;
                            } else {
                                str = str2;
                                c10158c4 = null;
                            }
                            if (c10158c4 == null) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(AbstractC10159D.c(vVar, index));
                            }
                            if (index == min) {
                                break;
                            }
                            index++;
                            interfaceC10174n2 = interfaceC10174n;
                            str2 = str;
                        }
                        list5 = arrayList5;
                    }
                    float h12 = ((y11.h() - interfaceC10174n.getOffset()) - interfaceC10174n.getSize()) - f11;
                    if (h12 > 0.0f) {
                        int index3 = interfaceC10174n.getIndex() + 1;
                        List list10 = list5;
                        int i81 = 0;
                        while (index3 < itemCount && i81 < h12) {
                            if (index3 <= min2) {
                                int f26995b2 = c7704k.getF26995b();
                                f13 = h12;
                                int i82 = 0;
                                while (true) {
                                    if (i82 >= f26995b2) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = c7704k.get(i82);
                                    int i83 = i82;
                                    if (((C10158C) obj2).getIndex() == index3) {
                                        break;
                                    }
                                    i82 = i83 + 1;
                                }
                                c10158c3 = (C10158C) obj2;
                            } else {
                                f13 = h12;
                                if (list10 != null) {
                                    int size5 = list10.size();
                                    int i84 = 0;
                                    while (true) {
                                        if (i84 >= size5) {
                                            obj = null;
                                            break;
                                        }
                                        obj = list10.get(i84);
                                        int i85 = size5;
                                        if (((C10158C) obj).getIndex() == index3) {
                                            break;
                                        }
                                        i84++;
                                        size5 = i85;
                                    }
                                    c10158c3 = (C10158C) obj;
                                } else {
                                    c10158c3 = null;
                                }
                            }
                            if (c10158c3 != null) {
                                index3++;
                                j12 = c10158c3.j();
                            } else {
                                if (list10 == null) {
                                    list10 = new ArrayList();
                                }
                                list10.add(AbstractC10159D.c(vVar, index3));
                                index3++;
                                j12 = ((C10158C) C7714v.X(list10)).j();
                            }
                            i81 += j12;
                            h12 = f13;
                        }
                        list5 = list10;
                    }
                }
                if (list5 != null && ((C10158C) C7714v.X(list5)).getIndex() > min2) {
                    min2 = ((C10158C) C7714v.X(list5)).getIndex();
                }
                int size6 = list2.size();
                for (int i86 = 0; i86 < size6; i86++) {
                    int intValue2 = list2.get(i86).intValue();
                    if (intValue2 > min2) {
                        if (list5 == null) {
                            list5 = new ArrayList();
                        }
                        list5.add(AbstractC10159D.c(vVar, intValue2));
                    }
                }
                if (list5 == null) {
                    list5 = kotlin.collections.K.f71697a;
                }
                int size7 = list5.size();
                int i87 = i77;
                for (int i88 = 0; i88 < size7; i88++) {
                    i87 = Math.max(i87, ((C10158C) list5.get(i88)).e());
                }
                boolean z15 = Intrinsics.d(c10158c5, c7704k.first()) && list4.isEmpty() && list5.isEmpty();
                int h13 = Z1.c.h(z13 ? i87 : i13, k11);
                if (z13) {
                    i87 = i13;
                }
                int g12 = Z1.c.g(i87, k11);
                int i89 = z13 ? g12 : h13;
                boolean z16 = i13 < Math.min(i89, i28);
                if (z16 && i16 != 0) {
                    throw new IllegalStateException("non-zero itemsScrollOffset");
                }
                boolean z17 = z15;
                ArrayList arrayList6 = new ArrayList(list5.size() + list4.size() + c7704k.getF26995b());
                if (!z16) {
                    j11 = k11;
                    uVar = uVar2;
                    int size8 = list4.size();
                    int i91 = i16;
                    int i92 = 0;
                    while (i92 < size8) {
                        InterfaceC10573B interfaceC10573B6 = interfaceC10573B5;
                        C10158C c10158c7 = (C10158C) list4.get(i92);
                        i91 -= c10158c7.j();
                        c10158c7.p(i91, h13, g12);
                        arrayList6.add(c10158c7);
                        i92++;
                        interfaceC10573B5 = interfaceC10573B6;
                    }
                    interfaceC10573B2 = interfaceC10573B5;
                    int f26995b3 = c7704k.getF26995b();
                    int i93 = i16;
                    for (int i94 = 0; i94 < f26995b3; i94++) {
                        C10158C c10158c8 = (C10158C) c7704k.get(i94);
                        c10158c8.p(i93, h13, g12);
                        arrayList6.add(c10158c8);
                        i93 += c10158c8.j();
                    }
                    int size9 = list5.size();
                    for (int i95 = 0; i95 < size9; i95++) {
                        C10158C c10158c9 = (C10158C) list5.get(i95);
                        c10158c9.p(i93, h13, g12);
                        arrayList6.add(c10158c9);
                        i93 += c10158c9.j();
                    }
                } else {
                    if (!list4.isEmpty() || !list5.isEmpty()) {
                        throw new IllegalArgumentException("no extra items");
                    }
                    int f26995b4 = c7704k.getF26995b();
                    int[] iArr = new int[f26995b4];
                    for (int i96 = 0; i96 < f26995b4; i96++) {
                        iArr[i96] = ((C10158C) c7704k.get(i96)).getSize();
                    }
                    int[] iArr2 = new int[f26995b4];
                    for (int i97 = 0; i97 < f26995b4; i97++) {
                        iArr2[i97] = 0;
                    }
                    if (z13) {
                        if (lVar == null) {
                            throw new IllegalArgumentException(str);
                        }
                        lVar.b(i89, interfaceC10573B5, iArr, iArr2);
                        arrayList2 = arrayList6;
                        uVar = uVar2;
                        j11 = k11;
                    } else {
                        if (eVar == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                        }
                        arrayList2 = arrayList6;
                        uVar = uVar2;
                        j11 = k11;
                        eVar.c(interfaceC10573B5, i89, iArr, Z1.s.Ltr, iArr2);
                    }
                    IntRange H11 = C7705l.H(iArr2);
                    int f71842a = H11.getF71842a();
                    int f71843b = H11.getF71843b();
                    int f71844c = H11.getF71844c();
                    if ((f71844c > 0 && f71842a <= f71843b) || (f71844c < 0 && f71843b <= f71842a)) {
                        while (true) {
                            int i98 = iArr2[f71842a];
                            int i99 = f71844c;
                            C10158C c10158c10 = (C10158C) c7704k.get(f71842a);
                            c10158c10.p(i98, h13, g12);
                            arrayList2.add(c10158c10);
                            if (f71842a == f71843b) {
                                break;
                            }
                            f71842a += i99;
                            f71844c = i99;
                        }
                    }
                    interfaceC10573B2 = interfaceC10573B5;
                    arrayList6 = arrayList2;
                }
                float f21 = f11;
                C10158C c10158c11 = c10158c5;
                int i100 = i13;
                int i101 = h13;
                ArrayList arrayList7 = arrayList6;
                lazyLayoutItemAnimator2.h((int) f21, i101, g12, arrayList7, vVar.e(), vVar, z13, R02, 1, z11, i71, i100, m11, interfaceC7823h0);
                if (R02) {
                    f12 = f21;
                    c10158c = c10158c11;
                } else {
                    long e12 = lazyLayoutItemAnimator2.e();
                    f12 = f21;
                    if (Z1.q.c(e12, 0L)) {
                        c10158c = c10158c11;
                    } else {
                        int i102 = z13 ? g12 : i101;
                        long j15 = j11;
                        i101 = Z1.c.h(Math.max(i101, (int) (e12 >> 32)), j15);
                        c10158c = c10158c11;
                        i17 = Z1.c.g(Math.max(g12, (int) (e12 & 4294967295L)), j15);
                        int i103 = z13 ? i17 : i101;
                        if (i103 != i102) {
                            int size10 = arrayList7.size();
                            for (int i104 = 0; i104 < size10; i104++) {
                                ((C10158C) arrayList7.get(i104)).q(i103);
                            }
                        }
                        g10.getClass();
                        boolean z18 = i65 >= itemCount || i100 > i28;
                        W w12 = (W) uVar.invoke(Integer.valueOf(i101), Integer.valueOf(i17), new C10156A(arrayList7, null, R02, x11));
                        if (!z17) {
                            ArrayList arrayList8 = new ArrayList(arrayList7.size());
                            int size11 = arrayList7.size();
                            for (int i105 = 0; i105 < size11; i105++) {
                                Object obj4 = arrayList7.get(i105);
                                C10158C c10158c12 = (C10158C) obj4;
                                if (c10158c12.getIndex() >= ((C10158C) c7704k.first()).getIndex() && c10158c12.getIndex() <= ((C10158C) c7704k.last()).getIndex()) {
                                    arrayList8.add(obj4);
                                }
                            }
                            arrayList7 = arrayList8;
                        }
                        interfaceC10573B3 = interfaceC10573B2;
                        EnumC9142v enumC9142v = !z13 ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
                        i18 = i22;
                        c10157b = new C10157B(c10158c, i71, z18, f12, w12, f7, z14, m11, interfaceC10573B3, vVar.d(), arrayList7, i32, i41, itemCount, enumC9142v, i25, Y06);
                    }
                }
                i17 = g12;
                g10.getClass();
                if (i65 >= itemCount) {
                }
                W w122 = (W) uVar.invoke(Integer.valueOf(i101), Integer.valueOf(i17), new C10156A(arrayList7, null, R02, x11));
                if (!z17) {
                }
                if (!z13) {
                }
                interfaceC10573B3 = interfaceC10573B2;
                EnumC9142v enumC9142v2 = !z13 ? EnumC9142v.Vertical : EnumC9142v.Horizontal;
                i18 = i22;
                c10157b = new C10157B(c10158c, i71, z18, f12, w122, f7, z14, m11, interfaceC10573B3, vVar.d(), arrayList7, i32, i41, itemCount, enumC9142v2, i25, Y06);
            }
            i18.l(c10157b, interfaceC10573B3.R0(), false);
            return c10157b;
        } catch (Throwable th2) {
            AbstractC5715f.a.d(a12, b11, h11);
            throw th2;
        }
    }
}
