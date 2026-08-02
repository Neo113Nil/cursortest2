package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import xsna.b9y;
import xsna.cqi;
import xsna.h5i0;
import xsna.hay;
import xsna.jp70;
import xsna.kby;
import xsna.l8y;
import xsna.may;
import xsna.rtp0;
import xsna.u6j;
import xsna.u9y;
import xsna.x9y;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements rtp0 {
    public final u6j b;
    public final boolean c;

    /* loaded from: classes13.dex */
    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        public final TypeAdapter<K> a;
        public final TypeAdapter<V> b;
        public final jp70<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, jp70<? extends Map<K, V>> jp70Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.c = jp70Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> h = this.c.h();
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            TypeAdapter<V> typeAdapter = this.b;
            TypeAdapter<K> typeAdapter2 = this.a;
            if (peek != jsonToken) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    may.INSTANCE.promoteNameToValue(jsonReader);
                    Object b = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).b.b(jsonReader);
                    if (h.put(b, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException(cqi.c(b, "duplicate key: "));
                    }
                }
                jsonReader.endObject();
                return h;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                Object b2 = ((TypeAdapterRuntimeTypeWrapper) typeAdapter2).b.b(jsonReader);
                if (h.put(b2, ((TypeAdapterRuntimeTypeWrapper) typeAdapter).b.b(jsonReader)) != null) {
                    throw new JsonSyntaxException(cqi.c(b2, "duplicate key: "));
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return h;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            boolean z = MapTypeAdapterFactory.this.c;
            TypeAdapter<V> typeAdapter = this.b;
            if (!z) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    typeAdapter.c(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z2 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                K key = entry2.getKey();
                TypeAdapter<K> typeAdapter2 = this.a;
                typeAdapter2.getClass();
                try {
                    kby kbyVar = new kby();
                    typeAdapter2.c(kbyVar, key);
                    b9y m = kbyVar.m();
                    arrayList.add(m);
                    arrayList2.add(entry2.getValue());
                    m.getClass();
                    z2 |= (m instanceof l8y) || (m instanceof x9y);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            }
            if (z2) {
                jsonWriter.beginArray();
                int size = arrayList.size();
                while (i < size) {
                    jsonWriter.beginArray();
                    TypeAdapters.B.c(jsonWriter, (b9y) arrayList.get(i));
                    typeAdapter.c(jsonWriter, arrayList2.get(i));
                    jsonWriter.endArray();
                    i++;
                }
                jsonWriter.endArray();
                return;
            }
            jsonWriter.beginObject();
            int size2 = arrayList.size();
            while (i < size2) {
                b9y b9yVar = (b9y) arrayList.get(i);
                b9yVar.getClass();
                if (b9yVar instanceof hay) {
                    hay i2 = b9yVar.i();
                    Serializable serializable = i2.b;
                    if (serializable instanceof Number) {
                        str = String.valueOf(i2.l());
                    } else if (serializable instanceof Boolean) {
                        str = Boolean.toString(i2.d());
                    } else {
                        if (!(serializable instanceof String)) {
                            throw new AssertionError();
                        }
                        str = i2.k();
                    }
                } else {
                    if (!(b9yVar instanceof u9y)) {
                        throw new AssertionError();
                    }
                    str = "null";
                }
                jsonWriter.name(str);
                typeAdapter.c(jsonWriter, arrayList2.get(i));
                i++;
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(u6j u6jVar, boolean z) {
        this.b = u6jVar;
        this.c = z;
    }

    @Override // xsna.rtp0
    public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
        Type[] actualTypeArguments;
        Type type = xtp0Var.getType();
        Class<? super T> rawType = xtp0Var.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            h5i0.a(Map.class.isAssignableFrom(rawType));
            Type g = xsna.a.g(type, rawType, xsna.a.e(type, rawType, Map.class), new HashMap());
            actualTypeArguments = g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        Type[] typeArr = actualTypeArguments;
        return new Adapter(gson, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.c : gson.getAdapter(xtp0.get(type2)), typeArr[1], gson.getAdapter(xtp0.get(actualTypeArguments[1])), this.b.a(xtp0Var));
    }
}
