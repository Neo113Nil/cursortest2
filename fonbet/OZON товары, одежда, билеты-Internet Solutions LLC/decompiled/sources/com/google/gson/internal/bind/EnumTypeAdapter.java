package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* renamed from: d, reason: collision with root package name */
    static final t f59840d = new t() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f59841a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f59842b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f59843c;

    private EnumTypeAdapter() {
        throw null;
    }

    EnumTypeAdapter(Class cls) {
        this.f59841a = new HashMap();
        this.f59842b = new HashMap();
        this.f59843c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i11 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i11] = field;
                    i11++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i11);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String name = r42.name();
                String str = r42.toString();
                J8.b bVar = (J8.b) field2.getAnnotation(J8.b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String str2 : bVar.alternate()) {
                        this.f59841a.put(str2, r42);
                    }
                }
                this.f59841a.put(name, r42);
                this.f59842b.put(str, r42);
                this.f59843c.put(r42, name);
            }
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        Enum r02 = (Enum) this.f59841a.get(nextString);
        return r02 == null ? (Enum) this.f59842b.get(nextString) : r02;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        jsonWriter.value(r32 == null ? null : (String) this.f59843c.get(r32));
    }
}
