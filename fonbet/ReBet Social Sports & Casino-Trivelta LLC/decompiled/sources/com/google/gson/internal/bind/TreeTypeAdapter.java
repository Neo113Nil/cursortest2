package com.google.gson.internal.bind;

import Jb.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.internal.l;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p f38166a;

    /* renamed from: b, reason: collision with root package name */
    public final g f38167b;

    /* renamed from: c, reason: collision with root package name */
    public final Gson f38168c;

    /* renamed from: d, reason: collision with root package name */
    public final TypeToken f38169d;

    /* renamed from: e, reason: collision with root package name */
    public final v f38170e;

    /* renamed from: f, reason: collision with root package name */
    public final b f38171f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f38172g;

    /* renamed from: h, reason: collision with root package name */
    public volatile TypeAdapter f38173h;

    public static final class SingleTypeFactory implements v {

        /* renamed from: a, reason: collision with root package name */
        public final TypeToken f38174a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f38175b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f38176c;

        /* renamed from: d, reason: collision with root package name */
        public final p f38177d;

        /* renamed from: e, reason: collision with root package name */
        public final g f38178e;

        public SingleTypeFactory(Object obj, TypeToken typeToken, boolean z10, Class cls) {
            p pVar = obj instanceof p ? (p) obj : null;
            this.f38177d = pVar;
            g gVar = obj instanceof g ? (g) obj : null;
            this.f38178e = gVar;
            com.google.gson.internal.a.a((pVar == null && gVar == null) ? false : true);
            this.f38174a = typeToken;
            this.f38175b = z10;
            this.f38176c = cls;
        }

        @Override // com.google.gson.v
        public TypeAdapter create(Gson gson, TypeToken typeToken) {
            TypeToken typeToken2 = this.f38174a;
            if (typeToken2 != null ? typeToken2.equals(typeToken) || (this.f38175b && this.f38174a.getType() == typeToken.getRawType()) : this.f38176c.isAssignableFrom(typeToken.getRawType())) {
                return new TreeTypeAdapter(this.f38177d, this.f38178e, gson, typeToken, this);
            }
            return null;
        }
    }

    public final class b implements o, f {
        public b() {
        }

        @Override // com.google.gson.f
        public Object a(h hVar, Type type) {
            return TreeTypeAdapter.this.f38168c.j(hVar, type);
        }

        @Override // com.google.gson.o
        public h serialize(Object obj) {
            return TreeTypeAdapter.this.f38168c.B(obj);
        }
    }

    public TreeTypeAdapter(p pVar, g gVar, Gson gson, TypeToken typeToken, v vVar, boolean z10) {
        this.f38171f = new b();
        this.f38166a = pVar;
        this.f38167b = gVar;
        this.f38168c = gson;
        this.f38169d = typeToken;
        this.f38170e = vVar;
        this.f38172g = z10;
    }

    private TypeAdapter b() {
        TypeAdapter typeAdapter = this.f38173h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter q10 = this.f38168c.q(this.f38170e, this.f38169d);
        this.f38173h = q10;
        return q10;
    }

    public static v c(TypeToken typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static v d(Class cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter a() {
        return this.f38166a != null ? this : b();
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(Jb.a aVar) {
        if (this.f38167b == null) {
            return b().read(aVar);
        }
        h a10 = l.a(aVar);
        if (this.f38172g && a10.j()) {
            return null;
        }
        return this.f38167b.deserialize(a10, this.f38169d.getType(), this.f38171f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(c cVar, Object obj) {
        p pVar = this.f38166a;
        if (pVar == null) {
            b().write(cVar, obj);
        } else if (this.f38172g && obj == null) {
            cVar.T1();
        } else {
            l.b(pVar.serialize(obj, this.f38169d.getType(), this.f38171f), cVar);
        }
    }

    public TreeTypeAdapter(p pVar, g gVar, Gson gson, TypeToken typeToken, v vVar) {
        this(pVar, gVar, gson, typeToken, vVar, true);
    }
}
