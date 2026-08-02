package com.google.gson.internal.bind;

import P4.f;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.k;
import com.google.gson.internal.s;
import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import g.C6594f;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public final class TypeAdapters {

    /* renamed from: A, reason: collision with root package name */
    public static final t f59897A;

    /* renamed from: B, reason: collision with root package name */
    public static final t f59898B;

    /* renamed from: a, reason: collision with root package name */
    public static final t f59899a = new AnonymousClass29(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Class read(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee " + s.a("java-lang-class-unsupported"));
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?\nSee " + s.a("java-lang-class-unsupported"));
        }
    }.nullSafe());

    /* renamed from: b, reason: collision with root package name */
    public static final t f59900b = new AnonymousClass29(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final BitSet read(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken peek = jsonReader.peek();
            int i11 = 0;
            while (peek != JsonToken.END_ARRAY) {
                int i12 = a.f59937a[peek.ordinal()];
                boolean z11 = true;
                if (i12 == 1 || i12 == 2) {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt == 0) {
                        z11 = false;
                    } else if (nextInt != 1) {
                        StringBuilder f7 = f.f(nextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        f7.append(jsonReader.getPreviousPath());
                        throw new n(f7.toString());
                    }
                } else {
                    if (i12 != 3) {
                        throw new n("Invalid bitset value type: " + peek + "; at path " + jsonReader.getPath());
                    }
                    z11 = jsonReader.nextBoolean();
                }
                if (z11) {
                    bitSet.set(i11);
                }
                i11++;
                peek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            jsonWriter.beginArray();
            int length = bitSet2.length();
            for (int i11 = 0; i11 < length; i11++) {
                jsonWriter.value(bitSet2.get(i11) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }.nullSafe());

    /* renamed from: c, reason: collision with root package name */
    public static final TypeAdapter<Boolean> f59901c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f59902d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f59903e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f59904f;

    /* renamed from: g, reason: collision with root package name */
    public static final t f59905g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f59906h;

    /* renamed from: i, reason: collision with root package name */
    public static final t f59907i;

    /* renamed from: j, reason: collision with root package name */
    public static final t f59908j;

    /* renamed from: k, reason: collision with root package name */
    public static final TypeAdapter<Number> f59909k;

    /* renamed from: l, reason: collision with root package name */
    public static final t f59910l;

    /* renamed from: m, reason: collision with root package name */
    public static final TypeAdapter<BigDecimal> f59911m;

    /* renamed from: n, reason: collision with root package name */
    public static final TypeAdapter<BigInteger> f59912n;

    /* renamed from: o, reason: collision with root package name */
    public static final TypeAdapter<k> f59913o;

    /* renamed from: p, reason: collision with root package name */
    public static final t f59914p;

    /* renamed from: q, reason: collision with root package name */
    public static final t f59915q;

    /* renamed from: r, reason: collision with root package name */
    public static final t f59916r;

    /* renamed from: s, reason: collision with root package name */
    public static final t f59917s;

    /* renamed from: t, reason: collision with root package name */
    public static final t f59918t;

    /* renamed from: u, reason: collision with root package name */
    public static final t f59919u;

    /* renamed from: v, reason: collision with root package name */
    public static final t f59920v;

    /* renamed from: w, reason: collision with root package name */
    public static final t f59921w;

    /* renamed from: x, reason: collision with root package name */
    public static final t f59922x;

    /* renamed from: y, reason: collision with root package name */
    public static final t f59923y;

    /* renamed from: z, reason: collision with root package name */
    public static final TypeAdapter<JsonElement> f59924z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    class AnonymousClass29 implements t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f59927a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f59928b;

        AnonymousClass29(Class cls, TypeAdapter typeAdapter) {
            this.f59927a = cls;
            this.f59928b = typeAdapter;
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == this.f59927a) {
                return this.f59928b;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f59927a.getName() + ",adapter=" + this.f59928b + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    class AnonymousClass30 implements t {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Class f59929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f59930b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f59931c;

        AnonymousClass30(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.f59929a = cls;
            this.f59930b = cls2;
            this.f59931c = typeAdapter;
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == this.f59929a || rawType == this.f59930b) {
                return this.f59931c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.f59930b.getName() + "+" + this.f59929a.getName() + ",adapter=" + this.f59931c + "]";
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59937a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59937a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59937a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59937a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                jsonWriter.value(bool);
            }
        };
        f59901c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Boolean read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                jsonWriter.value(bool2 == null ? "null" : bool2.toString());
            }
        };
        f59902d = new AnonymousClass30(Boolean.TYPE, Boolean.class, typeAdapter);
        f59903e = new AnonymousClass30(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    StringBuilder f7 = f.f(nextInt, "Lossy conversion from ", " to byte; at path ");
                    f7.append(jsonReader.getPreviousPath());
                    throw new n(f7.toString());
                } catch (NumberFormatException e11) {
                    throw new n(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.byteValue());
                }
            }
        });
        f59904f = new AnonymousClass30(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    StringBuilder f7 = f.f(nextInt, "Lossy conversion from ", " to short; at path ");
                    f7.append(jsonReader.getPreviousPath());
                    throw new n(f7.toString());
                } catch (NumberFormatException e11) {
                    throw new n(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.shortValue());
                }
            }
        });
        f59905g = new AnonymousClass30(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e11) {
                    throw new n(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                if (number == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(r4.intValue());
                }
            }
        });
        f59906h = new AnonymousClass29(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final AtomicInteger read(JsonReader jsonReader) throws IOException {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e11) {
                    throw new n(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
                jsonWriter.value(atomicInteger.get());
            }
        }.nullSafe());
        f59907i = new AnonymousClass29(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final AtomicBoolean read(JsonReader jsonReader) throws IOException {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
                jsonWriter.value(atomicBoolean.get());
            }
        }.nullSafe());
        f59908j = new AnonymousClass29(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final AtomicIntegerArray read(JsonReader jsonReader) throws IOException {
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e11) {
                        throw new n(e11);
                    }
                }
                jsonReader.endArray();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicIntegerArray.set(i11, ((Integer) arrayList.get(i11)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
                jsonWriter.beginArray();
                int length = atomicIntegerArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    jsonWriter.value(r6.get(i11));
                }
                jsonWriter.endArray();
            }
        }.nullSafe());
        f59909k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Number read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e11) {
                    throw new n(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number2.longValue());
                }
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
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
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(number2.floatValue());
                }
                jsonWriter.value(number2);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
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
                } else {
                    jsonWriter.value(number2.doubleValue());
                }
            }
        };
        f59910l = new AnonymousClass30(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Character read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.length() == 1) {
                    return Character.valueOf(nextString.charAt(0));
                }
                StringBuilder b11 = C6594f.b("Expecting character, got: ", nextString, "; at ");
                b11.append(jsonReader.getPreviousPath());
                throw new n(b11.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Character ch2) throws IOException {
                Character ch3 = ch2;
                jsonWriter.value(ch3 == null ? null : String.valueOf(ch3));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final String read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                if (peek != JsonToken.NULL) {
                    return peek == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, String str) throws IOException {
                jsonWriter.value(str);
            }
        };
        f59911m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final BigDecimal read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return com.google.gson.internal.n.b(nextString);
                } catch (NumberFormatException e11) {
                    StringBuilder b11 = C6594f.b("Failed parsing '", nextString, "' as BigDecimal; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new n(b11.toString(), e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
                jsonWriter.value(bigDecimal);
            }
        };
        f59912n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final BigInteger read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return com.google.gson.internal.n.c(nextString);
                } catch (NumberFormatException e11) {
                    StringBuilder b11 = C6594f.b("Failed parsing '", nextString, "' as BigInteger; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new n(b11.toString(), e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
                jsonWriter.value(bigInteger);
            }
        };
        f59913o = new TypeAdapter<k>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final k read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new k(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, k kVar) throws IOException {
                jsonWriter.value(kVar);
            }
        };
        f59914p = new AnonymousClass29(String.class, typeAdapter2);
        f59915q = new AnonymousClass29(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final StringBuilder read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
                StringBuilder sb3 = sb2;
                jsonWriter.value(sb3 == null ? null : sb3.toString());
            }
        });
        f59916r = new AnonymousClass29(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final StringBuffer read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                jsonWriter.value(stringBuffer2 == null ? null : stringBuffer2.toString());
            }
        });
        f59917s = new AnonymousClass29(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final URL read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                if (nextString.equals("null")) {
                    return null;
                }
                return new URL(nextString);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, URL url) throws IOException {
                URL url2 = url;
                jsonWriter.value(url2 == null ? null : url2.toExternalForm());
            }
        });
        f59918t = new AnonymousClass29(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final URI read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                try {
                    String nextString = jsonReader.nextString();
                    if (nextString.equals("null")) {
                        return null;
                    }
                    return new URI(nextString);
                } catch (URISyntaxException e11) {
                    throw new j(e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, URI uri) throws IOException {
                URI uri2 = uri;
                jsonWriter.value(uri2 == null ? null : uri2.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final InetAddress read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.nextString());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                jsonWriter.value(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        f59919u = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.t
            public final <T2> TypeAdapter<T2> create(Gson gson, com.google.gson.reflect.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(JsonReader jsonReader) throws IOException {
                            Object read = typeAdapter3.read(jsonReader);
                            if (read != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(read)) {
                                    throw new n("Expected a " + cls2.getName() + " but was " + read.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                                }
                            }
                            return read;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                            typeAdapter3.write(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter3 + "]";
            }
        };
        f59920v = new AnonymousClass29(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final UUID read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                try {
                    return UUID.fromString(nextString);
                } catch (IllegalArgumentException e11) {
                    StringBuilder b11 = C6594f.b("Failed parsing '", nextString, "' as UUID; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new n(b11.toString(), e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                jsonWriter.value(uuid2 == null ? null : uuid2.toString());
            }
        });
        f59921w = new AnonymousClass29(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Currency read(JsonReader jsonReader) throws IOException {
                String nextString = jsonReader.nextString();
                try {
                    return Currency.getInstance(nextString);
                } catch (IllegalArgumentException e11) {
                    StringBuilder b11 = C6594f.b("Failed parsing '", nextString, "' as Currency; at path ");
                    b11.append(jsonReader.getPreviousPath());
                    throw new n(b11.toString(), e11);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Currency currency) throws IOException {
                jsonWriter.value(currency.getCurrencyCode());
            }
        }.nullSafe());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Calendar read(JsonReader jsonReader) throws IOException {
                int nextInt;
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                jsonReader.beginObject();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (jsonReader.peek() != JsonToken.END_OBJECT) {
                    String nextName = jsonReader.nextName();
                    nextInt = jsonReader.nextInt();
                    nextName.getClass();
                    switch (nextName) {
                        case "dayOfMonth":
                            i13 = nextInt;
                            break;
                        case "minute":
                            i15 = nextInt;
                            break;
                        case "second":
                            i16 = nextInt;
                            break;
                        case "year":
                            i11 = nextInt;
                            break;
                        case "month":
                            i12 = nextInt;
                            break;
                        case "hourOfDay":
                            i14 = nextInt;
                            break;
                    }
                }
                jsonReader.endObject();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Calendar calendar) throws IOException {
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
        f59922x = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.t
            public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return TypeAdapter.this;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + TypeAdapter.this + "]";
            }
        };
        f59923y = new AnonymousClass29(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Locale read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Locale locale) throws IOException {
                Locale locale2 = locale;
                jsonWriter.value(locale2 == null ? null : locale2.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.f59848a;
        f59924z = jsonElementTypeAdapter;
        final Class<JsonElement> cls2 = JsonElement.class;
        f59897A = new t() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.t
            public final <T2> TypeAdapter<T2> create(Gson gson, com.google.gson.reflect.a<T2> aVar) {
                final Class rawType = aVar.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return (TypeAdapter<T2>) new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object read(JsonReader jsonReader) throws IOException {
                            Object read = jsonElementTypeAdapter.read(jsonReader);
                            if (read != null) {
                                Class cls22 = rawType;
                                if (!cls22.isInstance(read)) {
                                    throw new n("Expected a " + cls22.getName() + " but was " + read.getClass().getName() + "; at path " + jsonReader.getPreviousPath());
                                }
                            }
                            return read;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
                            jsonElementTypeAdapter.write(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        f59898B = EnumTypeAdapter.f59840d;
    }

    public static <TT> t a(final com.google.gson.reflect.a<TT> aVar, final TypeAdapter<TT> typeAdapter) {
        return new t() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.t
            public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar2) {
                if (aVar2.equals(com.google.gson.reflect.a.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> t b(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new AnonymousClass29(cls, typeAdapter);
    }

    public static <TT> t c(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new AnonymousClass30(cls, cls2, typeAdapter);
    }
}
