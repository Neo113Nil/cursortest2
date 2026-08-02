package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.btj0;
import xsna.rtp0;
import xsna.w6q0;
import xsna.x2q;
import xsna.xtp0;

/* loaded from: classes.dex */
public final class Excluder implements rtp0, Cloneable {
    public static final Excluder h = new Excluder();
    public double b = -1.0d;
    public int c = Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
    public boolean d = true;
    public boolean e;
    public List<x2q> f;
    public List<x2q> g;

    public Excluder() {
        List<x2q> list = Collections.EMPTY_LIST;
        this.f = list;
        this.g = list;
    }

    public static boolean h(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    @Override // xsna.rtp0
    public final <T> TypeAdapter<T> a(final Gson gson, final xtp0<T> xtp0Var) {
        Class<? super T> rawType = xtp0Var.getRawType();
        boolean f = f(rawType);
        final boolean z = f || g(rawType, true);
        final boolean z2 = f || g(rawType, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                public TypeAdapter<T> a;

                @Override // com.google.gson.TypeAdapter
                public final T b(JsonReader jsonReader) throws IOException {
                    if (z2) {
                        jsonReader.skipValue();
                        return null;
                    }
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.getDelegateAdapter(Excluder.this, xtp0Var);
                        this.a = typeAdapter;
                    }
                    return typeAdapter.b(jsonReader);
                }

                @Override // com.google.gson.TypeAdapter
                public final void c(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                        return;
                    }
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.getDelegateAdapter(Excluder.this, xtp0Var);
                        this.a = typeAdapter;
                    }
                    typeAdapter.c(jsonWriter, t);
                }
            };
        }
        return null;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean f(Class<?> cls) {
        if (this.b != -1.0d) {
            btj0 btj0Var = (btj0) cls.getAnnotation(btj0.class);
            w6q0 w6q0Var = (w6q0) cls.getAnnotation(w6q0.class);
            if ((btj0Var != null && btj0Var.value() > this.b) || (w6q0Var != null && w6q0Var.value() <= this.b)) {
                return true;
            }
        }
        return (!this.d && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) || h(cls);
    }

    public final boolean g(Class<?> cls, boolean z) {
        Iterator<x2q> it = (z ? this.f : this.g).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Excluder i(x2q x2qVar, boolean z, boolean z2) {
        Excluder clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.f);
            clone.f = arrayList;
            arrayList.add(x2qVar);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.g);
            clone.g = arrayList2;
            arrayList2.add(x2qVar);
        }
        return clone;
    }
}
