package com.roxiemobile.androidcommons.data.mapper.adapter;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;

/* loaded from: classes9.dex */
public class PostValidatableObjectTypeAdapterFactory implements t {
    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(Gson gson, a<T> aVar) {
        final TypeAdapter<T> g10 = gson.g(this, aVar);
        return new TypeAdapter<T>() { // from class: com.roxiemobile.androidcommons.data.mapper.adapter.PostValidatableObjectTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public final T read(JsonReader jsonReader) throws IOException {
                T t2 = (T) TypeAdapter.this.read(jsonReader);
                if (t2 instanceof U9.a) {
                    U9.a aVar2 = (U9.a) t2;
                    if (aVar2.a()) {
                        aVar2.validate();
                    }
                }
                return t2;
            }

            @Override // com.google.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, T t2) throws IOException {
                TypeAdapter.this.write(jsonWriter, t2);
            }
        };
    }
}
