package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class Gson {

    /* renamed from: m, reason: collision with root package name */
    static final e f59777m = e.f59798d;

    /* renamed from: n, reason: collision with root package name */
    static final c f59778n = c.IDENTITY;

    /* renamed from: o, reason: collision with root package name */
    static final r f59779o = r.DOUBLE;

    /* renamed from: p, reason: collision with root package name */
    static final r f59780p = r.LAZILY_PARSED_NUMBER;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Map<com.google.gson.reflect.a<?>, TypeAdapter<?>>> f59781a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f59782b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.gson.internal.g f59783c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f59784d;

    /* renamed from: e, reason: collision with root package name */
    final List<t> f59785e;

    /* renamed from: f, reason: collision with root package name */
    final Map<Type, g<?>> f59786f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f59787g;

    /* renamed from: h, reason: collision with root package name */
    final e f59788h;

    /* renamed from: i, reason: collision with root package name */
    final q f59789i;

    /* renamed from: j, reason: collision with root package name */
    final List<t> f59790j;

    /* renamed from: k, reason: collision with root package name */
    final List<t> f59791k;

    /* renamed from: l, reason: collision with root package name */
    final List<p> f59792l;

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                jsonWriter.nullValue();
                return;
            }
            double doubleValue = number2.doubleValue();
            Gson.a(doubleValue);
            jsonWriter.value(doubleValue);
        }
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    class AnonymousClass2 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                jsonWriter.nullValue();
                return;
            }
            float floatValue = number2.floatValue();
            Gson.a(floatValue);
            if (!(number2 instanceof Float)) {
                number2 = Float.valueOf(floatValue);
            }
            jsonWriter.value(number2);
        }
    }

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private TypeAdapter<T> f59795a = null;

        FutureTypeAdapter() {
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public final TypeAdapter<T> a() {
            TypeAdapter<T> typeAdapter = this.f59795a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public final void b(TypeAdapter<T> typeAdapter) {
            if (this.f59795a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f59795a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.f59795a;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t2) throws IOException {
            TypeAdapter<T> typeAdapter = this.f59795a;
            if (typeAdapter == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            typeAdapter.write(jsonWriter, t2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Gson() {
        this(r1, f59778n, r3, true, f59777m, null, true, r8, r9, r9, r9, f59779o, f59780p, r9);
        Excluder excluder = Excluder.f59818c;
        Map map = Collections.EMPTY_MAP;
        o oVar = o.DEFAULT;
        List list = Collections.EMPTY_LIST;
    }

    static void a(double d11) {
        if (Double.isNaN(d11) || Double.isInfinite(d11)) {
            throw new IllegalArgumentException(d11 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(JsonReader jsonReader, com.google.gson.reflect.a<T> aVar) throws j, n {
        boolean z11;
        q strictness = jsonReader.getStrictness();
        q qVar = this.f59789i;
        if (qVar != null) {
            jsonReader.setStrictness(qVar);
        } else if (jsonReader.getStrictness() == q.LEGACY_STRICT) {
            jsonReader.setStrictness(q.LENIENT);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z11 = false;
                        try {
                            TypeAdapter<T> e11 = e(aVar);
                            T read = e11.read(jsonReader);
                            Class e12 = Fl0.b.e(aVar.getRawType());
                            if (read != null && !e12.isInstance(read)) {
                                throw new ClassCastException("Type adapter '" + e11 + "' returned wrong type; requested " + aVar.getRawType() + " but got instance of " + read.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return read;
                        } catch (EOFException e13) {
                            e = e13;
                            if (!z11) {
                                throw new n(e);
                            }
                            jsonReader.setStrictness(strictness);
                            return null;
                        }
                    } finally {
                        jsonReader.setStrictness(strictness);
                    }
                } catch (EOFException e14) {
                    e = e14;
                    z11 = true;
                }
            } catch (IOException e15) {
                throw new n(e15);
            }
        } catch (AssertionError e16) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e16.getMessage(), e16);
        } catch (IllegalStateException e17) {
            throw new n(e17);
        }
    }

    public final <T> T c(Reader reader, com.google.gson.reflect.a<T> aVar) throws j, n {
        JsonReader h11 = h(reader);
        T t2 = (T) b(h11, aVar);
        if (t2 != null) {
            try {
                if (h11.peek() != JsonToken.END_DOCUMENT) {
                    throw new n("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e11) {
                throw new n(e11);
            } catch (IOException e12) {
                throw new j(e12);
            }
        }
        return t2;
    }

    public final <T> T d(String str, Class<T> cls) throws n {
        com.google.gson.reflect.a<T> aVar = com.google.gson.reflect.a.get((Class) cls);
        if (str == null) {
            return null;
        }
        return (T) c(new StringReader(str), aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r4.b(r6);
        r2.put(r9, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> TypeAdapter<T> e(com.google.gson.reflect.a<T> aVar) {
        boolean z11;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f59782b;
        TypeAdapter<T> typeAdapter = (TypeAdapter) concurrentHashMap.get(aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal<Map<com.google.gson.reflect.a<?>, TypeAdapter<?>>> threadLocal = this.f59781a;
        Map<com.google.gson.reflect.a<?>, TypeAdapter<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z11 = true;
        } else {
            TypeAdapter<T> typeAdapter2 = (TypeAdapter) map.get(aVar);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z11 = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter);
            Iterator<t> it = this.f59785e.iterator();
            TypeAdapter<T> typeAdapter3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                typeAdapter3 = it.next().create(this, aVar);
                if (typeAdapter3 != null) {
                    break;
                }
            }
            if (typeAdapter3 != null) {
                if (z11) {
                    concurrentHashMap.putAll(map);
                }
                return typeAdapter3;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + aVar);
        } finally {
            if (z11) {
                threadLocal.remove();
            }
        }
    }

    public final <T> TypeAdapter<T> f(Class<T> cls) {
        return e(com.google.gson.reflect.a.get((Class) cls));
    }

    public final <T> TypeAdapter<T> g(t tVar, com.google.gson.reflect.a<T> aVar) {
        Objects.requireNonNull(tVar, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.f59784d;
        if (jsonAdapterAnnotationTypeAdapterFactory.b(tVar, aVar)) {
            tVar = jsonAdapterAnnotationTypeAdapterFactory;
        }
        boolean z11 = false;
        for (t tVar2 : this.f59785e) {
            if (z11) {
                TypeAdapter<T> create = tVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (tVar2 == tVar) {
                z11 = true;
            }
        }
        if (!z11) {
            return e(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public final JsonReader h(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        q qVar = this.f59789i;
        if (qVar == null) {
            qVar = q.LEGACY_STRICT;
        }
        jsonReader.setStrictness(qVar);
        return jsonReader;
    }

    public final JsonWriter i(Writer writer) throws IOException {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.f59788h);
        jsonWriter.setHtmlSafe(this.f59787g);
        q qVar = this.f59789i;
        if (qVar == null) {
            qVar = q.LEGACY_STRICT;
        }
        jsonWriter.setStrictness(qVar);
        jsonWriter.setSerializeNulls(false);
        return jsonWriter;
    }

    public final String j(JsonElement jsonElement) {
        StringBuilder sb2 = new StringBuilder();
        try {
            m(jsonElement, i(com.google.gson.internal.r.c(sb2)));
            return sb2.toString();
        } catch (IOException e11) {
            throw new j(e11);
        }
    }

    public final String k(Object obj) {
        return obj == null ? j(k.f60021a) : l(obj, obj.getClass());
    }

    public final String l(Object obj, Class cls) {
        StringBuilder sb2 = new StringBuilder();
        try {
            n(obj, cls, i(com.google.gson.internal.r.c(sb2)));
            return sb2.toString();
        } catch (IOException e11) {
            throw new j(e11);
        }
    }

    public final void m(JsonElement jsonElement, JsonWriter jsonWriter) throws j {
        q strictness = jsonWriter.getStrictness();
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f59787g);
        jsonWriter.setSerializeNulls(false);
        q qVar = this.f59789i;
        if (qVar != null) {
            jsonWriter.setStrictness(qVar);
        } else if (jsonWriter.getStrictness() == q.LEGACY_STRICT) {
            jsonWriter.setStrictness(q.LENIENT);
        }
        try {
            try {
                com.google.gson.internal.r.b(jsonElement, jsonWriter);
            } catch (IOException e11) {
                throw new j(e11);
            } catch (AssertionError e12) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e12.getMessage(), e12);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final void n(Object obj, Class cls, JsonWriter jsonWriter) throws j {
        TypeAdapter e11 = e(com.google.gson.reflect.a.get((Type) cls));
        q strictness = jsonWriter.getStrictness();
        q qVar = this.f59789i;
        if (qVar != null) {
            jsonWriter.setStrictness(qVar);
        } else if (jsonWriter.getStrictness() == q.LEGACY_STRICT) {
            jsonWriter.setStrictness(q.LENIENT);
        }
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.f59787g);
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                e11.write(jsonWriter, obj);
            } catch (IOException e12) {
                throw new j(e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f59785e + ",instanceCreators:" + this.f59783c + "}";
    }

    Gson(Excluder excluder, c cVar, Map map, boolean z11, e eVar, q qVar, boolean z12, o oVar, List list, List list2, List list3, r rVar, r rVar2, List list4) {
        final TypeAdapter<Number> typeAdapter;
        this.f59781a = new ThreadLocal<>();
        this.f59782b = new ConcurrentHashMap();
        this.f59786f = map;
        com.google.gson.internal.g gVar = new com.google.gson.internal.g(list4, z12, map);
        this.f59783c = gVar;
        this.f59787g = z11;
        this.f59788h = eVar;
        this.f59789i = qVar;
        this.f59790j = list;
        this.f59791k = list2;
        this.f59792l = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f59897A);
        arrayList.add(ObjectTypeAdapter.a(rVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f59914p);
        arrayList.add(TypeAdapters.f59905g);
        arrayList.add(TypeAdapters.f59902d);
        arrayList.add(TypeAdapters.f59903e);
        arrayList.add(TypeAdapters.f59904f);
        if (oVar == o.DEFAULT) {
            typeAdapter = TypeAdapters.f59909k;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public final Number read(JsonReader jsonReader) throws IOException {
                    if (jsonReader.peek() != JsonToken.NULL) {
                        return Long.valueOf(jsonReader.nextLong());
                    }
                    jsonReader.nextNull();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        jsonWriter.nullValue();
                    } else {
                        jsonWriter.value(number2.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, new AnonymousClass1()));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, new AnonymousClass2()));
        arrayList.add(NumberTypeAdapter.a(rVar2));
        arrayList.add(TypeAdapters.f59906h);
        arrayList.add(TypeAdapters.f59907i);
        arrayList.add(TypeAdapters.b(AtomicLong.class, new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            public final AtomicLong read(JsonReader jsonReader) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.read(jsonReader)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.write(jsonWriter, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            public final AtomicLongArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList2.add(Long.valueOf(((Number) TypeAdapter.this.read(jsonReader)).longValue()));
                }
                jsonReader.endArray();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList2.get(i11)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
                AtomicLongArray atomicLongArray2 = atomicLongArray;
                jsonWriter.beginArray();
                int length = atomicLongArray2.length();
                for (int i11 = 0; i11 < length; i11++) {
                    TypeAdapter.this.write(jsonWriter, Long.valueOf(atomicLongArray2.get(i11)));
                }
                jsonWriter.endArray();
            }
        }.nullSafe()));
        arrayList.add(TypeAdapters.f59908j);
        arrayList.add(TypeAdapters.f59910l);
        arrayList.add(TypeAdapters.f59915q);
        arrayList.add(TypeAdapters.f59916r);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f59911m));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f59912n));
        arrayList.add(TypeAdapters.b(com.google.gson.internal.k.class, TypeAdapters.f59913o));
        arrayList.add(TypeAdapters.f59917s);
        arrayList.add(TypeAdapters.f59918t);
        arrayList.add(TypeAdapters.f59920v);
        arrayList.add(TypeAdapters.f59921w);
        arrayList.add(TypeAdapters.f59923y);
        arrayList.add(TypeAdapters.f59919u);
        arrayList.add(TypeAdapters.f59900b);
        arrayList.add(DefaultDateTypeAdapter.f59835c);
        arrayList.add(TypeAdapters.f59922x);
        if (com.google.gson.internal.sql.a.f60009a) {
            arrayList.add(com.google.gson.internal.sql.a.f60013e);
            arrayList.add(com.google.gson.internal.sql.a.f60012d);
            arrayList.add(com.google.gson.internal.sql.a.f60014f);
        }
        arrayList.add(ArrayTypeAdapter.f59829c);
        arrayList.add(TypeAdapters.f59899a);
        arrayList.add(new CollectionTypeAdapterFactory(gVar));
        arrayList.add(new MapTypeAdapterFactory(gVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(gVar);
        this.f59784d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f59898B);
        arrayList.add(new ReflectiveTypeAdapterFactory(gVar, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f59785e = Collections.unmodifiableList(arrayList);
    }
}
