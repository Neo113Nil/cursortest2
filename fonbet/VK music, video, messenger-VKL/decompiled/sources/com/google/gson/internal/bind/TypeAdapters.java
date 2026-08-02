package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import xsna.b9y;
import xsna.gby;
import xsna.hay;
import xsna.ji;
import xsna.l8y;
import xsna.pmi0;
import xsna.rtp0;
import xsna.t33;
import xsna.u9y;
import xsna.x9y;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class TypeAdapters {
    public static final rtp0 A;
    public static final TypeAdapter<b9y> B;
    public static final rtp0 C;
    public static final rtp0 D;
    public static final rtp0 a = new AnonymousClass31(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class b(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }.a());
    public static final rtp0 b = new AnonymousClass31(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final BitSet b(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken peek = jsonReader.peek();
            int i2 = 0;
            while (peek != JsonToken.END_ARRAY) {
                int i3 = a.a[peek.ordinal()];
                boolean z2 = true;
                if (i3 == 1 || i3 == 2) {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt == 0) {
                        z2 = false;
                    } else if (nextInt != 1) {
                        StringBuilder b2 = ji.b(nextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        b2.append(jsonReader.getPreviousPath());
                        throw new JsonSyntaxException(b2.toString());
                    }
                } else {
                    if (i3 != 3) {
                        throw new JsonSyntaxException("Invalid bitset value type: " + peek + "; at path " + jsonReader.getPath());
                    }
                    z2 = jsonReader.nextBoolean();
                }
                if (z2) {
                    bitSet.set(i2);
                }
                i2++;
                peek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            jsonWriter.beginArray();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.value(bitSet2.get(i2) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }.a());
    public static final TypeAdapter<Boolean> c;
    public static final rtp0 d;
    public static final rtp0 e;
    public static final rtp0 f;
    public static final rtp0 g;
    public static final rtp0 h;
    public static final rtp0 i;
    public static final rtp0 j;
    public static final TypeAdapter<Number> k;
    public static final TypeAdapter<Number> l;
    public static final TypeAdapter<Number> m;
    public static final rtp0 n;
    public static final TypeAdapter<BigDecimal> o;
    public static final TypeAdapter<BigInteger> p;
    public static final TypeAdapter<LazilyParsedNumber> q;
    public static final rtp0 r;
    public static final rtp0 s;
    public static final rtp0 t;
    public static final rtp0 u;
    public static final rtp0 v;
    public static final rtp0 w;
    public static final rtp0 x;
    public static final rtp0 y;
    public static final rtp0 z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    public class AnonymousClass31 implements rtp0 {
        public final /* synthetic */ Class b;
        public final /* synthetic */ TypeAdapter c;

        public AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            this.b = cls;
            this.c = typeAdapter;
        }

        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            if (xtp0Var.getRawType() == this.b) {
                return this.c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.b.getName() + ",adapter=" + this.c + X3.j.e;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32, reason: invalid class name */
    public class AnonymousClass32 implements rtp0 {
        public final /* synthetic */ Class b;
        public final /* synthetic */ Class c;
        public final /* synthetic */ TypeAdapter d;

        public AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.b = cls;
            this.c = cls2;
            this.d = typeAdapter;
        }

        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            Class<? super T> rawType = xtp0Var.getRawType();
            if (rawType == this.b || rawType == this.c) {
                return this.d;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.c.getName() + "+" + this.b.getName() + ",adapter=" + this.d + X3.j.e;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34, reason: invalid class name */
    public class AnonymousClass34 implements rtp0 {
        public final /* synthetic */ Class b;
        public final /* synthetic */ TypeAdapter c;

        public AnonymousClass34(Class cls, TypeAdapter typeAdapter) {
            this.b = cls;
            this.c = typeAdapter;
        }

        @Override // xsna.rtp0
        public final <T2> TypeAdapter<T2> a(Gson gson, xtp0<T2> xtp0Var) {
            final Class<? super T2> rawType = xtp0Var.getRawType();
            if (this.b.isAssignableFrom(rawType)) {
                return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                    @Override // com.google.gson.TypeAdapter
                    public final T1 b(JsonReader jsonReader) throws IOException {
                        T1 t1 = (T1) AnonymousClass34.this.c.b(jsonReader);
                        if (t1 != null) {
                            Class cls = rawType;
                            if (!cls.isInstance(t1)) {
                                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + t1.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                            }
                        }
                        return t1;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public final void c(JsonWriter jsonWriter, T1 t1) throws IOException {
                        AnonymousClass34.this.c.c(jsonWriter, t1);
                    }
                };
            }
            return null;
        }

        public final String toString() {
            return "Factory[typeHierarchy=" + this.b.getName() + ",adapter=" + this.c + X3.j.e;
        }
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        public final HashMap a = new HashMap();
        public final HashMap b = new HashMap();
        public final HashMap c = new HashMap();

        public class a implements PrivilegedAction<Field[]> {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            public final Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    String str = r4.toString();
                    pmi0 pmi0Var = (pmi0) field.getAnnotation(pmi0.class);
                    if (pmi0Var != null) {
                        name = pmi0Var.value();
                        for (String str2 : pmi0Var.alternate()) {
                            this.a.put(str2, r4);
                        }
                    }
                    this.a.put(name, r4);
                    this.b.put(str, r4);
                    this.c.put(r4, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String nextString = jsonReader.nextString();
            Enum r0 = (Enum) this.a.get(nextString);
            return r0 == null ? (Enum) this.b.get(nextString) : r0;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            jsonWriter.value(r3 == null ? null : (String) this.c.get(r3));
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean b(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                jsonWriter.value(bool2 == null ? "null" : bool2.toString());
            }
        };
        d = new AnonymousClass32(Boolean.TYPE, Boolean.class, typeAdapter);
        e = new AnonymousClass32(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    StringBuilder b2 = ji.b(nextInt, "Lossy conversion from ", " to byte; at path ");
                    b2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(b2.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        });
        f = new AnonymousClass32(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    StringBuilder b2 = ji.b(nextInt, "Lossy conversion from ", " to short; at path ");
                    b2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(b2.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        });
        g = new AnonymousClass32(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        });
        h = new AnonymousClass31(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger b(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.a());
        i = new AnonymousClass31(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean b(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.a());
        j = new AnonymousClass31(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray b(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.value(r6.get(i2));
                }
                jsonWriter.endArray();
            }
        }.a());
        k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Number number) throws IOException {
                jsonWriter.value(number);
            }
        };
        l = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
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
                jsonWriter.value(number);
            }
        };
        m = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
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
                jsonWriter.value(number);
            }
        };
        n = new AnonymousClass32(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Character b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                StringBuilder a2 = t33.a("Expecting character, got: ", nextString, "; at ");
                a2.append(jsonReader.getPreviousPath());
                throw new JsonSyntaxException(a2.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Character ch) throws IOException {
                Character ch2 = ch;
                jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final String b(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        o = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return new BigDecimal(nextString);
                } catch (NumberFormatException e2) {
                    StringBuilder a2 = t33.a("Failed parsing '", nextString, "' as BigDecimal; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(a2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        p = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigInteger b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return new BigInteger(nextString);
                } catch (NumberFormatException e2) {
                    StringBuilder a2 = t33.a("Failed parsing '", nextString, "' as BigInteger; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(a2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        q = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final LazilyParsedNumber b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new LazilyParsedNumber(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, LazilyParsedNumber lazilyParsedNumber) throws IOException {
                jsonWriter.value(lazilyParsedNumber);
            }
        };
        r = new AnonymousClass31(String.class, typeAdapter2);
        s = new AnonymousClass31(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                jsonWriter.value(sb2 == null ? null : sb2.toString());
            }
        });
        t = new AnonymousClass31(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                jsonWriter.value(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        u = new AnonymousClass31(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if ("null".equals(nextString)) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, URL url) throws IOException {
                URL url2 = url;
                jsonWriter.value(url2 == null ? null : url2.toExternalForm());
            }
        });
        v = new AnonymousClass31(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if ("null".equals(nextString)) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, URI uri) throws IOException {
                URI uri2 = uri;
                jsonWriter.value(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        w = new AnonymousClass34(InetAddress.class, new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                jsonWriter.value(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        });
        x = new AnonymousClass31(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return UUID.fromString(nextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder a2 = t33.a("Failed parsing '", nextString, "' as UUID; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(a2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                jsonWriter.value(uuid2 == null ? null : uuid2.toString());
            }
        });
        y = new AnonymousClass31(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency b(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(nextString);
                } catch (IllegalArgumentException e2) {
                    StringBuilder a2 = t33.a("Failed parsing '", nextString, "' as Currency; at path ");
                    a2.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(a2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.a());
        final TypeAdapter<Calendar> typeAdapter3 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Calendar b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    int nextInt = jsonReader.nextInt();
                    if ("year".equals(nextName)) {
                        i2 = nextInt;
                    } else if ("month".equals(nextName)) {
                        i3 = nextInt;
                    } else if ("dayOfMonth".equals(nextName)) {
                        i4 = nextInt;
                    } else if ("hourOfDay".equals(nextName)) {
                        i5 = nextInt;
                    } else if ("minute".equals(nextName)) {
                        i6 = nextInt;
                    } else if ("second".equals(nextName)) {
                        i7 = nextInt;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Calendar calendar) throws IOException {
                if (calendar == null) {
                    jsonWriter.nullValue();
                    return;
                }
                jsonWriter.beginObject();
                jsonWriter.name("year");
                jsonWriter.value(r4.get(1));
                jsonWriter.name("month");
                jsonWriter.value(r4.get(2));
                jsonWriter.name("dayOfMonth");
                jsonWriter.value(r4.get(5));
                jsonWriter.name("hourOfDay");
                jsonWriter.value(r4.get(11));
                jsonWriter.name("minute");
                jsonWriter.value(r4.get(12));
                jsonWriter.name("second");
                jsonWriter.value(r4.get(13));
                jsonWriter.endObject();
            }
        };
        z = new rtp0() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // xsna.rtp0
            public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
                Class<? super T> rawType = xtp0Var.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return TypeAdapter.this;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + TypeAdapter.this + X3.j.e;
            }
        };
        A = new AnonymousClass31(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Locale b(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), BundleUtil.UNDERLINE_TAG);
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Locale locale) throws IOException {
                Locale locale2 = locale;
                jsonWriter.value(locale2 == null ? null : locale2.toString());
            }
        });
        TypeAdapter<b9y> typeAdapter4 = new TypeAdapter<b9y>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            public static b9y d(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = a.a[jsonToken.ordinal()];
                if (i2 == 1) {
                    return new hay(new LazilyParsedNumber(jsonReader.nextString()));
                }
                if (i2 == 2) {
                    return new hay(jsonReader.nextString());
                }
                if (i2 == 3) {
                    return new hay(Boolean.valueOf(jsonReader.nextBoolean()));
                }
                if (i2 == 6) {
                    jsonReader.nextNull();
                    return u9y.b;
                }
                throw new IllegalStateException("Unexpected token: " + jsonToken);
            }

            public static b9y e(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
                int i2 = a.a[jsonToken.ordinal()];
                if (i2 == 4) {
                    jsonReader.beginArray();
                    return new l8y();
                }
                if (i2 != 5) {
                    return null;
                }
                jsonReader.beginObject();
                return new x9y();
            }

            public static void f(b9y b9yVar, JsonWriter jsonWriter) throws IOException {
                if (b9yVar == null || (b9yVar instanceof u9y)) {
                    jsonWriter.nullValue();
                    return;
                }
                if (b9yVar instanceof hay) {
                    hay i2 = b9yVar.i();
                    Serializable serializable = i2.b;
                    if (serializable instanceof Number) {
                        jsonWriter.value(i2.l());
                        return;
                    } else if (serializable instanceof Boolean) {
                        jsonWriter.value(i2.d());
                        return;
                    } else {
                        jsonWriter.value(i2.k());
                        return;
                    }
                }
                if (b9yVar instanceof l8y) {
                    jsonWriter.beginArray();
                    Iterator it = b9yVar.g().b.iterator();
                    while (it.hasNext()) {
                        f((b9y) it.next(), jsonWriter);
                    }
                    jsonWriter.endArray();
                    return;
                }
                if (!(b9yVar instanceof x9y)) {
                    throw new IllegalArgumentException("Couldn't write " + b9yVar.getClass());
                }
                jsonWriter.beginObject();
                Iterator it2 = ((LinkedTreeMap.b) b9yVar.h().b.entrySet()).iterator();
                while (((LinkedTreeMap.d) it2).hasNext()) {
                    Map.Entry a2 = ((LinkedTreeMap.b.a) it2).a();
                    jsonWriter.name((String) a2.getKey());
                    f((b9y) a2.getValue(), jsonWriter);
                }
                jsonWriter.endObject();
            }

            @Override // com.google.gson.TypeAdapter
            public final b9y b(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof gby) {
                    gby gbyVar = (gby) jsonReader;
                    JsonToken peek = gbyVar.peek();
                    if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
                        b9y b9yVar = (b9y) gbyVar.n();
                        gbyVar.skipValue();
                        return b9yVar;
                    }
                    throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
                }
                JsonToken peek2 = jsonReader.peek();
                b9y e2 = e(jsonReader, peek2);
                if (e2 == null) {
                    return d(jsonReader, peek2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (jsonReader.hasNext()) {
                        String nextName = e2 instanceof x9y ? jsonReader.nextName() : null;
                        JsonToken peek3 = jsonReader.peek();
                        b9y e3 = e(jsonReader, peek3);
                        boolean z2 = e3 != null;
                        if (e3 == null) {
                            e3 = d(jsonReader, peek3);
                        }
                        if (e2 instanceof l8y) {
                            ((l8y) e2).l(e3);
                        } else {
                            ((x9y) e2).l(e3, nextName);
                        }
                        if (z2) {
                            arrayDeque.addLast(e2);
                            e2 = e3;
                        }
                    } else {
                        if (e2 instanceof l8y) {
                            jsonReader.endArray();
                        } else {
                            jsonReader.endObject();
                        }
                        if (arrayDeque.isEmpty()) {
                            return e2;
                        }
                        e2 = (b9y) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final /* bridge */ /* synthetic */ void c(JsonWriter jsonWriter, b9y b9yVar) throws IOException {
                f(b9yVar, jsonWriter);
            }
        };
        B = typeAdapter4;
        C = new AnonymousClass34(b9y.class, typeAdapter4);
        D = new rtp0() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // xsna.rtp0
            public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
                Class<? super T> rawType = xtp0Var.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public static <TT> rtp0 a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass31(cls, typeAdapter);
    }

    public static <TT> rtp0 b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass32(cls, cls2, typeAdapter);
    }

    public static <TT> rtp0 c(final xtp0<TT> xtp0Var, final TypeAdapter<TT> typeAdapter) {
        return new rtp0() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // xsna.rtp0
            public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var2) {
                if (xtp0Var2.equals(xtp0.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <T1> rtp0 d(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
        return new AnonymousClass34(cls, typeAdapter);
    }
}
