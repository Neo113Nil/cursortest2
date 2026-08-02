package io.intercom.android.sdk.utilities.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final Map<String, Class<?>> labelToIgnoreSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToIgnoreLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type", false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerIgnoredSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        this.labelToIgnoreSubtype.put(str, cls);
        this.subtypeToIgnoreLabel.put(cls, str);
        return this;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        final TypeAdapter<T> adapter = gson.getAdapter(JsonElement.class);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), delegateAdapter);
            linkedHashMap2.put(entry.getValue(), delegateAdapter);
        }
        for (Map.Entry<String, Class<?>> entry2 : this.labelToIgnoreSubtype.entrySet()) {
            TypeAdapter<T> delegateAdapter2 = gson.getDelegateAdapter(this, TypeToken.get((Class) entry2.getValue()));
            linkedHashMap3.put(entry2.getKey(), delegateAdapter2);
            linkedHashMap4.put(entry2.getValue(), delegateAdapter2);
        }
        return new TypeAdapter<R>() { // from class: io.intercom.android.sdk.utilities.gson.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public R read2(JsonReader jsonReader) throws IOException {
                JsonElement jsonElement = (JsonElement) adapter.read2(jsonReader);
                JsonElement remove = RuntimeTypeAdapterFactory.this.maintainType ? jsonElement.getAsJsonObject().get(RuntimeTypeAdapterFactory.this.typeFieldName) : jsonElement.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (remove == null) {
                    throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(remove.getAsString());
                if (typeAdapter == null) {
                    typeAdapter = (TypeAdapter) linkedHashMap3.get("UnSupported");
                }
                return (R) typeAdapter.fromJsonTree(jsonElement);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, R r) throws IOException {
                Class<?> cls = r.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter == null) {
                    throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                JsonObject asJsonObject = typeAdapter.toJsonTree(r).getAsJsonObject();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    adapter.write(jsonWriter, asJsonObject);
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (!asJsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    jsonObject.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive(str));
                    for (Map.Entry<String, JsonElement> entry3 : asJsonObject.entrySet()) {
                        jsonObject.add(entry3.getKey(), entry3.getValue());
                    }
                    adapter.write(jsonWriter, jsonObject);
                    return;
                }
                throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
        }.nullSafe();
    }
}
