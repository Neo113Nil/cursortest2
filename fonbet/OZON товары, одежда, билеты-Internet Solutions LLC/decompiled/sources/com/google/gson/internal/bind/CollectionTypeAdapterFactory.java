package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.internal.h;
import com.google.gson.internal.o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements t {

    /* renamed from: a, reason: collision with root package name */
    private final g f59832a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter<E> f59833a;

        /* renamed from: b, reason: collision with root package name */
        private final o<? extends Collection<E>> f59834b;

        Adapter(TypeAdapter<E> typeAdapter, o<? extends Collection<E>> oVar) {
            this.f59833a = typeAdapter;
            this.f59834b = oVar;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> f7 = this.f59834b.f();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                f7.add(this.f59833a.read(jsonReader));
            }
            jsonReader.endArray();
            return f7;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f59833a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(g gVar) {
        this.f59832a = gVar;
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type e11 = h.e(type, rawType);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(gson, gson.e(com.google.gson.reflect.a.get(e11)), e11), this.f59832a.b(aVar, false));
    }
}
