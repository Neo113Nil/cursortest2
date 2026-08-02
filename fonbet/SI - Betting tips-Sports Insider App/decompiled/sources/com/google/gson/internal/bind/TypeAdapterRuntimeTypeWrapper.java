package com.google.gson.internal.bind;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends x {

    /* renamed from: a, reason: collision with root package name */
    public final j f6263a;

    /* renamed from: b, reason: collision with root package name */
    public final x f6264b;

    /* renamed from: c, reason: collision with root package name */
    public final Type f6265c;

    public TypeAdapterRuntimeTypeWrapper(j jVar, x xVar, Type type) {
        this.f6263a = jVar;
        this.f6264b = xVar;
        this.f6265c = type;
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        return this.f6264b.b(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(r9.b bVar, Object obj) {
        x d10;
        ?? r02 = this.f6265c;
        Class<?> cls = (obj == null || !((r02 instanceof Class) || (r02 instanceof TypeVariable))) ? r02 : obj.getClass();
        x xVar = this.f6264b;
        if (cls != r02) {
            x c2 = this.f6263a.c(TypeToken.get((Type) cls));
            if (c2 instanceof ReflectiveTypeAdapterFactory.Adapter) {
                x xVar2 = xVar;
                while ((xVar2 instanceof SerializationDelegatingTypeAdapter) && (d10 = ((SerializationDelegatingTypeAdapter) xVar2).d()) != xVar2) {
                    xVar2 = d10;
                }
            }
            xVar = c2;
        }
        xVar.c(bVar, obj);
    }
}
