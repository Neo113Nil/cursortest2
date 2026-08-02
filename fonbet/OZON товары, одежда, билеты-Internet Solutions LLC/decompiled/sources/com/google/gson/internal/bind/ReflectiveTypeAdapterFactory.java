package com.google.gson.internal.bind;

import B0.A0;
import U7.d;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.internal.o;
import com.google.gson.internal.q;
import com.google.gson.internal.s;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
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

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements t {

    /* renamed from: a, reason: collision with root package name */
    private final g f59864a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.gson.c f59865b;

    /* renamed from: c, reason: collision with root package name */
    private final Excluder f59866c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f59867d;

    /* renamed from: e, reason: collision with root package name */
    private final List<p> f59868e;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b f59869a;

        Adapter(b bVar) {
            this.f59869a = bVar;
        }

        abstract A a();

        abstract T b(A a11);

        abstract void c(A a11, JsonReader jsonReader, a aVar) throws IllegalAccessException, IOException;

        @Override // com.google.gson.TypeAdapter
        public final T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A a11 = a();
            Map<String, a> map = this.f59869a.f59879a;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    a aVar = map.get(jsonReader.nextName());
                    if (aVar == null) {
                        jsonReader.skipValue();
                    } else {
                        c(a11, jsonReader, aVar);
                    }
                }
                jsonReader.endObject();
                return b(a11);
            } catch (IllegalAccessException e11) {
                int i11 = L8.a.f16593b;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
            } catch (IllegalStateException e12) {
                throw new n(e12);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t2) throws IOException {
            if (t2 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<a> it = this.f59869a.f59880b.iterator();
                while (it.hasNext()) {
                    it.next().c(jsonWriter, t2);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e11) {
                int i11 = L8.a.f16593b;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
            }
        }
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        private final o<T> f59870b;

        FieldReflectionAdapter(o<T> oVar, b bVar) {
            super(bVar);
            this.f59870b = oVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T a() {
            return this.f59870b.f();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final T b(T t2) {
            return t2;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final void c(T t2, JsonReader jsonReader, a aVar) throws IllegalAccessException, IOException {
            aVar.b(jsonReader, t2);
        }
    }

    /* loaded from: classes9.dex */
    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        static final HashMap f59871e;

        /* renamed from: b, reason: collision with root package name */
        private final Constructor<T> f59872b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f59873c;

        /* renamed from: d, reason: collision with root package name */
        private final HashMap f59874d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f59871e = hashMap;
        }

        RecordAdapter(Class<T> cls, b bVar, boolean z11) {
            super(bVar);
            this.f59874d = new HashMap();
            Constructor<T> f7 = L8.a.f(cls);
            this.f59872b = f7;
            if (z11) {
                ReflectiveTypeAdapterFactory.a(null, f7);
            } else {
                L8.a.j(f7);
            }
            String[] h11 = L8.a.h(cls);
            for (int i11 = 0; i11 < h11.length; i11++) {
                this.f59874d.put(h11[i11], Integer.valueOf(i11));
            }
            Class<?>[] parameterTypes = this.f59872b.getParameterTypes();
            this.f59873c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f59873c[i12] = f59871e.get(parameterTypes[i12]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final Object[] a() {
            return (Object[]) this.f59873c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final Object b(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.f59872b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e11) {
                int i11 = L8.a.f16593b;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e11);
            } catch (IllegalArgumentException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + L8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e13) {
                e = e13;
                throw new RuntimeException("Failed to invoke constructor '" + L8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e14) {
                throw new RuntimeException("Failed to invoke constructor '" + L8.a.b(constructor) + "' with args " + Arrays.toString(objArr2), e14.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        final void c(Object[] objArr, JsonReader jsonReader, a aVar) throws IllegalAccessException, IOException {
            Object[] objArr2 = objArr;
            HashMap hashMap = this.f59874d;
            String str = aVar.f59877c;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                aVar.a(jsonReader, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + L8.a.b(this.f59872b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        final String f59875a;

        /* renamed from: b, reason: collision with root package name */
        final Field f59876b;

        /* renamed from: c, reason: collision with root package name */
        final String f59877c;

        protected a(String str, Field field) {
            this.f59875a = str;
            this.f59876b = field;
            this.f59877c = field.getName();
        }

        abstract void a(JsonReader jsonReader, int i11, Object[] objArr) throws IOException, l;

        abstract void b(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        abstract void c(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;
    }

    private static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f59878c = new b(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* renamed from: a, reason: collision with root package name */
        final Map<String, a> f59879a;

        /* renamed from: b, reason: collision with root package name */
        final List<a> f59880b;

        b(Map<String, a> map, List<a> list) {
            this.f59879a = map;
            this.f59880b = list;
        }
    }

    public ReflectiveTypeAdapterFactory(g gVar, com.google.gson.c cVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f59864a = gVar;
        this.f59865b = cVar;
        this.f59866c = excluder;
        this.f59867d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f59868e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void a(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!q.a(obj, accessibleObject)) {
            throw new j(d.e(L8.a.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    private static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + L8.a.c(field) + " and " + L8.a.c(field2) + "\nSee " + s.a("duplicate-fields"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e8  */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private b c(Gson gson, com.google.gson.reflect.a<?> aVar, Class<?> cls, boolean z11, boolean z12) {
        boolean z13;
        Method method;
        J8.b bVar;
        List asList;
        String str;
        boolean z14;
        ArrayList<String> arrayList;
        String str2;
        J8.a aVar2;
        Gson gson2;
        int i11;
        Field field;
        TypeAdapter<?> typeAdapter;
        int i12;
        Field field2;
        a aVar3;
        if (cls.isInterface()) {
            return b.f59878c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.google.gson.reflect.a<?> aVar4 = aVar;
        boolean z15 = z11;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z16 = true;
            if (cls2 != cls && declaredFields.length > 0) {
                p.a b11 = q.b(cls2, this.f59868e);
                if (b11 == p.a.BLOCK_ALL) {
                    throw new j("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z15 = b11 == p.a.BLOCK_INACCESSIBLE;
            }
            boolean z17 = z15;
            int length = declaredFields.length;
            int i13 = 0;
            while (i13 < length) {
                Field field3 = declaredFields[i13];
                Excluder excluder = this.f59866c;
                boolean b12 = excluder.b(field3, z16);
                boolean b13 = excluder.b(field3, false);
                boolean z18 = !b13;
                if (b12 && b13) {
                    i11 = i13;
                    z14 = z16;
                    i12 = length;
                } else {
                    if (!z12) {
                        z13 = z18;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z13 = false;
                    } else {
                        Method e11 = L8.a.e(cls2, field3);
                        if (!z17) {
                            L8.a.j(e11);
                        }
                        if (e11.getAnnotation(J8.b.class) != null && field3.getAnnotation(J8.b.class) == null) {
                            throw new j(A0.b("@SerializedName on ", L8.a.d(e11, false), " is not supported"));
                        }
                        z13 = z18;
                        method = e11;
                        if (!z17 && method == null) {
                            L8.a.j(field3);
                        }
                        Type k11 = h.k(aVar4.getType(), cls2, field3.getGenericType());
                        bVar = (J8.b) field3.getAnnotation(J8.b.class);
                        if (bVar != null) {
                            str = this.f59865b.a(field3);
                            asList = Collections.EMPTY_LIST;
                        } else {
                            String value = bVar.value();
                            asList = Arrays.asList(bVar.alternate());
                            str = value;
                        }
                        if (asList.isEmpty()) {
                            z14 = z16;
                            ArrayList arrayList2 = new ArrayList(asList.size() + 1);
                            arrayList2.add(str);
                            arrayList2.addAll(asList);
                            arrayList = arrayList2;
                        } else {
                            z14 = z16;
                            arrayList = Collections.singletonList(str);
                        }
                        str2 = (String) arrayList.get(0);
                        com.google.gson.reflect.a<?> aVar5 = com.google.gson.reflect.a.get(k11);
                        Class<? super Object> rawType = aVar5.getRawType();
                        boolean z19 = (rawType == null && rawType.isPrimitive()) ? z14 : false;
                        int modifiers = field3.getModifiers();
                        boolean z21 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? false : z14;
                        aVar2 = (J8.a) field3.getAnnotation(J8.a.class);
                        if (aVar2 == null) {
                            field = field3;
                            i11 = i13;
                            gson2 = gson;
                            typeAdapter = this.f59867d.a(this.f59864a, gson2, aVar5, aVar2, false);
                        } else {
                            gson2 = gson;
                            i11 = i13;
                            field = field3;
                            typeAdapter = null;
                        }
                        boolean z22 = typeAdapter == null ? z14 : false;
                        if (typeAdapter == null) {
                            typeAdapter = gson2.e(aVar5);
                        }
                        TypeAdapter<?> typeAdapterRuntimeTypeWrapper = b12 ? z22 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper<>(gson2, typeAdapter, aVar5.getType()) : typeAdapter;
                        i12 = length;
                        c cVar = new c(str2, field, z17, method, typeAdapterRuntimeTypeWrapper, typeAdapter, z19, z21);
                        field2 = field;
                        if (z13) {
                            for (String str3 : arrayList) {
                                a aVar6 = (a) linkedHashMap.put(str3, cVar);
                                if (aVar6 != null) {
                                    b(cls, str3, aVar6.f59876b, field2);
                                    throw null;
                                }
                            }
                        }
                        if (!b12 && (aVar3 = (a) linkedHashMap2.put(str2, cVar)) != null) {
                            b(cls, str2, aVar3.f59876b, field2);
                            throw null;
                        }
                    }
                    method = null;
                    if (!z17) {
                        L8.a.j(field3);
                    }
                    Type k112 = h.k(aVar4.getType(), cls2, field3.getGenericType());
                    bVar = (J8.b) field3.getAnnotation(J8.b.class);
                    if (bVar != null) {
                    }
                    if (asList.isEmpty()) {
                    }
                    str2 = (String) arrayList.get(0);
                    com.google.gson.reflect.a<?> aVar52 = com.google.gson.reflect.a.get(k112);
                    Class<? super Object> rawType2 = aVar52.getRawType();
                    if (rawType2 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    aVar2 = (J8.a) field3.getAnnotation(J8.a.class);
                    if (aVar2 == null) {
                    }
                    if (typeAdapter == null) {
                    }
                    if (typeAdapter == null) {
                    }
                    if (b12) {
                    }
                    i12 = length;
                    c cVar2 = new c(str2, field, z17, method, typeAdapterRuntimeTypeWrapper, typeAdapter, z19, z21);
                    field2 = field;
                    if (z13) {
                    }
                    if (!b12) {
                        b(cls, str2, aVar3.f59876b, field2);
                        throw null;
                    }
                    continue;
                }
                i13 = i11 + 1;
                z16 = z14;
                length = i12;
            }
            aVar4 = com.google.gson.reflect.a.get(h.k(aVar4.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar4.getRawType();
            z15 = z17;
        }
        return new b(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        int i11 = L8.a.f16593b;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                @Override // com.google.gson.TypeAdapter
                public final T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                public final String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(JsonWriter jsonWriter, T t2) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        p.a b11 = q.b(rawType, this.f59868e);
        if (b11 != p.a.BLOCK_ALL) {
            boolean z11 = b11 == p.a.BLOCK_INACCESSIBLE;
            return L8.a.i(rawType) ? new RecordAdapter(rawType, c(gson, aVar, rawType, z11, true), z11) : new FieldReflectionAdapter(this.f59864a.b(aVar, true), c(gson, aVar, rawType, z11, false));
        }
        throw new j("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
