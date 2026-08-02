package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import xsna.h5i0;
import xsna.jp70;
import xsna.rtp0;
import xsna.u6j;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements rtp0 {
    public final u6j b;

    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        public final TypeAdapter<E> a;
        public final jp70<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, jp70<? extends Collection<E>> jp70Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = jp70Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> h = this.b.h();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                h.add(((TypeAdapterRuntimeTypeWrapper) this.a).b.b(jsonReader));
            }
            jsonReader.endArray();
            return h;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.c(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(u6j u6jVar) {
        this.b = u6jVar;
    }

    @Override // xsna.rtp0
    public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
        Type type = xtp0Var.getType();
        Class<? super T> rawType = xtp0Var.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        h5i0.a(Collection.class.isAssignableFrom(rawType));
        Type g = xsna.a.g(type, rawType, xsna.a.e(type, rawType, Collection.class), new HashMap());
        Class cls = g instanceof ParameterizedType ? ((ParameterizedType) g).getActualTypeArguments()[0] : Object.class;
        return new Adapter(gson, cls, gson.getAdapter(xtp0.get(cls)), this.b.a(xtp0Var));
    }
}
