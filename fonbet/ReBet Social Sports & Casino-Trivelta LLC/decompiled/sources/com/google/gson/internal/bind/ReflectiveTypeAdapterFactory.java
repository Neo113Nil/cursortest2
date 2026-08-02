package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.q;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    public final c f38142a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.c f38143b;

    /* renamed from: c, reason: collision with root package name */
    public final Excluder f38144c;

    /* renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f38145d;

    /* renamed from: e, reason: collision with root package name */
    public final List f38146e;

    public static abstract class Adapter<T, A> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final Map f38147a;

        public Adapter(Map map) {
            this.f38147a = map;
        }

        public abstract Object a();

        public abstract Object b(Object obj);

        public abstract void c(Object obj, Jb.a aVar, b bVar);

        @Override // com.google.gson.TypeAdapter
        public Object read(Jb.a aVar) {
            if (aVar.Y1() == Jb.b.NULL) {
                aVar.n1();
                return null;
            }
            Object a10 = a();
            try {
                aVar.m();
                while (aVar.hasNext()) {
                    b bVar = (b) this.f38147a.get(aVar.f0());
                    if (bVar != null && bVar.f38165e) {
                        c(a10, aVar, bVar);
                    }
                    aVar.C();
                }
                aVar.t();
                return b(a10);
            } catch (IllegalAccessException e10) {
                throw Ib.a.e(e10);
            } catch (IllegalStateException e11) {
                throw new q(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(Jb.c cVar, Object obj) {
            if (obj == null) {
                cVar.T1();
                return;
            }
            cVar.B();
            try {
                Iterator it = this.f38147a.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).c(cVar, obj);
                }
                cVar.w0();
            } catch (IllegalAccessException e10) {
                throw Ib.a.e(e10);
            }
        }
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        public final h f38148b;

        public FieldReflectionAdapter(h hVar, Map map) {
            super(map);
            this.f38148b = hVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object a() {
            return this.f38148b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public Object b(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void c(Object obj, Jb.a aVar, b bVar) {
            bVar.b(aVar, obj);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: d, reason: collision with root package name */
        public static final Map f38149d = f();

        /* renamed from: b, reason: collision with root package name */
        public final Constructor f38150b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f38151c;
        private final Object[] constructorArgsDefaults;

        public RecordAdapter(Class cls, Map map, boolean z10) {
            super(map);
            this.f38151c = new HashMap();
            Constructor i10 = Ib.a.i(cls);
            this.f38150b = i10;
            if (z10) {
                ReflectiveTypeAdapterFactory.b(null, i10);
            } else {
                Ib.a.l(i10);
            }
            String[] j10 = Ib.a.j(cls);
            for (int i11 = 0; i11 < j10.length; i11++) {
                this.f38151c.put(j10[i11], Integer.valueOf(i11));
            }
            Class<?>[] parameterTypes = this.f38150b.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.constructorArgsDefaults[i12] = f38149d.get(parameterTypes[i12]);
            }
        }

        public static Map f() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Object b(Object[] objArr) {
            try {
                return this.f38150b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw Ib.a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + Ib.a.c(this.f38150b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + Ib.a.c(this.f38150b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + Ib.a.c(this.f38150b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, Jb.a aVar, b bVar) {
            Integer num = (Integer) this.f38151c.get(bVar.f38163c);
            if (num != null) {
                bVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + Ib.a.c(this.f38150b) + "' for field with name '" + bVar.f38163c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public class a extends b {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f38152f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Method f38153g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f38154h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f38155i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Gson f38156j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ TypeToken f38157k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f38158l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f38159m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Field field, boolean z10, boolean z11, boolean z12, Method method, boolean z13, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z14, boolean z15) {
            super(str, field, z10, z11);
            this.f38152f = z12;
            this.f38153g = method;
            this.f38154h = z13;
            this.f38155i = typeAdapter;
            this.f38156j = gson;
            this.f38157k = typeToken;
            this.f38158l = z14;
            this.f38159m = z15;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public void a(Jb.a aVar, int i10, Object[] objArr) {
            Object read = this.f38155i.read(aVar);
            if (read != null || !this.f38158l) {
                objArr[i10] = read;
                return;
            }
            throw new l("null is not allowed as value for record component '" + this.f38163c + "' of primitive type; at path " + aVar.l());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public void b(Jb.a aVar, Object obj) {
            Object read = this.f38155i.read(aVar);
            if (read == null && this.f38158l) {
                return;
            }
            if (this.f38152f) {
                ReflectiveTypeAdapterFactory.b(obj, this.f38162b);
            } else if (this.f38159m) {
                throw new i("Cannot set value of 'static final' " + Ib.a.g(this.f38162b, false));
            }
            this.f38162b.set(obj, read);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public void c(Jb.c cVar, Object obj) {
            Object obj2;
            if (this.f38164d) {
                if (this.f38152f) {
                    Method method = this.f38153g;
                    if (method == null) {
                        ReflectiveTypeAdapterFactory.b(obj, this.f38162b);
                    } else {
                        ReflectiveTypeAdapterFactory.b(obj, method);
                    }
                }
                Method method2 = this.f38153g;
                if (method2 != null) {
                    try {
                        obj2 = method2.invoke(obj, null);
                    } catch (InvocationTargetException e10) {
                        throw new i("Accessor " + Ib.a.g(this.f38153g, false) + " threw exception", e10.getCause());
                    }
                } else {
                    obj2 = this.f38162b.get(obj);
                }
                if (obj2 == obj) {
                    return;
                }
                cVar.n1(this.f38161a);
                (this.f38154h ? this.f38155i : new TypeAdapterRuntimeTypeWrapper(this.f38156j, this.f38155i, this.f38157k.getType())).write(cVar, obj2);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f38161a;

        /* renamed from: b, reason: collision with root package name */
        public final Field f38162b;

        /* renamed from: c, reason: collision with root package name */
        public final String f38163c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f38164d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f38165e;

        public b(String str, Field field, boolean z10, boolean z11) {
            this.f38161a = str;
            this.f38162b = field;
            this.f38163c = field.getName();
            this.f38164d = z10;
            this.f38165e = z11;
        }

        public abstract void a(Jb.a aVar, int i10, Object[] objArr);

        public abstract void b(Jb.a aVar, Object obj);

        public abstract void c(Jb.c cVar, Object obj);
    }

    public ReflectiveTypeAdapterFactory(c cVar, com.google.gson.c cVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f38142a = cVar;
        this.f38143b = cVar2;
        this.f38144c = excluder;
        this.f38145d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f38146e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (k.a(accessibleObject, obj)) {
            return;
        }
        throw new i(Ib.a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public final b c(Gson gson, Field field, Method method, String str, TypeToken typeToken, boolean z10, boolean z11, boolean z12) {
        boolean a10 = j.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z13 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        Gb.b bVar = (Gb.b) field.getAnnotation(Gb.b.class);
        TypeAdapter a11 = bVar != null ? this.f38145d.a(this.f38142a, gson, typeToken, bVar) : null;
        boolean z14 = a11 != null;
        if (a11 == null) {
            a11 = gson.o(typeToken);
        }
        return new a(str, field, z10, z11, z12, method, z14, a11, gson, typeToken, a10, z13);
    }

    @Override // com.google.gson.v
    public TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        s b10 = k.b(this.f38146e, rawType);
        if (b10 != s.BLOCK_ALL) {
            boolean z10 = b10 == s.BLOCK_INACCESSIBLE;
            return Ib.a.k(rawType) ? new RecordAdapter(rawType, d(gson, typeToken, rawType, z10, true), z10) : new FieldReflectionAdapter(this.f38142a.b(typeToken), d(gson, typeToken, rawType, z10, false));
        }
        throw new i("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d(Gson gson, TypeToken typeToken, Class cls, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        Method method;
        int size;
        TypeToken typeToken2;
        b bVar;
        int i11;
        int i12;
        int i13;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Class cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!cls2.isInterface()) {
            TypeToken typeToken3 = typeToken;
            boolean z13 = z10;
            Class cls3 = cls2;
            while (cls3 != Object.class) {
                Field[] declaredFields = cls3.getDeclaredFields();
                boolean z14 = true;
                boolean z15 = false;
                if (cls3 != cls2 && declaredFields.length > 0) {
                    s b10 = k.b(reflectiveTypeAdapterFactory.f38146e, cls3);
                    if (b10 == s.BLOCK_ALL) {
                        throw new i("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                    }
                    z13 = b10 == s.BLOCK_INACCESSIBLE;
                }
                boolean z16 = z13;
                int length = declaredFields.length;
                int i14 = 0;
                while (i14 < length) {
                    int i15 = i14;
                    Field field = declaredFields[i15];
                    boolean f10 = reflectiveTypeAdapterFactory.f(field, z14);
                    boolean f11 = reflectiveTypeAdapterFactory.f(field, z15);
                    if (f10 || f11) {
                        if (!z11) {
                            z12 = f11;
                            i10 = i15;
                        } else if (Modifier.isStatic(field.getModifiers())) {
                            i10 = i15;
                            z12 = z15;
                        } else {
                            Method h10 = Ib.a.h(cls3, field);
                            if (!z16) {
                                Ib.a.l(h10);
                            }
                            if (h10.getAnnotation(Gb.c.class) != null && field.getAnnotation(Gb.c.class) == null) {
                                throw new i("@SerializedName on " + Ib.a.g(h10, z15) + " is not supported");
                            }
                            i10 = i15;
                            method = h10;
                            z12 = f11;
                            if (!z16 && method == null) {
                                Ib.a.l(field);
                            }
                            Type o10 = com.google.gson.internal.b.o(typeToken3.getType(), cls3, field.getGenericType());
                            List e10 = reflectiveTypeAdapterFactory.e(field);
                            size = e10.size();
                            typeToken2 = typeToken3;
                            bVar = null;
                            i11 = 0;
                            while (i11 < size) {
                                String str = (String) e10.get(i11);
                                if (i11 != 0) {
                                    f10 = false;
                                }
                                int i16 = i10;
                                List list = e10;
                                boolean z17 = f10;
                                int i17 = length;
                                b bVar2 = (b) linkedHashMap.put(str, reflectiveTypeAdapterFactory.c(gson, field, method, str, TypeToken.get(o10), z17, z12, z16));
                                if (bVar == null) {
                                    bVar = bVar2;
                                }
                                i11++;
                                reflectiveTypeAdapterFactory = this;
                                f10 = z17;
                                length = i17;
                                i10 = i16;
                                e10 = list;
                            }
                            i12 = length;
                            i13 = i10;
                            if (bVar == null) {
                                throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + bVar.f38161a + "'; conflict is caused by fields " + Ib.a.f(bVar.f38162b) + " and " + Ib.a.f(field));
                            }
                        }
                        method = null;
                        if (!z16) {
                            Ib.a.l(field);
                        }
                        Type o102 = com.google.gson.internal.b.o(typeToken3.getType(), cls3, field.getGenericType());
                        List e102 = reflectiveTypeAdapterFactory.e(field);
                        size = e102.size();
                        typeToken2 = typeToken3;
                        bVar = null;
                        i11 = 0;
                        while (i11 < size) {
                        }
                        i12 = length;
                        i13 = i10;
                        if (bVar == null) {
                        }
                    } else {
                        i12 = length;
                        i13 = i15;
                        typeToken2 = typeToken3;
                    }
                    i14 = i13 + 1;
                    reflectiveTypeAdapterFactory = this;
                    typeToken3 = typeToken2;
                    length = i12;
                    z14 = true;
                    z15 = false;
                }
                typeToken3 = TypeToken.get(com.google.gson.internal.b.o(typeToken3.getType(), cls3, cls3.getGenericSuperclass()));
                cls3 = typeToken3.getRawType();
                reflectiveTypeAdapterFactory = this;
                cls2 = cls;
                z13 = z16;
            }
        }
        return linkedHashMap;
    }

    public final List e(Field field) {
        Gb.c cVar = (Gb.c) field.getAnnotation(Gb.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f38143b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    public final boolean f(Field field, boolean z10) {
        return (this.f38144c.b(field.getType(), z10) || this.f38144c.e(field, z10)) ? false : true;
    }
}
