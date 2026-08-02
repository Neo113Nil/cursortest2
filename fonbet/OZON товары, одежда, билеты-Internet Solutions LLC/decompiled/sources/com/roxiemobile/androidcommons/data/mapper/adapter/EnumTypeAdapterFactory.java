package com.roxiemobile.androidcommons.data.mapper.adapter;

import J8.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes9.dex */
public class EnumTypeAdapterFactory implements t {

    public static final class CustomEnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f60340a;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f60341b;

        /* renamed from: c, reason: collision with root package name */
        private final T f60342c;

        private CustomEnumTypeAdapter() {
            throw null;
        }

        CustomEnumTypeAdapter(Class cls) {
            this.f60340a = new HashMap();
            this.f60341b = new HashMap();
            try {
                for (Enum r42 : (Enum[]) cls.getEnumConstants()) {
                    String name = r42.name();
                    b bVar = (b) cls.getField(name).getAnnotation(b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.f60340a.put(str, r42);
                        }
                    }
                    this.f60340a.put(name, r42);
                    this.f60341b.put(r42, name);
                }
                this.f60342c = (T) this.f60340a.get("urn:roxiemobile:shared:state.UNDEFINED");
            } catch (NoSuchFieldException e11) {
                throw new IllegalStateException("Missing field in ".concat(cls.getName()), e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                Enum r32 = (Enum) this.f60340a.get(jsonReader.nextString());
                return r32 == null ? this.f60342c : r32;
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Enum r32 = (Enum) obj;
            jsonWriter.value(r32 != null ? (String) this.f60341b.get(r32) : null);
        }
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
            return null;
        }
        if (!rawType.isEnum()) {
            rawType = rawType.getSuperclass();
        }
        return new CustomEnumTypeAdapter(rawType);
    }
}
