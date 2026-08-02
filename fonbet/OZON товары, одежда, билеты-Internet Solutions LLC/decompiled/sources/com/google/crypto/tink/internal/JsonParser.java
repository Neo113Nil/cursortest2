package com.google.crypto.tink.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes9.dex */
public final class JsonParser {

    private static final class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
        private JsonElementTypeAdapter() {
        }

        private static JsonElement a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i11 = a.f59238a[jsonToken.ordinal()];
            if (i11 == 3) {
                String nextString = jsonReader.nextString();
                if (JsonParser.a(nextString)) {
                    return new JsonPrimitive(nextString);
                }
                throw new IOException("illegal characters in string");
            }
            if (i11 == 4) {
                return new JsonPrimitive(new b(jsonReader.nextString()));
            }
            if (i11 == 5) {
                return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i11 == 6) {
                jsonReader.nextNull();
                return com.google.gson.k.f60021a;
            }
            throw new IllegalStateException("Unexpected token: " + jsonToken);
        }

        private static JsonElement b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
            int i11 = a.f59238a[jsonToken.ordinal()];
            if (i11 == 1) {
                jsonReader.beginArray();
                return new JsonArray();
            }
            if (i11 != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new JsonObject();
        }

        @Override // com.google.gson.TypeAdapter
        public final JsonElement read(JsonReader jsonReader) throws IOException {
            String str;
            JsonToken peek = jsonReader.peek();
            JsonElement b11 = b(jsonReader, peek);
            if (b11 == null) {
                return a(jsonReader, peek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (b11 instanceof JsonObject) {
                        str = jsonReader.nextName();
                        if (!JsonParser.a(str)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    JsonToken peek2 = jsonReader.peek();
                    JsonElement b12 = b(jsonReader, peek2);
                    boolean z11 = b12 != null;
                    if (b12 == null) {
                        b12 = a(jsonReader, peek2);
                    }
                    if (b11 instanceof JsonArray) {
                        ((JsonArray) b11).add(b12);
                    } else {
                        JsonObject jsonObject = (JsonObject) b11;
                        if (jsonObject.has(str)) {
                            throw new IOException(Nk.a.b("duplicate key: ", str));
                        }
                        jsonObject.add(str, b12);
                    }
                    if (z11) {
                        arrayDeque.addLast(b11);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        b11 = b12;
                    } else {
                        continue;
                    }
                } else {
                    if (b11 instanceof JsonArray) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return b11;
                    }
                    b11 = (JsonElement) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
            throw new UnsupportedOperationException("write is not supported");
        }

        /* synthetic */ JsonElementTypeAdapter(int i11) {
            this();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59238a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59238a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59238a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59238a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59238a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59238a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59238a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static final class b extends Number {

        /* renamed from: a, reason: collision with root package name */
        private final String f59239a;

        public b(String str) {
            this.f59239a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() throws NotSerializableException {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public final double doubleValue() {
            return Double.parseDouble(this.f59239a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f59239a.equals(((b) obj).f59239a);
            }
            return false;
        }

        @Override // java.lang.Number
        public final float floatValue() {
            return Float.parseFloat(this.f59239a);
        }

        public final int hashCode() {
            return this.f59239a.hashCode();
        }

        @Override // java.lang.Number
        public final int intValue() {
            String str = this.f59239a;
            try {
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(str);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(str).intValue();
            }
        }

        @Override // java.lang.Number
        public final long longValue() {
            String str = this.f59239a;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).longValue();
            }
        }

        public final String toString() {
            return this.f59239a;
        }
    }

    static {
        new JsonElementTypeAdapter(0);
    }

    public static boolean a(String str) {
        int length = str.length();
        int i11 = 0;
        while (i11 != length) {
            char charAt = str.charAt(i11);
            int i12 = i11 + 1;
            if (!Character.isSurrogate(charAt)) {
                i11 = i12;
            } else {
                if (Character.isLowSurrogate(charAt) || i12 == length || !Character.isLowSurrogate(str.charAt(i12))) {
                    return false;
                }
                i11 += 2;
            }
        }
        return true;
    }
}
