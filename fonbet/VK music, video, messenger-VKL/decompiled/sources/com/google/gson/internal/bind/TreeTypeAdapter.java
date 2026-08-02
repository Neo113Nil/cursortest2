package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import xsna.a9y;
import xsna.b9y;
import xsna.h5i0;
import xsna.kpm0;
import xsna.rtp0;
import xsna.tay;
import xsna.u9y;
import xsna.uay;
import xsna.xtp0;
import xsna.z8y;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    public final uay<T> a;
    public final a9y<T> b;
    public final Gson c;
    public final xtp0<T> d;
    public final rtp0 e;
    public final TreeTypeAdapter<T>.a f = new a();
    public volatile TypeAdapter<T> g;

    public static final class SingleTypeFactory implements rtp0 {
        public final xtp0<?> b;
        public final boolean c;
        public final Class<?> d;
        public final uay<?> e;
        public final a9y<?> f;

        public SingleTypeFactory(Object obj, xtp0<?> xtp0Var, boolean z, Class<?> cls) {
            uay<?> uayVar = obj instanceof uay ? (uay) obj : null;
            this.e = uayVar;
            a9y<?> a9yVar = obj instanceof a9y ? (a9y) obj : null;
            this.f = a9yVar;
            h5i0.a((uayVar == null && a9yVar == null) ? false : true);
            this.b = xtp0Var;
            this.c = z;
            this.d = cls;
        }

        @Override // xsna.rtp0
        public final <T> TypeAdapter<T> a(Gson gson, xtp0<T> xtp0Var) {
            xtp0<?> xtp0Var2 = this.b;
            if (xtp0Var2 != null ? xtp0Var2.equals(xtp0Var) || (this.c && xtp0Var2.getType() == xtp0Var.getRawType()) : this.d.isAssignableFrom(xtp0Var.getRawType())) {
                return new TreeTypeAdapter(this.e, this.f, gson, xtp0Var, this);
            }
            return null;
        }
    }

    public final class a implements tay, z8y {
        public a() {
        }

        public final <R> R a(b9y b9yVar, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.c.fromJson(b9yVar, type);
        }

        public final b9y b(Object obj) {
            return TreeTypeAdapter.this.c.toJsonTree(obj);
        }
    }

    public TreeTypeAdapter(uay<T> uayVar, a9y<T> a9yVar, Gson gson, xtp0<T> xtp0Var, rtp0 rtp0Var) {
        this.a = uayVar;
        this.b = a9yVar;
        this.c = gson;
        this.d = xtp0Var;
        this.e = rtp0Var;
    }

    public static rtp0 d(xtp0<?> xtp0Var, Object obj) {
        return new SingleTypeFactory(obj, xtp0Var, xtp0Var.getType() == xtp0Var.getRawType(), null);
    }

    public static rtp0 e(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.TypeAdapter
    public final T b(JsonReader jsonReader) throws IOException {
        a9y<T> a9yVar = this.b;
        if (a9yVar == null) {
            TypeAdapter<T> typeAdapter = this.g;
            if (typeAdapter == null) {
                typeAdapter = this.c.getDelegateAdapter(this.e, this.d);
                this.g = typeAdapter;
            }
            return typeAdapter.b(jsonReader);
        }
        b9y a2 = kpm0.a(jsonReader);
        a2.getClass();
        if (a2 instanceof u9y) {
            return null;
        }
        this.d.getType();
        return (T) a9yVar.a(a2, this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, T t) throws IOException {
        uay<T> uayVar = this.a;
        if (uayVar == null) {
            TypeAdapter<T> typeAdapter = this.g;
            if (typeAdapter == null) {
                typeAdapter = this.c.getDelegateAdapter(this.e, this.d);
                this.g = typeAdapter;
            }
            typeAdapter.c(jsonWriter, t);
            return;
        }
        if (t == null) {
            jsonWriter.nullValue();
            return;
        }
        this.d.getType();
        TypeAdapters.B.c(jsonWriter, uayVar.b(t, this.f));
    }
}
