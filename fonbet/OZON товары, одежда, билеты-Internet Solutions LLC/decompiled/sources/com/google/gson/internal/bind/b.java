package com.google.gson.internal.bind;

import C.o0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.k;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class b extends JsonWriter {

    /* renamed from: d, reason: collision with root package name */
    private static final Writer f59945d = new a();

    /* renamed from: e, reason: collision with root package name */
    private static final JsonPrimitive f59946e = new JsonPrimitive("closed");

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f59947a;

    /* renamed from: b, reason: collision with root package name */
    private String f59948b;

    /* renamed from: c, reason: collision with root package name */
    private JsonElement f59949c;

    final class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i11, int i12) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f59945d);
        this.f59947a = new ArrayList();
        this.f59949c = k.f60021a;
    }

    private JsonElement d() {
        return (JsonElement) o0.b(1, this.f59947a);
    }

    private void j(JsonElement jsonElement) {
        if (this.f59948b != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) d()).add(this.f59948b, jsonElement);
            }
            this.f59948b = null;
            return;
        }
        if (this.f59947a.isEmpty()) {
            this.f59949c = jsonElement;
            return;
        }
        JsonElement d11 = d();
        if (!(d11 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) d11).add(jsonElement);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        JsonArray jsonArray = new JsonArray();
        j(jsonArray);
        this.f59947a.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        JsonObject jsonObject = new JsonObject();
        j(jsonObject);
        this.f59947a.add(jsonObject);
        return this;
    }

    public final JsonElement c() {
        ArrayList arrayList = this.f59947a;
        if (arrayList.isEmpty()) {
            return this.f59949c;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f59947a;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f59946e);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.f59947a;
        if (arrayList.isEmpty() || this.f59948b != null) {
            throw new IllegalStateException();
        }
        if (!(d() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        Ej.b.b(1, arrayList);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        ArrayList arrayList = this.f59947a;
        if (arrayList.isEmpty() || this.f59948b != null) {
            throw new IllegalStateException();
        }
        if (!(d() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        Ej.b.b(1, arrayList);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter jsonValue(String str) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f59947a.isEmpty() || this.f59948b != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(d() instanceof JsonObject)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f59948b = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        j(k.f60021a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z11) throws IOException {
        j(new JsonPrimitive(Boolean.valueOf(z11)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f7) throws IOException {
        if (isLenient() || !(Float.isNaN(f7) || Float.isInfinite(f7))) {
            j(new JsonPrimitive(Float.valueOf(f7)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f7);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d11) throws IOException {
        if (!isLenient() && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d11);
        }
        j(new JsonPrimitive(Double.valueOf(d11)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j11) throws IOException {
        j(new JsonPrimitive(Long.valueOf(j11)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            j(k.f60021a);
            return this;
        }
        j(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            j(k.f60021a);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        j(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            j(k.f60021a);
            return this;
        }
        j(new JsonPrimitive(str));
        return this;
    }
}
