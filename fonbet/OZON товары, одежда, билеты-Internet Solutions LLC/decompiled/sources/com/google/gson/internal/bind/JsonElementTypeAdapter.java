package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.k;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {

    /* renamed from: a, reason: collision with root package name */
    static final JsonElementTypeAdapter f59848a = new JsonElementTypeAdapter();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59849a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f59849a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59849a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59849a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59849a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59849a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59849a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JsonElementTypeAdapter() {
    }

    private static JsonElement a(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i11 = a.f59849a[jsonToken.ordinal()];
        if (i11 == 3) {
            return new JsonPrimitive(jsonReader.nextString());
        }
        if (i11 == 4) {
            return new JsonPrimitive(new k(jsonReader.nextString()));
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
        int i11 = a.f59849a[jsonToken.ordinal()];
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
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            jsonWriter.nullValue();
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                jsonWriter.value(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                jsonWriter.value(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                jsonWriter.value(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement.isJsonArray()) {
            jsonWriter.beginArray();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(it.next(), jsonWriter);
            }
            jsonWriter.endArray();
            return;
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            jsonWriter.name(entry.getKey());
            write(entry.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    @Override // com.google.gson.TypeAdapter
    public final JsonElement read(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof com.google.gson.internal.bind.a) {
            return ((com.google.gson.internal.bind.a) jsonReader).d();
        }
        JsonToken peek = jsonReader.peek();
        JsonElement b11 = b(jsonReader, peek);
        if (b11 == null) {
            return a(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = b11 instanceof JsonObject ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                JsonElement b12 = b(jsonReader, peek2);
                boolean z11 = b12 != null;
                if (b12 == null) {
                    b12 = a(jsonReader, peek2);
                }
                if (b11 instanceof JsonArray) {
                    ((JsonArray) b11).add(b12);
                } else {
                    ((JsonObject) b11).add(nextName, b12);
                }
                if (z11) {
                    arrayDeque.addLast(b11);
                    b11 = b12;
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
}
