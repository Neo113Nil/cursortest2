package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import xsna.xtp0;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class a extends ReflectiveTypeAdapterFactory.a {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Field e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ TypeAdapter g;
    public final /* synthetic */ Gson h;
    public final /* synthetic */ xtp0 i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, boolean z, boolean z2, boolean z3, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, xtp0 xtp0Var, boolean z5) {
        super(str, z, z2);
        this.d = z3;
        this.e = field;
        this.f = z4;
        this.g = typeAdapter;
        this.h = gson;
        this.i = xtp0Var;
        this.j = z5;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void a(Object obj, JsonReader jsonReader) throws IOException, IllegalAccessException {
        Object b = this.g.b(jsonReader);
        if (b == null && this.j) {
            return;
        }
        boolean z = this.d;
        Field field = this.e;
        if (z) {
            ReflectiveTypeAdapterFactory.b(obj, field);
        }
        field.set(obj, b);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public final void b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
        if (this.b) {
            boolean z = this.d;
            Field field = this.e;
            if (z) {
                ReflectiveTypeAdapterFactory.b(obj, field);
            }
            Object obj2 = field.get(obj);
            if (obj2 == obj) {
                return;
            }
            jsonWriter.name(this.a);
            boolean z2 = this.f;
            TypeAdapter typeAdapter = this.g;
            if (!z2) {
                typeAdapter = new TypeAdapterRuntimeTypeWrapper(this.h, typeAdapter, this.i.getType());
            }
            typeAdapter.c(jsonWriter, obj2);
        }
    }
}
