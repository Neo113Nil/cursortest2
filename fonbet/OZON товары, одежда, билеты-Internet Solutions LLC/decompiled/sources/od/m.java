package od;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.D0;
import je.F0;
import je.L0;
import je.N;
import je.Y;
import kd.C7665d;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import nd.AbstractC8537f0;
import nd.V0;
import nd.g1;
import od.i;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9828T;
import td.InterfaceC9834Z;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.p0;
import zd.C11104f;

/* loaded from: classes10.dex */
public final class m<M extends Member> implements h<M> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f78062a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<M> f78063b;

    /* renamed from: c, reason: collision with root package name */
    private final M f78064c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a f78065d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final IntRange[] f78066e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f78067f;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final IntRange f78068a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Method>[] f78069b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f78070c;

        public a(@NotNull IntRange argumentRange, @NotNull List<Method>[] unboxParameters, Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.f78068a = argumentRange;
            this.f78069b = unboxParameters;
            this.f78070c = method;
        }

        @NotNull
        public final IntRange a() {
            return this.f78068a;
        }

        public final Method b() {
            return this.f78070c;
        }

        @NotNull
        public final List<Method>[] c() {
            return this.f78069b;
        }
    }

    public static final class b implements h {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Method f78071a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Method f78072b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final ArrayList f78073c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final ArrayList f78074d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final ArrayList f78075e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
        public b(@NotNull InterfaceC9857w descriptor, @NotNull AbstractC8537f0 container, @NotNull String constructorDesc, @NotNull List<? extends InterfaceC9828T> originalParameters) {
            ?? a02;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method q11 = container.q("constructor-impl", constructorDesc);
            Intrinsics.f(q11);
            this.f78071a = q11;
            Method q12 = container.q("box-impl", kotlin.text.h.U(constructorDesc, "V") + C11104f.b(container.c()));
            Intrinsics.f(q12);
            this.f78072b = q12;
            List<? extends InterfaceC9828T> list = originalParameters;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                N type = ((InterfaceC9828T) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                arrayList.add(n.a(D0.a(type), descriptor));
            }
            this.f78073c = arrayList;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                InterfaceC9842h p11 = ((InterfaceC9828T) obj).getType().H0().p();
                Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                InterfaceC9839e interfaceC9839e = (InterfaceC9839e) p11;
                List list2 = (List) this.f78073c.get(i11);
                if (list2 != null) {
                    List list3 = list2;
                    a02 = new ArrayList(C7714v.z(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        a02.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> l11 = g1.l(interfaceC9839e);
                    Intrinsics.f(l11);
                    a02 = C7714v.a0(l11);
                }
                arrayList2.add(a02);
                i11 = i12;
            }
            this.f78074d = arrayList2;
            this.f78075e = C7714v.N(arrayList2);
        }

        @Override // od.h
        @NotNull
        public final List<Type> a() {
            return this.f78075e;
        }

        @Override // od.h
        public final /* bridge */ /* synthetic */ Member b() {
            return null;
        }

        @NotNull
        public final ArrayList c() {
            return this.f78074d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
        @Override // od.h
        public final Object call(@NotNull Object[] args) {
            ?? a02;
            Intrinsics.checkNotNullParameter(args, "args");
            ArrayList other = this.f78073c;
            Intrinsics.checkNotNullParameter(args, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            int length = args.length;
            ArrayList arrayList = new ArrayList(Math.min(C7714v.z(other, 10), length));
            Iterator it = other.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i11 >= length) {
                    break;
                }
                arrayList.add(new Pair(args[i11], next));
                i11++;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Object a11 = pair.a();
                List list = (List) pair.b();
                if (list != null) {
                    List list2 = list;
                    a02 = new ArrayList(C7714v.z(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        a02.add(((Method) it3.next()).invoke(a11, new Object[0]));
                    }
                } else {
                    a02 = C7714v.a0(a11);
                }
                C7714v.p((Iterable) a02, arrayList2);
            }
            Object[] array = arrayList2.toArray(new Object[0]);
            this.f78071a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f78072b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Override // od.h
        @NotNull
        public final Type getReturnType() {
            Class<?> returnType = this.f78072b.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
    
        if (qd.m.g0(r1) == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0148, code lost:
    
        if ((r11 instanceof od.g) != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0136  */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v41, types: [kotlin.ranges.IntRange, kotlin.ranges.e] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(@NotNull h oldCaller, @NotNull InterfaceC9857w descriptor, boolean z11) {
        Class i11;
        Method declaredMethod;
        ?? r11;
        boolean z12;
        int i12;
        a aVar;
        int length;
        int length2;
        int i13;
        ?? a11;
        C7665d it;
        IntRange intRange;
        boolean z13 = true;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.f78062a = z11;
        if (oldCaller instanceof i.g.c) {
            InterfaceC9834Z d02 = descriptor.d0();
            d02 = d02 == null ? descriptor.c0() : d02;
            N type = d02 != null ? d02.getType() : null;
            if (type != null && Vd.k.h(type)) {
                if (z11) {
                    List<p0> f7 = descriptor.f();
                    Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                    List<p0> list = f7;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((p0) it2.next()).R()) {
                            }
                        }
                    }
                }
                ArrayList g10 = n.g(D0.a(type));
                Intrinsics.f(g10);
                ArrayList arrayList = new ArrayList(C7714v.z(g10, 10));
                Iterator it3 = g10.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Method) it3.next()).invoke(((i.g.c) oldCaller).g(), new Object[0]));
                }
                oldCaller = new i.g.d(((i.g) oldCaller).b(), arrayList.toArray(new Object[0]));
            }
        }
        this.f78063b = oldCaller;
        this.f78064c = (M) oldCaller.b();
        N returnType = descriptor.getReturnType();
        Intrinsics.f(returnType);
        if (descriptor.isSuspend()) {
            int i14 = Vd.k.f28543a;
            Intrinsics.checkNotNullParameter(returnType, "<this>");
            Y i15 = Vd.k.i(returnType);
            N l11 = i15 != null ? F0.e(returnType).l(i15, L0.INVARIANT) : null;
            if (l11 != null) {
            }
        }
        i11 = n.i(returnType);
        if (i11 != null) {
            try {
                declaredMethod = i11.getDeclaredMethod("box-impl", n.f(i11, descriptor).getReturnType());
                if (Vd.k.a(descriptor)) {
                    int i16 = -1;
                    if (!(oldCaller instanceof i.g.c) && !(oldCaller instanceof i.g.d)) {
                        if (!(descriptor instanceof InterfaceC9844j)) {
                            if (descriptor.c0() != null && !(oldCaller instanceof g)) {
                                InterfaceC9845k d11 = descriptor.d();
                                Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
                                if (!Vd.k.f(d11)) {
                                    i16 = 1;
                                }
                            }
                            i16 = 0;
                        }
                    }
                    int i17 = oldCaller instanceof i.g.d ? -((i.g.d) oldCaller).h() : i16;
                    Member b11 = oldCaller.b();
                    ArrayList arrayList2 = new ArrayList();
                    InterfaceC9834Z d03 = descriptor.d0();
                    N type2 = d03 != null ? d03.getType() : null;
                    if (type2 != null) {
                        arrayList2.add(type2);
                    } else if (descriptor instanceof InterfaceC9844j) {
                        InterfaceC9839e K11 = ((InterfaceC9844j) descriptor).K();
                        Intrinsics.checkNotNullExpressionValue(K11, "getConstructedClass(...)");
                        if (K11.g()) {
                            InterfaceC9845k d12 = K11.d();
                            Intrinsics.g(d12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            arrayList2.add(((InterfaceC9839e) d12).q());
                        }
                    } else {
                        InterfaceC9845k d13 = descriptor.d();
                        Intrinsics.checkNotNullExpressionValue(d13, "getContainingDeclaration(...)");
                        if (d13 instanceof InterfaceC9839e) {
                            InterfaceC9839e makeKotlinParameterTypes = (InterfaceC9839e) d13;
                            Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
                            if (Vd.k.f(makeKotlinParameterTypes)) {
                                if (b11 != null) {
                                    Class<?> declaringClass = b11.getDeclaringClass();
                                    if (declaringClass == null) {
                                        z12 = false;
                                    } else {
                                        Intrinsics.checkNotNullParameter(declaringClass, "<this>");
                                        z12 = !kotlin.jvm.internal.N.b(declaringClass).s();
                                    }
                                    if (z12) {
                                        r11 = true;
                                        if (r11 == true) {
                                            arrayList2.add(makeKotlinParameterTypes.q());
                                        } else {
                                            Y q11 = makeKotlinParameterTypes.q();
                                            Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
                                            arrayList2.add(C8701c.p(q11));
                                        }
                                    }
                                }
                                r11 = false;
                                if (r11 == true) {
                                }
                            }
                        }
                    }
                    List<p0> f11 = descriptor.f();
                    Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                    Iterator it4 = f11.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(((p0) it4.next()).getType());
                    }
                    if (this.f78062a) {
                        Iterator it5 = arrayList2.iterator();
                        int i18 = 0;
                        while (it5.hasNext()) {
                            ArrayList g11 = n.g(D0.a((N) it5.next()));
                            i18 += g11 != null ? g11.size() : 1;
                        }
                        i12 = ((i18 + 31) / 32) + 1;
                    } else {
                        i12 = 0;
                    }
                    int i19 = (descriptor.isSuspend() ? 1 : 0) + i12;
                    Iterator it6 = arrayList2.iterator();
                    int i21 = 0;
                    while (it6.hasNext()) {
                        ArrayList g12 = n.g(D0.a((N) it6.next()));
                        i21 += g12 != null ? g12.size() : 1;
                    }
                    int i22 = i21 + i17 + i19;
                    boolean z14 = this.f78062a;
                    if (j.a(this) != i22) {
                        throw new V0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(this) + " != " + i22 + "\nCalling: " + descriptor + "\nParameter types: " + this.f78063b.a() + ")\nDefault: " + z14);
                    }
                    IntRange o11 = kotlin.ranges.h.o(Math.max(i16, 0), arrayList2.size() + i16);
                    List[] listArr = new List[i22];
                    int i23 = 0;
                    while (i23 < i22) {
                        listArr[i23] = (i23 <= o11.getF71843b() && o11.getF71842a() <= i23) != false ? n.a(D0.a((N) arrayList2.get(i23 - i16)), descriptor) : null;
                        i23++;
                    }
                    aVar = new a(o11, listArr, declaredMethod);
                } else {
                    IntRange.INSTANCE.getClass();
                    intRange = IntRange.f71831f;
                    aVar = new a(intRange, new List[0], declaredMethod);
                }
                this.f78065d = aVar;
                Tc.b builder = C7714v.B();
                h<M> hVar = this.f78063b;
                length = !(hVar instanceof i.g.d) ? ((i.g.d) hVar).g().length : hVar instanceof i.g.c ? 1 : 0;
                if (length > 0) {
                    builder.add(kotlin.ranges.h.o(0, length));
                }
                List<Method>[] c11 = aVar.c();
                length2 = c11.length;
                i13 = 0;
                while (i13 < length2) {
                    List<Method> list2 = c11[i13];
                    int size = (list2 != null ? list2.size() : 1) + length;
                    builder.add(kotlin.ranges.h.o(length, size));
                    i13++;
                    length = size;
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                this.f78066e = (IntRange[]) builder.B().toArray(new IntRange[0]);
                a11 = this.f78065d.a();
                if ((a11 instanceof Collection) || !((Collection) a11).isEmpty()) {
                    it = a11.iterator();
                    while (it.hasNext()) {
                        List<Method> list3 = this.f78065d.c()[it.b()];
                        if ((list3 != null && list3.size() > 1) != false) {
                            break;
                        }
                    }
                }
                z13 = false;
                this.f78067f = z13;
            } catch (NoSuchMethodException unused) {
                throw new V0("No box method found in inline class: " + i11 + " (calling " + descriptor + ')');
            }
        }
        declaredMethod = null;
        if (Vd.k.a(descriptor)) {
        }
        this.f78065d = aVar;
        Tc.b builder2 = C7714v.B();
        h<M> hVar2 = this.f78063b;
        if (!(hVar2 instanceof i.g.d)) {
        }
        if (length > 0) {
        }
        List<Method>[] c112 = aVar.c();
        length2 = c112.length;
        i13 = 0;
        while (i13 < length2) {
        }
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.f78066e = (IntRange[]) builder2.B().toArray(new IntRange[0]);
        a11 = this.f78065d.a();
        if (a11 instanceof Collection) {
        }
        it = a11.iterator();
        while (it.hasNext()) {
        }
        z13 = false;
        this.f78067f = z13;
    }

    @Override // od.h
    @NotNull
    public final List<Type> a() {
        return this.f78063b.a();
    }

    @Override // od.h
    public final M b() {
        return this.f78064c;
    }

    @NotNull
    public final IntRange c(int i11) {
        IntRange[] intRangeArr = this.f78066e;
        if (i11 >= 0 && i11 < intRangeArr.length) {
            return intRangeArr[i11];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(i11, i11, 1);
        }
        int f71843b = ((IntRange) C7705l.Q(intRangeArr)).getF71843b() + 1 + (i11 - intRangeArr.length);
        return new IntRange(f71843b, f71843b, 1);
    }

    @Override // od.h
    public final Object call(@NotNull Object[] args) {
        Object invoke;
        Object obj;
        Object e11;
        Intrinsics.checkNotNullParameter(args, "args");
        a aVar = this.f78065d;
        IntRange a11 = aVar.a();
        List<Method>[] c11 = aVar.c();
        Method b11 = aVar.b();
        if (!a11.isEmpty()) {
            if (this.f78067f) {
                Tc.b builder = new Tc.b(args.length);
                int f71842a = a11.getF71842a();
                for (int i11 = 0; i11 < f71842a; i11++) {
                    builder.add(args[i11]);
                }
                int f71842a2 = a11.getF71842a();
                int f71843b = a11.getF71843b();
                if (f71842a2 <= f71843b) {
                    while (true) {
                        List<Method> list = c11[f71842a2];
                        Object obj2 = args[f71842a2];
                        if (list != null) {
                            for (Method method : list) {
                                if (obj2 != null) {
                                    e11 = method.invoke(obj2, new Object[0]);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    e11 = g1.e(returnType);
                                }
                                builder.add(e11);
                            }
                        } else {
                            builder.add(obj2);
                        }
                        if (f71842a2 == f71843b) {
                            break;
                        }
                        f71842a2++;
                    }
                }
                int f71843b2 = a11.getF71843b() + 1;
                Intrinsics.checkNotNullParameter(args, "<this>");
                int length = args.length - 1;
                if (f71843b2 <= length) {
                    while (true) {
                        builder.add(args[f71843b2]);
                        if (f71843b2 == length) {
                            break;
                        }
                        f71843b2++;
                    }
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                args = builder.B().toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    int f71842a3 = a11.getF71842a();
                    if (i12 > a11.getF71843b() || f71842a3 > i12) {
                        obj = args[i12];
                    } else {
                        List<Method> list2 = c11[i12];
                        Method method2 = list2 != null ? (Method) C7714v.B0(list2) : null;
                        obj = args[i12];
                        if (method2 != null) {
                            if (obj != null) {
                                obj = method2.invoke(obj, new Object[0]);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                obj = g1.e(returnType2);
                            }
                        }
                    }
                    objArr[i12] = obj;
                }
                args = objArr;
            }
        }
        Object call = this.f78063b.call(args);
        return (call == Wc.a.COROUTINE_SUSPENDED || b11 == null || (invoke = b11.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // od.h
    @NotNull
    public final Type getReturnType() {
        return this.f78063b.getReturnType();
    }
}
