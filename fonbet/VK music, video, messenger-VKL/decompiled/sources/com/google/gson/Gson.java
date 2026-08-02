package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import xsna.ams;
import xsna.b9y;
import xsna.gby;
import xsna.i0p0;
import xsna.kby;
import xsna.kpm0;
import xsna.n6x;
import xsna.rtp0;
import xsna.u6j;
import xsna.u9y;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final String DEFAULT_DATE_PATTERN = null;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final List<rtp0> builderFactories;
    final List<rtp0> builderHierarchyFactories;
    private final ThreadLocal<Map<xtp0<?>, FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final u6j constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List<rtp0> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, n6x<?>> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final LongSerializationPolicy longSerializationPolicy;
    final i0p0 numberToNumberStrategy;
    final i0p0 objectToNumberStrategy;
    final boolean prettyPrinting;
    final List<ReflectionAccessFilter> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final Map<xtp0<?>, TypeAdapter<?>> typeTokenCache;
    final boolean useJdkUnsafe;
    static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = FieldNamingPolicy.IDENTITY;
    static final i0p0 DEFAULT_OBJECT_TO_NUMBER_STRATEGY = ToNumberPolicy.DOUBLE;
    static final i0p0 DEFAULT_NUMBER_TO_NUMBER_STRATEGY = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    private static final xtp0<?> NULL_KEY_SURROGATE = xtp0.get(Object.class);

    /* renamed from: com.google.gson.Gson$1, reason: invalid class name */
    public class AnonymousClass1 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number2.doubleValue());
                jsonWriter.value(number2);
            }
        }
    }

    /* renamed from: com.google.gson.Gson$2, reason: invalid class name */
    public class AnonymousClass2 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public final Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number2.floatValue());
                jsonWriter.value(number2);
            }
        }
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        public TypeAdapter<T> a;

        @Override // com.google.gson.TypeAdapter
        public final T b(JsonReader jsonReader) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter.b(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.c(jsonWriter, t);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Gson() {
        this(r1, r2, r3, false, false, false, true, false, false, false, true, r12, r13, 2, 2, r16, r16, r16, DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, r16);
        Excluder excluder = Excluder.h;
        FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
        Map map = Collections.EMPTY_MAP;
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.DEFAULT;
        String str = DEFAULT_DATE_PATTERN;
        List list = Collections.EMPTY_LIST;
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    private static TypeAdapter<AtomicLong> atomicLongAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter.AnonymousClass1();
    }

    private static TypeAdapter<AtomicLongArray> atomicLongArrayAdapter(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter.AnonymousClass1();
    }

    public static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> doubleAdapter(boolean z) {
        return z ? TypeAdapters.m : new AnonymousClass1();
    }

    private TypeAdapter<Number> floatAdapter(boolean z) {
        return z ? TypeAdapters.l : new AnonymousClass2();
    }

    private static TypeAdapter<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.k : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            public final Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number2.toString());
                }
            }
        };
    }

    @Deprecated
    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) ams.b(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> TypeAdapter<T> getAdapter(xtp0<T> xtp0Var) {
        boolean z;
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.typeTokenCache.get(xtp0Var == null ? NULL_KEY_SURROGATE : xtp0Var);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<xtp0<?>, FutureTypeAdapter<?>> map = this.calls.get();
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(xtp0Var);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(xtp0Var, futureTypeAdapter2);
            Iterator<rtp0> it = this.factories.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> a = it.next().a(this, xtp0Var);
                if (a != null) {
                    if (futureTypeAdapter2.a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.a = a;
                    this.typeTokenCache.put(xtp0Var, a);
                    return a;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + xtp0Var);
        } finally {
            map.remove(xtp0Var);
            if (z) {
                this.calls.remove();
            }
        }
    }

    public <T> TypeAdapter<T> getDelegateAdapter(rtp0 rtp0Var, xtp0<T> xtp0Var) {
        if (!this.factories.contains(rtp0Var)) {
            rtp0Var = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (rtp0 rtp0Var2 : this.factories) {
            if (z) {
                TypeAdapter<T> a = rtp0Var2.a(this, xtp0Var);
                if (a != null) {
                    return a;
                }
            } else if (rtp0Var2 == rtp0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + xtp0Var);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setLenient(this.lenient);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new kpm0.a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public b9y toJsonTree(Object obj) {
        return obj == null ? u9y.b : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public b9y toJsonTree(Object obj, Type type) {
        kby kbyVar = new kby();
        toJson(obj, type, kbyVar);
        return kbyVar.m();
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        JsonReader newJsonReader = newJsonReader(reader);
        Object fromJson = fromJson(newJsonReader, cls);
        assertFullConsumption(fromJson, newJsonReader);
        return (T) ams.b(cls).cast(fromJson);
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, n6x<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<rtp0> list, List<rtp0> list2, List<rtp0> list3, i0p0 i0p0Var, i0p0 i0p0Var2, List<ReflectionAccessFilter> list4) {
        rtp0 d;
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        u6j u6jVar = new u6j(map, z8, list4);
        this.constructorConstructor = u6jVar;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.useJdkUnsafe = z8;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = i0p0Var;
        this.numberToNumberStrategy = i0p0Var2;
        this.reflectionFilters = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.C);
        arrayList.add(ObjectTypeAdapter.d(i0p0Var));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.r);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.d);
        arrayList.add(TypeAdapters.e);
        arrayList.add(TypeAdapters.f);
        TypeAdapter<Number> longAdapter = longAdapter(longSerializationPolicy);
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, longAdapter));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, doubleAdapter(z7)));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, floatAdapter(z7)));
        if (i0p0Var2 == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            d = NumberTypeAdapter.b;
        } else {
            d = NumberTypeAdapter.d(i0p0Var2);
        }
        arrayList.add(d);
        arrayList.add(TypeAdapters.h);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, atomicLongAdapter(longAdapter)));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter)));
        arrayList.add(TypeAdapters.j);
        arrayList.add(TypeAdapters.n);
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.t);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.o));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.p));
        arrayList.add(TypeAdapters.a(LazilyParsedNumber.class, TypeAdapters.q));
        arrayList.add(TypeAdapters.u);
        arrayList.add(TypeAdapters.v);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.y);
        arrayList.add(TypeAdapters.A);
        arrayList.add(TypeAdapters.w);
        arrayList.add(TypeAdapters.b);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.z);
        if (a.a) {
            arrayList.add(a.e);
            arrayList.add(a.d);
            arrayList.add(a.f);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.a);
        arrayList.add(new CollectionTypeAdapterFactory(u6jVar));
        arrayList.add(new MapTypeAdapterFactory(u6jVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(u6jVar);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.D);
        arrayList.add(new ReflectiveTypeAdapterFactory(u6jVar, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public void toJson(b9y b9yVar, Appendable appendable) throws JsonIOException {
        try {
            toJson(b9yVar, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new kpm0.a(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader newJsonReader = newJsonReader(reader);
        T t = (T) fromJson(newJsonReader, type);
        assertFullConsumption(t, newJsonReader);
        return t;
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    return getAdapter(xtp0.get(type)).b(jsonReader);
                } catch (IOException e) {
                    throw new JsonSyntaxException(e);
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (EOFException e3) {
                if (z) {
                    jsonReader.setLenient(isLenient);
                    return null;
                }
                throw new JsonSyntaxException(e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((b9y) u9y.b);
        }
        return toJson(obj, obj.getClass());
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((b9y) u9y.b, appendable);
        }
    }

    public <T> TypeAdapter<T> getAdapter(Class<T> cls) {
        return getAdapter(xtp0.get((Class) cls));
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        TypeAdapter adapter = getAdapter(xtp0.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                try {
                    adapter.c(jsonWriter, obj);
                } catch (AssertionError e) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e.getMessage());
                    assertionError.initCause(e);
                    throw assertionError;
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public <T> T fromJson(b9y b9yVar, Class<T> cls) throws JsonSyntaxException {
        return (T) ams.b(cls).cast(fromJson(b9yVar, (Type) cls));
    }

    public <T> T fromJson(b9y b9yVar, Type type) throws JsonSyntaxException {
        if (b9yVar == null) {
            return null;
        }
        gby gbyVar = new gby(gby.f);
        gbyVar.b = new Object[32];
        gbyVar.c = 0;
        gbyVar.d = new String[32];
        gbyVar.e = new int[32];
        gbyVar.p(b9yVar);
        return (T) fromJson(gbyVar, type);
    }

    public String toJson(b9y b9yVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(b9yVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(b9y b9yVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                TypeAdapters.B.c(jsonWriter, b9yVar);
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }
}
