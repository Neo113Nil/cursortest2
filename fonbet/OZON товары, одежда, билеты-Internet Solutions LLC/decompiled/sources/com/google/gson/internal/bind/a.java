package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.k;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends JsonReader {

    /* renamed from: e, reason: collision with root package name */
    private static final Reader f59938e = new C0910a();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f59939f = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Object[] f59940a;

    /* renamed from: b, reason: collision with root package name */
    private int f59941b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f59942c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f59943d;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    final class C0910a extends Reader {
        C0910a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59944a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59944a = iArr;
            try {
                iArr[JsonToken.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59944a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59944a[JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59944a[JsonToken.END_DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(JsonElement jsonElement) {
        super(f59938e);
        this.f59940a = new Object[32];
        this.f59941b = 0;
        this.f59942c = new String[32];
        this.f59943d = new int[32];
        p(jsonElement);
    }

    private void c(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    private String getPath(boolean z11) {
        StringBuilder sb2 = new StringBuilder("$");
        int i11 = 0;
        while (true) {
            int i12 = this.f59941b;
            if (i11 >= i12) {
                return sb2.toString();
            }
            Object[] objArr = this.f59940a;
            Object obj = objArr[i11];
            if (obj instanceof JsonArray) {
                i11++;
                if (i11 < i12 && (objArr[i11] instanceof Iterator)) {
                    int i13 = this.f59943d[i11];
                    if (z11 && i13 > 0 && (i11 == i12 - 1 || i11 == i12 - 2)) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i11 = i11 + 1) < i12 && (objArr[i11] instanceof Iterator)) {
                sb2.append('.');
                String str = this.f59942c[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i11++;
        }
    }

    private String j(boolean z11) throws IOException {
        c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) k()).next();
        String str = (String) entry.getKey();
        this.f59942c[this.f59941b - 1] = z11 ? "<skipped>" : str;
        p(entry.getValue());
        return str;
    }

    private Object k() {
        return this.f59940a[this.f59941b - 1];
    }

    private String locationString() {
        return " at path " + getPath(false);
    }

    private Object m() {
        Object[] objArr = this.f59940a;
        int i11 = this.f59941b - 1;
        this.f59941b = i11;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    private void p(Object obj) {
        int i11 = this.f59941b;
        Object[] objArr = this.f59940a;
        if (i11 == objArr.length) {
            int i12 = i11 * 2;
            this.f59940a = Arrays.copyOf(objArr, i12);
            this.f59943d = Arrays.copyOf(this.f59943d, i12);
            this.f59942c = (String[]) Arrays.copyOf(this.f59942c, i12);
        }
        Object[] objArr2 = this.f59940a;
        int i13 = this.f59941b;
        this.f59941b = i13 + 1;
        objArr2[i13] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        c(JsonToken.BEGIN_ARRAY);
        p(((JsonArray) k()).iterator());
        this.f59943d[this.f59941b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        c(JsonToken.BEGIN_OBJECT);
        p(((JsonObject) k()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f59940a = new Object[]{f59939f};
        this.f59941b = 1;
    }

    final JsonElement d() throws IOException {
        JsonToken peek = peek();
        if (peek != JsonToken.NAME && peek != JsonToken.END_ARRAY && peek != JsonToken.END_OBJECT && peek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) k();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + peek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        c(JsonToken.END_ARRAY);
        m();
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        c(JsonToken.END_OBJECT);
        this.f59942c[this.f59941b - 1] = null;
        m();
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        c(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) m()).getAsBoolean();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double asDouble = ((JsonPrimitive) k()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + asDouble);
        }
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int asInt = ((JsonPrimitive) k()).getAsInt();
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asInt;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long asLong = ((JsonPrimitive) k()).getAsLong();
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        return j(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        c(JsonToken.NULL);
        m();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String asString = ((JsonPrimitive) m()).getAsString();
        int i11 = this.f59941b;
        if (i11 > 0) {
            int[] iArr = this.f59943d;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asString;
    }

    public final void o() throws IOException {
        c(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) k()).next();
        p(entry.getValue());
        p(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        if (this.f59941b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object k11 = k();
        if (k11 instanceof Iterator) {
            boolean z11 = this.f59940a[this.f59941b - 2] instanceof JsonObject;
            Iterator it = (Iterator) k11;
            if (!it.hasNext()) {
                return z11 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z11) {
                return JsonToken.NAME;
            }
            p(it.next());
            return peek();
        }
        if (k11 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (k11 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (k11 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) k11;
            if (jsonPrimitive.isString()) {
                return JsonToken.STRING;
            }
            if (jsonPrimitive.isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if (jsonPrimitive.isNumber()) {
                return JsonToken.NUMBER;
            }
            throw new AssertionError();
        }
        if (k11 instanceof k) {
            return JsonToken.NULL;
        }
        if (k11 == f59939f) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + k11.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        int i11 = b.f59944a[peek().ordinal()];
        if (i11 == 1) {
            j(true);
            return;
        }
        if (i11 == 2) {
            endArray();
            return;
        }
        if (i11 == 3) {
            endObject();
            return;
        }
        if (i11 != 4) {
            m();
            int i12 = this.f59941b;
            if (i12 > 0) {
                int[] iArr = this.f59943d;
                int i13 = i12 - 1;
                iArr[i13] = iArr[i13] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return a.class.getSimpleName() + locationString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
