package com.google.gson.internal.bind;

import B0.A0;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class c extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f59950d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Method f59951e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TypeAdapter f59952f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ TypeAdapter f59953g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ boolean f59954h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ boolean f59955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(String str, Field field, boolean z11, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z12, boolean z13) {
        super(str, field);
        this.f59950d = z11;
        this.f59951e = method;
        this.f59952f = typeAdapter;
        this.f59953g = typeAdapter2;
        this.f59954h = z12;
        this.f59955i = z13;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    final void a(JsonReader jsonReader, int i11, Object[] objArr) throws IOException, l {
        Object read = this.f59953g.read(jsonReader);
        if (read != null || !this.f59954h) {
            objArr[i11] = read;
            return;
        }
        throw new l("null is not allowed as value for record component '" + this.f59877c + "' of primitive type; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    final void b(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
        Object read = this.f59953g.read(jsonReader);
        if (read == null && this.f59954h) {
            return;
        }
        Field field = this.f59876b;
        if (this.f59950d) {
            ReflectiveTypeAdapterFactory.a(obj, field);
        } else if (this.f59955i) {
            throw new j(Nk.a.b("Cannot set value of 'static final' ", L8.a.d(field, false)));
        }
        field.set(obj, read);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    final void c(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
        Object obj2;
        Field field = this.f59876b;
        boolean z11 = this.f59950d;
        Method method = this.f59951e;
        if (z11) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.a(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.a(obj, method);
            }
        }
        if (method != null) {
            try {
                obj2 = method.invoke(obj, new Object[0]);
            } catch (InvocationTargetException e11) {
                throw new j(A0.b("Accessor ", L8.a.d(method, false), " threw exception"), e11.getCause());
            }
        } else {
            obj2 = field.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        jsonWriter.name(this.f59875a);
        this.f59952f.write(jsonWriter, obj2);
    }
}
