package nd;

import N3.C3660k;
import ce.o;
import g.C6594f;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC7726h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import nd.X0;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9853s;
import td.C9852r;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import wd.C10528n;
import zd.C11104f;

/* renamed from: nd.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8537f0 implements InterfaceC7726h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Regex f76965a = new Regex("<v#(\\d+)>");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76966b = 0;

    /* renamed from: nd.f0$a */
    public abstract class a {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f76967b = {kotlin.jvm.internal.N.h(new kotlin.jvm.internal.E(kotlin.jvm.internal.N.b(a.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final X0.a f76968a;

        public a(AbstractC8537f0 abstractC8537f0) {
            this.f76968a = X0.a(null, new C8535e0(abstractC8537f0));
        }

        @NotNull
        public final yd.j a() {
            kotlin.reflect.m<Object> mVar = f76967b[0];
            Object invoke = this.f76968a.invoke();
            Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
            return (yd.j) invoke;
        }
    }

    /* renamed from: nd.f0$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f76969a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<?> f76970b;

        public b(@NotNull ArrayList parameters, Class cls) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f76969a = parameters;
            this.f76970b = cls;
        }

        @NotNull
        public final List<Class<?>> a() {
            return this.f76969a;
        }

        public final Class<?> b() {
            return this.f76970b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: nd.f0$c */
    protected static final class c {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c DECLARED;
        public static final c INHERITED;

        static {
            c cVar = new c("DECLARED", 0);
            DECLARED = cVar;
            c cVar2 = new c("INHERITED", 1);
            INHERITED = cVar2;
            c[] cVarArr = {cVar, cVar2};
            $VALUES = cVarArr;
            $ENTRIES = Xc.b.a(cVarArr);
        }

        private c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    /* renamed from: nd.f0$d */
    public static final class d extends C8544j {
        @Override // nd.C8544j, td.InterfaceC9847m
        public final Object b(C10528n descriptor, Object obj) {
            Unit data = (Unit) obj;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(data, "data");
            throw new IllegalStateException("No constructors should appear here: " + descriptor);
        }
    }

    private static Method E(Class cls, String str, Class[] clsArr, Class cls2, boolean z11) {
        Class<?> a11;
        Method E11;
        if (z11) {
            clsArr[0] = cls;
        }
        Method I11 = I(cls, str, clsArr, cls2);
        if (I11 != null) {
            return I11;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (E11 = E(superclass, str, clsArr, cls2, z11)) != null) {
            return E11;
        }
        Iterator a12 = C7721c.a(cls.getInterfaces());
        while (a12.hasNext()) {
            Class cls3 = (Class) a12.next();
            Intrinsics.f(cls3);
            Method E12 = E(cls3, str, clsArr, cls2, z11);
            if (E12 != null) {
                return E12;
            }
            if (z11 && (a11 = yd.e.a(C11104f.f(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method I12 = I(a11, str, clsArr, cls2);
                if (I12 != null) {
                    return I12;
                }
            }
        }
        return null;
    }

    private final b F(String str, boolean z11) {
        int I11;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            int i12 = i11;
            while (str.charAt(i12) == '[') {
                i12++;
            }
            char charAt = str.charAt(i12);
            if (kotlin.text.h.u("VZCBSIFJD", charAt)) {
                I11 = i12 + 1;
            } else {
                if (charAt != 'L') {
                    throw new V0("Unknown type prefix in the method signature: ".concat(str));
                }
                I11 = kotlin.text.h.I(';', i11, 4, str) + 1;
            }
            arrayList.add(G(i11, I11, str));
            i11 = I11;
        }
        return new b(arrayList, z11 ? G(i11 + 1, str.length(), str) : null);
    }

    private final Class G(int i11, int i12, String str) {
        char charAt = str.charAt(i11);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader f7 = C11104f.f(c());
            String substring = str.substring(i11 + 1, i12 - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Class<?> loadClass = f7.loadClass(kotlin.text.h.Y(substring, '/', '.'));
            Intrinsics.checkNotNullExpressionValue(loadClass, "loadClass(...)");
            return loadClass;
        }
        if (charAt == 'S') {
            return Short.TYPE;
        }
        if (charAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (charAt == 'I') {
            return Integer.TYPE;
        }
        if (charAt == 'J') {
            return Long.TYPE;
        }
        if (charAt == 'Z') {
            return Boolean.TYPE;
        }
        if (charAt == '[') {
            Class G11 = G(i11 + 1, i12, str);
            int i13 = g1.f76975b;
            Intrinsics.checkNotNullParameter(G11, "<this>");
            return Array.newInstance((Class<?>) G11, 0).getClass();
        }
        switch (charAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new V0("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    private static Constructor H(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static Method I(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.d(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.d(method.getName(), str) && Intrinsics.d(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static void i(ArrayList arrayList, List list, boolean z11) {
        Class cls;
        cls = DefaultConstructorMarker.class;
        if (Intrinsics.d(C7714v.Z(list), cls)) {
            list = list.subList(0, list.size() - 1);
        }
        arrayList.addAll(list);
        int size = (list.size() + 31) / 32;
        for (int i11 = 0; i11 < size; i11++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z11 ? DefaultConstructorMarker.class : Object.class);
    }

    @NotNull
    protected Class<?> C() {
        Class<?> g10 = C11104f.g(c());
        return g10 == null ? c() : g10;
    }

    @NotNull
    public abstract Collection<InterfaceC9831W> D(@NotNull Sd.f fVar);

    public final Constructor<?> k(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        return H(c(), F(desc, false).a());
    }

    public final Constructor<?> o(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c11 = c();
        ArrayList arrayList = new ArrayList();
        i(arrayList, F(desc, false).a(), true);
        Unit unit = Unit.f71690a;
        return H(c11, arrayList);
    }

    public final Method p(@NotNull String name, @NotNull String desc, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.d(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            arrayList.add(c());
        }
        b F11 = F(desc, true);
        i(arrayList, F11.a(), false);
        Class<?> C11 = C();
        String e11 = U7.d.e(name, "$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class<?> b11 = F11.b();
        Intrinsics.f(b11);
        return E(C11, e11, clsArr, b11, z11);
    }

    public final Method q(@NotNull String name, @NotNull String desc) {
        Method E11;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.d(name, "<init>")) {
            return null;
        }
        b F11 = F(desc, true);
        Class[] clsArr = (Class[]) F11.a().toArray(new Class[0]);
        Class<?> b11 = F11.b();
        Intrinsics.f(b11);
        Method E12 = E(C(), name, clsArr, b11, false);
        if (E12 != null) {
            return E12;
        }
        if (!C().isInterface() || (E11 = E(Object.class, name, clsArr, b11, false)) == null) {
            return null;
        }
        return E11;
    }

    @NotNull
    public final InterfaceC9831W r(@NotNull String name, @NotNull String signature) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        MatchResult e11 = f76965a.e(signature);
        if (e11 != null) {
            String str = e11.a().a().c().get(1);
            InterfaceC9831W x11 = x(Integer.parseInt(str));
            if (x11 != null) {
                return x11;
            }
            StringBuilder b11 = C6594f.b("Local property #", str, " not found in ");
            b11.append(c());
            throw new V0(b11.toString());
        }
        Sd.f f7 = Sd.f.f(name);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        Collection<InterfaceC9831W> D11 = D(f7);
        ArrayList arrayList = new ArrayList();
        for (Object obj : D11) {
            if (Intrinsics.d(c1.c((InterfaceC9831W) obj).a(), signature)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder d11 = C3660k.d("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
            d11.append(this);
            throw new V0(d11.toString());
        }
        if (arrayList.size() == 1) {
            return (InterfaceC9831W) C7714v.B0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9853s visibility = ((InterfaceC9831W) next).getVisibility();
            Object obj2 = linkedHashMap.get(visibility);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(visibility, obj2);
            }
            ((List) obj2).add(next);
        }
        C8529b0 comparator = new C8529b0();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        Collection values = treeMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        List list = (List) C7714v.W(values);
        if (list.size() == 1) {
            return (InterfaceC9831W) C7714v.K(list);
        }
        Sd.f f11 = Sd.f.f(name);
        Intrinsics.checkNotNullExpressionValue(f11, "identifier(...)");
        String V11 = C7714v.V(D(f11), "\n", null, null, C8531c0.f76956a, 30);
        StringBuilder d12 = C3660k.d("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
        d12.append(this);
        d12.append(':');
        d12.append(V11.length() == 0 ? " no members found" : "\n".concat(V11));
        throw new V0(d12.toString());
    }

    @NotNull
    public abstract Collection<InterfaceC9844j> t();

    @NotNull
    public abstract Collection<InterfaceC9857w> w(@NotNull Sd.f fVar);

    public abstract InterfaceC9831W x(int i11);

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0020 A[SYNTHETIC] */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Collection<AbstractC8504A<?>> z(@NotNull ce.l scope, @NotNull c belonginess) {
        AbstractC8504A abstractC8504A;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        d dVar = new d(this);
        Collection<InterfaceC9845k> a11 = o.a.a(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9845k interfaceC9845k : a11) {
            if (interfaceC9845k instanceof InterfaceC9836b) {
                InterfaceC9836b member = (InterfaceC9836b) interfaceC9845k;
                if (!Intrinsics.d(member.getVisibility(), C9852r.f99406h)) {
                    belonginess.getClass();
                    Intrinsics.checkNotNullParameter(member, "member");
                    InterfaceC9836b.a kind = member.getKind();
                    kind.getClass();
                    if ((kind != InterfaceC9836b.a.FAKE_OVERRIDE) == (belonginess == c.DECLARED)) {
                        abstractC8504A = (AbstractC8504A) interfaceC9845k.X(dVar, Unit.f71690a);
                        if (abstractC8504A == null) {
                            arrayList.add(abstractC8504A);
                        }
                    }
                }
            }
            abstractC8504A = null;
            if (abstractC8504A == null) {
            }
        }
        return C7714v.U0(arrayList);
    }
}
