package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.r;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    private final m<T> f59881a;

    /* renamed from: b, reason: collision with root package name */
    private final i<T> f59882b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f59883c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f59884d;

    /* renamed from: e, reason: collision with root package name */
    private final t f59885e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.a f59886f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f59887g;

    /* renamed from: h, reason: collision with root package name */
    private volatile TypeAdapter<T> f59888h;

    private static final class SingleTypeFactory implements t {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f59889a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f59890b;

        /* renamed from: c, reason: collision with root package name */
        private final m<?> f59891c;

        /* renamed from: d, reason: collision with root package name */
        private final i<?> f59892d;

        SingleTypeFactory(Object obj, com.google.gson.reflect.a aVar, boolean z11) {
            m<?> mVar = obj instanceof m ? (m) obj : null;
            this.f59891c = mVar;
            i<?> iVar = obj instanceof i ? (i) obj : null;
            this.f59892d = iVar;
            if (mVar != null || iVar != null) {
                this.f59889a = aVar;
                this.f59890b = z11;
            } else {
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // com.google.gson.t
        public final <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            com.google.gson.reflect.a<?> aVar2 = this.f59889a;
            if (aVar2 == null) {
                aVar.getRawType();
                throw null;
            }
            if (aVar2.equals(aVar) || (this.f59890b && aVar2.getType() == aVar.getRawType())) {
                return new TreeTypeAdapter(this.f59891c, this.f59892d, gson, aVar, this, true);
            }
            return null;
        }
    }

    private final class a implements h {
        a() {
        }

        @Override // com.google.gson.h
        public final <R> R a(JsonElement jsonElement, Type type) throws l {
            Gson gson = TreeTypeAdapter.this.f59883c;
            gson.getClass();
            com.google.gson.reflect.a<?> aVar = com.google.gson.reflect.a.get(type);
            if (jsonElement == null) {
                return null;
            }
            return (R) gson.b(new com.google.gson.internal.bind.a(jsonElement), aVar);
        }
    }

    public TreeTypeAdapter() {
        throw null;
    }

    public TreeTypeAdapter(m<T> mVar, i<T> iVar, Gson gson, com.google.gson.reflect.a<T> aVar, t tVar, boolean z11) {
        this.f59886f = new a();
        this.f59881a = mVar;
        this.f59882b = iVar;
        this.f59883c = gson;
        this.f59884d = aVar;
        this.f59885e = tVar;
        this.f59887g = z11;
    }

    public static t b(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.getType() == aVar.getRawType());
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final TypeAdapter<T> a() {
        if (this.f59881a != null) {
            return this;
        }
        TypeAdapter<T> typeAdapter = this.f59888h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> g10 = this.f59883c.g(this.f59885e, this.f59884d);
        this.f59888h = g10;
        return g10;
    }

    @Override // com.google.gson.TypeAdapter
    public final T read(JsonReader jsonReader) throws IOException {
        i<T> iVar = this.f59882b;
        if (iVar == null) {
            TypeAdapter<T> typeAdapter = this.f59888h;
            if (typeAdapter == null) {
                typeAdapter = this.f59883c.g(this.f59885e, this.f59884d);
                this.f59888h = typeAdapter;
            }
            return typeAdapter.read(jsonReader);
        }
        JsonElement a11 = r.a(jsonReader);
        if (this.f59887g && a11.isJsonNull()) {
            return null;
        }
        return iVar.deserialize(a11, this.f59884d.getType(), this.f59886f);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, T t2) throws IOException {
        m<T> mVar = this.f59881a;
        if (mVar == null) {
            TypeAdapter<T> typeAdapter = this.f59888h;
            if (typeAdapter == null) {
                typeAdapter = this.f59883c.g(this.f59885e, this.f59884d);
                this.f59888h = typeAdapter;
            }
            typeAdapter.write(jsonWriter, t2);
            return;
        }
        if (this.f59887g && t2 == null) {
            jsonWriter.nullValue();
        } else {
            this.f59884d.getType();
            r.b(mVar.a(t2), jsonWriter);
        }
    }
}
