package od;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import je.D0;
import je.H0;
import je.N;
import je.Y;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import nd.V0;
import nd.g1;
import org.jetbrains.annotations.NotNull;
import td.C9816G;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.n0;
import td.p0;
import td.q0;

/* loaded from: classes.dex */
public final class n {
    public static final List a(Y y11, InterfaceC9857w interfaceC9857w) {
        Method f7;
        ArrayList g10 = g(y11);
        if (g10 != null) {
            return g10;
        }
        Class<?> i11 = i(y11);
        if (i11 == null || (f7 = f(i11, interfaceC9857w)) == null) {
            return null;
        }
        return C7714v.a0(f7);
    }

    public static final Object c(Object obj, @NotNull InterfaceC9836b descriptor) {
        N e11;
        Class<?> i11;
        Method f7;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof InterfaceC9831W) && Vd.k.e((q0) descriptor)) || (e11 = e(descriptor)) == null || (i11 = i(e11)) == null || (f7 = f(i11, descriptor)) == null) ? obj : f7.invoke(obj, new Object[0]);
    }

    @NotNull
    public static final h d(@NotNull h hVar, @NotNull InterfaceC9857w descriptor, boolean z11) {
        N e11;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!Vd.k.a(descriptor)) {
            List<InterfaceC9834Z> y02 = descriptor.y0();
            Intrinsics.checkNotNullExpressionValue(y02, "getContextReceiverParameters(...)");
            List<InterfaceC9834Z> list = y02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    N type = ((InterfaceC9834Z) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (Vd.k.g(type)) {
                        break;
                    }
                }
            }
            List<p0> f7 = descriptor.f();
            Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
            List<p0> list2 = f7;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    N type2 = ((p0) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    if (Vd.k.g(type2)) {
                        break;
                    }
                }
            }
            N returnType = descriptor.getReturnType();
            if ((returnType == null || !Vd.k.c(returnType)) && ((e11 = e(descriptor)) == null || !Vd.k.g(e11))) {
                return hVar;
            }
        }
        return new m(hVar, descriptor, z11);
    }

    private static final N e(InterfaceC9836b interfaceC9836b) {
        InterfaceC9834Z d02 = interfaceC9836b.d0();
        InterfaceC9834Z c02 = interfaceC9836b.c0();
        if (d02 != null) {
            return d02.getType();
        }
        if (c02 != null) {
            if (interfaceC9836b instanceof InterfaceC9844j) {
                return c02.getType();
            }
            InterfaceC9845k d11 = interfaceC9836b.d();
            InterfaceC9839e interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : null;
            if (interfaceC9839e != null) {
                return interfaceC9839e.q();
            }
        }
        return null;
    }

    @NotNull
    public static final Method f(@NotNull Class<?> cls, @NotNull InterfaceC9836b descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", new Class[0]);
        } catch (NoSuchMethodException unused) {
            throw new V0("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static final ArrayList g(@NotNull Y type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList h11 = h(D0.a(type));
        if (h11 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C7714v.z(h11, 10));
        Iterator it = h11.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        InterfaceC9842h p11 = type.H0().p();
        Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> l11 = g1.l((InterfaceC9839e) p11);
        Intrinsics.f(l11);
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(l11.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    private static final ArrayList h(Y y11) {
        ?? a02;
        if (!Vd.k.h(y11)) {
            return null;
        }
        InterfaceC9842h p11 = y11.H0().p();
        Intrinsics.g(p11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        int i11 = Zd.e.f35896a;
        n0<Y> e02 = ((InterfaceC9839e) p11).e0();
        C9816G c9816g = e02 instanceof C9816G ? (C9816G) e02 : null;
        Intrinsics.f(c9816g);
        List<Pair> b11 = c9816g.b();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : b11) {
            Sd.f fVar = (Sd.f) pair.a();
            ArrayList h11 = h((Y) pair.b());
            if (h11 != null) {
                a02 = new ArrayList(C7714v.z(h11, 10));
                Iterator it = h11.iterator();
                while (it.hasNext()) {
                    a02.add(fVar.d() + '-' + ((String) it.next()));
                }
            } else {
                a02 = C7714v.a0(fVar.d());
            }
            C7714v.p((Iterable) a02, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class<?> i(N n11) {
        Y i11;
        Class<?> j11 = j(n11.H0().p());
        if (j11 == null) {
            return null;
        }
        if (H0.g(n11) && ((i11 = Vd.k.i(n11)) == null || H0.g(i11) || qd.m.g0(i11))) {
            return null;
        }
        return j11;
    }

    public static final Class<?> j(InterfaceC9845k interfaceC9845k) {
        if (!(interfaceC9845k instanceof InterfaceC9839e) || !Vd.k.b(interfaceC9845k)) {
            return null;
        }
        InterfaceC9839e interfaceC9839e = (InterfaceC9839e) interfaceC9845k;
        Class<?> l11 = g1.l(interfaceC9839e);
        if (l11 != null) {
            return l11;
        }
        throw new V0("Class object for the class " + interfaceC9839e.getName() + " cannot be found (classId=" + Zd.e.f((InterfaceC9842h) interfaceC9845k) + ')');
    }
}
