package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import defpackage.afa;
import defpackage.b5k;
import defpackage.ckd;
import defpackage.eub;
import defpackage.euf;
import defpackage.gga;
import defpackage.ih0;
import defpackage.iha;
import defpackage.ihi;
import defpackage.ioa;
import defpackage.is8;
import defpackage.j13;
import defpackage.k0i;
import defpackage.kha;
import defpackage.kkb;
import defpackage.ln3;
import defpackage.m0i;
import defpackage.ne6;
import defpackage.o49;
import defpackage.ouf;
import defpackage.p49;
import defpackage.pfa;
import defpackage.tjj;
import defpackage.tk4;
import defpackage.u4k;
import defpackage.u5k;
import defpackage.ujj;
import defpackage.v4k;
import defpackage.x4k;
import defpackage.y4k;
import defpackage.y6a;
import defpackage.yga;
import defpackage.yz7;
import defpackage.zfa;
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
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
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
    final List<v4k> builderFactories;
    final List<v4k> builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final ln3 constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final ne6 excluder;
    final List<v4k> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, Object> instanceCreators;
    private final afa jsonAdapterFactory;
    final boolean lenient;
    final kkb longSerializationPolicy;
    final ujj numberToNumberStrategy;
    final ujj objectToNumberStrategy;
    final boolean prettyPrinting;
    final List<euf> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    private final ThreadLocal<Map<u5k<?>, u4k>> threadLocalAdapterResults;
    final int timeStyle;
    private final ConcurrentMap<u5k<?>, u4k> typeTokenCache;
    final boolean useJdkUnsafe;
    static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = yz7.a;
    static final ujj DEFAULT_OBJECT_TO_NUMBER_STRATEGY = tjj.a;
    static final ujj DEFAULT_NUMBER_TO_NUMBER_STRATEGY = tjj.b;

    public Gson(ne6 ne6Var, FieldNamingStrategy fieldNamingStrategy, Map<Type, Object> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, kkb kkbVar, String str, int i, int i2, List<v4k> list, List<v4k> list2, List<v4k> list3, ujj ujjVar, ujj ujjVar2, List<euf> list4) {
        this.threadLocalAdapterResults = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = ne6Var;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        ln3 ln3Var = new ln3(map, z8, list4);
        this.constructorConstructor = ln3Var;
        this.serializeNulls = z;
        this.complexMapKeySerialization = z2;
        this.generateNonExecutableJson = z3;
        this.htmlSafe = z4;
        this.prettyPrinting = z5;
        this.lenient = z6;
        this.serializeSpecialFloatingPointValues = z7;
        this.useJdkUnsafe = z8;
        this.longSerializationPolicy = kkbVar;
        this.datePattern = str;
        this.dateStyle = i;
        this.timeStyle = i2;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = ujjVar;
        this.numberToNumberStrategy = ujjVar2;
        this.reflectionFilters = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b5k.B);
        arrayList.add(ujjVar == tjj.a ? ckd.c : new j13(ujjVar, 2));
        arrayList.add(ne6Var);
        arrayList.addAll(list3);
        arrayList.add(b5k.r);
        arrayList.add(b5k.g);
        arrayList.add(b5k.d);
        arrayList.add(b5k.e);
        arrayList.add(b5k.f);
        u4k longAdapter = longAdapter(kkbVar);
        arrayList.add(new y4k(Long.TYPE, Long.class, longAdapter));
        arrayList.add(new y4k(Double.TYPE, Double.class, doubleAdapter(z7)));
        arrayList.add(new y4k(Float.TYPE, Float.class, floatAdapter(z7)));
        arrayList.add(ujjVar2 == tjj.b ? tk4.d : new j13(new tk4(ujjVar2), 1));
        arrayList.add(b5k.h);
        arrayList.add(b5k.i);
        int i3 = 0;
        arrayList.add(new x4k(AtomicLong.class, atomicLongAdapter(longAdapter), i3));
        arrayList.add(new x4k(AtomicLongArray.class, atomicLongArrayAdapter(longAdapter), i3));
        arrayList.add(b5k.j);
        arrayList.add(b5k.n);
        arrayList.add(b5k.s);
        arrayList.add(b5k.t);
        arrayList.add(new x4k(BigDecimal.class, b5k.o, i3));
        arrayList.add(new x4k(BigInteger.class, b5k.p, i3));
        arrayList.add(new x4k(ioa.class, b5k.q, i3));
        arrayList.add(b5k.u);
        arrayList.add(b5k.v);
        arrayList.add(b5k.x);
        arrayList.add(b5k.y);
        arrayList.add(b5k.A);
        arrayList.add(b5k.w);
        arrayList.add(b5k.b);
        arrayList.add(tk4.c);
        arrayList.add(b5k.z);
        if (m0i.a) {
            arrayList.add(m0i.e);
            arrayList.add(m0i.d);
            arrayList.add(m0i.f);
        }
        arrayList.add(ih0.d);
        arrayList.add(b5k.a);
        arrayList.add(new j13(ln3Var, i3));
        arrayList.add(new eub(ln3Var, z2));
        afa afaVar = new afa(ln3Var);
        this.jsonAdapterFactory = afaVar;
        arrayList.add(afaVar);
        arrayList.add(b5k.C);
        arrayList.add(new ouf(ln3Var, fieldNamingStrategy, ne6Var, afaVar, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new yga("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new yga(e);
            } catch (IOException e2) {
                throw new zfa(e2);
            }
        }
    }

    private static u4k atomicLongAdapter(u4k u4kVar) {
        return new k0i(new k0i(u4kVar, 1), 3);
    }

    private static u4k atomicLongArrayAdapter(u4k u4kVar) {
        return new k0i(new k0i(u4kVar, 2), 3);
    }

    public static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private u4k doubleAdapter(boolean z) {
        return z ? b5k.m : new o49(0);
    }

    private u4k floatAdapter(boolean z) {
        return z ? b5k.l : new o49(1);
    }

    private static u4k longAdapter(kkb kkbVar) {
        return kkbVar == kkb.a ? b5k.k : new o49(2);
    }

    @Deprecated
    public ne6 excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(JsonReader jsonReader, u5k<T> u5kVar) throws zfa, yga {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    return (T) getAdapter(u5kVar).a(jsonReader);
                } catch (EOFException e) {
                    if (!z) {
                        throw new yga(e);
                    }
                    jsonReader.setLenient(isLenient);
                    return null;
                } catch (IllegalStateException e2) {
                    throw new yga(e2);
                }
            } catch (IOException e3) {
                throw new yga(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> u4k getAdapter(u5k<T> u5kVar) {
        boolean z;
        Objects.requireNonNull(u5kVar, "type must not be null");
        u4k u4kVar = this.typeTokenCache.get(u5kVar);
        if (u4kVar != null) {
            return u4kVar;
        }
        Map<? extends u5k<?>, ? extends u4k> map = this.threadLocalAdapterResults.get();
        if (map == null) {
            map = new HashMap<>();
            this.threadLocalAdapterResults.set(map);
            z = true;
        } else {
            u4k u4kVar2 = (u4k) map.get(u5kVar);
            if (u4kVar2 != null) {
                return u4kVar2;
            }
            z = false;
        }
        try {
            p49 p49Var = new p49();
            p49Var.a = null;
            map.put(u5kVar, p49Var);
            Iterator<v4k> it = this.factories.iterator();
            u4k u4kVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                u4kVar3 = it.next().a(this, u5kVar);
                if (u4kVar3 != null) {
                    if (p49Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    p49Var.a = u4kVar3;
                    map.put(u5kVar, u4kVar3);
                }
            }
            if (z) {
                this.threadLocalAdapterResults.remove();
            }
            if (u4kVar3 == null) {
                is8.c(u5kVar, "GSON (2.10.1) cannot handle ");
                return null;
            }
            if (z) {
                this.typeTokenCache.putAll(map);
            }
            return u4kVar3;
        } catch (Throwable th) {
            if (z) {
                this.threadLocalAdapterResults.remove();
            }
            throw th;
        }
    }

    public <T> u4k getDelegateAdapter(v4k v4kVar, u5k<T> u5kVar) {
        if (!this.factories.contains(v4kVar)) {
            v4kVar = this.jsonAdapterFactory;
        }
        boolean z = false;
        for (v4k v4kVar2 : this.factories) {
            if (z) {
                u4k a = v4kVar2.a(this, u5kVar);
                if (a != null) {
                    return a;
                }
            } else if (v4kVar2 == v4kVar) {
                z = true;
            }
        }
        is8.c(u5kVar, "GSON cannot serialize ");
        return null;
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

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws zfa {
        u4k adapter = getAdapter(new u5k(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                try {
                    adapter.b(jsonWriter, obj);
                } catch (IOException e) {
                    throw new zfa(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public pfa toJsonTree(Object obj) {
        return obj == null ? gga.a : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public pfa toJsonTree(Object obj, Type type) {
        kha khaVar = new kha();
        toJson(obj, type, khaVar);
        return khaVar.h();
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws zfa, yga {
        return (T) fromJson(jsonReader, new u5k<>(type));
    }

    public <T> T fromJson(Reader reader, Type type) throws zfa, yga {
        return (T) fromJson(reader, new u5k<>(type));
    }

    public <T> T fromJson(String str, Type type) throws yga {
        return (T) fromJson(str, new u5k<>(type));
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws zfa {
        try {
            toJson(obj, type, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new ihi(appendable)));
        } catch (IOException e) {
            throw new zfa(e);
        }
    }

    public <T> T fromJson(pfa pfaVar, Class<T> cls) throws yga {
        return (T) y6a.P(cls).cast(fromJson(pfaVar, new u5k<>(cls)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Gson() {
        this(r1, r2, r3, false, false, false, true, false, false, false, true, kkb.a, r13, 2, 2, r16, r16, r16, DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, r16);
        ne6 ne6Var = ne6.g;
        FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
        Map map = Collections.EMPTY_MAP;
        String str = DEFAULT_DATE_PATTERN;
        List list = Collections.EMPTY_LIST;
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws yga, zfa {
        return (T) y6a.P(cls).cast(fromJson(reader, new u5k<>(cls)));
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return toJson((pfa) gga.a);
        }
        return toJson(obj, obj.getClass());
    }

    public <T> T fromJson(String str, Class<T> cls) throws yga {
        return (T) y6a.P(cls).cast(fromJson(str, new u5k<>(cls)));
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public <T> T fromJson(String str, u5k<T> u5kVar) throws yga {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), u5kVar);
    }

    public void toJson(Object obj, Appendable appendable) throws zfa {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((pfa) gga.a, appendable);
        }
    }

    public <T> T fromJson(Reader reader, u5k<T> u5kVar) throws zfa, yga {
        JsonReader newJsonReader = newJsonReader(reader);
        T t = (T) fromJson(newJsonReader, u5kVar);
        assertFullConsumption(t, newJsonReader);
        return t;
    }

    public void toJson(pfa pfaVar, Appendable appendable) throws zfa {
        try {
            toJson(pfaVar, newJsonWriter(appendable instanceof Writer ? (Writer) appendable : new ihi(appendable)));
        } catch (IOException e) {
            throw new zfa(e);
        }
    }

    public <T> T fromJson(pfa pfaVar, Type type) throws yga {
        return (T) fromJson(pfaVar, new u5k<>(type));
    }

    public <T> T fromJson(pfa pfaVar, u5k<T> u5kVar) throws yga {
        if (pfaVar == null) {
            return null;
        }
        iha ihaVar = new iha(iha.e);
        ihaVar.a = new Object[32];
        ihaVar.b = 0;
        ihaVar.c = new String[32];
        ihaVar.d = new int[32];
        ihaVar.n(pfaVar);
        return (T) fromJson(ihaVar, u5kVar);
    }

    public String toJson(pfa pfaVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(pfaVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(pfa pfaVar, JsonWriter jsonWriter) throws zfa {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                x4k x4kVar = b5k.a;
                o49.e(pfaVar, jsonWriter);
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new zfa(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public <T> u4k getAdapter(Class<T> cls) {
        return getAdapter(new u5k<>(cls));
    }
}
