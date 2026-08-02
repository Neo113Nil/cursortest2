package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Excluder implements com.google.gson.t, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final Excluder f59818c = new Excluder();

    /* renamed from: a, reason: collision with root package name */
    private List<com.google.gson.a> f59819a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.google.gson.a> f59820b;

    public Excluder() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f59819a = list;
        this.f59820b = list;
    }

    public final boolean a(boolean z11, Class cls) {
        if (!z11 && !Enum.class.isAssignableFrom(cls)) {
            int i11 = L8.a.f16593b;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator<com.google.gson.a> it = (z11 ? this.f59819a : this.f59820b).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Field field, boolean z11) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || a(z11, field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z11 ? this.f59819a : this.f59820b;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.b(field);
        Iterator<com.google.gson.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b()) {
                return true;
            }
        }
        return false;
    }

    protected final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // com.google.gson.t
    public final <T> TypeAdapter<T> create(final Gson gson, final com.google.gson.reflect.a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        final boolean a11 = a(true, rawType);
        final boolean a12 = a(false, rawType);
        if (a11 || a12) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                private volatile TypeAdapter<T> f59821a;

                @Override // com.google.gson.TypeAdapter
                public final T read(JsonReader jsonReader) throws IOException {
                    if (a12) {
                        jsonReader.skipValue();
                        return null;
                    }
                    TypeAdapter<T> typeAdapter = this.f59821a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.g(Excluder.this, aVar);
                        this.f59821a = typeAdapter;
                    }
                    return typeAdapter.read(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public final void write(JsonWriter jsonWriter, T t2) throws IOException {
                    if (a11) {
                        jsonWriter.nullValue();
                        return;
                    }
                    TypeAdapter<T> typeAdapter = this.f59821a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.g(Excluder.this, aVar);
                        this.f59821a = typeAdapter;
                    }
                    typeAdapter.write(jsonWriter, t2);
                }
            };
        }
        return null;
    }
}
