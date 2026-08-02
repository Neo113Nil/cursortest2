package kotlin.jvm.internal;

import Sc.InterfaceC4003e;
import ed.C6345a;
import ed.C6347c;
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
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/jvm/internal/i;", "Lkotlin/reflect/d;", "", "Lkotlin/jvm/internal/h;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7727i implements kotlin.reflect.d<Object>, InterfaceC7726h {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Class<? extends InterfaceC4003e<?>>, Integer> f71807c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashMap<String, String> f71808d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f71809e;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f71810a;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R,\u0010\u0006\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R0\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR0\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR0\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lkotlin/jvm/internal/i$a;", "", "", "Ljava/lang/Class;", "LSc/e;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List b02 = C7714v.b0(Function0.class, Function1.class, Function2.class, InterfaceC6511n.class, InterfaceC6512o.class, fd.p.class, fd.q.class, fd.r.class, fd.s.class, fd.t.class, InterfaceC6498a.class, InterfaceC6499b.class, InterfaceC6500c.class, InterfaceC6501d.class, InterfaceC6502e.class, InterfaceC6503f.class, InterfaceC6504g.class, InterfaceC6505h.class, InterfaceC6506i.class, InterfaceC6507j.class, InterfaceC6508k.class, InterfaceC6509l.class, InterfaceC6510m.class);
        ArrayList arrayList = new ArrayList(C7714v.z(b02, 10));
        int i11 = 0;
        for (Object obj : b02) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new Pair((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f71807c = kotlin.collections.U.s(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.f(str);
            sb2.append(kotlin.text.h.j0('.', str, str));
            sb2.append("CompanionObject");
            Pair pair = new Pair(sb2.toString(), str.concat(".Companion"));
            hashMap3.put(pair.e(), pair.f());
        }
        for (Map.Entry<Class<? extends InterfaceC4003e<?>>, Integer> entry : f71807c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f71808d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.U.h(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, kotlin.text.h.j0('.', str2, str2));
        }
        f71809e = linkedHashMap;
    }

    public C7727i(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f71810a = jClass;
    }

    private static void h() {
        throw new C6347c();
    }

    @Override // kotlin.reflect.d
    public final boolean A(Object obj) {
        INSTANCE.getClass();
        Class<?> jClass = this.f71810a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map<Class<? extends InterfaceC4003e<?>>, Integer> map = f71807c;
        Intrinsics.g(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(jClass);
        if (num != null) {
            return U.h(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNullParameter(jClass, "<this>");
            jClass = C6345a.c(N.b(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // kotlin.reflect.d
    public final String B() {
        String str;
        INSTANCE.getClass();
        Class<?> jClass = this.f71810a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f71809e;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String i02 = kotlin.text.h.i0(simpleName, enclosingMethod.getName() + '$');
            if (i02 != null) {
                return i02;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return kotlin.text.h.h0('$', simpleName, simpleName);
        }
        return kotlin.text.h.i0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // kotlin.jvm.internal.InterfaceC7726h
    @NotNull
    public final Class<?> c() {
        return this.f71810a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7727i) && C6345a.c(this).equals(C6345a.c((kotlin.reflect.d) obj));
    }

    @Override // kotlin.reflect.d
    public final boolean g() {
        h();
        throw null;
    }

    @Override // kotlin.reflect.b
    @NotNull
    public final List<Annotation> getAnnotations() {
        h();
        throw null;
    }

    @Override // kotlin.reflect.d
    public final int hashCode() {
        return C6345a.c(this).hashCode();
    }

    @Override // kotlin.reflect.d
    public final boolean isAbstract() {
        h();
        throw null;
    }

    @Override // kotlin.reflect.d
    @NotNull
    public final List<kotlin.reflect.d<? extends Object>> m() {
        h();
        throw null;
    }

    @Override // kotlin.reflect.d
    public final boolean n() {
        h();
        throw null;
    }

    @Override // kotlin.reflect.d
    public final boolean s() {
        h();
        throw null;
    }

    @NotNull
    public final String toString() {
        return this.f71810a.toString() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.reflect.d
    public final String u() {
        String str;
        INSTANCE.getClass();
        Class<?> jClass = this.f71810a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String str3 = (String) f71808d.get(jClass.getName());
            return str3 == null ? jClass.getCanonicalName() : str3;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) f71808d.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    @Override // kotlin.reflect.d
    public final Object v() {
        h();
        throw null;
    }
}
