package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f38260a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38261b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38262c;

    public class a implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new TreeSet();
        }
    }

    public class b implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    public class C0532c implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new ArrayDeque();
        }
    }

    public class d implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new ArrayList();
        }
    }

    public class e implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    public class f implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    public class g implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new TreeMap();
        }
    }

    public class h implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new LinkedHashMap();
        }
    }

    public class i implements com.google.gson.internal.h {
        @Override // com.google.gson.internal.h
        public Object a() {
            return new com.google.gson.internal.g();
        }
    }

    public class j implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Class f38263a;

        public j(Class cls) {
            this.f38263a = cls;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            try {
                return com.google.gson.internal.m.f38310a.d(this.f38263a);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f38263a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    public class k implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38265a;

        public k(String str) {
            this.f38265a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.i(this.f38265a);
        }
    }

    public class l implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38267a;

        public l(String str) {
            this.f38267a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.i(this.f38267a);
        }
    }

    public class m implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38269a;

        public m(String str) {
            this.f38269a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.i(this.f38269a);
        }
    }

    public class n implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f38271a;

        public n(Type type) {
            this.f38271a = type;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            Type type = this.f38271a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.i("Invalid EnumSet type: " + this.f38271a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.i("Invalid EnumSet type: " + this.f38271a.toString());
        }
    }

    public class o implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f38272a;

        public o(Type type) {
            this.f38272a = type;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            Type type = this.f38272a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.i("Invalid EnumMap type: " + this.f38272a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new com.google.gson.i("Invalid EnumMap type: " + this.f38272a.toString());
        }
    }

    public class p implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38273a;

        public p(String str) {
            this.f38273a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.i(this.f38273a);
        }
    }

    public class q implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38274a;

        public q(String str) {
            this.f38274a = str;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            throw new com.google.gson.i(this.f38274a);
        }
    }

    public class r implements com.google.gson.internal.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f38275a;

        public r(Constructor constructor) {
            this.f38275a = constructor;
        }

        @Override // com.google.gson.internal.h
        public Object a() {
            try {
                return this.f38275a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw Ib.a.e(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + Ib.a.c(this.f38275a) + "' with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + Ib.a.c(this.f38275a) + "' with no args", e12.getCause());
            }
        }
    }

    public c(Map map, boolean z10, List list) {
        this.f38260a = map;
        this.f38261b = z10;
        this.f38262c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    public static com.google.gson.internal.h c(Class cls, s sVar) {
        String m10;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            s sVar2 = s.ALLOW;
            if (sVar == sVar2 || (com.google.gson.internal.k.a(declaredConstructor, null) && (sVar != s.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (sVar != sVar2 || (m10 = Ib.a.m(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(m10);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static com.google.gson.internal.h d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new C0532c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new i() : new h();
        }
        return null;
    }

    public static com.google.gson.internal.h e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    public com.google.gson.internal.h b(TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        android.support.v4.media.session.b.a(this.f38260a.get(type));
        android.support.v4.media.session.b.a(this.f38260a.get(rawType));
        com.google.gson.internal.h e10 = e(type, rawType);
        if (e10 != null) {
            return e10;
        }
        s b10 = com.google.gson.internal.k.b(this.f38262c, rawType);
        com.google.gson.internal.h c10 = c(rawType, b10);
        if (c10 != null) {
            return c10;
        }
        com.google.gson.internal.h d10 = d(type, rawType);
        if (d10 != null) {
            return d10;
        }
        String a10 = a(rawType);
        if (a10 != null) {
            return new l(a10);
        }
        if (b10 == s.ALLOW) {
            return f(rawType);
        }
        return new m("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final com.google.gson.internal.h f(Class cls) {
        if (this.f38261b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.f38260a.toString();
    }
}
