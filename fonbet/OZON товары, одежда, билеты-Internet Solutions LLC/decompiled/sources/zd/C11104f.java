package zd;

import Sc.InterfaceC4003e;
import ed.C6345a;
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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;

/* renamed from: zd.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11104f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final List<kotlin.reflect.d<? extends Object>> f108827a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> f108828b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> f108829c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final Map<Class<? extends InterfaceC4003e<?>>, Integer> f108830d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f108831e = 0;

    static {
        int i11 = 0;
        List<kotlin.reflect.d<? extends Object>> b02 = C7714v.b0(N.b(Boolean.TYPE), N.b(Byte.TYPE), N.b(Character.TYPE), N.b(Double.TYPE), N.b(Float.TYPE), N.b(Integer.TYPE), N.b(Long.TYPE), N.b(Short.TYPE));
        f108827a = b02;
        List<kotlin.reflect.d<? extends Object>> list = b02;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.d dVar = (kotlin.reflect.d) it.next();
            arrayList.add(new Pair(C6345a.c(dVar), C6345a.d(dVar)));
        }
        f108828b = U.s(arrayList);
        List<kotlin.reflect.d<? extends Object>> list2 = f108827a;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) it2.next();
            arrayList2.add(new Pair(C6345a.d(dVar2), C6345a.c(dVar2)));
        }
        f108829c = U.s(arrayList2);
        List b03 = C7714v.b0(Function0.class, Function1.class, Function2.class, InterfaceC6511n.class, InterfaceC6512o.class, fd.p.class, fd.q.class, fd.r.class, fd.s.class, fd.t.class, InterfaceC6498a.class, InterfaceC6499b.class, InterfaceC6500c.class, InterfaceC6501d.class, InterfaceC6502e.class, InterfaceC6503f.class, InterfaceC6504g.class, InterfaceC6505h.class, InterfaceC6506i.class, InterfaceC6507j.class, InterfaceC6508k.class, InterfaceC6509l.class, InterfaceC6510m.class);
        ArrayList arrayList3 = new ArrayList(C7714v.z(b03, 10));
        for (Object obj : b03) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i11)));
            i11 = i12;
        }
        f108830d = U.s(arrayList3);
    }

    @NotNull
    public static final Sd.b a(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(U7.m.a(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(U7.m.a(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null) {
                    Sd.b a11 = a(declaringClass);
                    Sd.f f7 = Sd.f.f(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
                    return a11.d(f7);
                }
                Sd.c topLevelFqName = new Sd.c(cls.getName());
                Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                Sd.c e11 = topLevelFqName.e();
                return new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
            }
        }
        Sd.c cVar = new Sd.c(cls.getName());
        Sd.c e12 = cVar.e();
        Intrinsics.checkNotNullExpressionValue(e12, "parent(...)");
        Sd.c k11 = Sd.c.k(cVar.g());
        Intrinsics.checkNotNullExpressionValue(k11, "topLevel(...)");
        return new Sd.b(e12, k11, true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @NotNull
    public static final String b(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return kotlin.text.h.Y(name, '.', '/');
            }
            StringBuilder sb2 = new StringBuilder("L");
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb2.append(kotlin.text.h.Y(name2, '.', '/'));
            sb2.append(';');
            return sb2.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(U7.m.a(cls, "Unsupported primitive type: "));
    }

    public static final Integer c(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f108830d.get(cls);
    }

    @NotNull
    public static final List<Type> d(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return kotlin.collections.K.f71697a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.l.C(kotlin.sequences.l.m(kotlin.sequences.l.q(type, C11102d.f108825a), C11103e.f108826a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return C7705l.f0(actualTypeArguments);
    }

    public static final Class<?> e(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f108828b.get(cls);
    }

    @NotNull
    public static final ClassLoader f(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> g(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return f108829c.get(cls);
    }

    public static final boolean h(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
