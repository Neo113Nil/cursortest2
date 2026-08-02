package com.google.gson.internal.bind;

import U7.m;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.internal.o;
import com.google.gson.n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements t {

    /* renamed from: a, reason: collision with root package name */
    private final g f59850a;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<K> f59851a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter<V> f59852b;

        /* renamed from: c, reason: collision with root package name */
        private final o<? extends Map<K, V>> f59853c;

        Adapter(TypeAdapter<K> typeAdapter, TypeAdapter<V> typeAdapter2, o<? extends Map<K, V>> oVar) {
            this.f59851a = typeAdapter;
            this.f59852b = typeAdapter2;
            this.f59853c = oVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> f7 = this.f59853c.f();
            if (peek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    j.INSTANCE.promoteNameToValue(jsonReader);
                    K read = this.f59851a.read(jsonReader);
                    if (f7.put(read, this.f59852b.read(jsonReader)) != null) {
                        throw new n(m.b(read, "duplicate key: "));
                    }
                }
                jsonReader.endObject();
                return f7;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                K read2 = this.f59851a.read(jsonReader);
                if (f7.put(read2, this.f59852b.read(jsonReader)) != null) {
                    throw new n(m.b(read2, "duplicate key: "));
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return f7;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            MapTypeAdapterFactory.this.getClass();
            TypeAdapter<V> typeAdapter = this.f59852b;
            jsonWriter.beginObject();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                jsonWriter.name(String.valueOf(entry.getKey()));
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(g gVar) {
        this.f59850a = gVar;
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] g10 = h.g(type, rawType);
        Type type2 = g10[0];
        Type type3 = g10[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f59901c : gson.e(com.google.gson.reflect.a.get(type2)), type2), new TypeAdapterRuntimeTypeWrapper(gson, gson.e(com.google.gson.reflect.a.get(type3)), type3), this.f59850a.b(aVar, false));
    }
}
