package nd;

import N3.C3660k;
import S0.InterfaceC3967k;
import ae.C5000b;
import fd.InterfaceC6498a;
import fd.InterfaceC6499b;
import fd.InterfaceC6500c;
import fd.InterfaceC6501d;
import fd.InterfaceC6502e;
import fd.InterfaceC6503f;
import fd.InterfaceC6504g;
import fd.InterfaceC6505h;
import fd.InterfaceC6506i;
import fd.InterfaceC6507j;
import fd.InterfaceC6508k;
import fd.InterfaceC6509l;
import fd.InterfaceC6510m;
import fd.InterfaceC6511n;
import fd.InterfaceC6512o;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7724f;
import kotlin.jvm.internal.InterfaceC7733o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7748h;
import nd.AbstractC8552n;
import nd.X0;
import od.C8693a;
import od.i;
import od.m;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarBehavior;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarState;
import ru.ozon.app.android.videomoleculecompose.slots.timebar.SlimTimeBarStyle;
import td.InterfaceC9834Z;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9843i;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;

/* renamed from: nd.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8545j0 extends AbstractC8504A<Object> implements InterfaceC7733o<Object>, kotlin.reflect.h<Object>, Function0, Function1, InterfaceC6498a, InterfaceC6499b, InterfaceC6500c, InterfaceC6501d, InterfaceC6502e, InterfaceC6503f, InterfaceC6504g, InterfaceC6505h, InterfaceC6506i, InterfaceC6507j, Function2, InterfaceC6508k, InterfaceC6509l, InterfaceC6510m, InterfaceC6511n, InterfaceC6512o, fd.p, fd.q, fd.r, fd.s, fd.t {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f76989m = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(C8545j0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AbstractC8537f0 f76990g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final String f76991h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f76992i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final X0.a f76993j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final Object f76994k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final Object f76995l;

    private C8545j0(AbstractC8537f0 abstractC8537f0, String str, String str2, InterfaceC9857w interfaceC9857w, Object obj) {
        this.f76990g = abstractC8537f0;
        this.f76991h = str2;
        this.f76992i = obj;
        this.f76993j = X0.a(interfaceC9857w, new C8539g0(this, str));
        Sc.n nVar = Sc.n.PUBLICATION;
        this.f76994k = Sc.k.a(nVar, new C8541h0(this));
        this.f76995l = Sc.k.a(nVar, new C8543i0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static InterfaceC9857w C(C8545j0 c8545j0, String name) {
        List w11;
        ArrayList arrayList;
        String a11;
        AbstractC8537f0 abstractC8537f0 = c8545j0.f76990g;
        abstractC8537f0.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String signature = c8545j0.f76991h;
        Intrinsics.checkNotNullParameter(signature, "signature");
        if (Intrinsics.d(name, "<init>")) {
            w11 = C7714v.U0(abstractC8537f0.t());
            arrayList = new ArrayList();
            for (Object obj : w11) {
                InterfaceC9844j interfaceC9844j = (InterfaceC9844j) obj;
                if (interfaceC9844j.k0()) {
                    InterfaceC9843i d11 = interfaceC9844j.d();
                    Intrinsics.checkNotNullExpressionValue(d11, "getContainingDeclaration(...)");
                    if (Vd.k.d(d11)) {
                        String a12 = c1.d(interfaceC9844j).a();
                        if (!kotlin.text.h.e0(a12, "constructor-impl", false) || !kotlin.text.h.A(a12, ")V", false)) {
                            throw new IllegalArgumentException(("Invalid signature of " + interfaceC9844j + ": " + a12).toString());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(kotlin.text.h.U(a12, "V"));
                        InterfaceC9843i d12 = interfaceC9844j.d();
                        Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
                        Intrinsics.checkNotNullParameter(d12, "<this>");
                        Sd.b f7 = Zd.e.f(d12);
                        Intrinsics.f(f7);
                        sb2.append(Rd.b.b(f7.b()));
                        a11 = sb2.toString();
                        if (!Intrinsics.d(a11, signature)) {
                            arrayList.add(obj);
                        }
                    }
                }
                a11 = c1.d(interfaceC9844j).a();
                if (!Intrinsics.d(a11, signature)) {
                }
            }
        } else {
            Sd.f f11 = Sd.f.f(name);
            Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
            w11 = abstractC8537f0.w(f11);
            arrayList = new ArrayList();
            for (Object obj2 : w11) {
                if (Intrinsics.d(c1.d((InterfaceC9857w) obj2).a(), signature)) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList.size() == 1) {
            return (InterfaceC9857w) C7714v.B0(arrayList);
        }
        String V11 = C7714v.V(w11, "\n", null, null, C8533d0.f76960a, 30);
        StringBuilder d13 = C3660k.d("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
        d13.append(abstractC8537f0);
        d13.append(':');
        d13.append(V11.length() == 0 ? " no members found" : "\n".concat(V11));
        throw new V0(d13.toString());
    }

    static od.h D(C8545j0 c8545j0) {
        Object b11;
        od.i<Constructor<?>> G11;
        od.i<Constructor<?>> bVar;
        int i11 = c1.f76958b;
        AbstractC8552n d11 = c1.d(c8545j0.t());
        boolean z11 = d11 instanceof AbstractC8552n.d;
        AbstractC8537f0 abstractC8537f0 = c8545j0.f76990g;
        if (z11) {
            if (c8545j0.x()) {
                Class<?> c11 = abstractC8537f0.c();
                List<kotlin.reflect.l> parameters = c8545j0.getParameters();
                ArrayList arrayList = new ArrayList(C7714v.z(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((kotlin.reflect.l) it.next()).getName();
                    Intrinsics.f(name);
                    arrayList.add(name);
                }
                return new C8693a(c11, arrayList, C8693a.EnumC1318a.POSITIONAL_CALL, C8693a.b.KOTLIN);
            }
            b11 = abstractC8537f0.k(((AbstractC8552n.d) d11).b());
        } else if (d11 instanceof AbstractC8552n.e) {
            InterfaceC9857w t2 = c8545j0.t();
            InterfaceC9845k d12 = t2.d();
            Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
            if (Vd.k.d(d12) && (t2 instanceof InterfaceC9844j) && ((InterfaceC9844j) t2).k0()) {
                InterfaceC9857w t11 = c8545j0.t();
                String b12 = ((AbstractC8552n.e) d11).b();
                List<td.p0> f7 = c8545j0.t().f();
                Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                return new m.b(t11, abstractC8537f0, b12, f7);
            }
            AbstractC8552n.e eVar = (AbstractC8552n.e) d11;
            b11 = abstractC8537f0.q(eVar.c(), eVar.b());
        } else if (d11 instanceof AbstractC8552n.c) {
            b11 = ((AbstractC8552n.c) d11).b();
            Intrinsics.g(b11, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(d11 instanceof AbstractC8552n.b)) {
                if (!(d11 instanceof AbstractC8552n.a)) {
                    throw new Sc.o();
                }
                List<Method> b13 = ((AbstractC8552n.a) d11).b();
                Class<?> c12 = abstractC8537f0.c();
                List<Method> list = b13;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new C8693a(c12, arrayList2, C8693a.EnumC1318a.POSITIONAL_CALL, C8693a.b.JAVA, b13);
            }
            b11 = ((AbstractC8552n.b) d11).b();
            Intrinsics.g(b11, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (b11 instanceof Constructor) {
            G11 = c8545j0.F((Constructor) b11, c8545j0.t(), false);
        } else {
            if (!(b11 instanceof Method)) {
                throw new V0("Could not compute caller for function: " + c8545j0.t() + " (member = " + b11 + ')');
            }
            Method method = (Method) b11;
            if (!Modifier.isStatic(method.getModifiers())) {
                bVar = c8545j0.z() ? new i.g.a(method, od.n.c(c8545j0.f76992i, c8545j0.t())) : new i.g.e(method);
            } else if (c8545j0.t().getAnnotations().j(g1.h()) != null) {
                bVar = c8545j0.z() ? new i.g.b(method) : new i.g.f(method);
            } else {
                G11 = c8545j0.G(method);
            }
            G11 = bVar;
        }
        return od.n.d(G11, c8545j0.t(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.reflect.Member] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static od.h E(C8545j0 c8545j0) {
        GenericDeclaration genericDeclaration;
        od.i<Constructor<?>> iVar;
        InterfaceC9857w interfaceC9857w;
        Object obj;
        int i11 = c1.f76958b;
        AbstractC8552n d11 = c1.d(c8545j0.t());
        boolean z11 = d11 instanceof AbstractC8552n.e;
        AbstractC8537f0 abstractC8537f0 = c8545j0.f76990g;
        if (z11) {
            InterfaceC9857w t2 = c8545j0.t();
            InterfaceC9845k d12 = t2.d();
            Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
            if (Vd.k.d(d12) && (t2 instanceof InterfaceC9844j) && ((InterfaceC9844j) t2).k0()) {
                throw new V0(c8545j0.t().d() + " cannot have default arguments");
            }
            InterfaceC9857w t11 = c8545j0.t();
            List<td.p0> f7 = t11.f();
            Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
            List<td.p0> list = f7;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((td.p0) it.next()).R()) {
                        break;
                    }
                }
            }
            InterfaceC9845k d13 = t11.d();
            Intrinsics.checkNotNullExpressionValue(d13, "getContainingDeclaration(...)");
            if (Vd.k.f(d13)) {
                ?? b11 = c8545j0.o().b();
                Intrinsics.f(b11);
                if (Modifier.isStatic(b11.getModifiers())) {
                    Iterator it2 = Zd.e.m(t11).iterator();
                    loop0: while (true) {
                        C7748h.a aVar = (C7748h.a) it2;
                        if (!aVar.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = aVar.next();
                        List<td.p0> f11 = ((InterfaceC9836b) obj).f();
                        Intrinsics.checkNotNullExpressionValue(f11, "getValueParameters(...)");
                        List<td.p0> list2 = f11;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                if (((td.p0) it3.next()).R()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (obj instanceof InterfaceC9857w) {
                        interfaceC9857w = (InterfaceC9857w) obj;
                        if (interfaceC9857w == null) {
                            AbstractC8552n.e eVar = (AbstractC8552n.e) c1.d(interfaceC9857w);
                            genericDeclaration = abstractC8537f0.p(eVar.c(), eVar.b(), true);
                        } else {
                            AbstractC8552n.e eVar2 = (AbstractC8552n.e) d11;
                            String c11 = eVar2.c();
                            String b12 = eVar2.b();
                            Intrinsics.f(c8545j0.o().b());
                            genericDeclaration = abstractC8537f0.p(c11, b12, !Modifier.isStatic(r5.getModifiers()));
                        }
                    }
                }
            }
            interfaceC9857w = null;
            if (interfaceC9857w == null) {
            }
        } else if (d11 instanceof AbstractC8552n.d) {
            if (c8545j0.x()) {
                Class<?> c12 = abstractC8537f0.c();
                List<kotlin.reflect.l> parameters = c8545j0.getParameters();
                ArrayList arrayList = new ArrayList(C7714v.z(parameters, 10));
                Iterator<T> it4 = parameters.iterator();
                while (it4.hasNext()) {
                    String name = ((kotlin.reflect.l) it4.next()).getName();
                    Intrinsics.f(name);
                    arrayList.add(name);
                }
                return new C8693a(c12, arrayList, C8693a.EnumC1318a.CALL_BY_NAME, C8693a.b.KOTLIN);
            }
            genericDeclaration = abstractC8537f0.o(((AbstractC8552n.d) d11).b());
        } else {
            if (d11 instanceof AbstractC8552n.a) {
                List<Method> b13 = ((AbstractC8552n.a) d11).b();
                Class<?> c13 = abstractC8537f0.c();
                List<Method> list3 = b13;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((Method) it5.next()).getName());
                }
                return new C8693a(c13, arrayList2, C8693a.EnumC1318a.CALL_BY_NAME, C8693a.b.JAVA, b13);
            }
            genericDeclaration = null;
        }
        if (genericDeclaration instanceof Constructor) {
            iVar = c8545j0.F((Constructor) genericDeclaration, c8545j0.t(), true);
        } else if (genericDeclaration instanceof Method) {
            if (c8545j0.t().getAnnotations().j(g1.h()) != null) {
                InterfaceC9845k d14 = c8545j0.t().d();
                Intrinsics.g(d14, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((InterfaceC9839e) d14).j0()) {
                    Method method = (Method) genericDeclaration;
                    iVar = c8545j0.z() ? new i.g.b(method) : new i.g.f(method);
                }
            }
            iVar = c8545j0.G((Method) genericDeclaration);
        } else {
            iVar = null;
        }
        if (iVar != null) {
            return od.n.d(iVar, c8545j0.t(), true);
        }
        return null;
    }

    private final od.i<Constructor<?>> F(Constructor<?> constructor, InterfaceC9857w interfaceC9857w, boolean z11) {
        Object obj = this.f76992i;
        if (!z11 && C5000b.b(interfaceC9857w)) {
            return z() ? new i.a(constructor, od.n.c(obj, t())) : new i.b(constructor);
        }
        if (z()) {
            return new i.c(constructor, od.n.c(obj, t()));
        }
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Class<?> declaringClass = constructor.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        Class<?> declaringClass2 = constructor.getDeclaringClass();
        Class<?> declaringClass3 = declaringClass2.getDeclaringClass();
        if (declaringClass3 == null || Modifier.isStatic(declaringClass2.getModifiers())) {
            declaringClass3 = null;
        }
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        return new i.d(constructor, declaringClass, declaringClass3, genericParameterTypes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r1.isInterface() == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final i.g G(Method method) {
        je.N type;
        if (!z()) {
            return new i.g.C1320g(method);
        }
        InterfaceC9834Z c02 = t().c0();
        Object obj = this.f76992i;
        if (c02 != null && (type = c02.getType()) != null && Vd.k.c(type)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) C7705l.F(parameterTypes);
            if (cls != null) {
            }
        }
        obj = od.n.c(obj, t());
        return new i.g.c(method, obj);
    }

    @Override // nd.AbstractC8504A
    @NotNull
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final InterfaceC9857w t() {
        kotlin.reflect.m<Object> mVar = f76989m[0];
        Object invoke = this.f76993j.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        return (InterfaceC9857w) invoke;
    }

    public final boolean equals(Object obj) {
        C8545j0 b11 = g1.b(obj);
        return b11 != null && Intrinsics.d(this.f76990g, b11.f76990g) && Intrinsics.d(getName(), b11.getName()) && Intrinsics.d(this.f76991h, b11.f76991h) && Intrinsics.d(this.f76992i, b11.f76992i);
    }

    @Override // kotlin.jvm.internal.InterfaceC7733o
    public final int getArity() {
        return od.j.a(o());
    }

    @Override // kotlin.reflect.c
    @NotNull
    public final String getName() {
        String b11 = t().getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        return b11;
    }

    @Override // fd.r
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return C8548l.h(this, obj, obj2, obj3, obj4, obj5, obj6, serializable);
    }

    public final int hashCode() {
        return this.f76991h.hashCode() + ((getName().hashCode() + (this.f76990g.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return C8548l.a(this);
    }

    @Override // kotlin.reflect.h
    public final boolean isExternal() {
        return t().isExternal();
    }

    @Override // kotlin.reflect.h
    public final boolean isInfix() {
        return t().isInfix();
    }

    @Override // kotlin.reflect.h
    public final boolean isInline() {
        return t().isInline();
    }

    @Override // kotlin.reflect.h
    public final boolean isOperator() {
        return t().isOperator();
    }

    @Override // kotlin.reflect.c
    public final boolean isSuspend() {
        return t().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8504A
    @NotNull
    public final od.h<?> o() {
        return (od.h) this.f76994k.getValue();
    }

    @Override // nd.AbstractC8504A
    @NotNull
    public final AbstractC8537f0 q() {
        return this.f76990g;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // nd.AbstractC8504A
    public final od.h<?> r() {
        return (od.h) this.f76995l.getValue();
    }

    @NotNull
    public final String toString() {
        int i11 = b1.f76953b;
        return b1.b(t());
    }

    @Override // nd.AbstractC8504A
    public final boolean z() {
        return this.f76992i != AbstractC7724f.NO_RECEIVER;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return C8548l.b(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return C8548l.c(this, obj, obj2);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return C8548l.d(this, obj, obj2, obj3);
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return C8548l.e(this, obj, obj2, obj3, obj4);
    }

    @Override // fd.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return C8548l.f(this, obj, obj2, obj3, obj4, (Serializable) obj5);
    }

    @Override // fd.q
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return C8548l.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8545j0(@NotNull AbstractC8537f0 container, @NotNull String name, @NotNull String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    @Override // fd.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return C8548l.i(this, (SlimTimeBarState) obj, (androidx.compose.ui.e) obj2, (SlimTimeBarStyle) obj3, (SlimTimeBarBehavior) obj4, (Function1) obj5, (Function1) obj6, (Function2) obj7, (InterfaceC3967k) obj8, (Integer) obj9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8545j0(@NotNull AbstractC8537f0 container, @NotNull InterfaceC9857w descriptor) {
        this(container, r3, c1.d(descriptor).a(), descriptor, AbstractC7724f.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String b11 = descriptor.getName().b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
    }
}
