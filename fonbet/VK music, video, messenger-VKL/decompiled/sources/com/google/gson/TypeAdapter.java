package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends TypeAdapter<T> {
        public AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public final T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) TypeAdapter.this.b(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.c(jsonWriter, t);
            }
        }
    }

    public final TypeAdapter<T> a() {
        return new AnonymousClass1();
    }

    public abstract T b(JsonReader jsonReader) throws IOException;

    public abstract void c(JsonWriter jsonWriter, T t) throws IOException;
}
