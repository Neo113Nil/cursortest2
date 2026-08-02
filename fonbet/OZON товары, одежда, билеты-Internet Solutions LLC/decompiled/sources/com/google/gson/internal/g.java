package com.google.gson.internal;

import J0.P;
import Kk.C3532b;
import T7.Z;
import com.google.gson.internal.q;
import com.google.gson.p;
import java.lang.reflect.Constructor;
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
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.g<?>> f59960a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f59961b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.p> f59962c;

    public g(List list, boolean z11, Map map) {
        this.f59960a = map;
        this.f59961b = z11;
        this.f59962c = list;
    }

    static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + s.a("r8-abstract-class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if (com.google.gson.internal.h.h(r0[0]) != java.lang.String.class) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> o<T> b(com.google.gson.reflect.a<T> aVar, boolean z11) {
        o<T> eVar;
        String k11;
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        Map<Type, com.google.gson.g<?>> map = this.f59960a;
        com.google.gson.g<?> gVar = map.get(type);
        if (gVar != null) {
            return new VL.f(gVar, type);
        }
        com.google.gson.g<?> gVar2 = map.get(rawType);
        if (gVar2 != null) {
            return new AY.a(gVar2, type);
        }
        o<T> oVar = null;
        o<T> bVar = EnumSet.class.isAssignableFrom(rawType) ? new Py.b(type, 5) : rawType == EnumMap.class ? new b(type) : null;
        if (bVar != null) {
            return bVar;
        }
        p.a b11 = q.b(rawType, this.f59962c);
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor<? super T> declaredConstructor = rawType.getDeclaredConstructor(new Class[0]);
                p.a aVar2 = p.a.ALLOW;
                if (b11 == aVar2 || (q.a.f59997a.a(null, declaredConstructor) && (b11 != p.a.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    eVar = (b11 != aVar2 || (k11 = L8.a.k(declaredConstructor)) == null) ? new e(declaredConstructor) : new d(k11);
                } else {
                    eVar = new c("Unable to invoke no-args constructor of " + rawType + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
                }
            } catch (NoSuchMethodException unused) {
            }
            if (eVar == null) {
                return eVar;
            }
            if (Collection.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(ArrayList.class)) {
                    oVar = new Pk0.e(2);
                } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                    oVar = new Pk0.f(3);
                } else if (rawType.isAssignableFrom(TreeSet.class)) {
                    oVar = new P(5);
                } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                    oVar = new Pk0.g(4);
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(l.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    oVar = new Cm.e(6);
                }
                if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                    oVar = new K00.b();
                } else if (rawType.isAssignableFrom(TreeMap.class)) {
                    oVar = new C3532b();
                } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                    oVar = new Z();
                } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    oVar = new U7.i();
                }
            }
            if (oVar != null) {
                return oVar;
            }
            String a11 = a(rawType);
            if (a11 != null) {
                return new f(a11);
            }
            if (!z11) {
                return new Kl.a("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.");
            }
            if (b11 != p.a.ALLOW) {
                return new Kl.b("Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
            }
            if (this.f59961b) {
                return new Fl.b(rawType, 3);
            }
            String str = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
            if (rawType.getDeclaredConstructors().length == 0) {
                str = U7.d.e(str, " Or adjust your R8 configuration to keep the no-args constructor of the class.");
            }
            return new a(str);
        }
        eVar = null;
        if (eVar == null) {
        }
    }

    public final String toString() {
        return this.f59960a.toString();
    }
}
