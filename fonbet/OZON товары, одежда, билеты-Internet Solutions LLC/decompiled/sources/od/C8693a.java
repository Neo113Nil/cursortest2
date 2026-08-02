package od;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.C6345a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import od.h;
import org.jetbrains.annotations.NotNull;
import zd.C11104f;

/* renamed from: od.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C8693a implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Class<?> f78028a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f78029b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC1318a f78030c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Method> f78031d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f78032e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f78033f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayList f78034g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: od.a$a, reason: collision with other inner class name */
    public static final class EnumC1318a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC1318a[] $VALUES;
        public static final EnumC1318a CALL_BY_NAME;
        public static final EnumC1318a POSITIONAL_CALL;

        static {
            EnumC1318a enumC1318a = new EnumC1318a("CALL_BY_NAME", 0);
            CALL_BY_NAME = enumC1318a;
            EnumC1318a enumC1318a2 = new EnumC1318a("POSITIONAL_CALL", 1);
            POSITIONAL_CALL = enumC1318a2;
            EnumC1318a[] enumC1318aArr = {enumC1318a, enumC1318a2};
            $VALUES = enumC1318aArr;
            $ENTRIES = Xc.b.a(enumC1318aArr);
        }

        private EnumC1318a() {
            throw null;
        }

        public static EnumC1318a valueOf(String str) {
            return (EnumC1318a) Enum.valueOf(EnumC1318a.class, str);
        }

        public static EnumC1318a[] values() {
            return (EnumC1318a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: od.a$b */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b JAVA;
        public static final b KOTLIN;

        static {
            b bVar = new b("JAVA", 0);
            JAVA = bVar;
            b bVar2 = new b("KOTLIN", 1);
            KOTLIN = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public C8693a(@NotNull Class jClass, @NotNull ArrayList parameterNames, @NotNull EnumC1318a callMode, @NotNull b origin, @NotNull List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f78028a = jClass;
        this.f78029b = parameterNames;
        this.f78030c = callMode;
        this.f78031d = methods;
        List list = methods;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f78032e = arrayList;
        List<Method> list2 = this.f78031d;
        ArrayList arrayList2 = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.f(returnType);
            Class<?> g10 = C11104f.g(returnType);
            if (g10 != null) {
                returnType = g10;
            }
            arrayList2.add(returnType);
        }
        this.f78033f = arrayList2;
        List<Method> list3 = this.f78031d;
        ArrayList arrayList3 = new ArrayList(C7714v.z(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f78034g = arrayList3;
        if (this.f78030c == EnumC1318a.POSITIONAL_CALL && origin == b.JAVA && !C7714v.k0(this.f78029b, AppMeasurementSdk.ConditionalUserProperty.VALUE).isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // od.h
    @NotNull
    public final List<Type> a() {
        return this.f78032e;
    }

    @Override // od.h
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        if (r11.isInstance(r8) != false) goto L30;
     */
    @Override // od.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call(@NotNull Object[] args) {
        kotlin.reflect.d b11;
        String u11;
        Intrinsics.checkNotNullParameter(args, "args");
        h.a.a(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = this.f78029b;
            if (i11 >= length) {
                return f.a(this.f78028a, U.s(C7714v.b1(arrayList2, arrayList)), this.f78031d);
            }
            Object obj = args[i11];
            int i13 = i12 + 1;
            ArrayList arrayList3 = this.f78033f;
            if (obj == null && this.f78030c == EnumC1318a.CALL_BY_NAME) {
                obj = this.f78034g.get(i12);
            } else {
                Class cls = (Class) arrayList3.get(i12);
                if (!(obj instanceof Class)) {
                    if (obj instanceof kotlin.reflect.d) {
                        obj = C6345a.b((kotlin.reflect.d) obj);
                    } else if (obj instanceof Object[]) {
                        Object[] objArr = (Object[]) obj;
                        if (!(objArr instanceof Class[])) {
                            if (objArr instanceof kotlin.reflect.d[]) {
                                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                                kotlin.reflect.d[] dVarArr = (kotlin.reflect.d[]) obj;
                                ArrayList arrayList4 = new ArrayList(dVarArr.length);
                                for (kotlin.reflect.d dVar : dVarArr) {
                                    arrayList4.add(C6345a.b(dVar));
                                }
                                obj = arrayList4.toArray(new Class[0]);
                            } else {
                                obj = objArr;
                            }
                        }
                    }
                }
                obj = null;
            }
            if (obj == null) {
                String str = (String) arrayList2.get(i12);
                Class cls2 = (Class) arrayList3.get(i12);
                if (Intrinsics.d(cls2, Class.class)) {
                    b11 = N.b(kotlin.reflect.d.class);
                } else if (cls2.isArray() && Intrinsics.d(cls2.getComponentType(), Class.class)) {
                    b11 = N.b(kotlin.reflect.d[].class);
                } else {
                    Intrinsics.checkNotNullParameter(cls2, "<this>");
                    b11 = N.b(cls2);
                }
                if (Intrinsics.d(b11.u(), N.b(Object[].class).u())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(b11.u());
                    sb2.append('<');
                    Class<?> componentType = C6345a.b(b11).getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    sb2.append(C6345a.e(componentType).u());
                    sb2.append('>');
                    u11 = sb2.toString();
                } else {
                    u11 = b11.u();
                }
                throw new IllegalArgumentException("Argument #" + i12 + ' ' + str + " is not of the required type " + u11);
            }
            arrayList.add(obj);
            i11++;
            i12 = i13;
        }
    }

    @Override // od.h
    @NotNull
    public final Type getReturnType() {
        return this.f78028a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C8693a(Class cls, ArrayList arrayList, EnumC1318a enumC1318a, b bVar) {
        this(cls, arrayList, enumC1318a, bVar, r5);
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
        }
    }
}
