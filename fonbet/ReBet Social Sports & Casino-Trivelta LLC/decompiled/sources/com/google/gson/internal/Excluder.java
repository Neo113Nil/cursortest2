package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.v;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Excluder implements v, Cloneable {

    /* renamed from: g, reason: collision with root package name */
    public static final Excluder f38098g = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    public double f38099a = -1.0d;

    /* renamed from: b, reason: collision with root package name */
    public int f38100b = 136;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38101c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38102d;

    /* renamed from: e, reason: collision with root package name */
    public List f38103e;

    /* renamed from: f, reason: collision with root package name */
    public List f38104f;

    public Excluder() {
        List list = Collections.EMPTY_LIST;
        this.f38103e = list;
        this.f38104f = list;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean b(Class cls, boolean z10) {
        return c(cls) || d(cls, z10);
    }

    public final boolean c(Class cls) {
        if (this.f38099a != -1.0d && !k((Gb.d) cls.getAnnotation(Gb.d.class), (Gb.e) cls.getAnnotation(Gb.e.class))) {
            return true;
        }
        if (this.f38101c || !g(cls)) {
            return f(cls);
        }
        return true;
    }

    @Override // com.google.gson.v
    public TypeAdapter create(final Gson gson, final TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean c10 = c(rawType);
        final boolean z10 = c10 || d(rawType, true);
        final boolean z11 = c10 || d(rawType, false);
        if (z10 || z11) {
            return new TypeAdapter() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public TypeAdapter f38105a;

                public final TypeAdapter a() {
                    TypeAdapter typeAdapter = this.f38105a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter q10 = gson.q(Excluder.this, typeToken);
                    this.f38105a = q10;
                    return q10;
                }

                @Override // com.google.gson.TypeAdapter
                public Object read(Jb.a aVar) {
                    if (!z11) {
                        return a().read(aVar);
                    }
                    aVar.C();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(Jb.c cVar, Object obj) {
                    if (z10) {
                        cVar.T1();
                    } else {
                        a().write(cVar, obj);
                    }
                }
            };
        }
        return null;
    }

    public final boolean d(Class cls, boolean z10) {
        Iterator it = (z10 ? this.f38103e : this.f38104f).iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public boolean e(Field field, boolean z10) {
        Gb.a aVar;
        if ((this.f38100b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f38099a != -1.0d && !k((Gb.d) field.getAnnotation(Gb.d.class), (Gb.e) field.getAnnotation(Gb.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f38102d && ((aVar = (Gb.a) field.getAnnotation(Gb.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f38101c && g(field.getType())) || f(field.getType())) {
            return true;
        }
        List list = z10 ? this.f38103e : this.f38104f;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public final boolean f(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || h(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final boolean g(Class cls) {
        return cls.isMemberClass() && !h(cls);
    }

    public final boolean h(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean i(Gb.d dVar) {
        if (dVar != null) {
            return this.f38099a >= dVar.value();
        }
        return true;
    }

    public final boolean j(Gb.e eVar) {
        if (eVar != null) {
            return this.f38099a < eVar.value();
        }
        return true;
    }

    public final boolean k(Gb.d dVar, Gb.e eVar) {
        return i(dVar) && j(eVar);
    }

    public Excluder l(int... iArr) {
        Excluder clone = clone();
        clone.f38100b = 0;
        for (int i10 : iArr) {
            clone.f38100b = i10 | clone.f38100b;
        }
        return clone;
    }
}
